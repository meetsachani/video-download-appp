package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE})
@InterfaceC9150r20(message = "This annotation has been replaced by `@RequiresOptIn`", replaceWith = @IR1(expression = "RequiresOptIn", imports = {"androidx.annotation.RequiresOptIn"}))
@InterfaceC7780lU1(EnumC7796la.Y)
@Retention(RetentionPolicy.CLASS)
@InterfaceC2758Dl2(allowedTargets = {EnumC8057ma.Y})
/* renamed from: o.ti0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC9798ti0 {

    /* renamed from: o.ti0$a */
    /* loaded from: classes.dex */
    public enum a {
        WARNING,
        ERROR
    }

    a level() default a.ERROR;
}
