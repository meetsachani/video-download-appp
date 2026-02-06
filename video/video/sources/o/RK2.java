package o;

/* loaded from: classes3.dex */
public final class RK2 {
    public static final int h = 10;
    public static final int i = 1;
    public final C2469An a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public RK2(C2469An c2469An) throws C9349rr1 {
        this(c2469An, 10, c2469An.m() / 2, c2469An.i() / 2);
    }

    public final UT1[] a(UT1 ut1, UT1 ut12, UT1 ut13, UT1 ut14) {
        float c = ut1.c();
        float d = ut1.d();
        float c2 = ut12.c();
        float d2 = ut12.d();
        float c3 = ut13.c();
        float d3 = ut13.d();
        float c4 = ut14.c();
        float d4 = ut14.d();
        if (c < this.c / 2.0f) {
            return new UT1[]{new UT1(c4 - 1.0f, d4 + 1.0f), new UT1(c2 + 1.0f, d2 + 1.0f), new UT1(c3 - 1.0f, d3 - 1.0f), new UT1(c + 1.0f, d - 1.0f)};
        }
        return new UT1[]{new UT1(c4 + 1.0f, d4 + 1.0f), new UT1(c2 + 1.0f, d2 - 1.0f), new UT1(c3 - 1.0f, d3 + 1.0f), new UT1(c - 1.0f, d - 1.0f)};
    }

    public final boolean b(int i2, int i3, int i4, boolean z) {
        if (z) {
            while (i2 <= i3) {
                if (this.a.f(i2, i4)) {
                    return true;
                }
                i2++;
            }
            return false;
        }
        while (i2 <= i3) {
            if (this.a.f(i4, i2)) {
                return true;
            }
            i2++;
        }
        return false;
    }

    public UT1[] c() throws C9349rr1 {
        int i2 = this.d;
        int i3 = this.e;
        int i4 = this.g;
        int i5 = this.f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = true;
        while (z7) {
            boolean z8 = false;
            boolean z9 = true;
            while (true) {
                if ((z9 || !z2) && i3 < this.c) {
                    z9 = b(i4, i5, i3, false);
                    if (z9) {
                        i3++;
                        z2 = true;
                        z8 = true;
                    } else if (!z2) {
                        i3++;
                    }
                }
            }
            if (i3 < this.c) {
                boolean z10 = true;
                while (true) {
                    if ((z10 || !z3) && i5 < this.b) {
                        z10 = b(i2, i3, i5, true);
                        if (z10) {
                            i5++;
                            z3 = true;
                            z8 = true;
                        } else if (!z3) {
                            i5++;
                        }
                    }
                }
                if (i5 < this.b) {
                    boolean z11 = true;
                    while (true) {
                        if ((z11 || !z4) && i2 >= 0) {
                            z11 = b(i4, i5, i2, false);
                            if (z11) {
                                i2--;
                                z4 = true;
                                z8 = true;
                            } else if (!z4) {
                                i2--;
                            }
                        }
                    }
                    if (i2 >= 0) {
                        z7 = z8;
                        boolean z12 = true;
                        while (true) {
                            if ((z12 || !z6) && i4 >= 0) {
                                z12 = b(i2, i3, i4, true);
                                if (z12) {
                                    i4--;
                                    z7 = true;
                                    z6 = true;
                                } else if (!z6) {
                                    i4--;
                                }
                            }
                        }
                        if (i4 >= 0) {
                            if (z7) {
                                z5 = true;
                            }
                        }
                    }
                }
            }
            z = true;
            break;
        }
        if (!z && z5) {
            int i6 = i3 - i2;
            UT1 ut1 = null;
            UT1 ut12 = null;
            for (int i7 = 1; ut12 == null && i7 < i6; i7++) {
                ut12 = d(i2, i5 - i7, i2 + i7, i5);
            }
            if (ut12 != null) {
                UT1 ut13 = null;
                for (int i8 = 1; ut13 == null && i8 < i6; i8++) {
                    ut13 = d(i2, i4 + i8, i2 + i8, i4);
                }
                if (ut13 != null) {
                    UT1 ut14 = null;
                    for (int i9 = 1; ut14 == null && i9 < i6; i9++) {
                        ut14 = d(i3, i4 + i9, i3 - i9, i4);
                    }
                    if (ut14 != null) {
                        for (int i10 = 1; ut1 == null && i10 < i6; i10++) {
                            ut1 = d(i3, i5 - i10, i3 - i10, i5);
                        }
                        if (ut1 != null) {
                            return a(ut1, ut12, ut14, ut13);
                        }
                        throw C9349rr1.a();
                    }
                    throw C9349rr1.a();
                }
                throw C9349rr1.a();
            }
            throw C9349rr1.a();
        }
        throw C9349rr1.a();
    }

    public final UT1 d(float f, float f2, float f3, float f4) {
        int c = C9044qd1.c(C9044qd1.a(f, f2, f3, f4));
        float f5 = c;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i2 = 0; i2 < c; i2++) {
            float f8 = i2;
            int c2 = C9044qd1.c((f8 * f6) + f);
            int c3 = C9044qd1.c((f8 * f7) + f2);
            if (this.a.f(c2, c3)) {
                return new UT1(c2, c3);
            }
        }
        return null;
    }

    public RK2(C2469An c2469An, int i2, int i3, int i4) throws C9349rr1 {
        this.a = c2469An;
        int i5 = c2469An.i();
        this.b = i5;
        int m = c2469An.m();
        this.c = m;
        int i6 = i2 / 2;
        int i7 = i3 - i6;
        this.d = i7;
        int i8 = i3 + i6;
        this.e = i8;
        int i9 = i4 - i6;
        this.g = i9;
        int i10 = i4 + i6;
        this.f = i10;
        if (i9 < 0 || i7 < 0 || i10 >= i5 || i8 >= m) {
            throw C9349rr1.a();
        }
    }
}
