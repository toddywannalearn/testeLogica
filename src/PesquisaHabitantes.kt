
data class Habitantes(var sexo: String, var corDosOlhos: String, var corDoCabelo: String, var idade: Int)

// funcao para determinar maior idade do conjunto
fun maiorIdade(arr: ArrayList<Habitantes>): Int {
    var mIdade: Int = Int.MIN_VALUE

    for (i in arr) {
        if (mIdade < i.idade)
            mIdade = i.idade
    }
    return mIdade
}

// funcao para determinar os inviduos femininos com idade entre 18 e 35
fun entre18E35(arr: ArrayList<Habitantes>): Int{
    var qnt: Int = 0

    for(i in arr){
        if(i.sexo == "f" && i.idade >= 18 && i.idade <= 35)
            qnt++
    }
    return qnt
}

// funcao para determinar quantidade de individuos com olhos verdes e cabelos louros
fun qntOlhsVerdesCabeloLoiro(arr: ArrayList<Habitantes>): Int{
    var qnt: Int = 0

    for(i in arr){
        if(i.corDosOlhos == "verdes" && i.corDoCabelo == "louros")
            qnt++
    }

    return qnt
}


fun main(args: Array<String>) {

    var opc: String

    var sexo: String = ""
    var corDosOlhos: String = ""
    var corDoCabelo: String = ""
    var idade: Int = 0

    var listaDeHabitantes: ArrayList<Habitantes> = ArrayList()
    do {

        println("Sexo (M/F): ").run { sexo = readLine()!!.toString().toLowerCase() }
        println("Idade: ").run { idade = readLine()!!.toInt() }
        println("Cor dos Cabelos: (louros/castanhos/pretos)").run { corDoCabelo = readLine()!!.toString().toLowerCase() }
        println("Cor dos Olhos: (azuis/verdes/castanhos)").run { corDosOlhos = readLine()!!.toString().toLowerCase() }

        listaDeHabitantes.add(Habitantes(sexo, corDosOlhos, corDoCabelo, idade))

        println("Deseja Continuar? (s/n)")
        opc = readLine()!!.toString().toLowerCase()

    } while (opc != "n")

    for (i in listaDeHabitantes) {
        println(i)
    }

    println("Maior idade: ${maiorIdade(listaDeHabitantes)}")
    println("Habitantes femininos com idade entre 18 e 35: ${entre18E35(listaDeHabitantes)}")
    println("Quantidade de individuos com olhos verdes e cabelos louros: ${qntOlhsVerdesCabeloLoiro(listaDeHabitantes)} ")
}