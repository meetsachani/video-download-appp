package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.jetbrains.annotations.NonNls;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
/* renamed from: o.nY0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC8295nY0 {
    @NonNls
    String prefix() default "";

    @NonNls
    String suffix() default "";

    @NonNls
    String value();
}
