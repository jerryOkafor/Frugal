package me.jerryhanks.frugal.di

import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import me.jerryhanks.frugal.FrugalApp
import javax.inject.Singleton


/**
 * @author jerry on 04/11/2019
 * for Frugal
 **/

@Singleton
@Component(modules = [AppModule::class, BuilderModule::class,
    AndroidSupportInjectionModule::class,ViewModelModule::class])
interface AppComponent{
    @Component.Builder
    interface  Builder{

        @BindsInstance
        fun application(app: FrugalApp):Builder

        fun appModule(appModule: AppModule):Builder

        fun build():AppComponent
    }

    fun inject(app:FrugalApp)
}