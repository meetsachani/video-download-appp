package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.SOURCE)
/* renamed from: o.wi0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC10530wi0 {
    String value() default "";
}
