package me.jerryhanks.pinchme.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


/**
 * @author jerry on 31/10/2019
 * for PinchMe
 **/

@Database(entities = [BudgetItem::class],version = 1)
abstract class PinchMeDatabase : RoomDatabase() {

    abstract fun budgetDao():BudgetDao

    companion object{
        private const val DB_NAME = "pinchme.db"

        @Volatile
        private  var INSTANCE:PinchMeDatabase? =  null

        fun getInstance(context: Context,useInMemory:Boolean = false) = INSTANCE ?: synchronized(this){
            INSTANCE ?: buildDataBase(context = context,useInMemory = useInMemory).also { INSTANCE = it }
        }

        private  fun buildDataBase(context: Context, useInMemory:Boolean): PinchMeDatabase {
            val databaseBuilder  = if (useInMemory)
                Room.inMemoryDatabaseBuilder(context,PinchMeDatabase::class.java)
            else Room.databaseBuilder(context,PinchMeDatabase::class.java,DB_NAME)
                .fallbackToDestructiveMigrationFrom(1)


            return databaseBuilder.build()
        }
    }
}