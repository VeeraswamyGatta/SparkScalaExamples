object OptionsSomeNone {


  val lst = List(1, 2, 3);
  val map = Map(1 -> "Tom", 2 -> "Max", 3 -> "John");
  val opt : Option[Int] = Some(55);
  def main(args: Array[String]) {
    println(lst.find(_ > 2).getOrElse(0));
    println(map.get(5).getOrElse("No_name_found"));

    println(opt.isEmpty)
    println(opt.get)

  }

}
