package o;

import java.util.Arrays;

/* renamed from: o.Nd  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3713Nd extends AS {
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = 3;
    public static final int j = 4;
    public static final int k = 5;
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static final int f551o = 3;
    public static final int p = 4;
    public static final int q = 5;
    public final double[] d;
    public a[] e;
    public boolean f = true;

    /* renamed from: o.Nd$a */
    /* loaded from: classes.dex */
    public static class a {
        public static final String s = "Arc";
        public static double[] t = new double[91];
        public static final double u = 0.001d;
        public double[] a;
        public double b;
        public double c;
        public double d;
        public double e;
        public double f;
        public double g;
        public double h;
        public double i;
        public double j;
        public double k;
        public double l;
        public double m;
        public double n;

        /* renamed from: o  reason: collision with root package name */
        public double f552o;
        public double p;
        public boolean q;
        public boolean r;

        public a(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            int i2;
            double d7;
            double d8;
            this.r = false;
            double d9 = d5 - d3;
            double d10 = d6 - d4;
            if (i != 1) {
                if (i != 4) {
                    if (i != 5) {
                        this.q = false;
                    } else {
                        this.q = d10 < 0.0d;
                    }
                } else {
                    this.q = d10 > 0.0d;
                }
            } else {
                this.q = true;
            }
            this.c = d;
            this.d = d2;
            this.i = 1.0d / (d2 - d);
            if (3 == i) {
                this.r = true;
            }
            if (!this.r && Math.abs(d9) >= 0.001d && Math.abs(d10) >= 0.001d) {
                this.a = new double[101];
                boolean z = this.q;
                if (z) {
                    i2 = -1;
                } else {
                    i2 = 1;
                }
                this.j = d9 * i2;
                this.k = d10 * (z ? 1 : -1);
                if (z) {
                    d7 = d5;
                } else {
                    d7 = d3;
                }
                this.l = d7;
                if (z) {
                    d8 = d4;
                } else {
                    d8 = d6;
                }
                this.m = d8;
                a(d3, d4, d5, d6);
                this.n = this.b * this.i;
                return;
            }
            this.r = true;
            this.e = d3;
            this.f = d5;
            this.g = d4;
            this.h = d6;
            double hypot = Math.hypot(d10, d9);
            this.b = hypot;
            this.n = hypot * this.i;
            double d11 = this.d;
            double d12 = this.c;
            this.l = d9 / (d11 - d12);
            this.m = d10 / (d11 - d12);
        }

        public final void a(double d, double d2, double d3, double d4) {
            double[] dArr;
            double[] dArr2;
            double d5 = d3 - d;
            double d6 = d2 - d4;
            int i = 0;
            double d7 = 0.0d;
            double d8 = 0.0d;
            double d9 = 0.0d;
            while (true) {
                if (i >= t.length) {
                    break;
                }
                int i2 = i;
                double radians = Math.toRadians((i * 90.0d) / (dArr.length - 1));
                double sin = Math.sin(radians) * d5;
                double cos = Math.cos(radians) * d6;
                if (i2 > 0) {
                    d7 += Math.hypot(sin - d8, cos - d9);
                    t[i2] = d7;
                }
                i = i2 + 1;
                d8 = sin;
                d9 = cos;
            }
            this.b = d7;
            int i3 = 0;
            while (true) {
                double[] dArr3 = t;
                if (i3 >= dArr3.length) {
                    break;
                }
                dArr3[i3] = dArr3[i3] / d7;
                i3++;
            }
            int i4 = 0;
            while (true) {
                if (i4 < this.a.length) {
                    double length = i4 / (dArr2.length - 1);
                    int binarySearch = Arrays.binarySearch(t, length);
                    if (binarySearch >= 0) {
                        this.a[i4] = binarySearch / (t.length - 1);
                    } else if (binarySearch == -1) {
                        this.a[i4] = 0.0d;
                    } else {
                        int i5 = -binarySearch;
                        int i6 = i5 - 2;
                        double[] dArr4 = t;
                        double d10 = dArr4[i6];
                        this.a[i4] = (i6 + ((length - d10) / (dArr4[i5 - 1] - d10))) / (dArr4.length - 1);
                    }
                    i4++;
                } else {
                    return;
                }
            }
        }

        public double b() {
            double d = this.j * this.p;
            double hypot = this.n / Math.hypot(d, (-this.k) * this.f552o);
            if (this.q) {
                return (-d) * hypot;
            }
            return d * hypot;
        }

        public double c() {
            double d = this.j * this.p;
            double d2 = (-this.k) * this.f552o;
            double hypot = this.n / Math.hypot(d, d2);
            if (this.q) {
                return (-d2) * hypot;
            }
            return d2 * hypot;
        }

        public double d(double d) {
            return this.l;
        }

        public double e(double d) {
            return this.m;
        }

        public double f(double d) {
            double d2 = (d - this.c) * this.i;
            double d3 = this.e;
            return d3 + (d2 * (this.f - d3));
        }

        public double g(double d) {
            double d2 = (d - this.c) * this.i;
            double d3 = this.g;
            return d3 + (d2 * (this.h - d3));
        }

        public double h() {
            return this.l + (this.j * this.f552o);
        }

        public double i() {
            return this.m + (this.k * this.p);
        }

        public double j(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.a;
            double length = d * (dArr.length - 1);
            int i = (int) length;
            double d2 = length - i;
            double d3 = dArr[i];
            return d3 + (d2 * (dArr[i + 1] - d3));
        }

        public void k(double d) {
            double d2;
            if (this.q) {
                d2 = this.d - d;
            } else {
                d2 = d - this.c;
            }
            double j = j(d2 * this.i) * 1.5707963267948966d;
            this.f552o = Math.sin(j);
            this.p = Math.cos(j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r5 == 1) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3713Nd(int[] iArr, double[] dArr, double[][] dArr2) {
        this.d = dArr;
        this.e = new a[dArr.length - 1];
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        while (true) {
            a[] aVarArr = this.e;
            if (i4 < aVarArr.length) {
                int i5 = iArr[i4];
                int i6 = 3;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 3) {
                                i6 = 4;
                                if (i5 != 4) {
                                    i6 = 5;
                                    if (i5 != 5) {
                                        i6 = i3;
                                    }
                                }
                            }
                        }
                        i2 = 2;
                        i6 = i2;
                    }
                    i2 = 1;
                    i6 = i2;
                }
                double d = dArr[i4];
                int i7 = i4 + 1;
                double d2 = dArr[i7];
                double[] dArr3 = dArr2[i4];
                double d3 = dArr3[0];
                double d4 = dArr3[1];
                double[] dArr4 = dArr2[i7];
                aVarArr[i4] = new a(i6, d, d2, d3, d4, dArr4[0], dArr4[1]);
                i4 = i7;
                i3 = i6;
            } else {
                return;
            }
        }
    }

    @Override // o.AS
    public double c(double d, int i2) {
        double g2;
        double e;
        double i3;
        double c;
        double g3;
        double e2;
        int i4 = 0;
        if (this.f) {
            a[] aVarArr = this.e;
            a aVar = aVarArr[0];
            double d2 = aVar.c;
            if (d < d2) {
                double d3 = d - d2;
                if (aVar.r) {
                    if (i2 == 0) {
                        g3 = aVar.f(d2);
                        e2 = this.e[0].d(d2);
                    } else {
                        g3 = aVar.g(d2);
                        e2 = this.e[0].e(d2);
                    }
                    return g3 + (d3 * e2);
                }
                aVar.k(d2);
                if (i2 == 0) {
                    i3 = this.e[0].h();
                    c = this.e[0].b();
                } else {
                    i3 = this.e[0].i();
                    c = this.e[0].c();
                }
                return i3 + (d3 * c);
            } else if (d > aVarArr[aVarArr.length - 1].d) {
                double d4 = aVarArr[aVarArr.length - 1].d;
                double d5 = d - d4;
                int length = aVarArr.length - 1;
                if (i2 == 0) {
                    g2 = aVarArr[length].f(d4);
                    e = this.e[length].d(d4);
                } else {
                    g2 = aVarArr[length].g(d4);
                    e = this.e[length].e(d4);
                }
                return g2 + (d5 * e);
            }
        } else {
            a[] aVarArr2 = this.e;
            double d6 = aVarArr2[0].c;
            if (d < d6) {
                d = d6;
            } else if (d > aVarArr2[aVarArr2.length - 1].d) {
                d = aVarArr2[aVarArr2.length - 1].d;
            }
        }
        while (true) {
            a[] aVarArr3 = this.e;
            if (i4 < aVarArr3.length) {
                a aVar2 = aVarArr3[i4];
                if (d <= aVar2.d) {
                    if (aVar2.r) {
                        if (i2 == 0) {
                            return aVar2.f(d);
                        }
                        return aVar2.g(d);
                    }
                    aVar2.k(d);
                    if (i2 == 0) {
                        return this.e[i4].h();
                    }
                    return this.e[i4].i();
                }
                i4++;
            } else {
                return Double.NaN;
            }
        }
    }

    @Override // o.AS
    public void d(double d, double[] dArr) {
        if (this.f) {
            a[] aVarArr = this.e;
            a aVar = aVarArr[0];
            double d2 = aVar.c;
            if (d < d2) {
                double d3 = d - d2;
                if (aVar.r) {
                    dArr[0] = aVar.f(d2) + (this.e[0].d(d2) * d3);
                    dArr[1] = this.e[0].g(d2) + (d3 * this.e[0].e(d2));
                    return;
                }
                aVar.k(d2);
                dArr[0] = this.e[0].h() + (this.e[0].b() * d3);
                dArr[1] = this.e[0].i() + (d3 * this.e[0].c());
                return;
            } else if (d > aVarArr[aVarArr.length - 1].d) {
                double d4 = aVarArr[aVarArr.length - 1].d;
                double d5 = d - d4;
                int length = aVarArr.length - 1;
                a aVar2 = aVarArr[length];
                if (aVar2.r) {
                    dArr[0] = aVar2.f(d4) + (this.e[length].d(d4) * d5);
                    dArr[1] = this.e[length].g(d4) + (d5 * this.e[length].e(d4));
                    return;
                }
                aVar2.k(d);
                dArr[0] = this.e[length].h() + (this.e[length].b() * d5);
                dArr[1] = this.e[length].i() + (d5 * this.e[length].c());
                return;
            }
        } else {
            a[] aVarArr2 = this.e;
            double d6 = aVarArr2[0].c;
            if (d < d6) {
                d = d6;
            }
            if (d > aVarArr2[aVarArr2.length - 1].d) {
                d = aVarArr2[aVarArr2.length - 1].d;
            }
        }
        int i2 = 0;
        while (true) {
            a[] aVarArr3 = this.e;
            if (i2 < aVarArr3.length) {
                a aVar3 = aVarArr3[i2];
                if (d <= aVar3.d) {
                    if (aVar3.r) {
                        dArr[0] = aVar3.f(d);
                        dArr[1] = this.e[i2].g(d);
                        return;
                    }
                    aVar3.k(d);
                    dArr[0] = this.e[i2].h();
                    dArr[1] = this.e[i2].i();
                    return;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // o.AS
    public void e(double d, float[] fArr) {
        if (this.f) {
            a[] aVarArr = this.e;
            a aVar = aVarArr[0];
            double d2 = aVar.c;
            if (d < d2) {
                double d3 = d - d2;
                if (aVar.r) {
                    fArr[0] = (float) (aVar.f(d2) + (this.e[0].d(d2) * d3));
                    fArr[1] = (float) (this.e[0].g(d2) + (d3 * this.e[0].e(d2)));
                    return;
                }
                aVar.k(d2);
                fArr[0] = (float) (this.e[0].h() + (this.e[0].b() * d3));
                fArr[1] = (float) (this.e[0].i() + (d3 * this.e[0].c()));
                return;
            } else if (d > aVarArr[aVarArr.length - 1].d) {
                double d4 = aVarArr[aVarArr.length - 1].d;
                double d5 = d - d4;
                int length = aVarArr.length - 1;
                a aVar2 = aVarArr[length];
                if (aVar2.r) {
                    fArr[0] = (float) (aVar2.f(d4) + (this.e[length].d(d4) * d5));
                    fArr[1] = (float) (this.e[length].g(d4) + (d5 * this.e[length].e(d4)));
                    return;
                }
                aVar2.k(d);
                fArr[0] = (float) this.e[length].h();
                fArr[1] = (float) this.e[length].i();
                return;
            }
        } else {
            a[] aVarArr2 = this.e;
            double d6 = aVarArr2[0].c;
            if (d < d6) {
                d = d6;
            } else if (d > aVarArr2[aVarArr2.length - 1].d) {
                d = aVarArr2[aVarArr2.length - 1].d;
            }
        }
        int i2 = 0;
        while (true) {
            a[] aVarArr3 = this.e;
            if (i2 < aVarArr3.length) {
                a aVar3 = aVarArr3[i2];
                if (d <= aVar3.d) {
                    if (aVar3.r) {
                        fArr[0] = (float) aVar3.f(d);
                        fArr[1] = (float) this.e[i2].g(d);
                        return;
                    }
                    aVar3.k(d);
                    fArr[0] = (float) this.e[i2].h();
                    fArr[1] = (float) this.e[i2].i();
                    return;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // o.AS
    public double f(double d, int i2) {
        a[] aVarArr = this.e;
        int i3 = 0;
        double d2 = aVarArr[0].c;
        if (d < d2) {
            d = d2;
        }
        if (d > aVarArr[aVarArr.length - 1].d) {
            d = aVarArr[aVarArr.length - 1].d;
        }
        while (true) {
            a[] aVarArr2 = this.e;
            if (i3 < aVarArr2.length) {
                a aVar = aVarArr2[i3];
                if (d <= aVar.d) {
                    if (aVar.r) {
                        if (i2 == 0) {
                            return aVar.d(d);
                        }
                        return aVar.e(d);
                    }
                    aVar.k(d);
                    if (i2 == 0) {
                        return this.e[i3].b();
                    }
                    return this.e[i3].c();
                }
                i3++;
            } else {
                return Double.NaN;
            }
        }
    }

    @Override // o.AS
    public void g(double d, double[] dArr) {
        a[] aVarArr = this.e;
        double d2 = aVarArr[0].c;
        if (d < d2) {
            d = d2;
        } else if (d > aVarArr[aVarArr.length - 1].d) {
            d = aVarArr[aVarArr.length - 1].d;
        }
        int i2 = 0;
        while (true) {
            a[] aVarArr2 = this.e;
            if (i2 < aVarArr2.length) {
                a aVar = aVarArr2[i2];
                if (d <= aVar.d) {
                    if (aVar.r) {
                        dArr[0] = aVar.d(d);
                        dArr[1] = this.e[i2].e(d);
                        return;
                    }
                    aVar.k(d);
                    dArr[0] = this.e[i2].b();
                    dArr[1] = this.e[i2].c();
                    return;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // o.AS
    public double[] h() {
        return this.d;
    }
}
