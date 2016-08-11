package ejemplos.funciones

/*
 * Funciones parciales: Una funcion parcial es una version incompleta de la funcion. 
 * Es una tecnica de programacion llamada currificacion (https://es.wikipedia.org/wiki/Currificación)
 * */

object E03 {

  //Definicion de una funcion con 2 argumentos
  def metodo1(x: Int)(y: Int) = x + y

  
  
  
  def main(args: Array[String]) {

    //Definicion de funcion parcial a la que le pasamos el primer argumento y dejamos pendiente el segundo
    val funcionParcial = metodo1(3)_

    //La funcion parcial ya tiene almacenado el primero parametro, queda pendiente el segundo parametro
    val resultado = funcionParcial(4)

    println(resultado)

  }
}