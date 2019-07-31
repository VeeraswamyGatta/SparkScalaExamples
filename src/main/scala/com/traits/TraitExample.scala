package com.traits


trait Cardetails{
  def details(d:String):String
}

class Cardet extends Cardetails {
  import scala.io.Source
  override def details(source:String) = {
    Source.fromString(source).mkString
  }
}

object car {
  def main(args:Array[String]){
    val c1 = new Cardet
    println(c1.details("Car details are being displayed"))
    println(c1.isInstanceOf[Cardetails])
  }
}
