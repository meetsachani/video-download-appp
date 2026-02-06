package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.tV0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC9751tV0 {
    boolean nullSafe() default true;

    Class<?> value();
}
