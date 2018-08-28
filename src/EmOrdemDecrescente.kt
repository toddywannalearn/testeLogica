
fun main(args: Array<String>){
    var num1 = 9
    var num2 = 2
    var num3 = 7

    var arr: ArrayList<Int> = arrayListOf(num1,num2,num3)

    // Imprime os valores em ordem decrescente
    arr.sortDescending()
    println(arr)

}

