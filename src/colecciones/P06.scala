package colecciones

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

/*P04: Calcular el tamaño de una lista. Metodo Length*/

object P06 extends App {

  val esPalindromo: Boolean = P06.getPalindromo(List("A", "N", "A"));
  val esPalindromoRec: Boolean = P06.getPalindromoRec(List(1, 2, 3, 2, 1));

  println(esPalindromo);
  println(esPalindromoRec);

  def getPalindromo[T](lista: List[T]): Boolean = {

    var listaAlReves: List[T] = lista.reverse;

    if (listaAlReves == lista) {
      return true;
    } else return false;

  }

  def getPalindromoRec[T](lista: List[Int]): Boolean = {

    P05.getReverseRec(lista) == lista;

  }

}