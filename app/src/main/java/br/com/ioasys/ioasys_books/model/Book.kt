package br.com.ioasys.ioasys_books.model

data class Book(
    val id: Int,
    val name: String,
    val author: String = "Tim Brown",
    val pages: String = "150 páginas",
    val editor: String = "Editora Loyola",
    val originName: String = "Change By Design",
    val date: String = "Publicado em 2020",
    val isbn10: String = "0062444848",
    val isbn13: String = "965-955656555598",
    val language: String = "Inglês",
    val review: String = "mdnbgdeifhdjfegpkfgkfgkfjgfegfgjrerterkfóejdf-fifepflkewfkew-foweçf[ẃelf=p-oefew=of=welf[ẃeçlwd-ewpwepwefwefwepwpfwpflfdwpf=lkẃkélwĺkṕwekṕewfkwofj9eoglffjgpj"
){

    companion object {

        fun getMockList() = listOf(
            Book(
                id =1,
                name = "Crossing the Chasm"
            ),
            Book(
                id =2,
                name = "Change By Design"
            ),
            Book(
                id =3,
                name = "The Making of a Manager"
            ),
            Book(
                id =4,
                name = "Don't  Make a Think"
            ),
            Book(
                id =5,
                name = "Web Design 101"
            )
        )

        fun getMockListCount(count: Int): List<Book> {
            val mockList = mutableListOf<Book>()
            for (id in 1..count) {
                mockList.add(
                    Book(
                        id = id,
                    name = "Crossing the Chasm"
                    )
                )
            }
            return mockList
        }
    }
}