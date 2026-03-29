fun main() {
    //Below is a function that is able to add two numbers
    fun addition(){
        val number1 = 10
        val number2 = 20
        val sum = number1 + number2

        println("The sum of the numbers: $sum")
    }
    addition()

    println("=============================")

    // create a function that is able to multiply three numbers
    fun multiply(){
        val num1 = 5
        val num2 = 2
        val num3 = 3
        val answer = num1*num2*num3

        println("The answer is:$answer")
    }
    multiply()

    //given two numbers, create a function that is able to find the largest and the smallest of the numbers
    fun findLargestAndSmallest(a: Int, b: Int) {
    if (a > b) {
        println("Largest: $a")
        println("Smallest: $b")
    } else if (b > a) {
        println("Largest: $b")
        println("Smallest: $a")
    } else {
        println("Both numbers are equal: $a")
    }
}

    fun main() {
    findLargestAndSmallest(10, 5)
}

//Given 179 minutes, create a function that is able to convert the said minutes into hours and show the remainder of the minutes
    fun time(){
        val minutes = 179
        val hours = minutes /60
        val minutesremain = minutes % 60
        println("$hours hours $minutesremain minutes")
    }
    time()
}