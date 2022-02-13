package br.com.ioasys.ioasys_books.di

import br.com.ioasys.ioasys_books.presentation.viewmodel.BookListViewModel
import br.com.ioasys.ioasys_books.presentation.viewmodel.LoginViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel { LoginViewModel(get()) }
    viewModel { BookListViewModel(get(), get())}
}