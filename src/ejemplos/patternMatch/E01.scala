package ejemplos.pattern_matching

object E01 {

  def main(args: Array[String]) {

    //Function que usa patron match para un numero entero 
    def ejemploMatch(x: Int): String = x match {
      case 1 => "Uno"
      case 2 => "Dos"
      case 3 => "Tres"
      case _ => "Cualquiera"
    }

    val valorMatch = ejemploMatch(10)
    println(valorMatch)

    //Funcion que usa pattern match para cualquier elemento (Any)
    def ejemploColores(x: Any) = x match {
      case "255,0,0"   => "Rojo"
      case ("0,255,0") => "Verde"
      case ("0,0,255") => "Azul"
      case _           => "No entiendo"
    }

    val valorMatch2 = ejemploColores("255,0,0")
    println(valorMatch2)

    //Funcion que usa pattern match con 2 variables en la expresion
    def ejemploVariables(i: Int, j: Int) = j match {
      case i ⇒ true
      case _   ⇒ false
    }

    val valorMatch3 = ejemploVariables(3,3)
    println(valorMatch3)
   
    //https://www.scala-exercises.org/std_lib/pattern_matching

  }

}