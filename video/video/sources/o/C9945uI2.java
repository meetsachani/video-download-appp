package o;

import android.view.View;
import android.view.ViewParent;
import o.C9474sM1;

/* renamed from: o.uI2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9945uI2 {

    /* renamed from: o.uI2$a */
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

    /* renamed from: o.uI2$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC8052mY0 implements HA0<View, OX1> {
        public static final b X = new b();

        public b() {
            super(1);
        }

        @Override // o.HA0
        /* renamed from: c */
        public final OX1 invoke(View view) {
            C6562gT0.p(view, C9698tH2.A);
            Object tag = view.getTag(C9474sM1.a.a);
            if (tag instanceof OX1) {
                return (OX1) tag;
            }
            return null;
        }
    }

    public static final OX1 a(View view) {
        C6562gT0.p(view, "<this>");
        return (OX1) C6695h12.g1(C6695h12.Q1(U02.t(view, a.X), b.X));
    }

    public static final void b(View view, OX1 ox1) {
        C6562gT0.p(view, "<this>");
        view.setTag(C9474sM1.a.a, ox1);
    }
}
