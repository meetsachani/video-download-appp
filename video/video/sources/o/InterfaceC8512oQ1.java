package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.PACKAGE})
@Retention(RetentionPolicy.CLASS)
/* renamed from: o.oQ1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC8512oQ1 {

    /* renamed from: o.oQ1$a */
    /* loaded from: classes3.dex */
    public enum a {
        NATIVE_ONLY,
        FULL
    }

    a value();
}
