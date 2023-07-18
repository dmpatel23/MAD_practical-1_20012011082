fun main(){
    println("enter a number:")
    var a= readln()!!.toInt()

    if(a % 2 == 0) {
        println("$a number is even")
    }
    else{
        println("$a number is odd")
    }
}