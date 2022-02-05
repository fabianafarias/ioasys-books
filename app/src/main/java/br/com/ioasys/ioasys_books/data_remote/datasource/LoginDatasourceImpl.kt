package br.com.ioasys.ioasys_books.data_remote.datasource

import br.com.ioasys.ioasys_books.data.datasource.LoginDatasource
import br.com.ioasys.ioasys_books.domain.model.User
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class LoginDatasourceImpl: LoginDatasource {
    override fun login(email: String, password: String): Flow<User> = flow {
        delay(3_000)
        throw Exception("Algo deu errado!")
        emit(User(
            name = "Fabiana",
            birthdate = "23/01/1985",
            gender = "Female",
            accessToken = "123456"
        ))
    }


}