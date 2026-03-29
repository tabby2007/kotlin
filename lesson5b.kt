//
class Circle{
    //properties
    var radius = 7
    var pie = 3.142

    //Behaviors
    fun circleArea(){
        val areaOfCircle = pie*radius*radius
        println("The area of the circle is:"+areaOfCircle)
    }
    fun circleCircumference(){
        val circumference = 2*pie*radius
        println("The circumference of the circle is:"+circumference)
    }
}

//create a class for a recatngle and find the area as well as the perimeter of the reactangle
class Rectangle{
    //properties
    var length = 12
    var width = 4

    //behaviors
    fun rectangleArea(){
        val areaofRectangle = length*width
        println("The area of the rectangle is:"+areaofRectangle)
    }
    fun rectanglePerimeter(){
        val perimeter = (length+width)*2
        println("The perimeter of the rectangle is:"+perimeter)
    }
}


fun main(){
    //Below is our object
    var myCircle = Circle()

    myCircle.circleArea()
    println("==================")

    var myRectangle = Rectangle()
    myRectangle.rectangleArea()
    myRectangle.rectanglePerimeter()
}