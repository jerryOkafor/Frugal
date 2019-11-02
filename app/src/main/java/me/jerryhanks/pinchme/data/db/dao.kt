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
    suspend fun insertBudgetItem(budgetItem: BudgetItem):Long

    @Insert
    suspend fun insertBudgetItems(vararg  budgetItem: BudgetItem)

    @Delete
    suspend fun deleteBudgetItem(budgetItem: BudgetItem)

    @Delete
    suspend fun deleteBudgetItems(vararg  budgetItem: BudgetItem)

    @Update
    suspend fun updateBudgetItem(budgetItem: BudgetItem)

    @Query("DELETE FROM budget")
    suspend fun deleteAllBudgetItem()

}