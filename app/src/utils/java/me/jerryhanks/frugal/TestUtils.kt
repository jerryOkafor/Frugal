package me.jerryhanks.frugal

import me.jerryhanks.frugal.data.db.BudgetItem


/**
 * @author jerry on 02/11/2019
 * for PinchMe
 **/

object TestUtils{
    const val TEST_BUDGET_ITEM_ID = 1L
    const val TEST_BUDGET_ITEM_NAME =  "Test Budget Name"
    const val TEST_BUDGET_ITEM_DESC = "Test budget description goes like this, this is a description"
    const val TEST_BUDGET_AMOUNT = 340.00

    //String
    const val sayHelloString = "Hello from testing Repo"

    @JvmStatic
    fun getTestBudget(id:Long = TEST_BUDGET_ITEM_ID)  = BudgetItem(id, TEST_BUDGET_ITEM_NAME,
        TEST_BUDGET_ITEM_DESC, TEST_BUDGET_AMOUNT)
}