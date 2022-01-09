package fundamentos

class Pessoa(var Nome: String, var Idade: Int, var Apelido: String?) {
    override fun toString(): String {
        return "Classe: Pessoa, Nome: ${Nome}, Idade: ${Idade}, Apelido: ${Apelido}"
    }
}

fun main(){
    var Clarissa = Pessoa("Clarissa", 24, null);
    println(Clarissa)
}