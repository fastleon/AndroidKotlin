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