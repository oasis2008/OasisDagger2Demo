package com.oasis.android.dagger

import android.util.Log
import com.dianping.logan.Logan
import com.dianping.logan.LoganConfig
import com.oasis.android.dagger.di.DaggerCookAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import java.io.File

/**
 * @author Oasis Yao
 *Created on 2018/10/22.
 */
class OasisApplication :DaggerApplication(){

    override fun onCreate() {
        super.onCreate()

        val loganConfig = LoganConfig.Builder()
                .setCachePath(applicationContext.filesDir.absolutePath)
                .setPath(applicationContext.getExternalFilesDir(null)
                        .absolutePath + File.separator + "logan_v1")
                .setEncryptKey16("012345678".toByteArray())
                .setEncryptIV16("012345678".toByteArray())
                .build()

        if(BuildConfig.DEBUG){
            Logan.setDebug(true)
        }

        Logan.init(loganConfig)


        Logan.w("application oncreate is running",1)
        Logan.f()
        var filesInfo = Logan.getAllFilesInfo()

        filesInfo.forEach { (t, u) ->
            Log.d("yxc",t)
        }



    }

    override fun applicationInjector(): AndroidInjector<OasisApplication> {
        return DaggerCookAppComponent.builder().create(this)
    }

}