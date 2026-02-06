package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Documented
@Repeatable(InterfaceC10710xR.class)
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.wR  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC10467wR {
    String capture() default "";

    String column() default "";

    String format() default "";

    String locale() default "";

    String[] profiles() default {""};

    boolean required() default false;

    String writeLocale() default "";

    boolean writeLocaleEqualsReadLocale() default true;
}
