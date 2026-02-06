package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
/* renamed from: o.zJ1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC11166zJ1 {
    String value() default "";
}
