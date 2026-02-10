fun main(){
    println("Hello World")
    println(name("Elina", "Krein"))
    val array = arrayOf(1,2,3,4,5)
    val phone1 = myPhone("Xiaomi","Redmi Note 12 Pro Plus 5G",2,"blue", 220.5)
    phone1.increaseAge()
    phone1.changeColor("red")
    phone1.outputInfo()

}
fun name(firstName:String, lastName:String):String{
    return "My Name ist $firstName $lastName"
}
class myPhone(var brand:String, var model:String, var age:Int, var color:String, var cost:Double){
    fun outputInfo(){
        println("$brand $model, $age years old, $color, $cost€")
    }
    fun increaseAge(){
        ++age
    }
    fun changeColor(color:String){
        this.color= color
    }
}