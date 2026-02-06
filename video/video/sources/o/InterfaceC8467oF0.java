package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@InterfaceC7659l00
@JC2(typeKinds = {Av2.BOOLEAN, Av2.BYTE, Av2.CHAR, Av2.DOUBLE, Av2.FLOAT, Av2.INT, Av2.LONG, Av2.SHORT}, types = {String.class})
@InterfaceC5355bZ(typeKinds = {Av2.BOOLEAN, Av2.BYTE, Av2.CHAR, Av2.DOUBLE, Av2.FLOAT, Av2.INT, Av2.LONG, Av2.SHORT}, types = {String.class, Void.class}, value = {Sv2.Y0, Sv2.g1})
@Retention(RetentionPolicy.RUNTIME)
@InterfaceC5389bh2({InterfaceC9202rF0.class})
@Documented
/* renamed from: o.oF0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC8467oF0 {
    @InterfaceC11209zU0
    String[] value() default {};
}
