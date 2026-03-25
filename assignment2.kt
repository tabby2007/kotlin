//Research on the looping structures in kotlin
//How to create an array
//1. Using if statements or when statement, create a program to find if given year is leap or not 2. Using if statements check if a given number is ODD or Even
// fun main() {
fun main() {
    val year = 2024

    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        println("$year is a Leap Year")
    } else {
        println("$year is NOT a Leap Year")
    }
}

//Looping structures in kotlin
//for loop
fun main() {
    for (i in 1..5) {
        println(i)
    }
}
//while loop
fun main() {
    var i = 1

    while (i <= 5) {
        println(i)
        i++
    }
}