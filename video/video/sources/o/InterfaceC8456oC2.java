package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.oC2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC8456oC2 {
    double value();
}
