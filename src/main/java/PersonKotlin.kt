package com.fish

//不一定要放在com.fish底下
class PersonKotlin {
    //什麼都沒有寫就是public
    fun greeting(){//fun(function) 旁邊就是方法
        println("hello kotlin")
    }
}
//Top-level
//main變成和類別同層級
fun main(){
    val p =PersonKotlin()
    p.greeting()
}