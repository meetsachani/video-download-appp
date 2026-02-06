package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ui.g;
import com.google.android.exoplayer2.ui.i;
import com.google.android.exoplayer2.ui.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import o.AR1;
import o.AbstractC5317bO0;
import o.AbstractC7373jp2;
import o.C10231vT1;
import o.C10323vs;
import o.C10833xx0;
import o.C2782Dr2;
import o.C2989Fr2;
import o.C3773Nr2;
import o.C6361fi0;
import o.C9542sf;
import o.C9593sr2;
import o.HD1;
import o.InterfaceC10322vr2;
import o.InterfaceC11300zs1;
import o.TD2;

@Deprecated
/* loaded from: classes2.dex */
public class i extends FrameLayout {
    public static final int A2 = 1;
    public static final int t2 = 5000;
    public static final int u2 = 0;
    public static final int v2 = 200;
    public static final int w2 = 100;
    public static final int x2 = 1000;
    public static final float[] y2;
    public static final int z2 = 0;
    @InterfaceC11300zs1
    public final TextView A1;
    @InterfaceC11300zs1
    public final TextView B1;
    @InterfaceC11300zs1
    public final com.google.android.exoplayer2.ui.l C1;
    public final StringBuilder D1;
    public final Formatter E1;
    public final AbstractC7373jp2.b F1;
    public final AbstractC7373jp2.d G1;
    public final Runnable H1;
    public final Drawable I1;
    public final Drawable J1;
    public final Drawable K1;
    public final String L1;
    public final String M1;
    public final String N1;
    public final Drawable O1;
    public final Drawable P1;
    public final float Q1;
    public final float R1;
    public final String S1;
    public final String T1;
    public final Drawable U1;
    public final Drawable V1;
    public final String W1;
    public final String X1;
    public final com.google.android.exoplayer2.ui.j Y0;
    public final Drawable Y1;
    public final Resources Z0;
    public final Drawable Z1;
    public final c a1;
    public final String a2;
    public final CopyOnWriteArrayList<m> b1;
    public final String b2;
    public final RecyclerView c1;
    @InterfaceC11300zs1
    public HD1 c2;
    public final h d1;
    @InterfaceC11300zs1
    public f d2;
    public final e e1;
    @InterfaceC11300zs1
    public d e2;
    public final j f1;
    public boolean f2;
    public final b g1;
    public boolean g2;
    public final InterfaceC10322vr2 h1;
    public boolean h2;
    public final PopupWindow i1;
    public boolean i2;
    public final int j1;
    public boolean j2;
    @InterfaceC11300zs1
    public final View k1;
    public int k2;
    @InterfaceC11300zs1
    public final View l1;
    public int l2;
    @InterfaceC11300zs1
    public final View m1;
    public int m2;
    @InterfaceC11300zs1
    public final View n1;
    public long[] n2;
    @InterfaceC11300zs1
    public final View o1;
    public boolean[] o2;
    @InterfaceC11300zs1
    public final TextView p1;
    public long[] p2;
    @InterfaceC11300zs1
    public final TextView q1;
    public boolean[] q2;
    @InterfaceC11300zs1
    public final ImageView r1;
    public long r2;
    @InterfaceC11300zs1
    public final ImageView s1;
    public boolean s2;
    @InterfaceC11300zs1
    public final View t1;
    @InterfaceC11300zs1
    public final ImageView u1;
    @InterfaceC11300zs1
    public final ImageView v1;
    @InterfaceC11300zs1
    public final ImageView w1;
    @InterfaceC11300zs1
    public final View x1;
    @InterfaceC11300zs1
    public final View y1;
    @InterfaceC11300zs1
    public final View z1;

    /* loaded from: classes2.dex */
    public final class b extends l {
        public b() {
            super();
        }

        public static /* synthetic */ void Q(b bVar, View view) {
            if (i.this.c2 != null && i.this.c2.T0(29)) {
                ((HD1) TD2.o(i.this.c2)).N(i.this.c2.i1().B().E(1).m0(1, false).B());
                i.this.d1.M(1, i.this.getResources().getString(g.k.I));
                i.this.i1.dismiss();
            }
        }

        @Override // com.google.android.exoplayer2.ui.i.l
        public void L(List<k> list) {
            this.d = list;
            C2989Fr2 i1 = ((HD1) C9542sf.g(i.this.c2)).i1();
            if (list.isEmpty()) {
                i.this.d1.M(1, i.this.getResources().getString(g.k.J));
            } else if (!R(i1)) {
                i.this.d1.M(1, i.this.getResources().getString(g.k.I));
            } else {
                for (int i = 0; i < list.size(); i++) {
                    k kVar = list.get(i);
                    if (kVar.a()) {
                        i.this.d1.M(1, kVar.c);
                        return;
                    }
                }
            }
        }

        @Override // com.google.android.exoplayer2.ui.i.l
        public void N(C0103i c0103i) {
            int i;
            c0103i.I.setText(g.k.I);
            boolean R = R(((HD1) C9542sf.g(i.this.c2)).i1());
            View view = c0103i.J;
            if (R) {
                i = 4;
            } else {
                i = 0;
            }
            view.setVisibility(i);
            c0103i.a.setOnClickListener(new View.OnClickListener() { // from class: o.dg2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    i.b.Q(i.b.this, view2);
                }
            });
        }

        @Override // com.google.android.exoplayer2.ui.i.l
        public void P(String str) {
            i.this.d1.M(1, str);
        }

