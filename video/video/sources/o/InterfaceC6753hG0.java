package o;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.PACKAGE})
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.hG0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC6753hG0 {
    Class<? extends Annotation>[] value();
}
