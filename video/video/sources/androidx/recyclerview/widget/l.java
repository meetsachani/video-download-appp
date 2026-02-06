package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import o.C7139ir2;

/* loaded from: classes.dex */
public final class l implements Runnable {
    public static final ThreadLocal<l> Z0 = new ThreadLocal<>();
    public static Comparator<c> a1 = new a();
    public long Y;
    public long Z;
    public ArrayList<RecyclerView> X = new ArrayList<>();
    public ArrayList<c> Y0 = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            boolean z;
            boolean z2;
            RecyclerView recyclerView = cVar.d;
            if (recyclerView == null) {
                z = true;
            } else {
                z = false;
            }
            if (cVar2.d == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                if (recyclerView == null) {
                    return 1;
                }
                return -1;
            }
            boolean z3 = cVar.a;
            if (z3 != cVar2.a) {
                if (!z3) {
                    return 1;
                }
                return -1;
            }
            int i = cVar2.b - cVar.b;
            if (i != 0) {
                return i;
            }
            int i2 = cVar.c - cVar2.c;
            if (i2 == 0) {
                return 0;
            }
            return i2;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements RecyclerView.p.c {
        public int a;
        public int b;
        public int[] c;
        public int d;

        @Override // androidx.recyclerview.widget.RecyclerView.p.c
        public void a(int i, int i2) {
            if (i >= 0) {
                if (i2 >= 0) {
                    int i3 = this.d;
                    int i4 = i3 * 2;
                    int[] iArr = this.c;
                    if (iArr == null) {
                        int[] iArr2 = new int[4];
                        this.c = iArr2;
                        Arrays.fill(iArr2, -1);
                    } else if (i4 >= iArr.length) {
                        int[] iArr3 = new int[i3 * 4];
                        this.c = iArr3;
                        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    }
                    int[] iArr4 = this.c;
                    iArr4[i4] = i;
                    iArr4[i4 + 1] = i2;
                    this.d++;
                    return;
                }
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }

        public void b() {
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.d = 0;
        }

        public void c(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.l1;
            if (recyclerView.k1 != null && pVar != null && pVar.M0()) {
                if (z) {
                    if (!recyclerView.c1.q()) {
                        pVar.x(recyclerView.k1.g(), this);
                    }
                } else if (!recyclerView.H0()) {
                    pVar.w(this.a, this.b, recyclerView.e2, this);
                }
                int i = this.d;
                if (i > pVar.m) {
                    pVar.m = i;
                    pVar.n = z;
                    recyclerView.a1.Q();
                }
            }
        }

        public boolean d(int i) {
            if (this.c != null) {
                int i2 = this.d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;

        public void a() {
            this.a = false;
            this.b = 0;
            this.c = 0;
            this.d = null;
            this.e = 0;
        }
    }

    public static boolean e(RecyclerView recyclerView, int i) {
        int j = recyclerView.d1.j();
        for (int i2 = 0; i2 < j; i2++) {
            RecyclerView.H x0 = RecyclerView.x0(recyclerView.d1.i(i2));
            if (x0.c == i && !x0.x()) {
                return true;
            }
        }
        return false;
    }

    public void a(RecyclerView recyclerView) {
        this.X.add(recyclerView);
    }

    public final void b() {
        c cVar;
        boolean z;
        int size = this.X.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.X.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.d2.c(recyclerView, false);
                i += recyclerView.d2.d;
            }
        }
        this.Y0.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.X.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.d2;
                int abs = Math.abs(bVar.a) + Math.abs(bVar.b);
                for (int i5 = 0; i5 < bVar.d * 2; i5 += 2) {
                    if (i3 >= this.Y0.size()) {
                        cVar = new c();
                        this.Y0.add(cVar);
                    } else {
                        cVar = this.Y0.get(i3);
                    }
                    int[] iArr = bVar.c;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= abs) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar.a = z;
                    cVar.b = abs;
                    cVar.c = i6;
                    cVar.d = recyclerView2;
                    cVar.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.Y0, a1);
    }

    public final void c(c cVar, long j) {
        long j2;
        if (cVar.a) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j;
        }
        RecyclerView.H i = i(cVar.d, cVar.e, j2);
        if (i != null && i.b != null && i.w() && !i.x()) {
            h(i.b.get(), j);
        }
    }

    public final void d(long j) {
        for (int i = 0; i < this.Y0.size(); i++) {
            c cVar = this.Y0.get(i);
            if (cVar.d != null) {
                c(cVar, j);
                cVar.a();
            } else {
                return;
            }
        }
    }

    public void f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.Y == 0) {
            this.Y = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.d2.e(i, i2);
    }

    public void g(long j) {
        b();
        d(j);
    }

    public final void h(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.D1 && recyclerView.d1.j() != 0) {
                recyclerView.w1();
            }
            b bVar = recyclerView.d2;
            bVar.c(recyclerView, true);
            if (bVar.d != 0) {
                try {
                    C7139ir2.b(RecyclerView.d3);
                    recyclerView.e2.k(recyclerView.k1);
                    for (int i = 0; i < bVar.d * 2; i += 2) {
                        i(recyclerView, bVar.c[i], j);
                    }
                } finally {
                    C7139ir2.d();
                }
            }
        }
    }

    public final RecyclerView.H i(RecyclerView recyclerView, int i, long j) {
        if (e(recyclerView, i)) {
            return null;
        }
        RecyclerView.x xVar = recyclerView.a1;
        try {
            recyclerView.g1();
            RecyclerView.H O = xVar.O(i, false, j);
            if (O != null) {
                if (O.w() && !O.x()) {
                    xVar.H(O.a);
                } else {
                    xVar.a(O, false);
                }
            }
            recyclerView.i1(false);
            return O;
        } catch (Throwable th) {
            recyclerView.i1(false);
            throw th;
        }
    }

    public void j(RecyclerView recyclerView) {
        this.X.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C7139ir2.b(RecyclerView.c3);
            if (!this.X.isEmpty()) {
                int size = this.X.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.X.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j) + this.Z);
                }
            }
        } finally {
            this.Y = 0L;
            C7139ir2.d();
        }
    }
}
