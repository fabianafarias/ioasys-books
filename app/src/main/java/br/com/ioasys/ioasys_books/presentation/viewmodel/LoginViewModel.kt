package br.com.ioasys.ioasys_books.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.ioasys.ioasys_books.domain.repositories.LoginRepository
import br.com.ioasys.ioasys_books.util.*
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class LoginViewModel(
    private val loginRepository: LoginRepository
) : ViewModel() {

    private val _loggedUsedViewState = MutableLiveData<ViewState<Boolean>>()
    val loggedUsedViewState = _loggedUsedViewState as LiveData<ViewState<Boolean>>


    fun login(email: String, password: String) {

        viewModelScope.launch {

            _loggedUsedViewState.postLoading()

           try {
               loginRepository.login(email, password).collect {
                   if(it.name.isNotEmpty()) {
                       _loggedUsedViewState.postSuccess(true)
                   } else {
                       _loggedUsedViewState.postError(Exception("Body do usuário vazio"))
                   }
               }
           } catch (err: Exception) {
               _loggedUsedViewState.postError(err)
           }
        }
    }
    fun resetViewState(){
        _loggedUsedViewState.postNeutral()
    }
}