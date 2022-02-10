package br.com.ioasys.ioasys_books.data.repositories

import br.com.ioasys.ioasys_books.data.datasource.remote.BooksRemoteDataSource
import br.com.ioasys.ioasys_books.domain.model.Book
import br.com.ioasys.ioasys_books.domain.repositories.BooksRepository
import kotlinx.coroutines.flow.Flow

class BooksRepositoryImpl(
    private val booksRemoteDataSource: BooksRemoteDataSource
) : BooksRepository {

    override fun getBooks(accessToken: String, query: String?): Flow<List<Book>> =
        booksRemoteDataSource.getBooks(accessToken, query)

}