package com.rudolfhladik.popkorntest.shared

import cc.popkorn.annotations.Injectable
import cc.popkorn.core.Scope

@Injectable(Scope.BY_USE)
class ControllerA : Controller<String, Int>() {
    override fun produceOutput(input: String): Int = input.length
}
