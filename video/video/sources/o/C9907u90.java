package o;

import android.view.View;
import android.view.Window;

/* renamed from: o.u90  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9907u90 extends C9178r90 {
    @Override // o.C8686p90, o.InterfaceC10882y90
    public void b(C8587ok2 c8587ok2, C8587ok2 c8587ok22, Window window, View view, boolean z, boolean z2) {
        C6562gT0.p(c8587ok2, "statusBarStyle");
        C6562gT0.p(c8587ok22, "navigationBarStyle");
        C6562gT0.p(window, "window");
        C6562gT0.p(view, C9698tH2.A);
        boolean z3 = false;
        C8006mL2.c(window, false);
        window.setStatusBarColor(c8587ok2.h(z));
        window.setNavigationBarColor(c8587ok22.h(z2));
        window.setStatusBarContrastEnforced(false);
        if (c8587ok22.f() == 0) {
            z3 = true;
        }
        window.setNavigationBarContrastEnforced(z3);
        C10450wM2 c10450wM2 = new C10450wM2(window, view);
        c10450wM2.i(!z);
        c10450wM2.h(true ^ z2);
    }
}
