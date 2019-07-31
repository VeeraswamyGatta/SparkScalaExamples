package com.constructors


/*Scala Auxiliary Constructor Rules

In Scala Programming, we need to follow these rules to define Auxiliary Constructors:

Like Methods, Auxiliary Constructors are defined by using “def” keyword.
Like Method Overloading, All Auxiliary Constructors should use same name: “this”.
Each Auxiliary Constructor must have a different signature i.e. Different Parameters list.
Each Auxiliary Constructor must call a previously defined constructor: it may be either Primary Constructor or Auxiliary Constructors. This call should be first statement in that Constructor.
One Auxiliary Constructor calls Primary Constructor or another Auxiliary constructors by using “this” name.*/

object Employee1Test1 extends App{
  val emp1 = new Employee1()
}


object Employee1Test2 extends App{
  val emp2 = new Employee1(1001, "Scala")
}
