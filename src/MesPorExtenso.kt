// retorna o mes informado
fun meses(mes: Int): String{
    var meses: List<String> = listOf("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
            "Setembro","Outubro","Novembro","Dezembro")

    return meses[mes - 1]
}

fun main(args: Array<String>){

    println("Digite um numero inteiro de 1 a 12")
    var mes: Int = readLine()!!.toInt()

// Verifica numero digitado
    if(mes < 1 || mes > 12){
        println("Número fora do estabelecido (1 à 12)")
    }else{
        println(meses(mes))
    }
}