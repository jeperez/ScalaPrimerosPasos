package ejemplos.tuplas

object E01 {

  //Tuplas, almacenan objetos de distintos tipos. Son inmutables

  def main(args: Array[String]) {

    //Forma corta de definir una tupla
    val tupla1 = (1, "Pepe", 5000)
    //Acceso a los elementos de una tupla
    println(tupla1._1)
    println(tupla1._2)
    println(tupla1._3)

    //Forma larga de definir una tupla
    val tupla2 = new Tuple3(1, "Pepe", 5000)
    //Acceso a los elementos de una tupla
    println(tupla2._1)
    println(tupla2._2)
    println(tupla2._3)
    
    //Segun el numero de elementos de la Tupla, se llama a un constructor distinto 
    val tupla6 = new Tuple6(1,"2", "3", 4, 5, "Seis")
    
    //Funcion swap : Intercambia los elementos de la tupla
    val tupla3 = (10, "Hola Mundo")
    val tuplaSwap = tupla3.swap
    
    println(tuplaSwap._1)
    println(tuplaSwap._2)
    
    // _ nos permite ignorar elementos de la tupla
    def  getTupla= ("Al", 42, 200.0)
    val(name, age, _) = getTupla
    println(name, age)
    
    //Iterando sobre una tupla 
    val t = (1,2,3,4)
    t.productIterator.foreach { x => println(x) }
    t.productIterator.foreach(println) //Foreach equivalente
    
    
    
    
  }

}