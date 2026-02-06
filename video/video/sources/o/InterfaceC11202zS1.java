package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.lang.model.element.Modifier;

@Target({ElementType.ANNOTATION_TYPE})
@Documented
@Retention(RetentionPolicy.CLASS)
/* renamed from: o.zS1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC11202zS1 {
    EnumC10539wk1[] modifier() default {};

    @Deprecated
    Modifier[] value() default {};
}
