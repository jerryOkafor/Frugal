package me.jerryhanks.frugal.ui.home

import javax.inject.Inject
import javax.inject.Singleton


/**
 * @author jerry on 06/11/2019
 * for Frugal
 **/


interface HomeDataSource {
    fun sayHelloFromHome(): String
}


@Singleton
class HomeRepository
@Inject internal constructor() : HomeDataSource {
    override fun sayHelloFromHome(): String {
        return "Hello from Home Repo with DataSource!"
    }

}