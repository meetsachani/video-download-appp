package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import o.ML1;

/* loaded from: classes.dex */
public final class BE1 {
    public static final int a = ML1.a.pooling_container_listener_holder_tag;
    public static final int b = ML1.a.is_pooling_container_tag;

    public static final void a(View view, CE1 ce1) {
        C6562gT0.p(view, "<this>");
        C6562gT0.p(ce1, ServiceSpecificExtraArgs.CastExtraArgs.a);
        d(view).a(ce1);
    }

    public static final void b(View view) {
        C6562gT0.p(view, "<this>");
        for (View view2 : BH2.i(view)) {
            d(view2).b();
        }
    }

    public static final void c(ViewGroup viewGroup) {
        C6562gT0.p(viewGroup, "<this>");
        for (View view : C8720pH2.e(viewGroup)) {
            d(view).b();
        }
    }

    public static final DE1 d(View view) {
        int i = a;
        DE1 de1 = (DE1) view.getTag(i);
        if (de1 == null) {
            DE1 de12 = new DE1();
            view.setTag(i, de12);
            return de12;
        }
        return de1;
    }

    public static final boolean e(View view) {
        Boolean bool;
        C6562gT0.p(view, "<this>");
        Object tag = view.getTag(b);
        if (tag instanceof Boolean) {
            bool = (Boolean) tag;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean f(View view) {
        C6562gT0.p(view, "<this>");
        for (ViewParent viewParent : BH2.j(view)) {
            if ((viewParent instanceof View) && e((View) viewParent)) {
                return true;
            }
        }
        return false;
    }

    public static final void g(View view, CE1 ce1) {
        C6562gT0.p(view, "<this>");
        C6562gT0.p(ce1, ServiceSpecificExtraArgs.CastExtraArgs.a);
        d(view).c(ce1);
    }

    public static final void h(View view, boolean z) {
        C6562gT0.p(view, "<this>");
        view.setTag(b, Boolean.valueOf(z));
    }
}
