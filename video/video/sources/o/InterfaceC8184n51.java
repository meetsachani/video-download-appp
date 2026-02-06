package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.SOURCE)
/* renamed from: o.n51  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC8184n51 {

    /* renamed from: o.n51$a */
    /* loaded from: classes3.dex */
    public enum a {
        JAVA_ITERATOR,
        FAST_ENUMERATION
    }

    a value();
}
