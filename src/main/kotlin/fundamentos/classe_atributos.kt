package fundamentos

class Carro(var Cor: String, val AnoFabricacao: Int, val dono: Dono) {

}

data class Dono(var Nome: String, var Idade: Int){


}

fun main(){

    var MeuCarro = Carro("Amarelo", 1995, Dono("Carlos", 24))
    println(MeuCarro.Cor)

    MeuCarro.Cor = "Preto"
    println(MeuCarro.Cor)

    println(MeuCarro.dono)
    println(MeuCarro.dono.Nome)
}