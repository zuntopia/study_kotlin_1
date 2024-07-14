package com.study

class ConditionalIf {
    fun getMax(a: Int, b: Int): Int{
        if(a > b) return a
        return b
    }
    fun getMaxKt(a: Int, b: Int): Int = if(a>b) a else b
}