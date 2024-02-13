package com.keithsmyth.starter.database

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * https://developer.android.com/training/data-storage/room
 */
@Database(entities = [DemoEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
}
