package ejemplos.traits


/*Un Trait es similar a una interface de Java con algunas diferencias
 * Puede implementar metodos
 * 
 * */


trait Trait1 {

  def metodo1(x: Any): Boolean
  def metodo2(x:Any):String
  def metodo3(x:Any):Int
  
  def metodo4 { println("Soy el metodo 4") }

}