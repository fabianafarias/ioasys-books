package br.com.ioasys.ioasys_books.data_local.datasource

import br.com.ioasys.ioasys_books.data.data_local.utils.SharedPreferencesHelper
import br.com.ioasys.ioasys_books.data.datasource.local.LoginLocalDataSource
import br.com.ioasys.ioasys_books.data_local.utils.LocalConstants.ACCESS_TOKEN_KEY

class LoginLocalDataSourceImpl(
    private val sharedPreferencesHelper: SharedPreferencesHelper
): LoginLocalDataSource  {
    override fun saveAccessToken(accessToken: String) = sharedPreferencesHelper.saveString(
        key = ACCESS_TOKEN_KEY,
        value = accessToken
    )
}