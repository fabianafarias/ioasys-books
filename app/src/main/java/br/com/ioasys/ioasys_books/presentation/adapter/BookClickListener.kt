package br.com.ioasys.ioasys_books.presentation.adapter

import br.com.ioasys.ioasys_books.domain.model.Book

interface BookClickListener {

    fun onBooklickListener(book: Book)
}