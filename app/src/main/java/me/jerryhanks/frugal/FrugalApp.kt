package me.jerryhanks.frugal

import android.app.Application
import android.util.Log
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import me.jerryhanks.frugal.di.AppInjector
import timber.log.Timber
import javax.inject.Inject


/**
 * @author jerry on 01/11/2019
 * for PinchMe
 **/

class FrugalApp : Application(),HasAndroidInjector {

    @Inject
    lateinit var androidInjector:DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()

        AppInjector.init(this)
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return androidInjector
    }


}

