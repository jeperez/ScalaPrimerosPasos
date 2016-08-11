package ejercicios


/*P10: Dada una lista, duplicar los elementos de la lista*/

object P10 extends App {

/************************************************************************************************/  
  
  //Ejemplo 1: Genera una lista con elementos duplicados usando funcion FlatMap
  val lista1: List[Any] = P10.duplicarElemento_FlatMap(List(1,2,3,4,5,6));
  println("Lista FlatMap " +  lista1)
  
  //Ejemplo 2: Genera una lista con elementos duplicados usando funcion Recursividad
  val listaRec: List[Any] = P10.duplicarElemento_Rec(List(1,2,3,4,5,6));
  println("Lista Recursiva: " + listaRec);
  
/************************************************************************************************/  
  
  
  
  //Funcion que duplica el contenido de una lista usando recursividad
  def duplicarElemento_Rec(list:List[Int]):List[Int] = list match {
    case Nil => Nil
    case x::xs => x +: x+: duplicarElemento_Rec(xs)
  }
  
  //Funcion que duplica el contenido de una lista usando FlatMap
  def duplicarElemento_FlatMap[T](list: List[T]): List[T] = list.flatMap(e => List(e, e))


 
  
  
 
  
 


}