package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* renamed from: o.nQ0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC8267nQ0 {
    Class<?> entity() default Object.class;

    int onConflict() default 3;
}
