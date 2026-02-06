package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o.JS1;

@Target({ElementType.TYPE})
@JS1(level = JS1.a.X, message = "Inheriting from this kotlinx.coroutines API is unstable. Either new methods may be added in the future, which would break the inheritance, or correctly inheriting from it requires fulfilling contracts that may change in the future.")
@Retention(RetentionPolicy.RUNTIME)
@InterfaceC2758Dl2(allowedTargets = {EnumC8057ma.X})
/* renamed from: o.Ji0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC3343Ji0 {
}
