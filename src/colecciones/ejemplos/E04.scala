package colecciones.ejemplos

/*
 * 
 **********************************************************************
 Fold (acumulador, valor actual)
 La funcion Fold/FoldLeft/FoldRight tiene 2 parametros. El primero es un valor acumulador. El segundo es un valor actual al aplicar una funcion.
 FoldLeft: aplica la funcion de izquierda a derecha
 FoldRight:aplica la funcion de derecha a izquierda
 ******************************************************************************   
*/

object E04 extends App {

  var lista: List[Int] = List(1, 2, 3, 4);
  
  
  //Con el acumulador 0, aplica la funcion suma a la lista
  var valor1 = lista.fold(0)(_ + _);
  println(valor1);
  
  var valor2 = lista.fold(0)((x,y)=>x+y);
  println(valor2);
  
  //Con el acumulador 0, aplica la funcion suma a la lista de izquierda a derecha
  var valor3 = lista.foldLeft(2)(_ + _);
  println(valor3);
  
  //Con el acumulador 0, aplica la funcion suma a la lista de derecha a izquierda
  var valor4 = lista.foldRight(2)(_ + _);
  println(valor4);
  
  
}