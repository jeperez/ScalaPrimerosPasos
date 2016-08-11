package ejercicios




/*P04: Calcular el tamaño de una lista. Metodo Length*/

object P04 extends App{
  
    /************************************************************************************************/
  
  //Ejemplo 1: Se obtiene el tamaño de una lista usando funcion size
  val tam1:Int = P04.getTamano1(List("a", "b", "c", "d"));
  println(tam1);
  
  //Ejemplo 2: Se obtiene el tamaño de una lista usando map y sum
  val tam2:Int = P04.getTamano2(List("a", "b", "c", "d"));
  println(tam2);
  
  //Ejemplo 3: Se obtiene el anteultimo elemento de la lista, usando Pattern Match y recursividad
  val tam3:Int = P04.getTamanoRecursivo(List("a", "b", "c", "d"));
  println(tam3);
  
    /************************************************************************************************/
  
  
  
  
   
   //Funcion que obtiene el ultimo elemento de una lista 
  def getTamano1(list: List[String]): Int = {
    list.size;
  }
  
  //Funcion que obtiene el ultimo elemento de una lista 
  def getTamano2(list: List[String]):Int = {
    
   list.map(_ =>1).sum; 
  }
  

/*Patron match: Recorre elemento a elemento de una lista. Divide la lista en 2 ( head y tail)*/
/*The double colon (::) is the cons operator; x represents the head of the list, and xs the tail*/
/* El caracter _ funciona como un wildcard o comodin*/
  
  def getTamanoRecursivo(list:List[String]):Int={
    
    def getLengthRec(list:List[String], tam:Int):Int= list match {
      
      case x::xs => getLengthRec(xs,tam+1);
      case Nil => tam
    }
    
    getLengthRec(list,0);
    
  }
  
  
  

  
  
  
  
  
  
  
    
  
  
  
 
  
}