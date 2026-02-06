package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.p implements m.j, RecyclerView.C.b {
    public static final String I = "LinearLayoutManager";
    public static final boolean J = false;
    public static final int K = 0;
    public static final int L = 1;
    public static final int M = Integer.MIN_VALUE;
    public static final float N = 0.33333334f;
    public int A;
    public int B;
    public boolean C;
    public d D;
    public final a E;
    public final b F;
    public int G;
    public int[] H;
    public int s;
    public c t;
    public t u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* loaded from: classes.dex */
    public static class a {
        public t a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;

        public a() {
            e();
        }

        public void a() {
            int n;
            if (this.d) {
                n = this.a.i();
            } else {
                n = this.a.n();
            }
            this.c = n;
        }

        public void b(View view, int i) {
            if (this.d) {
                this.c = this.a.d(view) + this.a.p();
            } else {
                this.c = this.a.g(view);
            }
            this.b = i;
        }

        public void c(View view, int i) {
            int p = this.a.p();
            if (p >= 0) {
                b(view, i);
                return;
            }
            this.b = i;
            if (this.d) {
                int i2 = (this.a.i() - p) - this.a.d(view);
                this.c = this.a.i() - i2;
                if (i2 > 0) {
                    int e = this.c - this.a.e(view);
                    int n = this.a.n();
                    int min = e - (n + Math.min(this.a.g(view) - n, 0));
                    if (min < 0) {
                        this.c += Math.min(i2, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g = this.a.g(view);
            int n2 = g - this.a.n();
            this.c = g;
            if (n2 > 0) {
                int i3 = (this.a.i() - Math.min(0, (this.a.i() - p) - this.a.d(view))) - (g + this.a.e(view));
                if (i3 < 0) {
                    this.c -= Math.min(n2, -i3);
                }
            }
        }

        public boolean d(View view, RecyclerView.D d) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            if (!qVar.g() && qVar.d() >= 0 && qVar.d() < d.d()) {
                return true;
            }
            return false;
        }

        public void e() {
            this.b = -1;
            this.c = Integer.MIN_VALUE;
            this.d = false;
            this.e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;

        public void a() {
            this.a = 0;
            this.b = false;
            this.c = false;
            this.d = false;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static final String n = "LLM#LayoutState";

        /* renamed from: o  reason: collision with root package name */
        public static final int f52o = -1;
        public static final int p = 1;
        public static final int q = Integer.MIN_VALUE;
        public static final int r = -1;
        public static final int s = 1;
        public static final int t = Integer.MIN_VALUE;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int k;
        public boolean m;
        public boolean a = true;
        public int h = 0;
        public int i = 0;
        public boolean j = false;
        public List<RecyclerView.H> l = null;

        public void a() {
            b(null);
        }

        public void b(View view) {
            View g = g(view);
            if (g == null) {
                this.d = -1;
            } else {
                this.d = ((RecyclerView.q) g.getLayoutParams()).d();
            }
        }

        public boolean c(RecyclerView.D d) {
            int i = this.d;
            if (i >= 0 && i < d.d()) {
                return true;
            }
            return false;
        }

        public void d() {
            Log.d(n, "avail:" + this.c + ", ind:" + this.d + ", dir:" + this.e + ", offset:" + this.b + ", layoutDir:" + this.f);
        }

        public View e(RecyclerView.x xVar) {
            if (this.l != null) {
                return f();
            }
            View p2 = xVar.p(this.d);
            this.d += this.e;
            return p2;
        }

        public final View f() {
            int size = this.l.size();
            for (int i = 0; i < size; i++) {
                View view = this.l.get(i).a;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.g() && this.d == qVar.d()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public View g(View view) {
            int d;
            int size = this.l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.l.get(i2).a;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.g() && (d = (qVar.d() - this.d) * this.e) >= 0 && d < i) {
                    if (d == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i = d;
                }
            }
            return view2;
        }
    }

    /* loaded from: classes.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public int X;
        public int Y;
        public boolean Z;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        public d() {
        }

        public boolean a() {
            if (this.X >= 0) {
                return true;
            }
            return false;
        }

        public void b() {
            this.X = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.X);
            parcel.writeInt(this.Y);
            parcel.writeInt(this.Z ? 1 : 0);
        }

        public d(Parcel parcel) {
            this.X = parcel.readInt();
            this.Y = parcel.readInt();
            this.Z = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.X = dVar.X;
            this.Y = dVar.Y;
            this.Z = dVar.Z;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private View M2() {
        int V;
        if (this.x) {
            V = 0;
        } else {
            V = V() - 1;
        }
        return U(V);
    }

    private View N2() {
        int i;
        if (this.x) {
            i = V() - 1;
        } else {
            i = 0;
        }
        return U(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A(RecyclerView.D d2) {
        return s2(d2);
    }

    public View A2(boolean z, boolean z2) {
        if (this.x) {
            return G2(V() - 1, -1, z, z2);
        }
        return G2(0, V(), z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int B(RecyclerView.D d2) {
        return q2(d2);
    }

    public int B2() {
        View G2 = G2(0, V(), false, true);
        if (G2 == null) {
            return -1;
        }
        return w0(G2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C(RecyclerView.D d2) {
        return r2(d2);
    }

    public int C2() {
        View G2 = G2(V() - 1, -1, true, false);
        if (G2 == null) {
            return -1;
        }
        return w0(G2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int D(RecyclerView.D d2) {
        return s2(d2);
    }

    public final View D2() {
        return F2(V() - 1, -1);
    }

    public int E2() {
        View G2 = G2(V() - 1, -1, false, true);
        if (G2 == null) {
            return -1;
        }
        return w0(G2);
    }

    public View F2(int i, int i2) {
        int i3;
        int i4;
        v2();
        if (i2 > i || i2 < i) {
            if (this.u.g(U(i)) < this.u.n()) {
                i3 = 16644;
                i4 = 16388;
            } else {
                i3 = 4161;
                i4 = androidx.fragment.app.j.I;
            }
            if (this.s == 0) {
                return this.e.a(i, i2, i3, i4);
            }
            return this.f.a(i, i2, i3, i4);
        }
        return U(i);
    }

    public View G2(int i, int i2, boolean z, boolean z2) {
        int i3;
        v2();
        int i4 = 320;
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (!z2) {
            i4 = 0;
        }
        if (this.s == 0) {
            return this.e.a(i, i2, i3, i4);
        }
        return this.f.a(i, i2, i3, i4);
    }

    public final View H2() {
        if (this.x) {
            return y2();
        }
        return D2();
    }

    public final View I2() {
        if (this.x) {
            return D2();
        }
        return y2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean J0() {
        return true;
    }

    public View J2(RecyclerView.x xVar, RecyclerView.D d2, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        v2();
        int V = V();
        if (z2) {
            i2 = V() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = V;
            i2 = 0;
            i3 = 1;
        }
        int d3 = d2.d();
        int n = this.u.n();
        int i4 = this.u.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View U = U(i2);
            int w0 = w0(U);
            int g = this.u.g(U);
            int d4 = this.u.d(U);
            if (w0 >= 0 && w0 < d3) {
                if (((RecyclerView.q) U.getLayoutParams()).g()) {
                    if (view3 == null) {
                        view3 = U;
                    }
                } else {
                    if (d4 <= n && g < n) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (g >= i4 && d4 > i4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z3 && !z4) {
                        return U;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = U;
                        }
                        view2 = U;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = U;
                        }
                        view2 = U;
                    }
                }
            }
            i2 += i3;
        }
        if (view != null) {
            return view;
        }
        if (view2 != null) {
            return view2;
        }
        return view3;
    }

    public final int K2(int i, RecyclerView.x xVar, RecyclerView.D d2, boolean z) {
        int i2;
        int i3 = this.u.i() - i;
        if (i3 > 0) {
            int i4 = -g3(-i3, xVar, d2);
            int i5 = i + i4;
            if (z && (i2 = this.u.i() - i5) > 0) {
                this.u.t(i2);
                return i2 + i4;
            }
            return i4;
        }
        return 0;
    }

    public final int L2(int i, RecyclerView.x xVar, RecyclerView.D d2, boolean z) {
        int n;
        int n2 = i - this.u.n();
        if (n2 > 0) {
            int i2 = -g3(n2, xVar, d2);
            int i3 = i + i2;
            if (z && (n = i3 - this.u.n()) > 0) {
                this.u.t(-n);
                return i2 - n;
            }
            return i2;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View O(int i) {
        int V = V();
        if (V == 0) {
            return null;
        }
        int w0 = i - w0(U(0));
        if (w0 >= 0 && w0 < V) {
            View U = U(w0);
            if (w0(U) == i) {
                return U;
            }
        }
        return super.O(i);
    }

    @Deprecated
    public int O2(RecyclerView.D d2) {
        if (d2.h()) {
            return this.u.o();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q P() {
        return new RecyclerView.q(-2, -2);
    }

    public int P2() {
        return this.G;
    }

    public int Q2() {
        return this.s;
    }

    public boolean R2() {
        return this.C;
    }

    public boolean S2() {
        return this.w;
    }

    public boolean T2() {
        return this.y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int U1(int i, RecyclerView.x xVar, RecyclerView.D d2) {
        if (this.s == 1) {
            return 0;
        }
        return g3(i, xVar, d2);
    }

    public boolean U2() {
        if (m0() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V1(int i) {
        this.A = i;
        this.B = Integer.MIN_VALUE;
        d dVar = this.D;
        if (dVar != null) {
            dVar.b();
        }
        R1();
    }

    public boolean V2() {
        return this.z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int W1(int i, RecyclerView.x xVar, RecyclerView.D d2) {
        if (this.s == 0) {
            return 0;
        }
        return g3(i, xVar, d2);
    }

    public void W2(RecyclerView.x xVar, RecyclerView.D d2, c cVar, b bVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int s0;
        int f;
        int i5;
        int i6;
        boolean z2;
        View e = cVar.e(xVar);
        if (e == null) {
            bVar.b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) e.getLayoutParams();
        if (cVar.l == null) {
            boolean z3 = this.x;
            if (cVar.f == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 == z2) {
                j(e);
            } else {
                k(e, 0);
            }
        } else {
            boolean z4 = this.x;
            if (cVar.f == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z4 == z) {
                h(e);
            } else {
                i(e, 0);
            }
        }
        V0(e, 0, 0);
        bVar.a = this.u.e(e);
        if (this.s == 1) {
            if (U2()) {
                f = D0() - t0();
                s0 = f - this.u.f(e);
            } else {
                s0 = s0();
                f = this.u.f(e) + s0;
            }
            if (cVar.f == -1) {
                i6 = cVar.b;
                i5 = i6 - bVar.a;
            } else {
                i5 = cVar.b;
                i6 = bVar.a + i5;
            }
            int i7 = s0;
            i4 = i5;
            i3 = i7;
            i2 = i6;
            i = f;
        } else {
            int v0 = v0();
            int f2 = this.u.f(e) + v0;
            if (cVar.f == -1) {
                int i8 = cVar.b;
                i3 = i8 - bVar.a;
                i = i8;
                i2 = f2;
            } else {
                int i9 = cVar.b;
                i = bVar.a + i9;
                i2 = f2;
                i3 = i9;
            }
            i4 = v0;
        }
        T0(e, i3, i4, i, i2);
        if (qVar.g() || qVar.f()) {
            bVar.c = true;
        }
        bVar.d = e.hasFocusable();
    }

    public final void X2(RecyclerView.x xVar, RecyclerView.D d2, int i, int i2) {
        boolean z;
        if (d2.n() && V() != 0 && !d2.j() && n2()) {
            List<RecyclerView.H> l = xVar.l();
            int size = l.size();
            int w0 = w0(U(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.H h = l.get(i5);
                if (!h.z()) {
                    if (h.p() < w0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z != this.x) {
                        i3 += this.u.e(h.a);
                    } else {
                        i4 += this.u.e(h.a);
                    }
                }
            }
            this.t.l = l;
            if (i3 > 0) {
                u3(w0(N2()), i);
                c cVar = this.t;
                cVar.h = i3;
                cVar.c = 0;
                cVar.a();
                w2(xVar, this.t, d2, false);
            }
            if (i4 > 0) {
                s3(w0(M2()), i2);
                c cVar2 = this.t;
                cVar2.h = i4;
                cVar2.c = 0;
                cVar2.a();
                w2(xVar, this.t, d2, false);
            }
            this.t.l = null;
        }
    }

    public final void Y2() {
        Log.d(I, "internal representation of views on the screen");
        for (int i = 0; i < V(); i++) {
            View U = U(i);
            Log.d(I, "item " + w0(U) + ", coord:" + this.u.g(U));
        }
        Log.d(I, "==============");
    }

    public void Z2(RecyclerView.x xVar, RecyclerView.D d2, a aVar, int i) {
    }

    public final void a3(RecyclerView.x xVar, c cVar) {
        if (cVar.a && !cVar.m) {
            int i = cVar.g;
            int i2 = cVar.i;
            if (cVar.f == -1) {
                c3(xVar, i, i2);
            } else {
                d3(xVar, i, i2);
            }
        }
    }

    public final void b3(RecyclerView.x xVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    K1(i3, xVar);
                }
                return;
            }
            while (i > i2) {
                K1(i, xVar);
                i--;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.C.b
    public PointF c(int i) {
        if (V() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < w0(U(0))) {
            z = true;
        }
        if (z != this.x) {
            i2 = -1;
        }
        if (this.s == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    public final void c3(RecyclerView.x xVar, int i, int i2) {
        int V = V();
        if (i >= 0) {
            int h = (this.u.h() - i) + i2;
            if (this.x) {
                for (int i3 = 0; i3 < V; i3++) {
                    View U = U(i3);
                    if (this.u.g(U) < h || this.u.r(U) < h) {
                        b3(xVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = V - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View U2 = U(i5);
                if (this.u.g(U2) < h || this.u.r(U2) < h) {
                    b3(xVar, i4, i5);
                    return;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.m.j
    public void d(View view, View view2, int i, int i2) {
        boolean z;
        n("Cannot drop a view during a scroll or layout calculation");
        v2();
        f3();
        int w0 = w0(view);
        int w02 = w0(view2);
        if (w0 < w02) {
            z = true;
        } else {
            z = true;
        }
        if (this.x) {
            if (z) {
                h3(w02, this.u.i() - (this.u.g(view2) + this.u.e(view)));
            } else {
                h3(w02, this.u.i() - this.u.d(view2));
            }
        } else if (z) {
            h3(w02, this.u.g(view2));
        } else {
            h3(w02, this.u.d(view2) - this.u.e(view));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d1(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.d1(recyclerView, xVar);
        if (this.C) {
            H1(xVar);
            xVar.d();
        }
    }

    public final void d3(RecyclerView.x xVar, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int V = V();
            if (this.x) {
                int i4 = V - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View U = U(i5);
                    if (this.u.d(U) > i3 || this.u.q(U) > i3) {
                        b3(xVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            for (int i6 = 0; i6 < V; i6++) {
                View U2 = U(i6);
                if (this.u.d(U2) > i3 || this.u.q(U2) > i3) {
                    b3(xVar, 0, i6);
                    return;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View e1(View view, int i, RecyclerView.x xVar, RecyclerView.D d2) {
        int t2;
        View H2;
        View M2;
        f3();
        if (V() == 0 || (t2 = t2(i)) == Integer.MIN_VALUE) {
            return null;
        }
        v2();
        r3(t2, (int) (this.u.o() * 0.33333334f), false, d2);
        c cVar = this.t;
        cVar.g = Integer.MIN_VALUE;
        cVar.a = false;
        w2(xVar, cVar, d2, true);
        if (t2 == -1) {
            H2 = I2();
        } else {
            H2 = H2();
        }
        if (t2 == -1) {
            M2 = N2();
        } else {
            M2 = M2();
        }
        if (M2.hasFocusable()) {
            if (H2 == null) {
                return null;
            }
            return M2;
        }
        return H2;
    }

    public boolean e3() {
        if (this.u.l() == 0 && this.u.h() == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f1(AccessibilityEvent accessibilityEvent) {
        super.f1(accessibilityEvent);
        if (V() > 0) {
            accessibilityEvent.setFromIndex(B2());
            accessibilityEvent.setToIndex(E2());
        }
    }

    public final void f3() {
        if (this.s != 1 && U2()) {
            this.x = !this.w;
        } else {
            this.x = this.w;
        }
    }

    public int g3(int i, RecyclerView.x xVar, RecyclerView.D d2) {
        int i2;
        if (V() == 0 || i == 0) {
            return 0;
        }
        v2();
        this.t.a = true;
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int abs = Math.abs(i);
        r3(i2, abs, true, d2);
        c cVar = this.t;
        int w2 = cVar.g + w2(xVar, cVar, d2, false);
        if (w2 < 0) {
            return 0;
        }
        if (abs > w2) {
            i = i2 * w2;
        }
        this.u.t(-i);
        this.t.k = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean h2() {
        if (k0() != 1073741824 && E0() != 1073741824 && F0()) {
            return true;
        }
        return false;
    }

    public void h3(int i, int i2) {
        this.A = i;
        this.B = i2;
        d dVar = this.D;
        if (dVar != null) {
            dVar.b();
        }
        R1();
    }

    public void i3(int i) {
        this.G = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void j2(RecyclerView recyclerView, RecyclerView.D d2, int i) {
        o oVar = new o(recyclerView.getContext());
        oVar.q(i);
        k2(oVar);
    }

    public void j3(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        n(null);
        if (i == this.s && this.u != null) {
            return;
        }
        t b2 = t.b(this, i);
        this.u = b2;
        this.E.a = b2;
        this.s = i;
        R1();
    }

    public void k3(boolean z) {
        this.C = z;
    }

    public void l3(boolean z) {
        n(null);
        if (z == this.w) {
            return;
        }
        this.w = z;
        R1();
    }

    public void m3(boolean z) {
        this.z = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void n(String str) {
        if (this.D == null) {
            super.n(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean n2() {
        if (this.D == null && this.v == this.y) {
            return true;
        }
        return false;
    }

    public void n3(boolean z) {
        n(null);
        if (this.y == z) {
            return;
        }
        this.y = z;
        R1();
    }

    public void o2(RecyclerView.D d2, int[] iArr) {
        int i;
        int O2 = O2(d2);
        if (this.t.f == -1) {
            i = 0;
        } else {
            i = O2;
            O2 = 0;
        }
        iArr[0] = O2;
        iArr[1] = i;
    }

    public final boolean o3(RecyclerView.x xVar, RecyclerView.D d2, a aVar) {
        View J2;
        boolean z;
        boolean z2 = false;
        if (V() == 0) {
            return false;
        }
        View i0 = i0();
        if (i0 != null && aVar.d(i0, d2)) {
            aVar.c(i0, w0(i0));
            return true;
        }
        boolean z3 = this.v;
        boolean z4 = this.y;
        if (z3 != z4 || (J2 = J2(xVar, d2, aVar.d, z4)) == null) {
            return false;
        }
        aVar.b(J2, w0(J2));
        if (!d2.j() && n2()) {
            int g = this.u.g(J2);
            int d3 = this.u.d(J2);
            int n = this.u.n();
            int i = this.u.i();
            if (d3 <= n && g < n) {
                z = true;
            } else {
                z = false;
            }
            if (g >= i && d3 > i) {
                z2 = true;
            }
            if (z || z2) {
                if (aVar.d) {
                    n = i;
                }
                aVar.c = n;
            }
        }
        return true;
    }

    public void p2(RecyclerView.D d2, c cVar, RecyclerView.p.c cVar2) {
        int i = cVar.d;
        if (i >= 0 && i < d2.d()) {
            cVar2.a(i, Math.max(0, cVar.g));
        }
    }

    public final boolean p3(RecyclerView.D d2, a aVar) {
        int i;
        boolean z;
        int g;
        boolean z2 = false;
        if (!d2.j() && (i = this.A) != -1) {
            if (i >= 0 && i < d2.d()) {
                aVar.b = this.A;
                d dVar = this.D;
                if (dVar != null && dVar.a()) {
                    boolean z3 = this.D.Z;
                    aVar.d = z3;
                    if (z3) {
                        aVar.c = this.u.i() - this.D.Y;
                    } else {
                        aVar.c = this.u.n() + this.D.Y;
                    }
                    return true;
                } else if (this.B == Integer.MIN_VALUE) {
                    View O = O(this.A);
                    if (O != null) {
                        if (this.u.e(O) > this.u.o()) {
                            aVar.a();
                            return true;
                        } else if (this.u.g(O) - this.u.n() < 0) {
                            aVar.c = this.u.n();
                            aVar.d = false;
                            return true;
                        } else if (this.u.i() - this.u.d(O) < 0) {
                            aVar.c = this.u.i();
                            aVar.d = true;
                            return true;
                        } else {
                            if (aVar.d) {
                                g = this.u.d(O) + this.u.p();
                            } else {
                                g = this.u.g(O);
                            }
                            aVar.c = g;
                        }
                    } else {
                        if (V() > 0) {
                            if (this.A < w0(U(0))) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z == this.x) {
                                z2 = true;
                            }
                            aVar.d = z2;
                        }
                        aVar.a();
                    }
                    return true;
                } else {
                    boolean z4 = this.x;
                    aVar.d = z4;
                    if (z4) {
                        aVar.c = this.u.i() - this.B;
                    } else {
                        aVar.c = this.u.n() + this.B;
                    }
                    return true;
                }
            }
            this.A = -1;
            this.B = Integer.MIN_VALUE;
        }
        return false;
    }

    public final int q2(RecyclerView.D d2) {
        if (V() == 0) {
            return 0;
        }
        v2();
        return w.a(d2, this.u, A2(!this.z, true), z2(!this.z, true), this, this.z);
    }

    public final void q3(RecyclerView.x xVar, RecyclerView.D d2, a aVar) {
        int i;
        if (p3(d2, aVar) || o3(xVar, d2, aVar)) {
            return;
        }
        aVar.a();
        if (this.y) {
            i = d2.d() - 1;
        } else {
            i = 0;
        }
        aVar.b = i;
    }

    public final int r2(RecyclerView.D d2) {
        if (V() == 0) {
            return 0;
        }
        v2();
        return w.b(d2, this.u, A2(!this.z, true), z2(!this.z, true), this, this.z, this.x);
    }

    public final void r3(int i, int i2, boolean z, RecyclerView.D d2) {
        int i3;
        int n;
        this.t.m = e3();
        this.t.f = i;
        int[] iArr = this.H;
        boolean z2 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        o2(d2, iArr);
        int max = Math.max(0, this.H[0]);
        int max2 = Math.max(0, this.H[1]);
        if (i == 1) {
            z2 = true;
        }
        c cVar = this.t;
        if (z2) {
            i3 = max2;
        } else {
            i3 = max;
        }
        cVar.h = i3;
        if (!z2) {
            max = max2;
        }
        cVar.i = max;
        if (z2) {
            cVar.h = i3 + this.u.j();
            View M2 = M2();
            c cVar2 = this.t;
            if (this.x) {
                i4 = -1;
            }
            cVar2.e = i4;
            int w0 = w0(M2);
            c cVar3 = this.t;
            cVar2.d = w0 + cVar3.e;
            cVar3.b = this.u.d(M2);
            n = this.u.d(M2) - this.u.i();
        } else {
            View N2 = N2();
            this.t.h += this.u.n();
            c cVar4 = this.t;
            if (!this.x) {
                i4 = -1;
            }
            cVar4.e = i4;
            int w02 = w0(N2);
            c cVar5 = this.t;
            cVar4.d = w02 + cVar5.e;
            cVar5.b = this.u.g(N2);
            n = (-this.u.g(N2)) + this.u.n();
        }
        c cVar6 = this.t;
        cVar6.c = i2;
        if (z) {
            cVar6.c = i2 - n;
        }
        cVar6.g = n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean s() {
        if (this.s == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void s1(RecyclerView.x xVar, RecyclerView.D d2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int K2;
        int i6;
        View O;
        int g;
        int i7;
        int i8 = -1;
        if ((this.D != null || this.A != -1) && d2.d() == 0) {
            H1(xVar);
            return;
        }
        d dVar = this.D;
        if (dVar != null && dVar.a()) {
            this.A = this.D.X;
        }
        v2();
        this.t.a = false;
        f3();
        View i0 = i0();
        a aVar = this.E;
        if (aVar.e && this.A == -1 && this.D == null) {
            if (i0 != null && (this.u.g(i0) >= this.u.i() || this.u.d(i0) <= this.u.n())) {
                this.E.c(i0, w0(i0));
            }
        } else {
            aVar.e();
            a aVar2 = this.E;
            aVar2.d = this.x ^ this.y;
            q3(xVar, d2, aVar2);
            this.E.e = true;
        }
        c cVar = this.t;
        if (cVar.k >= 0) {
            i = 1;
        } else {
            i = -1;
        }
        cVar.f = i;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        o2(d2, iArr);
        int max = Math.max(0, this.H[0]) + this.u.n();
        int max2 = Math.max(0, this.H[1]) + this.u.j();
        if (d2.j() && (i6 = this.A) != -1 && this.B != Integer.MIN_VALUE && (O = O(i6)) != null) {
            if (this.x) {
                i7 = this.u.i() - this.u.d(O);
                g = this.B;
            } else {
                g = this.u.g(O) - this.u.n();
                i7 = this.B;
            }
            int i9 = i7 - g;
            if (i9 > 0) {
                max += i9;
            } else {
                max2 -= i9;
            }
        }
        a aVar3 = this.E;
        if (!aVar3.d ? !this.x : this.x) {
            i8 = 1;
        }
        Z2(xVar, d2, aVar3, i8);
        E(xVar);
        this.t.m = e3();
        this.t.j = d2.j();
        this.t.i = 0;
        a aVar4 = this.E;
        if (aVar4.d) {
            v3(aVar4);
            c cVar2 = this.t;
            cVar2.h = max;
            w2(xVar, cVar2, d2, false);
            c cVar3 = this.t;
            i3 = cVar3.b;
            int i10 = cVar3.d;
            int i11 = cVar3.c;
            if (i11 > 0) {
                max2 += i11;
            }
            t3(this.E);
            c cVar4 = this.t;
            cVar4.h = max2;
            cVar4.d += cVar4.e;
            w2(xVar, cVar4, d2, false);
            c cVar5 = this.t;
            i2 = cVar5.b;
            int i12 = cVar5.c;
            if (i12 > 0) {
                u3(i10, i3);
                c cVar6 = this.t;
                cVar6.h = i12;
                w2(xVar, cVar6, d2, false);
                i3 = this.t.b;
            }
        } else {
            t3(aVar4);
            c cVar7 = this.t;
            cVar7.h = max2;
            w2(xVar, cVar7, d2, false);
            c cVar8 = this.t;
            i2 = cVar8.b;
            int i13 = cVar8.d;
            int i14 = cVar8.c;
            if (i14 > 0) {
                max += i14;
            }
            v3(this.E);
            c cVar9 = this.t;
            cVar9.h = max;
            cVar9.d += cVar9.e;
            w2(xVar, cVar9, d2, false);
            c cVar10 = this.t;
            i3 = cVar10.b;
            int i15 = cVar10.c;
            if (i15 > 0) {
                s3(i13, i2);
                c cVar11 = this.t;
                cVar11.h = i15;
                w2(xVar, cVar11, d2, false);
                i2 = this.t.b;
            }
        }
        if (V() > 0) {
            if (this.x ^ this.y) {
                int K22 = K2(i2, xVar, d2, true);
                i4 = i3 + K22;
                i5 = i2 + K22;
                K2 = L2(i4, xVar, d2, false);
            } else {
                int L2 = L2(i3, xVar, d2, true);
                i4 = i3 + L2;
                i5 = i2 + L2;
                K2 = K2(i5, xVar, d2, false);
            }
            i3 = i4 + K2;
            i2 = i5 + K2;
        }
        X2(xVar, d2, i3, i2);
        if (!d2.j()) {
            this.u.u();
        } else {
            this.E.e();
        }
        this.v = this.y;
    }

    public final int s2(RecyclerView.D d2) {
        if (V() == 0) {
            return 0;
        }
        v2();
        return w.c(d2, this.u, A2(!this.z, true), z2(!this.z, true), this, this.z);
    }

    public final void s3(int i, int i2) {
        int i3;
        this.t.c = this.u.i() - i2;
        c cVar = this.t;
        if (this.x) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        cVar.e = i3;
        cVar.d = i;
        cVar.f = 1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean t() {
        if (this.s == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void t1(RecyclerView.D d2) {
        super.t1(d2);
        this.D = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.E.e();
    }

    public int t2(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.s == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.s == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.s == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.s == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.s != 1 && U2()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.s == 1 || !U2()) {
            return -1;
        } else {
            return 1;
        }
    }

    public final void t3(a aVar) {
        s3(aVar.b, aVar.c);
    }

    public c u2() {
        return new c();
    }

    public final void u3(int i, int i2) {
        int i3;
        this.t.c = i2 - this.u.n();
        c cVar = this.t;
        cVar.d = i;
        if (this.x) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        cVar.e = i3;
        cVar.f = -1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    public void v2() {
        if (this.t == null) {
            this.t = u2();
        }
    }

    public final void v3(a aVar) {
        u3(aVar.b, aVar.c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void w(int i, int i2, RecyclerView.D d2, RecyclerView.p.c cVar) {
        int i3;
        if (this.s != 0) {
            i = i2;
        }
        if (V() != 0 && i != 0) {
            v2();
            if (i > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            r3(i3, Math.abs(i), true, d2);
            p2(d2, this.t, cVar);
        }
    }

    public int w2(RecyclerView.x xVar, c cVar, RecyclerView.D d2, boolean z) {
        int i = cVar.c;
        int i2 = cVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.g = i2 + i;
            }
            a3(xVar, cVar);
        }
        int i3 = cVar.c + cVar.h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.m && i3 <= 0) || !cVar.c(d2)) {
                break;
            }
            bVar.a();
            W2(xVar, d2, cVar, bVar);
            if (!bVar.b) {
                cVar.b += bVar.a * cVar.f;
                if (!bVar.c || cVar.l != null || !d2.j()) {
                    int i4 = cVar.c;
                    int i5 = bVar.a;
                    cVar.c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.a;
                    cVar.g = i7;
                    int i8 = cVar.c;
                    if (i8 < 0) {
                        cVar.g = i7 + i8;
                    }
                    a3(xVar, cVar);
                }
                if (z && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.c;
    }

    public void w3() {
        Log.d(I, "validating child count " + V());
        boolean z = true;
        if (V() >= 1) {
            int w0 = w0(U(0));
            int g = this.u.g(U(0));
            if (this.x) {
                for (int i = 1; i < V(); i++) {
                    View U = U(i);
                    int w02 = w0(U);
                    int g2 = this.u.g(U);
                    if (w02 < w0) {
                        Y2();
                        StringBuilder sb = new StringBuilder();
                        sb.append("detected invalid position. loc invalid? ");
                        if (g2 >= g) {
                            z = false;
                        }
                        sb.append(z);
                        throw new RuntimeException(sb.toString());
                    } else if (g2 > g) {
                        Y2();
                        throw new RuntimeException("detected invalid location");
                    }
                }
                return;
            }
            for (int i2 = 1; i2 < V(); i2++) {
                View U2 = U(i2);
                int w03 = w0(U2);
                int g3 = this.u.g(U2);
                if (w03 < w0) {
                    Y2();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("detected invalid position. loc invalid? ");
                    if (g3 >= g) {
                        z = false;
                    }
                    sb2.append(z);
                    throw new RuntimeException(sb2.toString());
                } else if (g3 < g) {
                    Y2();
                    throw new RuntimeException("detected invalid location");
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void x(int i, RecyclerView.p.c cVar) {
        boolean z;
        int i2;
        d dVar = this.D;
        int i3 = -1;
        if (dVar != null && dVar.a()) {
            d dVar2 = this.D;
            z = dVar2.Z;
            i2 = dVar2.X;
        } else {
            f3();
            z = this.x;
            i2 = this.A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.G && i2 >= 0 && i2 < i; i4++) {
            cVar.a(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void x1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.D = dVar;
            if (this.A != -1) {
                dVar.b();
            }
            R1();
        }
    }

    public int x2() {
        View G2 = G2(0, V(), true, false);
        if (G2 == null) {
            return -1;
        }
        return w0(G2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int y(RecyclerView.D d2) {
        return q2(d2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable y1() {
        if (this.D != null) {
            return new d(this.D);
        }
        d dVar = new d();
        if (V() > 0) {
            v2();
            boolean z = this.v ^ this.x;
            dVar.Z = z;
            if (z) {
                View M2 = M2();
                dVar.Y = this.u.i() - this.u.d(M2);
                dVar.X = w0(M2);
                return dVar;
            }
            View N2 = N2();
            dVar.X = w0(N2);
            dVar.Y = this.u.g(N2) - this.u.n();
            return dVar;
        }
        dVar.b();
        return dVar;
    }

    public final View y2() {
        return F2(0, V());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z(RecyclerView.D d2) {
        return r2(d2);
    }

    public View z2(boolean z, boolean z2) {
        if (this.x) {
            return G2(0, V(), z, z2);
        }
        return G2(V() - 1, -1, z, z2);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        j3(i);
        l3(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.p.d x0 = RecyclerView.p.x0(context, attributeSet, i, i2);
        j3(x0.a);
        l3(x0.c);
        n3(x0.d);
    }
}
