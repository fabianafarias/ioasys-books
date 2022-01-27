package br.com.ioasys.ioasys_books.adapter

import br.com.ioasys.ioasys_books.model.Book

interface BookClickListener {

    fun onBooklickListener(book: Book)
}