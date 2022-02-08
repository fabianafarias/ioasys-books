package br.com.ioasys.ioasys_books.data_remote.service

import br.com.ioasys.ioasys_books.data_remote.model.LoginRequest
import br.com.ioasys.ioasys_books.data_remote.model.LoginResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {
    @POST("auth/sign-in")
    suspend fun signIn(
        @Body loginRequest: LoginRequest
    ): Response<LoginResponse>
}