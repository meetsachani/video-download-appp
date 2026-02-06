package o;

import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;

/* loaded from: classes.dex */
public class WJ2 {
    public final WebResourceRequestBoundaryInterface a;

    public WJ2(WebResourceRequestBoundaryInterface webResourceRequestBoundaryInterface) {
        this.a = webResourceRequestBoundaryInterface;
    }

    public boolean a() {
        return this.a.isRedirect();
    }
}
