package ejemplos.colecciones

object E05 {

  def main(args: Array[String]) {

    //Aunque no se defina el tipo, es una lista de enteros
    var lista = List(1, 2, 3);

    //Foreach
    lista.foreach { x: Int => print(x) };

    //Por inferencia podemos evitar mucha sintaxis del foreach
    lista foreach { x => print(x) };

    

  }

}