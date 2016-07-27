package colecciones

/*********************************************************************************************/
 /*  Patron match: Recorre elemento a elemento de una lista. Divide la lista en 2 ( head y tail)*/
/*  The double colon (::) is the cons operator; x represents the head of the list, and xs the tail*/
/*  El caracter _ funciona como un wildcard o comodin
* */
/*********************************************************************************************/


/*P04: Calcular el tamaño de una lista. Metodo Length*/

object P04 extends App{
  
  
  val tam1:Int = P04.getTamano1(List("a", "b", "c", "d"));
  val tam2:Int = P04.getTamano2(List("a", "b", "c", "d"));
  val tam3:Int = P04.getTamanoRecursivo(List("a", "b", "c", "d"));
  
  println(tam1);
  println(tam2);
  println(tam3);
  
  
  
   
   //Funcion que obtiene el ultimo elemento de una lista de tipo generico
  def getTamano1(list: List[String]): Int = {
    list.size;
  }
  
  def getTamano2(list: List[String]):Int = {
    
   list.map(_ =>1).sum; 
  }
  

  
  def getTamanoRecursivo(list:List[String]):Int={
    
    
    def getLengthRec(list:List[String], tam:Int):Int= list match {
      
      case x::xs => getLengthRec(xs,tam+1);
      case Nil => tam
    }
    
    getLengthRec(list,0);
    
  }
  
  
  

  
  
  
  
  
  
  
    
  
  
  
 
  
}