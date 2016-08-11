package ejemplos.traits

/*Clase1 hereda de Trait1. 
 * Tiene que implementar todos los metodos que no esten ya implementados en el Trait
 * Si no los implementa, hay que definir la clase como abstracta
 * Una clase puede extender de una sola clase o de un solo trait con la palabra "extends"
 * Para extender de multiples clases o multiples traits se usa la palabra "with"
 * */

class Clase1 extends Trait1 with Trait2 {

  def metodo1(x: Any): Boolean = {
    return false;
  }

  def metodo2(x: Any): String = { return "Hola Mundo" }

  def metodo3(x: Any): Int = { return 0 }

  def metodo5(x: Any): Boolean = { return true }

  def metodo6(x: Any): String = "String sin return"

  def metodo7(x: Any): Int = 10

}