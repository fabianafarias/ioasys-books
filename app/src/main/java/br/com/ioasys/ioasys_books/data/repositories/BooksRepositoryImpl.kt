package br.com.ioasys.ioasys_books.data.repositories

import br.com.ioasys.ioasys_books.data.datasource.local.BooksLocalDataSource
import br.com.ioasys.ioasys_books.data.datasource.remote.BooksRemoteDataSource
import br.com.ioasys.ioasys_books.domain.model.Book
import br.com.ioasys.ioasys_books.domain.repositories.BooksRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow

class BooksRepositoryImpl(
    private val booksRemoteDataSource: BooksRemoteDataSource,
    private val booksLocalDataSource: BooksLocalDataSource
) : BooksRepository {

    override fun getBooks(query: String?): Flow<List<Book>> = flow {
        booksLocalDataSource.getAccessToken().collect { token ->
            booksRemoteDataSource.getBooks(token, query).collect { bookList ->
                emit(bookList)
            }
        }
    }
}