package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.carousel.a;
import com.google.android.material.carousel.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.AbstractC8887pz;
import o.C10907yF1;
import o.C3258Il1;
import o.C5600ca;
import o.C7025iN1;
import o.C8982qM1;
import o.C9205rG;
import o.C9293rd1;
import o.F81;
import o.HT1;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceC8157mz;

/* loaded from: classes3.dex */
public class CarouselLayoutManager extends RecyclerView.p implements InterfaceC8157mz, RecyclerView.C.b {
    public static final String H = "CarouselLayoutManager";
    public static final int I = 0;
    public static final int J = 1;
    public static final int K = 0;
    public static final int L = 1;
    public int A;
    @InterfaceC11300zs1
    public Map<Integer, com.google.android.material.carousel.c> B;
    public AbstractC8887pz C;
    public final View.OnLayoutChangeListener D;
    public int E;
    public int F;
    public int G;
    @InterfaceC5056aJ2
    public int s;
    @InterfaceC5056aJ2
    public int t;
    @InterfaceC5056aJ2
    public int u;
    public boolean v;
    public final c w;
    @InterfaceC5670cr1
    public com.google.android.material.carousel.a x;
    @InterfaceC11300zs1
    public com.google.android.material.carousel.d y;
    @InterfaceC11300zs1
    public com.google.android.material.carousel.c z;

    /* loaded from: classes3.dex */
    public class a extends o {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.C
        @InterfaceC11300zs1
        public PointF a(int i) {
            return CarouselLayoutManager.this.c(i);
        }

        @Override // androidx.recyclerview.widget.o
        public int u(View view, int i) {
            if (CarouselLayoutManager.this.y != null && CarouselLayoutManager.this.g()) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                return carouselLayoutManager.E2(carouselLayoutManager.w0(view));
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.o
        public int v(View view, int i) {
            if (CarouselLayoutManager.this.y != null && !CarouselLayoutManager.this.g()) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                return carouselLayoutManager.E2(carouselLayoutManager.w0(view));
            }
            return 0;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public final View a;
        public final float b;
        public final float c;
        public final d d;

        public b(View view, float f, float f2, d dVar) {
            this.a = view;
            this.b = f;
            this.c = f2;
            this.d = dVar;
        }
    }

    /* loaded from: classes3.dex */
    public static class c extends RecyclerView.o {
        public final Paint a;
        public List<c.C0122c> b;

