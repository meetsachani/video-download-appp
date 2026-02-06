package o;

import o.C8901q20;
import o.MK;
import o.UK;
import o.WK2;

/* renamed from: o.eF2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6010eF2 extends WK2 {
    public static final boolean m = true;
    public C8901q20 k;
    public C10126v30 l;

    /* renamed from: o.eF2$a */
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

    public C6010eF2(UK uk) {
        super(uk);
        C8901q20 c8901q20 = new C8901q20(this);
        this.k = c8901q20;
        this.l = null;
        this.h.e = C8901q20.a.TOP;
        this.i.e = C8901q20.a.BOTTOM;
        c8901q20.e = C8901q20.a.BASELINE;
        this.f = 1;
    }

    @Override // o.WK2, o.InterfaceC7910m20
    public void a(InterfaceC7910m20 interfaceC7910m20) {
        C10126v30 c10126v30;
        float f;
        float A;
        float f2;
        int i;
        UK uk;
        int i2 = a.a[this.j.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    UK uk2 = this.b;
                    q(interfaceC7910m20, uk2.R, uk2.T, 1);
                    return;
                }
            } else {
                r(interfaceC7910m20);
            }
        } else {
            s(interfaceC7910m20);
        }
        C10126v30 c10126v302 = this.e;
        if (c10126v302.c && !c10126v302.j && this.d == UK.b.MATCH_CONSTRAINT) {
            UK uk3 = this.b;
            int i3 = uk3.x;
            if (i3 != 2) {
                if (i3 == 3 && uk3.e.e.j) {
                    int B = uk3.B();
                    if (B != -1) {
                        if (B != 0) {
                            if (B != 1) {
                                i = 0;
                                this.e.e(i);
                            } else {
                                UK uk4 = this.b;
                                f = uk4.e.e.g;
                                A = uk4.A();
                            }
                        } else {
                            f2 = uk.e.e.g * this.b.A();
                            i = (int) (f2 + 0.5f);
                            this.e.e(i);
                        }
                    } else {
                        UK uk5 = this.b;
                        f = uk5.e.e.g;
                        A = uk5.A();
                    }
                    f2 = f / A;
                    i = (int) (f2 + 0.5f);
                    this.e.e(i);
                }
            } else {
                UK U = uk3.U();
                if (U != null) {
                    if (U.f.e.j) {
                        this.e.e((int) ((c10126v30.g * this.b.E) + 0.5f));
                    }
                }
            }
        }
        C8901q20 c8901q20 = this.h;
        if (c8901q20.c) {
            C8901q20 c8901q202 = this.i;
            if (c8901q202.c) {
                if (!c8901q20.j || !c8901q202.j || !this.e.j) {
                    if (!this.e.j && this.d == UK.b.MATCH_CONSTRAINT) {
                        UK uk6 = this.b;
                        if (uk6.w == 0 && !uk6.D0()) {
                            int i4 = this.h.l.get(0).g;
                            C8901q20 c8901q203 = this.h;
                            int i5 = i4 + c8901q203.f;
                            int i6 = this.i.l.get(0).g + this.i.f;
                            c8901q203.e(i5);
                            this.i.e(i6);
                            this.e.e(i6 - i5);
                            return;
                        }
                    }
                    if (!this.e.j && this.d == UK.b.MATCH_CONSTRAINT && this.a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
                        int i7 = (this.i.l.get(0).g + this.i.f) - (this.h.l.get(0).g + this.h.f);
                        C10126v30 c10126v303 = this.e;
                        int i8 = c10126v303.m;
                        if (i7 < i8) {
                            c10126v303.e(i7);
                        } else {
                            c10126v303.e(i8);
                        }
                    }
                    if (this.e.j && this.h.l.size() > 0 && this.i.l.size() > 0) {
                        C8901q20 c8901q204 = this.h.l.get(0);
                        C8901q20 c8901q205 = this.i.l.get(0);
                        int i9 = c8901q204.g + this.h.f;
                        int i10 = c8901q205.g + this.i.f;
                        float g0 = this.b.g0();
                        if (c8901q204 == c8901q205) {
                            i9 = c8901q204.g;
                            i10 = c8901q205.g;
                            g0 = 0.5f;
                        }
                        this.h.e((int) (i9 + 0.5f + (((i10 - i9) - this.e.g) * g0)));
                        this.i.e(this.h.g + this.e.g);
                    }
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
            this.e.e(uk.D());
        }
        if (!this.e.j) {
            this.d = this.b.j0();
            if (this.b.q0()) {
                this.l = new C4525Vl(this);
            }
            UK.b bVar = this.d;
            if (bVar != UK.b.MATCH_CONSTRAINT) {
                if (bVar == UK.b.MATCH_PARENT && (U2 = this.b.U()) != null && U2.j0() == UK.b.FIXED) {
                    int D = (U2.D() - this.b.R.g()) - this.b.T.g();
                    b(this.h, U2.f.h, this.b.R.g());
                    b(this.i, U2.f.i, -this.b.T.g());
                    this.e.e(D);
                    return;
                } else if (this.d == UK.b.FIXED) {
                    this.e.e(this.b.D());
                }
            }
        } else if (this.d == UK.b.MATCH_PARENT && (U = this.b.U()) != null && U.j0() == UK.b.FIXED) {
            b(this.h, U.f.h, this.b.R.g());
            b(this.i, U.f.i, -this.b.T.g());
            return;
        }
        C10126v30 c10126v30 = this.e;
        boolean z = c10126v30.j;
        if (z) {
            UK uk2 = this.b;
            if (uk2.a) {
                MK[] mkArr = uk2.Y;
                MK mk = mkArr[2];
                MK mk2 = mk.f;
                if (mk2 != null && mkArr[3].f != null) {
                    if (uk2.D0()) {
                        this.h.f = this.b.Y[2].g();
                        this.i.f = -this.b.Y[3].g();
                    } else {
                        C8901q20 h = h(this.b.Y[2]);
                        if (h != null) {
                            b(this.h, h, this.b.Y[2].g());
                        }
                        C8901q20 h2 = h(this.b.Y[3]);
                        if (h2 != null) {
                            b(this.i, h2, -this.b.Y[3].g());
                        }
                        this.h.b = true;
                        this.i.b = true;
                    }
                    if (this.b.q0()) {
                        b(this.k, this.h, this.b.t());
                        return;
                    }
                    return;
                } else if (mk2 != null) {
                    C8901q20 h3 = h(mk);
                    if (h3 != null) {
                        b(this.h, h3, this.b.Y[2].g());
                        b(this.i, this.h, this.e.g);
                        if (this.b.q0()) {
                            b(this.k, this.h, this.b.t());
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    MK mk3 = mkArr[3];
                    if (mk3.f != null) {
                        C8901q20 h4 = h(mk3);
                        if (h4 != null) {
                            b(this.i, h4, -this.b.Y[3].g());
                            b(this.h, this.i, -this.e.g);
                        }
                        if (this.b.q0()) {
                            b(this.k, this.h, this.b.t());
                            return;
                        }
                        return;
                    }
                    MK mk4 = mkArr[4];
                    if (mk4.f != null) {
                        C8901q20 h5 = h(mk4);
                        if (h5 != null) {
                            b(this.k, h5, 0);
                            b(this.h, this.k, -this.b.t());
                            b(this.i, this.h, this.e.g);
                            return;
                        }
                        return;
                    } else if (!(uk2 instanceof InterfaceC8961qH0) && uk2.U() != null && this.b.r(MK.a.CENTER).f == null) {
                        b(this.h, this.b.U().f.h, this.b.p0());
                        b(this.i, this.h, this.e.g);
                        if (this.b.q0()) {
                            b(this.k, this.h, this.b.t());
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (!z && this.d == UK.b.MATCH_CONSTRAINT) {
            UK uk3 = this.b;
            int i = uk3.x;
            if (i != 2) {
                if (i == 3 && !uk3.D0()) {
                    UK uk4 = this.b;
                    if (uk4.w != 3) {
                        C10126v30 c10126v302 = uk4.e.e;
                        this.e.l.add(c10126v302);
                        c10126v302.k.add(this.e);
                        C10126v30 c10126v303 = this.e;
                        c10126v303.b = true;
                        c10126v303.k.add(this.h);
                        this.e.k.add(this.i);
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
        } else {
            c10126v30.b(this);
        }
        UK uk5 = this.b;
        MK[] mkArr2 = uk5.Y;
        MK mk5 = mkArr2[2];
        MK mk6 = mk5.f;
        if (mk6 != null && mkArr2[3].f != null) {
            if (uk5.D0()) {
                this.h.f = this.b.Y[2].g();
                this.i.f = -this.b.Y[3].g();
            } else {
                C8901q20 h6 = h(this.b.Y[2]);
                C8901q20 h7 = h(this.b.Y[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.j = WK2.b.CENTER;
            }
            if (this.b.q0()) {
                c(this.k, this.h, 1, this.l);
            }
        } else if (mk6 != null) {
            C8901q20 h8 = h(mk5);
            if (h8 != null) {
                b(this.h, h8, this.b.Y[2].g());
                c(this.i, this.h, 1, this.e);
                if (this.b.q0()) {
                    c(this.k, this.h, 1, this.l);
                }
                UK.b bVar2 = this.d;
                UK.b bVar3 = UK.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.b.A() > 0.0f) {
                    C7731lI0 c7731lI0 = this.b.e;
                    if (c7731lI0.d == bVar3) {
                        c7731lI0.e.k.add(this.e);
                        this.e.l.add(this.b.e.e);
                        this.e.a = this;
                    }
                }
            }
        } else {
            MK mk7 = mkArr2[3];
            if (mk7.f != null) {
                C8901q20 h9 = h(mk7);
                if (h9 != null) {
                    b(this.i, h9, -this.b.Y[3].g());
                    c(this.h, this.i, -1, this.e);
                    if (this.b.q0()) {
                        c(this.k, this.h, 1, this.l);
                    }
                }
            } else {
                MK mk8 = mkArr2[4];
                if (mk8.f != null) {
                    C8901q20 h10 = h(mk8);
                    if (h10 != null) {
                        b(this.k, h10, 0);
                        c(this.h, this.k, -1, this.l);
                        c(this.i, this.h, 1, this.e);
                    }
                } else if (!(uk5 instanceof InterfaceC8961qH0) && uk5.U() != null) {
                    b(this.h, this.b.U().f.h, this.b.p0());
                    c(this.i, this.h, 1, this.e);
                    if (this.b.q0()) {
                        c(this.k, this.h, 1, this.l);
                    }
                    UK.b bVar4 = this.d;
                    UK.b bVar5 = UK.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.b.A() > 0.0f) {
                        C7731lI0 c7731lI02 = this.b.e;
                        if (c7731lI02.d == bVar5) {
                            c7731lI02.e.k.add(this.e);
                            this.e.l.add(this.b.e.e);
                            this.e.a = this;
                        }
                    }
                }
            }
        }
        if (this.e.l.size() == 0) {
            this.e.c = true;
        }
    }

    @Override // o.WK2
    public void e() {
        C8901q20 c8901q20 = this.h;
        if (c8901q20.j) {
            this.b.h2(c8901q20.g);
        }
    }

    @Override // o.WK2
    public void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
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
        this.k.c();
        this.k.j = false;
        this.e.j = false;
    }

    @Override // o.WK2
    public boolean p() {
        if (this.d != UK.b.MATCH_CONSTRAINT || this.b.x == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "VerticalRun " + this.b.y();
    }
}
