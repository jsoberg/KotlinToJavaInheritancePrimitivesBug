package com.soberg.example.primitive

import com.soberg.example.BaseInterface

/** Using a Boolean as the primitive, though it should work the same for any Java primitive type. */
abstract class AbstractPrimitiveKotlinClass : BaseInterface<Boolean> {

    final override fun methodWithType(value: Boolean) {
        callThroughForPrimitive()
    }

    abstract fun callThroughForPrimitive()

}