package o;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
/* renamed from: o.gi  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC6615gi {

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: o.gi$a */
    /* loaded from: classes3.dex */
    public @interface a {
    }

    @Target({ElementType.TYPE, ElementType.METHOD})
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: o.gi$b */
    /* loaded from: classes3.dex */
    public @interface b {
        Class<? extends Annotation>[] exclude() default {};
    }
}
