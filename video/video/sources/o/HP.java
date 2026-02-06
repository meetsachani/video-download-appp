package o;

import android.webkit.CookieManager;
import java.util.List;

/* loaded from: classes.dex */
public class HP {
    public static GP a(CookieManager cookieManager) {
        return C7014iK2.c().a(cookieManager);
    }

    public static List<String> b(CookieManager cookieManager, String str) {
        if (C6771hK2.Z.d()) {
            return a(cookieManager).a(str);
        }
        throw C6771hK2.a();
    }
}
