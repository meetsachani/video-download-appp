package o;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Hv2(applicableTo = Number.class)
/* renamed from: o.kr1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC7623kr1 {

    /* renamed from: o.kr1$a */
    /* loaded from: classes3.dex */
    public static class a implements Kv2<InterfaceC7623kr1> {
        @Override // o.Kv2
        /* renamed from: b */
        public MK2 a(InterfaceC7623kr1 interfaceC7623kr1, Object obj) {
            if (!(obj instanceof Number)) {
                return MK2.NEVER;
            }
            Number number = (Number) obj;
            if (!(number instanceof Long) ? !(!(number instanceof Double) ? !(number instanceof Float) ? number.intValue() >= 0 : number.floatValue() >= 0.0f : number.doubleValue() >= 0.0d) : number.longValue() < 0) {
                return MK2.NEVER;
            }
            return MK2.ALWAYS;
        }
    }

    MK2 when() default MK2.ALWAYS;
}
