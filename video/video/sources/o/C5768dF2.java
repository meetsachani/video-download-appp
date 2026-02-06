package o;

import java.util.Iterator;
import o.C8068mc2;

/* renamed from: o.dF2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5768dF2 extends C4575Vz {

    /* renamed from: o.dF2$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C8068mc2.a.values().length];
            a = iArr;
            try {
                iArr[C8068mc2.a.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[C8068mc2.a.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[C8068mc2.a.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C5768dF2(C8068mc2 c8068mc2) {
        super(c8068mc2, C8068mc2.d.VERTICAL_CHAIN);
    }

    @Override // o.C9210rH0, o.QK, o.TP1
    public void apply() {
        Iterator<Object> it = this.o0.iterator();
        while (it.hasNext()) {
            this.m0.f(it.next()).y();
        }
        Iterator<Object> it2 = this.o0.iterator();
        QK qk = null;
        QK qk2 = null;
        while (it2.hasNext()) {
            Object next = it2.next();
            QK f = this.m0.f(next);
            if (qk2 == null) {
                Object obj = this.S;
                if (obj != null) {
                    f.H0(obj).e0(this.f589o).g0(this.u);
                } else {
                    Object obj2 = this.T;
                    if (obj2 != null) {
                        f.G0(obj2).e0(this.f589o).g0(this.u);
                    } else {
                        String obj3 = f.getKey().toString();
                        f.H0(C8068mc2.f805o).f0(Float.valueOf(b1(obj3))).h0(Float.valueOf(a1(obj3)));
                    }
                }
                qk2 = f;
            }
            if (qk != null) {
                String obj4 = qk.getKey().toString();
                String obj5 = f.getKey().toString();
                qk.r(f.getKey()).f0(Float.valueOf(Z0(obj4))).h0(Float.valueOf(Y0(obj4)));
                f.G0(qk.getKey()).f0(Float.valueOf(b1(obj5))).h0(Float.valueOf(a1(obj5)));
            }
            float d1 = d1(next.toString());
            if (d1 != -1.0f) {
                f.y0(d1);
            }
            qk = f;
        }
        if (qk != null) {
            Object obj6 = this.V;
            if (obj6 != null) {
                qk.r(obj6).e0(this.p).g0(this.v);
            } else {
                Object obj7 = this.W;
                if (obj7 != null) {
                    qk.q(obj7).e0(this.p).g0(this.v);
                } else {
                    String obj8 = qk.getKey().toString();
                    qk.q(C8068mc2.f805o).f0(Float.valueOf(Z0(obj8))).h0(Float.valueOf(Y0(obj8)));
                }
            }
        }
        if (qk2 != null) {
            float f2 = this.q0;
            if (f2 != 0.5f) {
                qk2.M0(f2);
            }
            int i = a.a[this.w0.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    qk2.x0(2);
                    return;
                }
                qk2.x0(1);
                return;
            }
            qk2.x0(0);
        }
    }
}
