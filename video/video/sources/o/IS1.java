package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE})
@InterfaceC7780lU1(EnumC7796la.Y)
@Retention(RetentionPolicy.CLASS)
@InterfaceC2758Dl2(allowedTargets = {EnumC8057ma.Y})
/* loaded from: classes.dex */
public @interface IS1 {

    /* loaded from: classes.dex */
    public enum a {
        WARNING,
        ERROR
    }

    a level() default a.ERROR;
}
