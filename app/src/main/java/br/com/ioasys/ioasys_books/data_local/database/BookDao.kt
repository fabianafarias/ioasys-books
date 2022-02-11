package br.com.ioasys.ioasys_books.data_local.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import br.com.ioasys.ioasys_books.data_local.model.BookDataLocal

@Dao
interface BookDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addBooks(bookList: List<BookDataLocal>)

    @Query("SELECT * FROM Books")
    fun getBooks(bookList: List<BookDataLocal>)
}