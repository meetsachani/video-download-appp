package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.ui.g;
import com.google.android.exoplayer2.ui.l;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import o.AR1;
import o.AbstractC7373jp2;
import o.C10323vs;
import o.C6361fi0;
import o.C9542sf;
import o.ES1;
import o.HD1;
import o.InterfaceC11300zs1;
import o.K40;
import o.TD2;

@Deprecated
/* loaded from: classes2.dex */
public class e extends FrameLayout {
    public static final int a2 = 5000;
    public static final int b2 = 0;
    public static final int c2 = 200;
    public static final int d2 = 100;
    public static final int e2 = 1000;
    public final float A1;
    public final float B1;
    public final String C1;
    public final String D1;
    @InterfaceC11300zs1
    public HD1 E1;
    @InterfaceC11300zs1
    public d F1;
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public boolean J1;
    public int K1;
    public int L1;
    public int M1;
    public boolean N1;
    public boolean O1;
    public boolean P1;
    public boolean Q1;
    public boolean R1;
    public long S1;
    public long[] T1;
    public boolean[] U1;
    public long[] V1;
    public boolean[] W1;
    public long X1;
    public final c Y0;
    public long Y1;
    public final CopyOnWriteArrayList<InterfaceC0100e> Z0;
    public long Z1;
    @InterfaceC11300zs1
    public final View a1;
    @InterfaceC11300zs1
    public final View b1;
    @InterfaceC11300zs1
    public final View c1;
    @InterfaceC11300zs1
    public final View d1;
    @InterfaceC11300zs1
    public final View e1;
    @InterfaceC11300zs1
    public final View f1;
    @InterfaceC11300zs1
    public final ImageView g1;
    @InterfaceC11300zs1
    public final ImageView h1;
    @InterfaceC11300zs1
    public final View i1;
    @InterfaceC11300zs1
    public final TextView j1;
    @InterfaceC11300zs1
    public final TextView k1;
    @InterfaceC11300zs1
    public final l l1;
    public final StringBuilder m1;
    public final Formatter n1;
    public final AbstractC7373jp2.b o1;
    public final AbstractC7373jp2.d p1;
    public final Runnable q1;
    public final Runnable r1;
    public final Drawable s1;
    public final Drawable t1;
    public final Drawable u1;
    public final String v1;
    public final String w1;
    public final String x1;
    public final Drawable y1;
    public final Drawable z1;

    @ES1(21)
    /* loaded from: classes2.dex */
    public static final class b {
        @K40
        public static boolean a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    /* loaded from: classes2.dex */
    public final class c implements HD1.g, l.a, View.OnClickListener {
        public c() {
        }

        @Override // o.HD1.g
        public void c0(HD1 hd1, HD1.f fVar) {
            if (fVar.b(4, 5)) {
                e.this.O();
            }
            if (fVar.b(4, 5, 7)) {
                e.this.P();
            }
            if (fVar.a(8)) {
                e.this.Q();
            }
            if (fVar.a(9)) {
                e.this.R();
            }
            if (fVar.b(8, 9, 11, 0, 13)) {
                e.this.N();
            }
            if (fVar.b(11, 0)) {
                e.this.S();
            }
        }

        @Override // com.google.android.exoplayer2.ui.l.a
        public void d0(l lVar, long j, boolean z) {
            e.this.J1 = false;
            if (!z && e.this.E1 != null) {
                e eVar = e.this;
                eVar.I(eVar.E1, j);
            }
        }

