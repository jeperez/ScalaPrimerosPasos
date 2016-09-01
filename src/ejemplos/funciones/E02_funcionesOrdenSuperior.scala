package ejemplos.funciones

 /*
   * Funcion de orden superior:Es una función que hace al menos una de las siguientes cosas:
     - Toma una o más funciones como entrada
     - Devuelve una función
   * 
   */

object E02 {

 

  def calculo(f: Int => Int, x: Int): Int = {
    f.apply(x) // Es equivalente a hacer f(x)
  }

  def cuadrado(x: Int): Int = x * x

  def cubo(x: Int): Int = x * x * x

  def main(args: Array[String]) {

    println("Calculo del cubo: " + calculo(cubo, 10))

    println("Calculo del cuadrado: " + calculo(cuadrado, 10))

  }
}