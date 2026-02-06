package o;

import android.view.View;
import android.view.ViewParent;
import o.C6037eM1;

/* renamed from: o.rI2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9216rI2 {

    /* renamed from: o.rI2$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC8052mY0 implements HA0<View, View> {
        public static final a X = new a();

        public a() {
            super(1);
        }

        @Override // o.HA0
        /* renamed from: c */
        public final View invoke(View view) {
            C6562gT0.p(view, "currentView");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* renamed from: o.rI2$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC8052mY0 implements HA0<View, KZ0> {
        public static final b X = new b();

        public b() {
            super(1);
        }

        @Override // o.HA0
        /* renamed from: c */
        public final KZ0 invoke(View view) {
            C6562gT0.p(view, "viewParent");
            Object tag = view.getTag(C6037eM1.a.a);
            if (tag instanceof KZ0) {
                return (KZ0) tag;
            }
            return null;
        }
    }

    public static final KZ0 a(View view) {
        C6562gT0.p(view, "<this>");
        return (KZ0) C6695h12.g1(C6695h12.Q1(U02.t(view, a.X), b.X));
    }

    public static final void b(View view, KZ0 kz0) {
        C6562gT0.p(view, "<this>");
        view.setTag(C6037eM1.a.a, kz0);
    }
}
