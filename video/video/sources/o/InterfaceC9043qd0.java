package o;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@CP0
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.qd0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC9043qd0 {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @CP0
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: o.qd0$a */
    /* loaded from: classes4.dex */
    public @interface a {
        InterfaceC9043qd0[] value();
    }

    String[] expression();

    Class<? extends Annotation> qualifier();
}
