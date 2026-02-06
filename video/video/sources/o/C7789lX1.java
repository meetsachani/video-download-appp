package o;

import android.webkit.SafeBrowsingResponse;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import o.AbstractC3408Ka;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;

/* renamed from: o.lX1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7789lX1 extends AbstractC7546kX1 {
    public SafeBrowsingResponse a;
    public SafeBrowsingResponseBoundaryInterface b;

    public C7789lX1(InvocationHandler invocationHandler) {
        this.b = (SafeBrowsingResponseBoundaryInterface) C7128ip.a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    @Override // o.AbstractC7546kX1
    public void a(boolean z) {
        AbstractC3408Ka.f fVar = C6771hK2.x;
        if (fVar.c()) {
            C5119ab.a(e(), z);
        } else if (fVar.d()) {
            d().backToSafety(z);
        } else {
            throw C6771hK2.a();
        }
    }

    @Override // o.AbstractC7546kX1
    public void b(boolean z) {
        AbstractC3408Ka.f fVar = C6771hK2.y;
        if (fVar.c()) {
            C5119ab.c(e(), z);
        } else if (fVar.d()) {
            d().proceed(z);
        } else {
            throw C6771hK2.a();
        }
    }

    @Override // o.AbstractC7546kX1
    public void c(boolean z) {
        AbstractC3408Ka.f fVar = C6771hK2.z;
        if (fVar.c()) {
            C5119ab.e(e(), z);
        } else if (fVar.d()) {
            d().showInterstitial(z);
        } else {
            throw C6771hK2.a();
        }
    }

    public final SafeBrowsingResponseBoundaryInterface d() {
        if (this.b == null) {
            this.b = (SafeBrowsingResponseBoundaryInterface) C7128ip.a(SafeBrowsingResponseBoundaryInterface.class, C7014iK2.c().c(this.a));
        }
        return this.b;
    }

    public final SafeBrowsingResponse e() {
        if (this.a == null) {
            this.a = C7014iK2.c().b(Proxy.getInvocationHandler(this.b));
        }
        return this.a;
    }

    public C7789lX1(SafeBrowsingResponse safeBrowsingResponse) {
        this.a = safeBrowsingResponse;
    }
}
