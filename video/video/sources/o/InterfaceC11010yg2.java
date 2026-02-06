package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.yg2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public @interface InterfaceC11010yg2 {

    @Target({ElementType.TYPE})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: o.yg2$a */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    @Target({ElementType.TYPE})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: o.yg2$b */
    /* loaded from: classes2.dex */
    public @interface b {
    }

    Class<?>[] modules() default {};
}
