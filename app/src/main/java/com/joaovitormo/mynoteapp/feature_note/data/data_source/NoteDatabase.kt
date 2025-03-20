package com.joaovitormo.mynoteapp.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.joaovitormo.mynoteapp.feature_note.domain.model.Note


//3º Criar o db

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}