package o;

import java.util.ArrayList;
import o.UK;

/* renamed from: o.Uz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4478Uz {
    public UK a;
    public UK b;
    public UK c;
    public UK d;
    public UK e;
    public UK f;
    public UK g;
    public ArrayList<UK> h;
    public int i;
    public int j;
    public float k = 0.0f;
    public int l;
    public int m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f631o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;

    public C4478Uz(UK uk, int i, boolean z) {
        this.a = uk;
        this.p = i;
        this.q = z;
    }

    public static boolean k(UK uk, int i) {
        if (uk.l0() != 8 && uk.b0[i] == UK.b.MATCH_CONSTRAINT) {
            int i2 = uk.y[i];
            if (i2 == 0 || i2 == 3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void a() {
        if (!this.v) {
            b();
        }
        this.v = true;
    }

    public final void b() {
        int i = this.p * 2;
        UK uk = this.a;
        boolean z = true;
        this.f631o = true;
        UK uk2 = uk;
        boolean z2 = false;
        while (!z2) {
            this.i++;
            UK[] ukArr = uk.P0;
            int i2 = this.p;
            UK uk3 = null;
            ukArr[i2] = null;
            uk.O0[i2] = null;
            if (uk.l0() != 8) {
                this.l++;
                UK.b z3 = uk.z(this.p);
                UK.b bVar = UK.b.MATCH_CONSTRAINT;
                if (z3 != bVar) {
                    this.m += uk.M(this.p);
                }
                int g = this.m + uk.Y[i].g();
                this.m = g;
                int i3 = i + 1;
                this.m = g + uk.Y[i3].g();
                int g2 = this.n + uk.Y[i].g();
                this.n = g2;
                this.n = g2 + uk.Y[i3].g();
                if (this.b == null) {
                    this.b = uk;
                }
                this.d = uk;
                UK.b[] bVarArr = uk.b0;
                int i4 = this.p;
                if (bVarArr[i4] == bVar) {
                    int i5 = uk.y[i4];
                    if (i5 == 0 || i5 == 3 || i5 == 2) {
                        this.j++;
                        float f = uk.N0[i4];
                        if (f > 0.0f) {
                            this.k += f;
                        }
                        if (k(uk, i4)) {
                            if (f < 0.0f) {
                                this.r = true;
                            } else {
                                this.s = true;
                            }
                            if (this.h == null) {
                                this.h = new ArrayList<>();
                            }
                            this.h.add(uk);
                        }
                        if (this.f == null) {
                            this.f = uk;
                        }
                        UK uk4 = this.g;
                        if (uk4 != null) {
                            uk4.O0[this.p] = uk;
                        }
                        this.g = uk;
                    }
                    if (this.p == 0) {
                        if (uk.w != 0) {
                            this.f631o = false;
                        } else if (uk.z != 0 || uk.A != 0) {
                            this.f631o = false;
                        }
                    } else if (uk.x != 0) {
                        this.f631o = false;
                    } else if (uk.C != 0 || uk.D != 0) {
                        this.f631o = false;
                    }
                    if (uk.f0 != 0.0f) {
                        this.f631o = false;
                        this.u = true;
                    }
                }
            }
            if (uk2 != uk) {
                uk2.P0[this.p] = uk;
            }
            MK mk = uk.Y[i + 1].f;
            if (mk != null) {
                UK uk5 = mk.d;
                MK mk2 = uk5.Y[i].f;
                if (mk2 != null && mk2.d == uk) {
                    uk3 = uk5;
                }
            }
            if (uk3 == null) {
                uk3 = uk;
                z2 = true;
            }
            uk2 = uk;
            uk = uk3;
        }
        UK uk6 = this.b;
        if (uk6 != null) {
            this.m -= uk6.Y[i].g();
        }
        UK uk7 = this.d;
        if (uk7 != null) {
            this.m -= uk7.Y[i + 1].g();
        }
        this.c = uk;
        if (this.p == 0 && this.q) {
            this.e = uk;
        } else {
            this.e = this.a;
        }
        if (!this.s || !this.r) {
            z = false;
        }
        this.t = z;
    }

    public UK c() {
        return this.a;
    }

    public UK d() {
        return this.f;
    }

    public UK e() {
        return this.b;
    }

    public UK f() {
        return this.e;
    }

    public UK g() {
        return this.c;
    }

    public UK h() {
        return this.g;
    }

    public UK i() {
        return this.d;
    }

    public float j() {
        return this.k;
    }
}
