package br.com.ioasys.ioasys_books.di

import androidx.room.Room
import br.com.ioasys.ioasys_books.data_local.database.BookDatabase
import br.com.ioasys.ioasys_books.data_local.utils.LocalConstants.BOOK_DATABASE_NAME
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val databaseModule = module {

    single {
        Room.databaseBuilder(
            androidContext(),
            BookDatabase::class.java,
            BOOK_DATABASE_NAME
        ).build()
    }

    single { get<BookDatabase>().bookDao() }


}