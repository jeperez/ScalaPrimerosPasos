package colecciones

/*
 * 
 **********************************************************************
 For en Scala 
 ===================
 Los bucles For normales equivalen en Scala a esto:
 for (i <- 1 to 10) {
  println(i)
}

Los bucles For a partir de Java 5, equivalen en Scala a esto:
for (s <- getList) {
  println(s)
  
ForEach en Scala 
================================
lista.foreach { x => println(x) }
lista.foreach(println(_));
lista.foreach(println);  
  
}

FlatMap 
===========================================================
Construye una nueva lista aplicando una funcion

lista.flatMap(elemento => funcion)
 
 ******************************************************************************   
 * */

/*P07: Dada una lista anidada, generar una unica lista con todos los elementos de la lista anidada*/

object P07 extends App {

  val listaPlana: List[Any] = P07.generarListaPlana(List("A", List("a", "b", "c"), List("d")));
  val listaPlana2: List[Any] = P07.generarListaPlana_FlatMap(List("A", List("a", "b", "c"), List("d")));
  
  println("listaPlana: " +  listaPlana)
  println("listaPlana con FlatMap:" + listaPlana2);

  def generarListaPlana(lista: List[Any]): List[Any] = {

    var result = List[Any]()

    for (x <- lista) {
      x match {
        case xs: List[Any] =>
          result = result ++: generarListaPlana(xs)
        case _ =>
          result = result :+ x
      }
    }
    result

  }
  
  
   def generarListaPlana_FlatMap(list: List[Any]): List[Any] = list.flatMap(el => el match {
    case xs: List[Any] => generarListaPlana_FlatMap(xs)
    case _ => List(el)
  })
  

}