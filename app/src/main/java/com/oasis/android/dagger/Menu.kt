package com.oasis.android.dagger

import javax.inject.Inject

/**
 * @author Oasis Yao
 *Created on 2018/10/22.
 */
class Menu @Inject constructor(menus:Map<String,Boolean>){

    private val myMenu:Map<String,Boolean> = menus

    fun getMenus():Map<String,Boolean>{
        return myMenu
    }

}