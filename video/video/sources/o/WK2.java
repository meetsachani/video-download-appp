package o;

import o.MK;
import o.UK;

/* loaded from: classes.dex */
public abstract class WK2 implements InterfaceC7910m20 {
    public int a;
    public UK b;
    public C7543kW1 c;
    public UK.b d;
    public C10126v30 e = new C10126v30(this);
    public int f = 0;
    public boolean g = false;
    public C8901q20 h = new C8901q20(this);
    public C8901q20 i = new C8901q20(this);
    public b j = b.NONE;

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
                a[MK.a.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[MK.a.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public WK2(UK uk) {
        this.b = uk;
    }

    public final void b(C8901q20 c8901q20, C8901q20 c8901q202, int i) {
        c8901q20.l.add(c8901q202);
        c8901q20.f = i;
        c8901q202.k.add(c8901q20);
    }

    public final void c(C8901q20 c8901q20, C8901q20 c8901q202, int i, C10126v30 c10126v30) {
        c8901q20.l.add(c8901q202);
        c8901q20.l.add(this.e);
        c8901q20.h = i;
        c8901q20.i = c10126v30;
        c8901q202.k.add(c8901q20);
        c10126v30.k.add(c8901q20);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        if (i2 == 0) {
            UK uk = this.b;
            int i3 = uk.A;
            int max = Math.max(uk.z, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            UK uk2 = this.b;
            int i4 = uk2.D;
            int max2 = Math.max(uk2.C, i);
            if (i4 > 0) {
                max2 = Math.min(i4, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    public final C8901q20 h(MK mk) {
        MK mk2 = mk.f;
        if (mk2 == null) {
            return null;
        }
        UK uk = mk2.d;
        int i = a.a[mk2.e.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return uk.f.i;
                    }
                    return uk.f.k;
                }
                return uk.f.h;
            }
            return uk.e.i;
        }
        return uk.e.h;
    }

    public final C8901q20 i(MK mk, int i) {
        WK2 wk2;
        MK mk2 = mk.f;
        if (mk2 == null) {
            return null;
        }
        UK uk = mk2.d;
        if (i == 0) {
            wk2 = uk.e;
        } else {
            wk2 = uk.f;
        }
        int i2 = a.a[mk2.e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return wk2.i;
        }
        return wk2.h;
    }

    public long j() {
        C10126v30 c10126v30 = this.e;
        if (c10126v30.j) {
            return c10126v30.g;
        }
        return 0L;
    }

    public boolean k() {
        int size = this.h.l.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.h.l.get(i2).d != this) {
                i++;
            }
        }
        int size2 = this.i.l.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (this.i.l.get(i3).d != this) {
                i++;
            }
        }
        if (i < 2) {
            return false;
        }
        return true;
    }

    public boolean l() {
        return this.e.j;
    }

    public boolean m() {
        return this.g;
    }

    public abstract void n();

    public final void o(int i, int i2) {
        WK2 wk2;
        float f;
        int i3;
        int i4 = this.a;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        UK uk = this.b;
                        WK2 wk22 = uk.e;
                        UK.b bVar = wk22.d;
                        UK.b bVar2 = UK.b.MATCH_CONSTRAINT;
                        if (bVar == bVar2 && wk22.a == 3) {
                            C6010eF2 c6010eF2 = uk.f;
                            if (c6010eF2.d == bVar2 && c6010eF2.a == 3) {
                                return;
                            }
                        }
                        if (i == 0) {
                            wk22 = uk.f;
                        }
                        if (wk22.e.j) {
                            float A = uk.A();
                            if (i == 1) {
                                i3 = (int) ((wk22.e.g / A) + 0.5f);
                            } else {
                                i3 = (int) ((A * wk22.e.g) + 0.5f);
                            }
                            this.e.e(i3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                UK U = this.b.U();
                if (U != null) {
                    if (i == 0) {
                        wk2 = U.e;
                    } else {
                        wk2 = U.f;
                    }
                    C10126v30 c10126v30 = wk2.e;
                    if (c10126v30.j) {
                        if (i == 0) {
                            f = this.b.B;
                        } else {
                            f = this.b.E;
                        }
                        this.e.e(g((int) ((c10126v30.g * f) + 0.5f), i));
                        return;
                    }
                    return;
                }
                return;
            }
            this.e.e(Math.min(g(this.e.m, i), i2));
            return;
        }
        this.e.e(g(i2, i));
    }

    public abstract boolean p();

    public void q(InterfaceC7910m20 interfaceC7910m20, MK mk, MK mk2, int i) {
        float g0;
        C8901q20 h = h(mk);
        C8901q20 h2 = h(mk2);
        if (h.j && h2.j) {
            int g = h.g + mk.g();
            int g2 = h2.g - mk2.g();
            int i2 = g2 - g;
            if (!this.e.j && this.d == UK.b.MATCH_CONSTRAINT) {
                o(i, i2);
            }
            C10126v30 c10126v30 = this.e;
            if (c10126v30.j) {
                if (c10126v30.g == i2) {
                    this.h.e(g);
                    this.i.e(g2);
                    return;
                }
                if (i == 0) {
                    g0 = this.b.E();
                } else {
                    g0 = this.b.g0();
                }
                if (h == h2) {
                    g = h.g;
                    g2 = h2.g;
                    g0 = 0.5f;
                }
                this.h.e((int) (g + 0.5f + (((g2 - g) - this.e.g) * g0)));
                this.i.e(this.h.g + this.e.g);
            }
        }
    }

    public long t(int i) {
        C10126v30 c10126v30 = this.e;
        if (c10126v30.j) {
            long j = c10126v30.g;
            if (k()) {
                return j + (this.h.f - this.i.f);
            }
            if (i == 0) {
                return j + this.h.f;
            }
            return j - this.i.f;
        }
        return 0L;
    }

    @Override // o.InterfaceC7910m20
    public void a(InterfaceC7910m20 interfaceC7910m20) {
    }

    public void r(InterfaceC7910m20 interfaceC7910m20) {
    }

    public void s(InterfaceC7910m20 interfaceC7910m20) {
    }
}
