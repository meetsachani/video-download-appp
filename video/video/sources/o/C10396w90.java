package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: o.w90  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10396w90 extends C10150v90 {
    @Override // o.C9907u90, o.C8686p90, o.InterfaceC10882y90
    public void b(C8587ok2 c8587ok2, C8587ok2 c8587ok22, Window window, View view, boolean z, boolean z2) {
        C6562gT0.p(c8587ok2, "statusBarStyle");
        C6562gT0.p(c8587ok22, "navigationBarStyle");
        C6562gT0.p(window, "window");
        C6562gT0.p(view, C9698tH2.A);
        boolean z3 = false;
        C8006mL2.c(window, false);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if ((attributes.flags & 256) != 0 || attributes.width != -2 || attributes.height != -2) {
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            int h = c8587ok2.h(z);
            int h2 = c8587ok22.h(z2);
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.addView(new UJ1(viewGroup.getContext(), C8222nF.O(new C6254fG(2, h), new C6254fG(1, h2), new C6254fG(4, h2), new C6254fG(8, h2))));
        }
        if (c8587ok22.f() == 0) {
            z3 = true;
        }
        window.setNavigationBarContrastEnforced(z3);
        C10450wM2 c10450wM2 = new C10450wM2(window, view);
        c10450wM2.i(!z);
        c10450wM2.h(!z2);
    }
}
