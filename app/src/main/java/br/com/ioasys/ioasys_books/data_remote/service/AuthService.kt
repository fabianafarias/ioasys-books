package br.com.ioasys.ioasys_books.data_remote.service

import br.com.ioasys.ioasys_books.data_remote.model.LoginRequest
import br.com.ioasys.ioasys_books.data_remote.model.LoginResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {
    @POST("/auth/sign-in")
    fun signIn(
        @Body loginRequest: LoginRequest
    ): LoginResponse
}