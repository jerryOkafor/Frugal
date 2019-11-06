package me.jerryhanks.frugal.ui.home

import android.util.Log
import androidx.lifecycle.ViewModel
import me.jerryhanks.frugal.data.PinchMeDataSource
import javax.inject.Inject


/**
 * @author jerry on 05/11/2019
 * for Frugal
 **/


class HomeViewModel
@Inject internal constructor(private  val dataSource: PinchMeDataSource): ViewModel(){

    fun sayHello(){
        Log.d("HERE",dataSource.sayHello())
    }
}