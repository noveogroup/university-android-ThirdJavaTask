@file:Suppress("PLATFORM_CLASS_MAPPED_TO_KOTLIN")
package com.noveogroup.main

fun main(args: Array<String>) {
    //You can check your solution here.
}

//Kotlin hides wait/notify from developer by default.
fun Any.wait() = (this as java.lang.Object).wait()
fun Any.notifyAll() = (this as java.lang.Object).notifyAll()
fun Any.notify() = (this as java.lang.Object).notify()