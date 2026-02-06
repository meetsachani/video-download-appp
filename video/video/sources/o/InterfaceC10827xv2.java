package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
/* renamed from: o.xv2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC10827xv2 {
    Class<?>[] value();
}
