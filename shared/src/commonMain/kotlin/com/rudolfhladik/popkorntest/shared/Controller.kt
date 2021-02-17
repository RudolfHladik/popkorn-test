package com.rudolfhladik.popkorntest.shared

// external abstract class that I do not have control over it
abstract class Controller<T,R> {
    abstract fun produceOutput(input: T): R
}
