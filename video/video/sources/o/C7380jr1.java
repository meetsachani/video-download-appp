package o;

import java.io.Serializable;
import java.util.Collection;

/* renamed from: o.jr1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7380jr1 implements JF1, NF1, Serializable {
    private static final long serialVersionUID = 2007613066565892961L;
    public final JF1[] X;

    public C7380jr1(JF1[] jf1Arr) {
        this.X = jf1Arr;
    }

    public static JF1 b(Collection collection) {
        JF1[] h = SB0.h(collection);
        if (h.length == 0) {
            return Gu2.X;
        }
        return new C7380jr1(h);
    }

    public static JF1 c(JF1[] jf1Arr) {
        SB0.f(jf1Arr);
        if (jf1Arr.length == 0) {
            return Gu2.X;
        }
        return new C7380jr1(SB0.c(jf1Arr));
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
                if (jf1Arr[i].evaluate(obj)) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }
}
