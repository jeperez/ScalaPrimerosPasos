package colecciones.ejemplos

object E06 {

  def main(args: Array[String]) {

    //Aunque no se defina el tipo, es una lista de enteros
    var lista = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
    
    var listaCadena = List("afac", "bca", "cda", "dab", "e", "fbag", "gadbc");

 

    //Filtra los elementos superiores a 5
    var filtro = lista.filter { x => x > 5 };
    println(filtro);
    
    //Filtra los elementos superiores a 2 usando el caracter _
    var filtro2 = lista.filter { _ > 2 }
    println(filtro2);
    
    //Filtra los elementos pares
    var filtro3 = lista.filter { _ % 2 == 0 }
    println(filtro3)
    
    //Filtra los elementos aplicando funcion startsWith
    var filtro4 = listaCadena.filter ( _.startsWith("a") )
    println(filtro4)
    
     //Filtra los elementos aplicando funcion length
    var filtro5 = listaCadena.filter ( _.length()>2 )
    println(filtro5)
    
    
    
    

  

  }

}