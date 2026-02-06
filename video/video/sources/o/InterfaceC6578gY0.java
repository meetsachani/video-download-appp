package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@InterfaceC5389bh2({InterfaceC6323fY0.class})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.gY0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC6578gY0 {
    @InterfaceC11209zU0
    String[] offset() default {};

    @InterfaceC11209zU0
    String[] value();
}
