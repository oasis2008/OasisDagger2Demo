package com.oasis.android.dagger.di

import dagger.Module
import dagger.Provides
import java.util.*
import javax.inject.Singleton

/**
 * @author Oasis Yao
 *Created on 2018/10/22.
 */

@Module
class CookModules {

    @Singleton
    @Provides
    fun providerMenus():Map<String,Boolean>{

        var menus = LinkedHashMap<String,Boolean>()
        menus.put("酸菜鱼",true)
        menus.put("盐水鸭",true)
        menus.put("水煮肉片",true)
        return menus;
    }

}