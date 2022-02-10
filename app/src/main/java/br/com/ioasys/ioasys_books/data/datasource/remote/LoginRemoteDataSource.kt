package br.com.ioasys.ioasys_books.data.datasource.remote

import br.com.ioasys.ioasys_books.domain.model.User
import kotlinx.coroutines.flow.Flow

interface LoginRemoteDataSource {

    fun login(email: String, password: String) : Flow<User>
}