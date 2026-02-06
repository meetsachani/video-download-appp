package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
/* loaded from: classes3.dex */
public @interface VP0 {
    String[] imports() default {};

    String replacement();

    String[] staticImports() default {};
}
