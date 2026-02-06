package o;

import android.view.View;
import android.view.ViewParent;
import o.JL1;

/* renamed from: o.pI2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8724pI2 {
    public static final ViewParent a(View view) {
        C6562gT0.p(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(JL1.a.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final void b(View view, ViewParent viewParent) {
        C6562gT0.p(view, "<this>");
        view.setTag(JL1.a.view_tree_disjoint_parent, viewParent);
    }
}
