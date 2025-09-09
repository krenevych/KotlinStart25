package dataclasses

class Person1(
    var name: String,
    var lastName: String,
    var age: Int
) {

    fun copy(name1: String = name,
             lastName1: String = lastName,
             age1: Int = age): Person1{

        return Person1(name1, lastName1, age1)
    }

    operator fun component1(): String {
        return name
    }

    operator fun component2(): String {
        return lastName
    }

    operator fun component3(): Int {
        return age
    }

    override fun toString(): String {
        return "Person(name='$name', lastName='$lastName', age=$age)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Person1

        if (age != other.age) return false
        if (name != other.name) return false
        if (lastName != other.lastName) return false

        return true
    }

    override fun hashCode(): Int {
        var result = age
        result = 31 * result + name.hashCode()
        result = 31 * result + lastName.hashCode()
        return result
    }
}