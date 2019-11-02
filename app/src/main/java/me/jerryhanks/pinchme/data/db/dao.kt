package me.jerryhanks.pinchme.data.db

import androidx.room.*
import kotlinx.coroutines.flow.Flow


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