package colecciones

/*P05: Obtener una lista en orden inverso. Metodo Reverse*/

object P05 extends App{
  
  
  val lista:List[Int] = P05.getReverse(List(1,2,3,4,5,6,7,8,9,10));
  val lista2:List[Int] = P05.getReverseRec(List(1,2,3,4,5,6,7,8,9,10));
  
  println(lista);
  println(lista2);
  //Sin Recursividad
  def getReverse(lista:List[Int]):List[Int]=lista.reverse;
  
  
  
  
  /*Patron match: Recorre elemento a elemento de una lista. Divide la lista en 2 ( head y tail)*/
  /*The double colon (::) is the cons operator; x represents the head of the list, and xs the tail*/
  /* El caracter _ funciona como un wildcard o comodin*/
  
  //Con Recursvidad
  def getReverseRec(lista:List[Int]):List[Int]={
    
    
    def getListaDelReves(lista:List[Int], lista2:List[Int]):List[Int] = lista match{
      
      case Nil => lista2
      case x::xs => getListaDelReves(xs, x +: lista2)
    }
    
    
    getListaDelReves(lista, List())
    
  }
  
  
 
  
  
  

  
  
  
  
  
  
  
    
  
  
  
 
  
}