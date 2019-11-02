package me.jerryhanks.pinchme.data.db

import androidx.test.core.app.ApplicationProvider
import me.jerryhanks.pinchme.PinchMeApp
import org.junit.After
import org.junit.Before
import java.io.IOException


/**
 * @author jerry on 02/11/2019
 * for PinchMe
 **/

open class BaseDaoTest {
    protected lateinit var db:PinchMeDatabase

    @Before
    fun createDB(){
        val context = ApplicationProvider.getApplicationContext<PinchMeApp>()
        db = PinchMeDatabase.getInstance(context,useInMemory = true)
    }


    @After
    @Throws(IOException::class)
    fun closeDB(){
        db.close()
    }
}