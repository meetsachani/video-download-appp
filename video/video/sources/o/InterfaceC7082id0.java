package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@FJ(qualifier = InterfaceC9514sX0.class)
@CP0
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.id0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC7082id0 {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @FJ(qualifier = InterfaceC9514sX0.class)
    @CP0
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: o.id0$a */
    /* loaded from: classes4.dex */
    public @interface a {
        InterfaceC7082id0[] value();
    }

    String[] expression();

    @InterfaceC11209zU0
    @InterfaceC5063aL1("value")
    String[] map();

    boolean result();
}
