package br.com.ioasys.ioasys_books.data.data_local.mappers

import br.com.ioasys.ioasys_books.data_local.model.BookDataLocal
import br.com.ioasys.ioasys_books.domain.model.Book

fun Book.toDao(): BookDataLocal = BookDataLocal(
    id = this.id,
    name = this.title,
    author = this.author,
    pages = this.pages,
    editor = this.editor,
    originName = this.originName,
    date = this.date,
    isbn10 = this.isbn10,
    isbn13 = this.isbn13,
    language = this.language,
    review = this.review,
    imageUrl = this.imageUrl
)

fun BookDataLocal.toDomain(): Book = Book(
    id = this.id,
    title = this.name ?: "",
    author = this.author ?: "",
    pages = this.pages ?: "",
    editor = this.editor ?: "",
    originName = this.originName ?: "",
    date = this.date ?: "",
    isbn10 = this.isbn10 ?: "",
    isbn13 = this.isbn13 ?: "",
    language = this.language ?: "",
    review = this.review ?: "",
    imageUrl = this.imageUrl ?: ""
)