package o;

import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.g40  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6462g40 {
    public C6462g40() {
        throw new UnsupportedOperationException();
    }

    public static JG0 a(JG0 jg0) {
        if (b(jg0)) {
            return JG0.a(jg0.d(), jg0.c(), 70.0d);
        }
        return jg0;
    }

    public static boolean b(JG0 jg0) {
        boolean z;
        boolean z2;
        boolean z3;
        if (Math.round(jg0.d()) >= 90.0d && Math.round(jg0.d()) <= 111.0d) {
            z = true;
        } else {
            z = false;
        }
        if (Math.round(jg0.c()) > 16.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (Math.round(jg0.e()) < 65.0d) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }
}
