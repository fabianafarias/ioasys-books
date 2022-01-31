package br.com.ioasys.ioasys_books.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.ioasys.ioasys_books.domain.model.exception.LoginException
import br.com.ioasys.ioasys_books.util.ViewState
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class LoginViewModel : ViewModel() {

    private val _loggedUsedViewState = MutableLiveData<ViewState<Boolean>>()
    val loggedUsedViewState = _loggedUsedViewState as LiveData<ViewState<Boolean>>


    fun login(email: String, password: String) {

        viewModelScope.launch {

            _loggedUsedViewState.value = ViewState.Loading

            delay(2_000)

            if(email.isNotEmpty() && password.isNotEmpty()) {
                _loggedUsedViewState.value = ViewState.Success(true)
            }else{
                _loggedUsedViewState.value = ViewState.Error(LoginException())
            }
        }

    }
    fun resetViewState(){
        _loggedUsedViewState.value = ViewState.Neutral
    }
}