package me.jerryhanks.pinchme.data.db

import androidx.annotation.CallSuper
import androidx.test.ext.junit.runners.AndroidJUnit4
import kotlinx.coroutines.runBlocking
import me.jerryhanks.pinchme.TestUtils
import org.hamcrest.CoreMatchers.*
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith


/**
 * @author jerry on 02/11/2019
 * for PinchMe
 **/

@RunWith(AndroidJUnit4::class)
class BudgetDaoTest : BaseDaoTest() {
private  lateinit var budgetDao: BudgetDao

    @Before
    @CallSuper
    fun  initDao(){
        budgetDao = db.budgetDao()
    }


    @Test
    fun insertBudgetItemSavesData() = runBlocking {
        val budgetItem = TestUtils.getTestBudegt()

        val newId = budgetDao.insertBudgetItem(budgetItem)

        val budgetItemById  = budgetDao.findBudgetItemById(newId)

        assertThat(budgetItemById, `is`(notNullValue()))
        assertThat(budgetItemById.id, `is`(equalTo(TestUtils.TEST_BUDGET_ITEM_ID)))
        assertThat(budgetItemById.name, `is`(equalTo(budgetItem.name)))
        assertThat(budgetItemById.amount, `is`(equalTo(budgetItem.amount)))
    }
}