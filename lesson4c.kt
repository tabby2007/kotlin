fun main() {
    //functions with parameters
    //parameters are inputs that get passed as arguments when invoking a function
    //Note: For parameters you must specify their data types

    fun greeting(name : String){
        println("Hello $name , Hope you had a good day?")
    }
    //when the function is invoked, you pass a given name as an argument
    greeting("Tabby")
    greeting("Nigel")
    println("===========================")

    //Below is a function that is able to calculate the BMI of a person
    fun BMI(weight:Double, height:Double){
        val answer = weight/(height*height)

        println("The BMI of the person is:"+answer)
    }
    BMI(69.5, 1.73)

    //create a function that accepts parameters and checks whether a given number is odd or even
    fun check(num : Int){
        if (num % 2 == 0){
        println("$num is even")
    }
    else{
        println("$num is odd")
    }
    }
    check(24)

    
}