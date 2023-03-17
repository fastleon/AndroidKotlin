package com.cursokotlin.fastleon

fun main(){

    // Variables numericas
    // enteras
    val intExample:Int = 30
    var longExample:Long = 30
    // decimales
    val floatExample:Float = 30.5f
    var doubleExample:Double = 3241.56456345345

    //Variables alfanumerica
    val charExample1:Char = 'e'
    var charExample2:Char = '@'
    var stringExample:String = "texto multiple"

    //Variable Booleana
    var booExample:Boolean = true

    //Conversion
    println(intExample.toString() + " " + longExample.toString() + "texto")
    println("30".toFloat() + "40.5".toFloat())

    // Concatenacion
    println("texto1 " + "texto2")
    println ("pepito".plus(" clavo un clavito"))

    //llamando funciones
    funcionExample()
    funcionConParametros("Carlos", 30)
    println(funcionConRetorno(5,19))

    //condicionales y Loops
    //if
    funcionIfWhen()

    //nullabilidad
    var name:String? = "aris"  //para permitir variables con valor null (nullable) se debe agregar el ? en el tipo de variable
    println(name!![3]) // == println(name.get(3))
    // !! aseguramos que la variable no es null y no nos alerte osbre posible null al compilar
    // ? adevertimos que la varible puede ser null, si no es null ejecuta el comando, si no lo evita o muestra null (por verificar)
    name = null
    println(name?.get(3)) // -> arroja null
    //println(name!!.get(3)) -> sale error

    //Arrays
    funcionArrays()

    //listas
    funcionListas()





}

fun funcionExample(){
    println("ejecutando funcion de prueba")
}
fun funcionConParametros(nombre:String, edad:Int){
    println("nombre: " + nombre + " edad:" + edad)
}
fun funcionConRetorno(num1:Int, num2:Int):String{
    return("la suma es " + (num1+num2).toString())
}

fun funcionIfWhen() {
    println()
    println("IF y WHEN")
    // == <>
    var var1: String = "Aris"
    var var2: String = "Pepe"

    if (var1 == "Aris") {
        println("Verdadero")
    } else if (var1 == "Pepe") {
        println("Otra opcion")
    } else {
        println("falso")
    }

    var resultado: String = when (var2) {
        "Pepita" -> "One"
        "Hello" -> "Greeting"
        is String -> "Es String"
        //!is Int     -> "No es String"
        else -> "Desconocida"
    }
    println(resultado)

    // o
    when (var2){
        "1", "2", "3"     -> println("primer trimestre")
        //in 4 .. 6 -> println("segundo trimestre")
        "Pepita", "Hello"    -> println("One")
        is String   -> println ("Es string")
        else        -> {
            println("codigo de multiples lineas")
        }
        // etc
    }



}

fun funcionArrays(){
    println()
    println("Arrays")
    val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(weekDays[0])
    println(weekDays.size) //tamaño de array

    println("iteracion for each:")
    for (day in weekDays){
        println(day)
    }
    println("iteracion for index:")
    for (position in weekDays.indices){
        println(weekDays[position])
    }
    println("iteracion con index y valor:")
    for ((position, value) in weekDays.withIndex()){
        println("en la posicion $position esta el valor $value")
    }

}

fun funcionListas() {
    println()
    println("Listas")
    //Listas Inmutables (no se pueden agrandar)
    val lista: List<String> =
        listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(lista.size) //tamaño
    println(lista)      //Nos entrega todo el listado y no la posicion en memoria como pasa con los arrays
    println(lista[2])   //posicion 2 (3er item)
    println(lista.last())   //ultimo
    println(lista.first())  //primero

    var ejemploFiltro = lista.filter { it.contains("a") }
    println(ejemploFiltro)

    lista.forEach { println(it) }
    lista.forEach { day -> println(day) }  //Igual a la funcion anterior pero asignando el nombre a la variable

    //Listas Mutables
    println("Listas Mutables")
    var listaMutable: MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    listaMutable.add("Otro dia")    //Lo agrega al final
    listaMutable.add(0, "Primer dia")   //Lo agrega en la posicion 0
    /*
    println(listaMutable.isEmpty())     //Verifica si la lista esta vacia
    listaMutable.first()                //Primer elemento
    listaMutable.last()                 //Ultimo elemento
    listaMutable.forEach { println(it) }            //For each
    listaMutable.forEach { day -> println(day) }  //Igual a la funcion anterior pero asignando el nombre a la variable

     */
    
    println(listaMutable)
}
