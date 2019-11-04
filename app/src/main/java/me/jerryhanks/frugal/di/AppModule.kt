package me.jerryhanks.frugal.di

import dagger.Module
import dagger.Provides
import me.jerryhanks.frugal.FrugalApp
import javax.inject.Singleton


/**
 * @author jerry on 04/11/2019
 * for Frugal
 **/

@Module
class AppModule(private  val app:FrugalApp){

    @Singleton
    @Provides
    fun provideApplication():FrugalApp{
        return app
    }
}