        public final boolean R(C2989Fr2 c2989Fr2) {
            for (int i = 0; i < this.d.size(); i++) {
                if (c2989Fr2.t1.containsKey(this.d.get(i).a.c())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public final class c implements HD1.g, l.a, View.OnClickListener, PopupWindow.OnDismissListener {
        public c() {
        }

        @Override // o.HD1.g
        public void c0(HD1 hd1, HD1.f fVar) {
            if (fVar.b(4, 5, 13)) {
                i.this.v0();
            }
            if (fVar.b(4, 5, 7, 13)) {
                i.this.x0();
            }
            if (fVar.b(8, 13)) {
                i.this.y0();
            }
            if (fVar.b(9, 13)) {
                i.this.C0();
            }
            if (fVar.b(8, 9, 11, 0, 16, 17, 13)) {
                i.this.u0();
            }
            if (fVar.b(11, 0, 13)) {
                i.this.D0();
            }
            if (fVar.b(12, 13)) {
                i.this.w0();
            }
            if (fVar.b(2, 13)) {
                i.this.E0();
            }
        }

        @Override // com.google.android.exoplayer2.ui.l.a
        public void d0(com.google.android.exoplayer2.ui.l lVar, long j, boolean z) {
            i.this.j2 = false;
            if (!z && i.this.c2 != null) {
                i iVar = i.this;
                iVar.l0(iVar.c2, j);
            }
            i.this.Y0.T();
        }

        @Override // com.google.android.exoplayer2.ui.l.a
        public void h0(com.google.android.exoplayer2.ui.l lVar, long j) {
            i.this.j2 = true;
            if (i.this.B1 != null) {
                i.this.B1.setText(TD2.z0(i.this.D1, i.this.E1, j));
            }
            i.this.Y0.S();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HD1 hd1 = i.this.c2;
            if (hd1 != null) {
                i.this.Y0.T();
                if (i.this.l1 == view) {
                    if (hd1.T0(9)) {
                        hd1.j1();
                    }
                } else if (i.this.k1 == view) {
                    if (hd1.T0(7)) {
                        hd1.z0();
                    }
                } else if (i.this.n1 == view) {
                    if (hd1.X() != 4 && hd1.T0(12)) {
                        hd1.p2();
                    }
                } else if (i.this.o1 == view) {
                    if (hd1.T0(11)) {
                        hd1.r2();
                    }
                } else if (i.this.m1 == view) {
                    TD2.K0(hd1);
                } else if (i.this.r1 == view) {
                    if (hd1.T0(15)) {
                        hd1.u0(AR1.a(hd1.w0(), i.this.m2));
                    }
                } else if (i.this.s1 == view) {
                    if (hd1.T0(14)) {
                        hd1.v1(!hd1.n2());
                    }
                } else if (i.this.x1 == view) {
                    i.this.Y0.S();
                    i iVar = i.this;
                    iVar.U(iVar.d1, i.this.x1);
                } else if (i.this.y1 == view) {
                    i.this.Y0.S();
                    i iVar2 = i.this;
                    iVar2.U(iVar2.e1, i.this.y1);
                } else if (i.this.z1 == view) {
                    i.this.Y0.S();
                    i iVar3 = i.this;
                    iVar3.U(iVar3.g1, i.this.z1);
                } else if (i.this.u1 == view) {
                    i.this.Y0.S();
                    i iVar4 = i.this;
                    iVar4.U(iVar4.f1, i.this.u1);
                }
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (i.this.s2) {
                i.this.Y0.T();
            }
        }

        @Override // com.google.android.exoplayer2.ui.l.a
        public void y(com.google.android.exoplayer2.ui.l lVar, long j) {
            if (i.this.B1 != null) {
                i.this.B1.setText(TD2.z0(i.this.D1, i.this.E1, j));
            }
        }
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface d {
        void d0(boolean z);
    }

    /* loaded from: classes2.dex */
    public final class e extends RecyclerView.AbstractC0370h<C0103i> {
        public final String[] d;
        public final float[] e;
        public int f;

        public e(String[] strArr, float[] fArr) {
            this.d = strArr;
            this.e = fArr;
        }

        public static /* synthetic */ void J(e eVar, int i, View view) {
            if (i != eVar.f) {
                i.this.setPlaybackSpeed(eVar.e[i]);
            }
            i.this.i1.dismiss();
        }

        public String K() {
            return this.d[this.f];
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
        /* renamed from: L */
        public void x(C0103i c0103i, final int i) {
            String[] strArr = this.d;
            if (i < strArr.length) {
                c0103i.I.setText(strArr[i]);
            }
            if (i == this.f) {
                c0103i.a.setSelected(true);
                c0103i.J.setVisibility(0);
            } else {
                c0103i.a.setSelected(false);
                c0103i.J.setVisibility(4);
            }
            c0103i.a.setOnClickListener(new View.OnClickListener() { // from class: o.eg2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i.e.J(i.e.this, i, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
        /* renamed from: M */
        public C0103i z(ViewGroup viewGroup, int i) {
            return new C0103i(LayoutInflater.from(i.this.getContext()).inflate(g.i.k, viewGroup, false));
        }

        public void N(float f) {
            int i = 0;
            float f2 = Float.MAX_VALUE;
            int i2 = 0;
            while (true) {
                float[] fArr = this.e;
                if (i < fArr.length) {
                    float abs = Math.abs(f - fArr[i]);
                    if (abs < f2) {
                        i2 = i;
                        f2 = abs;
                    }
                    i++;
                } else {
                    this.f = i2;
                    return;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
        public int g() {
            return this.d.length;
        }
    }

    /* loaded from: classes2.dex */
    public interface f {
        void a(long j, long j2);
    }

    /* loaded from: classes2.dex */
    public final class g extends RecyclerView.H {
        public final TextView I;
        public final TextView J;
        public final ImageView K;

        public g(View view) {
            super(view);
            if (TD2.a < 26) {
                view.setFocusable(true);
            }
            this.I = (TextView) view.findViewById(g.C0102g.q0);
            this.J = (TextView) view.findViewById(g.C0102g.M0);
            this.K = (ImageView) view.findViewById(g.C0102g.p0);
            view.setOnClickListener(new View.OnClickListener() { // from class: o.fg2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    com.google.android.exoplayer2.ui.i.this.i0(i.g.this.k());
                }
            });
        }
    }

    /* loaded from: classes2.dex */
    public class h extends RecyclerView.AbstractC0370h<g> {
        public final String[] d;
        public final String[] e;
        public final Drawable[] f;

        public h(String[] strArr, Drawable[] drawableArr) {
            this.d = strArr;
            this.e = new String[strArr.length];
            this.f = drawableArr;
        }

        public boolean J() {
            if (N(1) || N(0)) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
        /* renamed from: K */
        public void x(g gVar, int i) {
            if (N(i)) {
                gVar.a.setLayoutParams(new RecyclerView.q(-1, -2));
            } else {
                gVar.a.setLayoutParams(new RecyclerView.q(0, 0));
            }
            gVar.I.setText(this.d[i]);
            if (this.e[i] == null) {
                gVar.J.setVisibility(8);
            } else {
                gVar.J.setText(this.e[i]);
            }
            if (this.f[i] == null) {
                gVar.K.setVisibility(8);
            } else {
                gVar.K.setImageDrawable(this.f[i]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
        /* renamed from: L */
        public g z(ViewGroup viewGroup, int i) {
            return new g(LayoutInflater.from(i.this.getContext()).inflate(g.i.j, viewGroup, false));
        }

        public void M(int i, String str) {
            this.e[i] = str;
        }

        public final boolean N(int i) {
            if (i.this.c2 == null) {
                return false;
            }
            if (i != 0) {
                if (i != 1) {
                    return true;
                }
                if (!i.this.c2.T0(30) || !i.this.c2.T0(29)) {
                    return false;
                }
                return true;
            }
            return i.this.c2.T0(13);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
        public int g() {
            return this.d.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
        public long h(int i) {
            return i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.i$i  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0103i extends RecyclerView.H {
        public final TextView I;
        public final View J;

        public C0103i(View view) {
            super(view);
            if (TD2.a < 26) {
                view.setFocusable(true);
            }
            this.I = (TextView) view.findViewById(g.C0102g.P0);
            this.J = view.findViewById(g.C0102g.d0);
        }
    }

    /* loaded from: classes2.dex */
    public final class j extends l {
        public j() {
            super();
        }

        public static /* synthetic */ void Q(j jVar, View view) {
            if (i.this.c2 != null && i.this.c2.T0(29)) {
                i.this.c2.N(i.this.c2.i1().B().E(3).N(-3).B());
                i.this.i1.dismiss();
            }
        }

        @Override // com.google.android.exoplayer2.ui.i.l
        public void L(List<k> list) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                } else if (list.get(i).a()) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (i.this.u1 != null) {
                ImageView imageView = i.this.u1;
                i iVar = i.this;
                imageView.setImageDrawable(z ? iVar.U1 : iVar.V1);
                i.this.u1.setContentDescription(z ? i.this.W1 : i.this.X1);
            }
            this.d = list;
        }

        @Override // com.google.android.exoplayer2.ui.i.l, androidx.recyclerview.widget.RecyclerView.AbstractC0370h
        /* renamed from: M */
        public void x(C0103i c0103i, int i) {
            int i2;
            super.x(c0103i, i);
            if (i > 0) {
                View view = c0103i.J;
                if (this.d.get(i - 1).a()) {
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                view.setVisibility(i2);
            }
        }

        @Override // com.google.android.exoplayer2.ui.i.l
        public void N(C0103i c0103i) {
            boolean z;
            c0103i.I.setText(g.k.J);
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 < this.d.size()) {
                    if (this.d.get(i2).a()) {
                        z = false;
                        break;
                    }
                    i2++;
                } else {
                    z = true;
                    break;
                }
            }
            View view = c0103i.J;
            if (!z) {
                i = 4;
            }
            view.setVisibility(i);
            c0103i.a.setOnClickListener(new View.OnClickListener() { // from class: o.gg2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    i.j.Q(i.j.this, view2);
                }
            });
        }

        @Override // com.google.android.exoplayer2.ui.i.l
        public void P(String str) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class k {
        public final C3773Nr2.a a;
        public final int b;
        public final String c;

        public k(C3773Nr2 c3773Nr2, int i, int i2, String str) {
            this.a = c3773Nr2.c().get(i);
            this.b = i2;
            this.c = str;
        }

        public boolean a() {
            return this.a.l(this.b);
        }
    }

    /* loaded from: classes2.dex */
    public abstract class l extends RecyclerView.AbstractC0370h<C0103i> {
        public List<k> d = new ArrayList();

        public l() {
        }

        public static /* synthetic */ void J(l lVar, HD1 hd1, C9593sr2 c9593sr2, k kVar, View view) {
            lVar.getClass();
            if (!hd1.T0(29)) {
                return;
            }
            hd1.N(hd1.i1().B().X(new C2782Dr2(c9593sr2, AbstractC5317bO0.M(Integer.valueOf(kVar.b)))).m0(kVar.a.g(), false).B());
            lVar.P(kVar.c);
            i.this.i1.dismiss();
        }

        public void K() {
            this.d = Collections.EMPTY_LIST;
        }

        public abstract void L(List<k> list);

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
        /* renamed from: M */
        public void x(C0103i c0103i, int i) {
            final HD1 hd1 = i.this.c2;
            if (hd1 == null) {
                return;
            }
            if (i == 0) {
                N(c0103i);
                return;
            }
            boolean z = true;
            final k kVar = this.d.get(i - 1);
            final C9593sr2 c = kVar.a.c();
            int i2 = 0;
            if (hd1.i1().t1.get(c) == null || !kVar.a()) {
                z = false;
            }
            c0103i.I.setText(kVar.c);
            View view = c0103i.J;
            if (!z) {
                i2 = 4;
            }
            view.setVisibility(i2);
            c0103i.a.setOnClickListener(new View.OnClickListener() { // from class: o.hg2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    i.l.J(i.l.this, hd1, c, kVar, view2);
                }
            });
        }

        public abstract void N(C0103i c0103i);

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
        /* renamed from: O */
        public C0103i z(ViewGroup viewGroup, int i) {
            return new C0103i(LayoutInflater.from(i.this.getContext()).inflate(g.i.k, viewGroup, false));
        }

        public abstract void P(String str);

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
        public int g() {
            if (this.d.isEmpty()) {
                return 0;
            }
            return this.d.size() + 1;
        }
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface m {
        void y(int i);
    }

    static {
        C6361fi0.a("goog.exo.ui");
        y2 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public i(Context context) {
        this(context, null);
    }

    public static boolean S(HD1 hd1, AbstractC7373jp2.d dVar) {
        AbstractC7373jp2 e1;
        int w;
        if (!hd1.T0(17) || (w = (e1 = hd1.e1()).w()) <= 1 || w > 100) {
            return false;
        }
        for (int i = 0; i < w; i++) {
            if (e1.u(i, dVar).i1 == C10323vs.b) {
                return false;
            }
        }
        return true;
    }

    public static int W(TypedArray typedArray, int i) {
        return typedArray.getInt(g.m.K1, i);
    }

    public static void a0(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    @SuppressLint({"InlinedApi"})
    public static boolean d0(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f2) {
        HD1 hd1 = this.c2;
        if (hd1 != null && hd1.T0(13)) {
            HD1 hd12 = this.c2;
            hd12.f(hd12.h().c(f2));
        }
    }

    public static void t0(@InterfaceC11300zs1 View view, boolean z) {
        if (view == null) {
            return;
        }
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public final void A0() {
        q0(this.d1.J(), this.x1);
    }

    public final void B0() {
        this.c1.measure(0, 0);
        this.i1.setWidth(Math.min(this.c1.getMeasuredWidth(), getWidth() - (this.j1 * 2)));
        this.i1.setHeight(Math.min(getHeight() - (this.j1 * 2), this.c1.getMeasuredHeight()));
    }

    public final void C0() {
        ImageView imageView;
        Drawable drawable;
        String str;
        if (e0() && this.g2 && (imageView = this.s1) != null) {
            HD1 hd1 = this.c2;
            if (!this.Y0.A(imageView)) {
                q0(false, this.s1);
            } else if (hd1 != null && hd1.T0(14)) {
                q0(true, this.s1);
                ImageView imageView2 = this.s1;
                if (hd1.n2()) {
                    drawable = this.O1;
                } else {
                    drawable = this.P1;
                }
                imageView2.setImageDrawable(drawable);
                ImageView imageView3 = this.s1;
                if (hd1.n2()) {
                    str = this.S1;
                } else {
                    str = this.T1;
                }
                imageView3.setContentDescription(str);
            } else {
                q0(false, this.s1);
                this.s1.setImageDrawable(this.P1);
                this.s1.setContentDescription(this.T1);
            }
        }
    }

    public final void D0() {
        boolean z;
        AbstractC7373jp2 abstractC7373jp2;
        int i;
        long j2;
        int i2;
        int i3;
        AbstractC7373jp2.d dVar;
        long j3;
        int length;
        HD1 hd1 = this.c2;
        if (hd1 == null) {
            return;
        }
        int i4 = 1;
        if (this.h2 && S(hd1, this.G1)) {
            z = true;
        } else {
            z = false;
        }
        this.i2 = z;
        long j4 = 0;
        this.r2 = 0L;
        if (hd1.T0(17)) {
            abstractC7373jp2 = hd1.e1();
        } else {
            abstractC7373jp2 = AbstractC7373jp2.X;
        }
        boolean x = abstractC7373jp2.x();
        long j5 = C10323vs.b;
        if (!x) {
            int c2 = hd1.c2();
            boolean z3 = this.i2;
            if (z3) {
                i2 = 0;
            } else {
                i2 = c2;
            }
            if (z3) {
                i3 = abstractC7373jp2.w() - 1;
            } else {
                i3 = c2;
            }
            i = 0;
            long j6 = 0;
            while (true) {
                if (i2 > i3) {
                    break;
                }
                if (i2 == c2) {
                    this.r2 = TD2.b2(j6);
                }
                abstractC7373jp2.u(i2, this.G1);
                AbstractC7373jp2.d dVar2 = this.G1;
                int i5 = i4;
                long j7 = j4;
                if (dVar2.i1 == j5) {
                    C9542sf.i(this.i2 ^ i5);
                    break;
                }
                int i6 = dVar2.j1;
                while (true) {
                    dVar = this.G1;
                    if (i6 <= dVar.k1) {
                        abstractC7373jp2.k(i6, this.F1);
                        int u = this.F1.u();
                        int g2 = this.F1.g();
                        while (u < g2) {
                            long j8 = this.F1.j(u);
                            if (j8 == Long.MIN_VALUE) {
                                j3 = j5;
                                long j9 = this.F1.Y0;
                                if (j9 != j3) {
                                    j8 = j9;
                                } else {
                                    u++;
                                    j5 = j3;
                                }
                            } else {
                                j3 = j5;
                            }
                            long t = j8 + this.F1.t();
                            if (t >= j7) {
                                long[] jArr = this.n2;
                                if (i == jArr.length) {
                                    if (jArr.length == 0) {
                                        length = i5;
                                    } else {
                                        length = jArr.length * 2;
                                    }
                                    this.n2 = Arrays.copyOf(jArr, length);
                                    this.o2 = Arrays.copyOf(this.o2, length);
                                }
                                this.n2[i] = TD2.b2(j6 + t);
                                this.o2[i] = this.F1.v(u);
                                i++;
                            }
                            u++;
                            j5 = j3;
                        }
                        i6++;
                    }
                }
                j6 += dVar.i1;
                i2++;
                i4 = i5;
                j4 = j7;
            }
            j2 = j6;
        } else {
            if (hd1.T0(16)) {
                long B1 = hd1.B1();
                if (B1 != C10323vs.b) {
                    j2 = TD2.j1(B1);
                    i = 0;
                }
            }
            i = 0;
            j2 = 0;
        }
        long b2 = TD2.b2(j2);
        TextView textView = this.A1;
        if (textView != null) {
            textView.setText(TD2.z0(this.D1, this.E1, b2));
        }
        com.google.android.exoplayer2.ui.l lVar = this.C1;
        if (lVar != null) {
            lVar.setDuration(b2);
            int length2 = this.p2.length;
            int i7 = i + length2;
            long[] jArr2 = this.n2;
            if (i7 > jArr2.length) {
                this.n2 = Arrays.copyOf(jArr2, i7);
                this.o2 = Arrays.copyOf(this.o2, i7);
            }
            System.arraycopy(this.p2, 0, this.n2, i, length2);
            System.arraycopy(this.q2, 0, this.o2, i, length2);
            this.C1.c(this.n2, this.o2, i7);
        }
        x0();
    }

    public final void E0() {
        boolean z;
        Z();
        if (this.f1.g() > 0) {
            z = true;
        } else {
            z = false;
        }
        q0(z, this.u1);
        A0();
    }

    @Deprecated
    public void R(m mVar) {
        C9542sf.g(mVar);
        this.b1.add(mVar);
    }

    public boolean T(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        HD1 hd1 = this.c2;
        if (hd1 != null && d0(keyCode)) {
            if (keyEvent.getAction() == 0) {
                if (keyCode == 90) {
                    if (hd1.X() != 4 && hd1.T0(12)) {
                        hd1.p2();
                        return true;
                    }
                    return true;
                } else if (keyCode == 89 && hd1.T0(11)) {
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
                            } else if (hd1.T0(7)) {
                                hd1.z0();
                                return true;
                            } else {
                                return true;
                            }
                        } else if (hd1.T0(9)) {
                            hd1.j1();
                            return true;
                        } else {
                            return true;
                        }
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

    public final void U(RecyclerView.AbstractC0370h<?> abstractC0370h, View view) {
        this.c1.setAdapter(abstractC0370h);
        B0();
        this.s2 = false;
        this.i1.dismiss();
        this.s2 = true;
        this.i1.showAsDropDown(view, (getWidth() - this.i1.getWidth()) - this.j1, (-this.i1.getHeight()) - this.j1);
    }

    public final AbstractC5317bO0<k> V(C3773Nr2 c3773Nr2, int i) {
        AbstractC5317bO0.a aVar = new AbstractC5317bO0.a();
        AbstractC5317bO0<C3773Nr2.a> c2 = c3773Nr2.c();
        for (int i2 = 0; i2 < c2.size(); i2++) {
            C3773Nr2.a aVar2 = c2.get(i2);
            if (aVar2.g() == i) {
                for (int i3 = 0; i3 < aVar2.X; i3++) {
                    if (aVar2.m(i3)) {
                        C10833xx0 d2 = aVar2.d(i3);
                        if ((d2.Y0 & 2) == 0) {
                            aVar.g(new k(c3773Nr2, i2, i3, this.h1.a(d2)));
                        }
                    }
                }
            }
        }
        return aVar.e();
    }

    public void X() {
        this.Y0.C();
    }

    public void Y() {
        this.Y0.F();
    }

    public final void Z() {
        this.f1.K();
        this.g1.K();
        HD1 hd1 = this.c2;
        if (hd1 != null && hd1.T0(30) && this.c2.T0(29)) {
            C3773Nr2 L0 = this.c2.L0();
            this.g1.L(V(L0, 1));
            if (this.Y0.A(this.u1)) {
                this.f1.L(V(L0, 3));
            } else {
                this.f1.L(AbstractC5317bO0.L());
            }
        }
    }

    public boolean b0() {
        return this.Y0.I();
    }

    public boolean c0() {
        return this.Y0.J();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!T(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public boolean e0() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void f0() {
        Iterator<m> it = this.b1.iterator();
        while (it.hasNext()) {
            it.next().y(getVisibility());
        }
    }

    public final void g0(View view) {
        if (this.e2 != null) {
            boolean z = !this.f2;
            this.f2 = z;
            s0(this.v1, z);
            s0(this.w1, this.f2);
            d dVar = this.e2;
            if (dVar != null) {
                dVar.d0(this.f2);
            }
        }
    }

    @InterfaceC11300zs1
    public HD1 getPlayer() {
        return this.c2;
    }

    public int getRepeatToggleModes() {
        return this.m2;
    }

    public boolean getShowShuffleButton() {
        return this.Y0.A(this.s1);
    }

    public boolean getShowSubtitleButton() {
        return this.Y0.A(this.u1);
    }

    public int getShowTimeoutMs() {
        return this.k2;
    }

    public boolean getShowVrButton() {
        return this.Y0.A(this.t1);
    }

    public final void h0(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        int i10 = i8 - i6;
        if ((i3 - i != i7 - i5 || i9 != i10) && this.i1.isShowing()) {
            B0();
            this.i1.update(view, (getWidth() - this.i1.getWidth()) - this.j1, (-this.i1.getHeight()) - this.j1, -1, -1);
        }
    }

    public final void i0(int i) {
        if (i == 0) {
            U(this.e1, (View) C9542sf.g(this.x1));
        } else if (i == 1) {
            U(this.g1, (View) C9542sf.g(this.x1));
        } else {
            this.i1.dismiss();
        }
    }

    @Deprecated
    public void j0(m mVar) {
        this.b1.remove(mVar);
    }

    public void k0() {
        View view = this.m1;
        if (view != null) {
            view.requestFocus();
        }
    }

    public final void l0(HD1 hd1, long j2) {
        if (this.i2) {
            if (hd1.T0(17) && hd1.T0(10)) {
                AbstractC7373jp2 e1 = hd1.e1();
                int w = e1.w();
                int i = 0;
                while (true) {
                    long g2 = e1.u(i, this.G1).g();
                    if (j2 < g2) {
                        break;
                    } else if (i == w - 1) {
                        j2 = g2;
                        break;
                    } else {
                        j2 -= g2;
                        i++;
                    }
                }
                hd1.s1(i, j2);
            }
        } else if (hd1.T0(5)) {
            hd1.Y0(j2);
        }
        x0();
    }

    public void m0(@InterfaceC11300zs1 long[] jArr, @InterfaceC11300zs1 boolean[] zArr) {
        boolean z = false;
        if (jArr == null) {
            this.p2 = new long[0];
            this.q2 = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) C9542sf.g(zArr);
            if (jArr.length == zArr2.length) {
                z = true;
            }
            C9542sf.a(z);
            this.p2 = jArr;
            this.q2 = zArr2;
        }
        D0();
    }

    public final boolean n0() {
        HD1 hd1 = this.c2;
        if (hd1 != null && hd1.T0(1)) {
            if (!this.c2.T0(17) || !this.c2.e1().x()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void o0() {
        this.Y0.Y();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Y0.L();
        this.g2 = true;
        if (c0()) {
            this.Y0.T();
        }
        p0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Y0.M();
        this.g2 = false;
        removeCallbacks(this.H1);
        this.Y0.S();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.Y0.N(z, i, i2, i3, i4);
    }

    public void p0() {
        v0();
        u0();
        y0();
        C0();
        E0();
        w0();
        D0();
    }

    public final void q0(boolean z, @InterfaceC11300zs1 View view) {
        float f2;
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        if (z) {
            f2 = this.Q1;
        } else {
            f2 = this.R1;
        }
        view.setAlpha(f2);
    }

    public final void r0() {
        long j2;
        HD1 hd1 = this.c2;
        if (hd1 != null) {
            j2 = hd1.N1();
        } else {
            j2 = 15000;
        }
        int i = (int) (j2 / 1000);
        TextView textView = this.p1;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
        View view = this.n1;
        if (view != null) {
            view.setContentDescription(this.Z0.getQuantityString(g.j.a, i, Integer.valueOf(i)));
        }
    }

    public final void s0(@InterfaceC11300zs1 ImageView imageView, boolean z) {
        if (imageView == null) {
            return;
        }
        if (z) {
            imageView.setImageDrawable(this.Y1);
            imageView.setContentDescription(this.a2);
            return;
        }
        imageView.setImageDrawable(this.Z1);
        imageView.setContentDescription(this.b2);
    }

    public void setAnimationEnabled(boolean z) {
        this.Y0.U(z);
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(@InterfaceC11300zs1 d dVar) {
        boolean z;
        this.e2 = dVar;
        ImageView imageView = this.v1;
        boolean z3 = false;
        if (dVar != null) {
            z = true;
        } else {
            z = false;
        }
        t0(imageView, z);
        ImageView imageView2 = this.w1;
        if (dVar != null) {
            z3 = true;
        }
        t0(imageView2, z3);
    }

    public void setPlayer(@InterfaceC11300zs1 HD1 hd1) {
        boolean z;
        boolean z3 = false;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        if (hd1 == null || hd1.h1() == Looper.getMainLooper()) {
            z3 = true;
        }
        C9542sf.a(z3);
        HD1 hd12 = this.c2;
        if (hd12 == hd1) {
            return;
        }
        if (hd12 != null) {
            hd12.f1(this.a1);
        }
        this.c2 = hd1;
        if (hd1 != null) {
            hd1.l1(this.a1);
        }
        p0();
    }

    public void setProgressUpdateListener(@InterfaceC11300zs1 f fVar) {
        this.d2 = fVar;
    }

    public void setRepeatToggleModes(int i) {
        this.m2 = i;
        HD1 hd1 = this.c2;
        boolean z = false;
        if (hd1 != null && hd1.T0(15)) {
            int w0 = this.c2.w0();
            if (i == 0 && w0 != 0) {
                this.c2.u0(0);
            } else if (i == 1 && w0 == 2) {
                this.c2.u0(1);
            } else if (i == 2 && w0 == 1) {
                this.c2.u0(2);
            }
        }
        com.google.android.exoplayer2.ui.j jVar = this.Y0;
        ImageView imageView = this.r1;
        if (i != 0) {
            z = true;
        }
        jVar.V(imageView, z);
        y0();
    }

    public void setShowFastForwardButton(boolean z) {
        this.Y0.V(this.n1, z);
        u0();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.h2 = z;
        D0();
    }

    public void setShowNextButton(boolean z) {
        this.Y0.V(this.l1, z);
        u0();
    }

    public void setShowPreviousButton(boolean z) {
        this.Y0.V(this.k1, z);
        u0();
    }

    public void setShowRewindButton(boolean z) {
        this.Y0.V(this.o1, z);
        u0();
    }

    public void setShowShuffleButton(boolean z) {
        this.Y0.V(this.s1, z);
        C0();
    }

    public void setShowSubtitleButton(boolean z) {
        this.Y0.V(this.u1, z);
    }

    public void setShowTimeoutMs(int i) {
        this.k2 = i;
        if (c0()) {
            this.Y0.T();
        }
    }

    public void setShowVrButton(boolean z) {
        this.Y0.V(this.t1, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.l2 = TD2.w(i, 16, 1000);
    }

    public void setVrButtonListener(@InterfaceC11300zs1 View.OnClickListener onClickListener) {
        boolean z;
        View view = this.t1;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            if (onClickListener != null) {
                z = true;
            } else {
                z = false;
            }
            q0(z, this.t1);
        }
    }

    public final void u0() {
        boolean z;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (e0() && this.g2) {
            HD1 hd1 = this.c2;
            if (hd1 != null) {
                if (this.h2 && S(hd1, this.G1)) {
                    z = hd1.T0(10);
                } else {
                    z = hd1.T0(5);
                }
                z4 = hd1.T0(7);
                z5 = hd1.T0(11);
                z6 = hd1.T0(12);
                z3 = hd1.T0(9);
            } else {
                z = false;
                z3 = false;
                z4 = false;
                z5 = false;
                z6 = false;
            }
            if (z5) {
                z0();
            }
            if (z6) {
                r0();
            }
            q0(z4, this.k1);
            q0(z5, this.o1);
            q0(z6, this.n1);
            q0(z3, this.l1);
            com.google.android.exoplayer2.ui.l lVar = this.C1;
            if (lVar != null) {
                lVar.setEnabled(z);
            }
        }
    }

    public final void v0() {
        int i;
        int i2;
        if (e0() && this.g2 && this.m1 != null) {
            boolean G1 = TD2.G1(this.c2);
            if (G1) {
                i = g.e.o0;
            } else {
                i = g.e.n0;
            }
            if (G1) {
                i2 = g.k.l;
            } else {
                i2 = g.k.k;
            }
            ((ImageView) this.m1).setImageDrawable(TD2.j0(getContext(), this.Z0, i));
            this.m1.setContentDescription(this.Z0.getString(i2));
            q0(n0(), this.m1);
        }
    }

    public final void w0() {
        HD1 hd1 = this.c2;
        if (hd1 == null) {
            return;
        }
        this.e1.N(hd1.h().X);
        this.d1.M(0, this.e1.K());
        A0();
    }

    public final void x0() {
        long j2;
        long j3;
        int X;
        long j4;
        if (e0() && this.g2) {
            HD1 hd1 = this.c2;
            if (hd1 != null && hd1.T0(16)) {
                j2 = this.r2 + hd1.P1();
                j3 = this.r2 + hd1.o2();
            } else {
                j2 = 0;
                j3 = 0;
            }
            TextView textView = this.B1;
            if (textView != null && !this.j2) {
                textView.setText(TD2.z0(this.D1, this.E1, j2));
            }
            com.google.android.exoplayer2.ui.l lVar = this.C1;
            if (lVar != null) {
                lVar.setPosition(j2);
                this.C1.setBufferedPosition(j3);
            }
            f fVar = this.d2;
            if (fVar != null) {
                fVar.a(j2, j3);
            }
            removeCallbacks(this.H1);
            if (hd1 == null) {
                X = 1;
            } else {
                X = hd1.X();
            }
            long j5 = 1000;
            if (hd1 != null && hd1.isPlaying()) {
                com.google.android.exoplayer2.ui.l lVar2 = this.C1;
                if (lVar2 != null) {
                    j4 = lVar2.getPreferredUpdateDelay();
                } else {
                    j4 = 1000;
                }
                long min = Math.min(j4, 1000 - (j2 % 1000));
                float f2 = hd1.h().X;
                if (f2 > 0.0f) {
                    j5 = ((float) min) / f2;
                }
                postDelayed(this.H1, TD2.x(j5, this.l2, 1000L));
            } else if (X != 4 && X != 1) {
                postDelayed(this.H1, 1000L);
            }
        }
    }

    public final void y0() {
        ImageView imageView;
        if (e0() && this.g2 && (imageView = this.r1) != null) {
            if (this.m2 == 0) {
                q0(false, imageView);
                return;
            }
            HD1 hd1 = this.c2;
            if (hd1 != null && hd1.T0(15)) {
                q0(true, this.r1);
                int w0 = hd1.w0();
                if (w0 != 0) {
                    if (w0 != 1) {
                        if (w0 == 2) {
                            this.r1.setImageDrawable(this.K1);
                            this.r1.setContentDescription(this.N1);
                            return;
                        }
                        return;
                    }
                    this.r1.setImageDrawable(this.J1);
                    this.r1.setContentDescription(this.M1);
                    return;
                }
                this.r1.setImageDrawable(this.I1);
                this.r1.setContentDescription(this.L1);
                return;
            }
            q0(false, this.r1);
            this.r1.setImageDrawable(this.I1);
            this.r1.setContentDescription(this.L1);
        }
    }

    public final void z0() {
        long j2;
        HD1 hd1 = this.c2;
        if (hd1 != null) {
            j2 = hd1.u2();
        } else {
            j2 = 5000;
        }
        int i = (int) (j2 / 1000);
        TextView textView = this.q1;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
        View view = this.o1;
        if (view != null) {
            view.setContentDescription(this.Z0.getQuantityString(g.j.b, i, Integer.valueOf(i)));
        }
    }

    public i(Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public i(Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.google.android.exoplayer2.ui.i$a, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public i(Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i, @InterfaceC11300zs1 AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        boolean z;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        ?? r9;
        Context context2;
        boolean z12;
        int i2 = g.i.g;
        this.k2 = 5000;
        this.m2 = 0;
        this.l2 = 200;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, g.m.A1, i, 0);
            try {
                i2 = obtainStyledAttributes.getResourceId(g.m.H1, i2);
                this.k2 = obtainStyledAttributes.getInt(g.m.W1, this.k2);
                this.m2 = W(obtainStyledAttributes, this.m2);
                boolean z13 = obtainStyledAttributes.getBoolean(g.m.T1, true);
                boolean z14 = obtainStyledAttributes.getBoolean(g.m.Q1, true);
                boolean z15 = obtainStyledAttributes.getBoolean(g.m.S1, true);
                boolean z16 = obtainStyledAttributes.getBoolean(g.m.R1, true);
                boolean z17 = obtainStyledAttributes.getBoolean(g.m.U1, false);
                boolean z18 = obtainStyledAttributes.getBoolean(g.m.V1, false);
                boolean z19 = obtainStyledAttributes.getBoolean(g.m.X1, false);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(g.m.Y1, this.l2));
                boolean z20 = obtainStyledAttributes.getBoolean(g.m.D1, true);
                obtainStyledAttributes.recycle();
                z3 = z17;
                z4 = z18;
                z = z19;
                z6 = z13;
                z7 = z14;
                z8 = z15;
                z5 = z20;
                z9 = z16;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z = false;
            z3 = false;
            z4 = false;
            z5 = true;
            z6 = true;
            z7 = true;
            z8 = true;
            z9 = true;
        }
        LayoutInflater.from(context).inflate(i2, this);
        setDescendantFocusability(262144);
        c cVar = new c();
        this.a1 = cVar;
        this.b1 = new CopyOnWriteArrayList<>();
        this.F1 = new AbstractC7373jp2.b();
        this.G1 = new AbstractC7373jp2.d();
        StringBuilder sb = new StringBuilder();
        this.D1 = sb;
        this.E1 = new Formatter(sb, Locale.getDefault());
        this.n2 = new long[0];
        this.o2 = new boolean[0];
        this.p2 = new long[0];
        this.q2 = new boolean[0];
        this.H1 = new Runnable() { // from class: o.ag2
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.exoplayer2.ui.i.this.x0();
            }
        };
        this.A1 = (TextView) findViewById(g.C0102g.i0);
        this.B1 = (TextView) findViewById(g.C0102g.B0);
        ImageView imageView = (ImageView) findViewById(g.C0102g.N0);
        this.u1 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(cVar);
        }
        ImageView imageView2 = (ImageView) findViewById(g.C0102g.o0);
        this.v1 = imageView2;
        a0(imageView2, new View.OnClickListener() { // from class: o.bg2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.google.android.exoplayer2.ui.i.this.g0(view);
            }
        });
        ImageView imageView3 = (ImageView) findViewById(g.C0102g.s0);
        this.w1 = imageView3;
        a0(imageView3, new View.OnClickListener() { // from class: o.bg2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.google.android.exoplayer2.ui.i.this.g0(view);
            }
        });
        View findViewById = findViewById(g.C0102g.I0);
        this.x1 = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(cVar);
        }
        View findViewById2 = findViewById(g.C0102g.A0);
        this.y1 = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(cVar);
        }
        View findViewById3 = findViewById(g.C0102g.Y);
        this.z1 = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(cVar);
        }
        int i3 = g.C0102g.D0;
        com.google.android.exoplayer2.ui.l lVar = (com.google.android.exoplayer2.ui.l) findViewById(i3);
        View findViewById4 = findViewById(g.C0102g.E0);
        if (lVar != null) {
            this.C1 = lVar;
            z10 = z;
            z11 = z5;
            r9 = 0;
            context2 = context;
        } else if (findViewById4 != null) {
            z11 = z5;
            z10 = z;
            r9 = 0;
            context2 = context;
            com.google.android.exoplayer2.ui.c cVar2 = new com.google.android.exoplayer2.ui.c(context2, null, 0, attributeSet2, g.l.B);
            cVar2.setId(i3);
            cVar2.setLayoutParams(findViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById4.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById4);
            viewGroup.removeView(findViewById4);
            viewGroup.addView(cVar2, indexOfChild);
            this.C1 = cVar2;
        } else {
            z10 = z;
            z11 = z5;
            r9 = 0;
            context2 = context;
            this.C1 = null;
        }
        com.google.android.exoplayer2.ui.l lVar2 = this.C1;
        if (lVar2 != null) {
            lVar2.b(cVar);
        }
        View findViewById5 = findViewById(g.C0102g.z0);
        this.m1 = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(cVar);
        }
        View findViewById6 = findViewById(g.C0102g.C0);
        this.k1 = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(cVar);
        }
        View findViewById7 = findViewById(g.C0102g.t0);
        this.l1 = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(cVar);
        }
        Typeface j2 = C10231vT1.j(context2, g.f.a);
        View findViewById8 = findViewById(g.C0102g.G0);
        TextView textView = findViewById8 == null ? (TextView) findViewById(g.C0102g.H0) : r9;
        this.q1 = textView;
        if (textView != null) {
            textView.setTypeface(j2);
        }
        findViewById8 = findViewById8 == null ? textView : findViewById8;
        this.o1 = findViewById8;
        if (findViewById8 != null) {
            findViewById8.setOnClickListener(cVar);
        }
        View findViewById9 = findViewById(g.C0102g.m0);
        TextView textView2 = findViewById9 == null ? (TextView) findViewById(g.C0102g.n0) : r9;
        this.p1 = textView2;
        if (textView2 != null) {
            textView2.setTypeface(j2);
        }
        findViewById9 = findViewById9 == null ? textView2 : findViewById9;
        this.n1 = findViewById9;
        if (findViewById9 != null) {
            findViewById9.setOnClickListener(cVar);
        }
        ImageView imageView4 = (ImageView) findViewById(g.C0102g.F0);
        this.r1 = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(cVar);
        }
        ImageView imageView5 = (ImageView) findViewById(g.C0102g.K0);
        this.s1 = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(cVar);
        }
        Resources resources = context2.getResources();
        this.Z0 = resources;
        this.Q1 = resources.getInteger(g.h.c) / 100.0f;
        this.R1 = resources.getInteger(g.h.b) / 100.0f;
        View findViewById10 = findViewById(g.C0102g.S0);
        this.t1 = findViewById10;
        if (findViewById10 != null) {
            q0(false, findViewById10);
        }
        com.google.android.exoplayer2.ui.j jVar = new com.google.android.exoplayer2.ui.j(this);
        this.Y0 = jVar;
        jVar.U(z11);
        h hVar = new h(new String[]{resources.getString(g.k.m), resources.getString(g.k.K)}, new Drawable[]{TD2.j0(context2, resources, g.e.x0), TD2.j0(context2, resources, g.e.f0)});
        this.d1 = hVar;
        this.j1 = resources.getDimensionPixelSize(g.d.x);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context2).inflate(g.i.i, (ViewGroup) r9);
        this.c1 = recyclerView;
        recyclerView.setAdapter(hVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.i1 = popupWindow;
        if (TD2.a < 23) {
            z12 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z12 = false;
        }
        popupWindow.setOnDismissListener(cVar);
        this.s2 = true;
        this.h1 = new com.google.android.exoplayer2.ui.d(getResources());
        this.U1 = TD2.j0(context2, resources, g.e.z0);
        this.V1 = TD2.j0(context2, resources, g.e.y0);
        this.W1 = resources.getString(g.k.b);
        this.X1 = resources.getString(g.k.a);
        this.f1 = new j();
        this.g1 = new b();
        this.e1 = new e(resources.getStringArray(g.a.a), y2);
        this.Y1 = TD2.j0(context2, resources, g.e.j0);
        this.Z1 = TD2.j0(context2, resources, g.e.i0);
        this.I1 = TD2.j0(context2, resources, g.e.r0);
        this.J1 = TD2.j0(context2, resources, g.e.s0);
        this.K1 = TD2.j0(context2, resources, g.e.q0);
        this.O1 = TD2.j0(context2, resources, g.e.w0);
        this.P1 = TD2.j0(context2, resources, g.e.v0);
        this.a2 = resources.getString(g.k.f);
        this.b2 = resources.getString(g.k.e);
        this.L1 = resources.getString(g.k.p);
        this.M1 = resources.getString(g.k.q);
        this.N1 = resources.getString(g.k.f172o);
        this.S1 = this.Z0.getString(g.k.w);
        this.T1 = this.Z0.getString(g.k.v);
        this.Y0.V((ViewGroup) findViewById(g.C0102g.a0), true);
        this.Y0.V(this.n1, z7);
        this.Y0.V(this.o1, z6);
        this.Y0.V(this.k1, z8);
        this.Y0.V(this.l1, z9);
        this.Y0.V(this.s1, z3);
        this.Y0.V(this.u1, z4);
        this.Y0.V(this.t1, z10);
        this.Y0.V(this.r1, this.m2 != 0 ? true : z12);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.cg2
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                com.google.android.exoplayer2.ui.i.this.h0(view, i4, i5, i6, i7, i8, i9, i10, i11);
            }
        });
    }
}
