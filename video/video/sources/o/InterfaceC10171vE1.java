package o;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.vE1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC10171vE1 {
    Class<? extends Annotation> value() default Annotation.class;
}
