package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@SE1(qualifier = InterfaceC9514sX0.class)
@CP0
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.hd0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC6839hd0 {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @SE1(qualifier = InterfaceC9514sX0.class)
    @CP0
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: o.hd0$a */
    /* loaded from: classes4.dex */
    public @interface a {
        InterfaceC6839hd0[] value();
    }

    @InterfaceC11209zU0
    @InterfaceC5063aL1("value")
    String[] map();

    String[] value();
}
