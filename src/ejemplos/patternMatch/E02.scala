package ejemplos.pattern_matching

object E02 {

  def main(args: Array[String]) {

    //Pattern Match contra una lista usando funcion head
    // [1,2,3,4] --> 
    //x = [1], xs = [2,3,4]
    //Funcion head --> obtiene el primero de la lista
    //Funcion tail --> Obtiene la cola de la lista

    val ejemploMatchList = List(1, 2, 3, 4) match {
      case x :: xs => xs.head
      case _       => 0
    }

    println(ejemploMatchList);

    val ejemploMatchList2 = List(1, 2, 3, 4) match {
      case x :: xs => xs.tail
      case _       => 0
    }

    println(ejemploMatchList2)

    // [1,2,3,4] --> 
    //x = [1], y = [2],  xs = [3,4]
    val ejemploMatchList3 = List(1, 2, 3, 4, 5, 6, 7) match {
      case x :: y :: xs ⇒ y
      case _            ⇒ 0
    }

    println(ejemploMatchList3)

  }

}