package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@InterfaceC2968Fm1
@InterfaceC2758Dl2(allowedTargets = {EnumC8057ma.Y})
/* renamed from: o.Dl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC2758Dl2 {
    EnumC8057ma[] allowedTargets();
}
