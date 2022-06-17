package com.fish.com.fish.score

class Student (var name:String,var math:Int,var english:Int){
    //val name = "" //傳進來就不能改變了
    /*var name = " "
    var math = 0
    var english = 0*/
    //init 執行建構子的內容
    /*init{
            println("testing")
    }
     */
    fun print(){
        println("$name\t$math\t$english\t${getAverage()}") //資料直接拿到 $ 經過手續才拿的到${}
    }
    /*fun getAverage():Int{
        return(math+english)
    }*/
    fun getAverage() = (math+english)/2


}

fun main() {
    val stu = Student("Jack",88,57)
    stu.print()
}