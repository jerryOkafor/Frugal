package me.jerryhanks.frugal

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupWithNavController
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import kotlinx.android.synthetic.main.activity_main.*
import me.jerryhanks.frugal.ui.home.HomeViewModel
import timber.log.Timber
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasAndroidInjector {

    @Inject
    lateinit var androidInjector :DispatchingAndroidInjector<Any>

    private  val navController by lazy { findNavController(R.id.nav_host_fragment)}

    private  lateinit var appBarConfiguration :AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme_NoActionBar)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        appBarConfiguration = AppBarConfiguration(setOf(R.id.homeFragment),null) {
            Timber.d("I am here")
            return@AppBarConfiguration  true
        }

        toolbar.setupWithNavController(navController,appBarConfiguration)
    }

    override fun onSupportNavigateUp():Boolean{
        Timber.d("Navigating up from ${navController.currentDestination}")
        return navController.navigateUp(appBarConfiguration)
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return  androidInjector
    }
}

