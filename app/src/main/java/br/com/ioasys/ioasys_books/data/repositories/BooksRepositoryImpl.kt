package br.com.ioasys.ioasys_books.data.repositories

import br.com.ioasys.ioasys_books.domain.model.Book
import br.com.ioasys.ioasys_books.domain.repositories.BooksRepository
import kotlinx.coroutines.flow.Flow

class BooksRepositoryImpl : BooksRepository {
    override fun getBooks(accessToken: String): Flow<List<Book>> {
        TODO("Not yet implemented")
    }
}