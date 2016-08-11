package ejemplos.colecciones

import scala.collection.mutable.MapLike


object E07 {

  def main(args: Array[String]) {

    //Aunque no se defina el tipo, es una lista de enteros
    var lista = List(1, 2, 3);
    //Map a partir de una lista
    println(lista.map { x => x * 2 })
    
    
    
    //Definicion de un Map Inmutable. Este Map no se puede alterar.
    var map1 = Map("S" -> "Santander", "SA" -> "Salamanca")
    var tamMap = map1.size;
    println(map1)
    println("Tamaño del Map: " + tamMap);

    
    //Definicion de un Map Mutable
    var map2 = scala.collection.mutable.Map("S" -> "Santander", "SA" -> "Salamanca")
    
    //Añadimos nuevos elementos al Map Mutable con el operador +
    map2 = map2 + ("M"->"Madrid")   
    
    //Eliminamos elementos con el operador -
    map2 = map2 - ("M")
    println("Map2: " + map2);
    
    //Actualizamos un elemento 
    map2("S") = "SANTANDER"
    
    //Obtenemos todos los valores del map
    println(map2.values)
    //Obtenemos un valor a partir de su clave
    println(map2("S"))
    
    

  }

}