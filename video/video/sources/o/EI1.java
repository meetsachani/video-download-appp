package o;

import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.WebStorage;

/* loaded from: classes.dex */
public interface EI1 {
    public static final String a = "Default";

    GeolocationPermissions a();

    CookieManager getCookieManager();

    String getName();

    ServiceWorkerController getServiceWorkerController();

    WebStorage getWebStorage();
}
