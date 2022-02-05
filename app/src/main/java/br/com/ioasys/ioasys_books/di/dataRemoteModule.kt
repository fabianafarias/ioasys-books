package br.com.ioasys.ioasys_books.di

import br.com.ioasys.ioasys_books.data.datasource.LoginDatasource
import br.com.ioasys.ioasys_books.data_remote.datasource.LoginDatasourceImpl
import org.koin.dsl.module

val dataRemoteModule = module {

    single<LoginDatasource> {
        LoginDatasourceImpl()
    }
}