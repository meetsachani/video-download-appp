package o;

import android.webkit.WebSettings;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Set;
import o.AbstractC3408Ka;

/* loaded from: classes.dex */
public class ZJ2 {
    @Deprecated
    public static final int a = 0;
    @Deprecated
    public static final int b = 1;
    @Deprecated
    public static final int c = 2;
    @Deprecated
    public static final int d = 0;
    @Deprecated
    public static final int e = 1;
    @Deprecated
    public static final int f = 2;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    public static YJ2 a(WebSettings webSettings) {
        return C7014iK2.c().f(webSettings);
    }

    public static int b(WebSettings webSettings) {
        if (C6771hK2.d0.d()) {
            return a(webSettings).a();
        }
        throw C6771hK2.a();
    }

    public static int c(WebSettings webSettings) {
        AbstractC3408Ka.c cVar = C6771hK2.d;
        if (cVar.c()) {
            return C3701Na.f(webSettings);
        }
        if (cVar.d()) {
            return a(webSettings).b();
        }
        throw C6771hK2.a();
    }

    public static boolean d(WebSettings webSettings) {
        if (C6771hK2.Y.d()) {
            return a(webSettings).c();
        }
        throw C6771hK2.a();
    }

    @Deprecated
    public static int e(WebSettings webSettings) {
        AbstractC3408Ka.h hVar = C6771hK2.S;
        if (hVar.c()) {
            return C10255vb.a(webSettings);
        }
        if (hVar.d()) {
            return a(webSettings).d();
        }
        throw C6771hK2.a();
    }

    @Deprecated
    public static int f(WebSettings webSettings) {
        if (C6771hK2.T.d()) {
            return a(webSettings).d();
        }
        throw C6771hK2.a();
    }

    public static boolean g(WebSettings webSettings) {
        AbstractC3408Ka.b bVar = C6771hK2.b;
        if (bVar.c()) {
            return C3603Ma.g(webSettings);
        }
        if (bVar.d()) {
            return a(webSettings).f();
        }
        throw C6771hK2.a();
    }

    public static Set<String> h(WebSettings webSettings) {
        if (C6771hK2.a0.d()) {
            return a(webSettings).g();
        }
        throw C6771hK2.a();
    }

    public static boolean i(WebSettings webSettings) {
        AbstractC3408Ka.e eVar = C6771hK2.c;
        if (eVar.c()) {
            return C4287Ta.b(webSettings);
        }
        if (eVar.d()) {
            return a(webSettings).h();
        }
        throw C6771hK2.a();
    }

    public static C8704pD2 j(WebSettings webSettings) {
        if (C6771hK2.b0.d()) {
            return a(webSettings).i();
        }
        throw C6771hK2.a();
    }

    public static C7255jK2 k(WebSettings webSettings) {
        if (C6771hK2.e0.d()) {
            return a(webSettings).j();
        }
        throw C6771hK2.a();
    }

    public static boolean l(WebSettings webSettings) {
        if (C6771hK2.P.d()) {
            return a(webSettings).k();
        }
        throw C6771hK2.a();
    }

    public static void m(WebSettings webSettings, boolean z) {
        if (C6771hK2.P.d()) {
            a(webSettings).l(z);
            return;
        }
        throw C6771hK2.a();
    }

    public static void n(WebSettings webSettings, int i2) {
        if (C6771hK2.d0.d()) {
            a(webSettings).m(i2);
            return;
        }
        throw C6771hK2.a();
    }

    public static void o(WebSettings webSettings, int i2) {
        AbstractC3408Ka.c cVar = C6771hK2.d;
        if (cVar.c()) {
            C3701Na.o(webSettings, i2);
        } else if (cVar.d()) {
            a(webSettings).n(i2);
        } else {
            throw C6771hK2.a();
        }
    }

    public static void p(WebSettings webSettings, boolean z) {
        if (C6771hK2.Y.d()) {
            a(webSettings).o(z);
            return;
        }
        throw C6771hK2.a();
    }

    @Deprecated
    public static void q(WebSettings webSettings, int i2) {
        AbstractC3408Ka.h hVar = C6771hK2.S;
        if (hVar.c()) {
            C10255vb.d(webSettings, i2);
        } else if (hVar.d()) {
            a(webSettings).p(i2);
        } else {
            throw C6771hK2.a();
        }
    }

    @Deprecated
    public static void r(WebSettings webSettings, int i2) {
        if (C6771hK2.T.d()) {
            a(webSettings).q(i2);
            return;
        }
        throw C6771hK2.a();
    }

    public static void s(WebSettings webSettings, boolean z) {
        AbstractC3408Ka.b bVar = C6771hK2.b;
        if (bVar.c()) {
            C3603Ma.k(webSettings, z);
        } else if (bVar.d()) {
            a(webSettings).r(z);
        } else {
            throw C6771hK2.a();
        }
    }

    public static void t(WebSettings webSettings, Set<String> set) {
        if (C6771hK2.a0.d()) {
            a(webSettings).s(set);
            return;
        }
        throw C6771hK2.a();
    }

    public static void u(WebSettings webSettings, boolean z) {
        AbstractC3408Ka.e eVar = C6771hK2.c;
        if (eVar.c()) {
            C4287Ta.e(webSettings, z);
        } else if (eVar.d()) {
            a(webSettings).t(z);
        } else {
            throw C6771hK2.a();
        }
    }

    public static void v(WebSettings webSettings, C8704pD2 c8704pD2) {
        if (C6771hK2.b0.d()) {
            a(webSettings).u(c8704pD2);
            return;
        }
        throw C6771hK2.a();
    }

    public static void w(WebSettings webSettings, C7255jK2 c7255jK2) {
        if (C6771hK2.e0.d()) {
            a(webSettings).v(c7255jK2);
            return;
        }
        throw C6771hK2.a();
    }
}
