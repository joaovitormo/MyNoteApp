package com.joaovitormo.mynoteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.joaovitormo.mynoteapp.ui.theme.*

//1º Criar a model
@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String): Exception(message)