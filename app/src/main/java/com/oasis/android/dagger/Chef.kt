package com.oasis.android.dagger

import javax.inject.Inject

/**
 * @author Oasis Yao
 *Created on 2018/10/22.
 */
class Chef @Inject constructor(menu: Menu):Cooking {

    val menuList:Menu= menu

    override fun cook(): String {
        val str = StringBuilder()
        menuList.getMenus().forEach { (t, u) ->
           if(u){
               str.append(t).append(",")
           }
        }
        return str.toString()
    }

}