        public c() {
            Paint paint = new Paint();
            this.a = paint;
            this.b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void k(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 RecyclerView recyclerView, @InterfaceC5670cr1 RecyclerView.D d) {
            super.k(canvas, recyclerView, d);
            this.a.setStrokeWidth(recyclerView.getResources().getDimension(C7025iN1.f.m3_carousel_debug_keyline_width));
            for (c.C0122c c0122c : this.b) {
                this.a.setColor(C9205rG.j(-65281, -16776961, c0122c.c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).g()) {
                    canvas.drawLine(c0122c.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).Z2(), c0122c.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).V2(), this.a);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).W2(), c0122c.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).X2(), c0122c.b, this.a);
                }
            }
        }

        public void l(List<c.C0122c> list) {
            this.b = Collections.unmodifiableList(list);
        }
    }

    /* loaded from: classes3.dex */
    public static class d {
        public final c.C0122c a;
        public final c.C0122c b;

        public d(c.C0122c c0122c, c.C0122c c0122c2) {
            boolean z;
            if (c0122c.a <= c0122c2.a) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.a(z);
            this.a = c0122c;
            this.b = c0122c2;
        }
    }

    /* loaded from: classes3.dex */
    public static class e {
        public static final int a = -1;
        public static final int b = 1;
        public static final int c = Integer.MIN_VALUE;
    }

    public CarouselLayoutManager() {
        this(new C3258Il1());
    }

    public static int F2(int i, int i2, int i3, int i4) {
        int i5 = i2 + i;
        return i5 < i3 ? i3 - i2 : i5 > i4 ? i4 - i2 : i;
    }

    private int H2(int i) {
        int U2 = U2();
        if (i == 1) {
            return -1;
        }
        if (i == 2) {
            return 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        Log.d(H, "Unknown focus request:" + i);
                        return Integer.MIN_VALUE;
                    } else if (U2 == 1) {
                        return 1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (U2 != 0) {
                    return Integer.MIN_VALUE;
                } else {
                    if (e3()) {
                        return -1;
                    }
                    return 1;
                }
            } else if (U2 == 1) {
                return -1;
            } else {
                return Integer.MIN_VALUE;
            }
        } else if (U2 != 0) {
            return Integer.MIN_VALUE;
        } else {
            if (!e3()) {
                return -1;
            }
            return 1;
        }
    }

    public static d d3(List<c.C0122c> list, float f, boolean z) {
        float f2;
        float f3 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f4 = -3.4028235E38f;
        float f5 = Float.MAX_VALUE;
        float f6 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            c.C0122c c0122c = list.get(i5);
            if (z) {
                f2 = c0122c.b;
            } else {
                f2 = c0122c.a;
            }
            float abs = Math.abs(f2 - f);
            if (f2 <= f && abs <= f3) {
                i = i5;
                f3 = abs;
            }
            if (f2 > f && abs <= f5) {
                i3 = i5;
                f5 = abs;
            }
            if (f2 <= f6) {
                i2 = i5;
                f6 = f2;
            }
            if (f2 > f4) {
                i4 = i5;
                f4 = f2;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new d(list.get(i), list.get(i3));
    }

    private int o3(int i, RecyclerView.x xVar, RecyclerView.D d2) {
        float f;
        if (V() == 0 || i == 0) {
            return 0;
        }
        if (this.y == null) {
            l3(xVar);
        }
        if (f() <= O2(this.y).n()) {
            return 0;
        }
        int F2 = F2(i, this.s, this.t, this.u);
        this.s += F2;
        w3(this.y);
        float g = this.z.g() / 2.0f;
        float C2 = C2(w0(U(0)));
        Rect rect = new Rect();
        if (e3()) {
            f = this.z.i().b;
        } else {
            f = this.z.b().b;
        }
        float f2 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < V(); i2++) {
            View U = U(i2);
            float abs = Math.abs(f - k3(U, C2, g, rect));
            if (U != null && abs < f2) {
                this.F = w0(U);
                f2 = abs;
            }
            C2 = w2(C2, this.z.g());
        }
        I2(xVar, d2);
        return F2;
    }

    public static /* synthetic */ void p2(final CarouselLayoutManager carouselLayoutManager, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        carouselLayoutManager.getClass();
        if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
            return;
        }
        view.post(new Runnable() { // from class: o.nz
            @Override // java.lang.Runnable
            public final void run() {
                CarouselLayoutManager.this.m3();
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A(@InterfaceC5670cr1 RecyclerView.D d2) {
        return this.u - this.t;
    }

    public final void A2(RecyclerView.x xVar, int i) {
        float C2 = C2(i);
        while (i >= 0) {
            float w2 = w2(C2, this.z.g() / 2.0f);
            d d3 = d3(this.z.h(), w2, false);
            float B2 = B2(w2, d3);
            if (!g3(B2, d3)) {
                C2 = x2(C2, this.z.g());
                if (!f3(B2, d3)) {
                    View p = xVar.p(i);
                    v2(p, 0, new b(p, w2, B2, d3));
                }
                i--;
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int B(@InterfaceC5670cr1 RecyclerView.D d2) {
        if (V() != 0 && this.y != null && f() > 1) {
            return (int) (j0() * (this.y.g().g() / D(d2)));
        }
        return 0;
    }

    public final float B2(float f, d dVar) {
        c.C0122c c0122c = dVar.a;
        float f2 = c0122c.b;
        c.C0122c c0122c2 = dVar.b;
        float b2 = C5600ca.b(f2, c0122c2.b, c0122c.a, c0122c2.a, f);
        if (dVar.b != this.z.d() && dVar.a != this.z.k()) {
            return b2;
        }
        c.C0122c c0122c3 = dVar.b;
        return b2 + ((f - c0122c3.a) * (1.0f - c0122c3.c));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C(@InterfaceC5670cr1 RecyclerView.D d2) {
        return this.s;
    }

    public final float C2(int i) {
        return w2(Y2() - this.s, this.z.g() * i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int D(@InterfaceC5670cr1 RecyclerView.D d2) {
        return this.u - this.t;
    }

    public final int D2(RecyclerView.D d2, com.google.android.material.carousel.d dVar) {
        com.google.android.material.carousel.c h;
        c.C0122c i;
        float f;
        boolean e3 = e3();
        if (e3) {
            h = dVar.l();
        } else {
            h = dVar.h();
        }
        if (e3) {
            i = h.b();
        } else {
            i = h.i();
        }
        int i2 = 1;
        float d3 = (d2.d() - 1) * h.g();
        if (e3) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        float Y2 = (d3 * f) - (i.a - Y2());
        if (e3) {
            i2 = -1;
        }
        int i3 = (int) (Y2 + ((i2 * i.d) / 2.0f));
        if (e3) {
            return Math.min(0, i3);
        }
        return Math.max(0, i3);
    }

    public int E2(int i) {
        return (int) (this.s - b3(i, P2(i)));
    }

    public final int G2(@InterfaceC5670cr1 com.google.android.material.carousel.d dVar) {
        com.google.android.material.carousel.c l;
        c.C0122c b2;
        boolean e3 = e3();
        if (e3) {
            l = dVar.h();
        } else {
            l = dVar.l();
        }
        if (e3) {
            b2 = l.i();
        } else {
            b2 = l.b();
        }
        return (int) (Y2() - x2(b2.a, l.g() / 2.0f));
    }

    public final void I2(RecyclerView.x xVar, RecyclerView.D d2) {
        n3(xVar);
        if (V() == 0) {
            A2(xVar, this.A - 1);
            z2(xVar, d2, this.A);
        } else {
            int w0 = w0(U(0));
            int w02 = w0(U(V() - 1));
            A2(xVar, w0 - 1);
            z2(xVar, d2, w02 + 1);
        }
        y3();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean J0() {
        return true;
    }

    public final View J2() {
        int V;
        if (e3()) {
            V = 0;
        } else {
            V = V() - 1;
        }
        return U(V);
    }

    public final View K2() {
        int i;
        if (e3()) {
            i = V() - 1;
        } else {
            i = 0;
        }
        return U(i);
    }

    public final int L2() {
        if (g()) {
            return a();
        }
        return b();
    }

    public final float M2(View view) {
        int centerY;
        Rect rect = new Rect();
        super.c0(view, rect);
        if (g()) {
            centerY = rect.centerX();
        } else {
            centerY = rect.centerY();
        }
        return centerY;
    }

    public final int N2() {
        int i;
        int i2;
        if (V() <= 0) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) U(0).getLayoutParams();
        if (this.C.a == 0) {
            i = ((ViewGroup.MarginLayoutParams) qVar).leftMargin;
            i2 = ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        } else {
            i = ((ViewGroup.MarginLayoutParams) qVar).topMargin;
            i2 = ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }
        return i + i2;
    }

    public final com.google.android.material.carousel.c O2(com.google.android.material.carousel.d dVar) {
        if (e3()) {
            return dVar.h();
        }
        return dVar.l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q P() {
        return new RecyclerView.q(-2, -2);
    }

    public final com.google.android.material.carousel.c P2(int i) {
        com.google.android.material.carousel.c cVar;
        Map<Integer, com.google.android.material.carousel.c> map = this.B;
        if (map != null && (cVar = map.get(Integer.valueOf(C9293rd1.e(i, 0, Math.max(0, f() - 1))))) != null) {
            return cVar;
        }
        return this.y.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean Q1(@InterfaceC5670cr1 RecyclerView recyclerView, @InterfaceC5670cr1 View view, @InterfaceC5670cr1 Rect rect, boolean z, boolean z2) {
        int c3;
        if (this.y == null || (c3 = c3(w0(view), P2(w0(view)))) == 0) {
            return false;
        }
        p3(recyclerView, c3(w0(view), this.y.j(this.s + F2(c3, this.s, this.t, this.u), this.t, this.u)));
        return true;
    }

    public final int Q2() {
        if (Z()) {
            return 0;
        }
        if (U2() == 1) {
            return v0();
        }
        return s0();
    }

    public final float R2(float f, d dVar) {
        c.C0122c c0122c = dVar.a;
        float f2 = c0122c.d;
        c.C0122c c0122c2 = dVar.b;
        return C5600ca.b(f2, c0122c2.d, c0122c.b, c0122c2.b, f);
    }

    public int S2(int i, @InterfaceC5670cr1 com.google.android.material.carousel.c cVar) {
        return b3(i, cVar) - this.s;
    }

    public int T2(int i, boolean z) {
        int i2;
        int S2 = S2(i, this.y.k(this.s, this.t, this.u, true));
        if (this.B != null) {
            i2 = S2(i, P2(i));
        } else {
            i2 = S2;
        }
        if (z && Math.abs(i2) < Math.abs(S2)) {
            return i2;
        }
        return S2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int U1(int i, RecyclerView.x xVar, RecyclerView.D d2) {
        if (s()) {
            return o3(i, xVar, d2);
        }
        return 0;
    }

    public int U2() {
        return this.C.a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V0(@InterfaceC5670cr1 View view, int i, int i2) {
        float f;
        float f2;
        if (view instanceof F81) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            Rect rect = new Rect();
            r(view, rect);
            int i3 = i + rect.left + rect.right;
            int i4 = i2 + rect.top + rect.bottom;
            com.google.android.material.carousel.d dVar = this.y;
            if (dVar != null && this.C.a == 0) {
                f = dVar.g().g();
            } else {
                f = ((ViewGroup.MarginLayoutParams) qVar).width;
            }
            com.google.android.material.carousel.d dVar2 = this.y;
            if (dVar2 != null && this.C.a == 1) {
                f2 = dVar2.g().g();
            } else {
                f2 = ((ViewGroup.MarginLayoutParams) qVar).height;
            }
            view.measure(RecyclerView.p.W(D0(), E0(), s0() + t0() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i3, (int) f, s()), RecyclerView.p.W(j0(), k0(), v0() + q0() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i4, (int) f2, t()));
            return;
        }
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V1(int i) {
        this.F = i;
        if (this.y == null) {
            return;
        }
        this.s = b3(i, P2(i));
        this.A = C9293rd1.e(i, 0, Math.max(0, f() - 1));
        w3(this.y);
        R1();
    }

    public final int V2() {
        return this.C.h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int W1(int i, RecyclerView.x xVar, RecyclerView.D d2) {
        if (t()) {
            return o3(i, xVar, d2);
        }
        return 0;
    }

    public final int W2() {
        return this.C.j();
    }

    public final int X2() {
        return this.C.k();
    }

    public final int Y2() {
        return this.C.l();
    }

    public final int Z2() {
        return this.C.m();
    }

    @Override // o.InterfaceC8157mz
    public int a() {
        return D0();
    }

    public final int a3() {
        if (Z()) {
            return 0;
        }
        if (U2() == 1) {
            return q0();
        }
        return t0();
    }

    @Override // o.InterfaceC8157mz
    public int b() {
        return j0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView recyclerView) {
        super.b1(recyclerView);
        this.x.f(recyclerView.getContext());
        m3();
        recyclerView.addOnLayoutChangeListener(this.D);
    }

    public final int b3(int i, com.google.android.material.carousel.c cVar) {
        if (e3()) {
            return (int) (((L2() - cVar.i().a) - (i * cVar.g())) - (cVar.g() / 2.0f));
        }
        return (int) (((i * cVar.g()) - cVar.b().a) + (cVar.g() / 2.0f));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.C.b
    @InterfaceC11300zs1
    public PointF c(int i) {
        if (this.y == null) {
            return null;
        }
        int S2 = S2(i, P2(i));
        if (g()) {
            return new PointF(S2, 0.0f);
        }
        return new PointF(0.0f, S2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c0(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 Rect rect) {
        float f;
        super.c0(view, rect);
        float centerY = rect.centerY();
        if (g()) {
            centerY = rect.centerX();
        }
        float R2 = R2(centerY, d3(this.z.h(), centerY, true));
        float f2 = 0.0f;
        if (g()) {
            f = (rect.width() - R2) / 2.0f;
        } else {
            f = 0.0f;
        }
        if (!g()) {
            f2 = (rect.height() - R2) / 2.0f;
        }
        rect.set((int) (rect.left + f), (int) (rect.top + f2), (int) (rect.right - f), (int) (rect.bottom - f2));
    }

    public final int c3(int i, @InterfaceC5670cr1 com.google.android.material.carousel.c cVar) {
        int i2;
        int i3 = Integer.MAX_VALUE;
        for (c.C0122c c0122c : cVar.f()) {
            float g = (i * cVar.g()) + (cVar.g() / 2.0f);
            if (e3()) {
                i2 = (int) ((L2() - c0122c.a) - g);
            } else {
                i2 = (int) (g - c0122c.a);
            }
            int i4 = i2 - this.s;
            if (Math.abs(i3) > Math.abs(i4)) {
                i3 = i4;
            }
        }
        return i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d1(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.d1(recyclerView, xVar);
        recyclerView.removeOnLayoutChangeListener(this.D);
    }

    @Override // o.InterfaceC8157mz
    public int e() {
        return this.G;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @InterfaceC11300zs1
    public View e1(@InterfaceC5670cr1 View view, int i, @InterfaceC5670cr1 RecyclerView.x xVar, @InterfaceC5670cr1 RecyclerView.D d2) {
        int H2;
        if (V() == 0 || (H2 = H2(i)) == Integer.MIN_VALUE) {
            return null;
        }
        if (H2 == -1) {
            if (w0(view) == 0) {
                return null;
            }
            y2(xVar, w0(U(0)) - 1, 0);
            return K2();
        } else if (w0(view) == f() - 1) {
            return null;
        } else {
            y2(xVar, w0(U(V() - 1)) + 1, -1);
            return J2();
        }
    }

    public boolean e3() {
        if (g() && m0() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f1(@InterfaceC5670cr1 AccessibilityEvent accessibilityEvent) {
        super.f1(accessibilityEvent);
        if (V() > 0) {
            accessibilityEvent.setFromIndex(w0(U(0)));
            accessibilityEvent.setToIndex(w0(U(V() - 1)));
        }
    }

    public final boolean f3(float f, d dVar) {
        float x2 = x2(f, R2(f, dVar) / 2.0f);
        if (e3()) {
            if (x2 >= 0.0f) {
                return false;
            }
            return true;
        } else if (x2 <= L2()) {
            return false;
        } else {
            return true;
        }
    }

    @Override // o.InterfaceC8157mz
    public boolean g() {
        if (this.C.a == 0) {
            return true;
        }
        return false;
    }

    public final boolean g3(float f, d dVar) {
        float w2 = w2(f, R2(f, dVar) / 2.0f);
        if (e3()) {
            if (w2 <= L2()) {
                return false;
            }
            return true;
        } else if (w2 >= 0.0f) {
            return false;
        } else {
            return true;
        }
    }

    public final void h3() {
        if (this.v && Log.isLoggable(H, 3)) {
            Log.d(H, "internal representation of views on the screen");
            for (int i = 0; i < V(); i++) {
                View U = U(i);
                float M2 = M2(U);
                Log.d(H, "item position " + w0(U) + ", center:" + M2 + ", child index:" + i);
            }
            Log.d(H, "==============");
        }
    }

    public final b i3(RecyclerView.x xVar, float f, int i) {
        View p = xVar.p(i);
        V0(p, 0, 0);
        float w2 = w2(f, this.z.g() / 2.0f);
        d d3 = d3(this.z.h(), w2, false);
        return new b(p, w2, B2(w2, d3), d3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void j2(RecyclerView recyclerView, RecyclerView.D d2, int i) {
        a aVar = new a(recyclerView.getContext());
        aVar.q(i);
        k2(aVar);
    }

    public void j3() {
        m3();
    }

    public final float k3(View view, float f, float f2, Rect rect) {
        float w2 = w2(f, f2);
        d d3 = d3(this.z.h(), w2, false);
        float B2 = B2(w2, d3);
        super.c0(view, rect);
        v3(view, w2, d3);
        this.C.p(view, rect, f2, B2);
        return B2;
    }

    public final void l3(RecyclerView.x xVar) {
        View p = xVar.p(0);
        V0(p, 0, 0);
        com.google.android.material.carousel.c g = this.x.g(this, p);
        if (e3()) {
            g = com.google.android.material.carousel.c.p(g, L2());
        }
        this.y = com.google.android.material.carousel.d.f(this, g, N2(), Q2(), a3(), this.x.e());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void m1(@InterfaceC5670cr1 RecyclerView recyclerView, int i, int i2) {
        super.m1(recyclerView, i, i2);
        x3();
    }

    public final void m3() {
        this.y = null;
        R1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void n1(@InterfaceC5670cr1 RecyclerView recyclerView) {
        super.n1(recyclerView);
        x3();
    }

    public final void n3(RecyclerView.x xVar) {
        while (V() > 0) {
            View U = U(0);
            float M2 = M2(U);
            if (!g3(M2, d3(this.z.h(), M2, true))) {
                break;
            }
            J1(U, xVar);
        }
        while (V() - 1 >= 0) {
            View U2 = U(V() - 1);
            float M22 = M2(U2);
            if (f3(M22, d3(this.z.h(), M22, true))) {
                J1(U2, xVar);
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void p1(@InterfaceC5670cr1 RecyclerView recyclerView, int i, int i2) {
        super.p1(recyclerView, i, i2);
        x3();
    }

    public final void p3(RecyclerView recyclerView, int i) {
        if (g()) {
            recyclerView.scrollBy(i, 0);
        } else {
            recyclerView.scrollBy(0, i);
        }
    }

    public void q3(int i) {
        this.G = i;
        m3();
    }

    public final void r3(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7025iN1.o.l1);
            q3(obtainStyledAttributes.getInt(C7025iN1.o.m1, 0));
            u3(obtainStyledAttributes.getInt(C8982qM1.d.b, 0));
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean s() {
        return g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void s1(RecyclerView.x xVar, RecyclerView.D d2) {
        boolean z;
        int i;
        if (d2.d() > 0 && L2() > 0.0f) {
            boolean e3 = e3();
            com.google.android.material.carousel.d dVar = this.y;
            if (dVar == null) {
                z = true;
            } else {
                z = false;
            }
            if (z || dVar.g().a() != L2()) {
                l3(xVar);
            }
            int G2 = G2(this.y);
            int D2 = D2(d2, this.y);
            if (e3) {
                i = D2;
            } else {
                i = G2;
            }
            this.t = i;
            if (e3) {
                D2 = G2;
            }
            this.u = D2;
            if (z) {
                this.s = G2;
                this.B = this.y.i(f(), this.t, this.u, e3());
                int i2 = this.F;
                if (i2 != -1) {
                    this.s = b3(i2, P2(i2));
                }
            }
            int i3 = this.s;
            this.s = i3 + F2(0, i3, this.t, this.u);
            this.A = C9293rd1.e(this.A, 0, d2.d());
            w3(this.y);
            E(xVar);
            I2(xVar, d2);
            this.E = f();
            return;
        }
        H1(xVar);
        this.A = 0;
    }

    public void s3(@InterfaceC5670cr1 com.google.android.material.carousel.a aVar) {
        this.x = aVar;
        m3();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean t() {
        return !g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void t1(RecyclerView.D d2) {
        super.t1(d2);
        if (V() == 0) {
            this.A = 0;
        } else {
            this.A = w0(U(0));
        }
        y3();
    }

    @HT1({HT1.a.Y})
    public void t3(@InterfaceC5670cr1 RecyclerView recyclerView, boolean z) {
        this.v = z;
        recyclerView.y1(this.w);
        if (z) {
            recyclerView.n(this.w);
        }
        recyclerView.O0();
    }

    public void u3(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        n(null);
        AbstractC8887pz abstractC8887pz = this.C;
        if (abstractC8887pz != null && i == abstractC8887pz.a) {
            return;
        }
        this.C = AbstractC8887pz.c(this, i);
        m3();
    }

    public final void v2(View view, int i, b bVar) {
        float g = this.z.g() / 2.0f;
        k(view, i);
        V0(view, 0, 0);
        float f = bVar.c;
        this.C.n(view, (int) (f - g), (int) (f + g));
        v3(view, bVar.b, bVar.d);
    }

    public final void v3(View view, float f, d dVar) {
        if (!(view instanceof F81)) {
            return;
        }
        c.C0122c c0122c = dVar.a;
        float f2 = c0122c.c;
        c.C0122c c0122c2 = dVar.b;
        float b2 = C5600ca.b(f2, c0122c2.c, c0122c.a, c0122c2.a, f);
        float height = view.getHeight();
        float width = view.getWidth();
        RectF g = this.C.g(height, width, C5600ca.b(0.0f, height / 2.0f, 0.0f, 1.0f, b2), C5600ca.b(0.0f, width / 2.0f, 0.0f, 1.0f, b2));
        float B2 = B2(f, dVar);
        RectF rectF = new RectF(B2 - (g.width() / 2.0f), B2 - (g.height() / 2.0f), B2 + (g.width() / 2.0f), (g.height() / 2.0f) + B2);
        RectF rectF2 = new RectF(W2(), Z2(), X2(), V2());
        if (this.x.e() == a.EnumC0121a.CONTAINED) {
            this.C.a(g, rectF, rectF2);
        }
        this.C.o(g, rectF, rectF2);
        ((F81) view).setMaskRectF(g);
    }

    public final float w2(float f, float f2) {
        if (e3()) {
            return f - f2;
        }
        return f + f2;
    }

    public final void w3(@InterfaceC5670cr1 com.google.android.material.carousel.d dVar) {
        int i = this.u;
        int i2 = this.t;
        if (i <= i2) {
            this.z = O2(dVar);
        } else {
            this.z = dVar.j(this.s, i2, i);
        }
        this.w.l(this.z.h());
    }

    public final float x2(float f, float f2) {
        if (e3()) {
            return f + f2;
        }
        return f - f2;
    }

    public final void x3() {
        int f = f();
        int i = this.E;
        if (f != i && this.y != null) {
            if (this.x.j(this, i)) {
                m3();
            }
            this.E = f;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int y(@InterfaceC5670cr1 RecyclerView.D d2) {
        if (V() != 0 && this.y != null && f() > 1) {
            return (int) (D0() * (this.y.g().g() / A(d2)));
        }
        return 0;
    }

    public final void y2(@InterfaceC5670cr1 RecyclerView.x xVar, int i, int i2) {
        if (i >= 0 && i < f()) {
            b i3 = i3(xVar, C2(i), i);
            v2(i3.a, i2, i3);
        }
    }

    public final void y3() {
        if (this.v && V() >= 1) {
            int i = 0;
            while (i < V() - 1) {
                int w0 = w0(U(i));
                int i2 = i + 1;
                int w02 = w0(U(i2));
                if (w0 <= w02) {
                    i = i2;
                } else {
                    h3();
                    throw new IllegalStateException("Detected invalid child order. Child at index [" + i + "] had adapter position [" + w0 + "] and child at index [" + i2 + "] had adapter position [" + w02 + "].");
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z(@InterfaceC5670cr1 RecyclerView.D d2) {
        return this.s;
    }

    public final void z2(RecyclerView.x xVar, RecyclerView.D d2, int i) {
        float C2 = C2(i);
        while (i < d2.d()) {
            float w2 = w2(C2, this.z.g() / 2.0f);
            d d3 = d3(this.z.h(), w2, false);
            float B2 = B2(w2, d3);
            if (!f3(B2, d3)) {
                C2 = w2(C2, this.z.g());
                if (!g3(B2, d3)) {
                    View p = xVar.p(i);
                    v2(p, -1, new b(p, w2, B2, d3));
                }
                i++;
            } else {
                return;
            }
        }
    }

    public CarouselLayoutManager(@InterfaceC5670cr1 com.google.android.material.carousel.a aVar) {
        this(aVar, 0);
    }

    public CarouselLayoutManager(@InterfaceC5670cr1 com.google.android.material.carousel.a aVar, int i) {
        this.v = false;
        this.w = new c();
        this.A = 0;
        this.D = new View.OnLayoutChangeListener() { // from class: o.oz
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                CarouselLayoutManager.p2(CarouselLayoutManager.this, view, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        };
        this.F = -1;
        this.G = 0;
        s3(aVar);
        u3(i);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.v = false;
        this.w = new c();
        this.A = 0;
        this.D = new View.OnLayoutChangeListener() { // from class: o.oz
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i22, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                CarouselLayoutManager.p2(CarouselLayoutManager.this, view, i22, i3, i4, i5, i6, i7, i8, i9);
            }
        };
        this.F = -1;
        this.G = 0;
        s3(new C3258Il1());
        r3(context, attributeSet);
    }
}
