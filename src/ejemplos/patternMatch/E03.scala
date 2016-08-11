package ejemplos.pattern_matching

object E03 {

  def main(args: Array[String]) {

    //Pattern Match con expresiones guard (if dentro del case)
    def ejemploCalculadora(x: Char) = x match {
      case '+'                       => "Suma"
      case '-'                       => "Resta"
      case _ if Character.isDigit(x) => "Digito"
      case _                         => "Cualquiera"
    }

    val valorMatch1 = ejemploCalculadora('9')
    println(valorMatch1)

    def ejemploDigitos(x: Int) = x match {
      case a if 0 to 9 contains a   => "Rango de 0 a 9"
      case b if 10 to 19 contains b => "Rango de 10 a 19"
      case c if 20 to 29 contains c => "Rango de 20 a 29"
      case _                        => "No se"
    }

    val valorMatch2 = ejemploDigitos(15)
    println(valorMatch2)
  }

}
    
    
    //https://www.scala-exercises.org/std_lib/pattern_matching


