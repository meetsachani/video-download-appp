package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import o.AbstractC10236vV;
import o.AbstractC6912hv1;
import o.C10152v92;
import o.C10482wV;
import o.C10816xt;
import o.C10861y4;
import o.C11143zD2;
import o.C3548Lk1;
import o.C4377Tx1;
import o.C6516gH2;
import o.C7025iN1;
import o.HT1;
import o.InterfaceC11300zs1;
import o.InterfaceC4698Xf2;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceC9015qV;
import o.PK1;
import o.Q3;
import o.VC1;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public final class f<S> extends VC1<S> {
    public static final String A2 = "DAY_VIEW_DECORATOR_KEY";
    public static final String B2 = "CURRENT_MONTH_KEY";
    public static final int C2 = 3;
    @InterfaceC5056aJ2
    public static final Object D2 = "MONTHS_VIEW_GROUP_TAG";
    @InterfaceC5056aJ2
    public static final Object E2 = "NAVIGATION_PREV_TAG";
    @InterfaceC5056aJ2
    public static final Object F2 = "NAVIGATION_NEXT_TAG";
    @InterfaceC5056aJ2
    public static final Object G2 = "SELECTOR_TOGGLE_TAG";
    public static final String x2 = "THEME_RES_ID_KEY";
    public static final String y2 = "GRID_SELECTOR_KEY";
    public static final String z2 = "CALENDAR_CONSTRAINTS_KEY";
    @InterfaceC4698Xf2
    public int i2;
    @InterfaceC11300zs1
    public InterfaceC9015qV<S> j2;
    @InterfaceC11300zs1
    public com.google.android.material.datepicker.a k2;
    @InterfaceC11300zs1
    public AbstractC10236vV l2;
    @InterfaceC11300zs1
    public C3548Lk1 m2;
    public l n2;
    public C10816xt o2;
    public RecyclerView p2;
    public RecyclerView q2;
    public View r2;
    public View s2;
    public View t2;
    public View u2;
    public MaterialButton v2;
    public AccessibilityManager w2;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ com.google.android.material.datepicker.i X;

        public a(com.google.android.material.datepicker.i iVar) {
            this.X = iVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f.this.f3(this.X.K(f.this.a3().E2() - 1));
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public final /* synthetic */ int X;

        public b(int i) {
            this.X = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.q2.V1(this.X);
        }
    }

    /* loaded from: classes3.dex */
    public class c extends Q3 {
        public c() {
        }

        @Override // o.Q3
        public void g(View view, @InterfaceC5670cr1 C10861y4 c10861y4) {
            super.g(view, c10861y4);
            c10861y4.m1(null);
        }
    }

    /* loaded from: classes3.dex */
    public class d extends C10152v92 {
        public final /* synthetic */ int P;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.P = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void o2(@InterfaceC5670cr1 RecyclerView.D d, @InterfaceC5670cr1 int[] iArr) {
            if (this.P == 0) {
                iArr[0] = f.this.q2.getWidth();
                iArr[1] = f.this.q2.getWidth();
                return;
            }
            iArr[0] = f.this.q2.getHeight();
            iArr[1] = f.this.q2.getHeight();
        }
    }

    /* loaded from: classes3.dex */
    public class e implements m {
        public e() {
        }

        @Override // com.google.android.material.datepicker.f.m
        public void a(long j) {
            if (f.this.k2.g().M(j)) {
                f.this.j2.C0(j);
                Iterator<AbstractC6912hv1<S>> it = f.this.h2.iterator();
                while (it.hasNext()) {
                    it.next().b((S) f.this.j2.u0());
                }
                f.this.q2.getAdapter().m();
                if (f.this.p2 != null) {
                    f.this.p2.getAdapter().m();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$f  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0126f extends Q3 {
        public C0126f() {
        }

        @Override // o.Q3
        public void g(View view, @InterfaceC5670cr1 C10861y4 c10861y4) {
            super.g(view, c10861y4);
            c10861y4.Z1(false);
        }
    }

    /* loaded from: classes3.dex */
    public class g extends RecyclerView.o {
        public final Calendar a = C11143zD2.x();
        public final Calendar b = C11143zD2.x();

        public g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void i(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 RecyclerView recyclerView, @InterfaceC5670cr1 RecyclerView.D d) {
            int i;
            int width;
            if ((recyclerView.getAdapter() instanceof com.google.android.material.datepicker.j) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                com.google.android.material.datepicker.j jVar = (com.google.android.material.datepicker.j) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (C4377Tx1<Long, Long> c4377Tx1 : f.this.j2.V()) {
                    Long l = c4377Tx1.a;
                    if (l != null && c4377Tx1.b != null) {
                        this.a.setTimeInMillis(l.longValue());
                        this.b.setTimeInMillis(c4377Tx1.b.longValue());
                        int L = jVar.L(this.a.get(1));
                        int L2 = jVar.L(this.b.get(1));
                        View O = gridLayoutManager.O(L);
                        View O2 = gridLayoutManager.O(L2);
                        int H3 = L / gridLayoutManager.H3();
                        int H32 = L2 / gridLayoutManager.H3();
                        for (int i2 = H3; i2 <= H32; i2++) {
                            View O3 = gridLayoutManager.O(gridLayoutManager.H3() * i2);
                            if (O3 != null) {
                                int top = O3.getTop() + f.this.o2.d.e();
                                int bottom = O3.getBottom() - f.this.o2.d.b();
                                if (i2 == H3 && O != null) {
                                    i = O.getLeft() + (O.getWidth() / 2);
                                } else {
                                    i = 0;
                                }
                                if (i2 == H32 && O2 != null) {
                                    width = O2.getLeft() + (O2.getWidth() / 2);
                                } else {
                                    width = recyclerView.getWidth();
                                }
                                canvas.drawRect(i, top, width, bottom, f.this.o2.h);
                            }
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class h extends Q3 {
        public h() {
        }

        @Override // o.Q3
        public void g(View view, @InterfaceC5670cr1 C10861y4 c10861y4) {
            String f0;
            super.g(view, c10861y4);
            if (f.this.u2.getVisibility() == 0) {
                f0 = f.this.f0(C7025iN1.m.mtrl_picker_toggle_to_year_selection);
            } else {
                f0 = f.this.f0(C7025iN1.m.mtrl_picker_toggle_to_day_selection);
            }
            c10861y4.b(new C10861y4.a(16, f0));
        }
    }

    /* loaded from: classes3.dex */
    public class i extends RecyclerView.u {
        public final /* synthetic */ com.google.android.material.datepicker.i a;

        public i(com.google.android.material.datepicker.i iVar) {
            this.a = iVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(@InterfaceC5670cr1 RecyclerView recyclerView, int i, int i2) {
            int E2;
            if (i < 0) {
                E2 = f.this.a3().B2();
            } else {
                E2 = f.this.a3().E2();
            }
            C3548Lk1 K = this.a.K(E2);
            f.this.m2 = K;
            f.this.v2.setText(this.a.L(E2));
            f.this.j3(this.a.M(K));
        }
    }

    /* loaded from: classes3.dex */
    public class j implements View.OnClickListener {
        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f.this.i3();
        }
    }

    /* loaded from: classes3.dex */
    public class k implements View.OnClickListener {
        public final /* synthetic */ com.google.android.material.datepicker.i X;

        public k(com.google.android.material.datepicker.i iVar) {
            this.X = iVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f.this.f3(this.X.K(f.this.a3().B2() + 1));
        }
    }

    /* loaded from: classes3.dex */
    public enum l {
        DAY,
        YEAR
    }

    /* loaded from: classes3.dex */
    public interface m {
        void a(long j);
    }

    @PK1
    public static int Y2(@InterfaceC5670cr1 Context context) {
        return context.getResources().getDimensionPixelSize(C7025iN1.f.mtrl_calendar_day_height);
    }

    public static int Z2(@InterfaceC5670cr1 Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C7025iN1.f.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(C7025iN1.f.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(C7025iN1.f.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C7025iN1.f.mtrl_calendar_days_of_week_height);
        int i2 = com.google.android.material.datepicker.h.b1;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(C7025iN1.f.mtrl_calendar_day_height) * i2) + ((i2 - 1) * resources.getDimensionPixelOffset(C7025iN1.f.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(C7025iN1.f.mtrl_calendar_bottom_padding);
    }

    @InterfaceC5670cr1
    public static <T> f<T> b3(@InterfaceC5670cr1 InterfaceC9015qV<T> interfaceC9015qV, @InterfaceC4698Xf2 int i2, @InterfaceC5670cr1 com.google.android.material.datepicker.a aVar) {
        return c3(interfaceC9015qV, i2, aVar, null);
    }

    @InterfaceC5670cr1
    public static <T> f<T> c3(@InterfaceC5670cr1 InterfaceC9015qV<T> interfaceC9015qV, @InterfaceC4698Xf2 int i2, @InterfaceC5670cr1 com.google.android.material.datepicker.a aVar, @InterfaceC11300zs1 AbstractC10236vV abstractC10236vV) {
        f<T> fVar = new f<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable(y2, interfaceC9015qV);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", abstractC10236vV);
        bundle.putParcelable(B2, aVar.o());
        fVar.f2(bundle);
        return fVar;
    }

    @Override // o.VC1
    public boolean G2(@InterfaceC5670cr1 AbstractC6912hv1<S> abstractC6912hv1) {
        return super.G2(abstractC6912hv1);
    }

    @Override // o.VC1
    @InterfaceC11300zs1
    public InterfaceC9015qV<S> I2() {
        return this.j2;
    }

    @Override // androidx.fragment.app.Fragment
    public void N0(@InterfaceC11300zs1 Bundle bundle) {
        super.N0(bundle);
        if (bundle == null) {
            bundle = s();
        }
        this.i2 = bundle.getInt("THEME_RES_ID_KEY");
        this.j2 = (InterfaceC9015qV) bundle.getParcelable(y2);
        this.k2 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.l2 = (AbstractC10236vV) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.m2 = (C3548Lk1) bundle.getParcelable(B2);
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC5670cr1
    public View R0(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, @InterfaceC11300zs1 Bundle bundle) {
        int i2;
        int i3;
        C10482wV c10482wV;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(v(), this.i2);
        this.o2 = new C10816xt(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.w2 = (AccessibilityManager) U1().getSystemService("accessibility");
        C3548Lk1 s = this.k2.s();
        if (com.google.android.material.datepicker.g.A3(contextThemeWrapper)) {
            i2 = C7025iN1.k.mtrl_calendar_vertical;
            i3 = 1;
        } else {
            i2 = C7025iN1.k.mtrl_calendar_horizontal;
            i3 = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        inflate.setMinimumHeight(Z2(U1()));
        GridView gridView = (GridView) inflate.findViewById(C7025iN1.h.mtrl_calendar_days_of_week);
        C6516gH2.I1(gridView, new c());
        int m2 = this.k2.m();
        if (m2 > 0) {
            c10482wV = new C10482wV(m2);
        } else {
            c10482wV = new C10482wV();
        }
        gridView.setAdapter((ListAdapter) c10482wV);
        gridView.setNumColumns(s.Y0);
        gridView.setEnabled(false);
        this.q2 = (RecyclerView) inflate.findViewById(C7025iN1.h.mtrl_calendar_months);
        this.q2.setLayoutManager(new d(v(), i3, false, i3));
        this.q2.setTag(D2);
        com.google.android.material.datepicker.i iVar = new com.google.android.material.datepicker.i(contextThemeWrapper, this.j2, this.k2, this.l2, new e());
        this.q2.setAdapter(iVar);
        int integer = contextThemeWrapper.getResources().getInteger(C7025iN1.i.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C7025iN1.h.mtrl_calendar_year_selector_frame);
        this.p2 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.p2.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.p2.setAdapter(new com.google.android.material.datepicker.j(this));
            this.p2.n(U2());
        }
        if (inflate.findViewById(C7025iN1.h.month_navigation_fragment_toggle) != null) {
            T2(inflate, iVar);
        }
        if (!com.google.android.material.datepicker.g.A3(contextThemeWrapper)) {
            new u().b(this.q2);
        }
        this.q2.M1(iVar.M(this.m2));
        h3();
        return inflate;
    }

    public final void T2(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 com.google.android.material.datepicker.i iVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(C7025iN1.h.month_navigation_fragment_toggle);
        this.v2 = materialButton;
        materialButton.setTag(G2);
        C6516gH2.I1(this.v2, new h());
        View findViewById = view.findViewById(C7025iN1.h.month_navigation_previous);
        this.r2 = findViewById;
        findViewById.setTag(E2);
        View findViewById2 = view.findViewById(C7025iN1.h.month_navigation_next);
        this.s2 = findViewById2;
        findViewById2.setTag(F2);
        this.t2 = view.findViewById(C7025iN1.h.mtrl_calendar_year_selector_frame);
        this.u2 = view.findViewById(C7025iN1.h.mtrl_calendar_day_selector_frame);
        g3(l.DAY);
        this.v2.setText(this.m2.s());
        this.q2.r(new i(iVar));
        this.v2.setOnClickListener(new j());
        this.s2.setOnClickListener(new k(iVar));
        this.r2.setOnClickListener(new a(iVar));
        j3(iVar.M(this.m2));
    }

    @InterfaceC5670cr1
    public final RecyclerView.o U2() {
        return new g();
    }

    @InterfaceC11300zs1
    public com.google.android.material.datepicker.a V2() {
        return this.k2;
    }

    public C10816xt W2() {
        return this.o2;
    }

    @InterfaceC11300zs1
    public C3548Lk1 X2() {
        return this.m2;
    }

    @InterfaceC5670cr1
    public LinearLayoutManager a3() {
        return (LinearLayoutManager) this.q2.getLayoutManager();
    }

    public final void d3(int i2) {
        this.q2.post(new b(i2));
    }

    public void e3() {
        MaterialButton materialButton = this.v2;
        if (materialButton != null) {
            materialButton.sendAccessibilityEvent(8);
        }
    }

    public void f3(C3548Lk1 c3548Lk1) {
        boolean z;
        com.google.android.material.datepicker.i iVar = (com.google.android.material.datepicker.i) this.q2.getAdapter();
        int M = iVar.M(c3548Lk1);
        AccessibilityManager accessibilityManager = this.w2;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            this.m2 = c3548Lk1;
            this.q2.M1(M);
        } else {
            int M2 = M - iVar.M(this.m2);
            boolean z3 = false;
            if (Math.abs(M2) > 3) {
                z = true;
            } else {
                z = false;
            }
            if (M2 > 0) {
                z3 = true;
            }
            this.m2 = c3548Lk1;
            if (z && z3) {
                this.q2.M1(M - 3);
                d3(M);
            } else if (z) {
                this.q2.M1(M + 3);
                d3(M);
            } else {
                d3(M);
            }
        }
        j3(M);
    }

    public void g3(l lVar) {
        this.n2 = lVar;
        if (lVar == l.YEAR) {
            this.p2.getLayoutManager().V1(((com.google.android.material.datepicker.j) this.p2.getAdapter()).L(this.m2.Z));
            this.t2.setVisibility(0);
            this.u2.setVisibility(8);
            this.r2.setVisibility(8);
            this.s2.setVisibility(8);
        } else if (lVar == l.DAY) {
            this.t2.setVisibility(8);
            this.u2.setVisibility(0);
            this.r2.setVisibility(0);
            this.s2.setVisibility(0);
            f3(this.m2);
        }
    }

    public final void h3() {
        C6516gH2.I1(this.q2, new C0126f());
    }

    public void i3() {
        l lVar = this.n2;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            g3(l.DAY);
            this.q2.announceForAccessibility(f0(C7025iN1.m.mtrl_picker_toggled_to_day_selection));
        } else if (lVar == l.DAY) {
            g3(lVar2);
            this.p2.announceForAccessibility(f0(C7025iN1.m.mtrl_picker_toggled_to_year_selection));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void j1(@InterfaceC5670cr1 Bundle bundle) {
        super.j1(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.i2);
        bundle.putParcelable(y2, this.j2);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.k2);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.l2);
        bundle.putParcelable(B2, this.m2);
    }

    public final void j3(int i2) {
        boolean z;
        View view = this.s2;
        boolean z3 = false;
        if (i2 + 1 < this.q2.getAdapter().g()) {
            z = true;
        } else {
            z = false;
        }
        view.setEnabled(z);
        View view2 = this.r2;
        if (i2 - 1 >= 0) {
            z3 = true;
        }
        view2.setEnabled(z3);
    }
}
