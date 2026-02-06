package o;

import java.io.Serializable;
import java.util.Collection;

/* renamed from: o.v8  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10145v8 implements JF1, NF1, Serializable {
    private static final long serialVersionUID = -3094696765038308799L;
    public final JF1[] X;

    public C10145v8(JF1[] jf1Arr) {
        this.X = jf1Arr;
    }

    public static JF1 b(Collection collection) {
        JF1[] h = SB0.h(collection);
        if (h.length == 0) {
            return Gu2.X;
        }
        if (h.length == 1) {
            return h[0];
        }
        return new C10145v8(h);
    }

    public static JF1 c(JF1[] jf1Arr) {
        SB0.f(jf1Arr);
        if (jf1Arr.length == 0) {
            return Gu2.X;
        }
        if (jf1Arr.length == 1) {
            return jf1Arr[0];
        }
        return new C10145v8(SB0.c(jf1Arr));
    }

    @Override // o.NF1
    public JF1[] a() {
        return this.X;
    }

    @Override // o.JF1
    public boolean evaluate(Object obj) {
        int i = 0;
        while (true) {
            JF1[] jf1Arr = this.X;
            if (i < jf1Arr.length) {
                if (!jf1Arr[i].evaluate(obj)) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }
}
