package com.study

class ForLoop {
    fun forLoop1(){
        val values = 1..5
        for(v in values){
            println(v)
        }
    }

    fun forLoop2(ins: IterInstance){
        for(item in ins.iterator()){
            println(item)
        }
    }
}