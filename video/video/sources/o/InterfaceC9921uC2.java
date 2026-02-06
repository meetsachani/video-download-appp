package o;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
/* renamed from: o.uC2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC9921uC2 {
    Class<?> entity() default Object.class;

    int onConflict() default 3;
}
