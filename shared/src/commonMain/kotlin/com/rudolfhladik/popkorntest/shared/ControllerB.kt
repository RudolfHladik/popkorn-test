package com.rudolfhladik.popkorntest.shared

import cc.popkorn.annotations.Injectable
import cc.popkorn.core.Scope

@Injectable(Scope.BY_USE)
class ControllerB : Controller<Int, String>() {
    override fun produceOutput(input: Int): String = input.toString()
}
