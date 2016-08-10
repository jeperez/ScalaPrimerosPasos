package colecciones.ejemplos

/*
 * 
 **********************************************************************
 Funcion Reduce: Reduce los valores de una lista aplicandole la funcion matematica pasada como parametro
 ReduceLeft: Se ejecuta la funcion de izquierda a derecha
 ReduceRight: Se ejecuta la funcion de derecha a izquierda
 ******************************************************************************   
*/

object E03 extends App {

  var lista: List[Int] = List(1, 2, 3, 4);
  
  
  
  val minimo = lista.reduceLeft(_ min _);
  println("Valor minimo: " + minimo);
  
  val maximo = lista.reduce(_ max _)
  println("Valor maximo. " + maximo);
  
  val suma = lista.reduce(_ + _)
  println("Suma: " + suma);
  
  val resta = lista.reduce(_ - _)
  println("Resta: " + resta);
  
  val producto = lista.reduce(_ * _)
  println("Producto: " + producto);
  
  
}