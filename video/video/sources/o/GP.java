package o;

import java.util.List;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;

/* loaded from: classes.dex */
public class GP {
    public final WebViewCookieManagerBoundaryInterface a;

    public GP(WebViewCookieManagerBoundaryInterface webViewCookieManagerBoundaryInterface) {
        this.a = webViewCookieManagerBoundaryInterface;
    }

    public List<String> a(String str) {
        return this.a.getCookieInfo(str);
    }
}
