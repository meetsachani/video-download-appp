package o;

import android.view.View;
import android.view.Window;

/* renamed from: o.o90  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8442o90 extends AbstractC10639x90 {
    @Override // o.InterfaceC10882y90
    public void b(C8587ok2 c8587ok2, C8587ok2 c8587ok22, Window window, View view, boolean z, boolean z2) {
        C6562gT0.p(c8587ok2, "statusBarStyle");
        C6562gT0.p(c8587ok22, "navigationBarStyle");
        C6562gT0.p(window, "window");
        C6562gT0.p(view, C9698tH2.A);
        C8006mL2.c(window, false);
        window.setStatusBarColor(c8587ok2.g(z));
        window.setNavigationBarColor(c8587ok22.d());
        new C10450wM2(window, view).i(!z);
    }
}
