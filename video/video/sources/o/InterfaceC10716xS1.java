package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@InterfaceC7780lU1(EnumC7796la.X)
@Retention(RetentionPolicy.SOURCE)
@InterfaceC2758Dl2(allowedTargets = {EnumC8057ma.X, EnumC8057ma.d1, EnumC8057ma.Y0, EnumC8057ma.c1, EnumC8057ma.j1})
@Repeatable(a.class)
@BR1
@InterfaceC6480g82(version = "1.2")
/* renamed from: o.xS1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC10716xS1 {

    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
    @InterfaceC7780lU1(EnumC7796la.X)
    @CR1
    @Retention(RetentionPolicy.SOURCE)
    @InterfaceC2758Dl2(allowedTargets = {EnumC8057ma.X, EnumC8057ma.d1, EnumC8057ma.Y0, EnumC8057ma.c1, EnumC8057ma.j1})
    /* renamed from: o.xS1$a */
    /* loaded from: classes3.dex */
    public @interface a {
        InterfaceC10716xS1[] value();
    }

    int errorCode() default -1;

    EnumC9879u20 level() default EnumC9879u20.Y;

    String message() default "";

    String version();

    EnumC10959yS1 versionKind() default EnumC10959yS1.X;
}
