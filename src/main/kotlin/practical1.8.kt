open class person(var mobileno:Int){
    var address:String=""

    constructor(mno:Int,add:String):this(mno){
        this.address=add
        this.mobileno=mno
    }

}

class student(var enno:Int,var name:String)
{
    constructor(): this(82,"dev"){
    }
}
fun main(){
    var s1=student()

    println(s1.enno)
    println(s1.name)

}

