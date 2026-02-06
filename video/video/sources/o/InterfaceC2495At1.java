package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PACKAGE})
@Retention(RetentionPolicy.CLASS)
/* renamed from: o.At1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC2495At1 {
    String value();
}
