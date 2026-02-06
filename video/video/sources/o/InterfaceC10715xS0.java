package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o.JS1;

@Target({ElementType.TYPE})
@JS1(level = JS1.a.X, message = "This is a kotlinx.coroutines API that is not intended to be inherited from, as the library may handle predefined instances of this in a special manner. This will be an error in a future release. If you need to inherit from this, please describe your use case in https://github.com/Kotlin/kotlinx.coroutines/issues, so that we can provide a stable API for inheritance. ")
@Retention(RetentionPolicy.RUNTIME)
@InterfaceC2758Dl2(allowedTargets = {EnumC8057ma.X})
/* renamed from: o.xS0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC10715xS0 {
}
