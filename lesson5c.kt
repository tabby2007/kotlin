//Inheritance is whereby a child obtains the properties and behaviors of another class (parent class)
 open class Animal{
    //Properties
    var name = "Name"

    //behaviors of the animal
    fun walk(){
        println("The animal can walk")
    }

    fun sleep(){
        println("The animal sleeps")
    }
}

//Below class inherits from the super/parent class Animal
class Dog : Animal(){
    fun bark(){
        println("The dog likes barking")
    }
}

fun main(){
    //Create an object
    var myDog = Dog()

    //Accessing the behaviors of a dog
    myDog.bark()
    myDog.sleep()
    myDog.walk()
}