package com.constructors

/*Each Auxiliary Constructor should call one of the previous defined constructor. An Auxiliary Constructor can call
either Primary Constructor or another Auxiliary constructors by using “this” name.*/


class Employee1(val empId : Int, val empName:String){
  println("From Primary Constructor")
  def this(){
    this(0,null)
    println("From Zero-Argument Auxiliary Constructor")
  }
}

