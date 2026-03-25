fun main() {
    //for loop
    //It is used to execute a block of code/statement a number of times until a condition is met

    for(number in 1 .. 10){
        println("The count is: $number")
    }

    println("==================")

    //create a for loop that is able to print 50 to 65
    for(digit in 50 .. 65){
        println("The digit is: $digit")
    }

    println("======================")

    //Research on how to increment on the for loop bu use of steps
    for(count in 20..40 step 2){
         println(count)
        }
    println("======================")

    //Below we find the odd number in the given range
    for(x in 20..40){
        if(x % 2 !=0){
            println(x)
        }
    }
    println("=======================")

    //By use of a for loop, generate the multiplication table for 5 from 1 to 5
    for (a in 1..5){
        val product = a*5
        println("5*$a=$product")
    }
    println("====================")

    //create a program that is able to find the factorial of number 5
    val number = 5
    var factorial = 1

    for (i in 1..number) {
        factorial *= i  
    }

    println("Factorial of $number is $factorial")
}


//Check difference between local variables and global variables