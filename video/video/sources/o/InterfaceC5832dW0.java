package o;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({})
@Retention(RetentionPolicy.CLASS)
/* renamed from: o.dW0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC5832dW0 {
    String entityColumn() default "";

    String parentColumn() default "";

    Class<?> value();
}
