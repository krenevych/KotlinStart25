package oop_inheritance

import oop_inheritance.Person

class Student(
    name: String = "",
    lastName: String = "",
    age: Int = 0,
    var speciality: String,
    var year: Int,
) : Person(name, lastName, age),  // наслідується від Person
//    CustomClass, // множинне наслідування у Котлін заборонене
    MyInterface   // реалізує інтерфейс MyInterface
{

    override fun showInfo() {
        super.showInfo()
//        println("name='$name', lastName='$lastName', age=$age")
        println("speciality='$speciality', year='$year'")
    }

    override fun showFullInfo() {
        showInfo()
    }

    override fun foo() {
        println("foo")
    }

    override fun bar() {
        println("bar")
    }

}