package br.com.ioasys.ioasys_books.data.repositories

import br.com.ioasys.ioasys_books.domain.model.User
import br.com.ioasys.ioasys_books.domain.repositories.LoginRepository
import kotlinx.coroutines.flow.Flow

class LoginRepositoryImpl : LoginRepository {
    override fun login(email: String, password: String): Flow<User> {

    }
}