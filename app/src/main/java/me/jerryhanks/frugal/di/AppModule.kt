package me.jerryhanks.frugal.di

import dagger.Module
import dagger.Provides
import me.jerryhanks.frugal.FrugalApp
import me.jerryhanks.frugal.data.PinchMeDataSource
import me.jerryhanks.frugal.data.PinchMeRepository
import javax.inject.Singleton


/**
 * @author jerry on 04/11/2019
 * for Frugal
 **/

@Module
class AppModule{

    @Singleton
    @Provides
    fun provideDataSource():PinchMeDataSource{
        return PinchMeRepository()
    }
}