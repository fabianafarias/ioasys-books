package br.com.ioasys.ioasys_books.di

import br.com.ioasys.ioasys_books.domain.usecase.GetBookListUseCase
import br.com.ioasys.ioasys_books.domain.usecase.LoginUseCase
import br.com.ioasys.ioasys_books.domain.usecase.SaveBookListUseCase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import org.koin.dsl.module

val domainModule = module {

    single { CoroutineScope(Dispatchers.IO) }

    factory { LoginUseCase(get(), get()) }
    factory { GetBookListUseCase(get(), get()) }
    factory { SaveBookListUseCase(get(), get()) }
 }