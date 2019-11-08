package me.jerryhanks.frugal.ui.home

import android.os.Build
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import me.jerryhanks.frugal.FrugalApp
import me.jerryhanks.frugal.TestUtils
import me.jerryhanks.frugal.getOrAwaitValue
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations
import org.robolectric.annotation.Config


/**
 * @author jerry on 05/11/2019
 * for Frugal
 **/

@RunWith(AndroidJUnit4::class)
@Config(sdk = [Build.VERSION_CODES.O_MR1])
class HomeViewModelTest{

    @get:Rule
    val instantTaskExecutorRule  =  InstantTaskExecutorRule()

    @Mock
    lateinit var homeDataSource: HomeDataSource

    @Mock
    lateinit var app:FrugalApp

    private lateinit var viewModel: HomeViewModel


    @Before
    fun setUp(){
        MockitoAnnotations.initMocks(this)
        this.viewModel = HomeViewModel(dataSource = homeDataSource,app = app)

        `when`(homeDataSource.sayHelloFromHome()).thenAnswer { TestUtils.sayHelloString }
    }

    @Test
    fun `test say Hello`(){
        //invoke
        viewModel.sayHello()


        //observer and assert
        assertEquals(viewModel.helloResult.getOrAwaitValue(), TestUtils.sayHelloString)


    }


}