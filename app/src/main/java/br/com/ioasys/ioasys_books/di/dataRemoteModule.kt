package br.com.ioasys.ioasys_books.di

import br.com.ioasys.ioasys_books.data.datasource.BooksDatasource
import br.com.ioasys.ioasys_books.data.datasource.LoginDatasource
import br.com.ioasys.ioasys_books.data_remote.datasource.BooksDatasourceImpl
import br.com.ioasys.ioasys_books.data_remote.datasource.LoginDatasourceImpl
import br.com.ioasys.ioasys_books.data_remote.service.AuthService
import br.com.ioasys.ioasys_books.data_remote.utils.ApiConstants
import br.com.ioasys.ioasys_books.data_remote.utils.WebServiceFactory
import org.koin.dsl.module

val dataRemoteModule = module {

    single<AuthService> { WebServiceFactory.createWebService(okHttpClient = get(), url = ApiConstants.BASE_URL) }

    single { WebServiceFactory.providerOkHttpClient() }

    single<BooksDatasource> {
        BooksDatasourceImpl()
    }

    single<LoginDatasource> {
        LoginDatasourceImpl(get())
    }
}