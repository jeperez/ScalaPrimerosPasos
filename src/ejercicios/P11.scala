package ejercicios

/*P11: Dada una lista, dividirla en 2 trozos. El tamaño del primer trozo es pasado por parametro*/

object P11 extends App {

  /************************************************************************************************/

  //Ejemplo 1: A partir de una lista y un tamaño, genera 2 listas. Usando split
  val tuplaListas: (List[Any], List[Any]) = P11.splitLista(2, List(1, 2, 3, 4, 5, 6));
  println("Tamaño de la lista 1: " + tuplaListas._1.size)
  println("Tamaño de la lista 2: " + tuplaListas._2.size)
  
  //Ejemplo 2: A partir de una lista y un tamaño, genera 2 listas. Usando take y drop
  val tuplaListas2: (List[Any], List[Any]) = P11.splitLista_TakeDrop(2, List(1, 2, 3, 4, 5, 6));
  println("Tamaño de la lista 1: " + tuplaListas2._1.size)
  println("Tamaño de la lista 2: " + tuplaListas2._2.size)
  
  /************************************************************************************************/

  def splitLista(pos: Int, lista: List[Int]): (List[Int], List[Int]) = {
    return lista.splitAt(pos)
  }
  
  
  def splitLista_TakeDrop[T](n: Int, list: List[T]): (List[T], List[T]) = (list.take(n), list.drop(n))

}