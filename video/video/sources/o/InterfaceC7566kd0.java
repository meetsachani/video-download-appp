package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o.InterfaceC8148mw2;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@FJ(qualifier = InterfaceC6578gY0.class)
@CP0
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.kd0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC7566kd0 {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @FJ(qualifier = InterfaceC6578gY0.class)
    @CP0
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: o.kd0$a */
    /* loaded from: classes4.dex */
    public @interface a {
        InterfaceC7566kd0[] value();
    }

    String[] expression();

    @InterfaceC11209zU0
    @InterfaceC5063aL1(InterfaceC8148mw2.c.R)
    String[] offset() default {};

    boolean result();

    @InterfaceC11209zU0
    @InterfaceC5063aL1("value")
    String[] targetValue();
}
