 fun main() {
    //Create an array of 7 counties and loop through them
    val counties = arrayOf("Nairobi","Taita Taveta","Nyeri","Meru","Kisumu","Kwale","Kilifi")

    println("The county on index five is:"+counties[5])
    println("==============================")
    //Create a For loop to print year from 2000 to 2025
    for(year in 2000..2025){
        println(year)
    }
    println("==========================")
    // Create a For loop to print from 100 to 1
    for(number in 100 downTo 1){
        println(number)
    }
    println("===============================")
    //Create a while loop to print from -20 to +20
    var num = 20

    while(num<=-20){
        println(num)
        num++
    }

    println("=============================")
    //Create a while loop to print all EVEN years from 2000 to 2025
    var years = 2000

    while(years<=2025){
        println(years)
        years++2
    }

 }

   //Research on functions with parameters in kotlin
   
    