package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.bZ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC5355bZ {
    String[] names() default {};

    String[] namesExceptions() default {};

    Av2[] typeKinds() default {};

    Class<?>[] types() default {};

    Sv2[] value() default {};
}
