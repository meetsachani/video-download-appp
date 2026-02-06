package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@SE1(qualifier = IP0.class)
@CP0
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.gd0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC6596gd0 {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @SE1(qualifier = IP0.class)
    @CP0
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: o.gd0$a */
    /* loaded from: classes4.dex */
    public @interface a {
        InterfaceC6596gd0[] value();
    }

    @InterfaceC5063aL1("value")
    String[] fields();

    String[] value() default {"this"};
}
