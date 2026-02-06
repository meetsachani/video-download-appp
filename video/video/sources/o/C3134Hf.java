package o;

import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import o.C2672Co2;
import o.InterfaceC4245Sn2;

/* renamed from: o.Hf  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3134Hf<T> {
    public static final String s = "AsyncListUtil";
    public static final boolean t = false;
    public final Class<T> a;
    public final int b;
    public final c<T> c;
    public final d d;
    public final C2672Co2<T> e;
    public final InterfaceC4245Sn2.b<T> f;
    public final InterfaceC4245Sn2.a<T> g;
    public boolean k;
    public final InterfaceC4245Sn2.b<T> q;
    public final InterfaceC4245Sn2.a<T> r;
    public final int[] h = new int[2];
    public final int[] i = new int[2];
    public final int[] j = new int[2];
    public int l = 0;
    public int m = 0;
    public int n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f489o = 0;
    public final SparseIntArray p = new SparseIntArray();

    /* renamed from: o.Hf$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC4245Sn2.b<T> {
        public a() {
        }

        @Override // o.InterfaceC4245Sn2.b
        public void a(int i, C2672Co2.a<T> aVar) {
            if (!d(i)) {
                C3134Hf.this.g.a(aVar);
                return;
            }
            C2672Co2.a<T> a = C3134Hf.this.e.a(aVar);
            if (a != null) {
                Log.e(C3134Hf.s, "duplicate tile @" + a.b);
                C3134Hf.this.g.a(a);
            }
            int i2 = aVar.b + aVar.c;
            int i3 = 0;
            while (i3 < C3134Hf.this.p.size()) {
                int keyAt = C3134Hf.this.p.keyAt(i3);
                if (aVar.b <= keyAt && keyAt < i2) {
                    C3134Hf.this.p.removeAt(i3);
                    C3134Hf.this.d.d(keyAt);
                } else {
                    i3++;
                }
            }
        }

        @Override // o.InterfaceC4245Sn2.b
        public void b(int i, int i2) {
            if (!d(i)) {
                return;
            }
            C2672Co2.a<T> e = C3134Hf.this.e.e(i2);
            if (e == null) {
                Log.e(C3134Hf.s, "tile not found @" + i2);
                return;
            }
            C3134Hf.this.g.a(e);
        }

        @Override // o.InterfaceC4245Sn2.b
        public void c(int i, int i2) {
            if (!d(i)) {
                return;
            }
            C3134Hf c3134Hf = C3134Hf.this;
            c3134Hf.m = i2;
            c3134Hf.d.c();
            C3134Hf c3134Hf2 = C3134Hf.this;
            c3134Hf2.n = c3134Hf2.f489o;
            e();
            C3134Hf c3134Hf3 = C3134Hf.this;
            c3134Hf3.k = false;
            c3134Hf3.g();
        }

        public final boolean d(int i) {
            if (i == C3134Hf.this.f489o) {
                return true;
            }
            return false;
        }

        public final void e() {
            for (int i = 0; i < C3134Hf.this.e.f(); i++) {
                C3134Hf c3134Hf = C3134Hf.this;
                c3134Hf.g.a(c3134Hf.e.c(i));
            }
            C3134Hf.this.e.b();
        }
    }

    /* renamed from: o.Hf$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC4245Sn2.a<T> {
        public C2672Co2.a<T> a;
        public final SparseBooleanArray b = new SparseBooleanArray();
        public int c;
        public int d;
        public int e;
        public int f;

        public b() {
        }

        @Override // o.InterfaceC4245Sn2.a
        public void a(C2672Co2.a<T> aVar) {
            C3134Hf.this.c.c(aVar.a, aVar.c);
            aVar.d = this.a;
            this.a = aVar;
        }

        @Override // o.InterfaceC4245Sn2.a
        public void b(int i, int i2, int i3, int i4, int i5) {
            if (i > i2) {
                return;
            }
            int h = h(i);
            int h2 = h(i2);
            this.e = h(i3);
            int h3 = h(i4);
            this.f = h3;
            if (i5 == 1) {
                l(this.e, h2, i5, true);
                l(h2 + C3134Hf.this.b, this.f, i5, false);
                return;
            }
            l(h, h3, i5, false);
            l(this.e, h - C3134Hf.this.b, i5, true);
        }

        @Override // o.InterfaceC4245Sn2.a
        public void c(int i, int i2) {
            if (i(i)) {
                return;
            }
            C2672Co2.a<T> e = e();
            e.b = i;
            int min = Math.min(C3134Hf.this.b, this.d - i);
            e.c = min;
            C3134Hf.this.c.a(e.a, e.b, min);
            g(i2);
            f(e);
        }

        @Override // o.InterfaceC4245Sn2.a
        public void d(int i) {
            this.c = i;
            this.b.clear();
            int d = C3134Hf.this.c.d();
            this.d = d;
            C3134Hf.this.f.c(this.c, d);
        }

        public final C2672Co2.a<T> e() {
            C2672Co2.a<T> aVar = this.a;
            if (aVar != null) {
                this.a = aVar.d;
                return aVar;
            }
            C3134Hf c3134Hf = C3134Hf.this;
            return new C2672Co2.a<>(c3134Hf.a, c3134Hf.b);
        }

        public final void f(C2672Co2.a<T> aVar) {
            this.b.put(aVar.b, true);
            C3134Hf.this.f.a(this.c, aVar);
        }

        public final void g(int i) {
            int b = C3134Hf.this.c.b();
            while (this.b.size() >= b) {
                int keyAt = this.b.keyAt(0);
                SparseBooleanArray sparseBooleanArray = this.b;
                int keyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                int i2 = this.e - keyAt;
                int i3 = keyAt2 - this.f;
                if (i2 > 0 && (i2 >= i3 || i == 2)) {
                    k(keyAt);
                } else if (i3 > 0) {
                    if (i2 < i3 || i == 1) {
                        k(keyAt2);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }

        public final int h(int i) {
            return i - (i % C3134Hf.this.b);
        }

        public final boolean i(int i) {
            return this.b.get(i);
        }

        public final void j(String str, Object... objArr) {
            Log.d(C3134Hf.s, "[BKGR] " + String.format(str, objArr));
        }

        public final void k(int i) {
            this.b.delete(i);
            C3134Hf.this.f.b(this.c, i);
        }

        public final void l(int i, int i2, int i3, boolean z) {
            int i4;
            int i5 = i;
            while (i5 <= i2) {
                if (z) {
                    i4 = (i2 + i) - i5;
                } else {
                    i4 = i5;
                }
                C3134Hf.this.g.c(i4, i3);
                i5 += C3134Hf.this.b;
            }
        }
    }

    /* renamed from: o.Hf$d */
    /* loaded from: classes.dex */
    public static abstract class d {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;

        public void a(int[] iArr, int[] iArr2, int i) {
            int i2;
            int i3 = iArr[1];
            int i4 = iArr[0];
            int i5 = (i3 - i4) + 1;
            int i6 = i5 / 2;
            if (i == 1) {
                i2 = i5;
            } else {
                i2 = i6;
            }
            iArr2[0] = i4 - i2;
            if (i != 2) {
                i5 = i6;
            }
            iArr2[1] = i3 + i5;
        }

        public abstract void b(int[] iArr);

        public abstract void c();

        public abstract void d(int i);
    }

    public C3134Hf(Class<T> cls, int i, c<T> cVar, d dVar) {
        a aVar = new a();
        this.q = aVar;
        b bVar = new b();
        this.r = bVar;
        this.a = cls;
        this.b = i;
        this.c = cVar;
        this.d = dVar;
        this.e = new C2672Co2<>(i);
        C4027Qi1 c4027Qi1 = new C4027Qi1();
        this.f = c4027Qi1.b(aVar);
        this.g = c4027Qi1.a(bVar);
        f();
    }

    public T a(int i) {
        if (i >= 0 && i < this.m) {
            T d2 = this.e.d(i);
            if (d2 == null && !c()) {
                this.p.put(i, 0);
            }
            return d2;
        }
        throw new IndexOutOfBoundsException(i + " is not within 0 and " + this.m);
    }

    public int b() {
        return this.m;
    }

    public final boolean c() {
        if (this.f489o != this.n) {
            return true;
        }
        return false;
    }

    public void d(String str, Object... objArr) {
        Log.d(s, "[MAIN] " + String.format(str, objArr));
    }

    public void e() {
        if (c()) {
            return;
        }
        g();
        this.k = true;
    }

    public void f() {
        this.p.clear();
        InterfaceC4245Sn2.a<T> aVar = this.g;
        int i = this.f489o + 1;
        this.f489o = i;
        aVar.d(i);
    }

    public void g() {
        int i;
        this.d.b(this.h);
        int[] iArr = this.h;
        int i2 = iArr[0];
        int i3 = iArr[1];
        if (i2 <= i3 && i2 >= 0 && i3 < this.m) {
            if (!this.k) {
                this.l = 0;
            } else {
                int[] iArr2 = this.i;
                if (i2 <= iArr2[1] && (i = iArr2[0]) <= i3) {
                    if (i2 < i) {
                        this.l = 1;
                    } else if (i2 > i) {
                        this.l = 2;
                    }
                } else {
                    this.l = 0;
                }
            }
            int[] iArr3 = this.i;
            iArr3[0] = i2;
            iArr3[1] = i3;
            this.d.a(iArr, this.j, this.l);
            int[] iArr4 = this.j;
            iArr4[0] = Math.min(this.h[0], Math.max(iArr4[0], 0));
            int[] iArr5 = this.j;
            iArr5[1] = Math.max(this.h[1], Math.min(iArr5[1], this.m - 1));
            InterfaceC4245Sn2.a<T> aVar = this.g;
            int[] iArr6 = this.h;
            int i4 = iArr6[0];
            int i5 = iArr6[1];
            int[] iArr7 = this.j;
            aVar.b(i4, i5, iArr7[0], iArr7[1], this.l);
        }
    }

    /* renamed from: o.Hf$c */
    /* loaded from: classes.dex */
    public static abstract class c<T> {
        public abstract void a(T[] tArr, int i, int i2);

        public int b() {
            return 10;
        }

        public abstract int d();

        public void c(T[] tArr, int i) {
        }
    }
}
