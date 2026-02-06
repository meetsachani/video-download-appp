package o;

import java.io.Serializable;
import java.util.Collection;

/* renamed from: o.wv1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10583wv1 implements JF1, NF1, Serializable {
    private static final long serialVersionUID = -8125389089924745785L;
    public final JF1[] X;

    public C10583wv1(JF1[] jf1Arr) {
        this.X = jf1Arr;
    }

    public static JF1 b(Collection collection) {
        return new C10583wv1(SB0.h(collection));
    }

    public static JF1 c(JF1[] jf1Arr) {
        SB0.f(jf1Arr);
        if (jf1Arr.length == 0) {
            return C8110mn0.X;
        }
        if (jf1Arr.length == 1) {
            return jf1Arr[0];
        }
        return new C10583wv1(SB0.c(jf1Arr));
    }

    @Override // o.NF1
    public JF1[] a() {
        return this.X;
    }

    @Override // o.JF1
    public boolean evaluate(Object obj) {
        int i = 0;
        boolean z = false;
        while (true) {
            JF1[] jf1Arr = this.X;
            if (i < jf1Arr.length) {
                if (jf1Arr[i].evaluate(obj)) {
                    if (z) {
                        return false;
                    }
                    z = true;
                }
                i++;
            } else {
                return z;
            }
        }
    }
}
