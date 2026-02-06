package o;

import android.webkit.ServiceWorkerWebSettings;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Set;
import o.AbstractC3408Ka;
import org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface;

/* loaded from: classes.dex */
public class R12 extends Q12 {
    public ServiceWorkerWebSettings a;
    public ServiceWorkerWebSettingsBoundaryInterface b;

    public R12(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        this.a = serviceWorkerWebSettings;
    }

    @Override // o.Q12
    public boolean a() {
        AbstractC3408Ka.c cVar = C6771hK2.m;
        if (cVar.c()) {
            return C3701Na.a(l());
        }
        if (cVar.d()) {
            return k().getAllowContentAccess();
        }
        throw C6771hK2.a();
    }

    @Override // o.Q12
    public boolean b() {
        AbstractC3408Ka.c cVar = C6771hK2.n;
        if (cVar.c()) {
            return C3701Na.b(l());
        }
        if (cVar.d()) {
            return k().getAllowFileAccess();
        }
        throw C6771hK2.a();
    }

    @Override // o.Q12
    public boolean c() {
        AbstractC3408Ka.c cVar = C6771hK2.f758o;
        if (cVar.c()) {
            return C3701Na.c(l());
        }
        if (cVar.d()) {
            return k().getBlockNetworkLoads();
        }
        throw C6771hK2.a();
    }

    @Override // o.Q12
    public int d() {
        AbstractC3408Ka.c cVar = C6771hK2.l;
        if (cVar.c()) {
            return C3701Na.d(l());
        }
        if (cVar.d()) {
            return k().getCacheMode();
        }
        throw C6771hK2.a();
    }

    @Override // o.Q12
    public Set<String> e() {
        if (C6771hK2.a0.d()) {
            return k().getRequestedWithHeaderOriginAllowList();
        }
        throw C6771hK2.a();
    }

    @Override // o.Q12
    public void f(boolean z) {
        AbstractC3408Ka.c cVar = C6771hK2.m;
        if (cVar.c()) {
            C3701Na.k(l(), z);
        } else if (cVar.d()) {
            k().setAllowContentAccess(z);
        } else {
            throw C6771hK2.a();
        }
    }

    @Override // o.Q12
    public void g(boolean z) {
        AbstractC3408Ka.c cVar = C6771hK2.n;
        if (cVar.c()) {
            C3701Na.l(l(), z);
        } else if (cVar.d()) {
            k().setAllowFileAccess(z);
        } else {
            throw C6771hK2.a();
        }
    }

    @Override // o.Q12
    public void h(boolean z) {
        AbstractC3408Ka.c cVar = C6771hK2.f758o;
        if (cVar.c()) {
            C3701Na.m(l(), z);
        } else if (cVar.d()) {
            k().setBlockNetworkLoads(z);
        } else {
            throw C6771hK2.a();
        }
    }

    @Override // o.Q12
    public void i(int i) {
        AbstractC3408Ka.c cVar = C6771hK2.l;
        if (cVar.c()) {
            C3701Na.n(l(), i);
        } else if (cVar.d()) {
            k().setCacheMode(i);
        } else {
            throw C6771hK2.a();
        }
    }

    @Override // o.Q12
    public void j(Set<String> set) {
        if (C6771hK2.a0.d()) {
            k().setRequestedWithHeaderOriginAllowList(set);
            return;
        }
        throw C6771hK2.a();
    }

    public final ServiceWorkerWebSettingsBoundaryInterface k() {
        if (this.b == null) {
            this.b = (ServiceWorkerWebSettingsBoundaryInterface) C7128ip.a(ServiceWorkerWebSettingsBoundaryInterface.class, C7014iK2.c().e(this.a));
        }
        return this.b;
    }

    public final ServiceWorkerWebSettings l() {
        if (this.a == null) {
            this.a = C7014iK2.c().d(Proxy.getInvocationHandler(this.b));
        }
        return this.a;
    }

    public R12(InvocationHandler invocationHandler) {
        this.b = (ServiceWorkerWebSettingsBoundaryInterface) C7128ip.a(ServiceWorkerWebSettingsBoundaryInterface.class, invocationHandler);
    }
}
