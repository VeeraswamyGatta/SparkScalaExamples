package com.constructors


class Employee2(val empId : Int, val empName:String){
  println("From Primary Constructor")
  def this(){
    this(0,null)
    println("From Zero-Argument Auxiliary Constructor")
  }
  def this( empId : Int){
    this(empId, null)
    println("From One-Argument Auxiliary Constructor")
  }
}

