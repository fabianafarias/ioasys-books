package br.com.ioasys.ioasys_books.data_remote.mappers

import br.com.ioasys.ioasys_books.data_remote.model.BookResponse
import br.com.ioasys.ioasys_books.domain.model.Book

fun List<BookResponse>.toDomain(): List<Book> {
    return this.map {
        Book(
            id = it.id?:"",
            title = it.name?:"",
            author = it.author?.first()?:"",
            pages = it.pages?:"",
            editor = it.editor?:"",
            originName = it.originName?:"",
            date = it.date?:"",
            isbn10 = it.isbn10?:"",
            isbn13 = it.isbn13?:"",
            language = it.language?:"",
            imageUrl = it.imageUrl?:""
            )
    }
}