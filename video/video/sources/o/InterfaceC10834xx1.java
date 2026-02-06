package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.xx1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC10834xx1 {
    String value() default "";
}
