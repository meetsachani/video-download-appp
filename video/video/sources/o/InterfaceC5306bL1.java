package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.bL1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC5306bL1 {
    String[] stringPatterns() default {};

    EnumC11094z11[] value() default {};
}
