package br.com.ioasys.ioasys_books.domain.model

data class User(
    val name: String,
    val birthdate: String,
    val gender: String,
    val accessToken: String
)
