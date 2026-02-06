package o;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@CP0
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.rd0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC9292rd0 {

    @Target({ElementType.METHOD})
    @CP0
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: o.rd0$a */
    /* loaded from: classes4.dex */
    public @interface a {
        InterfaceC9292rd0[] value();
    }

    String[] expression();

    Class<? extends Annotation> qualifier();

    boolean result();
}
