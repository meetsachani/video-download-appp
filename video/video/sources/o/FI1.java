package o;

import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.WebStorage;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;

/* loaded from: classes.dex */
public class FI1 implements EI1 {
    public final ProfileBoundaryInterface b;

    public FI1(ProfileBoundaryInterface profileBoundaryInterface) {
        this.b = profileBoundaryInterface;
    }

    @Override // o.EI1
    public GeolocationPermissions a() throws IllegalStateException {
        if (C6771hK2.c0.d()) {
            return this.b.getGeoLocationPermissions();
        }
        throw C6771hK2.a();
    }

    @Override // o.EI1
    public CookieManager getCookieManager() throws IllegalStateException {
        if (C6771hK2.c0.d()) {
            return this.b.getCookieManager();
        }
        throw C6771hK2.a();
    }

    @Override // o.EI1
    public String getName() {
        if (C6771hK2.c0.d()) {
            return this.b.getName();
        }
        throw C6771hK2.a();
    }

    @Override // o.EI1
    public ServiceWorkerController getServiceWorkerController() throws IllegalStateException {
        if (C6771hK2.c0.d()) {
            return this.b.getServiceWorkerController();
        }
        throw C6771hK2.a();
    }

    @Override // o.EI1
    public WebStorage getWebStorage() throws IllegalStateException {
        if (C6771hK2.c0.d()) {
            return this.b.getWebStorage();
        }
        throw C6771hK2.a();
    }

    public FI1() {
        this.b = null;
    }
}
