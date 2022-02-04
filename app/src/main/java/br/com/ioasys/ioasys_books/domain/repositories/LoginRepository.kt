package br.com.ioasys.ioasys_books.domain.repositories

import br.com.ioasys.ioasys_books.domain.model.User
import kotlinx.coroutines.flow.Flow

interface LoginRepository {

    fun login(email: String, password: String) : Flow<User>
}