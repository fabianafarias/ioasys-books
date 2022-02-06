package br.com.ioasys.ioasys_books.domain.repositories

import br.com.ioasys.ioasys_books.domain.model.Book
import kotlinx.coroutines.flow.Flow

interface BooksRepository {

    fun getBooks(accessToken: String): Flow<List<Book>>


}