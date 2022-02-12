package br.com.ioasys.ioasys_books.data_local.model

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Books")
data class BookDataLocal(
    @PrimaryKey @NonNull
    val id: String,
    val name: String? = null,
    val author: String? = null,
    val pages: String? = null,
    val editor: String? = null,
    val originName: String? = null,
    val date: String? = null,
    val isbn10: String? = null,
    val isbn13: String? = null,
    val language: String? = null,
    val review: String? = null,
    val imageUrl: String? = null
)
