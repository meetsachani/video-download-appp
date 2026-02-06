package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@InterfaceC7780lU1(EnumC7796la.Y)
@Documented
@Retention(RetentionPolicy.CLASS)
@InterfaceC2968Fm1
@InterfaceC2758Dl2(allowedTargets = {EnumC8057ma.Y, EnumC8057ma.d1, EnumC8057ma.e1, EnumC8057ma.f1, EnumC8057ma.c1, EnumC8057ma.Z0, EnumC8057ma.b1})
/* loaded from: classes.dex */
public @interface KS1 {

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    @InterfaceC2758Dl2(allowedTargets = {EnumC8057ma.Z0, EnumC8057ma.d1, EnumC8057ma.e1, EnumC8057ma.f1, EnumC8057ma.b1})
    /* loaded from: classes.dex */
    public @interface a {
        KS1 value() default @KS1;
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    @InterfaceC2758Dl2(allowedTargets = {EnumC8057ma.Z0, EnumC8057ma.d1, EnumC8057ma.e1, EnumC8057ma.f1, EnumC8057ma.b1})
    /* loaded from: classes.dex */
    public @interface b {
        KS1 value() default @KS1;
    }

    String[] allOf() default {};

    String[] anyOf() default {};

    boolean conditional() default false;

    String value() default "";
}
