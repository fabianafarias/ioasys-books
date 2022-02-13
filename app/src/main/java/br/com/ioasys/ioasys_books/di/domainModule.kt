package br.com.ioasys.ioasys_books.di

import br.com.ioasys.ioasys_books.domain.usecase.GetBookListUseCase
import br.com.ioasys.ioasys_books.domain.usecase.LoginUseCase
import br.com.ioasys.ioasys_books.domain.usecase.SaveBookListUseCase
import org.koin.dsl.module

val domainModule = module {
     factory { LoginUseCase(get()) }
     factory { GetBookListUseCase(get()) }
    factory { SaveBookListUseCase(get()) }
 }