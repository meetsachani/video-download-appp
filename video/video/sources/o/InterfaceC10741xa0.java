package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* renamed from: o.xa0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC10741xa0 {
    String prefix() default "";
}
