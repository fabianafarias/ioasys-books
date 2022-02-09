package br.com.ioasys.ioasys_books.data_remote.service

import br.com.ioasys.ioasys_books.data_remote.model.BooksListResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface BookService {

    @GET("books")
    suspend fun getBooks(@Header("authorization") accessToken: String,
                         @Query("page") page: Int,

    ):

            Response<BooksListResponse>

}