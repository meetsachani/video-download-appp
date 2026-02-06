package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.jetbrains.annotations.NonNls;

@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
/* renamed from: o.k71  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC7445k71 {
    long[] flags() default {};

    Class<?> flagsFromClass() default void.class;

    long[] intValues() default {};

    @NonNls
    String[] stringValues() default {};

    Class<?> valuesFromClass() default void.class;
}
