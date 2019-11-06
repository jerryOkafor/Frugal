package me.jerryhanks.frugal.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import me.jerryhanks.frugal.MainActivity
import me.jerryhanks.frugal.ui.home.HomeFragment
import me.jerryhanks.frugal.ui.home.HomeModule


/**
 * @author jerry on 04/11/2019
 * for Frugal
 **/

@Module
abstract class BuilderModule {
    @ContributesAndroidInjector
    @ActivityScope
    internal abstract fun provideMainActivity():MainActivity
}