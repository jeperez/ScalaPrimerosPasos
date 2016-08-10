package colecciones

/*P06: Comprobar si 2 cadenas son palindromos. Metodo Reverse*/


object P06 extends App {

/************************************************************************************************/  
  
  //Ejemplo 1: Se comprueba si 2 cadenas son palindromos, si son iguales del derechas que del reves. Function Reverse
  val esPalindromo: Boolean = P06.getPalindromo(List("A", "N", "A"));
  println(esPalindromo);
  
  //Ejemplo 2: Se comprueba si 2 cadenas son palindromos. Se utiliza ejercicio P05 
  val esPalindromoRec: Boolean = P06.getPalindromoRec(List(1, 2, 3, 2, 1));
  println(esPalindromoRec);
 
/************************************************************************************************/  
  
  //Funcion palindromo
  def getPalindromo[T](lista: List[T]): Boolean = {

    var listaAlReves: List[T] = lista.reverse;

    if (listaAlReves == lista) {
      return true;
    } else return false;

  }

  //Funcion palindromo recursivo
  def getPalindromoRec[T](lista: List[Int]): Boolean = {

    P05.getReverseRec(lista) == lista;

  }
  
  /*
 * Igualdad en Java y Scala
 * Java tiene == y equals
 * Scala tiene eq, == y equals
 **********************************************************************
    1 equals 2 will return false, as it redirects to Integer.equals(...)
    1 == 2 will return false, as it redirects to Integer.equals(...)
    1 eq 2 will not compile, as it requires both arguments to be of type AnyRef
    new ArrayList() equals new ArrayList() will return true, as it checks the content
    new ArrayList() == new ArrayList() will return true, as it redirects to equals(...)
    new ArrayList() eq new ArrayList() will return false, as both arguments are different instances
    foo equals foo will return true, unless foo is null, then will throw a NullPointerException
    foo == foo will return true, even if foo is null
    foo eq foo will return true, since both arguments link to the same reference
 ******************************************************************************   
 * */
  

}