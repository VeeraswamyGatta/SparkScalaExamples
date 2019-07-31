package com.exceptions


object Arithmetic {
  def main(args: Array[String]) {
    try {
      val z = 4/0
    } catch {
      case ex: ArithmeticException => {
        println("Cannot divide a number by zero")
      }
    }
    finally {
      println("This is final block")
    }
  }
}

