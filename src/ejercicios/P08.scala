package ejercicios


/*P08: Dada una lista, devolver la misma lista sin duplicados*/

object P08 extends App {

/************************************************************************************************/  
  
  //Ejemplo 1: Genera una lista sin duplicados usando distinct
  val lista: List[Any] = P08.eliminarRepetidos(List(1,2,3,4,5,6,6,6,3));
  println("Lista Sin repetidos: " +  lista)
  
  //Ejemplo 2: Genera una lista sin duplicados usando recursividad y dropWhile
  val listaRec: List[Any] = P08.eliminar_doWhile(List(1,2,3,3,4,5,6,6,6,3,5));
  println("Lista sin repetidos Recursiva: " + listaRec);
  
/************************************************************************************************/  
  
  
  //Funcion que elimina repetidos de una lista
  def eliminarRepetidos(lista: List[Any]): List[Any] = {
    lista.distinct
  }
  
  //Funcion que elimina repetidos de una lista.
  def eliminar_doWhile[T](list: List[T]): List[T] = list match {
    case Nil => Nil
    case x :: xs => x :: eliminar_doWhile(xs.dropWhile(e => e == x))
  }
  
  
 /*dropWhile "drops longest prefix of elements that satisfy a predicate.", i.e. it stops dropping as long as condition is no longer met*/


}