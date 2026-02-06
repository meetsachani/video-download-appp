package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
@InterfaceC2758Dl2(allowedTargets = {EnumC8057ma.d1, EnumC8057ma.Z0, EnumC8057ma.c1})
/* loaded from: classes.dex */
public @interface JR1 {
    String expression();

    String[] imports() default {};
}
