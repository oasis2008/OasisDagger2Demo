package com.oasis.android.dagger.di

import com.oasis.android.dagger.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * @author Oasis Yao
 *Created on 2018/10/22.
 */

@Module
abstract class ActivityModules {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}