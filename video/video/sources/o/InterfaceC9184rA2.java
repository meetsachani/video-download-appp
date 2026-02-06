package o;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.rA2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC9184rA2 {
    FG1 prefix() default FG1.one;

    Class<? extends Annotation> quantity();
}
