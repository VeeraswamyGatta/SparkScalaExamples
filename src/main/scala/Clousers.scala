
/*A closure is a function which uses one or more variables declared outside this function.*/

/*Impure CLousers have daclared type with var type ,it means declared variable can chaange */

/*Pure Clousers have declared with type val type ,it means we cant change the value*/

object Clousers {

  var n=20;  //Impure Clousers
  val number = 10;  //Pure Clousers
  val add = (x : Int) =>  {
    x + number;
  }

  def main(args: Array[String]) {
    println(add(20));
    println(number)
  }
}