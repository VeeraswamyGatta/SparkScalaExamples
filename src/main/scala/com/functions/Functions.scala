package com.functions

object Functions {

  /*object Math {
    def +(x: Int, y: Int): Int = {
      return x + y;
    }
    def **(x: Int) = x*x;
  }

  def print(x: Int, y : Int): Unit = {
    println(x+y);
  }

  def main(args: Array[String]) {

    var add = (x : Int, y : Int) => x + y;
    println(add(300, 500));
    val sum = 10 * 20;
    print(100, 200);
    println(Math.+(60, 15));
    println(Math ** 3);
  }*/

  /*
  OUTPUT:
  800
  300
  75
  9

  */

  object Math {
    def add(x: Int, y: Int): Int = {
      return x + y;
    }
    def square(x: Int) = x*x;
  }
  def add(x: Int, y: Int): Int = {
    return x + y;
  }
  def subtract(x: Int, y: Int): Int = {
    x - y;
  }
  def multiply(x: Int, y: Int): Int = x * y;

  def divide(x: Int, y: Int) = x / y;

  def main(args: Array[String]) {
    println(Math.add(45,15));
    println(Math square 3);
    println(add(45, 15));
    println(subtract(45, 15));
    println(multiply(45, 15));
    println(divide(45, 15));
  }
  /*
output:
60
9
60
30
675
3

*/
}
