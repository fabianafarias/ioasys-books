package br.com.ioasys.ioasys_books.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.ioasys.ioasys_books.domain.usecase.LoginUseCase
import br.com.ioasys.ioasys_books.util.*
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class LoginViewModel(
    private val loginUseCase: LoginUseCase
) : ViewModel() {

    private val _loggedUserViewState = MutableLiveData<ViewState<String>>()
    val loggedUserViewState = _loggedUserViewState as LiveData<ViewState<String>>


    fun login(email: String, password: String) {

        viewModelScope.launch {

            _loggedUserViewState.postLoading()

           try {
               loginUseCase.invoke(
                   params = LoginUseCase.Params(
                       email = email,
                       password = password
                   )
               ).collect {
                   if(it.name.isEmpty().not()) {
                       _loggedUserViewState.postSuccess(it.accessToken)
                   } else {
                       _loggedUserViewState.postError(Exception("Body do usuario vazio"))
                   }
               }

           } catch (err: Exception) {
               _loggedUserViewState.postError(err)
           }
        }
    }
    fun resetViewState(){
        _loggedUserViewState.postNeutral()
    }
}