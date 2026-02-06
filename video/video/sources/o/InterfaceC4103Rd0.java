package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.Rd0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC4103Rd0 {
    String[] value();
}
