package o;

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
/* renamed from: o.aR1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC5087aR1 {
    Class<?>[] value();
}
