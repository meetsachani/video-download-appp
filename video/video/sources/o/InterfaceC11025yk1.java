package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.yk1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public @interface InterfaceC11025yk1 {
    Class<?>[] includes() default {};

    Class<?>[] subcomponents() default {};
}
