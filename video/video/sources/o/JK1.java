package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface JK1 {

    /* loaded from: classes4.dex */
    public enum a {
        SIDE_EFFECT_FREE,
        DETERMINISTIC
    }
}
