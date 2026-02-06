package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface XQ1 {
    InterfaceC5832dW0 associateBy() default @InterfaceC5832dW0(Object.class);

    Class<?> entity() default Object.class;

    String entityColumn();

    String parentColumn();

    String[] projection() default {};
}
