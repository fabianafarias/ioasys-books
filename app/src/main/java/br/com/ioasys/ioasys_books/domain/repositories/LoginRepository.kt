package br.com.ioasys.ioasys_books.domain.repositories

interface LoginRepository {

    fun login(email: String, password: String)
}