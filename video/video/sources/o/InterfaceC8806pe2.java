package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE})
@InterfaceC7780lU1(EnumC7796la.X)
@Retention(RetentionPolicy.SOURCE)
@InterfaceC2758Dl2(allowedTargets = {EnumC8057ma.Y})
/* renamed from: o.pe2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC8806pe2 {
    boolean open() default false;

    String[] value() default {};
}
