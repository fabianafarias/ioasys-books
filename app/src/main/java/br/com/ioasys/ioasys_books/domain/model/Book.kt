package br.com.ioasys.ioasys_books.domain.model

data class Book(
    val id: String,
    val name: String,
    val author: String = "Tim Brown",
    val pages: String = "150 páginas",
    val editor: String = "Editora Loyola",
    val originName: String = "Change By Design",
    val date: String = "Publicado em 2020",
    val isbn10: String = "0062444848",
    val isbn13: String = "965-955656555598",
    val language: String = "Inglês",
    val review: String = "ffkfkmffmflmdflmflsfmslfslfsmlfm",
    val imageUrl: String = ""
)

