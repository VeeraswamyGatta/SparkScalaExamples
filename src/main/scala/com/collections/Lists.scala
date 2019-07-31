package com.collections

object Lists {

  val mylist: List[Int] = List(1,2,5,8,9,6,4);
  val names: List[String] = List("Max", "Tom", "John");

  val lst = List(1, 2, 3, 5, 7, 10, 13)
  val lst2 = List("A", "B", "C")

  def main(args: Array[String]) {
    println(0 :: mylist);
    println(mylist);
    println(names);
    println(1 :: 5:: 9 :: Nil);
    println(mylist.head);
    println(names.tail);
    println(mylist.tail);
    println(names.isEmpty);
    println(mylist.reverse);
    println(List.fill(5)(2));
    println(mylist.max);

    mylist.foreach( println )
    var sum : Int = 0;
    mylist.foreach(sum += _);
    println(sum);

    for (name <- names) {
      println(name);
    }

    println(names(0));

  }

  println(lst.reduceLeft(_ + _));
  println(lst2.reduceLeft(_ + _));
  println(lst.reduceLeft((x,y) => {println(x + " , "+ y); x+y;}));

  println(lst.reduceLeft(_ - _));
  println(lst.reduceRight(_ - _));
  println(lst.reduceRight((x,y) => {println(x + " , "+ y); x-y;}));


  println(lst.foldLeft(100)(_ + _));
  println(lst2.foldLeft("z")(_ + _));


  println(lst.scanLeft(100)(_ + _));
  println(lst2.scanLeft("z")(_ + _));


}
