package br.com.ioasys.ioasys_books.domain.usecase

import br.com.ioasys.ioasys_books.domain.model.Book
import br.com.ioasys.ioasys_books.domain.repositories.BooksRepository

class SaveBookListUseCase(
    private val booksRepository: BooksRepository
) {

    operator fun invoke(params: Params) = booksRepository.saveBooks(
        bookList = params.bookList

    )

    data class Params(
        val bookList: List<Book>
    )
}