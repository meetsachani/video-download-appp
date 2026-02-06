package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER})
@Retention(RetentionPolicy.CLASS)
/* renamed from: o.Lg2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC3533Lg2 {
    String value();
}
