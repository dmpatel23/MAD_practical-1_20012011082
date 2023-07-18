fun main(){
    println("enter a number:")
    var a= readLine()!!.toInt()
    var factorial=Factorial(a)
    println("factorial of $a is $factorial")
}

fun Factorial(a:Int):Long{
    if(a>=1){
        return a*Factorial(a-1)
    }
    else{
        return 1
    }
}