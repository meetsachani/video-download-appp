package o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import o.AbstractC3408Ka;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* renamed from: o.fK2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6273fK2 {
    public static final Uri a = Uri.parse("*");
    public static final Uri b = Uri.parse("");

    /* renamed from: o.fK2$a */
    /* loaded from: classes.dex */
    public interface a {
        void onComplete(long j);
    }

    /* renamed from: o.fK2$b */
    /* loaded from: classes.dex */
    public interface b {
        void a(WebView webView, PJ2 pj2, Uri uri, boolean z, CU0 cu0);
    }

    @Deprecated
    public static void A(List<String> list, ValueCallback<Boolean> valueCallback) {
        z(new HashSet(list), valueCallback);
    }

    public static void B(WebView webView, Executor executor, AbstractC8489oK2 abstractC8489oK2) {
        AbstractC3408Ka.h hVar = C6771hK2.O;
        if (hVar.c()) {
            C10255vb.e(webView, executor, abstractC8489oK2);
        } else if (hVar.d()) {
            l(webView).o(executor, abstractC8489oK2);
        } else {
            throw C6771hK2.a();
        }
    }

    public static void C(WebView webView, AbstractC8489oK2 abstractC8489oK2) {
        AbstractC3408Ka.h hVar = C6771hK2.O;
        if (hVar.c()) {
            C10255vb.f(webView, abstractC8489oK2);
        } else if (hVar.d()) {
            l(webView).o(null, abstractC8489oK2);
        } else {
            throw C6771hK2.a();
        }
    }

    public static void D(Context context, ValueCallback<Boolean> valueCallback) {
        AbstractC3408Ka.f fVar = C6771hK2.e;
        if (fVar.c()) {
            C5119ab.f(context, valueCallback);
        } else if (fVar.d()) {
            h().getStatics().initSafeBrowsing(context, valueCallback);
        } else {
            throw C6771hK2.a();
        }
    }

    public static QY1 a(WebView webView, String str, Set<String> set) {
        if (C6771hK2.V.d()) {
            return l(webView).a(str, (String[]) set.toArray(new String[0]));
        }
        throw C6771hK2.a();
    }

    public static void b(WebView webView, String str, Set<String> set, b bVar) {
        if (C6771hK2.U.d()) {
            l(webView).b(str, (String[]) set.toArray(new String[0]), bVar);
            return;
        }
        throw C6771hK2.a();
    }

    public static void c(WebView webView) {
        if (Build.VERSION.SDK_INT >= 28) {
            Looper c = C8304nb.c(webView);
            if (c == Looper.myLooper()) {
                return;
            }
            throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + c + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + C9811tl1.d);
        }
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(webView, null);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static WebViewProviderBoundaryInterface d(WebView webView) {
        return h().createWebView(webView);
    }

    public static SJ2[] e(WebView webView) {
        AbstractC3408Ka.b bVar = C6771hK2.E;
        if (bVar.c()) {
            return TJ2.l(C3603Ma.c(webView));
        }
        if (bVar.d()) {
            return l(webView).c();
        }
        throw C6771hK2.a();
    }

    public static PackageInfo f() {
        if (Build.VERSION.SDK_INT >= 26) {
            return C4287Ta.a();
        }
        try {
            return i();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static PackageInfo g(Context context) {
        PackageInfo f = f();
        if (f != null) {
            return f;
        }
        return j(context);
    }

    public static InterfaceC7741lK2 h() {
        return C7014iK2.d();
    }

    public static PackageInfo i() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static PackageInfo j(Context context) {
        try {
            String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static EI1 k(WebView webView) {
        if (C6771hK2.c0.d()) {
            return l(webView).d();
        }
        throw C6771hK2.a();
    }

    public static C7498kK2 l(WebView webView) {
        return new C7498kK2(d(webView));
    }

    public static Uri m() {
        AbstractC3408Ka.f fVar = C6771hK2.j;
        if (fVar.c()) {
            return C5119ab.b();
        }
        if (fVar.d()) {
            return h().getStatics().getSafeBrowsingPrivacyPolicyUrl();
        }
        throw C6771hK2.a();
    }

    public static String n() {
        if (C6771hK2.X.d()) {
            return h().getStatics().getVariationsHeader();
        }
        throw C6771hK2.a();
    }

    public static WebChromeClient o(WebView webView) {
        AbstractC3408Ka.e eVar = C6771hK2.I;
        if (eVar.c()) {
            return C4287Ta.c(webView);
        }
        if (eVar.d()) {
            return l(webView).e();
        }
        throw C6771hK2.a();
    }

    public static WebViewClient p(WebView webView) {
        AbstractC3408Ka.e eVar = C6771hK2.H;
        if (eVar.c()) {
            return C4287Ta.d(webView);
        }
        if (eVar.d()) {
            return l(webView).f();
        }
        throw C6771hK2.a();
    }

    public static AbstractC8245nK2 q(WebView webView) {
        AbstractC3408Ka.h hVar = C6771hK2.J;
        if (hVar.c()) {
            WebViewRenderProcess b2 = C10255vb.b(webView);
            if (b2 != null) {
                return C9467sK2.b(b2);
            }
            return null;
        } else if (hVar.d()) {
            return l(webView).g();
        } else {
            throw C6771hK2.a();
        }
    }

    public static AbstractC8489oK2 r(WebView webView) {
        AbstractC3408Ka.h hVar = C6771hK2.O;
        if (hVar.c()) {
            WebViewRenderProcessClient c = C10255vb.c(webView);
            if (c != null && (c instanceof C8975qK2)) {
                return ((C8975qK2) c).a();
            }
            return null;
        } else if (hVar.d()) {
            return l(webView).h();
        } else {
            throw C6771hK2.a();
        }
    }

    public static boolean s(WebView webView) {
        if (C6771hK2.f0.d()) {
            return l(webView).j();
        }
        throw C6771hK2.a();
    }

    public static boolean t() {
        if (C6771hK2.R.d()) {
            return h().getStatics().isMultiProcessEnabled();
        }
        throw C6771hK2.a();
    }

    public static void u(WebView webView, long j, a aVar) {
        AbstractC3408Ka.b bVar = C6771hK2.a;
        if (bVar.c()) {
            C3603Ma.i(webView, j, aVar);
        } else if (bVar.d()) {
            c(webView);
            l(webView).i(j, aVar);
        } else {
            throw C6771hK2.a();
        }
    }

    public static void v(WebView webView, PJ2 pj2, Uri uri) {
        if (a.equals(uri)) {
            uri = b;
        }
        AbstractC3408Ka.b bVar = C6771hK2.F;
        if (bVar.c() && pj2.e() == 0) {
            C3603Ma.j(webView, TJ2.g(pj2), uri);
        } else if (bVar.d() && NJ2.a(pj2.e())) {
            l(webView).k(pj2, uri);
        } else {
            throw C6771hK2.a();
        }
    }

    public static void w(WebView webView, String str) {
        if (C6771hK2.U.d()) {
            l(webView).l(str);
            return;
        }
        throw C6771hK2.a();
    }

    public static void x(WebView webView, boolean z) {
        if (C6771hK2.f0.d()) {
            l(webView).m(z);
            return;
        }
        throw C6771hK2.a();
    }

    public static void y(WebView webView, String str) {
        if (C6771hK2.c0.d()) {
            l(webView).n(str);
            return;
        }
        throw C6771hK2.a();
    }

    public static void z(Set<String> set, ValueCallback<Boolean> valueCallback) {
        AbstractC3408Ka.f fVar = C6771hK2.i;
        AbstractC3408Ka.f fVar2 = C6771hK2.h;
        if (fVar.d()) {
            h().getStatics().setSafeBrowsingAllowlist(set, valueCallback);
            return;
        }
        ArrayList arrayList = new ArrayList(set);
        if (fVar2.c()) {
            C5119ab.d(arrayList, valueCallback);
        } else if (fVar2.d()) {
            h().getStatics().setSafeBrowsingWhitelist(arrayList, valueCallback);
        } else {
            throw C6771hK2.a();
        }
    }
}
