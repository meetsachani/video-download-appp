package o;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({})
@Retention(RetentionPolicy.CLASS)
/* renamed from: o.jP0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC7273jP0 {
    String name() default "";

    boolean unique() default false;

    String[] value();
}
