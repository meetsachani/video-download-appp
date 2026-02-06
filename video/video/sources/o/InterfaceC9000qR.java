package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Documented
@Repeatable(InterfaceC9249rR.class)
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.qR  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC9000qR {
    String capture() default "";

    Class<? extends AbstractC10113v0> converter() default AbstractC10113v0.class;

    Class<?> elementType();

    String format() default "";

    String locale() default "";

    Class<? extends InterfaceC7846lm1> mapType() default InterfaceC7846lm1.class;

    String position();

    String[] profiles() default {""};

    boolean required() default false;

    String writeLocale() default "";

    boolean writeLocaleEqualsReadLocale() default true;
}
