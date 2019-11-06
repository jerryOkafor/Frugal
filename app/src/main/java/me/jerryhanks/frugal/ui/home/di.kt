package me.jerryhanks.frugal.ui.home

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap
import me.jerryhanks.frugal.di.FragmentScope
import me.jerryhanks.frugal.di.ViewModelKey


/**
 * @author jerry on 05/11/2019
 * for Frugal
 **/

@Module
abstract class HomeModule {

    @ContributesAndroidInjector
    @FragmentScope
    abstract fun contributeHomeFragments(): HomeFragment

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun provideHomeViewModel(homeViewModel: HomeViewModel): ViewModel
}