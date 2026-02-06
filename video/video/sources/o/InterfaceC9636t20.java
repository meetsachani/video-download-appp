package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@InterfaceC2968Fm1
@InterfaceC2758Dl2(allowedTargets = {EnumC8057ma.X, EnumC8057ma.d1, EnumC8057ma.Y0, EnumC8057ma.Y, EnumC8057ma.c1, EnumC8057ma.f1, EnumC8057ma.e1, EnumC8057ma.j1})
@InterfaceC6480g82(version = "1.4")
/* renamed from: o.t20  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC9636t20 {
    String errorSince() default "";

    String hiddenSince() default "";

    String warningSince() default "";
}
