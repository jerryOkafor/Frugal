package me.jerryhanks.frugal.data.db

import androidx.room.*


/**
 * @author jerry on 31/10/2019
 * for PinchMe
 **/

@Dao
interface BudgetDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBudgetItem(budgetItem: BudgetItem):Long

    @Query("SELECT * FROM budget WHERE id = :id")
    suspend fun findBudgetItemById(id:Long) : BudgetItem

    @Delete
    suspend fun deleteBudgetItem(budgetItem: BudgetItem)

    @Update
    suspend fun updateBudgetItem(budgetItem: BudgetItem)

}