package colecciones

/*P01: Buscar el ultimo elemento de una lista*/

object P01 extends App{
  
  val lastGenerico:String = P01.lastGenerico(List("a", "b", "c", "d"));
  
  val lastCadena:String = P01.lastCadena(List("a","b","c","d"));
  
  val lastNumerico:Int = P01.lastNumerico(List(1,2,3,4,5,6,7));
  
  val lastRecursivo:Int = P01.lastRecursivo(List(1,2,3,4,5,6,7));
  
  println(lastGenerico);
  println(lastCadena);
  println(lastNumerico);
  
  
  
  //Funcion que obtiene el ultimo elemento de una lista de tipo generico
  def lastGenerico[T](list: List[T]): T = list.last
  
  //Funcion que obtiene el ultimo elemento de una lista de Strings
  def lastCadena (lista:List[String]):String={
    return lista.last;
  }
  
  //Funcion que obtiene el ultimo elemento de una lista de Enteros
  def lastNumerico(lista:List[Int]):Int={
    return lista.last;
  }
  
  
  /*Patron match: Recorre elemento a elemento de una lista. Divide la lista en 2 ( head y tail)*/
  /*The double colon (::) is the cons operator; x represents the head of the list, and xs the tail*/
  /* El caracter _ funciona como un wildcard o comodin*/
  
  def lastRecursivo[T](list: List[T]): T = list match {
    case x :: Nil => x
    case _ :: xs => lastRecursivo(xs)
    case _ => throw new NoSuchElementException("list is empty")
  }
  
  
 
  
}