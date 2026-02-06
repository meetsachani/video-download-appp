package o;

import java.util.function.Predicate;
import java.util.stream.Stream;

/* renamed from: o.Jb2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC3317Jb2 implements Z10 {
    OVERRIDE_READ_ONLY;

    public static /* synthetic */ boolean e(Z10 z10) {
        if (OVERRIDE_READ_ONLY == z10) {
            return true;
        }
        return false;
    }

    public static boolean h(Z10[] z10Arr) {
        if (C7743lL0.u0(z10Arr) == 0) {
            return false;
        }
        return Stream.of((Object[]) z10Arr).anyMatch(new Predicate() { // from class: o.Ib2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EnumC3317Jb2.e((Z10) obj);
            }
        });
    }
}
