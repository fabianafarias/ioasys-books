package br.com.ioasys.ioasys_books.data.data_local.utils

import android.content.Context
import br.com.ioasys.ioasys_books.data_local.utils.LocalConstants.SHARED_PREFERENCES_NAME

class SharedPreferencesHelper(
    context: Context
) {

    private val sharedPreferences = context.getSharedPreferences(
        SHARED_PREFERENCES_NAME,
        Context.MODE_PRIVATE
    )

    fun saveString(key: String, value: String) = sharedPreferences.edit().run {
        putString(key, value)
        apply()
    }

    fun getString(key: String): String = sharedPreferences.getString(key, "") ?: ""

}