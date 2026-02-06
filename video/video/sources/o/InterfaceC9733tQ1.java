package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.jetbrains.annotations.NonNls;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
@InterfaceC8295nY0("RegExp")
/* renamed from: o.tQ1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC9733tQ1 {
    @NonNls
    String prefix() default "";

    @NonNls
    String suffix() default "";
}
