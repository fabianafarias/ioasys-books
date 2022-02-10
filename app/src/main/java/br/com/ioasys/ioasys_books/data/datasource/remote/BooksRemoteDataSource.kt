package br.com.ioasys.ioasys_books.data.datasource.remote

import br.com.ioasys.ioasys_books.domain.model.Book
import kotlinx.coroutines.flow.Flow

interface BooksRemoteDataSource {

    fun getBooks(accessToken: String, query: String?) : Flow<List<Book>>
}