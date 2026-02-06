package o;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Hv2
/* loaded from: classes3.dex */
public @interface CJ1 {
    MK2 when() default MK2.ALWAYS;
}
