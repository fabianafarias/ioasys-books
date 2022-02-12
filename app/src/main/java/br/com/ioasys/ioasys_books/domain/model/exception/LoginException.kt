package br.com.ioasys.ioasys_books.domain.model.exception

open class LoginException : Exception()

class InvalidEmailException : LoginException()
class InvalidPasswordException : LoginException()

