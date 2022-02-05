package br.com.ioasys.ioasys_books.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.ioasys.ioasys_books.domain.repositories.LoginRepository
import br.com.ioasys.ioasys_books.util.ViewState
import br.com.ioasys.ioasys_books.util.postNeutral

class LoginViewModel(
    private val loginRepository: LoginRepository
) : ViewModel() {

    private val _loggedUsedViewState = MutableLiveData<ViewState<Boolean>>()
    val loggedUsedViewState = _loggedUsedViewState as LiveData<ViewState<Boolean>>


    fun login(email: String, password: String) {

        loginRepository.login()

//        viewModelScope.launch {
//
//            _loggedUsedViewState.postLoading()
//
//            delay(2_000)
//
//            if(email.isNotEmpty() && password.isNotEmpty()) {
//                _loggedUsedViewState.postSuccess(true)
//            }else{
//                _loggedUsedViewState.postError(LoginException())
//            }
//        }

    }
    fun resetViewState(){
        _loggedUsedViewState.postNeutral()
    }
}