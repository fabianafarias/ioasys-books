package br.com.ioasys.ioasys_books.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.ioasys.ioasys_books.util.ViewState

class LoginViewModel : ViewModel() {

    private val _loggedUsedViewState = MutableLiveData<ViewState<Boolean>>()
    val loggedUsedViewState = _loggedUsedViewState as LiveData<ViewState<Boolean>>


    fun login(email: String, password: String) {

        if(email.isNotEmpty() && password.isNotEmpty()) {
            _loggedUsedViewState.value = ViewState.Success(true)
        }else{
            _loggedUsedViewState.value = ViewState.Error(Throwable())
        }

    }


}