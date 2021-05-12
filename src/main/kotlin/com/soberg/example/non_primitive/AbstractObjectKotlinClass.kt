package com.soberg.example.non_primitive

import com.soberg.example.BaseInterface

abstract class AbstractObjectKotlinClass : BaseInterface<ExampleObject> {

    final override fun methodWithType(value: ExampleObject) {
        callThroughForObject()
    }

    abstract fun callThroughForObject()

}

class ExampleObject