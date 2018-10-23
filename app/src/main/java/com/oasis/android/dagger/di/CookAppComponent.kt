package com.oasis.android.dagger.di

import com.oasis.android.dagger.OasisApplication
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * @author Oasis Yao
 *Created on 2018/10/22.
 */


@Singleton
@Component(modules = arrayOf(
        AndroidSupportInjectionModule::class,
        ActivityModules::class,
        CookModules::class))
interface CookAppComponent : AndroidInjector<OasisApplication> {

    @Component.Builder
    abstract class Builder:AndroidInjector.Builder<OasisApplication>()
}