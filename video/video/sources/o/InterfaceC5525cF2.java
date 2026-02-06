package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
/* renamed from: o.cF2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC5525cF2 {
    boolean allowSerialization() default false;

    int[] deprecatedIds() default {};

    Class factory() default void.class;

    boolean ignoreParcelables() default false;

    boolean isCustom() default false;

    String jetifyAs() default "";
}
