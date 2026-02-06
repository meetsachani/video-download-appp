package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class w {
    public static int a(RecyclerView.D d, t tVar, View view, View view2, RecyclerView.p pVar, boolean z) {
        if (pVar.V() != 0 && d.d() != 0 && view != null && view2 != null) {
            if (!z) {
                return Math.abs(pVar.w0(view) - pVar.w0(view2)) + 1;
            }
            return Math.min(tVar.o(), tVar.d(view2) - tVar.g(view));
        }
        return 0;
    }

    public static int b(RecyclerView.D d, t tVar, View view, View view2, RecyclerView.p pVar, boolean z, boolean z2) {
        int max;
        if (pVar.V() == 0 || d.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(pVar.w0(view), pVar.w0(view2));
        int max2 = Math.max(pVar.w0(view), pVar.w0(view2));
        if (z2) {
            max = Math.max(0, (d.d() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z) {
            return max;
        }
        return Math.round((max * (Math.abs(tVar.d(view2) - tVar.g(view)) / (Math.abs(pVar.w0(view) - pVar.w0(view2)) + 1))) + (tVar.n() - tVar.g(view)));
    }

    public static int c(RecyclerView.D d, t tVar, View view, View view2, RecyclerView.p pVar, boolean z) {
        if (pVar.V() != 0 && d.d() != 0 && view != null && view2 != null) {
            if (!z) {
                return d.d();
            }
            return (int) (((tVar.d(view2) - tVar.g(view)) / (Math.abs(pVar.w0(view) - pVar.w0(view2)) + 1)) * d.d());
        }
        return 0;
    }
}
