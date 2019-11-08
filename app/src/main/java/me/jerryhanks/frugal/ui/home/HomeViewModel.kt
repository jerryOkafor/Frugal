package me.jerryhanks.frugal.ui.home

import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import me.jerryhanks.frugal.FrugalApp
import timber.log.Timber
import javax.inject.Inject


/**
 * @author jerry on 05/11/2019
 * for Frugal
 **/


class HomeViewModel
@Inject internal constructor(
    private val dataSource: HomeDataSource,
    private val app: FrugalApp
) : AndroidViewModel(app) {

    private val _helloResult = MutableLiveData<String>()

    val helloResult:LiveData<String> = _helloResult

    fun sayHello() {
        _helloResult.postValue(dataSource.sayHelloFromHome())
    }
}