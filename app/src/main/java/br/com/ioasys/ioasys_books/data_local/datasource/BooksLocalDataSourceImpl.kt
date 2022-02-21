package br.com.ioasys.ioasys_books.data_local.datasource

import br.com.ioasys.ioasys_books.data.data_local.mappers.toDao
import br.com.ioasys.ioasys_books.data.data_local.mappers.toDomain
import br.com.ioasys.ioasys_books.data.data_local.utils.SharedPreferencesHelper
import br.com.ioasys.ioasys_books.data.datasource.local.BooksLocalDataSource
import br.com.ioasys.ioasys_books.data_local.database.BookDao
import br.com.ioasys.ioasys_books.data_local.utils.LocalConstants
import br.com.ioasys.ioasys_books.domain.model.Book
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class BooksLocalDataSourceImpl(
    private val sharedPreferencesHelper: SharedPreferencesHelper,
    private val bookDao: BookDao
): BooksLocalDataSource{
    override fun getAccessToken(): Flow<String> = flow {
        emit(sharedPreferencesHelper.getString(LocalConstants.ACCESS_TOKEN_KEY))
    }

    override fun saveBooks(bookList: List<Book>) = bookDao.addBooks(
        bookList = bookList.map { it.toDao() }
    )

    override fun getBooks(query: String?): Flow<List<Book>> = flow{
        val bookList = bookDao.getBooks().map { it.toDomain() }
        query?.let {
            bookList.map { book ->
                book.title.trim().contains(it, ignoreCase = true)
            }
        } ?: run {
            emit(bookList)
        }
    }
}