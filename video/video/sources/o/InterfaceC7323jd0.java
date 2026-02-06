package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o.InterfaceC8148mw2;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@SE1(qualifier = InterfaceC6578gY0.class)
@CP0
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.jd0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC7323jd0 {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @SE1(qualifier = InterfaceC6578gY0.class)
    @CP0
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: o.jd0$a */
    /* loaded from: classes4.dex */
    public @interface a {
        InterfaceC7323jd0[] value();
    }

    @InterfaceC11209zU0
    @InterfaceC5063aL1(InterfaceC8148mw2.c.R)
    String[] offset() default {};

    @InterfaceC11209zU0
    @InterfaceC5063aL1("value")
    String[] targetValue();

    @InterfaceC11209zU0
    String[] value();
}
