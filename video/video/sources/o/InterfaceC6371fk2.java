package o;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Hv2(applicableTo = CharSequence.class)
/* renamed from: o.fk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC6371fk2 {
    String value();

    MK2 when() default MK2.ALWAYS;
}
