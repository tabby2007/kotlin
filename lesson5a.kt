class Person{
    //Attributes/characteristics/properties of a person
    var name = "Tabby"
    var age = 18
    var color = "dark"

    //Behaviors/actions/doables
    fun walk(){
        println("The person can walk")
    }
    fun speak(){
        println("The person can speak")
    }
    fun eat(){
        println("This person eats")
    }
}

fun main(){
    //Objects is a real world thing
    // An object is intanciated/created from/obtained from/emmanated from a class
    // For us to be able to either access the properties/behaviors of a class, we require to have an object

    // Below we create an object
    var myObject = Person()

    //Below we use the dot separator to access either the function or the properties
    myObject.walk()
    myObject.eat()

    println("The age of the person is:"+myObject.age)
    println("The skin color of the person is:"+myObject.color)
}