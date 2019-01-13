package com.anubhav87.mvvmtutorial.db.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "notes_table")
data class Note(

    var title: String,

    var description: String

) {

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0

}