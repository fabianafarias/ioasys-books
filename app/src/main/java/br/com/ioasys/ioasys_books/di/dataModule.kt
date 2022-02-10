package br.com.ioasys.ioasys_books.di

import br.com.ioasys.ioasys_books.data.repositories.BooksRepositoryImpl
import br.com.ioasys.ioasys_books.data.repositories.LoginRepositoryImpl
import br.com.ioasys.ioasys_books.domain.repositories.BooksRepository
import br.com.ioasys.ioasys_books.domain.repositories.LoginRepository
import org.koin.dsl.module

val dataModule = module {

    single<BooksRepository> {
        BooksRepositoryImpl(get(), get())
    }

    single<LoginRepository> {
        LoginRepositoryImpl(get(), get())
    }

}