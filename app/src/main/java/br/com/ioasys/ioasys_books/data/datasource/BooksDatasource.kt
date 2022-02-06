package br.com.ioasys.ioasys_books.data.datasource

import br.com.ioasys.ioasys_books.domain.model.Book
import kotlinx.coroutines.flow.Flow

interface BooksDatasource {

    fun getBooks(accessToken: String, query: String?) : Flow<List<Book>>
}