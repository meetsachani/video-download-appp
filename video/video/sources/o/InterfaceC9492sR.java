package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collection;

@Target({ElementType.FIELD})
@Documented
@Repeatable(InterfaceC9735tR.class)
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.sR  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC9492sR {
    String capture() default "";

    Class<? extends Collection> collectionType() default Collection.class;

    String column() default "";

    Class<? extends AbstractC10113v0> converter() default AbstractC10113v0.class;

    Class<?> elementType();

    String format() default "";

    String locale() default "";

    String[] profiles() default {""};

    boolean required() default false;

    String splitOn() default "\\s+";

    String writeDelimiter() default " ";

    String writeLocale() default "";

    boolean writeLocaleEqualsReadLocale() default true;
}
