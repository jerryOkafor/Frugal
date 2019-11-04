package me.jerryhanks.frugal.data.db

import androidx.test.core.app.ApplicationProvider
import me.jerryhanks.frugal.FrugalApp
import org.junit.Before


/**
 * @author jerry on 02/11/2019
 * for PinchMe
 **/


open class BaseDaoTest {
    protected lateinit var db: PinchMeDatabase

    @Before
    open fun setUp() {
        val context = ApplicationProvider.getApplicationContext<FrugalApp>()
        db = PinchMeDatabase.getInstance(context, useInMemory = true)
    }

}