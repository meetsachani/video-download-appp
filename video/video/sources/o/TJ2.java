package o;

import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import o.AbstractC3408Ka;
import o.SJ2;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;

/* loaded from: classes.dex */
public class TJ2 extends SJ2 {
    public WebMessagePort a;
    public WebMessagePortBoundaryInterface b;

    public TJ2(WebMessagePort webMessagePort) {
        this.a = webMessagePort;
    }

    public static WebMessage g(PJ2 pj2) {
        return C3603Ma.b(pj2);
    }

    public static WebMessagePort[] h(SJ2[] sj2Arr) {
        if (sj2Arr == null) {
            return null;
        }
        int length = sj2Arr.length;
        WebMessagePort[] webMessagePortArr = new WebMessagePort[length];
        for (int i = 0; i < length; i++) {
            webMessagePortArr[i] = sj2Arr[i].b();
        }
        return webMessagePortArr;
    }

    public static PJ2 i(WebMessage webMessage) {
        return C3603Ma.d(webMessage);
    }

    public static SJ2[] l(WebMessagePort[] webMessagePortArr) {
        if (webMessagePortArr == null) {
            return null;
        }
        SJ2[] sj2Arr = new SJ2[webMessagePortArr.length];
        for (int i = 0; i < webMessagePortArr.length; i++) {
            sj2Arr[i] = new TJ2(webMessagePortArr[i]);
        }
        return sj2Arr;
    }

    @Override // o.SJ2
    public void a() {
        AbstractC3408Ka.b bVar = C6771hK2.B;
        if (bVar.c()) {
            C3603Ma.a(k());
        } else if (bVar.d()) {
            j().close();
        } else {
            throw C6771hK2.a();
        }
    }

    @Override // o.SJ2
    public WebMessagePort b() {
        return k();
    }

    @Override // o.SJ2
    public InvocationHandler c() {
        return Proxy.getInvocationHandler(j());
    }

    @Override // o.SJ2
    public void d(PJ2 pj2) {
        AbstractC3408Ka.b bVar = C6771hK2.A;
        if (bVar.c() && pj2.e() == 0) {
            C3603Ma.h(k(), g(pj2));
        } else if (bVar.d() && NJ2.a(pj2.e())) {
            j().postMessage(C7128ip.d(new NJ2(pj2)));
        } else {
            throw C6771hK2.a();
        }
    }

    @Override // o.SJ2
    public void e(Handler handler, SJ2.a aVar) {
        AbstractC3408Ka.b bVar = C6771hK2.E;
        if (bVar.d()) {
            j().setWebMessageCallback(C7128ip.d(new OJ2(aVar)), handler);
        } else if (bVar.c()) {
            C3603Ma.m(k(), aVar, handler);
        } else {
            throw C6771hK2.a();
        }
    }

    @Override // o.SJ2
    public void f(SJ2.a aVar) {
        AbstractC3408Ka.b bVar = C6771hK2.D;
        if (bVar.d()) {
            j().setWebMessageCallback(C7128ip.d(new OJ2(aVar)));
        } else if (bVar.c()) {
            C3603Ma.l(k(), aVar);
        } else {
            throw C6771hK2.a();
        }
    }

    public final WebMessagePortBoundaryInterface j() {
        if (this.b == null) {
            this.b = (WebMessagePortBoundaryInterface) C7128ip.a(WebMessagePortBoundaryInterface.class, C7014iK2.c().h(this.a));
        }
        return this.b;
    }

    public final WebMessagePort k() {
        if (this.a == null) {
            this.a = C7014iK2.c().g(Proxy.getInvocationHandler(this.b));
        }
        return this.a;
    }

    public TJ2(InvocationHandler invocationHandler) {
        this.b = (WebMessagePortBoundaryInterface) C7128ip.a(WebMessagePortBoundaryInterface.class, invocationHandler);
    }
}
