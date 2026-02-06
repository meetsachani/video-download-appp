package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@InterfaceC7780lU1(EnumC7796la.Y)
@Documented
@Retention(RetentionPolicy.CLASS)
@InterfaceC2968Fm1
@InterfaceC2758Dl2(allowedTargets = {EnumC8057ma.d1, EnumC8057ma.e1, EnumC8057ma.f1, EnumC8057ma.b1, EnumC8057ma.Z0, EnumC8057ma.a1, EnumC8057ma.Y})
/* renamed from: o.Av0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC2501Av0 {
    double from() default Double.NEGATIVE_INFINITY;

    boolean fromInclusive() default true;

    double to() default Double.POSITIVE_INFINITY;

    boolean toInclusive() default true;
}
