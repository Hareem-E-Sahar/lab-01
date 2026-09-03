package com.example.petshop

class Cat(name:String, age:Int) : Pet(name,age), Pettable {
    override fun speak(): String {
        return  "meow"
    }

    override fun pet() {
        println("this is a pettable cat $name")
    }

}