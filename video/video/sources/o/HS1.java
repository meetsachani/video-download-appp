package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@InterfaceC9932uF1(qualifier = InterfaceC5185ar1.class)
/* loaded from: classes4.dex */
public @interface HS1 {
    String[] value();
}
