package br.com.ioasys.ioasys_books.data_local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.ioasys.ioasys_books.data_local.model.BookDataLocal

@Database(entities = [BookDataLocal::class], version = 1)
abstract class BookDatabase: RoomDatabase() {

    abstract fun bookDao(): BookDao
}