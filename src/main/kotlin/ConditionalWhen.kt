package com.study

class ConditionalWhen {
    fun runWhenByValue(n: Int){
        when {
            n in 1..3 -> println("number with ${n}")
            else -> println("number with others")
        }
    }

//    fun runSwitchByValue(n: Int){
//        switch(n){
//        }
//    }
}