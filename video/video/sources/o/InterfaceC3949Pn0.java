package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.Pn0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC3949Pn0 {
    boolean encoded() default false;

    String value();
}
