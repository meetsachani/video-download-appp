package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@InterfaceC7659l00
@InterfaceC5389bh2({})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface IP0 {
    String[] value() default {};
}
