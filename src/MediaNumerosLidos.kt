import java.util.*

// Determina a media dos valores lidos no array
fun media(arr: Array<Int>): Double{
    var media: Double
    var aux: Double = 0.0

    for(i in arr){
        aux += i
    }
    media = aux / arr.size

    return media
}
// Determina o maior e menor valor do array
fun maiorEMenorValor(arr: Array<Int>): String{
    var maiorValor: Int = Int.MIN_VALUE
    var menorValor: Int = Int.MAX_VALUE

    for(i in arr){
        if(maiorValor < i)
            maiorValor = i

        if(menorValor > i)
            menorValor = i
    }

    return "Maior valor: $maiorValor \nMenor valor: $menorValor"
}

fun main(args: Array<String>){

    //Inicializa o array com valores aleatórios
    var bigArray: Array<Int> = Array(500) { i ->i + Random().nextInt(99) * 7}

    println("Media dos valores lidos: " + media(bigArray))
    println(maiorEMenorValor(bigArray))

}