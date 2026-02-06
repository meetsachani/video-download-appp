package o;

import java.util.Arrays;
import java.util.Comparator;
import o.C3130He;

/* loaded from: classes.dex */
public class CH1 extends C3130He {

    /* renamed from: o  reason: collision with root package name */
    public static final float f425o = 1.0E-4f;
    public static final boolean p = false;
    public static final int q = -1;
    public int i;
    public Q92[] j;
    public Q92[] k;
    public int l;
    public b m;
    public C5191at n;

    /* loaded from: classes.dex */
    public class a implements Comparator<Q92> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Q92 q92, Q92 q922) {
            return q92.Z - q922.Z;
        }
    }

    /* loaded from: classes.dex */
    public class b {
        public Q92 a;
        public CH1 b;

        public b(CH1 ch1) {
            this.b = ch1;
        }

        public void a(Q92 q92) {
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.a.d1;
                float f = fArr[i] + q92.d1[i];
                fArr[i] = f;
                if (Math.abs(f) < 1.0E-4f) {
                    this.a.d1[i] = 0.0f;
                }
            }
        }

        public boolean b(Q92 q92, float f) {
            boolean z = true;
            if (this.a.X) {
                for (int i = 0; i < 9; i++) {
                    float[] fArr = this.a.d1;
                    float f2 = fArr[i] + (q92.d1[i] * f);
                    fArr[i] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        this.a.d1[i] = 0.0f;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    CH1.this.J(this.a);
                }
                return false;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float f3 = q92.d1[i2];
                if (f3 != 0.0f) {
                    float f4 = f3 * f;
                    if (Math.abs(f4) < 1.0E-4f) {
                        f4 = 0.0f;
                    }
                    this.a.d1[i2] = f4;
                } else {
                    this.a.d1[i2] = 0.0f;
                }
            }
            return true;
        }

        public void c(Q92 q92) {
            this.a = q92;
        }

        public final boolean d() {
            for (int i = 8; i >= 0; i--) {
                float f = this.a.d1[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean e() {
            for (int i = 0; i < 9; i++) {
                if (this.a.d1[i] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        public final boolean f(Q92 q92) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = q92.d1[i];
                float f2 = this.a.d1[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        public void g() {
            Arrays.fill(this.a.d1, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.a != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.a.d1[i] + C4500Ve2.b;
                }
            }
            return str + "] " + this.a;
        }
    }

    public CH1(C5191at c5191at) {
        super(c5191at);
        this.i = 128;
        this.j = new Q92[128];
        this.k = new Q92[128];
        this.l = 0;
        this.m = new b(this);
        this.n = c5191at;
    }

    public final void I(Q92 q92) {
        int i;
        int i2 = this.l + 1;
        Q92[] q92Arr = this.j;
        if (i2 > q92Arr.length) {
            Q92[] q92Arr2 = (Q92[]) Arrays.copyOf(q92Arr, q92Arr.length * 2);
            this.j = q92Arr2;
            this.k = (Q92[]) Arrays.copyOf(q92Arr2, q92Arr2.length * 2);
        }
        Q92[] q92Arr3 = this.j;
        int i3 = this.l;
        q92Arr3[i3] = q92;
        int i4 = i3 + 1;
        this.l = i4;
        if (i4 > 1 && q92Arr3[i3].Z > q92.Z) {
            int i5 = 0;
            while (true) {
                i = this.l;
                if (i5 >= i) {
                    break;
                }
                this.k[i5] = this.j[i5];
                i5++;
            }
            Arrays.sort(this.k, 0, i, new a());
            for (int i6 = 0; i6 < this.l; i6++) {
                this.j[i6] = this.k[i6];
            }
        }
        q92.X = true;
        q92.e(this);
    }

    public final void J(Q92 q92) {
        int i = 0;
        while (i < this.l) {
            if (this.j[i] == q92) {
                while (true) {
                    int i2 = this.l;
                    if (i < i2 - 1) {
                        Q92[] q92Arr = this.j;
                        int i3 = i + 1;
                        q92Arr[i] = q92Arr[i3];
                        i = i3;
                    } else {
                        this.l = i2 - 1;
                        q92.X = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // o.C3130He, o.C9872u01.a
    public Q92 b(C9872u01 c9872u01, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.l; i2++) {
            Q92 q92 = this.j[i2];
            if (!zArr[q92.Z]) {
                this.m.c(q92);
                if (i == -1) {
                    if (!this.m.d()) {
                    }
                    i = i2;
                } else {
                    if (!this.m.f(this.j[i])) {
                    }
                    i = i2;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.j[i];
    }

    @Override // o.C3130He, o.C9872u01.a
    public void clear() {
        this.l = 0;
        this.b = 0.0f;
    }

    @Override // o.C3130He, o.C9872u01.a
    public void d(C9872u01 c9872u01, C3130He c3130He, boolean z) {
        Q92 q92 = c3130He.a;
        if (q92 == null) {
            return;
        }
        C3130He.a aVar = c3130He.e;
        int d = aVar.d();
        for (int i = 0; i < d; i++) {
            Q92 f = aVar.f(i);
            float n = aVar.n(i);
            this.m.c(f);
            if (this.m.b(q92, n)) {
                I(f);
            }
            this.b += c3130He.b * n;
        }
        J(q92);
    }

    @Override // o.C3130He, o.C9872u01.a
    public void f(Q92 q92) {
        this.m.c(q92);
        this.m.g();
        q92.d1[q92.Z0] = 1.0f;
        I(q92);
    }

    @Override // o.C3130He, o.C9872u01.a
    public boolean isEmpty() {
        if (this.l == 0) {
            return true;
        }
        return false;
    }

    @Override // o.C3130He
    public String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.l; i++) {
            this.m.c(this.j[i]);
            str = str + this.m + C4500Ve2.b;
        }
        return str;
    }
}
