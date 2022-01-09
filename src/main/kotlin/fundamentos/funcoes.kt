package fundamentos


//construtor
fun main(): Unit{
    println("Hello World")
    println(retornaNome())

    var Nome = retornaNome()

    println(Nome)
    println(retornaOi("Samanta"))
    println(retornaOi(retornaNome()))
}

fun retornaNome(): String{
    return "Nome"
}

fun retornaOi(Nome:String): String{
    return "Oi ${Nome}"
}