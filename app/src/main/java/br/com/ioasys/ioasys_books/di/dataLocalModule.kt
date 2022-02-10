package br.com.ioasys.ioasys_books.di

import br.com.ioasys.ioasys_books.data.data_local.utils.SharedPreferencesHelper
import br.com.ioasys.ioasys_books.data.datasource.local.BooksLocalDataSource
import br.com.ioasys.ioasys_books.data.datasource.local.LoginLocalDataSource
import br.com.ioasys.ioasys_books.data_local.datasource.BooksLocalDataSourceImpl
import br.com.ioasys.ioasys_books.data_local.datasource.LoginLocalDataSourceImpl
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val dataLocalModule = module {

    single { SharedPreferencesHelper(androidContext())}
    single<LoginLocalDataSource> { LoginLocalDataSourceImpl( get()) }
    single<BooksLocalDataSource> { BooksLocalDataSourceImpl( get()) }
}