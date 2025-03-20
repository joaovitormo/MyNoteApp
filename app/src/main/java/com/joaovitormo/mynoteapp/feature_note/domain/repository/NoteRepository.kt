package com.joaovitormo.mynoteapp.feature_note.domain.repository

import com.joaovitormo.mynoteapp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow


//3º Criar o repositorio... um repositorio "fake" que vai ser consumido

interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}