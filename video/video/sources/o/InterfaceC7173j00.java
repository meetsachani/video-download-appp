package o;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PACKAGE, ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER})
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.SOURCE)
/* renamed from: o.j00  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC7173j00 {

    @Target({ElementType.PACKAGE, ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: o.j00$a */
    /* loaded from: classes4.dex */
    public @interface a {
        InterfaceC7173j00[] value();
    }

    Sv2[] locations() default {Sv2.ALL};

    Class<? extends Annotation> value();
}
