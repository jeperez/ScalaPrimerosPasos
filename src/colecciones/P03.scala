package colecciones

/*P03: Buscar el N elemento de una lista*/

object P03 extends App{
  
  
  val lastNElemento_Rec:String = P03.lastNElemento_Rec(List("a", "b", "c", "d"),2);
  
  val lastNElemento:String = P03.lastNElemento(List("a", "b", "c", "d"),2);
  
  
  
   println("N elemento: " + lastNElemento);
   println("N elemento con recursividad:" + lastNElemento_Rec);
  
   //Funcion que obtiene el ultimo elemento de una lista de tipo generico
  def lastNElemento[T](list: List[T], pos:Int): T = {
    
    list(pos);
    
  }
  
  def lastNElemento2[T](list:List[T], pos:Int):T ={
    //Init devuelve todos los elementos excepto el ultimo
    list.take(pos).last;
  }
  
 
  
  /*Patron match: Recorre elemento a elemento de una lista. Divide la lista en 2 ( head y tail)*/
  /*The double colon (::) is the cons operator; x represents the head of the list, and xs the tail*/
   /* El caracter _ funciona como un wildcard o comodin*/
  
  def lastNElemento_Rec[T](list: List[T], pos:Int): T = list match {
    case x :: xs  if pos == 0 => x
    case x :: xs => lastNElemento_Rec(xs,pos-1)
    case _ => throw new NoSuchElementException("list is empty") 
    }
    
  
  
  
 
  
}