        @Override // com.google.android.exoplayer2.ui.l.a
        public void h0(l lVar, long j) {
            e.this.J1 = true;
            if (e.this.k1 != null) {
                e.this.k1.setText(TD2.z0(e.this.m1, e.this.n1, j));
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HD1 hd1 = e.this.E1;
            if (hd1 != null) {
                if (e.this.b1 == view) {
                    hd1.j1();
                } else if (e.this.a1 == view) {
                    hd1.z0();
                } else if (e.this.e1 == view) {
                    if (hd1.X() != 4) {
                        hd1.p2();
                    }
                } else if (e.this.f1 == view) {
                    hd1.r2();
                } else if (e.this.c1 == view) {
                    TD2.J0(hd1);
                } else if (e.this.d1 == view) {
                    TD2.I0(hd1);
                } else if (e.this.g1 == view) {
                    hd1.u0(AR1.a(hd1.w0(), e.this.M1));
                } else if (e.this.h1 == view) {
                    hd1.v1(!hd1.n2());
                }
            }
        }

        @Override // com.google.android.exoplayer2.ui.l.a
        public void y(l lVar, long j) {
            if (e.this.k1 != null) {
                e.this.k1.setText(TD2.z0(e.this.m1, e.this.n1, j));
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(long j, long j2);
    }

    /* renamed from: com.google.android.exoplayer2.ui.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0100e {
        void y(int i);
    }

    static {
        C6361fi0.a("goog.exo.ui");
    }

    public e(Context context) {
        this(context, null);
    }

    @SuppressLint({"InlinedApi"})
    public static boolean C(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    public static boolean x(AbstractC7373jp2 abstractC7373jp2, AbstractC7373jp2.d dVar) {
        if (abstractC7373jp2.w() > 100) {
            return false;
        }
        int w = abstractC7373jp2.w();
        for (int i = 0; i < w; i++) {
            if (abstractC7373jp2.u(i, dVar).i1 == C10323vs.b) {
                return false;
            }
        }
        return true;
    }

    public static int z(TypedArray typedArray, int i) {
        return typedArray.getInt(g.m.t0, i);
    }

    public void A() {
        if (D()) {
            setVisibility(8);
            Iterator<InterfaceC0100e> it = this.Z0.iterator();
            while (it.hasNext()) {
                it.next().y(getVisibility());
            }
            removeCallbacks(this.q1);
            removeCallbacks(this.r1);
            this.S1 = C10323vs.b;
        }
    }

    public final void B() {
        removeCallbacks(this.r1);
        if (this.K1 > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            int i = this.K1;
            this.S1 = uptimeMillis + i;
            if (this.G1) {
                postDelayed(this.r1, i);
                return;
            }
            return;
        }
        this.S1 = C10323vs.b;
    }

    public boolean D() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void E(InterfaceC0100e interfaceC0100e) {
        this.Z0.remove(interfaceC0100e);
    }

    public final void F() {
        View view;
        View view2;
        boolean G1 = TD2.G1(this.E1);
        if (G1 && (view2 = this.c1) != null) {
            view2.sendAccessibilityEvent(8);
        } else if (!G1 && (view = this.d1) != null) {
            view.sendAccessibilityEvent(8);
        }
    }

    public final void G() {
        View view;
        View view2;
        boolean G1 = TD2.G1(this.E1);
        if (G1 && (view2 = this.c1) != null) {
            view2.requestFocus();
        } else if (!G1 && (view = this.d1) != null) {
            view.requestFocus();
        }
    }

    public final void H(HD1 hd1, int i, long j) {
        hd1.s1(i, j);
    }

    public final void I(HD1 hd1, long j) {
        int c22;
        AbstractC7373jp2 e1 = hd1.e1();
        if (this.I1 && !e1.x()) {
            int w = e1.w();
            c22 = 0;
            while (true) {
                long g = e1.u(c22, this.p1).g();
                if (j < g) {
                    break;
                } else if (c22 == w - 1) {
                    j = g;
                    break;
                } else {
                    j -= g;
                    c22++;
                }
            }
        } else {
            c22 = hd1.c2();
        }
        H(hd1, c22, j);
        P();
    }

    public void J(@InterfaceC11300zs1 long[] jArr, @InterfaceC11300zs1 boolean[] zArr) {
        boolean z = false;
        if (jArr == null) {
            this.V1 = new long[0];
            this.W1 = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) C9542sf.g(zArr);
            if (jArr.length == zArr2.length) {
                z = true;
            }
            C9542sf.a(z);
            this.V1 = jArr;
            this.W1 = zArr2;
        }
        S();
    }

    public void K() {
        if (!D()) {
            setVisibility(0);
            Iterator<InterfaceC0100e> it = this.Z0.iterator();
            while (it.hasNext()) {
                it.next().y(getVisibility());
            }
            L();
            G();
            F();
        }
        B();
    }

    public final void L() {
        O();
        N();
        Q();
        R();
        S();
    }

    public final void M(boolean z, boolean z2, @InterfaceC11300zs1 View view) {
        float f;
        int i;
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        if (z2) {
            f = this.A1;
        } else {
            f = this.B1;
        }
        view.setAlpha(f);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public final void N() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (D() && this.G1) {
            HD1 hd1 = this.E1;
            if (hd1 != null) {
                z = hd1.T0(5);
                z3 = hd1.T0(7);
                z4 = hd1.T0(11);
                z5 = hd1.T0(12);
                z2 = hd1.T0(9);
            } else {
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            }
            M(this.P1, z3, this.a1);
            M(this.N1, z4, this.f1);
            M(this.O1, z5, this.e1);
            M(this.Q1, z2, this.b1);
            l lVar = this.l1;
            if (lVar != null) {
                lVar.setEnabled(z);
            }
        }
    }

    public final void O() {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        if (D() && this.G1) {
            boolean G1 = TD2.G1(this.E1);
            View view = this.c1;
            int i2 = 8;
            boolean z4 = true;
            if (view != null) {
                if (!G1 && view.isFocused()) {
                    z = true;
                } else {
                    z = false;
                }
                if (TD2.a < 21) {
                    z2 = z;
                } else if (!G1 && b.a(this.c1)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                View view2 = this.c1;
                if (G1) {
                    i = 0;
                } else {
                    i = 8;
                }
                view2.setVisibility(i);
            } else {
                z = false;
                z2 = false;
            }
            View view3 = this.d1;
            if (view3 != null) {
                if (G1 && view3.isFocused()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z |= z3;
                if (TD2.a < 21) {
                    z4 = z;
                } else if (!G1 || !b.a(this.d1)) {
                    z4 = false;
                }
                z2 |= z4;
                View view4 = this.d1;
                if (!G1) {
                    i2 = 0;
                }
                view4.setVisibility(i2);
            }
            if (z) {
                G();
            }
            if (z2) {
                F();
            }
        }
    }

    public final void P() {
        long j;
        long j2;
        boolean z;
        int X;
        long j3;
        if (D() && this.G1) {
            HD1 hd1 = this.E1;
            if (hd1 != null) {
                j = this.X1 + hd1.P1();
                j2 = this.X1 + hd1.o2();
            } else {
                j = 0;
                j2 = 0;
            }
            boolean z2 = false;
            if (j != this.Y1) {
                z = true;
            } else {
                z = false;
            }
            if (j2 != this.Z1) {
                z2 = true;
            }
            this.Y1 = j;
            this.Z1 = j2;
            TextView textView = this.k1;
            if (textView != null && !this.J1 && z) {
                textView.setText(TD2.z0(this.m1, this.n1, j));
            }
            l lVar = this.l1;
            if (lVar != null) {
                lVar.setPosition(j);
                this.l1.setBufferedPosition(j2);
            }
            d dVar = this.F1;
            if (dVar != null && (z || z2)) {
                dVar.a(j, j2);
            }
            removeCallbacks(this.q1);
            if (hd1 == null) {
                X = 1;
            } else {
                X = hd1.X();
            }
            long j4 = 1000;
            if (hd1 != null && hd1.isPlaying()) {
                l lVar2 = this.l1;
                if (lVar2 != null) {
                    j3 = lVar2.getPreferredUpdateDelay();
                } else {
                    j3 = 1000;
                }
                long min = Math.min(j3, 1000 - (j % 1000));
                float f = hd1.h().X;
                if (f > 0.0f) {
                    j4 = ((float) min) / f;
                }
                postDelayed(this.q1, TD2.x(j4, this.L1, 1000L));
            } else if (X != 4 && X != 1) {
                postDelayed(this.q1, 1000L);
            }
        }
    }

    public final void Q() {
        ImageView imageView;
        if (D() && this.G1 && (imageView = this.g1) != null) {
            if (this.M1 == 0) {
                M(false, false, imageView);
                return;
            }
            HD1 hd1 = this.E1;
            if (hd1 == null) {
                M(true, false, imageView);
                this.g1.setImageDrawable(this.s1);
                this.g1.setContentDescription(this.v1);
                return;
            }
            M(true, true, imageView);
            int w0 = hd1.w0();
            if (w0 != 0) {
                if (w0 != 1) {
                    if (w0 == 2) {
                        this.g1.setImageDrawable(this.u1);
                        this.g1.setContentDescription(this.x1);
                    }
                } else {
                    this.g1.setImageDrawable(this.t1);
                    this.g1.setContentDescription(this.w1);
                }
            } else {
                this.g1.setImageDrawable(this.s1);
                this.g1.setContentDescription(this.v1);
            }
            this.g1.setVisibility(0);
        }
    }

    public final void R() {
        ImageView imageView;
        Drawable drawable;
        String str;
        if (D() && this.G1 && (imageView = this.h1) != null) {
            HD1 hd1 = this.E1;
            if (!this.R1) {
                M(false, false, imageView);
            } else if (hd1 == null) {
                M(true, false, imageView);
                this.h1.setImageDrawable(this.z1);
                this.h1.setContentDescription(this.D1);
            } else {
                M(true, true, imageView);
                ImageView imageView2 = this.h1;
                if (hd1.n2()) {
                    drawable = this.y1;
                } else {
                    drawable = this.z1;
                }
                imageView2.setImageDrawable(drawable);
                ImageView imageView3 = this.h1;
                if (hd1.n2()) {
                    str = this.C1;
                } else {
                    str = this.D1;
                }
                imageView3.setContentDescription(str);
            }
        }
    }

    public final void S() {
        boolean z;
        int i;
        int i2;
        int i3;
        AbstractC7373jp2.d dVar;
        long j;
        int length;
        HD1 hd1 = this.E1;
        if (hd1 == null) {
            return;
        }
        boolean z2 = true;
        if (this.H1 && x(hd1.e1(), this.p1)) {
            z = true;
        } else {
            z = false;
        }
        this.I1 = z;
        long j2 = 0;
        this.X1 = 0L;
        AbstractC7373jp2 e1 = hd1.e1();
        if (!e1.x()) {
            int c22 = hd1.c2();
            boolean z3 = this.I1;
            if (z3) {
                i2 = 0;
            } else {
                i2 = c22;
            }
            if (z3) {
                i3 = e1.w() - 1;
            } else {
                i3 = c22;
            }
            i = 0;
            long j3 = 0;
            while (true) {
                if (i2 > i3) {
                    break;
                }
                if (i2 == c22) {
                    this.X1 = TD2.b2(j3);
                }
                e1.u(i2, this.p1);
                AbstractC7373jp2.d dVar2 = this.p1;
                if (dVar2.i1 == C10323vs.b) {
                    C9542sf.i(this.I1 ^ z2);
                    break;
                }
                int i4 = dVar2.j1;
                while (true) {
                    dVar = this.p1;
                    if (i4 <= dVar.k1) {
                        e1.k(i4, this.o1);
                        int u = this.o1.u();
                        int g = this.o1.g();
                        while (u < g) {
                            long j4 = this.o1.j(u);
                            if (j4 == Long.MIN_VALUE) {
                                j = j2;
                                long j5 = this.o1.Y0;
                                if (j5 != C10323vs.b) {
                                    j4 = j5;
                                } else {
                                    u++;
                                    j2 = j;
                                }
                            } else {
                                j = j2;
                            }
                            long t = j4 + this.o1.t();
                            if (t >= j) {
                                long[] jArr = this.T1;
                                if (i == jArr.length) {
                                    if (jArr.length == 0) {
                                        length = 1;
                                    } else {
                                        length = jArr.length * 2;
                                    }
                                    this.T1 = Arrays.copyOf(jArr, length);
                                    this.U1 = Arrays.copyOf(this.U1, length);
                                }
                                this.T1[i] = TD2.b2(j3 + t);
                                this.U1[i] = this.o1.v(u);
                                i++;
                            }
                            u++;
                            j2 = j;
                        }
                        i4++;
                    }
                }
                j3 += dVar.i1;
                i2++;
                j2 = j2;
                z2 = true;
            }
            j2 = j3;
        } else {
            i = 0;
        }
        long b22 = TD2.b2(j2);
        TextView textView = this.j1;
        if (textView != null) {
            textView.setText(TD2.z0(this.m1, this.n1, b22));
        }
        l lVar = this.l1;
        if (lVar != null) {
            lVar.setDuration(b22);
            int length2 = this.V1.length;
            int i5 = i + length2;
            long[] jArr2 = this.T1;
            if (i5 > jArr2.length) {
                this.T1 = Arrays.copyOf(jArr2, i5);
                this.U1 = Arrays.copyOf(this.U1, i5);
            }
            System.arraycopy(this.V1, 0, this.T1, i, length2);
            System.arraycopy(this.W1, 0, this.U1, i, length2);
            this.l1.c(this.T1, this.U1, i5);
        }
        P();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!y(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.r1);
        } else if (motionEvent.getAction() == 1) {
            B();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @InterfaceC11300zs1
    public HD1 getPlayer() {
        return this.E1;
    }

    public int getRepeatToggleModes() {
        return this.M1;
    }

    public boolean getShowShuffleButton() {
        return this.R1;
    }

    public int getShowTimeoutMs() {
        return this.K1;
    }

    public boolean getShowVrButton() {
        View view = this.i1;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G1 = true;
        long j = this.S1;
        if (j != C10323vs.b) {
            long uptimeMillis = j - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                A();
            } else {
                postDelayed(this.r1, uptimeMillis);
            }
        } else if (D()) {
            B();
        }
        L();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G1 = false;
        removeCallbacks(this.q1);
        removeCallbacks(this.r1);
    }

    public void setPlayer(@InterfaceC11300zs1 HD1 hd1) {
        boolean z;
        boolean z2 = false;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        if (hd1 == null || hd1.h1() == Looper.getMainLooper()) {
            z2 = true;
        }
        C9542sf.a(z2);
        HD1 hd12 = this.E1;
        if (hd12 == hd1) {
            return;
        }
        if (hd12 != null) {
            hd12.f1(this.Y0);
        }
        this.E1 = hd1;
        if (hd1 != null) {
            hd1.l1(this.Y0);
        }
        L();
    }

    public void setProgressUpdateListener(@InterfaceC11300zs1 d dVar) {
        this.F1 = dVar;
    }

    public void setRepeatToggleModes(int i) {
        this.M1 = i;
        HD1 hd1 = this.E1;
        if (hd1 != null) {
            int w0 = hd1.w0();
            if (i == 0 && w0 != 0) {
                this.E1.u0(0);
            } else if (i == 1 && w0 == 2) {
                this.E1.u0(1);
            } else if (i == 2 && w0 == 1) {
                this.E1.u0(2);
            }
        }
        Q();
    }

    public void setShowFastForwardButton(boolean z) {
        this.O1 = z;
        N();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.H1 = z;
        S();
    }

    public void setShowNextButton(boolean z) {
        this.Q1 = z;
        N();
    }

    public void setShowPreviousButton(boolean z) {
        this.P1 = z;
        N();
    }

    public void setShowRewindButton(boolean z) {
        this.N1 = z;
        N();
    }

    public void setShowShuffleButton(boolean z) {
        this.R1 = z;
        R();
    }

    public void setShowTimeoutMs(int i) {
        this.K1 = i;
        if (D()) {
            B();
        }
    }

    public void setShowVrButton(boolean z) {
        int i;
        View view = this.i1;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.L1 = TD2.w(i, 16, 1000);
    }

    public void setVrButtonListener(@InterfaceC11300zs1 View.OnClickListener onClickListener) {
        boolean z;
        View view = this.i1;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            boolean showVrButton = getShowVrButton();
            if (onClickListener != null) {
                z = true;
            } else {
                z = false;
            }
            M(showVrButton, z, this.i1);
        }
    }

    public void w(InterfaceC0100e interfaceC0100e) {
        C9542sf.g(interfaceC0100e);
        this.Z0.add(interfaceC0100e);
    }

    public boolean y(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        HD1 hd1 = this.E1;
        if (hd1 != null && C(keyCode)) {
            if (keyEvent.getAction() == 0) {
                if (keyCode == 90) {
                    if (hd1.X() != 4) {
                        hd1.p2();
                        return true;
                    }
                    return true;
                } else if (keyCode == 89) {
                    hd1.r2();
                    return true;
                } else if (keyEvent.getRepeatCount() == 0) {
                    if (keyCode != 79 && keyCode != 85) {
                        if (keyCode != 87) {
                            if (keyCode != 88) {
                                if (keyCode != 126) {
                                    if (keyCode == 127) {
                                        TD2.I0(hd1);
                                        return true;
                                    }
                                    return true;
                                }
                                TD2.J0(hd1);
                                return true;
                            }
                            hd1.z0();
                            return true;
                        }
                        hd1.j1();
                        return true;
                    }
                    TD2.K0(hd1);
                    return true;
                } else {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public e(Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public e(Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public e(Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i, @InterfaceC11300zs1 AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        int i2 = g.i.c;
        this.K1 = 5000;
        this.M1 = 0;
        this.L1 = 200;
        this.S1 = C10323vs.b;
        this.N1 = true;
        this.O1 = true;
        this.P1 = true;
        this.Q1 = true;
        this.R1 = false;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, g.m.k0, i, 0);
            try {
                this.K1 = obtainStyledAttributes.getInt(g.m.E0, this.K1);
                i2 = obtainStyledAttributes.getResourceId(g.m.q0, i2);
                this.M1 = z(obtainStyledAttributes, this.M1);
                this.N1 = obtainStyledAttributes.getBoolean(g.m.C0, this.N1);
                this.O1 = obtainStyledAttributes.getBoolean(g.m.z0, this.O1);
                this.P1 = obtainStyledAttributes.getBoolean(g.m.B0, this.P1);
                this.Q1 = obtainStyledAttributes.getBoolean(g.m.A0, this.Q1);
                this.R1 = obtainStyledAttributes.getBoolean(g.m.D0, this.R1);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(g.m.F0, this.L1));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.Z0 = new CopyOnWriteArrayList<>();
        this.o1 = new AbstractC7373jp2.b();
        this.p1 = new AbstractC7373jp2.d();
        StringBuilder sb = new StringBuilder();
        this.m1 = sb;
        this.n1 = new Formatter(sb, Locale.getDefault());
        this.T1 = new long[0];
        this.U1 = new boolean[0];
        this.V1 = new long[0];
        this.W1 = new boolean[0];
        c cVar = new c();
        this.Y0 = cVar;
        this.q1 = new Runnable() { // from class: o.KD1
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.exoplayer2.ui.e.this.P();
            }
        };
        this.r1 = new Runnable() { // from class: o.LD1
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.exoplayer2.ui.e.this.A();
            }
        };
        LayoutInflater.from(context).inflate(i2, this);
        setDescendantFocusability(262144);
        int i3 = g.C0102g.D0;
        l lVar = (l) findViewById(i3);
        View findViewById = findViewById(g.C0102g.E0);
        if (lVar != null) {
            this.l1 = lVar;
        } else if (findViewById != null) {
            com.google.android.exoplayer2.ui.c cVar2 = new com.google.android.exoplayer2.ui.c(context, null, 0, attributeSet2);
            cVar2.setId(i3);
            cVar2.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(cVar2, indexOfChild);
            this.l1 = cVar2;
        } else {
            this.l1 = null;
        }
        this.j1 = (TextView) findViewById(g.C0102g.i0);
        this.k1 = (TextView) findViewById(g.C0102g.B0);
        l lVar2 = this.l1;
        if (lVar2 != null) {
            lVar2.b(cVar);
        }
        View findViewById2 = findViewById(g.C0102g.y0);
        this.c1 = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(cVar);
        }
        View findViewById3 = findViewById(g.C0102g.x0);
        this.d1 = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(cVar);
        }
        View findViewById4 = findViewById(g.C0102g.C0);
        this.a1 = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(cVar);
        }
        View findViewById5 = findViewById(g.C0102g.t0);
        this.b1 = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(cVar);
        }
        View findViewById6 = findViewById(g.C0102g.G0);
        this.f1 = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(cVar);
        }
        View findViewById7 = findViewById(g.C0102g.m0);
        this.e1 = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(cVar);
        }
        ImageView imageView = (ImageView) findViewById(g.C0102g.F0);
        this.g1 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(cVar);
        }
        ImageView imageView2 = (ImageView) findViewById(g.C0102g.K0);
        this.h1 = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(cVar);
        }
        View findViewById8 = findViewById(g.C0102g.S0);
        this.i1 = findViewById8;
        setShowVrButton(false);
        M(false, false, findViewById8);
        Resources resources = context.getResources();
        this.A1 = resources.getInteger(g.h.c) / 100.0f;
        this.B1 = resources.getInteger(g.h.b) / 100.0f;
        this.s1 = TD2.j0(context, resources, g.e.i);
        this.t1 = TD2.j0(context, resources, g.e.j);
        this.u1 = TD2.j0(context, resources, g.e.h);
        this.y1 = TD2.j0(context, resources, g.e.m);
        this.z1 = TD2.j0(context, resources, g.e.l);
        this.v1 = resources.getString(g.k.p);
        this.w1 = resources.getString(g.k.q);
        this.x1 = resources.getString(g.k.f172o);
        this.C1 = resources.getString(g.k.w);
        this.D1 = resources.getString(g.k.v);
        this.Y1 = C10323vs.b;
        this.Z1 = C10323vs.b;
    }
}
