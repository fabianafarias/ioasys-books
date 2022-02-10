package br.com.ioasys.ioasys_books.data_remote.datasource

import br.com.ioasys.ioasys_books.data.datasource.remote.LoginRemoteDataSource
import br.com.ioasys.ioasys_books.data_remote.mappers.toDomain
import br.com.ioasys.ioasys_books.data_remote.model.LoginRequest
import br.com.ioasys.ioasys_books.data_remote.service.AuthService
import br.com.ioasys.ioasys_books.domain.model.User
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class LoginRemoteDataSourceImpl(
    private val authService: AuthService
): LoginRemoteDataSource {
    override fun login(email: String, password: String): Flow<User> = flow {
        val response = authService.signIn(LoginRequest(email, password))
        val accessToken = response.headers()["authorization"]
        if (response.isSuccessful){
            response.body()?.let { loginResponse ->
                emit(loginResponse.toDomain(accessToken?: ""))
            }
        }
    }


}