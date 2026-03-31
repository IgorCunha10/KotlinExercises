package exercises.level_6six.ex_twentysix

class Usuario(val user: String, val senha: String) {

    init {
        require(user.isNotBlank() && user.trim().length >= 5)
        require(senha.isNotBlank() && senha.trim().length >= 5)
    }
}