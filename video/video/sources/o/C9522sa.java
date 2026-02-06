package o;

import java.io.Serializable;
import java.util.Collection;

/* renamed from: o.sa  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9522sa implements JF1, NF1, Serializable {
    private static final long serialVersionUID = 7429999530934647542L;
    public final JF1[] X;

    public C9522sa(JF1[] jf1Arr) {
        this.X = jf1Arr;
    }

    public static JF1 b(Collection collection) {
        JF1[] h = SB0.h(collection);
        if (h.length == 0) {
            return C8110mn0.X;
        }
        if (h.length == 1) {
            return h[0];
        }
        return new C9522sa(h);
    }

    public static JF1 c(JF1[] jf1Arr) {
        SB0.f(jf1Arr);
        if (jf1Arr.length == 0) {
            return C8110mn0.X;
        }
        if (jf1Arr.length == 1) {
            return jf1Arr[0];
        }
        return new C9522sa(SB0.c(jf1Arr));
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
            if (i >= jf1Arr.length) {
                return false;
            }
            if (jf1Arr[i].evaluate(obj)) {
                return true;
            }
            i++;
        }
    }
}
