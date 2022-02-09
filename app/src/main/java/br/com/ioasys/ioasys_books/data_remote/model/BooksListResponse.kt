package br.com.ioasys.ioasys_books.data_remote.model

import com.google.gson.annotations.SerializedName

data class BooksListResponse(
    @SerializedName("data")
    val data: List<BookResponse>
)