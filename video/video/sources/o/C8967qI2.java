package o;

import android.view.View;
import android.view.ViewParent;
import o.CL1;

/* renamed from: o.qI2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8967qI2 {
    public static final CA0 a(View view) {
        CA0 ca0;
        C6562gT0.p(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(CL1.a.report_drawn);
            if (tag instanceof CA0) {
                ca0 = (CA0) tag;
            } else {
                ca0 = null;
            }
            if (ca0 != null) {
                return ca0;
            }
            ViewParent a = C8724pI2.a(view);
            if (a instanceof View) {
                view = (View) a;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static final void b(View view, CA0 ca0) {
        C6562gT0.p(view, "<this>");
        C6562gT0.p(ca0, "fullyDrawnReporterOwner");
        view.setTag(CL1.a.report_drawn, ca0);
    }
}
