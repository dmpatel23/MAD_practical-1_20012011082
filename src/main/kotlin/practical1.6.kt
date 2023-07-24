fun main(){
    println("Enter two numbers a and b:")
    var a= readLine()!!.toInt()
    var b= readLine()!!.toInt()

    add(a,b)
    sub(a,b)
    mul(a,b)
    div(a,b)
}

fun add(a:Int,b:Int):Int{
    var c=a+b
    println("sum of $a and $b is:$c")
    return 0
}

fun sub(a:Int,b:Int):Int{
    var d=a-b
    println("sub of $a and $b is:$d")
    return 0
}

fun mul(a:Int,b:Int):Int{
    var e=a*b
    println("mul of $a and $b is:$e")
    return 0
}

fun div(a:Int,b:Int):Int{
    var f=a/b
    println("div of $a and $b is:$f")
    return 0
}
