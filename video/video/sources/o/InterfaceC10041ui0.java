package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
@Deprecated
/* renamed from: o.ui0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC10041ui0 {
    @InterfaceC5670cr1
    String value() default "";
}
