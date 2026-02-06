package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@InterfaceC9932uF1(qualifier = InterfaceC9884u31.class)
/* renamed from: o.iI0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC7004iI0 {
    String[] value();
}
