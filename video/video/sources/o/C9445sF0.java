package o;

import java.util.HashMap;
import o.MK;
import o.UK;

/* renamed from: o.sF0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9445sF0 extends UK {
    public static final int J1 = 0;
    public static final int K1 = 1;
    public static final int L1 = 0;
    public static final int M1 = 1;
    public static final int N1 = 2;
    public static final int O1 = -1;
    public float B1 = -1.0f;
    public int C1 = -1;
    public int D1 = -1;
    public boolean E1 = true;
    public MK F1 = this.R;
    public int G1 = 0;
    public int H1 = 0;
    public boolean I1;

    /* renamed from: o.sF0$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MK.a.values().length];
            a = iArr;
            try {
                iArr[MK.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[MK.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[MK.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[MK.a.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[MK.a.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[MK.a.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[MK.a.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[MK.a.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[MK.a.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C9445sF0() {
        this.Z.clear();
        this.Z.add(this.F1);
        int length = this.Y.length;
        for (int i = 0; i < length; i++) {
            this.Y[i] = this.F1;
        }
    }

    public void A2(float f) {
        if (f > -1.0f) {
            this.B1 = f;
            this.C1 = -1;
            this.D1 = -1;
        }
    }

    public void B2(int i) {
        A2(i / 100.0f);
    }

    public void C2(int i) {
        this.H1 = i;
    }

    public void D2(int i) {
        if (this.G1 != i) {
            this.G1 = i;
            this.Z.clear();
            if (this.G1 == 1) {
                this.F1 = this.Q;
            } else {
                this.F1 = this.R;
            }
            this.Z.add(this.F1);
            int length = this.Y.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.Y[i2] = this.F1;
            }
        }
    }

    @Override // o.UK
    public boolean G0() {
        return this.I1;
    }

    @Override // o.UK
    public boolean H0() {
        return this.I1;
    }

    @Override // o.UK
    public String f0() {
        return "Guideline";
    }

    @Override // o.UK
    public void g(C9872u01 c9872u01, boolean z) {
        boolean z2;
        VK vk = (VK) U();
        if (vk != null) {
            MK r = vk.r(MK.a.LEFT);
            MK r2 = vk.r(MK.a.RIGHT);
            UK uk = this.c0;
            boolean z3 = true;
            if (uk != null && uk.b0[0] == UK.b.WRAP_CONTENT) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.G1 == 0) {
                r = vk.r(MK.a.TOP);
                r2 = vk.r(MK.a.BOTTOM);
                UK uk2 = this.c0;
                if (uk2 == null || uk2.b0[1] != UK.b.WRAP_CONTENT) {
                    z3 = false;
                }
                z2 = z3;
            }
            if (this.I1 && this.F1.o()) {
                Q92 s = c9872u01.s(this.F1);
                c9872u01.f(s, this.F1.f());
                if (this.C1 != -1) {
                    if (z2) {
                        c9872u01.h(c9872u01.s(r2), s, 0, 5);
                    }
                } else if (this.D1 != -1 && z2) {
                    Q92 s2 = c9872u01.s(r2);
                    c9872u01.h(s, c9872u01.s(r), 0, 5);
                    c9872u01.h(s2, s, 0, 5);
                }
                this.I1 = false;
            } else if (this.C1 != -1) {
                Q92 s3 = c9872u01.s(this.F1);
                c9872u01.e(s3, c9872u01.s(r), this.C1, 8);
                if (z2) {
                    c9872u01.h(c9872u01.s(r2), s3, 0, 5);
                }
            } else if (this.D1 != -1) {
                Q92 s4 = c9872u01.s(this.F1);
                Q92 s5 = c9872u01.s(r2);
                c9872u01.e(s4, s5, -this.D1, 8);
                if (z2) {
                    c9872u01.h(s4, c9872u01.s(r), 0, 5);
                    c9872u01.h(s5, s4, 0, 5);
                }
            } else if (this.B1 != -1.0f) {
                c9872u01.d(C9872u01.u(c9872u01, c9872u01.s(this.F1), c9872u01.s(r2), this.B1));
            }
        }
    }

    @Override // o.UK
    public boolean h() {
        return true;
    }

    @Override // o.UK
    public void k2(C9872u01 c9872u01, boolean z) {
        if (U() == null) {
            return;
        }
        int M = c9872u01.M(this.F1);
        if (this.G1 == 1) {
            g2(M);
            h2(0);
            z1(U().D());
            d2(0);
            return;
        }
        g2(0);
        h2(M);
        d2(U().m0());
        z1(0);
    }

    public void l2() {
        if (this.C1 != -1) {
            v2();
        } else if (this.B1 != -1.0f) {
            u2();
        } else if (this.D1 != -1) {
            t2();
        }
    }

    public MK m2() {
        return this.F1;
    }

    @Override // o.UK
    public void n(UK uk, HashMap<UK, UK> hashMap) {
        super.n(uk, hashMap);
        C9445sF0 c9445sF0 = (C9445sF0) uk;
        this.B1 = c9445sF0.B1;
        this.C1 = c9445sF0.C1;
        this.D1 = c9445sF0.D1;
        this.E1 = c9445sF0.E1;
        D2(c9445sF0.G1);
    }

    public int n2() {
        return this.H1;
    }

    public int o2() {
        return this.G1;
    }

    public int p2() {
        return this.C1;
    }

    public int q2() {
        if (this.B1 != -1.0f) {
            return 0;
        }
        if (this.C1 != -1) {
            return 1;
        }
        if (this.D1 == -1) {
            return -1;
        }
        return 2;
    }

    @Override // o.UK
    public MK r(MK.a aVar) {
        int i = a.a[aVar.ordinal()];
        if (i != 1 && i != 2) {
            if ((i == 3 || i == 4) && this.G1 == 0) {
                return this.F1;
            }
            return null;
        } else if (this.G1 == 1) {
            return this.F1;
        } else {
            return null;
        }
    }

    public int r2() {
        return this.D1;
    }

    public float s2() {
        return this.B1;
    }

    public void t2() {
        int o0 = o0();
        if (this.G1 == 0) {
            o0 = p0();
        }
        y2(o0);
    }

    public void u2() {
        int m0 = U().m0() - o0();
        if (this.G1 == 0) {
            m0 = U().D() - p0();
        }
        z2(m0);
    }

    public void v2() {
        float o0 = o0() / U().m0();
        if (this.G1 == 0) {
            o0 = p0() / U().D();
        }
        A2(o0);
    }

    public boolean w2() {
        if (this.B1 != -1.0f && this.C1 == -1 && this.D1 == -1) {
            return true;
        }
        return false;
    }

    public void x2(int i) {
        this.F1.A(i);
        this.I1 = true;
    }

    public void y2(int i) {
        if (i > -1) {
            this.B1 = -1.0f;
            this.C1 = i;
            this.D1 = -1;
        }
    }

    public void z2(int i) {
        if (i > -1) {
            this.B1 = -1.0f;
            this.C1 = -1;
            this.D1 = i;
        }
    }
}
