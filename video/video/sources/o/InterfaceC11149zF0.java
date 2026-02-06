package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.CLASS)
@InterfaceC10420wF0
/* renamed from: o.zF0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC11149zF0 {
    String value() default "";
}
