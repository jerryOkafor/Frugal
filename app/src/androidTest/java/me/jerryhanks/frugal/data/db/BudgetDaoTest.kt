package me.jerryhanks.frugal.data.db

import androidx.annotation.CallSuper
import androidx.test.ext.junit.runners.AndroidJUnit4
import kotlinx.coroutines.runBlocking
import me.jerryhanks.frugal.TestUtils
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
    fun  setUpTest(){
        budgetDao = db.budgetDao()
    }


    @Test
    fun shouldFindBudgetItemGivenAnId() = runBlocking {
        val budgetItem = TestUtils.getTestBudget()

        budgetDao.insertBudgetItem(budgetItem)

        val budgetItemById  = budgetDao.findBudgetItemById(TestUtils.TEST_BUDGET_ITEM_ID)
        assertThat(budgetItemById.id, `is`(equalTo(TestUtils.TEST_BUDGET_ITEM_ID)))
    }

    @Test
    fun insertBudgetItemSavesData() = runBlocking {
        val budgetItem = TestUtils.getTestBudget()

        val newId = budgetDao.insertBudgetItem(budgetItem)

        val budgetItemById  = budgetDao.findBudgetItemById(newId)

        assertThat(budgetItemById, `is`(notNullValue()))
    }


    @Test
    fun shouldDeleteAnItemIfItExist() = runBlocking {
        val item = TestUtils.getTestBudget()
        budgetDao.insertBudgetItem(item)

        budgetDao.deleteBudgetItem(item)

        val retrievedItem = budgetDao.findBudgetItemById(TestUtils.TEST_BUDGET_ITEM_ID)

        assertThat(retrievedItem, `is`(nullValue()))
    }

    @Test
    fun shouldUpdateUpdatesBudgetItem() = runBlocking {
        val item = TestUtils.getTestBudget()
        budgetDao.insertBudgetItem(item)

        val newName = "Updated Test Name"
        val updatedBudgetItem = item.copy(name = newName)
        budgetDao.updateBudgetItem(updatedBudgetItem)

        val updatedBudgetItemFromDatabase = budgetDao.findBudgetItemById(TestUtils.TEST_BUDGET_ITEM_ID)

        assertThat(updatedBudgetItemFromDatabase.name, `is`(equalTo(newName)))
    }

}