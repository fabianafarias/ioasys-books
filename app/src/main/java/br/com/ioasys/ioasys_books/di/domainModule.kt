package br.com.ioasys.ioasys_books.di

import br.com.ioasys.ioasys_books.domain.usecase.LoginUseCase
import org.koin.dsl.module

val domainModule = module {
     factory { LoginUseCase(get()) }
 }