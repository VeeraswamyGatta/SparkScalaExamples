object StringExample {

 /* def main(args: Array[String]) {
    val name = "Veeraswamy"
    val age = 31.5
    println(name + " is " + age + " years old")

    //s String Interpolator
    println(s"$name is $age years old")
    //f String Interpolator
    println(f"$name%s is $age%f years old")
    println(s"Hello \nworld")
    //raw String Interpolator
    println(raw"Hello \nworld")
  }*/

  val num1 = 75;
  val num2 = 100.25;
  val str1 : String = "Hello World";
  val str2 : String = " Veera";
  def main(args: Array[String]) {
    println(str1.length());
    println(str1.concat(str2));
    println(str1 + str2);

    val result = printf("(%d -- %f -- %s)", num1, num2, str1);
    println(result);
    println("(%d -- %f -- %s)".format(num1, num2, str1));
    printf("(%d -- %f -- %s)", num1, num2, str1);
  }
}
