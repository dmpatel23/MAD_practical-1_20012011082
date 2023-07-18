fun main(){
    println("Enter a choice:")
    var a= readln()!!.toInt()

    when(a){
        1-> println("january")
        2-> println("february")
        3-> println("march")
        4-> println("april")
        5-> println("may")
        6-> println("june")
        7-> println("july")
        8-> println("august")
        9-> println("september")
        10-> println("october")
        11-> println("november")
        12-> println("december")
        else-> println("enter proper number")

    }
}