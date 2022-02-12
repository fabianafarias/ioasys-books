package br.com.ioasys.ioasys_books.data.datasource.local

import br.com.ioasys.ioasys_books.domain.model.Book
import kotlinx.coroutines.flow.Flow


interface BooksLocalDataSource {

    fun getAccessToken(): Flow<String>
    fun saveBooks(bookList: List<Book>)
    fun getBooks(query: String?): Flow<List<Book>>
}