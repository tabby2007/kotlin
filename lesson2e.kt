//When statement
//The when statement in kotlin is like a switch case in other languages. It checks a value against multiple conditions and executes the watching block

fun main (){
    val marks = 70

    when(marks){
        in 1 .. 30 ->println("You failed")
        in 31 .. 50 ->println("You are average")
        in 51 .. 70 ->println("You are above average")
        in 71 .. 100 ->println("You passed")
        else -> println("Invalid score..")
    }
}