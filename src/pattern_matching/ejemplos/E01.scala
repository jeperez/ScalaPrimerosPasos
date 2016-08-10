package pattern_matching.ejemplos

object E01 {

  def main(args: Array[String]) {

    def matchTest(x: Int): String = x match {
      case 1 => "one"
      case 2 => "two"
      case _ => "many"
    }
    println(matchTest(3))

  }

}