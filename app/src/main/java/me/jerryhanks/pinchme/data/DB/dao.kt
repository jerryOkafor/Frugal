package me.jerryhanks.pinchme.data.DB

import androidx.room.*
import kotlinx.coroutines.flow.Flow


/**
 * @author jerry on 31/10/2019
 * for PinchMe
 **/

@Dao
interface BudgetDao{

    @Query("SELECT * FROM budget")
    fun selectALl():Flow<List<BudgetItem>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertBudgetItem(budgetItem: BudgetItem)

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