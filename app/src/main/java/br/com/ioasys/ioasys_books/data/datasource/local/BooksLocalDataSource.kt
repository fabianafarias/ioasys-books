package br.com.ioasys.ioasys_books.data.datasource.local

import kotlinx.coroutines.flow.Flow


interface BooksLocalDataSource {

    fun getAccessToken(): Flow<String>
}