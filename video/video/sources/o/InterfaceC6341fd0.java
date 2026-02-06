package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@FJ(qualifier = InterfaceC3875Ot.class)
@CP0
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.fd0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC6341fd0 {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @FJ(qualifier = InterfaceC3875Ot.class)
    @CP0
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: o.fd0$a */
    /* loaded from: classes4.dex */
    public @interface a {
        InterfaceC6341fd0[] value();
    }

    String[] expression();

    @InterfaceC5063aL1("value")
    String[] methods();

    boolean result();
}
