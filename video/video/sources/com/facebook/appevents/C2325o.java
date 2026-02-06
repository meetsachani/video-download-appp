package com.facebook.appevents;

import o.C5370bd;
import o.C6562gT0;
import o.InterfaceC9511sW0;
import o.SQ;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.facebook.appevents.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2325o {
    @NotNull
    public static final C2325o a = new C2325o();
    public static final String b = C2325o.class.getName();

    @InterfaceC9511sW0
    public static final synchronized void a(@NotNull C2311a c2311a, @NotNull M m) {
        synchronized (C2325o.class) {
            if (SQ.e(C2325o.class)) {
                return;
            }
            C6562gT0.p(c2311a, "accessTokenAppIdPair");
            C6562gT0.p(m, "appEvents");
            C5370bd c5370bd = C5370bd.a;
            C5370bd.b();
            C2317g c2317g = C2317g.a;
            L a2 = C2317g.a();
            a2.a(c2311a, m.e());
            C2317g.b(a2);
        }
    }

    @InterfaceC9511sW0
    public static final synchronized void b(@NotNull C2316f c2316f) {
        synchronized (C2325o.class) {
            if (SQ.e(C2325o.class)) {
                return;
            }
            C6562gT0.p(c2316f, "eventsToPersist");
            C5370bd c5370bd = C5370bd.a;
            C5370bd.b();
            C2317g c2317g = C2317g.a;
            L a2 = C2317g.a();
            for (C2311a c2311a : c2316f.f()) {
                M c = c2316f.c(c2311a);
                if (c != null) {
                    a2.a(c2311a, c.e());
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            C2317g c2317g2 = C2317g.a;
            C2317g.b(a2);
        }
    }
}
