package colecciones

import scala.annotation.tailrec



/*P09: Obtiene el factorial de un numero*/

object P09 extends App {

  /************************************************************************************************/  

  val factorial: Int = P09.factorial(3);
  println(factorial);
  
/************************************************************************************************/  
  

  
  //Funcion que calcula el factorial de un numero  
  def factorial(n: Int): Int = {
    @tailrec def factorialAcc(acc: Int, n: Int): Int = {
      if (n <= 1) acc
      else factorialAcc(n * acc, n - 1)
    }
    factorialAcc(1, n)
  }
  
  
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
  

}