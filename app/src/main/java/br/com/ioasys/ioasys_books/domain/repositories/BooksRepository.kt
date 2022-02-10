package br.com.ioasys.ioasys_books.domain.repositories

import br.com.ioasys.ioasys_books.domain.model.Book
import kotlinx.coroutines.flow.Flow

interface BooksRepository {

    fun getBooks(query: String?): Flow<List<Book>>

}