package me.jerryhanks.frugal.di

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import dagger.android.AndroidInjection
import dagger.android.HasAndroidInjector
import dagger.android.support.AndroidSupportInjection
import me.jerryhanks.frugal.ActivityLifecycleCallbackAdapter
import me.jerryhanks.frugal.FrugalApp


/**
 * @author jerry on 04/11/2019
 * for Frugal
 **/

class AppInjector {
    companion object {
        fun init(app: FrugalApp) {
            DaggerAppComponent.builder()
                .application(app = app)
                .appModule(appModule = AppModule())
                .build()
                .inject(app)

            app.registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbackAdapter() {
                override fun onActivityCreated(activity: Activity, bundle: Bundle?) {
                    super.onActivityCreated(activity, bundle)
                    handleActivity(activity = activity)
                }
            })
        }


        fun handleActivity(activity: Activity) {

            if (activity is HasAndroidInjector) {
                AndroidInjection.inject(activity)
            }


            (activity as? FragmentActivity)?.supportFragmentManager?.registerFragmentLifecycleCallbacks(
                object : FragmentManager.FragmentLifecycleCallbacks() {
                    override fun onFragmentPreAttached(
                        fm: FragmentManager,
                        f: Fragment,
                        context: Context
                    ) {
                        super.onFragmentPreAttached(fm, f, context)

                        if (f is Injectable) {
                            AndroidSupportInjection.inject(f)
                        }
                    }
                },
                true
            )
        }
    }
}