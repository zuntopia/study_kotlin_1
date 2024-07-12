package com.study

fun StudyVariables() {
    val popcorn = 5
    var hotdog = 7
    var cola = "cola"

    println(popcorn)

    try {
        hotdog = 10
        println(hotdog)
    } catch (e: Exception) {
        print("error")
    }

    try {
        println(cola)
        cola = "foobar"
        println(cola)
    } catch (e: Exception) {
        println("error")
    }

//    try {
//        hotdog = "foo bar"
//        print(hotdog)
//    } catch (e: Exception) {
//        print("error")
//    }
//
//    try{
//        popcorn = 15
//        print(popcorn)
//    } catch (e: Exception){
//        print("error")
//    }


    val newcorn: String

    try{
        //print(newcorn)
        newcorn = "newCorn"
        print(newcorn)
        //newcorn = "newCorn v2"
    } catch (e: Exception){

    }
}