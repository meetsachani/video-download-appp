package o;

/* loaded from: classes3.dex */
public final class F20 extends E20 {
    public final boolean d;

    public F20(C10311vp c10311vp, boolean z) {
        super(c10311vp);
        this.d = z;
    }

    public void g(C4033Qk c4033Qk) {
        UT1 i;
        UT1 c;
        boolean z;
        VE[] d = d();
        m();
        l(d, c4033Qk);
        C10311vp a = a();
        if (this.d) {
            i = a.h();
        } else {
            i = a.i();
        }
        if (this.d) {
            c = a.b();
        } else {
            c = a.c();
        }
        int e = e((int) c.d());
        int i2 = -1;
        int i3 = 0;
        int i4 = 1;
        for (int e2 = e((int) i.d()); e2 < e; e2++) {
            VE ve = d[e2];
            if (ve != null) {
                int c2 = ve.c() - i2;
                if (c2 == 0) {
                    i3++;
                } else {
                    if (c2 == 1) {
                        i4 = Math.max(i4, i3);
                        i2 = ve.c();
                    } else if (c2 >= 0 && ve.c() < c4033Qk.c() && c2 <= e2) {
                        if (i4 > 2) {
                            c2 *= i4 - 2;
                        }
                        if (c2 >= e2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        for (int i5 = 1; i5 <= c2 && !z; i5++) {
                            if (d[e2 - i5] != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            d[e2] = null;
                        } else {
                            i2 = ve.c();
                        }
                    } else {
                        d[e2] = null;
                    }
                    i3 = 1;
                }
            }
        }
    }

    public final void h(C4033Qk c4033Qk) {
        UT1 i;
        UT1 c;
        C10311vp a = a();
        if (this.d) {
            i = a.h();
        } else {
            i = a.i();
        }
        if (this.d) {
            c = a.b();
        } else {
            c = a.c();
        }
        int e = e((int) c.d());
        VE[] d = d();
        int i2 = -1;
        int i3 = 0;
        int i4 = 1;
        for (int e2 = e((int) i.d()); e2 < e; e2++) {
            VE ve = d[e2];
            if (ve != null) {
                ve.j();
                int c2 = ve.c() - i2;
                if (c2 == 0) {
                    i3++;
                } else {
                    if (c2 == 1) {
                        i4 = Math.max(i4, i3);
                        i2 = ve.c();
                    } else if (ve.c() >= c4033Qk.c()) {
                        d[e2] = null;
                    } else {
                        i2 = ve.c();
                    }
                    i3 = 1;
                }
            }
        }
    }

    public C4033Qk i() {
        VE[] d = d();
        C4230Sk c4230Sk = new C4230Sk();
        C4230Sk c4230Sk2 = new C4230Sk();
        C4230Sk c4230Sk3 = new C4230Sk();
        C4230Sk c4230Sk4 = new C4230Sk();
        for (VE ve : d) {
            if (ve != null) {
                ve.j();
                int e = ve.e() % 30;
                int c = ve.c();
                if (!this.d) {
                    c += 2;
                }
                int i = c % 3;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            c4230Sk.c(e + 1);
                        }
                    } else {
                        c4230Sk4.c(e / 3);
                        c4230Sk3.c(e % 3);
                    }
                } else {
                    c4230Sk2.c((e * 3) + 1);
                }
            }
        }
        if (c4230Sk.b().length != 0 && c4230Sk2.b().length != 0 && c4230Sk3.b().length != 0 && c4230Sk4.b().length != 0 && c4230Sk.b()[0] > 0 && c4230Sk2.b()[0] + c4230Sk3.b()[0] >= 3 && c4230Sk2.b()[0] + c4230Sk3.b()[0] <= 90) {
            C4033Qk c4033Qk = new C4033Qk(c4230Sk.b()[0], c4230Sk2.b()[0], c4230Sk3.b()[0], c4230Sk4.b()[0]);
            l(d, c4033Qk);
            return c4033Qk;
        }
        return null;
    }

    public int[] j() {
        VE[] d;
        int c;
        C4033Qk i = i();
        if (i == null) {
            return null;
        }
        h(i);
        int c2 = i.c();
        int[] iArr = new int[c2];
        for (VE ve : d()) {
            if (ve != null && (c = ve.c()) < c2) {
                iArr[c] = iArr[c] + 1;
            }
        }
        return iArr;
    }

    public boolean k() {
        return this.d;
    }

    public final void l(VE[] veArr, C4033Qk c4033Qk) {
        for (int i = 0; i < veArr.length; i++) {
            VE ve = veArr[i];
            if (ve != null) {
                int e = ve.e() % 30;
                int c = ve.c();
                if (c > c4033Qk.c()) {
                    veArr[i] = null;
                } else {
                    if (!this.d) {
                        c += 2;
                    }
                    int i2 = c % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && e + 1 != c4033Qk.a()) {
                                veArr[i] = null;
                            }
                        } else if (e / 3 != c4033Qk.b() || e % 3 != c4033Qk.d()) {
                            veArr[i] = null;
                        }
                    } else if ((e * 3) + 1 != c4033Qk.e()) {
                        veArr[i] = null;
                    }
                }
            }
        }
    }

    public final void m() {
        VE[] d;
        for (VE ve : d()) {
            if (ve != null) {
                ve.j();
            }
        }
    }

    @Override // o.E20
    public String toString() {
        return "IsLeft: " + this.d + '\n' + super.toString();
    }
}
