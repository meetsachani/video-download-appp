package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.C.b {
    public static final String Q = "StaggeredGridLManager";
    public static final boolean R = false;
    public static final int S = 0;
    public static final int T = 1;
    public static final int U = 0;
    @Deprecated
    public static final int V = 1;
    public static final int W = 2;
    public static final int X = Integer.MIN_VALUE;
    public static final float Y = 0.33333334f;
    public BitSet B;
    public boolean G;
    public boolean H;
    public e I;
    public int J;
    public int[] O;
    public f[] t;
    public t u;
    public t v;
    public int w;
    public int x;
    public final n y;
    public int s = -1;
    public boolean z = false;
    public boolean A = false;
    public int C = -1;
    public int D = Integer.MIN_VALUE;
    public d E = new d();
    public int F = 2;
    public final Rect K = new Rect();
    public final b L = new b();
    public boolean M = false;
    public boolean N = true;
    public final Runnable P = new a();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.u2();
        }
    }

    /* loaded from: classes.dex */
    public class b {
        public int a;
        public int b;
        public boolean c;
        public boolean d;
        public boolean e;
        public int[] f;

        public b() {
            c();
        }

        public void a() {
            int n;
            if (this.c) {
                n = StaggeredGridLayoutManager.this.u.i();
            } else {
                n = StaggeredGridLayoutManager.this.u.n();
            }
            this.b = n;
        }

        public void b(int i) {
            if (this.c) {
                this.b = StaggeredGridLayoutManager.this.u.i() - i;
            } else {
                this.b = StaggeredGridLayoutManager.this.u.n() + i;
            }
        }

        public void c() {
            this.a = -1;
            this.b = Integer.MIN_VALUE;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f;
            if (iArr == null || iArr.length < length) {
                this.f = new int[StaggeredGridLayoutManager.this.t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f[i] = fVarArr[i].u(Integer.MIN_VALUE);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.q {
        public static final int g = -1;
        public f e;
        public boolean f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int j() {
            f fVar = this.e;
            if (fVar == null) {
                return -1;
            }
            return fVar.e;
        }

        public boolean k() {
            return this.f;
        }

        public void l(boolean z) {
            this.f = z;
        }

        public c(int i, int i2) {
            super(i, i2);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(RecyclerView.q qVar) {
            super(qVar);
        }
    }

    /* loaded from: classes.dex */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();
        public int X;
        public int Y;
        public int[] Y0;
        public int Z;
        public int Z0;
        public int[] a1;
        public List<d.a> b1;
        public boolean c1;
        public boolean d1;
        public boolean e1;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public e() {
        }

        public void a() {
            this.Y0 = null;
            this.Z = 0;
            this.X = -1;
            this.Y = -1;
        }

        public void b() {
            this.Y0 = null;
            this.Z = 0;
            this.Z0 = 0;
            this.a1 = null;
            this.b1 = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.X);
            parcel.writeInt(this.Y);
            parcel.writeInt(this.Z);
            if (this.Z > 0) {
                parcel.writeIntArray(this.Y0);
            }
            parcel.writeInt(this.Z0);
            if (this.Z0 > 0) {
                parcel.writeIntArray(this.a1);
            }
            parcel.writeInt(this.c1 ? 1 : 0);
            parcel.writeInt(this.d1 ? 1 : 0);
            parcel.writeInt(this.e1 ? 1 : 0);
            parcel.writeList(this.b1);
        }

        public e(Parcel parcel) {
            this.X = parcel.readInt();
            this.Y = parcel.readInt();
            int readInt = parcel.readInt();
            this.Z = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.Y0 = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.Z0 = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.a1 = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.c1 = parcel.readInt() == 1;
            this.d1 = parcel.readInt() == 1;
            this.e1 = parcel.readInt() == 1;
            this.b1 = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.Z = eVar.Z;
            this.X = eVar.X;
            this.Y = eVar.Y;
            this.Y0 = eVar.Y0;
            this.Z0 = eVar.Z0;
            this.a1 = eVar.a1;
            this.c1 = eVar.c1;
            this.d1 = eVar.d1;
            this.e1 = eVar.e1;
            this.b1 = eVar.b1;
        }
    }

    /* loaded from: classes.dex */
    public class f {
        public static final int g = Integer.MIN_VALUE;
        public ArrayList<View> a = new ArrayList<>();
        public int b = Integer.MIN_VALUE;
        public int c = Integer.MIN_VALUE;
        public int d = 0;
        public final int e;

        public f(int i) {
            this.e = i;
        }

        public void A(int i) {
            this.b = i;
            this.c = i;
        }

        public void a(View view) {
            c s = s(view);
            s.e = this;
            this.a.add(view);
            this.c = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.b = Integer.MIN_VALUE;
            }
            if (!s.g() && !s.f()) {
                return;
            }
            this.d += StaggeredGridLayoutManager.this.u.e(view);
        }

        public void b(boolean z, int i) {
            int u;
            if (z) {
                u = q(Integer.MIN_VALUE);
            } else {
                u = u(Integer.MIN_VALUE);
            }
            e();
            if (u != Integer.MIN_VALUE) {
                if (!z || u >= StaggeredGridLayoutManager.this.u.i()) {
                    if (!z && u > StaggeredGridLayoutManager.this.u.n()) {
                        return;
                    }
                    if (i != Integer.MIN_VALUE) {
                        u += i;
                    }
                    this.c = u;
                    this.b = u;
                }
            }
        }

        public void c() {
            d.a f;
            ArrayList<View> arrayList = this.a;
            View view = arrayList.get(arrayList.size() - 1);
            c s = s(view);
            this.c = StaggeredGridLayoutManager.this.u.d(view);
            if (s.f && (f = StaggeredGridLayoutManager.this.E.f(s.d())) != null && f.Y == 1) {
                this.c += f.a(this.e);
            }
        }

        public void d() {
            d.a f;
            View view = this.a.get(0);
            c s = s(view);
            this.b = StaggeredGridLayoutManager.this.u.g(view);
            if (s.f && (f = StaggeredGridLayoutManager.this.E.f(s.d())) != null && f.Y == -1) {
                this.b -= f.a(this.e);
            }
        }

        public void e() {
            this.a.clear();
            v();
            this.d = 0;
        }

        public int f() {
            if (StaggeredGridLayoutManager.this.z) {
                return n(this.a.size() - 1, -1, true);
            }
            return n(0, this.a.size(), true);
        }

        public int g() {
            if (StaggeredGridLayoutManager.this.z) {
                return m(this.a.size() - 1, -1, true);
            }
            return m(0, this.a.size(), true);
        }

        public int h() {
            if (StaggeredGridLayoutManager.this.z) {
                return n(this.a.size() - 1, -1, false);
            }
            return n(0, this.a.size(), false);
        }

        public int i() {
            if (StaggeredGridLayoutManager.this.z) {
                return n(0, this.a.size(), true);
            }
            return n(this.a.size() - 1, -1, true);
        }

        public int j() {
            if (StaggeredGridLayoutManager.this.z) {
                return m(0, this.a.size(), true);
            }
            return m(this.a.size() - 1, -1, true);
        }

        public int k() {
            if (StaggeredGridLayoutManager.this.z) {
                return n(0, this.a.size(), false);
            }
            return n(this.a.size() - 1, -1, false);
        }

        public int l(int i, int i2, boolean z, boolean z2, boolean z3) {
            int i3;
            boolean z4;
            int n = StaggeredGridLayoutManager.this.u.n();
            int i4 = StaggeredGridLayoutManager.this.u.i();
            if (i2 > i) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            while (i != i2) {
                View view = this.a.get(i);
                int g2 = StaggeredGridLayoutManager.this.u.g(view);
                int d = StaggeredGridLayoutManager.this.u.d(view);
                boolean z5 = false;
                if (!z3 ? g2 < i4 : g2 <= i4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z3 ? d > n : d >= n) {
                    z5 = true;
                }
                if (z4 && z5) {
                    if (z && z2) {
                        if (g2 >= n && d <= i4) {
                            return StaggeredGridLayoutManager.this.w0(view);
                        }
                    } else if (z2) {
                        return StaggeredGridLayoutManager.this.w0(view);
                    } else {
                        if (g2 < n || d > i4) {
                            return StaggeredGridLayoutManager.this.w0(view);
                        }
                    }
                }
                i += i3;
            }
            return -1;
        }

        public int m(int i, int i2, boolean z) {
            return l(i, i2, false, false, z);
        }

        public int n(int i, int i2, boolean z) {
            return l(i, i2, z, true, false);
        }

        public int o() {
            return this.d;
        }

        public int p() {
            int i = this.c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            c();
            return this.c;
        }

        public int q(int i) {
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            c();
            return this.c;
        }

        public View r(int i, int i2) {
            View view = null;
            if (i2 == -1) {
                int size = this.a.size();
                int i3 = 0;
                while (i3 < size) {
                    View view2 = this.a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.z && staggeredGridLayoutManager.w0(view2) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.z && staggeredGridLayoutManager2.w0(view2) >= i) || !view2.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view2;
                }
                return view;
            }
            int size2 = this.a.size() - 1;
            while (size2 >= 0) {
                View view3 = this.a.get(size2);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                if (staggeredGridLayoutManager3.z && staggeredGridLayoutManager3.w0(view3) >= i) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                if ((!staggeredGridLayoutManager4.z && staggeredGridLayoutManager4.w0(view3) <= i) || !view3.hasFocusable()) {
                    break;
                }
                size2--;
                view = view3;
            }
            return view;
        }

        public c s(View view) {
            return (c) view.getLayoutParams();
        }

        public int t() {
            int i = this.b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            d();
            return this.b;
        }

        public int u(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            d();
            return this.b;
        }

        public void v() {
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
        }

        public void w(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                this.b = i2 + i;
            }
            int i3 = this.c;
            if (i3 != Integer.MIN_VALUE) {
                this.c = i3 + i;
            }
        }

        public void x() {
            int size = this.a.size();
            View remove = this.a.remove(size - 1);
            c s = s(remove);
            s.e = null;
            if (s.g() || s.f()) {
                this.d -= StaggeredGridLayoutManager.this.u.e(remove);
            }
            if (size == 1) {
                this.b = Integer.MIN_VALUE;
            }
            this.c = Integer.MIN_VALUE;
        }

        public void y() {
            View remove = this.a.remove(0);
            c s = s(remove);
            s.e = null;
            if (this.a.size() == 0) {
                this.c = Integer.MIN_VALUE;
            }
            if (s.g() || s.f()) {
                this.d -= StaggeredGridLayoutManager.this.u.e(remove);
            }
            this.b = Integer.MIN_VALUE;
        }

        public void z(View view) {
            c s = s(view);
            s.e = this;
            this.a.add(0, view);
            this.b = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.c = Integer.MIN_VALUE;
            }
            if (!s.g() && !s.f()) {
                return;
            }
            this.d += StaggeredGridLayoutManager.this.u.e(view);
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.p.d x0 = RecyclerView.p.x0(context, attributeSet, i, i2);
        t3(x0.a);
        v3(x0.b);
        u3(x0.c);
        this.y = new n();
        C2();
    }

    private void e3(View view, int i, int i2, boolean z) {
        boolean g2;
        r(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.K;
        int D3 = D3(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.K;
        int D32 = D3(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z) {
            g2 = i2(view, D3, D32, cVar);
        } else {
            g2 = g2(view, D3, D32, cVar);
        }
        if (g2) {
            view.measure(D3, D32);
        }
    }

    private void o3() {
        if (this.w != 1 && d3()) {
            this.A = !this.z;
        } else {
            this.A = this.z;
        }
    }

    private int w2(RecyclerView.D d2) {
        if (V() == 0) {
            return 0;
        }
        return w.a(d2, this.u, H2(!this.N), G2(!this.N), this, this.N);
    }

    private int x2(RecyclerView.D d2) {
        if (V() == 0) {
            return 0;
        }
        return w.b(d2, this.u, H2(!this.N), G2(!this.N), this, this.N, this.A);
    }

    private int y2(RecyclerView.D d2) {
        if (V() == 0) {
            return 0;
        }
        return w.c(d2, this.u, H2(!this.N), G2(!this.N), this, this.N);
    }

    private int z2(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.w == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.w == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.w == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.w == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.w != 1 && d3()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.w == 1 || !d3()) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A(RecyclerView.D d2) {
        return y2(d2);
    }

    public final d.a A2(int i) {
        d.a aVar = new d.a();
        aVar.Z = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            aVar.Z[i2] = i - this.t[i2].q(i);
        }
        return aVar;
    }

    public final void A3(int i, RecyclerView.D d2) {
        int i2;
        int i3;
        int g;
        boolean z;
        n nVar = this.y;
        boolean z2 = false;
        nVar.b = 0;
        nVar.c = i;
        if (Q0() && (g = d2.g()) != -1) {
            boolean z3 = this.A;
            if (g < i) {
                z = true;
            } else {
                z = false;
            }
            if (z3 == z) {
                i2 = this.u.o();
                i3 = 0;
            } else {
                i3 = this.u.o();
                i2 = 0;
            }
        } else {
            i2 = 0;
            i3 = 0;
        }
        if (Z()) {
            this.y.f = this.u.n() - i3;
            this.y.g = this.u.i() + i2;
        } else {
            this.y.g = this.u.h() + i2;
            this.y.f = -i3;
        }
        n nVar2 = this.y;
        nVar2.h = false;
        nVar2.a = true;
        if (this.u.l() == 0 && this.u.h() == 0) {
            z2 = true;
        }
        nVar2.i = z2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int B(RecyclerView.D d2) {
        return w2(d2);
    }

    public final d.a B2(int i) {
        d.a aVar = new d.a();
        aVar.Z = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            aVar.Z[i2] = this.t[i2].u(i) - i;
        }
        return aVar;
    }

    public void B3(int i) {
        this.x = i / this.s;
        this.J = View.MeasureSpec.makeMeasureSpec(i, this.v.l());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C(RecyclerView.D d2) {
        return x2(d2);
    }

    public final void C2() {
        this.u = t.b(this, this.w);
        this.v = t.b(this, 1 - this.w);
    }

    public final void C3(f fVar, int i, int i2) {
        int o2 = fVar.o();
        if (i == -1) {
            if (fVar.t() + o2 <= i2) {
                this.B.set(fVar.e, false);
            }
        } else if (fVar.p() - o2 >= i2) {
            this.B.set(fVar.e, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int D(RecyclerView.D d2) {
        return y2(d2);
    }

    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    public final int D2(RecyclerView.x xVar, n nVar, RecyclerView.D d2) {
        int i;
        int n;
        int S2;
        boolean z;
        f fVar;
        int u;
        int i2;
        int e2;
        int n2;
        int i3;
        int e3;
        boolean r2;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        ?? r8 = 0;
        staggeredGridLayoutManager.B.set(0, staggeredGridLayoutManager.s, true);
        if (staggeredGridLayoutManager.y.i) {
            if (nVar.e == 1) {
                i = Integer.MAX_VALUE;
            } else {
                i = Integer.MIN_VALUE;
            }
        } else if (nVar.e == 1) {
            i = nVar.g + nVar.b;
        } else {
            i = nVar.f - nVar.b;
        }
        int i4 = i;
        staggeredGridLayoutManager.w3(nVar.e, i4);
        if (staggeredGridLayoutManager.A) {
            n = staggeredGridLayoutManager.u.i();
        } else {
            n = staggeredGridLayoutManager.u.n();
        }
        int i5 = n;
        boolean z2 = false;
        while (nVar.a(d2) && (staggeredGridLayoutManager.y.i || !staggeredGridLayoutManager.B.isEmpty())) {
            View b2 = nVar.b(xVar);
            c cVar = (c) b2.getLayoutParams();
            int d3 = cVar.d();
            int g = staggeredGridLayoutManager.E.g(d3);
            if (g == -1) {
                z = true;
            } else {
                z = r8;
            }
            if (z) {
                if (cVar.f) {
                    fVar = staggeredGridLayoutManager.t[r8];
                } else {
                    fVar = staggeredGridLayoutManager.W2(nVar);
                }
                staggeredGridLayoutManager.E.n(d3, fVar);
            } else {
                fVar = staggeredGridLayoutManager.t[g];
            }
            f fVar2 = fVar;
            cVar.e = fVar2;
            if (nVar.e == 1) {
                staggeredGridLayoutManager.j(b2);
            } else {
                staggeredGridLayoutManager.k(b2, r8);
            }
            staggeredGridLayoutManager.f3(b2, cVar, r8);
            if (nVar.e == 1) {
                if (cVar.f) {
                    e2 = staggeredGridLayoutManager.S2(i5);
                } else {
                    e2 = fVar2.q(i5);
                }
                i2 = staggeredGridLayoutManager.u.e(b2) + e2;
                if (z && cVar.f) {
                    d.a A2 = staggeredGridLayoutManager.A2(e2);
                    A2.Y = -1;
                    A2.X = d3;
                    staggeredGridLayoutManager.E.a(A2);
                }
            } else {
                if (cVar.f) {
                    u = staggeredGridLayoutManager.V2(i5);
                } else {
                    u = fVar2.u(i5);
                }
                i2 = u;
                e2 = i2 - staggeredGridLayoutManager.u.e(b2);
                if (z && cVar.f) {
                    d.a B2 = staggeredGridLayoutManager.B2(i2);
                    B2.Y = 1;
                    B2.X = d3;
                    staggeredGridLayoutManager.E.a(B2);
                }
            }
            if (cVar.f && nVar.d == -1) {
                if (z) {
                    staggeredGridLayoutManager.M = true;
                } else {
                    if (nVar.e == 1) {
                        r2 = staggeredGridLayoutManager.q2();
                    } else {
                        r2 = staggeredGridLayoutManager.r2();
                    }
                    if (!r2) {
                        d.a f2 = staggeredGridLayoutManager.E.f(d3);
                        if (f2 != null) {
                            f2.Y0 = true;
                        }
                        staggeredGridLayoutManager.M = true;
                    }
                }
            }
            staggeredGridLayoutManager.s2(b2, cVar, nVar);
            if (staggeredGridLayoutManager.d3() && staggeredGridLayoutManager.w == 1) {
                if (cVar.f) {
                    e3 = staggeredGridLayoutManager.v.i();
                } else {
                    e3 = staggeredGridLayoutManager.v.i() - (((staggeredGridLayoutManager.s - 1) - fVar2.e) * staggeredGridLayoutManager.x);
                }
                i3 = e3 - staggeredGridLayoutManager.v.e(b2);
            } else {
                if (cVar.f) {
                    n2 = staggeredGridLayoutManager.v.n();
                } else {
                    n2 = (fVar2.e * staggeredGridLayoutManager.x) + staggeredGridLayoutManager.v.n();
                }
                i3 = n2;
                e3 = staggeredGridLayoutManager.v.e(b2) + i3;
            }
            int i6 = e3;
            int i7 = i3;
            if (staggeredGridLayoutManager.w == 1) {
                staggeredGridLayoutManager.T0(b2, i7, e2, i6, i2);
                staggeredGridLayoutManager = this;
            } else {
                staggeredGridLayoutManager.T0(b2, e2, i7, i2, i6);
            }
            if (cVar.f) {
                staggeredGridLayoutManager.w3(staggeredGridLayoutManager.y.e, i4);
            } else {
                staggeredGridLayoutManager.C3(fVar2, staggeredGridLayoutManager.y.e, i4);
            }
            staggeredGridLayoutManager.k3(xVar, staggeredGridLayoutManager.y);
            if (staggeredGridLayoutManager.y.h && b2.hasFocusable()) {
                if (cVar.f) {
                    staggeredGridLayoutManager.B.clear();
                } else {
                    staggeredGridLayoutManager.B.set(fVar2.e, false);
                }
            }
            z2 = true;
            r8 = 0;
        }
        if (!z2) {
            staggeredGridLayoutManager.k3(xVar, staggeredGridLayoutManager.y);
        }
        if (staggeredGridLayoutManager.y.e == -1) {
            S2 = staggeredGridLayoutManager.u.n() - staggeredGridLayoutManager.V2(staggeredGridLayoutManager.u.n());
        } else {
            S2 = staggeredGridLayoutManager.S2(staggeredGridLayoutManager.u.i()) - staggeredGridLayoutManager.u.i();
        }
        if (S2 > 0) {
            return Math.min(nVar.b, S2);
        }
        return 0;
    }

    public final int D3(int i, int i2, int i3) {
        int mode;
        if ((i2 == 0 && i3 == 0) || ((mode = View.MeasureSpec.getMode(i)) != Integer.MIN_VALUE && mode != 1073741824)) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
    }

    public int[] E2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.s];
        } else if (iArr.length < this.s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.s + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.s; i++) {
            iArr[i] = this.t[i].f();
        }
        return iArr;
    }

    public final int F2(int i) {
        int V2 = V();
        for (int i2 = 0; i2 < V2; i2++) {
            int w0 = w0(U(i2));
            if (w0 >= 0 && w0 < i) {
                return w0;
            }
        }
        return 0;
    }

    public View G2(boolean z) {
        int n = this.u.n();
        int i = this.u.i();
        View view = null;
        for (int V2 = V() - 1; V2 >= 0; V2--) {
            View U2 = U(V2);
            int g = this.u.g(U2);
            int d2 = this.u.d(U2);
            if (d2 > n && g < i) {
                if (d2 > i && z) {
                    if (view == null) {
                        view = U2;
                    }
                } else {
                    return U2;
                }
            }
        }
        return view;
    }

    public View H2(boolean z) {
        int n = this.u.n();
        int i = this.u.i();
        int V2 = V();
        View view = null;
        for (int i2 = 0; i2 < V2; i2++) {
            View U2 = U(i2);
            int g = this.u.g(U2);
            if (this.u.d(U2) > n && g < i) {
                if (g < n && z) {
                    if (view == null) {
                        view = U2;
                    }
                } else {
                    return U2;
                }
            }
        }
        return view;
    }

    public int I2() {
        View H2;
        if (this.A) {
            H2 = G2(true);
        } else {
            H2 = H2(true);
        }
        if (H2 == null) {
            return -1;
        }
        return w0(H2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean J0() {
        if (this.F != 0) {
            return true;
        }
        return false;
    }

    public int[] J2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.s];
        } else if (iArr.length < this.s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.s + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.s; i++) {
            iArr[i] = this.t[i].h();
        }
        return iArr;
    }

    public int[] K2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.s];
        } else if (iArr.length < this.s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.s + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.s; i++) {
            iArr[i] = this.t[i].i();
        }
        return iArr;
    }

    public final int L2(int i) {
        for (int V2 = V() - 1; V2 >= 0; V2--) {
            int w0 = w0(U(V2));
            if (w0 >= 0 && w0 < i) {
                return w0;
            }
        }
        return 0;
    }

    public int[] M2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.s];
        } else if (iArr.length < this.s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.s + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.s; i++) {
            iArr[i] = this.t[i].k();
        }
        return iArr;
    }

    public final void N2(RecyclerView.x xVar, RecyclerView.D d2, boolean z) {
        int i;
        int S2 = S2(Integer.MIN_VALUE);
        if (S2 != Integer.MIN_VALUE && (i = this.u.i() - S2) > 0) {
            int i2 = i - (-p3(-i, xVar, d2));
            if (z && i2 > 0) {
                this.u.t(i2);
            }
        }
    }

    public final void O2(RecyclerView.x xVar, RecyclerView.D d2, boolean z) {
        int n;
        int V2 = V2(Integer.MAX_VALUE);
        if (V2 != Integer.MAX_VALUE && (n = V2 - this.u.n()) > 0) {
            int p3 = n - p3(n, xVar, d2);
            if (z && p3 > 0) {
                this.u.t(-p3);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q P() {
        if (this.w == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    public int P2() {
        if (V() == 0) {
            return 0;
        }
        return w0(U(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q Q(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public int Q2() {
        return this.F;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q R(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    public int R2() {
        int V2 = V();
        if (V2 == 0) {
            return 0;
        }
        return w0(U(V2 - 1));
    }

    public final int S2(int i) {
        int q = this.t[0].q(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int q2 = this.t[i2].q(i);
            if (q2 > q) {
                q = q2;
            }
        }
        return q;
    }

    public final int T2(int i) {
        int u = this.t[0].u(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int u2 = this.t[i2].u(i);
            if (u2 > u) {
                u = u2;
            }
        }
        return u;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int U1(int i, RecyclerView.x xVar, RecyclerView.D d2) {
        return p3(i, xVar, d2);
    }

    public final int U2(int i) {
        int q = this.t[0].q(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int q2 = this.t[i2].q(i);
            if (q2 < q) {
                q = q2;
            }
        }
        return q;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V1(int i) {
        e eVar = this.I;
        if (eVar != null && eVar.X != i) {
            eVar.a();
        }
        this.C = i;
        this.D = Integer.MIN_VALUE;
        R1();
    }

    public final int V2(int i) {
        int u = this.t[0].u(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int u2 = this.t[i2].u(i);
            if (u2 < u) {
                u = u2;
            }
        }
        return u;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int W1(int i, RecyclerView.x xVar, RecyclerView.D d2) {
        return p3(i, xVar, d2);
    }

    public final f W2(n nVar) {
        int i;
        int i2;
        int i3;
        if (h3(nVar.e)) {
            i2 = this.s - 1;
            i = -1;
            i3 = -1;
        } else {
            i = this.s;
            i2 = 0;
            i3 = 1;
        }
        f fVar = null;
        if (nVar.e == 1) {
            int n = this.u.n();
            int i4 = Integer.MAX_VALUE;
            while (i2 != i) {
                f fVar2 = this.t[i2];
                int q = fVar2.q(n);
                if (q < i4) {
                    fVar = fVar2;
                    i4 = q;
                }
                i2 += i3;
            }
            return fVar;
        }
        int i5 = this.u.i();
        int i6 = Integer.MIN_VALUE;
        while (i2 != i) {
            f fVar3 = this.t[i2];
            int u = fVar3.u(i5);
            if (u > i6) {
                fVar = fVar3;
                i6 = u;
            }
            i2 += i3;
        }
        return fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(int i) {
        super.X0(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].w(i);
        }
    }

    public int X2() {
        return this.w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(int i) {
        super.Y0(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].w(i);
        }
    }

    public boolean Y2() {
        return this.z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Z0(RecyclerView.AbstractC0370h abstractC0370h, RecyclerView.AbstractC0370h abstractC0370h2) {
        this.E.b();
        for (int i = 0; i < this.s; i++) {
            this.t[i].e();
        }
    }

    public int Z2() {
        return this.s;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a3(int i, int i2, int i3) {
        int P2;
        int i4;
        int i5;
        int R2;
        if (this.A) {
            P2 = R2();
        } else {
            P2 = P2();
        }
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
                this.E.h(i5);
                if (i3 == 1) {
                    if (i3 != 2) {
                        if (i3 == 8) {
                            this.E.k(i, 1);
                            this.E.j(i2, 1);
                        }
                    } else {
                        this.E.k(i, i2);
                    }
                } else {
                    this.E.j(i, i2);
                }
                if (i4 <= P2) {
                    if (this.A) {
                        R2 = P2();
                    } else {
                        R2 = R2();
                    }
                    if (i5 <= R2) {
                        R1();
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            i4 = i + i2;
        }
        i5 = i;
        this.E.h(i5);
        if (i3 == 1) {
        }
        if (i4 <= P2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View b3() {
        char c2;
        int i;
        boolean z;
        boolean z2;
        int V2 = V();
        int i2 = V2 - 1;
        BitSet bitSet = new BitSet(this.s);
        bitSet.set(0, this.s, true);
        int i3 = -1;
        if (this.w == 1 && d3()) {
            c2 = 1;
        } else {
            c2 = 65535;
        }
        if (this.A) {
            V2 = -1;
        } else {
            i2 = 0;
        }
        if (i2 < V2) {
            i3 = 1;
        }
        while (i2 != V2) {
            View U2 = U(i2);
            c cVar = (c) U2.getLayoutParams();
            if (bitSet.get(cVar.e.e)) {
                if (!v2(cVar.e)) {
                    bitSet.clear(cVar.e.e);
                } else {
                    return U2;
                }
            }
            if (!cVar.f && (i = i2 + i3) != V2) {
                View U3 = U(i);
                if (this.A) {
                    int d2 = this.u.d(U2);
                    int d3 = this.u.d(U3);
                    if (d2 >= d3) {
                        if (d2 != d3) {
                            continue;
                        }
                        if (cVar.e.e - ((c) U3.getLayoutParams()).e.e >= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (c2 >= 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z == z2) {
                        }
                    }
                } else {
                    int g = this.u.g(U2);
                    int g2 = this.u.g(U3);
                    if (g <= g2) {
                        if (g != g2) {
                            continue;
                        }
                        if (cVar.e.e - ((c) U3.getLayoutParams()).e.e >= 0) {
                        }
                        if (c2 >= 0) {
                        }
                        if (z == z2) {
                        }
                    }
                }
                return U2;
            }
            i2 += i3;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.C.b
    public PointF c(int i) {
        int t2 = t2(i);
        PointF pointF = new PointF();
        if (t2 == 0) {
            return null;
        }
        if (this.w == 0) {
            pointF.x = t2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = t2;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c2(Rect rect, int i, int i2) {
        int v;
        int v2;
        int s0 = s0() + t0();
        int v0 = v0() + q0();
        if (this.w == 1) {
            v2 = RecyclerView.p.v(i2, rect.height() + v0, o0());
            v = RecyclerView.p.v(i, (this.x * this.s) + s0, p0());
        } else {
            v = RecyclerView.p.v(i, rect.width() + s0, p0());
            v2 = RecyclerView.p.v(i2, (this.x * this.s) + v0, o0());
        }
        b2(v, v2);
    }

    public void c3() {
        this.E.b();
        R1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d1(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.d1(recyclerView, xVar);
        L1(this.P);
        for (int i = 0; i < this.s; i++) {
            this.t[i].e();
        }
        recyclerView.requestLayout();
    }

    public boolean d3() {
        if (m0() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View e1(View view, int i, RecyclerView.x xVar, RecyclerView.D d2) {
        View N;
        int P2;
        boolean z;
        boolean z2;
        int j;
        int j2;
        int j3;
        View r;
        if (V() == 0 || (N = N(view)) == null) {
            return null;
        }
        o3();
        int z22 = z2(i);
        if (z22 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) N.getLayoutParams();
        boolean z3 = cVar.f;
        f fVar = cVar.e;
        if (z22 == 1) {
            P2 = R2();
        } else {
            P2 = P2();
        }
        A3(P2, d2);
        s3(z22);
        n nVar = this.y;
        nVar.c = nVar.d + P2;
        nVar.b = (int) (this.u.o() * 0.33333334f);
        n nVar2 = this.y;
        nVar2.h = true;
        nVar2.a = false;
        D2(xVar, nVar2, d2);
        this.G = this.A;
        if (!z3 && (r = fVar.r(P2, z22)) != null && r != N) {
            return r;
        }
        if (h3(z22)) {
            for (int i2 = this.s - 1; i2 >= 0; i2--) {
                View r2 = this.t[i2].r(P2, z22);
                if (r2 != null && r2 != N) {
                    return r2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.s; i3++) {
                View r3 = this.t[i3].r(P2, z22);
                if (r3 != null && r3 != N) {
                    return r3;
                }
            }
        }
        boolean z4 = !this.z;
        if (z22 == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z4 == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z3) {
            if (z2) {
                j3 = fVar.g();
            } else {
                j3 = fVar.j();
            }
            View O = O(j3);
            if (O != null && O != N) {
                return O;
            }
        }
        if (h3(z22)) {
            for (int i4 = this.s - 1; i4 >= 0; i4--) {
                if (i4 != fVar.e) {
                    if (z2) {
                        j2 = this.t[i4].g();
                    } else {
                        j2 = this.t[i4].j();
                    }
                    View O2 = O(j2);
                    if (O2 != null && O2 != N) {
                        return O2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.s; i5++) {
                if (z2) {
                    j = this.t[i5].g();
                } else {
                    j = this.t[i5].j();
                }
                View O3 = O(j);
                if (O3 != null && O3 != N) {
                    return O3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f1(AccessibilityEvent accessibilityEvent) {
        super.f1(accessibilityEvent);
        if (V() > 0) {
            View H2 = H2(false);
            View G2 = G2(false);
            if (H2 != null && G2 != null) {
                int w0 = w0(H2);
                int w02 = w0(G2);
                if (w0 < w02) {
                    accessibilityEvent.setFromIndex(w0);
                    accessibilityEvent.setToIndex(w02);
                    return;
                }
                accessibilityEvent.setFromIndex(w02);
                accessibilityEvent.setToIndex(w0);
            }
        }
    }

    public final void f3(View view, c cVar, boolean z) {
        if (cVar.f) {
            if (this.w == 1) {
                e3(view, this.J, RecyclerView.p.W(j0(), k0(), v0() + q0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z);
            } else {
                e3(view, RecyclerView.p.W(D0(), E0(), s0() + t0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.J, z);
            }
        } else if (this.w == 1) {
            e3(view, RecyclerView.p.W(this.x, E0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.p.W(j0(), k0(), v0() + q0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z);
        } else {
            e3(view, RecyclerView.p.W(D0(), E0(), s0() + t0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.p.W(this.x, k0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0152, code lost:
        if (u2() != false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g3(RecyclerView.x xVar, RecyclerView.D d2, boolean z) {
        boolean z2;
        e eVar;
        b bVar = this.L;
        if ((this.I != null || this.C != -1) && d2.d() == 0) {
            H1(xVar);
            bVar.c();
            return;
        }
        boolean z3 = true;
        if (bVar.e && this.C == -1 && this.I == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            bVar.c();
            if (this.I != null) {
                p2(bVar);
            } else {
                o3();
                bVar.c = this.A;
            }
            z3(d2, bVar);
            bVar.e = true;
        }
        if (this.I == null && this.C == -1 && (bVar.c != this.G || d3() != this.H)) {
            this.E.b();
            bVar.d = true;
        }
        if (V() > 0 && ((eVar = this.I) == null || eVar.Z < 1)) {
            if (bVar.d) {
                for (int i = 0; i < this.s; i++) {
                    this.t[i].e();
                    int i2 = bVar.b;
                    if (i2 != Integer.MIN_VALUE) {
                        this.t[i].A(i2);
                    }
                }
            } else if (!z2 && this.L.f != null) {
                for (int i3 = 0; i3 < this.s; i3++) {
                    f fVar = this.t[i3];
                    fVar.e();
                    fVar.A(this.L.f[i3]);
                }
            } else {
                for (int i4 = 0; i4 < this.s; i4++) {
                    this.t[i4].b(this.A, bVar.b);
                }
                this.L.d(this.t);
            }
        }
        E(xVar);
        this.y.a = false;
        this.M = false;
        B3(this.v.o());
        A3(bVar.a, d2);
        if (bVar.c) {
            s3(-1);
            D2(xVar, this.y, d2);
            s3(1);
            n nVar = this.y;
            nVar.c = bVar.a + nVar.d;
            D2(xVar, nVar, d2);
        } else {
            s3(1);
            D2(xVar, this.y, d2);
            s3(-1);
            n nVar2 = this.y;
            nVar2.c = bVar.a + nVar2.d;
            D2(xVar, nVar2, d2);
        }
        n3();
        if (V() > 0) {
            if (this.A) {
                N2(xVar, d2, true);
                O2(xVar, d2, false);
            } else {
                O2(xVar, d2, true);
                N2(xVar, d2, false);
            }
        }
        if (z && !d2.j() && this.F != 0 && V() > 0 && (this.M || b3() != null)) {
            L1(this.P);
        }
        z3 = false;
        if (d2.j()) {
            this.L.c();
        }
        this.G = bVar.c;
        this.H = d3();
        if (z3) {
            this.L.c();
            g3(xVar, d2, false);
        }
    }

    public final boolean h3(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.w == 0) {
            if (i == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 == this.A) {
                return false;
            }
            return true;
        }
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.A) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != d3()) {
            return false;
        }
        return true;
    }

    public void i3(int i, RecyclerView.D d2) {
        int P2;
        int i2;
        if (i > 0) {
            P2 = R2();
            i2 = 1;
        } else {
            P2 = P2();
            i2 = -1;
        }
        this.y.a = true;
        A3(P2, d2);
        s3(i2);
        n nVar = this.y;
        nVar.c = P2 + nVar.d;
        nVar.b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void j2(RecyclerView recyclerView, RecyclerView.D d2, int i) {
        o oVar = new o(recyclerView.getContext());
        oVar.q(i);
        k2(oVar);
    }

    public final void j3(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].z(view);
        }
    }

    public final void k3(RecyclerView.x xVar, n nVar) {
        int min;
        int min2;
        if (nVar.a && !nVar.i) {
            if (nVar.b == 0) {
                if (nVar.e == -1) {
                    l3(xVar, nVar.g);
                } else {
                    m3(xVar, nVar.f);
                }
            } else if (nVar.e == -1) {
                int i = nVar.f;
                int T2 = i - T2(i);
                if (T2 < 0) {
                    min2 = nVar.g;
                } else {
                    min2 = nVar.g - Math.min(T2, nVar.b);
                }
                l3(xVar, min2);
            } else {
                int U2 = U2(nVar.g) - nVar.g;
                if (U2 < 0) {
                    min = nVar.f;
                } else {
                    min = Math.min(U2, nVar.b) + nVar.f;
                }
                m3(xVar, min);
            }
        }
    }

    public final void l3(RecyclerView.x xVar, int i) {
        for (int V2 = V() - 1; V2 >= 0; V2--) {
            View U2 = U(V2);
            if (this.u.g(U2) >= i && this.u.r(U2) >= i) {
                c cVar = (c) U2.getLayoutParams();
                if (cVar.f) {
                    for (int i2 = 0; i2 < this.s; i2++) {
                        if (this.t[i2].a.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.s; i3++) {
                        this.t[i3].x();
                    }
                } else if (cVar.e.a.size() != 1) {
                    cVar.e.x();
                } else {
                    return;
                }
                J1(U2, xVar);
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void m1(RecyclerView recyclerView, int i, int i2) {
        a3(i, i2, 1);
    }

    public final void m3(RecyclerView.x xVar, int i) {
        while (V() > 0) {
            View U2 = U(0);
            if (this.u.d(U2) <= i && this.u.q(U2) <= i) {
                c cVar = (c) U2.getLayoutParams();
                if (cVar.f) {
                    for (int i2 = 0; i2 < this.s; i2++) {
                        if (this.t[i2].a.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.s; i3++) {
                        this.t[i3].y();
                    }
                } else if (cVar.e.a.size() != 1) {
                    cVar.e.y();
                } else {
                    return;
                }
                J1(U2, xVar);
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void n(String str) {
        if (this.I == null) {
            super.n(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void n1(RecyclerView recyclerView) {
        this.E.b();
        R1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean n2() {
        if (this.I == null) {
            return true;
        }
        return false;
    }

    public final void n3() {
        if (this.v.l() != 1073741824) {
            int V2 = V();
            float f2 = 0.0f;
            for (int i = 0; i < V2; i++) {
                View U2 = U(i);
                float e2 = this.v.e(U2);
                if (e2 >= f2) {
                    if (((c) U2.getLayoutParams()).k()) {
                        e2 = (e2 * 1.0f) / this.s;
                    }
                    f2 = Math.max(f2, e2);
                }
            }
            int i2 = this.x;
            int round = Math.round(f2 * this.s);
            if (this.v.l() == Integer.MIN_VALUE) {
                round = Math.min(round, this.v.o());
            }
            B3(round);
            if (this.x != i2) {
                for (int i3 = 0; i3 < V2; i3++) {
                    View U3 = U(i3);
                    c cVar = (c) U3.getLayoutParams();
                    if (!cVar.f) {
                        if (d3() && this.w == 1) {
                            int i4 = this.s;
                            int i5 = cVar.e.e;
                            U3.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.x) - ((-((i4 - 1) - i5)) * i2));
                        } else {
                            int i6 = cVar.e.e;
                            int i7 = this.x * i6;
                            int i8 = i6 * i2;
                            if (this.w == 1) {
                                U3.offsetLeftAndRight(i7 - i8);
                            } else {
                                U3.offsetTopAndBottom(i7 - i8);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void o1(RecyclerView recyclerView, int i, int i2, int i3) {
        a3(i, i2, 8);
    }

    public final void o2(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].a(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void p1(RecyclerView recyclerView, int i, int i2) {
        a3(i, i2, 2);
    }

    public final void p2(b bVar) {
        int n;
        e eVar = this.I;
        int i = eVar.Z;
        if (i > 0) {
            if (i == this.s) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    this.t[i2].e();
                    e eVar2 = this.I;
                    int i3 = eVar2.Y0[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        if (eVar2.d1) {
                            n = this.u.i();
                        } else {
                            n = this.u.n();
                        }
                        i3 += n;
                    }
                    this.t[i2].A(i3);
                }
            } else {
                eVar.b();
                e eVar3 = this.I;
                eVar3.X = eVar3.Y;
            }
        }
        e eVar4 = this.I;
        this.H = eVar4.e1;
        u3(eVar4.c1);
        o3();
        e eVar5 = this.I;
        int i4 = eVar5.X;
        if (i4 != -1) {
            this.C = i4;
            bVar.c = eVar5.d1;
        } else {
            bVar.c = this.A;
        }
        if (eVar5.Z0 > 1) {
            d dVar = this.E;
            dVar.a = eVar5.a1;
            dVar.b = eVar5.b1;
        }
    }

    public int p3(int i, RecyclerView.x xVar, RecyclerView.D d2) {
        if (V() == 0 || i == 0) {
            return 0;
        }
        i3(i, d2);
        int D2 = D2(xVar, this.y, d2);
        if (this.y.b >= D2) {
            if (i < 0) {
                i = -D2;
            } else {
                i = D2;
            }
        }
        this.u.t(-i);
        this.G = this.A;
        n nVar = this.y;
        nVar.b = 0;
        k3(xVar, nVar);
        return i;
    }

    public boolean q2() {
        int q = this.t[0].q(Integer.MIN_VALUE);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].q(Integer.MIN_VALUE) != q) {
                return false;
            }
        }
        return true;
    }

    public void q3(int i, int i2) {
        e eVar = this.I;
        if (eVar != null) {
            eVar.a();
        }
        this.C = i;
        this.D = i2;
        R1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void r1(RecyclerView recyclerView, int i, int i2, Object obj) {
        a3(i, i2, 4);
    }

    public boolean r2() {
        int u = this.t[0].u(Integer.MIN_VALUE);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].u(Integer.MIN_VALUE) != u) {
                return false;
            }
        }
        return true;
    }

    public void r3(int i) {
        n(null);
        if (i == this.F) {
            return;
        }
        if (i != 0 && i != 2) {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
        this.F = i;
        R1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean s() {
        if (this.w == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void s1(RecyclerView.x xVar, RecyclerView.D d2) {
        g3(xVar, d2, true);
    }

    public final void s2(View view, c cVar, n nVar) {
        if (nVar.e == 1) {
            if (cVar.f) {
                o2(view);
            } else {
                cVar.e.a(view);
            }
        } else if (cVar.f) {
            j3(view);
        } else {
            cVar.e.z(view);
        }
    }

    public final void s3(int i) {
        boolean z;
        n nVar = this.y;
        nVar.e = i;
        boolean z2 = this.A;
        int i2 = 1;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            i2 = -1;
        }
        nVar.d = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean t() {
        if (this.w == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void t1(RecyclerView.D d2) {
        super.t1(d2);
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.I = null;
        this.L.c();
    }

    public final int t2(int i) {
        boolean z;
        if (V() == 0) {
            if (!this.A) {
                return -1;
            }
            return 1;
        }
        if (i < P2()) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.A) {
            return -1;
        }
        return 1;
    }

    public void t3(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        n(null);
        if (i == this.w) {
            return;
        }
        this.w = i;
        t tVar = this.u;
        this.u = this.v;
        this.v = tVar;
        R1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean u(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    public boolean u2() {
        int P2;
        int R2;
        int i;
        if (V() == 0 || this.F == 0 || !I0()) {
            return false;
        }
        if (this.A) {
            P2 = R2();
            R2 = P2();
        } else {
            P2 = P2();
            R2 = R2();
        }
        if (P2 == 0 && b3() != null) {
            this.E.b();
            S1();
            R1();
            return true;
        } else if (!this.M) {
            return false;
        } else {
            if (this.A) {
                i = -1;
            } else {
                i = 1;
            }
            int i2 = R2 + 1;
            d.a e2 = this.E.e(P2, i2, i, true);
            if (e2 == null) {
                this.M = false;
                this.E.d(i2);
                return false;
            }
            d.a e3 = this.E.e(P2, e2.X, i * (-1), true);
            if (e3 == null) {
                this.E.d(e2.X);
            } else {
                this.E.d(e3.X + 1);
            }
            S1();
            R1();
            return true;
        }
    }

    public void u3(boolean z) {
        n(null);
        e eVar = this.I;
        if (eVar != null && eVar.c1 != z) {
            eVar.c1 = z;
        }
        this.z = z;
        R1();
    }

    public final boolean v2(f fVar) {
        boolean z;
        if (this.A) {
            if (fVar.p() < this.u.i()) {
                ArrayList<View> arrayList = fVar.a;
                z = fVar.s(arrayList.get(arrayList.size() - 1)).f;
                return !z;
            }
            return false;
        }
        if (fVar.t() > this.u.n()) {
            z = fVar.s(fVar.a.get(0)).f;
            return !z;
        }
        return false;
    }

    public void v3(int i) {
        n(null);
        if (i != this.s) {
            c3();
            this.s = i;
            this.B = new BitSet(this.s);
            this.t = new f[this.s];
            for (int i2 = 0; i2 < this.s; i2++) {
                this.t[i2] = new f(i2);
            }
            R1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void w(int i, int i2, RecyclerView.D d2, RecyclerView.p.c cVar) {
        int q;
        int i3;
        if (this.w != 0) {
            i = i2;
        }
        if (V() != 0 && i != 0) {
            i3(i, d2);
            int[] iArr = this.O;
            if (iArr == null || iArr.length < this.s) {
                this.O = new int[this.s];
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.s; i5++) {
                n nVar = this.y;
                if (nVar.d == -1) {
                    q = nVar.f;
                    i3 = this.t[i5].u(q);
                } else {
                    q = this.t[i5].q(nVar.g);
                    i3 = this.y.g;
                }
                int i6 = q - i3;
                if (i6 >= 0) {
                    this.O[i4] = i6;
                    i4++;
                }
            }
            Arrays.sort(this.O, 0, i4);
            for (int i7 = 0; i7 < i4 && this.y.a(d2); i7++) {
                cVar.a(this.y.c, this.O[i7]);
                n nVar2 = this.y;
                nVar2.c += nVar2.d;
            }
        }
    }

    public final void w3(int i, int i2) {
        for (int i3 = 0; i3 < this.s; i3++) {
            if (!this.t[i3].a.isEmpty()) {
                C3(this.t[i3], i, i2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void x1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.I = eVar;
            if (this.C != -1) {
                eVar.a();
                this.I.b();
            }
            R1();
        }
    }

    public final boolean x3(RecyclerView.D d2, b bVar) {
        int F2;
        if (this.G) {
            F2 = L2(d2.d());
        } else {
            F2 = F2(d2.d());
        }
        bVar.a = F2;
        bVar.b = Integer.MIN_VALUE;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int y(RecyclerView.D d2) {
        return w2(d2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable y1() {
        int P2;
        int u;
        int n;
        int[] iArr;
        if (this.I != null) {
            return new e(this.I);
        }
        e eVar = new e();
        eVar.c1 = this.z;
        eVar.d1 = this.G;
        eVar.e1 = this.H;
        d dVar = this.E;
        if (dVar != null && (iArr = dVar.a) != null) {
            eVar.a1 = iArr;
            eVar.Z0 = iArr.length;
            eVar.b1 = dVar.b;
        } else {
            eVar.Z0 = 0;
        }
        if (V() > 0) {
            if (this.G) {
                P2 = R2();
            } else {
                P2 = P2();
            }
            eVar.X = P2;
            eVar.Y = I2();
            int i = this.s;
            eVar.Z = i;
            eVar.Y0 = new int[i];
            for (int i2 = 0; i2 < this.s; i2++) {
                if (this.G) {
                    u = this.t[i2].q(Integer.MIN_VALUE);
                    if (u != Integer.MIN_VALUE) {
                        n = this.u.i();
                        u -= n;
                        eVar.Y0[i2] = u;
                    } else {
                        eVar.Y0[i2] = u;
                    }
                } else {
                    u = this.t[i2].u(Integer.MIN_VALUE);
                    if (u != Integer.MIN_VALUE) {
                        n = this.u.n();
                        u -= n;
                        eVar.Y0[i2] = u;
                    } else {
                        eVar.Y0[i2] = u;
                    }
                }
            }
            return eVar;
        }
        eVar.X = -1;
        eVar.Y = -1;
        eVar.Z = 0;
        return eVar;
    }

    public boolean y3(RecyclerView.D d2, b bVar) {
        int i;
        int P2;
        int n;
        boolean z = false;
        if (!d2.j() && (i = this.C) != -1) {
            if (i >= 0 && i < d2.d()) {
                e eVar = this.I;
                if (eVar != null && eVar.X != -1 && eVar.Z >= 1) {
                    bVar.b = Integer.MIN_VALUE;
                    bVar.a = this.C;
                } else {
                    View O = O(this.C);
                    if (O != null) {
                        if (this.A) {
                            P2 = R2();
                        } else {
                            P2 = P2();
                        }
                        bVar.a = P2;
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.c) {
                                bVar.b = (this.u.i() - this.D) - this.u.d(O);
                            } else {
                                bVar.b = (this.u.n() + this.D) - this.u.g(O);
                            }
                            return true;
                        } else if (this.u.e(O) > this.u.o()) {
                            if (bVar.c) {
                                n = this.u.i();
                            } else {
                                n = this.u.n();
                            }
                            bVar.b = n;
                            return true;
                        } else {
                            int g = this.u.g(O) - this.u.n();
                            if (g < 0) {
                                bVar.b = -g;
                                return true;
                            }
                            int i2 = this.u.i() - this.u.d(O);
                            if (i2 < 0) {
                                bVar.b = i2;
                                return true;
                            }
                            bVar.b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i3 = this.C;
                        bVar.a = i3;
                        int i4 = this.D;
                        if (i4 == Integer.MIN_VALUE) {
                            if (t2(i3) == 1) {
                                z = true;
                            }
                            bVar.c = z;
                            bVar.a();
                        } else {
                            bVar.b(i4);
                        }
                        bVar.d = true;
                    }
                }
                return true;
            }
            this.C = -1;
            this.D = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z(RecyclerView.D d2) {
        return x2(d2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void z1(int i) {
        if (i == 0) {
            u2();
        }
    }

    public void z3(RecyclerView.D d2, b bVar) {
        if (y3(d2, bVar) || x3(d2, bVar)) {
            return;
        }
        bVar.a();
        bVar.a = 0;
    }

    /* loaded from: classes.dex */
    public static class d {
        public static final int c = 10;
        public int[] a;
        public List<a> b;

        public void a(a aVar) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                a aVar2 = this.b.get(i);
                if (aVar2.X == aVar.X) {
                    this.b.remove(i);
                }
                if (aVar2.X >= aVar.X) {
                    this.b.add(i, aVar);
                    return;
                }
            }
            this.b.add(aVar);
        }

        public void b() {
            int[] iArr = this.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        public void c(int i) {
            int[] iArr = this.a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[o(i)];
                this.a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public int d(int i) {
            List<a> list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.b.get(size).X >= i) {
                        this.b.remove(size);
                    }
                }
            }
            return h(i);
        }

        public a e(int i, int i2, int i3, boolean z) {
            List<a> list = this.b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                a aVar = this.b.get(i4);
                int i5 = aVar.X;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || aVar.Y == i3 || (z && aVar.Y0))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i) {
            List<a> list = this.b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.b.get(size);
                if (aVar.X == i) {
                    return aVar;
                }
            }
            return null;
        }

        public int g(int i) {
            int[] iArr = this.a;
            if (iArr != null && i < iArr.length) {
                return iArr[i];
            }
            return -1;
        }

        public int h(int i) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int i2 = i(i);
            if (i2 == -1) {
                int[] iArr2 = this.a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.a.length;
            }
            int min = Math.min(i2 + 1, this.a.length);
            Arrays.fill(this.a, i, min, -1);
            return min;
        }

        public final int i(int i) {
            if (this.b == null) {
                return -1;
            }
            a f = f(i);
            if (f != null) {
                this.b.remove(f);
            }
            int size = this.b.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    if (this.b.get(i2).X >= i) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.b.remove(i2);
            return this.b.get(i2).X;
        }

        public void j(int i, int i2) {
            int[] iArr = this.a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                c(i3);
                int[] iArr2 = this.a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.a, i, i3, -1);
                l(i, i2);
            }
        }

        public void k(int i, int i2) {
            int[] iArr = this.a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                c(i3);
                int[] iArr2 = this.a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m(i, i2);
            }
        }

        public final void l(int i, int i2) {
            List<a> list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = this.b.get(size);
                    int i3 = aVar.X;
                    if (i3 >= i) {
                        aVar.X = i3 + i2;
                    }
                }
            }
        }

        public final void m(int i, int i2) {
            List<a> list = this.b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = this.b.get(size);
                    int i4 = aVar.X;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.b.remove(size);
                        } else {
                            aVar.X = i4 - i2;
                        }
                    }
                }
            }
        }

        public void n(int i, f fVar) {
            c(i);
            this.a[i] = fVar.e;
        }

        public int o(int i) {
            int length = this.a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        /* loaded from: classes.dex */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0039a();
            public int X;
            public int Y;
            public boolean Y0;
            public int[] Z;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C0039a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public a[] newArray(int i) {
                    return new a[i];
                }
            }

            public a(Parcel parcel) {
                this.X = parcel.readInt();
                this.Y = parcel.readInt();
                this.Y0 = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.Z = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int a(int i) {
                int[] iArr = this.Z;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.X + ", mGapDir=" + this.Y + ", mHasUnwantedGapAfter=" + this.Y0 + ", mGapPerSpan=" + Arrays.toString(this.Z) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.X);
                parcel.writeInt(this.Y);
                parcel.writeInt(this.Y0 ? 1 : 0);
                int[] iArr = this.Z;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.Z);
                    return;
                }
                parcel.writeInt(0);
            }

            public a() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.w = i2;
        v3(i);
        this.y = new n();
        C2();
    }
}
