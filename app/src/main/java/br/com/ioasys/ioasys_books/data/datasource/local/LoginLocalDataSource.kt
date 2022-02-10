package br.com.ioasys.ioasys_books.data.datasource.local

interface LoginLocalDataSource {

    fun saveAccessToken(accessToken: String)
}