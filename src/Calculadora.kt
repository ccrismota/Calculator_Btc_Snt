/*BOOTCAMP SANTANDER MOBILE*/
/*Desenvolvido por Cícero Cristiano Rodrigues da Mota
*
* Solução para o Exercício de Introdução ao Kotlin
*
* "Proposta: Criar uma calculadora que dado dois valores (tipo Float) e
*  um numero (Constante) correspondente a operação, retorne e imprima
*  um valor Float ou uma menssagem de erro caso um dos valores seja nulo."
*/


import java.lang.Math.pow as mathPow
import kotlin.Float as Float1

fun main() {

    do {
        println("\n==========CALCULATOR=============")
        print("1-SOMAR\t\t\t\t\t\t\t|\n2-SUBTRAIR\t\t\t\t\t\t|\n3-DIVIDIR\t\t\t\t\t\t|\n4-MULTIPLICAR\t\t\t\t\t|\n5-POTÊNCIA\t\t\t\t\t\t|\n6-PORCENTAGEM\t\t\t\t\t|\n7-FATORIAL\t\t\t\t\t\t|\n8-SAIR\t\t\t\t\t\t\t|")
        println("\n=================================")

        print("\nQUAL OPERAÇÃO VOCÊ DESEJA REALIZAR?: ")
        val num:String? = readLine()

        val number = num?.toIntOrNull()

        if (number in 1..8) {

            when (number) {
                in 1..4 -> {

                    print("INFORME O PRIMEIRO NÚMERO: ")
                    val one:String? = readLine()

                    print("INFORME O SEGUNDO NÚMERO: ")
                    val two: String? = readLine()

                    val numberOne = one?.toFloatOrNull()
                    val numberTwo = two?.toFloatOrNull()

                    val calcular = when (number) {

                        1 -> numberTwo?.let { numberOne?.plus(it) }

                        2 -> numberTwo?.let { numberOne?.minus(it) }

                        3 -> numberTwo?.let { numberOne?.div(it) }

                        4 -> numberTwo?.let { numberOne?.times(it) }

                        else -> {  "INVÁLIDO!!!"
                        }
                    }
                    if (calcular!=null) {
                        println("O RESULTADO É $calcular")
                    }else   {
                        println("ERRO!!!OS VALORES $numberOne e $numberTwo NÃO SÃO VÁLIDOS")
                    }
                }
                5 -> {
                    print(" DIGITE UM NÚMERO: ")
                    val one: String? = readLine()

                    print(" A QUAL POTÊNCIA, VOCÊ QUER ELEVÁ-LO?: ")
                    val two: String? = readLine()

                    val numberOne = one?.toDoubleOrNull()
                    val numberTwo = two?.toDoubleOrNull()

                    if (numberOne == null || numberTwo == null) {
                        println("ERRO!!!OS VALORES $numberOne e $numberTwo NÃO SÃO VÁLIDOS")
                    } else {
                        println("O RESULTADO É ${potencia(numberOne, numberTwo)}")
                    }
                }
                6 -> {
                    print("QUER A PORCENTAGEM DE QUAL VALOR?: ")
                    val one: String? = readLine()

                    print("QUANTO POR CENTO, VOCÊ QUER DESSE NÚMERO?: ")
                    val two: String? = readLine()

                    val numberOne = one?.toFloatOrNull()
                    val numberTwo = two?.toFloatOrNull()

                    if (numberOne == null || numberTwo == null) {
                        println("ERRO!!!OS VALORES $numberOne e $numberTwo NÃO SÃO VÁLIDOS")
                    } else {
                        println("O RESULTADO É ${porcentagem(numberOne, numberTwo)}")
                    }
                }
                7 -> {
                    print("QUAL NÚMERO VOCÊ QUER O FATORIAL: ")
                    val one:String? = readLine()

                    val numberOne = one?.toFloatOrNull()

                    if (numberOne == null ) {
                        println("ERRO!!!O VALOR $numberOne NÃO É VALIDO")
                    } else {
                        println("O RESULTADO É ${fatorial(numberOne)}")
                    }
                }
                8 -> {
                    println("VOCÊ OPTOU POR SAIR"); break
                }
                else -> {
                    println("ERRO!!! INFORME UM NÚMERO INTEIRO!")
                }
            }
    } else {
            println("ERRO!!! INFORME UM NÚMERO INTEIRO!")
        }
    } while (number in 1..8)

}

fun fatorial(numberOne: Float1): Float1 {
    return if (numberOne >= 1)
        numberOne * fatorial(numberOne - 1)
    else
        1f
}

fun potencia(numberOne:Double, numberTwo:Double):Double{
    return mathPow(numberOne, numberTwo)
}

fun porcentagem(numberOne: Float1, numberTwo: Float1): Float1 {
    return (numberOne / 100) * numberTwo
}







