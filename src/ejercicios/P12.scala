package ejercicios

import scala.annotation.tailrec

/*P12: Rotar una lista N lugares a la izquierda*/

object P12 extends App {

  /************************************************************************************************/

  //Ejemplo 1: A partir de una lista y una posicion, rota hacia la izquierda la lista a partir de la posicion
  var listaEjemplo1 = P12.rotar(3, List(1, 2, 3, 4, 5, 6, 7, 8));
  println(listaEjemplo1)
  
  //Ejemplo 2: Solucion Recursiva.A partir de una lista y una posicion, rota hacia la izquierda la lista a partir de la posicion
  var listaEjemplo2 = P12.rotarRecursivo(List(1, 2, 3, 4, 5, 6, 7, 8), 3);
  println(listaEjemplo2)
  
  
  /************************************************************************************************/

  def rotar(pos: Int, lista: List[Int]): (List[Int], List[Int]) = {

    var listaPartida = lista.splitAt(pos);
    return listaPartida.swap;
  }

  def rotarRecursivo[T](list: List[T], n: Int): List[T] = {
    @tailrec
    def rotate(list: List[T], result: List[T], cur: Int, n: Int): List[T] = list match {
      case x :: xs if cur < n => rotate(xs, result :+ x, cur + 1, n)
      case l                  => l ++ result
    }
    
    rotate(list, List(), 0, makeNPositive(list, n))
  }

  private def makeNPositive[T](list: List[T], n: Int): Int = if (n < 0) list.length + n else n

}