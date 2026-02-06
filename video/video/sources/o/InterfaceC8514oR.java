package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Documented
@Repeatable(InterfaceC8757pR.class)
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.oR  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC8514oR {
    String capture() default "";

    String column() default "";

    Class<? extends AbstractC10113v0> converter() default AbstractC10113v0.class;

    Class<?> elementType();

    String format() default "";

    String locale() default "";

    Class<? extends InterfaceC7846lm1> mapType() default InterfaceC7846lm1.class;

    String[] profiles() default {""};

    boolean required() default false;

    String writeLocale() default "";

    boolean writeLocaleEqualsReadLocale() default true;
}
