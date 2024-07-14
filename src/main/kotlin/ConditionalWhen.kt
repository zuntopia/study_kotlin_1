package com.study

import RunSwitch

class ConditionalWhen {
    fun runWhenByValue(n: Int){
        when {
            n in 1..3 -> println("number with ${n}")
            else -> println("number with others")
        }
    }

    fun callSwitchFromJava(n: Int){
        val rs = RunSwitch()
        rs.runSwitchByValue(n)
    }

//    fun runSwitchByValue(n: Int){
//        switch(n){
//        }
//    }
}