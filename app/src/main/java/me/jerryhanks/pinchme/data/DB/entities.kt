package me.jerryhanks.pinchme.data.DB

import androidx.room.Entity
import androidx.room.PrimaryKey


/**
 * @author jerry on 31/10/2019
 * for PinchMe
 **/

@Entity(tableName = "budget")
data class BudgetItem(
    @PrimaryKey(autoGenerate = true)
    val id:Long, val name:String, val description:String, val amount:Double)
