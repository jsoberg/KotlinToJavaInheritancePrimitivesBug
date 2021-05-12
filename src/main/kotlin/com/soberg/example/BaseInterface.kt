package com.soberg.example

/** Generically typed interface. */
interface BaseInterface<T> {
    fun methodWithType(value: T)
}