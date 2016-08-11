package ejemplos.colecciones

object E01 {
  
  def main(args: Array[String]) {
    
    
    //Aunque no se defina el tipo, es una lista de enteros
    var lista = List(1,2,3);  
    //print(lista.toString());
    
    //Listas genericas
    var listaEnteros:List[Int] = List(1,2,3);
    
    //Concatenar
    var listaConcatenada = 1 :: 2 :: 3 :: 4 :: Nil;
    //print(listaConcatenada);
   
    //Concatenar con parentesis
    var listaConcatenada2 = 1 :: (2 :: (3 :: Nil));
    //print(listaConcatenada2);
    
    //Concatenar listas
    
    var listaConcatenada3 = List(1,2,3,4,5,6,7,8,9) ::: List(10);
    //print(listaConcatenada3);
    
   
    
    
    
    
  }
  
}