package o;

import android.view.View;
import android.view.ViewParent;
import o.C6535gM1;

/* renamed from: o.wI2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10434wI2 {

    /* renamed from: o.wI2$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC8052mY0 implements HA0<View, View> {
        public static final a X = new a();

        public a() {
            super(1);
        }

        @Override // o.HA0
        /* renamed from: c */
        public final View invoke(View view) {
            C6562gT0.p(view, C9698tH2.A);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* renamed from: o.wI2$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC8052mY0 implements HA0<View, HH2> {
        public static final b X = new b();

        public b() {
            super(1);
        }

        @Override // o.HA0
        /* renamed from: c */
        public final HH2 invoke(View view) {
            C6562gT0.p(view, C9698tH2.A);
            Object tag = view.getTag(C6535gM1.a.a);
            if (tag instanceof HH2) {
                return (HH2) tag;
            }
            return null;
        }
    }

    public static final HH2 a(View view) {
        C6562gT0.p(view, "<this>");
        return (HH2) C6695h12.g1(C6695h12.Q1(U02.t(view, a.X), b.X));
    }

    public static final void b(View view, HH2 hh2) {
        C6562gT0.p(view, "<this>");
        view.setTag(C6535gM1.a.a, hh2);
    }
}
