package br.com.ioasys.ioasys_books.data.datasource

import br.com.ioasys.ioasys_books.domain.model.User
import kotlinx.coroutines.flow.Flow

interface LoginDatasource {

    fun login(email: String, password: String) : Flow<User>
}