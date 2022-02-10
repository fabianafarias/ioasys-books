package br.com.ioasys.ioasys_books.data_remote.datasource

import br.com.ioasys.ioasys_books.data.datasource.remote.BooksRemoteDataSource
import br.com.ioasys.ioasys_books.data_remote.mappers.toDomain
import br.com.ioasys.ioasys_books.data_remote.service.BookService
import br.com.ioasys.ioasys_books.domain.model.Book
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class BooksRemoteDataSourceImpl(
    private val bookService: BookService
) : BooksRemoteDataSource {

    override fun getBooks(accessToken: String, query: String?): Flow<List<Book>> = flow {
        val response = bookService.getBooks(accessToken = "Bearer $accessToken", page = 1)
        if (response.isSuccessful){
            response.body()?.data?.let { bookList ->
                query?.let {
                    emit(bookList.filter { book ->
                        book.name?.trim()?.contains(it, ignoreCase = true) ?: false
                    }.toDomain())
                } ?: run {
                    emit(bookList.toDomain())
                }
            }
        }
    }
}