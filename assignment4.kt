fun main() {
    //create a function that accepts parameter that is able to do the convertion of degrees to farenheit
    fun convert(celsius:Double){
        val temp = (9/5)*celsius + 32
        println("The temperature is:"+temp)
    }
    convert(32.8)
    println("=======================")

    //create a function that is able to calculate the compound interest of a person
    fun interest(p:Int,r:Double,n:Double,t:Double){
        val answ=(p*(1+r/n)*(1+r/n))
        println("The compound interest is:"+answ)
    }
    interest(12000,0.12,1.5,2.5)
    println("==========================")

    //Research on inheritance in kotlin. Come up with an example of the program
    //Inheritance allows one class to acquire functions from another class
     

}