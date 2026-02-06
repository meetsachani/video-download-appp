package o;

import o.C8901q20;
import o.MK;
import o.UK;
import o.WK2;

/* renamed from: o.lI0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7731lI0 extends WK2 {
    public static int[] k = new int[2];

    /* renamed from: o.lI0$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WK2.b.values().length];
            a = iArr;
            try {
                iArr[WK2.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[WK2.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[WK2.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C7731lI0(UK uk) {
        super(uk);
        this.h.e = C8901q20.a.LEFT;
        this.i.e = C8901q20.a.RIGHT;
        this.f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x02a5, code lost:
        if (r7 != 1) goto L131;
     */
    @Override // o.WK2, o.InterfaceC7910m20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(InterfaceC7910m20 interfaceC7910m20) {
        C10126v30 c10126v30;
        float f;
        float A;
        float f2;
        int i;
        UK uk;
        int i2 = a.a[this.j.ordinal()];
        if (i2 == 1) {
            s(interfaceC7910m20);
        } else if (i2 == 2) {
            r(interfaceC7910m20);
        } else if (i2 == 3) {
            UK uk2 = this.b;
            q(interfaceC7910m20, uk2.Q, uk2.S, 0);
            return;
        }
        if (!this.e.j && this.d == UK.b.MATCH_CONSTRAINT) {
            UK uk3 = this.b;
            int i3 = uk3.w;
            if (i3 == 2) {
                UK U = uk3.U();
                if (U != null) {
                    if (U.e.e.j) {
                        this.e.e((int) ((c10126v30.g * this.b.B) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = uk3.x;
                if (i4 != 0 && i4 != 3) {
                    int B = uk3.B();
                    if (B == -1) {
                        UK uk4 = this.b;
                        f = uk4.f.e.g;
                        A = uk4.A();
                    } else if (B == 0) {
                        f2 = uk.f.e.g / this.b.A();
                        i = (int) (f2 + 0.5f);
                        this.e.e(i);
                    } else if (B == 1) {
                        UK uk5 = this.b;
                        f = uk5.f.e.g;
                        A = uk5.A();
                    } else {
                        i = 0;
                        this.e.e(i);
                    }
                    f2 = f * A;
                    i = (int) (f2 + 0.5f);
                    this.e.e(i);
                } else {
                    C6010eF2 c6010eF2 = uk3.f;
                    C8901q20 c8901q20 = c6010eF2.h;
                    C8901q20 c8901q202 = c6010eF2.i;
                    boolean z = uk3.Q.f != null;
                    boolean z2 = uk3.R.f != null;
                    boolean z3 = uk3.S.f != null;
                    boolean z4 = uk3.T.f != null;
                    int B2 = uk3.B();
                    if (z && z2 && z3 && z4) {
                        float A2 = this.b.A();
                        if (c8901q20.j && c8901q202.j) {
                            C8901q20 c8901q203 = this.h;
                            if (c8901q203.c && this.i.c) {
                                u(k, this.h.f + c8901q203.l.get(0).g, this.i.l.get(0).g - this.i.f, c8901q20.f + c8901q20.g, c8901q202.g - c8901q202.f, A2, B2);
                                this.e.e(k[0]);
                                this.b.f.e.e(k[1]);
                                return;
                            }
                            return;
                        }
                        C8901q20 c8901q204 = this.h;
                        if (c8901q204.j) {
                            C8901q20 c8901q205 = this.i;
                            if (c8901q205.j) {
                                if (!c8901q20.c || !c8901q202.c) {
                                    return;
                                }
                                u(k, c8901q204.g + c8901q204.f, c8901q205.g - c8901q205.f, c8901q20.f + c8901q20.l.get(0).g, c8901q202.l.get(0).g - c8901q202.f, A2, B2);
                                this.e.e(k[0]);
                                this.b.f.e.e(k[1]);
                            }
                        }
                        C8901q20 c8901q206 = this.h;
                        if (!c8901q206.c || !this.i.c || !c8901q20.c || !c8901q202.c) {
                            return;
                        }
                        u(k, this.h.f + c8901q206.l.get(0).g, this.i.l.get(0).g - this.i.f, c8901q20.f + c8901q20.l.get(0).g, c8901q202.l.get(0).g - c8901q202.f, A2, B2);
                        this.e.e(k[0]);
                        this.b.f.e.e(k[1]);
                    } else if (z && z3) {
                        if (!this.h.c || !this.i.c) {
                            return;
                        }
                        float A3 = this.b.A();
                        int i5 = this.h.l.get(0).g + this.h.f;
                        int i6 = this.i.l.get(0).g - this.i.f;
                        if (B2 == -1 || B2 == 0) {
                            int g = g(i6 - i5, 0);
                            int i7 = (int) ((g * A3) + 0.5f);
                            int g2 = g(i7, 1);
                            if (i7 != g2) {
                                g = (int) ((g2 / A3) + 0.5f);
                            }
                            this.e.e(g);
                            this.b.f.e.e(g2);
                        } else if (B2 == 1) {
                            int g3 = g(i6 - i5, 0);
                            int i8 = (int) ((g3 / A3) + 0.5f);
                            int g4 = g(i8, 1);
                            if (i8 != g4) {
                                g3 = (int) ((g4 * A3) + 0.5f);
                            }
                            this.e.e(g3);
                            this.b.f.e.e(g4);
                        }
                    } else if (z2 && z4) {
                        if (!c8901q20.c || !c8901q202.c) {
                            return;
                        }
                        float A4 = this.b.A();
                        int i9 = c8901q20.l.get(0).g + c8901q20.f;
                        int i10 = c8901q202.l.get(0).g - c8901q202.f;
                        if (B2 != -1) {
                            if (B2 == 0) {
                                int g5 = g(i10 - i9, 1);
                                int i11 = (int) ((g5 * A4) + 0.5f);
                                int g6 = g(i11, 0);
                                if (i11 != g6) {
                                    g5 = (int) ((g6 / A4) + 0.5f);
                                }
                                this.e.e(g6);
                                this.b.f.e.e(g5);
                            }
                        }
                        int g7 = g(i10 - i9, 1);
                        int i12 = (int) ((g7 / A4) + 0.5f);
                        int g8 = g(i12, 0);
                        if (i12 != g8) {
                            g7 = (int) ((g8 * A4) + 0.5f);
                        }
                        this.e.e(g8);
                        this.b.f.e.e(g7);
                    }
                }
            }
        }
        C8901q20 c8901q207 = this.h;
        if (c8901q207.c) {
            C8901q20 c8901q208 = this.i;
            if (c8901q208.c) {
                if (c8901q207.j && c8901q208.j && this.e.j) {
                    return;
                }
                if (!this.e.j && this.d == UK.b.MATCH_CONSTRAINT) {
                    UK uk6 = this.b;
                    if (uk6.w == 0 && !uk6.B0()) {
                        int i13 = this.h.l.get(0).g;
                        C8901q20 c8901q209 = this.h;
                        int i14 = i13 + c8901q209.f;
                        int i15 = this.i.l.get(0).g + this.i.f;
                        c8901q209.e(i14);
                        this.i.e(i15);
                        this.e.e(i15 - i14);
                        return;
                    }
                }
                if (!this.e.j && this.d == UK.b.MATCH_CONSTRAINT && this.a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
                    int min = Math.min((this.i.l.get(0).g + this.i.f) - (this.h.l.get(0).g + this.h.f), this.e.m);
                    UK uk7 = this.b;
                    int i16 = uk7.A;
                    int max = Math.max(uk7.z, min);
                    if (i16 > 0) {
                        max = Math.min(i16, max);
                    }
                    this.e.e(max);
                }
                if (this.e.j) {
                    C8901q20 c8901q2010 = this.h.l.get(0);
                    C8901q20 c8901q2011 = this.i.l.get(0);
                    int i17 = c8901q2010.g + this.h.f;
                    int i18 = c8901q2011.g + this.i.f;
                    float E = this.b.E();
                    if (c8901q2010 == c8901q2011) {
                        i17 = c8901q2010.g;
                        i18 = c8901q2011.g;
                        E = 0.5f;
                    }
                    this.h.e((int) (i17 + 0.5f + (((i18 - i17) - this.e.g) * E)));
                    this.i.e(this.h.g + this.e.g);
                }
            }
        }
    }

    @Override // o.WK2
    public void d() {
        UK U;
        UK U2;
        UK uk = this.b;
        if (uk.a) {
            this.e.e(uk.m0());
        }
        if (!this.e.j) {
            UK.b H = this.b.H();
            this.d = H;
            if (H != UK.b.MATCH_CONSTRAINT) {
                UK.b bVar = UK.b.MATCH_PARENT;
                if (H == bVar && (U2 = this.b.U()) != null && (U2.H() == UK.b.FIXED || U2.H() == bVar)) {
                    int m0 = (U2.m0() - this.b.Q.g()) - this.b.S.g();
                    b(this.h, U2.e.h, this.b.Q.g());
                    b(this.i, U2.e.i, -this.b.S.g());
                    this.e.e(m0);
                    return;
                } else if (this.d == UK.b.FIXED) {
                    this.e.e(this.b.m0());
                }
            }
        } else {
            UK.b bVar2 = this.d;
            UK.b bVar3 = UK.b.MATCH_PARENT;
            if (bVar2 == bVar3 && (U = this.b.U()) != null && (U.H() == UK.b.FIXED || U.H() == bVar3)) {
                b(this.h, U.e.h, this.b.Q.g());
                b(this.i, U.e.i, -this.b.S.g());
                return;
            }
        }
        C10126v30 c10126v30 = this.e;
        if (c10126v30.j) {
            UK uk2 = this.b;
            if (uk2.a) {
                MK[] mkArr = uk2.Y;
                MK mk = mkArr[0];
                MK mk2 = mk.f;
                if (mk2 != null && mkArr[1].f != null) {
                    if (uk2.B0()) {
                        this.h.f = this.b.Y[0].g();
                        this.i.f = -this.b.Y[1].g();
                        return;
                    }
                    C8901q20 h = h(this.b.Y[0]);
                    if (h != null) {
                        b(this.h, h, this.b.Y[0].g());
                    }
                    C8901q20 h2 = h(this.b.Y[1]);
                    if (h2 != null) {
                        b(this.i, h2, -this.b.Y[1].g());
                    }
                    this.h.b = true;
                    this.i.b = true;
                    return;
                } else if (mk2 != null) {
                    C8901q20 h3 = h(mk);
                    if (h3 != null) {
                        b(this.h, h3, this.b.Y[0].g());
                        b(this.i, this.h, this.e.g);
                        return;
                    }
                    return;
                } else {
                    MK mk3 = mkArr[1];
                    if (mk3.f != null) {
                        C8901q20 h4 = h(mk3);
                        if (h4 != null) {
                            b(this.i, h4, -this.b.Y[1].g());
                            b(this.h, this.i, -this.e.g);
                            return;
                        }
                        return;
                    } else if (!(uk2 instanceof InterfaceC8961qH0) && uk2.U() != null && this.b.r(MK.a.CENTER).f == null) {
                        b(this.h, this.b.U().e.h, this.b.o0());
                        b(this.i, this.h, this.e.g);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (this.d == UK.b.MATCH_CONSTRAINT) {
            UK uk3 = this.b;
            int i = uk3.w;
            if (i != 2) {
                if (i == 3) {
                    if (uk3.x == 3) {
                        this.h.a = this;
                        this.i.a = this;
                        C6010eF2 c6010eF2 = uk3.f;
                        c6010eF2.h.a = this;
                        c6010eF2.i.a = this;
                        c10126v30.a = this;
                        if (uk3.D0()) {
                            this.e.l.add(this.b.f.e);
                            this.b.f.e.k.add(this.e);
                            C6010eF2 c6010eF22 = this.b.f;
                            c6010eF22.e.a = this;
                            this.e.l.add(c6010eF22.h);
                            this.e.l.add(this.b.f.i);
                            this.b.f.h.k.add(this.e);
                            this.b.f.i.k.add(this.e);
                        } else if (this.b.B0()) {
                            this.b.f.e.l.add(this.e);
                            this.e.k.add(this.b.f.e);
                        } else {
                            this.b.f.e.l.add(this.e);
                        }
                    } else {
                        C10126v30 c10126v302 = uk3.f.e;
                        c10126v30.l.add(c10126v302);
                        c10126v302.k.add(this.e);
                        this.b.f.h.k.add(this.e);
                        this.b.f.i.k.add(this.e);
                        C10126v30 c10126v303 = this.e;
                        c10126v303.b = true;
                        c10126v303.k.add(this.h);
                        this.e.k.add(this.i);
                        this.h.l.add(this.e);
                        this.i.l.add(this.e);
                    }
                }
            } else {
                UK U3 = uk3.U();
                if (U3 != null) {
                    C10126v30 c10126v304 = U3.f.e;
                    this.e.l.add(c10126v304);
                    c10126v304.k.add(this.e);
                    C10126v30 c10126v305 = this.e;
                    c10126v305.b = true;
                    c10126v305.k.add(this.h);
                    this.e.k.add(this.i);
                }
            }
        }
        UK uk4 = this.b;
        MK[] mkArr2 = uk4.Y;
        MK mk4 = mkArr2[0];
        MK mk5 = mk4.f;
        if (mk5 != null && mkArr2[1].f != null) {
            if (uk4.B0()) {
                this.h.f = this.b.Y[0].g();
                this.i.f = -this.b.Y[1].g();
                return;
            }
            C8901q20 h5 = h(this.b.Y[0]);
            C8901q20 h6 = h(this.b.Y[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.j = WK2.b.CENTER;
        } else if (mk5 != null) {
            C8901q20 h7 = h(mk4);
            if (h7 != null) {
                b(this.h, h7, this.b.Y[0].g());
                c(this.i, this.h, 1, this.e);
            }
        } else {
            MK mk6 = mkArr2[1];
            if (mk6.f != null) {
                C8901q20 h8 = h(mk6);
                if (h8 != null) {
                    b(this.i, h8, -this.b.Y[1].g());
                    c(this.h, this.i, -1, this.e);
                }
            } else if (!(uk4 instanceof InterfaceC8961qH0) && uk4.U() != null) {
                b(this.h, this.b.U().e.h, this.b.o0());
                c(this.i, this.h, 1, this.e);
            }
        }
    }

    @Override // o.WK2
    public void e() {
        C8901q20 c8901q20 = this.h;
        if (c8901q20.j) {
            this.b.g2(c8901q20.g);
        }
    }

    @Override // o.WK2
    public void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // o.WK2
    public void n() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.e.j = false;
    }

    @Override // o.WK2
    public boolean p() {
        if (this.d != UK.b.MATCH_CONSTRAINT || this.b.w == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "HorizontalRun " + this.b.y();
    }

    public final void u(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    iArr[0] = i6;
                    iArr[1] = (int) ((i6 * f) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i7 * f) + 0.5f);
            iArr[1] = i7;
            return;
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }
}
