package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import o.C10861y4;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final boolean X = false;
    public static final String Y = "GridLayoutManager";
    public static final int Z = -1;
    public boolean O;
    public int P;
    public int[] Q;
    public View[] R;
    public final SparseIntArray S;
    public final SparseIntArray T;
    public c U;
    public final Rect V;
    public boolean W;

    /* loaded from: classes.dex */
    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i) {
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public final SparseIntArray a = new SparseIntArray();
        public final SparseIntArray b = new SparseIntArray();
        public boolean c = false;
        public boolean d = false;

        public static int a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 >= 0 && i4 < sparseIntArray.size()) {
                return sparseIntArray.keyAt(i4);
            }
            return -1;
        }

        public int b(int i, int i2) {
            if (!this.d) {
                return d(i, i2);
            }
            int i3 = this.b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d = d(i, i2);
            this.b.put(i, d);
            return d;
        }

        public int c(int i, int i2) {
            if (!this.c) {
                return e(i, i2);
            }
            int i3 = this.a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int e = e(i, i2);
            this.a.put(i, e);
            return e;
        }

        public int d(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int a;
            if (this.d && (a = a(this.b, i)) != -1) {
                i3 = this.b.get(a);
                i4 = a + 1;
                i5 = c(a, i2) + f(a);
                if (i5 == i2) {
                    i3++;
                    i5 = 0;
                }
            } else {
                i3 = 0;
                i4 = 0;
                i5 = 0;
            }
            int f = f(i);
            while (i4 < i) {
                int f2 = f(i4);
                i5 += f2;
                if (i5 == i2) {
                    i3++;
                    i5 = 0;
                } else if (i5 > i2) {
                    i3++;
                    i5 = f2;
                }
                i4++;
            }
            if (i5 + f > i2) {
                return i3 + 1;
            }
            return i3;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:17:0x0030). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:17:0x0030). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:17:0x0030). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int e(int i, int i2) {
            int i3;
            int i4;
            int f = f(i);
            if (f == i2) {
                return 0;
            }
            if (this.c && (i3 = a(this.a, i)) >= 0) {
                i4 = this.a.get(i3) + f(i3);
                i3++;
                if (i3 >= i) {
                }
            } else {
                i3 = 0;
                i4 = 0;
                if (i3 >= i) {
                    int f2 = f(i3);
                    i4 += f2;
                    if (i4 == i2) {
                        i4 = 0;
                    } else if (i4 > i2) {
                        i4 = f2;
                    }
                    i3++;
                    if (i3 >= i) {
                        if (f + i4 > i2) {
                            return 0;
                        }
                        return i4;
                    }
                }
            }
        }

        public abstract int f(int i);

        public void g() {
            this.b.clear();
        }

        public void h() {
            this.a.clear();
        }

        public boolean i() {
            return this.d;
        }

        public boolean j() {
            return this.c;
        }

        public void k(boolean z) {
            if (!z) {
                this.b.clear();
            }
            this.d = z;
        }

        public void l(boolean z) {
            if (!z) {
                this.b.clear();
            }
            this.c = z;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.O = false;
        this.P = -1;
        this.S = new SparseIntArray();
        this.T = new SparseIntArray();
        this.U = new a();
        this.V = new Rect();
        Q3(RecyclerView.p.x0(context, attributeSet, i, i2).b);
    }

    public static int[] A3(int[] iArr, int i, int i2) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 > 0 && i - i4 < i6) {
                i3 = i5 + 1;
                i4 -= i;
            } else {
                i3 = i5;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int A(RecyclerView.D d) {
        if (this.W) {
            return D3(d);
        }
        return super.A(d);
    }

    public final void B3() {
        this.S.clear();
        this.T.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int C(RecyclerView.D d) {
        if (this.W) {
            return C3(d);
        }
        return super.C(d);
    }

    public final int C3(RecyclerView.D d) {
        int max;
        if (V() != 0 && d.d() != 0) {
            v2();
            boolean V2 = V2();
            View A2 = A2(!V2, true);
            View z2 = z2(!V2, true);
            if (A2 != null && z2 != null) {
                int b2 = this.U.b(w0(A2), this.P);
                int b3 = this.U.b(w0(z2), this.P);
                int min = Math.min(b2, b3);
                int max2 = Math.max(b2, b3);
                int b4 = this.U.b(d.d() - 1, this.P) + 1;
                if (this.x) {
                    max = Math.max(0, (b4 - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (!V2) {
                    return max;
                }
                return Math.round((max * (Math.abs(this.u.d(z2) - this.u.g(A2)) / ((this.U.b(w0(z2), this.P) - this.U.b(w0(A2), this.P)) + 1))) + (this.u.n() - this.u.g(A2)));
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int D(RecyclerView.D d) {
        if (this.W) {
            return D3(d);
        }
        return super.D(d);
    }

    public final int D3(RecyclerView.D d) {
        if (V() != 0 && d.d() != 0) {
            v2();
            View A2 = A2(!V2(), true);
            View z2 = z2(!V2(), true);
            if (A2 != null && z2 != null) {
                if (!V2()) {
                    return this.U.b(d.d() - 1, this.P) + 1;
                }
                int d2 = this.u.d(z2) - this.u.g(A2);
                int b2 = this.U.b(w0(A2), this.P);
                return (int) ((d2 / ((this.U.b(w0(z2), this.P) - b2) + 1)) * (this.U.b(d.d() - 1, this.P) + 1));
            }
        }
        return 0;
    }

    public final void E3(RecyclerView.x xVar, RecyclerView.D d, LinearLayoutManager.a aVar, int i) {
        boolean z;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        int J3 = J3(xVar, d, aVar.b);
        if (z) {
            while (J3 > 0) {
                int i2 = aVar.b;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    aVar.b = i3;
                    J3 = J3(xVar, d, i3);
                } else {
                    return;
                }
            }
            return;
        }
        int d2 = d.d() - 1;
        int i4 = aVar.b;
        while (i4 < d2) {
            int i5 = i4 + 1;
            int J32 = J3(xVar, d, i5);
            if (J32 <= J3) {
                break;
            }
            i4 = i5;
            J3 = J32;
        }
        aVar.b = i4;
    }

    public final void F3() {
        View[] viewArr = this.R;
        if (viewArr != null && viewArr.length == this.P) {
            return;
        }
        this.R = new View[this.P];
    }

    public int G3(int i, int i2) {
        if (this.s == 1 && U2()) {
            int[] iArr = this.Q;
            int i3 = this.P;
            return iArr[i3 - i] - iArr[(i3 - i) - i2];
        }
        int[] iArr2 = this.Q;
        return iArr2[i2 + i] - iArr2[i];
    }

    public int H3() {
        return this.P;
    }

    public final int I3(RecyclerView.x xVar, RecyclerView.D d, int i) {
        if (!d.j()) {
            return this.U.b(i, this.P);
        }
        int g = xVar.g(i);
        if (g == -1) {
            Log.w(Y, "Cannot find span size for pre layout position. " + i);
            return 0;
        }
        return this.U.b(g, this.P);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View J2(RecyclerView.x xVar, RecyclerView.D d, boolean z, boolean z2) {
        int i;
        int i2;
        int V = V();
        int i3 = 1;
        if (z2) {
            i2 = V() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = V;
            i2 = 0;
        }
        int d2 = d.d();
        v2();
        int n = this.u.n();
        int i4 = this.u.i();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View U = U(i2);
            int w0 = w0(U);
            if (w0 >= 0 && w0 < d2 && J3(xVar, d, w0) == 0) {
                if (((RecyclerView.q) U.getLayoutParams()).g()) {
                    if (view2 == null) {
                        view2 = U;
                    }
                } else if (this.u.g(U) < i4 && this.u.d(U) >= n) {
                    return U;
                } else {
                    if (view == null) {
                        view = U;
                    }
                }
            }
            i2 += i3;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    public final int J3(RecyclerView.x xVar, RecyclerView.D d, int i) {
        if (!d.j()) {
            return this.U.c(i, this.P);
        }
        int i2 = this.T.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int g = xVar.g(i);
        if (g == -1) {
            Log.w(Y, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        return this.U.c(g, this.P);
    }

    public final int K3(RecyclerView.x xVar, RecyclerView.D d, int i) {
        if (!d.j()) {
            return this.U.f(i);
        }
        int i2 = this.S.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int g = xVar.g(i);
        if (g == -1) {
            Log.w(Y, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        return this.U.f(g);
    }

    public c L3() {
        return this.U;
    }

    public final void M3(float f, int i) {
        z3(Math.max(Math.round(f * this.P), i));
    }

    public boolean N3() {
        return this.W;
    }

    public final void O3(View view, int i, boolean z) {
        int i2;
        int i3;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int G3 = G3(bVar.e, bVar.f);
        if (this.s == 1) {
            i3 = RecyclerView.p.W(G3, i, i5, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i2 = RecyclerView.p.W(this.u.o(), k0(), i4, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int W = RecyclerView.p.W(G3, i, i4, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int W2 = RecyclerView.p.W(this.u.o(), E0(), i5, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i2 = W;
            i3 = W2;
        }
        P3(view, i3, i2, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q P() {
        if (this.s == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    public final void P3(View view, int i, int i2, boolean z) {
        boolean g2;
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z) {
            g2 = i2(view, i, i2, qVar);
        } else {
            g2 = g2(view, i, i2, qVar);
        }
        if (g2) {
            view.measure(i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q Q(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public void Q3(int i) {
        if (i == this.P) {
            return;
        }
        this.O = true;
        if (i >= 1) {
            this.P = i;
            this.U.h();
            R1();
            return;
        }
        throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q R(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    public void R3(c cVar) {
        this.U = cVar;
    }

    public void S3(boolean z) {
        this.W = z;
    }

    public final void T3() {
        int j0;
        int v0;
        if (Q2() == 1) {
            j0 = D0() - t0();
            v0 = s0();
        } else {
            j0 = j0() - q0();
            v0 = v0();
        }
        z3(j0 - v0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int U1(int i, RecyclerView.x xVar, RecyclerView.D d) {
        T3();
        F3();
        return super.U1(i, xVar, d);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int W1(int i, RecyclerView.x xVar, RecyclerView.D d) {
        T3();
        F3();
        return super.W1(i, xVar, d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
        r21.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void W2(RecyclerView.x xVar, RecyclerView.D d, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int W;
        int i9;
        View e;
        int m = this.u.m();
        if (m != 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (V() > 0) {
            i = this.Q[this.P];
        } else {
            i = 0;
        }
        if (z) {
            T3();
        }
        if (cVar.e == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i10 = this.P;
        if (!z2) {
            i10 = J3(xVar, d, cVar.d) + K3(xVar, d, cVar.d);
        }
        int i11 = 0;
        while (i11 < this.P && cVar.c(d) && i10 > 0) {
            int i12 = cVar.d;
            int K3 = K3(xVar, d, i12);
            if (K3 <= this.P) {
                i10 -= K3;
                if (i10 < 0 || (e = cVar.e(xVar)) == null) {
                    break;
                }
                this.R[i11] = e;
                i11++;
            } else {
                throw new IllegalArgumentException("Item at position " + i12 + " requires " + K3 + " spans but GridLayoutManager has only " + this.P + " spans.");
            }
        }
        x3(xVar, d, i11, z2);
        float f = 0.0f;
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            View view = this.R[i14];
            if (cVar.l == null) {
                if (z2) {
                    j(view);
                } else {
                    k(view, 0);
                }
            } else if (z2) {
                h(view);
            } else {
                i(view, 0);
            }
            r(view, this.V);
            O3(view, m, false);
            int e2 = this.u.e(view);
            if (e2 > i13) {
                i13 = e2;
            }
            float f2 = (this.u.f(view) * 1.0f) / ((b) view.getLayoutParams()).f;
            if (f2 > f) {
                f = f2;
            }
        }
        if (z) {
            M3(f, i);
            i13 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                View view2 = this.R[i15];
                O3(view2, 1073741824, true);
                int e3 = this.u.e(view2);
                if (e3 > i13) {
                    i13 = e3;
                }
            }
        }
        for (int i16 = 0; i16 < i11; i16++) {
            View view3 = this.R[i16];
            if (this.u.e(view3) != i13) {
                b bVar2 = (b) view3.getLayoutParams();
                Rect rect = bVar2.b;
                int i17 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar2).topMargin + ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
                int i18 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar2).leftMargin + ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
                int G3 = G3(bVar2.e, bVar2.f);
                if (this.s == 1) {
                    i9 = RecyclerView.p.W(G3, 1073741824, i18, ((ViewGroup.MarginLayoutParams) bVar2).width, false);
                    W = View.MeasureSpec.makeMeasureSpec(i13 - i17, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13 - i18, 1073741824);
                    W = RecyclerView.p.W(G3, 1073741824, i17, ((ViewGroup.MarginLayoutParams) bVar2).height, false);
                    i9 = makeMeasureSpec;
                }
                P3(view3, i9, W, true);
            }
        }
        bVar.a = i13;
        if (this.s == 1) {
            if (cVar.f == -1) {
                i7 = cVar.b;
                i8 = i7 - i13;
            } else {
                i8 = cVar.b;
                i7 = i8 + i13;
            }
            i5 = i8;
            i6 = 0;
            i4 = 0;
        } else {
            if (cVar.f == -1) {
                i3 = cVar.b;
                i2 = i3 - i13;
            } else {
                i2 = cVar.b;
                i3 = i2 + i13;
            }
            i4 = i2;
            i5 = 0;
            i6 = i3;
            i7 = 0;
        }
        for (int i19 = 0; i19 < i11; i19++) {
            View view4 = this.R[i19];
            b bVar3 = (b) view4.getLayoutParams();
            if (this.s == 1) {
                if (U2()) {
                    i6 = s0() + this.Q[this.P - bVar3.e];
                    i4 = i6 - this.u.f(view4);
                } else {
                    i4 = this.Q[bVar3.e] + s0();
                    i6 = this.u.f(view4) + i4;
                }
            } else {
                i5 = this.Q[bVar3.e] + v0();
                i7 = this.u.f(view4) + i5;
            }
            int i20 = i7;
            int i21 = i5;
            int i22 = i6;
            int i23 = i4;
            T0(view4, i23, i21, i22, i20);
            i7 = i20;
            i4 = i23;
            i6 = i22;
            i5 = i21;
            if (bVar3.g() || bVar3.f()) {
                bVar.c = true;
            }
            bVar.d = view4.hasFocusable() | bVar.d;
        }
        Arrays.fill(this.R, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void Z2(RecyclerView.x xVar, RecyclerView.D d, LinearLayoutManager.a aVar, int i) {
        super.Z2(xVar, d, aVar, i);
        T3();
        if (d.d() > 0 && !d.j()) {
            E3(xVar, d, aVar, i);
        }
        F3();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int a0(RecyclerView.x xVar, RecyclerView.D d) {
        if (this.s == 1) {
            return this.P;
        }
        if (d.d() < 1) {
            return 0;
        }
        return I3(xVar, d, d.d() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c2(Rect rect, int i, int i2) {
        int v;
        int v2;
        if (this.Q == null) {
            super.c2(rect, i, i2);
        }
        int s0 = s0() + t0();
        int v0 = v0() + q0();
        if (this.s == 1) {
            v2 = RecyclerView.p.v(i2, rect.height() + v0, o0());
            int[] iArr = this.Q;
            v = RecyclerView.p.v(i, iArr[iArr.length - 1] + s0, p0());
        } else {
            v = RecyclerView.p.v(i, rect.width() + s0, p0());
            int[] iArr2 = this.Q;
            v2 = RecyclerView.p.v(i2, iArr2[iArr2.length - 1] + v0, o0());
        }
        b2(v, v2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
        if (r13 == r4) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f3, code lost:
        if (r13 == r8) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0111  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View e1(View view, int i, RecyclerView.x xVar, RecyclerView.D d) {
        boolean z;
        int V;
        int i2;
        int i3;
        boolean z2;
        View view2;
        View view3;
        View view4;
        int i4;
        int i5;
        int i6;
        boolean z3;
        RecyclerView.x xVar2 = xVar;
        RecyclerView.D d2 = d;
        View N = N(view);
        View view5 = null;
        if (N == null) {
            return null;
        }
        b bVar = (b) N.getLayoutParams();
        int i7 = bVar.e;
        int i8 = bVar.f + i7;
        if (super.e1(view, i, xVar, d) == null) {
            return null;
        }
        if (t2(i) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.x) {
            i3 = V() - 1;
            V = -1;
            i2 = -1;
        } else {
            V = V();
            i2 = 1;
            i3 = 0;
        }
        if (this.s == 1 && U2()) {
            z2 = true;
        } else {
            z2 = false;
        }
        int I3 = I3(xVar2, d2, i3);
        int i9 = -1;
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = i3;
        View view6 = null;
        while (i13 != V) {
            int I32 = I3(xVar2, d2, i13);
            View U = U(i13);
            if (U == N) {
                break;
            }
            if (U.hasFocusable() && I32 != I3) {
                if (view5 != null) {
                    break;
                }
                view2 = N;
                view3 = view5;
            } else {
                b bVar2 = (b) U.getLayoutParams();
                int i14 = bVar2.e;
                view2 = N;
                int i15 = bVar2.f + i14;
                if (U.hasFocusable() && i14 == i7 && i15 == i8) {
                    return U;
                }
                if ((U.hasFocusable() && view5 == null) || (!U.hasFocusable() && view6 == null)) {
                    view3 = view5;
                } else {
                    view3 = view5;
                    int min = Math.min(i15, i8) - Math.max(i14, i7);
                    if (U.hasFocusable()) {
                        if (min <= i11) {
                            if (min == i11) {
                                if (i14 > i9) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            }
                        }
                    } else if (view3 == null) {
                        view4 = view6;
                        i4 = i11;
                        boolean z4 = true;
                        if (R0(U, false, true)) {
                            i5 = i12;
                            if (min > i5) {
                                i6 = i10;
                            } else {
                                if (min == i5) {
                                    i6 = i10;
                                    if (i14 <= i6) {
                                        z4 = false;
                                    }
                                } else {
                                    i6 = i10;
                                }
                                i10 = i6;
                                i12 = i5;
                                view6 = view4;
                                i11 = i4;
                                view5 = view3;
                                i13 += i2;
                                xVar2 = xVar;
                                d2 = d;
                                N = view2;
                            }
                            if (!U.hasFocusable()) {
                                i10 = i6;
                                i12 = i5;
                                i9 = bVar2.e;
                                view6 = view4;
                                view5 = U;
                                i11 = Math.min(i15, i8) - Math.max(i14, i7);
                                i13 += i2;
                                xVar2 = xVar;
                                d2 = d;
                                N = view2;
                            } else {
                                int i16 = bVar2.e;
                                i12 = Math.min(i15, i8) - Math.max(i14, i7);
                                view6 = U;
                                i10 = i16;
                                i11 = i4;
                                view5 = view3;
                                i13 += i2;
                                xVar2 = xVar;
                                d2 = d;
                                N = view2;
                            }
                        }
                        i6 = i10;
                        i5 = i12;
                        i10 = i6;
                        i12 = i5;
                        view6 = view4;
                        i11 = i4;
                        view5 = view3;
                        i13 += i2;
                        xVar2 = xVar;
                        d2 = d;
                        N = view2;
                    }
                }
                view4 = view6;
                i4 = i11;
                i6 = i10;
                i5 = i12;
                if (!U.hasFocusable()) {
                }
            }
            view4 = view6;
            i4 = i11;
            i6 = i10;
            i5 = i12;
            i10 = i6;
            i12 = i5;
            view6 = view4;
            i11 = i4;
            view5 = view3;
            i13 += i2;
            xVar2 = xVar;
            d2 = d;
            N = view2;
        }
        View view7 = view5;
        View view8 = view6;
        if (view7 != null) {
            return view7;
        }
        return view8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void h1(RecyclerView.x xVar, RecyclerView.D d, C10861y4 c10861y4) {
        super.h1(xVar, d, c10861y4);
        c10861y4.k1(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void k1(RecyclerView.x xVar, RecyclerView.D d, View view, C10861y4 c10861y4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.j1(view, c10861y4);
            return;
        }
        b bVar = (b) layoutParams;
        int I3 = I3(xVar, d, bVar.d());
        if (this.s == 0) {
            c10861y4.n1(C10861y4.g.j(bVar.j(), bVar.k(), I3, 1, false, false));
        } else {
            c10861y4.n1(C10861y4.g.j(I3, 1, bVar.j(), bVar.k(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void m1(RecyclerView recyclerView, int i, int i2) {
        this.U.h();
        this.U.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void n1(RecyclerView recyclerView) {
        this.U.h();
        this.U.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean n2() {
        if (this.D == null && !this.O) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void n3(boolean z) {
        if (!z) {
            super.n3(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void o1(RecyclerView recyclerView, int i, int i2, int i3) {
        this.U.h();
        this.U.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void p1(RecyclerView recyclerView, int i, int i2) {
        this.U.h();
        this.U.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void p2(RecyclerView.D d, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int i = this.P;
        for (int i2 = 0; i2 < this.P && cVar.c(d) && i > 0; i2++) {
            int i3 = cVar.d;
            cVar2.a(i3, Math.max(0, cVar.g));
            i -= this.U.f(i3);
            cVar.d += cVar.e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void r1(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.U.h();
        this.U.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void s1(RecyclerView.x xVar, RecyclerView.D d) {
        if (d.j()) {
            y3();
        }
        super.s1(xVar, d);
        B3();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void t1(RecyclerView.D d) {
        super.t1(d);
        this.O = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean u(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    public final void x3(RecyclerView.x xVar, RecyclerView.D d, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (z) {
            i4 = 1;
            i3 = i;
            i2 = 0;
        } else {
            i2 = i - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View view = this.R[i2];
            b bVar = (b) view.getLayoutParams();
            int K3 = K3(xVar, d, w0(view));
            bVar.f = K3;
            bVar.e = i5;
            i5 += K3;
            i2 += i4;
        }
    }

    public final void y3() {
        int V = V();
        for (int i = 0; i < V; i++) {
            b bVar = (b) U(i).getLayoutParams();
            int d = bVar.d();
            this.S.put(d, bVar.k());
            this.T.put(d, bVar.j());
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int z(RecyclerView.D d) {
        if (this.W) {
            return C3(d);
        }
        return super.z(d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z0(RecyclerView.x xVar, RecyclerView.D d) {
        if (this.s == 0) {
            return this.P;
        }
        if (d.d() < 1) {
            return 0;
        }
        return I3(xVar, d, d.d() - 1) + 1;
    }

    public final void z3(int i) {
        this.Q = A3(this.Q, this.P, i);
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.q {
        public static final int g = -1;
        public int e;
        public int f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.e = -1;
            this.f = 0;
        }

        public int j() {
            return this.e;
        }

        public int k() {
            return this.f;
        }

        public b(int i, int i2) {
            super(i, i2);
            this.e = -1;
            this.f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.e = -1;
            this.f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.e = -1;
            this.f = 0;
        }

        public b(RecyclerView.q qVar) {
            super(qVar);
            this.e = -1;
            this.f = 0;
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.O = false;
        this.P = -1;
        this.S = new SparseIntArray();
        this.T = new SparseIntArray();
        this.U = new a();
        this.V = new Rect();
        Q3(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.O = false;
        this.P = -1;
        this.S = new SparseIntArray();
        this.T = new SparseIntArray();
        this.U = new a();
        this.V = new Rect();
        Q3(i);
    }
}
