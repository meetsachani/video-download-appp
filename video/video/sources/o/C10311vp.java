package o;

/* renamed from: o.vp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10311vp {
    public final C2469An a;
    public final UT1 b;
    public final UT1 c;
    public final UT1 d;
    public final UT1 e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public C10311vp(C2469An c2469An, UT1 ut1, UT1 ut12, UT1 ut13, UT1 ut14) throws C9349rr1 {
        boolean z = false;
        boolean z2 = ut1 == null || ut12 == null;
        z = (ut13 == null || ut14 == null) ? true : z;
        if (z2 && z) {
            throw C9349rr1.a();
        }
        if (z2) {
            ut1 = new UT1(0.0f, ut13.d());
            ut12 = new UT1(0.0f, ut14.d());
        } else if (z) {
            ut13 = new UT1(c2469An.m() - 1, ut1.d());
            ut14 = new UT1(c2469An.m() - 1, ut12.d());
        }
        this.a = c2469An;
        this.b = ut1;
        this.c = ut12;
        this.d = ut13;
        this.e = ut14;
        this.f = (int) Math.min(ut1.c(), ut12.c());
        this.g = (int) Math.max(ut13.c(), ut14.c());
        this.h = (int) Math.min(ut1.d(), ut13.d());
        this.i = (int) Math.max(ut12.d(), ut14.d());
    }

    public static C10311vp j(C10311vp c10311vp, C10311vp c10311vp2) throws C9349rr1 {
        if (c10311vp == null) {
            return c10311vp2;
        }
        if (c10311vp2 == null) {
            return c10311vp;
        }
        return new C10311vp(c10311vp.a, c10311vp.b, c10311vp.c, c10311vp2.d, c10311vp2.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C10311vp a(int i, int i2, boolean z) throws C9349rr1 {
        UT1 ut1;
        UT1 ut12;
        UT1 ut13;
        UT1 ut14;
        UT1 ut15;
        UT1 ut16;
        UT1 ut17 = this.b;
        UT1 ut18 = this.c;
        UT1 ut19 = this.d;
        UT1 ut110 = this.e;
        if (i > 0) {
            if (z) {
                ut16 = ut17;
            } else {
                ut16 = ut19;
            }
            int d = ((int) ut16.d()) - i;
            if (d < 0) {
                d = 0;
            }
            UT1 ut111 = new UT1(ut16.c(), d);
            if (z) {
                ut1 = ut111;
            } else {
                ut12 = ut111;
                ut1 = ut17;
                if (i2 <= 0) {
                    if (z) {
                        ut15 = this.c;
                    } else {
                        ut15 = this.e;
                    }
                    int d2 = ((int) ut15.d()) + i2;
                    if (d2 >= this.a.i()) {
                        d2 = this.a.i() - 1;
                    }
                    UT1 ut112 = new UT1(ut15.c(), d2);
                    if (z) {
                        ut13 = ut112;
                    } else {
                        ut14 = ut112;
                        ut13 = ut18;
                        return new C10311vp(this.a, ut1, ut13, ut12, ut14);
                    }
                } else {
                    ut13 = ut18;
                }
                ut14 = ut110;
                return new C10311vp(this.a, ut1, ut13, ut12, ut14);
            }
        } else {
            ut1 = ut17;
        }
        ut12 = ut19;
        if (i2 <= 0) {
        }
        ut14 = ut110;
        return new C10311vp(this.a, ut1, ut13, ut12, ut14);
    }

    public UT1 b() {
        return this.c;
    }

    public UT1 c() {
        return this.e;
    }

    public int d() {
        return this.g;
    }

    public int e() {
        return this.i;
    }

    public int f() {
        return this.f;
    }

    public int g() {
        return this.h;
    }

    public UT1 h() {
        return this.b;
    }

    public UT1 i() {
        return this.d;
    }

    public C10311vp(C10311vp c10311vp) {
        this.a = c10311vp.a;
        this.b = c10311vp.h();
        this.c = c10311vp.b();
        this.d = c10311vp.i();
        this.e = c10311vp.c();
        this.f = c10311vp.f();
        this.g = c10311vp.d();
        this.h = c10311vp.g();
        this.i = c10311vp.e();
    }
}
