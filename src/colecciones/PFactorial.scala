package colecciones

import scala.annotation.tailrec

/*
 * 
 **********************************************************************
  @tailrec
  Anotacion que sirve para optimizar la pila por excesivas llamadas recursivas.
  Los metodos marcados con esta anotacion, serán tratados de forma especial por el compilador para que se optimice la pila cuando se ejecuten.
  Si el compilador no pudiera optimizarlo, avisa con Warning
  Evitamos errores de tipo StackOverFlowException
  Se puede utilizar a partir de la version 2.8 de Scala 
  http://blog.richdougherty.com/2009/04/tail-calls-tailrec-and-trampolines.html
 ******************************************************************************   
 * */

/*P08: Factorial de un numero*/

object PFactorial extends App {

  val factorial: Int = P08.factorial(3);

  println(factorial);

  /*  No es posible optimizar la funcion recursiva por la posicion del factorial. No es tail position
   *  La funcion es public y no es final*/
  /*
 @tailrec
  def factorial(valor:Int): Int =  {
   
   if (valor<=1) 1
   else valor * factorial(valor-1);
 }*/

  
  /*
   * La funcion es local. No es accesible desde fuera. Se puede aplicar la anotacion @tailrec
   * */
  
  def factorial(n: Int): Int = {
    @tailrec def factorialAcc(acc: Int, n: Int): Int = {
      if (n <= 1) acc
      else factorialAcc(n * acc, n - 1)
    }
    factorialAcc(1, n)
  }

}