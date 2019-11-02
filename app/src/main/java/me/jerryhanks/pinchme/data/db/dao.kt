package me.jerryhanks.pinchme.data.db

import androidx.room.*
import kotlinx.coroutines.flow.Flow


/**
 * @author jerry on 31/10/2019
 * for PinchMe
 **/

@Dao
interface BudgetDao{

    @Query("SELECT * FROM budget")
    fun selectALl(): Flow<List<BudgetItem>>

    @Query("SELECT * FROM budget WHERE id = :id")
    suspend fun findBudgetItemById(id:Long) : BudgetItem

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertBudgetItem(budgetItem: BudgetItem):Long

    @Insert
    fun insertBudgetItems(vararg  budgetItem: BudgetItem)

    @Delete
    fun deleteBudgetItem(budgetItem: BudgetItem)

    @Delete
    fun deleteBudgetItems(vararg  budgetItem: BudgetItem)

    @Update
    fun updateBudgetItem(budgetItem: BudgetItem)

    @Query("DELETE FROM budget")
    fun deleteAllBudgetItem()

}