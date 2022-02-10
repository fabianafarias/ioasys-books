package br.com.ioasys.ioasys_books.data_local.datasource

import br.com.ioasys.ioasys_books.data.data_local.utils.SharedPreferencesHelper
import br.com.ioasys.ioasys_books.data.datasource.local.BooksLocalDataSource
import br.com.ioasys.ioasys_books.data_local.utils.LocalConstants
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class BooksLocalDataSourceImpl(
    private val sharedPreferencesHelper: SharedPreferencesHelper
): BooksLocalDataSource{
    override fun getAccessToken(): Flow<String> = flow {
        emit(sharedPreferencesHelper.getString(LocalConstants.ACCESS_TOKEN_KEY))
    }
}