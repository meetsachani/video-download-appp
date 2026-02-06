package o;

import java.util.HashMap;
import o.MK;
import o.UK;

/* renamed from: o.Tk  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4327Tk extends C9696tH0 {
    public static final int H1 = 0;
    public static final int I1 = 1;
    public static final int J1 = 2;
    public static final int K1 = 3;
    public static final boolean L1 = true;
    public static final boolean M1 = false;
    public int D1 = 0;
    public boolean E1 = true;
    public int F1 = 0;
    public boolean G1 = false;

    public C4327Tk() {
    }

    @Override // o.UK
    public boolean G0() {
        return this.G1;
    }

    @Override // o.UK
    public boolean H0() {
        return this.G1;
    }

    @Override // o.UK
    public void g(C9872u01 c9872u01, boolean z) {
        MK[] mkArr;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        MK[] mkArr2 = this.Y;
        mkArr2[0] = this.Q;
        mkArr2[2] = this.R;
        mkArr2[1] = this.S;
        mkArr2[3] = this.T;
        int i6 = 0;
        while (true) {
            mkArr = this.Y;
            if (i6 >= mkArr.length) {
                break;
            }
            MK mk = mkArr[i6];
            mk.i = c9872u01.s(mk);
            i6++;
        }
        int i7 = this.D1;
        if (i7 >= 0 && i7 < 4) {
            MK mk2 = mkArr[i7];
            if (!this.G1) {
                n2();
            }
            if (this.G1) {
                this.G1 = false;
                int i8 = this.D1;
                if (i8 != 0 && i8 != 1) {
                    if (i8 == 2 || i8 == 3) {
                        c9872u01.f(this.R.i, this.i0);
                        c9872u01.f(this.T.i, this.i0);
                        return;
                    }
                    return;
                }
                c9872u01.f(this.Q.i, this.h0);
                c9872u01.f(this.S.i, this.h0);
                return;
            }
            for (int i9 = 0; i9 < this.C1; i9++) {
                UK uk = this.B1[i9];
                if ((this.E1 || uk.h()) && ((((i4 = this.D1) == 0 || i4 == 1) && uk.H() == UK.b.MATCH_CONSTRAINT && uk.Q.f != null && uk.S.f != null) || (((i5 = this.D1) == 2 || i5 == 3) && uk.j0() == UK.b.MATCH_CONSTRAINT && uk.R.f != null && uk.T.f != null))) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            if (!this.Q.m() && !this.S.m()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!this.R.m() && !this.T.m()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z2 && (((i3 = this.D1) == 0 && z3) || ((i3 == 2 && z4) || ((i3 == 1 && z3) || (i3 == 3 && z4))))) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                i = 4;
            } else {
                i = 5;
            }
            for (int i10 = 0; i10 < this.C1; i10++) {
                UK uk2 = this.B1[i10];
                if (this.E1 || uk2.h()) {
                    Q92 s = c9872u01.s(uk2.Y[this.D1]);
                    MK[] mkArr3 = uk2.Y;
                    int i11 = this.D1;
                    MK mk3 = mkArr3[i11];
                    mk3.i = s;
                    MK mk4 = mk3.f;
                    if (mk4 != null && mk4.d == this) {
                        i2 = mk3.g;
                    } else {
                        i2 = 0;
                    }
                    if (i11 != 0 && i11 != 2) {
                        c9872u01.g(mk2.i, s, this.F1 + i2, z2);
                    } else {
                        c9872u01.i(mk2.i, s, this.F1 - i2, z2);
                    }
                    c9872u01.e(mk2.i, s, this.F1 + i2, i);
                }
            }
            int i12 = this.D1;
            if (i12 == 0) {
                c9872u01.e(this.S.i, this.Q.i, 0, 8);
                c9872u01.e(this.Q.i, this.c0.S.i, 0, 4);
                c9872u01.e(this.Q.i, this.c0.Q.i, 0, 0);
            } else if (i12 == 1) {
                c9872u01.e(this.Q.i, this.S.i, 0, 8);
                c9872u01.e(this.Q.i, this.c0.Q.i, 0, 4);
                c9872u01.e(this.Q.i, this.c0.S.i, 0, 0);
            } else if (i12 == 2) {
                c9872u01.e(this.T.i, this.R.i, 0, 8);
                c9872u01.e(this.R.i, this.c0.T.i, 0, 4);
                c9872u01.e(this.R.i, this.c0.R.i, 0, 0);
            } else if (i12 == 3) {
                c9872u01.e(this.R.i, this.T.i, 0, 8);
                c9872u01.e(this.R.i, this.c0.R.i, 0, 4);
                c9872u01.e(this.R.i, this.c0.T.i, 0, 0);
            }
        }
    }

    @Override // o.UK
    public boolean h() {
        return true;
    }

    @Override // o.C9696tH0, o.UK
    public void n(UK uk, HashMap<UK, UK> hashMap) {
        super.n(uk, hashMap);
        C4327Tk c4327Tk = (C4327Tk) uk;
        this.D1 = c4327Tk.D1;
        this.E1 = c4327Tk.E1;
        this.F1 = c4327Tk.F1;
    }

    public boolean n2() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.C1;
            if (i4 >= i) {
                break;
            }
            UK uk = this.B1[i4];
            if ((this.E1 || uk.h()) && ((((i2 = this.D1) == 0 || i2 == 1) && !uk.G0()) || (((i3 = this.D1) == 2 || i3 == 3) && !uk.H0()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.C1; i6++) {
            UK uk2 = this.B1[i6];
            if (this.E1 || uk2.h()) {
                if (!z2) {
                    int i7 = this.D1;
                    if (i7 == 0) {
                        i5 = uk2.r(MK.a.LEFT).f();
                    } else if (i7 == 1) {
                        i5 = uk2.r(MK.a.RIGHT).f();
                    } else if (i7 == 2) {
                        i5 = uk2.r(MK.a.TOP).f();
                    } else if (i7 == 3) {
                        i5 = uk2.r(MK.a.BOTTOM).f();
                    }
                    z2 = true;
                }
                int i8 = this.D1;
                if (i8 == 0) {
                    i5 = Math.min(i5, uk2.r(MK.a.LEFT).f());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, uk2.r(MK.a.RIGHT).f());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, uk2.r(MK.a.TOP).f());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, uk2.r(MK.a.BOTTOM).f());
                }
            }
        }
        int i9 = i5 + this.F1;
        int i10 = this.D1;
        if (i10 != 0 && i10 != 1) {
            u1(i9, i9);
        } else {
            r1(i9, i9);
        }
        this.G1 = true;
        return true;
    }

    @Deprecated
    public boolean o2() {
        return this.E1;
    }

    public boolean p2() {
        return this.E1;
    }

    public int q2() {
        return this.D1;
    }

    public int r2() {
        return this.F1;
    }

    public int s2() {
        int i = this.D1;
        if (i != 0 && i != 1) {
            if (i == 2 || i == 3) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    public void t2() {
        for (int i = 0; i < this.C1; i++) {
            UK uk = this.B1[i];
            if (this.E1 || uk.h()) {
                int i2 = this.D1;
                if (i2 != 0 && i2 != 1) {
                    if (i2 == 2 || i2 == 3) {
                        uk.H1(1, true);
                    }
                } else {
                    uk.H1(0, true);
                }
            }
        }
    }

    @Override // o.UK
    public String toString() {
        String str = "[Barrier] " + y() + " {";
        for (int i = 0; i < this.C1; i++) {
            UK uk = this.B1[i];
            if (i > 0) {
                str = str + C6566gU0.h;
            }
            str = str + uk.y();
        }
        return str + "}";
    }

    public void u2(boolean z) {
        this.E1 = z;
    }

    public void v2(int i) {
        this.D1 = i;
    }

    public void w2(int i) {
        this.F1 = i;
    }

    public C4327Tk(String str) {
        k1(str);
    }
}
