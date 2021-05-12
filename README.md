# Java Generic primitive inheritance from Kotlin issue

This repository displays an issue when a Java class extends from an abstract Kotlin class, which itself implements an interface using a primitive generic type:

```
BaseInterface<Generic> -> AbstractPrimitiveKotlinClass : BaseInterface<Primitive> -> ChildPrimitiveJavaClass : AbstractKotlinClass
```

The issue is that in `AbstractPrimitiveKotlinClass`, we override the interface's `methodWithType` method that uses the generic parameter and mark it as final. In `ChildPrimitiveJavaClass`, we are forced to override `methodWithType` even though it shouldn't be overridable. If we override this method, it compiles without issue; if we don't override it, however, we get the following compilation error:

```
error: ChildPrimitiveJavaClass is not abstract and does not override abstract method methodWithType(Boolean) in BaseInterface
public class ChildPrimitiveJavaClass extends AbstractPrimitiveKotlinClass {
       ^
```
