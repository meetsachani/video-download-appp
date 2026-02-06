package o;

import android.view.View;
import android.view.ViewParent;
import o.C7748lM1;

/* renamed from: o.sI2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9459sI2 {
    public static final InterfaceC4345To1 a(View view) {
        InterfaceC4345To1 interfaceC4345To1;
        C6562gT0.p(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(C7748lM1.a.view_tree_navigation_event_dispatcher_owner);
            if (tag instanceof InterfaceC4345To1) {
                interfaceC4345To1 = (InterfaceC4345To1) tag;
            } else {
                interfaceC4345To1 = null;
            }
            if (interfaceC4345To1 != null) {
                return interfaceC4345To1;
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

    public static final void b(View view, InterfaceC4345To1 interfaceC4345To1) {
        C6562gT0.p(view, "<this>");
        view.setTag(C7748lM1.a.view_tree_navigation_event_dispatcher_owner, interfaceC4345To1);
    }
}
