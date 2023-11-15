fun main(){
    //probamos ejercicio N°1
    val matriz1 = listOf(
        listOf(5, 3, -4, -2),
        listOf(8, -1, 0, -3)
    )
    val matriz2 = listOf(
        listOf(1, 4, 0),
        listOf(-5, 3, 7),
        listOf(0, -9, 5),
        listOf(5, 1, 4)
    )
    val resultado = multMatrices(matriz1, matriz2)
    println(resultado)
    //probamos ejercicio N°2
    println(secFibo(6))
    println(secFibonacci(6))
    //probamos ejercicio N°3
    println(sumaImparesEnRango(11))
}

// Ejercicio N°1 - Multiplicar Matrices de igual grado
fun multMatrices(matriz1 : List<List<Int>>, matriz2 : List<List<Int>>) : List<List<Int>> {
        if(matriz1[0].size != matriz2.size){
            println("La cantidad de columnas de la matriz A debe ser igual a " +
                    "la cantidad de filas de la matriz B")
            return listOf()
        } else {
            var sum : Int
            val res = MutableList(matriz1.size) { MutableList(matriz2[0].size){0} }
            for (i in matriz1.indices){
                for (j in matriz2[0].indices){
                    sum = 0
                    for (aux in matriz1[0].indices){
                        sum += (matriz1[i][aux] * matriz2[aux][j])
                    }
                    res[i][j] = sum
                }
            }
            return res
        }
}
//Ejercicio N°2 - Fibonacci
fun secFibonacci (n : Int) : List<Int>{
    var resp = mutableListOf<Int>()
    for (x in 0..n){
        if (x in 0..1){
            resp.add(x)
        } else {
            resp.add(resp[x-2] + resp[x-1])
        }
    }
    return resp
}
// Ejercicio N°2 - Fibonacci (otra forma)
fun secFibo(i : Int) : List<Int>{
    val resp = mutableListOf<Int>()
    for (j in 0..i){
        resp.add(fibonacci(j))
    }
    return resp
}
// Funcion (recursiva) que devuelve el numero fibonacci
// para una posicion dada
fun fibonacci(n : Int) : Int{
    return if (n in 0..1){
        n
    } else {
        fibonacci(n - 1) + fibonacci(n - 2)
    }
}
//Ejercicio N°3 - Suma de impares entre 1  y n
fun sumaImparesEnRango(n : Int) : Int{
    var sum = 0
    for (i in 1..n step 2){
        sum += i
    }
    return sum
}




