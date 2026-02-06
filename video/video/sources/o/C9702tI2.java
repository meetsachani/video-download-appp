package o;

import android.view.View;
import android.view.ViewParent;
import o.CL1;

/* renamed from: o.tI2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9702tI2 {
    public static final InterfaceC3294Iu1 a(View view) {
        InterfaceC3294Iu1 interfaceC3294Iu1;
        C6562gT0.p(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(CL1.a.view_tree_on_back_pressed_dispatcher_owner);
            if (tag instanceof InterfaceC3294Iu1) {
                interfaceC3294Iu1 = (InterfaceC3294Iu1) tag;
            } else {
                interfaceC3294Iu1 = null;
            }
            if (interfaceC3294Iu1 != null) {
                return interfaceC3294Iu1;
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

    public static final void b(View view, InterfaceC3294Iu1 interfaceC3294Iu1) {
        C6562gT0.p(view, "<this>");
        C6562gT0.p(interfaceC3294Iu1, "onBackPressedDispatcherOwner");
        view.setTag(CL1.a.view_tree_on_back_pressed_dispatcher_owner, interfaceC3294Iu1);
    }
}
