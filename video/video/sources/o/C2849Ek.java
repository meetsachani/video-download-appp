package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import o.C2653Ck;
import o.C7025iN1;

@InterfaceC11259zi0
/* renamed from: o.Ek  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2849Ek {
    public static final String a = "BadgeUtils";

    /* renamed from: o.Ek$a */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public final /* synthetic */ Toolbar X;
        public final /* synthetic */ int Y;
        public final /* synthetic */ FrameLayout Y0;
        public final /* synthetic */ C2555Bk Z;

        public a(Toolbar toolbar, int i, C2555Bk c2555Bk, FrameLayout frameLayout) {
            this.X = toolbar;
            this.Y = i;
            this.Z = c2555Bk;
            this.Y0 = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuItemView a = C8854pq2.a(this.X, this.Y);
            if (a != null) {
                C2849Ek.p(this.Z, this.X.getResources());
                C2849Ek.e(this.Z, a, this.Y0);
                C2849Ek.c(this.Z, a);
            }
        }
    }

    /* renamed from: o.Ek$b */
    /* loaded from: classes3.dex */
    public class b extends Q3 {
        public final /* synthetic */ View d;
        public final /* synthetic */ C2555Bk e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View.AccessibilityDelegate accessibilityDelegate, View view, C2555Bk c2555Bk) {
            super(accessibilityDelegate);
            this.d = view;
            this.e = c2555Bk;
        }

        @Override // o.Q3
        public void g(View view, C10861y4 c10861y4) {
            super.g(view, c10861y4);
            c10861y4.p1(C2849Ek.m(this.d, this.e));
        }
    }

    /* renamed from: o.Ek$c */
    /* loaded from: classes3.dex */
    public class c extends Q3 {
        public final /* synthetic */ View d;
        public final /* synthetic */ C2555Bk e;

        public c(View view, C2555Bk c2555Bk) {
            this.d = view;
            this.e = c2555Bk;
        }

        @Override // o.Q3
        public void g(View view, C10861y4 c10861y4) {
            super.g(view, c10861y4);
            c10861y4.p1(C2849Ek.m(this.d, this.e));
        }
    }

    /* renamed from: o.Ek$d */
    /* loaded from: classes3.dex */
    public class d extends Q3 {
        public final /* synthetic */ View d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View.AccessibilityDelegate accessibilityDelegate, View view) {
            super(accessibilityDelegate);
            this.d = view;
        }

        @Override // o.Q3
        public void g(View view, C10861y4 c10861y4) {
            super.g(view, c10861y4);
            c10861y4.p1(this.d.getContentDescription());
        }
    }

    public static void c(@InterfaceC5670cr1 C2555Bk c2555Bk, @InterfaceC5670cr1 View view) {
        if (Build.VERSION.SDK_INT >= 29 && C6516gH2.L0(view)) {
            C6516gH2.I1(view, new b(C2751Dk.a(view), view, c2555Bk));
        } else {
            C6516gH2.I1(view, new c(view, c2555Bk));
        }
    }

    public static void d(@InterfaceC5670cr1 C2555Bk c2555Bk, @InterfaceC5670cr1 View view) {
        e(c2555Bk, view, null);
    }

    public static void e(@InterfaceC5670cr1 C2555Bk c2555Bk, @InterfaceC5670cr1 View view, @InterfaceC11300zs1 FrameLayout frameLayout) {
        o(c2555Bk, view, frameLayout);
        if (c2555Bk.t() != null) {
            c2555Bk.t().setForeground(c2555Bk);
        } else {
            view.getOverlay().add(c2555Bk);
        }
    }

    public static void f(@InterfaceC5670cr1 C2555Bk c2555Bk, @InterfaceC5670cr1 Toolbar toolbar, @PL0 int i) {
        g(c2555Bk, toolbar, i, null);
    }

    public static void g(@InterfaceC5670cr1 C2555Bk c2555Bk, @InterfaceC5670cr1 Toolbar toolbar, @PL0 int i, @InterfaceC11300zs1 FrameLayout frameLayout) {
        toolbar.post(new a(toolbar, i, c2555Bk, frameLayout));
    }

    @InterfaceC5670cr1
    public static SparseArray<C2555Bk> h(Context context, @InterfaceC5670cr1 C2511Ay1 c2511Ay1) {
        C2555Bk c2555Bk;
        SparseArray<C2555Bk> sparseArray = new SparseArray<>(c2511Ay1.size());
        for (int i = 0; i < c2511Ay1.size(); i++) {
            int keyAt = c2511Ay1.keyAt(i);
            C2653Ck.a aVar = (C2653Ck.a) c2511Ay1.valueAt(i);
            if (aVar != null) {
                c2555Bk = C2555Bk.i(context, aVar);
            } else {
                c2555Bk = null;
            }
            sparseArray.put(keyAt, c2555Bk);
        }
        return sparseArray;
    }

    @InterfaceC5670cr1
    public static C2511Ay1 i(@InterfaceC5670cr1 SparseArray<C2555Bk> sparseArray) {
        C2653Ck.a aVar;
        C2511Ay1 c2511Ay1 = new C2511Ay1();
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            C2555Bk valueAt = sparseArray.valueAt(i);
            if (valueAt != null) {
                aVar = valueAt.H();
            } else {
                aVar = null;
            }
            c2511Ay1.put(keyAt, aVar);
        }
        return c2511Ay1;
    }

    public static void j(@InterfaceC5670cr1 View view) {
        if (Build.VERSION.SDK_INT >= 29 && C6516gH2.L0(view)) {
            C6516gH2.I1(view, new d(C2751Dk.a(view), view));
        } else {
            C6516gH2.I1(view, null);
        }
    }

    public static void k(@InterfaceC11300zs1 C2555Bk c2555Bk, @InterfaceC5670cr1 View view) {
        if (c2555Bk == null) {
            return;
        }
        if (c2555Bk.t() != null) {
            c2555Bk.t().setForeground(null);
        } else {
            view.getOverlay().remove(c2555Bk);
        }
    }

    public static void l(@InterfaceC11300zs1 C2555Bk c2555Bk, @InterfaceC5670cr1 Toolbar toolbar, @PL0 int i) {
        if (c2555Bk == null) {
            return;
        }
        ActionMenuItemView a2 = C8854pq2.a(toolbar, i);
        if (a2 != null) {
            n(c2555Bk);
            k(c2555Bk, a2);
            j(a2);
            return;
        }
        Log.w(a, "Trying to remove badge from a null menuItemView: " + i);
    }

    public static CharSequence m(View view, C2555Bk c2555Bk) {
        CharSequence s = c2555Bk.s();
        if (s != null) {
            return s;
        }
        return view.getContentDescription();
    }

    @InterfaceC5056aJ2
    public static void n(C2555Bk c2555Bk) {
        c2555Bk.h0(0);
        c2555Bk.i0(0);
    }

    public static void o(@InterfaceC5670cr1 C2555Bk c2555Bk, @InterfaceC5670cr1 View view, @InterfaceC11300zs1 FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        c2555Bk.setBounds(rect);
        c2555Bk.P0(view, frameLayout);
    }

    @InterfaceC5056aJ2
    public static void p(C2555Bk c2555Bk, Resources resources) {
        c2555Bk.h0(resources.getDimensionPixelOffset(C7025iN1.f.mtrl_badge_toolbar_action_menu_item_horizontal_offset));
        c2555Bk.i0(resources.getDimensionPixelOffset(C7025iN1.f.mtrl_badge_toolbar_action_menu_item_vertical_offset));
    }

    public static void q(@InterfaceC5670cr1 Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }
}
