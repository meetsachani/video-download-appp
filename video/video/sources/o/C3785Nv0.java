package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import o.UK;

/* renamed from: o.Nv0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3785Nv0 extends UI2 {
    public static final int p2 = 0;
    public static final int q2 = 1;
    public static final int r2 = 2;
    public static final int s2 = 0;
    public static final int t2 = 1;
    public static final int u2 = 2;
    public static final int v2 = 3;
    public static final int w2 = 0;
    public static final int x2 = 1;
    public static final int y2 = 2;
    public static final int z2 = 3;
    public UK[] n2;
    public int Q1 = -1;
    public int R1 = -1;
    public int S1 = -1;
    public int T1 = -1;
    public int U1 = -1;
    public int V1 = -1;
    public float W1 = 0.5f;
    public float X1 = 0.5f;
    public float Y1 = 0.5f;
    public float Z1 = 0.5f;
    public float a2 = 0.5f;
    public float b2 = 0.5f;
    public int c2 = 0;
    public int d2 = 0;
    public int e2 = 2;
    public int f2 = 2;
    public int g2 = 0;
    public int h2 = -1;
    public int i2 = 0;
    public ArrayList<a> j2 = new ArrayList<>();
    public UK[] k2 = null;
    public UK[] l2 = null;
    public int[] m2 = null;
    public int o2 = 0;

    /* renamed from: o.Nv0$a */
    /* loaded from: classes.dex */
    public class a {
        public int a;
        public MK d;
        public MK e;
        public MK f;
        public MK g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int q;
        public UK b = null;
        public int c = 0;
        public int l = 0;
        public int m = 0;
        public int n = 0;

        /* renamed from: o  reason: collision with root package name */
        public int f561o = 0;
        public int p = 0;

        public a(int i, MK mk, MK mk2, MK mk3, MK mk4, int i2) {
            this.h = 0;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            this.q = 0;
            this.a = i;
            this.d = mk;
            this.e = mk2;
            this.f = mk3;
            this.g = mk4;
            this.h = C3785Nv0.this.t2();
            this.i = C3785Nv0.this.v2();
            this.j = C3785Nv0.this.u2();
            this.k = C3785Nv0.this.s2();
            this.q = i2;
        }

        public void b(UK uk) {
            int i = 0;
            if (this.a == 0) {
                int g3 = C3785Nv0.this.g3(uk, this.q);
                if (uk.H() == UK.b.MATCH_CONSTRAINT) {
                    this.p++;
                    g3 = 0;
                }
                int i2 = C3785Nv0.this.c2;
                if (uk.l0() != 8) {
                    i = i2;
                }
                this.l += g3 + i;
                int f3 = C3785Nv0.this.f3(uk, this.q);
                if (this.b == null || this.c < f3) {
                    this.b = uk;
                    this.c = f3;
                    this.m = f3;
                }
            } else {
                int g32 = C3785Nv0.this.g3(uk, this.q);
                int f32 = C3785Nv0.this.f3(uk, this.q);
                if (uk.j0() == UK.b.MATCH_CONSTRAINT) {
                    this.p++;
                    f32 = 0;
                }
                int i3 = C3785Nv0.this.d2;
                if (uk.l0() != 8) {
                    i = i3;
                }
                this.m += f32 + i;
                if (this.b == null || this.c < g32) {
                    this.b = uk;
                    this.c = g32;
                    this.l = g32;
                }
            }
            this.f561o++;
        }

        public void c() {
            this.c = 0;
            this.b = null;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            this.f561o = 0;
            this.p = 0;
        }

        public void d(boolean z, int i, boolean z2) {
            UK uk;
            int i2;
            char c;
            float f;
            float f2;
            int i3 = this.f561o;
            for (int i4 = 0; i4 < i3 && this.n + i4 < C3785Nv0.this.o2; i4++) {
                UK uk2 = C3785Nv0.this.n2[this.n + i4];
                if (uk2 != null) {
                    uk2.U0();
                }
            }
            if (i3 == 0 || this.b == null) {
                return;
            }
            boolean z3 = z2 && i == 0;
            int i5 = -1;
            int i6 = -1;
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = z ? (i3 - 1) - i7 : i7;
                if (this.n + i8 >= C3785Nv0.this.o2) {
                    break;
                }
                UK uk3 = C3785Nv0.this.n2[this.n + i8];
                if (uk3 != null && uk3.l0() == 0) {
                    if (i5 == -1) {
                        i5 = i7;
                    }
                    i6 = i7;
                }
            }
            UK uk4 = null;
            if (this.a == 0) {
                UK uk5 = this.b;
                uk5.X1(C3785Nv0.this.R1);
                int i9 = this.i;
                if (i > 0) {
                    i9 += C3785Nv0.this.d2;
                }
                uk5.R.a(this.e, i9);
                if (z2) {
                    uk5.T.a(this.g, this.k);
                }
                if (i > 0) {
                    this.e.d.T.a(uk5.R, 0);
                }
                char c2 = 3;
                if (C3785Nv0.this.f2 == 3 && !uk5.q0()) {
                    for (int i10 = 0; i10 < i3; i10++) {
                        int i11 = z ? (i3 - 1) - i10 : i10;
                        if (this.n + i11 >= C3785Nv0.this.o2) {
                            break;
                        }
                        uk = C3785Nv0.this.n2[this.n + i11];
                        if (uk.q0()) {
                            break;
                        }
                    }
                }
                uk = uk5;
                int i12 = 0;
                while (i12 < i3) {
                    int i13 = z ? (i3 - 1) - i12 : i12;
                    if (this.n + i13 >= C3785Nv0.this.o2) {
                        return;
                    }
                    UK uk6 = C3785Nv0.this.n2[this.n + i13];
                    if (uk6 == null) {
                        uk6 = uk4;
                        c = c2;
                    } else {
                        if (i12 == 0) {
                            i2 = 1;
                            uk6.l(uk6.Q, this.d, this.h);
                        } else {
                            i2 = 1;
                        }
                        if (i13 == 0) {
                            int i14 = C3785Nv0.this.Q1;
                            float f3 = C3785Nv0.this.W1;
                            if (z) {
                                f3 = 1.0f - f3;
                            }
                            if (this.n != 0 || C3785Nv0.this.S1 == -1) {
                                if (z2 && C3785Nv0.this.U1 != -1) {
                                    i14 = C3785Nv0.this.U1;
                                    if (z) {
                                        f2 = C3785Nv0.this.a2;
                                        f = 1.0f - f2;
                                        f3 = f;
                                    } else {
                                        f = C3785Nv0.this.a2;
                                        f3 = f;
                                    }
                                }
                            } else {
                                i14 = C3785Nv0.this.S1;
                                if (z) {
                                    f2 = C3785Nv0.this.Y1;
                                    f = 1.0f - f2;
                                    f3 = f;
                                } else {
                                    f = C3785Nv0.this.Y1;
                                    f3 = f;
                                }
                            }
                            uk6.C1(i14);
                            uk6.B1(f3);
                        }
                        if (i12 == i3 - 1) {
                            uk6.l(uk6.S, this.f, this.j);
                        }
                        if (uk4 != null) {
                            uk6.Q.a(uk4.S, C3785Nv0.this.c2);
                            if (i12 == i5) {
                                uk6.Q.B(this.h);
                            }
                            uk4.S.a(uk6.Q, 0);
                            if (i12 == i6 + 1) {
                                uk4.S.B(this.j);
                            }
                        }
                        if (uk6 != uk5) {
                            c = 3;
                            if (C3785Nv0.this.f2 != 3 || !uk.q0() || uk6 == uk || !uk6.q0()) {
                                int i15 = C3785Nv0.this.f2;
                                if (i15 == 0) {
                                    uk6.R.a(uk5.R, 0);
                                } else if (i15 == i2) {
                                    uk6.T.a(uk5.T, 0);
                                } else if (z3) {
                                    uk6.R.a(this.e, this.i);
                                    uk6.T.a(this.g, this.k);
                                } else {
                                    uk6.R.a(uk5.R, 0);
                                    uk6.T.a(uk5.T, 0);
                                }
                            } else {
                                uk6.U.a(uk.U, 0);
                            }
                        } else {
                            c = 3;
                        }
                    }
                    i12++;
                    c2 = c;
                    uk4 = uk6;
                }
                return;
            }
            UK uk7 = this.b;
            uk7.C1(C3785Nv0.this.Q1);
            int i16 = this.h;
            if (i > 0) {
                i16 += C3785Nv0.this.c2;
            }
            if (z) {
                uk7.S.a(this.f, i16);
                if (z2) {
                    uk7.Q.a(this.d, this.j);
                }
                if (i > 0) {
                    this.f.d.Q.a(uk7.S, 0);
                }
            } else {
                uk7.Q.a(this.d, i16);
                if (z2) {
                    uk7.S.a(this.f, this.j);
                }
                if (i > 0) {
                    this.d.d.S.a(uk7.Q, 0);
                }
            }
            for (int i17 = 0; i17 < i3 && this.n + i17 < C3785Nv0.this.o2; i17++) {
                UK uk8 = C3785Nv0.this.n2[this.n + i17];
                if (uk8 != null) {
                    if (i17 == 0) {
                        uk8.l(uk8.R, this.e, this.i);
                        int i18 = C3785Nv0.this.R1;
                        float f4 = C3785Nv0.this.X1;
                        if (this.n != 0 || C3785Nv0.this.T1 == -1) {
                            if (z2 && C3785Nv0.this.V1 != -1) {
                                i18 = C3785Nv0.this.V1;
                                f4 = C3785Nv0.this.b2;
                            }
                        } else {
                            i18 = C3785Nv0.this.T1;
                            f4 = C3785Nv0.this.Z1;
                        }
                        uk8.X1(i18);
                        uk8.W1(f4);
                    }
                    if (i17 == i3 - 1) {
                        uk8.l(uk8.T, this.g, this.k);
                    }
                    if (uk4 != null) {
                        uk8.R.a(uk4.T, C3785Nv0.this.d2);
                        if (i17 == i5) {
                            uk8.R.B(this.i);
                        }
                        uk4.T.a(uk8.R, 0);
                        if (i17 == i6 + 1) {
                            uk4.T.B(this.k);
                        }
                    }
                    if (uk8 != uk7) {
                        if (z) {
                            int i19 = C3785Nv0.this.e2;
                            if (i19 == 0) {
                                uk8.S.a(uk7.S, 0);
                            } else if (i19 == 1) {
                                uk8.Q.a(uk7.Q, 0);
                            } else if (i19 == 2) {
                                uk8.Q.a(uk7.Q, 0);
                                uk8.S.a(uk7.S, 0);
                            }
                        } else {
                            int i20 = C3785Nv0.this.e2;
                            if (i20 == 0) {
                                uk8.Q.a(uk7.Q, 0);
                            } else if (i20 == 1) {
                                uk8.S.a(uk7.S, 0);
                            } else if (i20 == 2) {
                                if (z3) {
                                    uk8.Q.a(this.d, this.h);
                                    uk8.S.a(this.f, this.j);
                                } else {
                                    uk8.Q.a(uk7.Q, 0);
                                    uk8.S.a(uk7.S, 0);
                                }
                            }
                            uk4 = uk8;
                        }
                    }
                    uk4 = uk8;
                }
            }
        }

        public int e() {
            if (this.a == 1) {
                return this.m - C3785Nv0.this.d2;
            }
            return this.m;
        }

        public int f() {
            if (this.a == 0) {
                return this.l - C3785Nv0.this.c2;
            }
            return this.l;
        }

        public void g(int i) {
            int i2 = this.p;
            if (i2 == 0) {
                return;
            }
            int i3 = this.f561o;
            int i4 = i / i2;
            for (int i5 = 0; i5 < i3 && this.n + i5 < C3785Nv0.this.o2; i5++) {
                UK uk = C3785Nv0.this.n2[this.n + i5];
                if (this.a == 0) {
                    if (uk != null && uk.H() == UK.b.MATCH_CONSTRAINT && uk.w == 0) {
                        C3785Nv0.this.x2(uk, UK.b.FIXED, i4, uk.j0(), uk.D());
                    }
                } else if (uk != null && uk.j0() == UK.b.MATCH_CONSTRAINT && uk.x == 0) {
                    int i6 = i4;
                    C3785Nv0.this.x2(uk, uk.H(), uk.m0(), UK.b.FIXED, i6);
                    i4 = i6;
                }
            }
            h();
        }

        public final void h() {
            this.l = 0;
            this.m = 0;
            this.b = null;
            this.c = 0;
            int i = this.f561o;
            for (int i2 = 0; i2 < i && this.n + i2 < C3785Nv0.this.o2; i2++) {
                UK uk = C3785Nv0.this.n2[this.n + i2];
                if (this.a != 0) {
                    int g3 = C3785Nv0.this.g3(uk, this.q);
                    int f3 = C3785Nv0.this.f3(uk, this.q);
                    int i3 = C3785Nv0.this.d2;
                    if (uk.l0() == 8) {
                        i3 = 0;
                    }
                    this.m += f3 + i3;
                    if (this.b == null || this.c < g3) {
                        this.b = uk;
                        this.c = g3;
                        this.l = g3;
                    }
                } else {
                    int m0 = uk.m0();
                    int i4 = C3785Nv0.this.c2;
                    if (uk.l0() == 8) {
                        i4 = 0;
                    }
                    this.l += m0 + i4;
                    int f32 = C3785Nv0.this.f3(uk, this.q);
                    if (this.b == null || this.c < f32) {
                        this.b = uk;
                        this.c = f32;
                        this.m = f32;
                    }
                }
            }
        }

        public void i(int i) {
            this.n = i;
        }

        public void j(int i, MK mk, MK mk2, MK mk3, MK mk4, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.d = mk;
            this.e = mk2;
            this.f = mk3;
            this.g = mk4;
            this.h = i2;
            this.i = i3;
            this.j = i4;
            this.k = i5;
            this.q = i6;
        }
    }

    public void A3(float f) {
        this.X1 = f;
    }

    public void B3(int i) {
        this.d2 = i;
    }

    public void C3(int i) {
        this.R1 = i;
    }

    public void D3(int i) {
        this.g2 = i;
    }

    public final void d3(boolean z) {
        UK uk;
        float f;
        int i;
        if (this.m2 != null && this.l2 != null && this.k2 != null) {
            for (int i2 = 0; i2 < this.o2; i2++) {
                this.n2[i2].U0();
            }
            int[] iArr = this.m2;
            int i3 = iArr[0];
            int i4 = iArr[1];
            float f2 = this.W1;
            UK uk2 = null;
            int i5 = 0;
            while (i5 < i3) {
                if (z) {
                    i = (i3 - i5) - 1;
                    f = 1.0f - this.W1;
                } else {
                    f = f2;
                    i = i5;
                }
                UK uk3 = this.l2[i];
                if (uk3 != null && uk3.l0() != 8) {
                    if (i5 == 0) {
                        uk3.l(uk3.Q, this.Q, t2());
                        uk3.C1(this.Q1);
                        uk3.B1(f);
                    }
                    if (i5 == i3 - 1) {
                        uk3.l(uk3.S, this.S, u2());
                    }
                    if (i5 > 0 && uk2 != null) {
                        uk3.l(uk3.Q, uk2.S, this.c2);
                        uk2.l(uk2.S, uk3.Q, 0);
                    }
                    uk2 = uk3;
                }
                i5++;
                f2 = f;
            }
            for (int i6 = 0; i6 < i4; i6++) {
                UK uk4 = this.k2[i6];
                if (uk4 != null && uk4.l0() != 8) {
                    if (i6 == 0) {
                        uk4.l(uk4.R, this.R, v2());
                        uk4.X1(this.R1);
                        uk4.W1(this.X1);
                    }
                    if (i6 == i4 - 1) {
                        uk4.l(uk4.T, this.T, s2());
                    }
                    if (i6 > 0 && uk2 != null) {
                        uk4.l(uk4.R, uk2.T, this.d2);
                        uk2.l(uk2.T, uk4.R, 0);
                    }
                    uk2 = uk4;
                }
            }
            for (int i7 = 0; i7 < i3; i7++) {
                for (int i8 = 0; i8 < i4; i8++) {
                    int i9 = (i8 * i3) + i7;
                    if (this.i2 == 1) {
                        i9 = (i7 * i4) + i8;
                    }
                    UK[] ukArr = this.n2;
                    if (i9 < ukArr.length && (uk = ukArr[i9]) != null && uk.l0() != 8) {
                        UK uk5 = this.l2[i7];
                        UK uk6 = this.k2[i8];
                        if (uk != uk5) {
                            uk.l(uk.Q, uk5.Q, 0);
                            uk.l(uk.S, uk5.S, 0);
                        }
                        if (uk != uk6) {
                            uk.l(uk.R, uk6.R, 0);
                            uk.l(uk.T, uk6.T, 0);
                        }
                    }
                }
            }
        }
    }

    public float e3() {
        return this.h2;
    }

    public final int f3(UK uk, int i) {
        UK uk2;
        if (uk == null) {
            return 0;
        }
        if (uk.j0() == UK.b.MATCH_CONSTRAINT) {
            int i2 = uk.x;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (uk.E * i);
                if (i3 != uk.D()) {
                    uk.O1(true);
                    x2(uk, uk.H(), uk.m0(), UK.b.FIXED, i3);
                }
                return i3;
            }
            uk2 = uk;
            if (i2 == 1) {
                return uk2.D();
            }
            if (i2 == 3) {
                return (int) ((uk2.m0() * uk2.f0) + 0.5f);
            }
        } else {
            uk2 = uk;
        }
        return uk2.D();
    }

    @Override // o.UK
    public void g(C9872u01 c9872u01, boolean z) {
        boolean z3;
        boolean z4;
        boolean z5;
        super.g(c9872u01, z);
        if (U() != null && ((VK) U()).P2()) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i = this.g2;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        int size = this.j2.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            a aVar = this.j2.get(i2);
                            if (i2 == size - 1) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            aVar.d(z3, i2, z5);
                        }
                    }
                } else {
                    d3(z3);
                }
            } else {
                int size2 = this.j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    a aVar2 = this.j2.get(i3);
                    if (i3 == size2 - 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    aVar2.d(z3, i3, z4);
                }
            }
        } else if (this.j2.size() > 0) {
            this.j2.get(0).d(z3, 0, true);
        }
        A2(false);
    }

    public final int g3(UK uk, int i) {
        UK uk2;
        if (uk == null) {
            return 0;
        }
        if (uk.H() == UK.b.MATCH_CONSTRAINT) {
            int i2 = uk.w;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (uk.B * i);
                if (i3 != uk.m0()) {
                    uk.O1(true);
                    x2(uk, UK.b.FIXED, i3, uk.j0(), uk.D());
                }
                return i3;
            }
            uk2 = uk;
            if (i2 == 1) {
                return uk2.m0();
            }
            if (i2 == 3) {
                return (int) ((uk2.D() * uk2.f0) + 0.5f);
            }
        } else {
            uk2 = uk;
        }
        return uk2.m0();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h3(UK[] ukArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5;
        boolean z;
        UK uk;
        if (i2 == 0) {
            int i6 = this.h2;
            if (i6 <= 0) {
                i6 = 0;
                int i7 = 0;
                for (int i8 = 0; i8 < i; i8++) {
                    if (i8 > 0) {
                        i7 += this.c2;
                    }
                    UK uk2 = ukArr[i8];
                    if (uk2 != null) {
                        i7 += g3(uk2, i3);
                        if (i7 > i3) {
                            break;
                        }
                        i6++;
                    }
                }
            }
            i5 = i6;
            i4 = 0;
        } else {
            i4 = this.h2;
            if (i4 <= 0) {
                i4 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < i; i10++) {
                    if (i10 > 0) {
                        i9 += this.d2;
                    }
                    UK uk3 = ukArr[i10];
                    if (uk3 != null) {
                        i9 += f3(uk3, i3);
                        if (i9 > i3) {
                            break;
                        }
                        i4++;
                    }
                }
            }
            i5 = 0;
        }
        if (this.m2 == null) {
            this.m2 = new int[2];
        }
        if ((i4 != 0 || i2 != 1) && (i5 != 0 || i2 != 0)) {
            z = false;
            while (!z) {
                if (i2 == 0) {
                    i4 = (int) Math.ceil(i / i5);
                } else {
                    i5 = (int) Math.ceil(i / i4);
                }
                UK[] ukArr2 = this.l2;
                if (ukArr2 != null && ukArr2.length >= i5) {
                    Arrays.fill(ukArr2, (Object) null);
                } else {
                    this.l2 = new UK[i5];
                }
                UK[] ukArr3 = this.k2;
                if (ukArr3 != null && ukArr3.length >= i4) {
                    Arrays.fill(ukArr3, (Object) null);
                } else {
                    this.k2 = new UK[i4];
                }
                for (int i11 = 0; i11 < i5; i11++) {
                    for (int i12 = 0; i12 < i4; i12++) {
                        int i13 = (i12 * i5) + i11;
                        if (i2 == 1) {
                            i13 = (i11 * i4) + i12;
                        }
                        if (i13 < ukArr.length && (uk = ukArr[i13]) != null) {
                            int g3 = g3(uk, i3);
                            UK uk4 = this.l2[i11];
                            if (uk4 == null || uk4.m0() < g3) {
                                this.l2[i11] = uk;
                            }
                            int f3 = f3(uk, i3);
                            UK uk5 = this.k2[i12];
                            if (uk5 == null || uk5.D() < f3) {
                                this.k2[i12] = uk;
                            }
                        }
                    }
                }
                int i14 = 0;
                for (int i15 = 0; i15 < i5; i15++) {
                    UK uk6 = this.l2[i15];
                    if (uk6 != null) {
                        if (i15 > 0) {
                            i14 += this.c2;
                        }
                        i14 += g3(uk6, i3);
                    }
                }
                int i16 = 0;
                for (int i17 = 0; i17 < i4; i17++) {
                    UK uk7 = this.k2[i17];
                    if (uk7 != null) {
                        if (i17 > 0) {
                            i16 += this.d2;
                        }
                        i16 += f3(uk7, i3);
                    }
                }
                iArr[0] = i14;
                iArr[1] = i16;
                if (i2 == 0) {
                    if (i14 > i3 && i5 > 1) {
                        i5--;
                    }
                } else if (i16 > i3 && i4 > 1) {
                    i4--;
                }
                while (!z) {
                }
            }
            int[] iArr2 = this.m2;
            iArr2[0] = i5;
            iArr2[1] = i4;
        }
        z = true;
        while (!z) {
        }
        int[] iArr22 = this.m2;
        iArr22[0] = i5;
        iArr22[1] = i4;
    }

    public final void i3(UK[] ukArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        boolean z;
        C3785Nv0 c3785Nv0;
        int i5;
        boolean z3;
        MK mk;
        boolean z4;
        int i6;
        C3785Nv0 c3785Nv02 = this;
        if (i == 0) {
            return;
        }
        c3785Nv02.j2.clear();
        int i7 = i3;
        a aVar = new a(i2, c3785Nv02.Q, c3785Nv02.R, c3785Nv02.S, c3785Nv02.T, i7);
        c3785Nv02.j2.add(aVar);
        if (i2 == 0) {
            i4 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i9 < i) {
                UK uk = ukArr[i9];
                int g3 = c3785Nv02.g3(uk, i7);
                if (uk.H() == UK.b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i10 = i4;
                if ((i8 == i7 || c3785Nv02.c2 + i8 + g3 > i7) && aVar.b != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4 && i9 > 0 && (i6 = c3785Nv02.h2) > 0 && i9 % i6 == 0) {
                    z4 = true;
                }
                if (z4) {
                    aVar = new a(i2, c3785Nv02.Q, c3785Nv02.R, c3785Nv02.S, c3785Nv02.T, i7);
                    aVar.i(i9);
                    c3785Nv02.j2.add(aVar);
                } else if (i9 > 0) {
                    i8 += c3785Nv02.c2 + g3;
                    aVar.b(uk);
                    i9++;
                    i4 = i10;
                }
                i8 = g3;
                aVar.b(uk);
                i9++;
                i4 = i10;
            }
        } else {
            i4 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i12 < i) {
                UK uk2 = ukArr[i12];
                int f3 = c3785Nv02.f3(uk2, i7);
                if (uk2.j0() == UK.b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i13 = i4;
                if ((i11 == i7 || c3785Nv02.d2 + i11 + f3 > i7) && aVar.b != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && i12 > 0 && (i5 = c3785Nv02.h2) > 0 && i12 % i5 == 0) {
                    z = true;
                }
                if (z) {
                    aVar = new a(i2, c3785Nv02.Q, c3785Nv02.R, c3785Nv02.S, c3785Nv02.T, i7);
                    c3785Nv0 = c3785Nv02;
                    aVar.i(i12);
                    c3785Nv0.j2.add(aVar);
                } else {
                    c3785Nv0 = c3785Nv02;
                    if (i12 > 0) {
                        i11 += c3785Nv0.d2 + f3;
                        aVar.b(uk2);
                        i12++;
                        i7 = i3;
                        i4 = i13;
                        c3785Nv02 = c3785Nv0;
                    }
                }
                i11 = f3;
                aVar.b(uk2);
                i12++;
                i7 = i3;
                i4 = i13;
                c3785Nv02 = c3785Nv0;
            }
        }
        C3785Nv0 c3785Nv03 = c3785Nv02;
        int size = c3785Nv03.j2.size();
        MK mk2 = c3785Nv03.Q;
        MK mk3 = c3785Nv03.R;
        MK mk4 = c3785Nv03.S;
        MK mk5 = c3785Nv03.T;
        int t22 = c3785Nv03.t2();
        int v22 = c3785Nv03.v2();
        int u22 = c3785Nv03.u2();
        int s22 = c3785Nv03.s2();
        UK.b H = c3785Nv03.H();
        UK.b bVar = UK.b.WRAP_CONTENT;
        if (H != bVar && c3785Nv03.j0() != bVar) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i4 > 0 && z3) {
            for (int i14 = 0; i14 < size; i14++) {
                a aVar2 = c3785Nv03.j2.get(i14);
                if (i2 == 0) {
                    aVar2.g(i3 - aVar2.f());
                } else {
                    aVar2.g(i3 - aVar2.e());
                }
            }
        }
        MK mk6 = mk2;
        int i15 = s22;
        int i16 = 0;
        int i17 = u22;
        int i18 = v22;
        int i19 = t22;
        MK mk7 = mk5;
        MK mk8 = mk4;
        MK mk9 = mk3;
        int i20 = 0;
        for (int i21 = 0; i21 < size; i21++) {
            a aVar3 = c3785Nv03.j2.get(i21);
            if (i2 == 0) {
                if (i21 < size - 1) {
                    mk7 = c3785Nv03.j2.get(i21 + 1).b.R;
                    i15 = 0;
                } else {
                    mk7 = c3785Nv03.T;
                    i15 = c3785Nv03.s2();
                }
                MK mk10 = aVar3.b.T;
                int i22 = i20;
                aVar3.j(i2, mk6, mk9, mk8, mk7, i19, i18, i17, i15, i3);
                int max = Math.max(i16, aVar3.f());
                int e = aVar3.e() + i22;
                if (i21 > 0) {
                    e += c3785Nv03.d2;
                }
                i20 = e;
                i16 = max;
                mk9 = mk10;
                i18 = 0;
            } else {
                int i23 = i16;
                int i24 = i20;
                if (i21 < size - 1) {
                    mk = c3785Nv03.j2.get(i21 + 1).b.Q;
                    i17 = 0;
                } else {
                    mk = c3785Nv03.S;
                    i17 = c3785Nv03.u2();
                }
                mk8 = mk;
                MK mk11 = aVar3.b.S;
                aVar3.j(i2, mk6, mk9, mk8, mk7, i19, i18, i17, i15, i3);
                int f = aVar3.f() + i23;
                int max2 = Math.max(i24, aVar3.e());
                if (i21 > 0) {
                    f += c3785Nv03.c2;
                }
                int i25 = f;
                i20 = max2;
                i16 = i25;
                i19 = 0;
                mk6 = mk11;
            }
        }
        iArr[0] = i16;
        iArr[1] = i20;
    }

    public final void j3(UK[] ukArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        boolean z;
        C3785Nv0 c3785Nv0;
        int i5;
        boolean z3;
        char c;
        MK mk;
        boolean z4;
        int i6;
        C3785Nv0 c3785Nv02 = this;
        if (i == 0) {
            return;
        }
        c3785Nv02.j2.clear();
        int i7 = i3;
        a aVar = new a(i2, c3785Nv02.Q, c3785Nv02.R, c3785Nv02.S, c3785Nv02.T, i7);
        c3785Nv02.j2.add(aVar);
        char c2 = 1;
        if (i2 == 0) {
            int i8 = 0;
            i4 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i10 < i) {
                i8++;
                UK uk = ukArr[i10];
                int g3 = c3785Nv02.g3(uk, i7);
                if (uk.H() == UK.b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i11 = i4;
                if ((i9 == i7 || c3785Nv02.c2 + i9 + g3 > i7) && aVar.b != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4 && i10 > 0 && (i6 = c3785Nv02.h2) > 0 && i8 > i6) {
                    z4 = true;
                }
                if (z4) {
                    aVar = new a(i2, c3785Nv02.Q, c3785Nv02.R, c3785Nv02.S, c3785Nv02.T, i7);
                    aVar.i(i10);
                    c3785Nv02.j2.add(aVar);
                    i8 = 1;
                } else if (i10 > 0) {
                    i9 += c3785Nv02.c2 + g3;
                    aVar.b(uk);
                    i10++;
                    i4 = i11;
                }
                i9 = g3;
                aVar.b(uk);
                i10++;
                i4 = i11;
            }
        } else {
            int i12 = 0;
            i4 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i14 < i) {
                i12++;
                UK uk2 = ukArr[i14];
                int f3 = c3785Nv02.f3(uk2, i7);
                if (uk2.j0() == UK.b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i15 = i4;
                if ((i13 == i7 || c3785Nv02.d2 + i13 + f3 > i7) && aVar.b != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && i14 > 0 && (i5 = c3785Nv02.h2) > 0 && i12 > i5) {
                    z = true;
                }
                if (z) {
                    aVar = new a(i2, c3785Nv02.Q, c3785Nv02.R, c3785Nv02.S, c3785Nv02.T, i7);
                    c3785Nv0 = c3785Nv02;
                    aVar.i(i14);
                    c3785Nv0.j2.add(aVar);
                    i12 = 1;
                } else {
                    c3785Nv0 = c3785Nv02;
                    if (i14 > 0) {
                        i13 += c3785Nv0.d2 + f3;
                        aVar.b(uk2);
                        i14++;
                        i7 = i3;
                        i4 = i15;
                        c3785Nv02 = c3785Nv0;
                    }
                }
                i13 = f3;
                aVar.b(uk2);
                i14++;
                i7 = i3;
                i4 = i15;
                c3785Nv02 = c3785Nv0;
            }
        }
        C3785Nv0 c3785Nv03 = c3785Nv02;
        int size = c3785Nv03.j2.size();
        MK mk2 = c3785Nv03.Q;
        MK mk3 = c3785Nv03.R;
        MK mk4 = c3785Nv03.S;
        MK mk5 = c3785Nv03.T;
        int t22 = c3785Nv03.t2();
        int v22 = c3785Nv03.v2();
        int u22 = c3785Nv03.u2();
        int s22 = c3785Nv03.s2();
        UK.b H = c3785Nv03.H();
        UK.b bVar = UK.b.WRAP_CONTENT;
        if (H != bVar && c3785Nv03.j0() != bVar) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i4 > 0 && z3) {
            for (int i16 = 0; i16 < size; i16++) {
                a aVar2 = c3785Nv03.j2.get(i16);
                if (i2 == 0) {
                    aVar2.g(i3 - aVar2.f());
                } else {
                    aVar2.g(i3 - aVar2.e());
                }
            }
        }
        MK mk6 = mk3;
        int i17 = s22;
        int i18 = 0;
        int i19 = 0;
        int i20 = u22;
        int i21 = v22;
        int i22 = t22;
        MK mk7 = mk5;
        MK mk8 = mk4;
        MK mk9 = mk2;
        int i23 = 0;
        while (i19 < size) {
            a aVar3 = c3785Nv03.j2.get(i19);
            if (i2 == 0) {
                if (i19 < size - 1) {
                    mk7 = c3785Nv03.j2.get(i19 + 1).b.R;
                    i17 = 0;
                } else {
                    mk7 = c3785Nv03.T;
                    i17 = c3785Nv03.s2();
                }
                MK mk10 = aVar3.b.T;
                c = c2;
                int i24 = i18;
                aVar3.j(i2, mk9, mk6, mk8, mk7, i22, i21, i20, i17, i3);
                int max = Math.max(i23, aVar3.f());
                int e = aVar3.e() + i24;
                if (i19 > 0) {
                    e += c3785Nv03.d2;
                }
                i18 = e;
                i23 = max;
                mk6 = mk10;
                i21 = 0;
            } else {
                int i25 = i18;
                c = c2;
                int i26 = i23;
                if (i19 < size - 1) {
                    mk = c3785Nv03.j2.get(i19 + 1).b.Q;
                    i20 = 0;
                } else {
                    mk = c3785Nv03.S;
                    i20 = c3785Nv03.u2();
                }
                mk8 = mk;
                MK mk11 = aVar3.b.S;
                aVar3.j(i2, mk9, mk6, mk8, mk7, i22, i21, i20, i17, i3);
                int f = aVar3.f() + i26;
                int max2 = Math.max(i25, aVar3.e());
                if (i19 > 0) {
                    f += c3785Nv03.c2;
                }
                int i27 = f;
                i18 = max2;
                i23 = i27;
                i22 = 0;
                mk9 = mk11;
            }
            i19++;
            c2 = c;
        }
        iArr[0] = i23;
        iArr[c2] = i18;
    }

    public final void k3(UK[] ukArr, int i, int i2, int i3, int[] iArr) {
        a aVar;
        if (i == 0) {
            return;
        }
        if (this.j2.size() == 0) {
            aVar = new a(i2, this.Q, this.R, this.S, this.T, i3);
            this.j2.add(aVar);
        } else {
            a aVar2 = this.j2.get(0);
            aVar2.c();
            aVar2.j(i2, this.Q, this.R, this.S, this.T, t2(), v2(), u2(), s2(), i3);
            aVar = aVar2;
        }
        for (int i4 = 0; i4 < i; i4++) {
            aVar.b(ukArr[i4]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void l3(float f) {
        this.Y1 = f;
    }

    public void m3(int i) {
        this.S1 = i;
    }

    @Override // o.C9696tH0, o.UK
    public void n(UK uk, HashMap<UK, UK> hashMap) {
        super.n(uk, hashMap);
        C3785Nv0 c3785Nv0 = (C3785Nv0) uk;
        this.Q1 = c3785Nv0.Q1;
        this.R1 = c3785Nv0.R1;
        this.S1 = c3785Nv0.S1;
        this.T1 = c3785Nv0.T1;
        this.U1 = c3785Nv0.U1;
        this.V1 = c3785Nv0.V1;
        this.W1 = c3785Nv0.W1;
        this.X1 = c3785Nv0.X1;
        this.Y1 = c3785Nv0.Y1;
        this.Z1 = c3785Nv0.Z1;
        this.a2 = c3785Nv0.a2;
        this.b2 = c3785Nv0.b2;
        this.c2 = c3785Nv0.c2;
        this.d2 = c3785Nv0.d2;
        this.e2 = c3785Nv0.e2;
        this.f2 = c3785Nv0.f2;
        this.g2 = c3785Nv0.g2;
        this.h2 = c3785Nv0.h2;
        this.i2 = c3785Nv0.i2;
    }

    public void n3(float f) {
        this.Z1 = f;
    }

    public void o3(int i) {
        this.T1 = i;
    }

    public void p3(int i) {
        this.e2 = i;
    }

    public void q3(float f) {
        this.W1 = f;
    }

    public void r3(int i) {
        this.c2 = i;
    }

    public void s3(int i) {
        this.Q1 = i;
    }

    public void t3(float f) {
        this.a2 = f;
    }

    public void u3(int i) {
        this.U1 = i;
    }

    public void v3(float f) {
        this.b2 = f;
    }

    @Override // o.UI2
    public void w2(int i, int i2, int i3, int i4) {
        int i5;
        UK[] ukArr;
        boolean z;
        if (this.C1 > 0 && !y2()) {
            B2(0, 0);
            A2(false);
            return;
        }
        int t22 = t2();
        int u22 = u2();
        int v22 = v2();
        int s22 = s2();
        int[] iArr = new int[2];
        int i6 = (i2 - t22) - u22;
        int i7 = this.i2;
        if (i7 == 1) {
            i6 = (i4 - v22) - s22;
        }
        int i8 = i6;
        if (i7 == 0) {
            if (this.Q1 == -1) {
                this.Q1 = 0;
            }
            if (this.R1 == -1) {
                this.R1 = 0;
            }
        } else {
            if (this.Q1 == -1) {
                this.Q1 = 0;
            }
            if (this.R1 == -1) {
                this.R1 = 0;
            }
        }
        UK[] ukArr2 = this.B1;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i5 = this.C1;
            if (i9 >= i5) {
                break;
            }
            if (this.B1[i9].l0() == 8) {
                i10++;
            }
            i9++;
        }
        if (i10 > 0) {
            UK[] ukArr3 = new UK[i5 - i10];
            int i11 = 0;
            i5 = 0;
            while (i11 < this.C1) {
                UK uk = this.B1[i11];
                UK[] ukArr4 = ukArr3;
                if (uk.l0() != 8) {
                    ukArr4[i5] = uk;
                    i5++;
                }
                i11++;
                ukArr3 = ukArr4;
            }
            ukArr = ukArr3;
        } else {
            ukArr = ukArr2;
        }
        int i12 = i5;
        this.n2 = ukArr;
        this.o2 = i12;
        int i13 = this.g2;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 == 3) {
                        j3(ukArr, i12, this.i2, i8, iArr);
                    }
                } else {
                    h3(ukArr, i12, this.i2, i8, iArr);
                }
            } else {
                i3(ukArr, i12, this.i2, i8, iArr);
            }
        } else {
            k3(ukArr, i12, this.i2, i8, iArr);
        }
        int i14 = iArr[0] + t22 + u22;
        int i15 = iArr[1] + v22 + s22;
        if (i == 1073741824) {
            i14 = i2;
        } else if (i == Integer.MIN_VALUE) {
            i14 = Math.min(i14, i2);
        } else if (i != 0) {
            i14 = 0;
        }
        if (i3 == 1073741824) {
            i15 = i4;
        } else if (i3 == Integer.MIN_VALUE) {
            i15 = Math.min(i15, i4);
        } else if (i3 != 0) {
            i15 = 0;
        }
        B2(i14, i15);
        d2(i14);
        z1(i15);
        if (this.C1 > 0) {
            z = true;
        } else {
            z = false;
        }
        A2(z);
    }

    public void w3(int i) {
        this.V1 = i;
    }

    public void x3(int i) {
        this.h2 = i;
    }

    public void y3(int i) {
        this.i2 = i;
    }

    public void z3(int i) {
        this.f2 = i;
    }
}
