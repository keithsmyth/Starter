package com.keithsmyth.starter.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DemoEntity(
    @PrimaryKey val id: Int,
)
