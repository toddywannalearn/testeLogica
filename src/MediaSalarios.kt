
class Funcionarios(){
    var registro: Int = 0
    var salario:Double = 0.0

    constructor(registro: Int, salario: Double):this(){
        this.registro = registro
        this.salario = salario
    }

    fun mediaSalario(funcs: HashMap<Int, Double>): Double{
        var media: Double = 0.0

        for (i in funcs.values){
            media += i
        }

        return media / funcs.size

    }

    fun maiorEMenorSalario(funcs: HashMap<Int, Double>): String{
        var maiorSal: Double = Double.MIN_VALUE
        var menorSal: Double = Double.MAX_VALUE

        for(sal in funcs.values){
            if(maiorSal < sal)
                maiorSal = sal

            if(menorSal > sal)
                menorSal = sal
        }

        return "Maior salario: $maiorSal \nMenor salario: $menorSal"
    }

}

fun main(args: Array<String>){
    var salarios: HashMap<Int, Double> = HashMap()
    do {

        var funcionarios = Funcionarios()

        println("Digite o Registro do funcionario: ")
        funcionarios.registro = readLine()!!.toInt()

        println("Digite o Salario do funcionario: ")
        funcionarios.salario = readLine()!!.toDouble()

        salarios.put(funcionarios.registro,funcionarios.salario)

    }while (funcionarios.registro != 0)

    println("Média dos salarios: ${Funcionarios().mediaSalario(salarios)}")
    println(Funcionarios().maiorEMenorSalario(salarios))

}

