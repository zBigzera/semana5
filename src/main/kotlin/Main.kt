fun main() {
    //1 - Crie uma função recursiva que calcule o fatorial de um número inteiro positivo.
    val fatorial = 5;
    println("O fatorial do número " + fatorial + " é igual a " + ex1at1(fatorial))

    //2  - Crie uma função recursiva que calcule o enésimo termo da sequência de Fibonacci.
    val n = 7
    val resultado = ex2at1(n)
    println("O ${n}º número da sequência de Fibonacci é $resultado")

    //3 - Crie uma função recursiva que calcule o MDC (Máximo Divisor Comum) entre dois números inteiros positivos.
    val numero1 = 24
    val numero2 = 36
    val resultado2 = ex3at1(numero1, numero2)
    println("O MDC entre $numero1 e $numero2 é $resultado2")
//4 - Crie uma função recursiva que verifique se uma string é palíndromo.
    val resultado3 = ex4at1("pop")
    println("Esta palavra $resultado3")

    //5 - Crie uma função recursiva que calcule a soma dos elementos de um array de inteiros.
    val arr = intArrayOf(1, 2, 3, 4, 5)
    println("O resultado é: " + ex5at1(arr))

    //Funções lambda e funções de ordem superior

//1 - Como posso usar uma função lambda para classificar uma lista em ordem crescente em Kotlin?
    println("Basta usar a função sortedBy")
    val lista = listOf(5, 2,9,10, 1, 8,3,7,4,6)

    val listaOrdenada = lista.sortedBy { it }

    println(listaOrdenada)

    // 2 - Como posso usar uma função de ordem superior para aplicar uma operação a cada elemento de uma lista em Kotlin?
    println("Basta utilizar o map, que percorre toda a lista.")
    val lista2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val listaalterada = lista2.map { it * 2 }

    println(listaalterada)

    //3 - Como posso usar uma função lambda para filtrar elementos de uma lista em Kotlin?
 println("Basta acrescentar filter() onde deseja filtrar algo e a condição")
    val lista3 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val listaFiltrada = lista3.filter { it % 2 == 0 }

    println(listaFiltrada)
    //4 - Como posso usar uma função lambda para encontrar o maior valor em uma lista em Kotlin?
println("Basta usar a função max()")
    val lista4 = listOf(1, 2, 3, 4, 5, 10,6, 7, 8, 9 )
    val maior = lista4.max()
    println("O maior número é: " + maior)
    //5 - Como posso usar uma função de ordem superior para somar todos os elementos de uma lista em Kotlin?
println("Basta utilizar a função sum()")
    val lista5 = listOf(1, 2, 3, 4, 5,6, 7, 8, 9, 10 )
    val soma = lista5.sum()
    println("A soma da lista é igual a:"+soma)
//6 - Como posso usar uma função de ordem superior para criar uma função que retorna a soma de dois números em Kotlin?
fun soma(x: Int, y: Int) = x + y
    val soma2= soma(1,3)
    println("O resultado desta soma é: " +soma2)
    //7 - Como posso usar uma função de ordem superior para imprimir uma mensagem n vezes em Kotlin?
    fun ex7at2(n: Int, mensagem: String){
        repeat(n) {
            println(mensagem)
        }
    }

  ex7at2(5,"Imprimindo essa mensagem 5 vezes!")



}

//funções recursivas
fun ex1at1(x: Int): Int{
    var resultado = 1
    for (i in 1..x){
        resultado = resultado*i;
    }
    return resultado
}
fun ex2at1(n: Int): Int {
    if(n==0) return 0 // a sequência fibonacci inicia-se em 0
    if(n==1) return 1 // segundo número, não há nada menor muito menos pode ser negativo.
    return ex2at1(n-1) + ex2at1(n-2)
}
fun ex3at1(a: Int, b: Int): Int {
    return if (b == 0) {
        a
    } else {
        ex3at1(b, a % b)
    }
}
fun ex4at1(x:String): String{
    return if(x==x.reversed())
    {"É um palíndromo"}else{"Não é palíndromo"}

}
fun ex5at1(arr: IntArray, pos: Int = 0): Int {
    return if (pos == arr.size - 1) {
        arr[pos]
    } else {
        arr[pos] + ex5at1(arr, pos + 1)
    }
}
