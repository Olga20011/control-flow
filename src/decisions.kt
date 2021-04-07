fun main() {
    oddNumbers()
     names("Esther","Olga","Arthur","Beth")
    robot(3)
    robot(8)
    robot(20)
    fiz()

}
fun oddNumbers() {
    for (x in 1..100) {
        if (x%2!=0){
            println(x)
    }
}
    }
fun names(nam1:String,nam2:String,nam3:String,nam4:String):Array<String>{
    var x = arrayOf(nam1, nam2, nam3, nam4)
    for (i in x)
        if (i.length > 5) {
            println(i)

        }

    return(x)
}
fun robot(age:Int) {
    if (age < 6) {
        println("Milk")


    } else if (age < 15 && age > 6) {
        println("Fanta")
    } else {
        println("cocacola")
    }
}
fun fiz () {
    for (i in 1..100)
        if (i%3 == 0) {
            println("Buzz")
        }

    for  (i in 1..100) {
        if (i%5==0)
        println("Buzz")
    }
    for (i in 1..100){
    if (i%3==0 && i%5==0)
        println("FizzBuzz")
    }
}


