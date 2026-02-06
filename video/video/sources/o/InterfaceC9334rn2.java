package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* renamed from: o.rn2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public @interface InterfaceC9334rn2 {
    public static final String P1 = "UI";
    public static final String Q1 = "ANY";

    String value();
}
