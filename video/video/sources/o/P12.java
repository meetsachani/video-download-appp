package o;

import android.webkit.ServiceWorkerController;
import o.AbstractC3408Ka;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;

/* loaded from: classes.dex */
public class P12 extends O12 {
    public ServiceWorkerController a;
    public ServiceWorkerControllerBoundaryInterface b;
    public final Q12 c;

    public P12() {
        AbstractC3408Ka.c cVar = C6771hK2.k;
        if (cVar.c()) {
            this.a = C3701Na.g();
            this.b = null;
            this.c = C3701Na.i(e());
        } else if (cVar.d()) {
            this.a = null;
            ServiceWorkerControllerBoundaryInterface serviceWorkerController = C7014iK2.d().getServiceWorkerController();
            this.b = serviceWorkerController;
            this.c = new R12(serviceWorkerController.getServiceWorkerWebSettings());
        } else {
            throw C6771hK2.a();
        }
    }

    @Override // o.O12
    public Q12 b() {
        return this.c;
    }

    @Override // o.O12
    public void c(N12 n12) {
        AbstractC3408Ka.c cVar = C6771hK2.k;
        if (cVar.c()) {
            if (n12 == null) {
                C3701Na.p(e(), null);
            } else {
                C3701Na.q(e(), n12);
            }
        } else if (cVar.d()) {
            if (n12 == null) {
                d().setServiceWorkerClient(null);
            } else {
                d().setServiceWorkerClient(C7128ip.d(new M12(n12)));
            }
        } else {
            throw C6771hK2.a();
        }
    }

    public final ServiceWorkerControllerBoundaryInterface d() {
        if (this.b == null) {
            this.b = C7014iK2.d().getServiceWorkerController();
        }
        return this.b;
    }

    public final ServiceWorkerController e() {
        if (this.a == null) {
            this.a = C3701Na.g();
        }
        return this.a;
    }
}
