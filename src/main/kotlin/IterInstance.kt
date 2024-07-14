package com.study

class IterInstance {
    fun iterator(): Iterator<String> {
        val numbers = listOf("one", "two", "three", "four")
        return numbers.iterator()
    }
}