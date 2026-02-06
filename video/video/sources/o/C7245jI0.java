package o;

import java.util.Iterator;
import o.C8068mc2;

/* renamed from: o.jI0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7245jI0 extends C4575Vz {

    /* renamed from: o.jI0$a */
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

    public C7245jI0(C8068mc2 c8068mc2) {
        super(c8068mc2, C8068mc2.d.HORIZONTAL_CHAIN);
    }

    @Override // o.C9210rH0, o.QK, o.TP1
    public void apply() {
        Iterator<Object> it = this.o0.iterator();
        while (it.hasNext()) {
            this.m0.f(it.next()).x();
        }
        Iterator<Object> it2 = this.o0.iterator();
        QK qk = null;
        QK qk2 = null;
        while (it2.hasNext()) {
            Object next = it2.next();
            QK f = this.m0.f(next);
            if (qk2 == null) {
                Object obj = this.O;
                if (obj != null) {
                    f.D0(obj).e0(this.m).g0(this.s);
                } else {
                    Object obj2 = this.P;
                    if (obj2 != null) {
                        f.C0(obj2).e0(this.m).g0(this.s);
                    } else {
                        Object obj3 = this.K;
                        if (obj3 != null) {
                            f.D0(obj3).e0(this.k).g0(this.q);
                        } else {
                            Object obj4 = this.L;
                            if (obj4 != null) {
                                f.C0(obj4).e0(this.k).g0(this.q);
                            } else {
                                String obj5 = f.getKey().toString();
                                f.D0(C8068mc2.f805o).f0(Float.valueOf(b1(obj5))).h0(Float.valueOf(a1(obj5)));
                            }
                        }
                    }
                }
                qk2 = f;
            }
            if (qk != null) {
                String obj6 = qk.getKey().toString();
                String obj7 = f.getKey().toString();
                qk.D(f.getKey()).f0(Float.valueOf(Z0(obj6))).h0(Float.valueOf(Y0(obj6)));
                f.C0(qk.getKey()).f0(Float.valueOf(b1(obj7))).h0(Float.valueOf(a1(obj7)));
            }
            float d1 = d1(next.toString());
            if (d1 != -1.0f) {
                f.v0(d1);
            }
            qk = f;
        }
        if (qk != null) {
            Object obj8 = this.Q;
            if (obj8 != null) {
                qk.D(obj8).e0(this.n).g0(this.t);
            } else {
                Object obj9 = this.R;
                if (obj9 != null) {
                    qk.C(obj9).e0(this.n).g0(this.t);
                } else {
                    Object obj10 = this.M;
                    if (obj10 != null) {
                        qk.D(obj10).e0(this.l).g0(this.r);
                    } else {
                        Object obj11 = this.N;
                        if (obj11 != null) {
                            qk.C(obj11).e0(this.l).g0(this.r);
                        } else {
                            String obj12 = qk.getKey().toString();
                            qk.C(C8068mc2.f805o).f0(Float.valueOf(Z0(obj12))).h0(Float.valueOf(Y0(obj12)));
                        }
                    }
                }
            }
        }
        if (qk2 != null) {
            float f2 = this.q0;
            if (f2 != 0.5f) {
                qk2.a0(f2);
            }
            int i = a.a[this.w0.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    qk2.u0(2);
                    return;
                }
                qk2.u0(1);
                return;
            }
            qk2.u0(0);
        }
    }
}
