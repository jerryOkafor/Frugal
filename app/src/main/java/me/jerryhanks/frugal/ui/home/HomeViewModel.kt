package me.jerryhanks.frugal.ui.home

import android.util.Log
import androidx.lifecycle.AndroidViewModel
import me.jerryhanks.frugal.FrugalApp
import me.jerryhanks.frugal.data.PinchMeDataSource
import javax.inject.Inject


/**
 * @author jerry on 05/11/2019
 * for Frugal
 **/


class HomeViewModel
@Inject internal constructor(private  val dataSource: PinchMeDataSource, private  val app:FrugalApp): AndroidViewModel(app){

    fun sayHello(){
        Log.d("HERE","${dataSource.sayHello()} : ${getApplication<FrugalApp>().packageName}")
    }
}