package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.bI  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public @interface InterfaceC5292bI {

    @Target({ElementType.TYPE})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: o.bI$a */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    @Target({ElementType.TYPE})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: o.bI$b */
    /* loaded from: classes2.dex */
    public @interface b {
    }

    Class<?>[] dependencies() default {};

    Class<?>[] modules() default {};
}
