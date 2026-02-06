package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@SE1(qualifier = InterfaceC3875Ot.class)
/* renamed from: o.ed0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC6098ed0 {
    @InterfaceC5063aL1("value")
    String[] methods();

    String[] value();
}
