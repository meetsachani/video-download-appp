package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
/* renamed from: o.ai  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC5147ai {
    Class<? extends Enum<?>> value();
}
