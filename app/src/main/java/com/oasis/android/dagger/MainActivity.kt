package com.oasis.android.dagger

import android.os.Bundle
import android.util.Log
import dagger.android.DaggerActivity
import javax.inject.Inject

class MainActivity : DaggerActivity() {

    var chef:Chef? = null
        @Inject set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("zzz",chef?.cook())
    }
}
