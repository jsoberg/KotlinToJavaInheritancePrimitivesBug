package com.soberg.example.primitive;

/** Errors when the type is primitive: forced override of [methodWithType] even though the method is final and shouldn't be overridden. */
public class ChildPrimitiveJavaClass extends AbstractPrimitiveKotlinClass {

    @Override
    public void methodWithType(Boolean value) {

    }
}
