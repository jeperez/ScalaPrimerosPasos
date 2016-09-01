package ejemplos.funciones

/*
   * Funcion anonima o Funcion Lambda: Son funciones sin nombre.
   * Se representan asi: (parametros) => accion
   * Se pueden guardar en variables. 
   * */

object E01 {

  //Ejemplo funcion Anonima que es pasada como parametro e invocada cada segundo.
  def metodo1(repite: () => Unit) {
    var i: Int = 0
    while (i < 3) {
      repite();
      Thread sleep 1000
      i = i + 1
    }
  }

  def main(args: Array[String]) {
    metodo1(() => println("mensaje cada segundo"))

    //Ejemplo de funcion anonima guardada como variable e invocada despues
    val metodo2 = (x: Int) => x + 1
    println(metodo2(10))

    //Ejemplo de funcion anonima guardada como variable y con N argumentos
    val metodo3 = (x: Int, y: Int) => x + y
    println(metodo3(10, 20))

    //Ejemplo funcion anonima como parametro en otra funcion
    val filterLista = (predicate: Int => Boolean, xs: List[Int]) => {
      for (x <- xs; if predicate(x)) yield x
    }

    var lista = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var pares = (x: Int) => x % 2 == 0
    var impares = (x: Int) => x % 2 == 1
    filterLista(pares, lista)
    filterLista(impares, lista)
  }

}