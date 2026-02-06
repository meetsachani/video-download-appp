package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@SE1(qualifier = InterfaceC9884u31.class)
@CP0
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.ld0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC7809ld0 {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @SE1(qualifier = InterfaceC9884u31.class)
    @CP0
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: o.ld0$a */
    /* loaded from: classes4.dex */
    public @interface a {
        InterfaceC7809ld0[] value();
    }

    String[] value();
}
