package colecciones

/*
 * 
 **********************************************************************
 For en Scala 
 ===================
 Los bucles For normales equivalen en Scala a esto:
 for (i <- 1 to 10) {
  println(i)
}

Los bucles For a partir de Java 5, equivalen en Scala a esto:
for (s <- getList) {
  println(s)
  
ForEach en Scala 
================================
lista.foreach { x => println(x) }
lista.foreach(println(_));
lista.foreach(println);  
  
}

FlatMap 
===========================================================
Construye una nueva lista aplicando una funcion

lista.flatMap(elemento => funcion)
 
 ******************************************************************************   
 * */

/*P08: Dada una lista, devolver la misma lista sin duplicados*/

object P08 extends App {

  val lista: List[Any] = P08.eliminarRepetidos(List(1,2,3,4,5,6,6,6,3));
  
  val listaRec: List[Any] = P08.eliminar_doWhile(List(1,2,3,3,4,5,6,6,6,3,5));
  
  
  
  println("Lista Sin repetidos: " +  lista)
  
  println("Lista sin repetidos Recursiva: " + listaRec);
  
  def eliminarRepetidos(lista: List[Any]): List[Any] = {

    lista.distinct
   

  }
  
  /*
   * dropWhile "drops longest prefix of elements that satisfy a predicate.", i.e. it stops dropping as long as condition is no longer met
   * */
  
  
  
  
  def eliminar_doWhile[T](list: List[T]): List[T] = list match {
    case Nil => Nil
    case x :: xs => x :: eliminar_doWhile(xs.dropWhile(e => e == x))
  }
  
  
  

}