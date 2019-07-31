package com.json


import org.apache.spark.sql.SparkSession;

object CsvSql {



  def main(args: Array[String]) {

    val session = SparkSession.builder().appName("CsvSql").master("local[1]").getOrCreate()

    val employee = session.read
      .option("header", "true")
      .option("inferSchema", value = true)
      .csv("in/employee.csv")



    //create properties object
    val prop = new java.util.Properties
    prop.setProperty("driver", "com.mysql.jdbc.Driver")
    prop.setProperty("user", "root")
    prop.setProperty("password", "password")

    //jdbc mysql url - destination database is named "data"
    val url = "jdbc:mysql://localhost:3306/Big_Data"

    //destination database table
    val table = "employee"

    //write data from spark dataframe to database
    employee.write.mode("append").jdbc(url, table, prop)

  }
}