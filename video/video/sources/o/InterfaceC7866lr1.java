package o;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Hv2
/* renamed from: o.lr1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC7866lr1 {

    /* renamed from: o.lr1$a */
    /* loaded from: classes3.dex */
    public static class a implements Kv2<InterfaceC7866lr1> {
        @Override // o.Kv2
        /* renamed from: b */
        public MK2 a(InterfaceC7866lr1 interfaceC7866lr1, Object obj) {
            if (obj == null) {
                return MK2.NEVER;
            }
            return MK2.ALWAYS;
        }
    }

    MK2 when() default MK2.ALWAYS;
}
