package o;

import android.webkit.WebResourceRequest;
import o.AbstractC3408Ka;

/* loaded from: classes.dex */
public class XJ2 {
    public static WJ2 a(WebResourceRequest webResourceRequest) {
        return C7014iK2.c().k(webResourceRequest);
    }

    public static boolean b(WebResourceRequest webResourceRequest) {
        AbstractC3408Ka.c cVar = C6771hK2.u;
        if (cVar.c()) {
            return C3701Na.j(webResourceRequest);
        }
        if (cVar.d()) {
            return a(webResourceRequest).a();
        }
        throw C6771hK2.a();
    }
}
