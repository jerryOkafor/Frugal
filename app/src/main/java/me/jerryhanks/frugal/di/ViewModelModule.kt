package me.jerryhanks.frugal.di

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import me.jerryhanks.frugal.InjectableViewModelFactory


/**
 * @author jerry on 05/11/2019
 * for Frugal
 **/
@Module
abstract class ViewModelModule {
    /**
     *Provide custom viewModel provider factory
     */
    @Binds
    abstract fun provideViewModelFactory(factory: InjectableViewModelFactory): ViewModelProvider.Factory
}