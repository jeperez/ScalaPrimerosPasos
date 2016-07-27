package colecciones

/*
 * 
 **********************************************************************
 Drop borra  hasta la posicion  N
 DropWhile recorre la lista borrando elementos hasta que encuentra un elemento que no cumple la condicion
 ******************************************************************************   
*/

object P_DropWhile extends App {

  var lista: List[Int] = List(1, 2, 3, 4, 5, 6, 6, 6, 3);
  var listaCadena:List[String] = List("Rocio", "Carlos", "Maria", "Raquel", "Pablo");

  //El primer elemento no cumple la condicion. No se sigue ejecutando
  val listaDropWhile1 = lista.dropWhile { _ > 1 }
  println("Ejemplo1:  " + listaDropWhile1)

  //Solo coincide el primer elemento. No cointinua con el resto
  val listaDropWhile2 = lista.dropWhile { _ == 1 }
  println("Ejemplo2:  " + listaDropWhile2)

  //Se cumple la condicion con el primer caso y con el resto. Deja la lista vacia.
  val listaDropWhile3 = lista.dropWhile { x => x > 0 }
  println("Ejemplo3:  " + listaDropWhile3)

  //Borra todo lo que empiece por r
  val listaDropWhile4 =listaCadena.dropWhile { x => x.startsWith("R") }
  println("Ejemplo 4: " + listaDropWhile4);
  
  //Borra los 8 primeros elementos
  val listaDrop1 = lista.drop(8);
  println(listaDrop1);

}