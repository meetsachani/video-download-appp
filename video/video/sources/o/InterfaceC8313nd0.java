package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@FJ(qualifier = InterfaceC4325Tj1.class)
@CP0
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.nd0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC8313nd0 {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @FJ(qualifier = InterfaceC4325Tj1.class)
    @CP0
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: o.nd0$a */
    /* loaded from: classes4.dex */
    public @interface a {
        InterfaceC8313nd0[] value();
    }

    String[] expression();

    boolean result();

    @InterfaceC5063aL1("value")
    int targetValue() default 0;
}
