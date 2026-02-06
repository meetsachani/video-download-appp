package o;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.co0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC5657co0 {
    String[] field();

    Class<? extends Annotation>[] qualifier();
}
