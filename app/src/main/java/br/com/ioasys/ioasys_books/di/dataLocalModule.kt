package br.com.ioasys.ioasys_books.di

import br.com.ioasys.ioasys_books.data.data_local.utils.SharedPreferencesHelper
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val dataLocalModule = module {

    single { SharedPreferencesHelper(androidContext())}
}