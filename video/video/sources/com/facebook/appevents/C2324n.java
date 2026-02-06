package com.facebook.appevents;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.S;
import com.facebook.Y;
import com.facebook.appevents.C2327q;
import com.facebook.b0;
import com.facebook.internal.C2379y;
import com.facebook.internal.V;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o.C5855dd;
import o.C6200f21;
import o.C6562gT0;
import o.C6595gd;
import o.C8319ne2;
import o.InterfaceC5056aJ2;
import o.InterfaceC9511sW0;
import o.SQ;
import o.SQ0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.facebook.appevents.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2324n {
    public static final int d = 15;
    public static final int e = -1;
    @Nullable
    public static ScheduledFuture<?> h;
    @NotNull
    public static final C2324n a = new C2324n();
    public static final String b = C2324n.class.getName();
    public static final int c = 100;
    @NotNull
    public static volatile C2316f f = new C2316f();
    public static final ScheduledExecutorService g = Executors.newSingleThreadScheduledExecutor();
    @NotNull
    public static final Runnable i = new Runnable() { // from class: com.facebook.appevents.j
        @Override // java.lang.Runnable
        public final void run() {
            C2324n.o();
        }
    };

    @InterfaceC9511sW0
    public static final void g(@NotNull final C2311a c2311a, @NotNull final C2315e c2315e) {
        if (SQ.e(C2324n.class)) {
            return;
        }
        try {
            C6562gT0.p(c2311a, "accessTokenAppId");
            C6562gT0.p(c2315e, "appEvent");
            g.execute(new Runnable() { // from class: com.facebook.appevents.k
                @Override // java.lang.Runnable
                public final void run() {
                    C2324n.h(C2311a.this, c2315e);
                }
            });
        } catch (Throwable th) {
            SQ.c(th, C2324n.class);
        }
    }

    public static final void h(C2311a c2311a, C2315e c2315e) {
        if (!SQ.e(C2324n.class)) {
            try {
                C6562gT0.p(c2311a, "$accessTokenAppId");
                C6562gT0.p(c2315e, "$appEvent");
                f.a(c2311a, c2315e);
                if (C2327q.b.g() != C2327q.b.EXPLICIT_ONLY && f.d() > c) {
                    n(H.EVENT_THRESHOLD);
                } else if (h == null) {
                    h = g.schedule(i, 15L, TimeUnit.SECONDS);
                }
            } catch (Throwable th) {
                SQ.c(th, C2324n.class);
            }
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final S i(@NotNull final C2311a c2311a, @NotNull final M m, boolean z, @NotNull final J j) {
        if (SQ.e(C2324n.class)) {
            return null;
        }
        try {
            C6562gT0.p(c2311a, "accessTokenAppId");
            C6562gT0.p(m, "appEvents");
            C6562gT0.p(j, "flushState");
            String b2 = c2311a.b();
            com.facebook.internal.C c2 = com.facebook.internal.C.a;
            boolean z2 = false;
            C2379y q = com.facebook.internal.C.q(b2, false);
            S.c cVar = S.n;
            C8319ne2 c8319ne2 = C8319ne2.a;
            String format = String.format("%s/activities", Arrays.copyOf(new Object[]{b2}, 1));
            C6562gT0.o(format, "java.lang.String.format(format, *args)");
            final S N = cVar.N(null, format, null, null);
            N.n0(true);
            Bundle K = N.K();
            if (K == null) {
                K = new Bundle();
            }
            K.putString("access_token", c2311a.a());
            String g2 = K.b.g();
            if (g2 != null) {
                K.putString("device_token", g2);
            }
            String m2 = t.c.m();
            if (m2 != null) {
                K.putString(ReferrerDetails.b, m2);
            }
            N.r0(K);
            if (q != null) {
                z2 = q.z();
            }
            com.facebook.M m3 = com.facebook.M.a;
            int f2 = m.f(N, com.facebook.M.n(), z2, z);
            if (f2 == 0) {
                return null;
            }
            j.c(j.a() + f2);
            N.l0(new S.b() { // from class: com.facebook.appevents.m
                @Override // com.facebook.S.b
                public final void a(Y y) {
                    C2324n.j(C2311a.this, N, m, j, y);
                }
            });
            return N;
        } catch (Throwable th) {
            SQ.c(th, C2324n.class);
            return null;
        }
    }

    public static final void j(C2311a c2311a, S s, M m, J j, Y y) {
        if (SQ.e(C2324n.class)) {
            return;
        }
        try {
            C6562gT0.p(c2311a, "$accessTokenAppId");
            C6562gT0.p(s, "$postRequest");
            C6562gT0.p(m, "$appEvents");
            C6562gT0.p(j, "$flushState");
            C6562gT0.p(y, "response");
            q(c2311a, s, y, m, j);
        } catch (Throwable th) {
            SQ.c(th, C2324n.class);
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final List<S> k(@NotNull C2316f c2316f, @NotNull J j) {
        if (SQ.e(C2324n.class)) {
            return null;
        }
        try {
            C6562gT0.p(c2316f, "appEventCollection");
            C6562gT0.p(j, "flushResults");
            com.facebook.M m = com.facebook.M.a;
            boolean E = com.facebook.M.E(com.facebook.M.n());
            ArrayList arrayList = new ArrayList();
            for (C2311a c2311a : c2316f.f()) {
                M c2 = c2316f.c(c2311a);
                if (c2 != null) {
                    S i2 = i(c2311a, c2, E, j);
                    if (i2 != null) {
                        arrayList.add(i2);
                        if (C5855dd.a.f()) {
                            C6595gd c6595gd = C6595gd.a;
                            C6595gd.q(i2);
                        }
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            return arrayList;
        } catch (Throwable th) {
            SQ.c(th, C2324n.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    public static final void l(@NotNull final H h2) {
        if (SQ.e(C2324n.class)) {
            return;
        }
        try {
            C6562gT0.p(h2, SQ0.n);
            g.execute(new Runnable() { // from class: com.facebook.appevents.h
                @Override // java.lang.Runnable
                public final void run() {
                    C2324n.m(H.this);
                }
            });
        } catch (Throwable th) {
            SQ.c(th, C2324n.class);
        }
    }

    public static final void m(H h2) {
        if (SQ.e(C2324n.class)) {
            return;
        }
        try {
            C6562gT0.p(h2, "$reason");
            n(h2);
        } catch (Throwable th) {
            SQ.c(th, C2324n.class);
        }
    }

    @InterfaceC9511sW0
    public static final void n(@NotNull H h2) {
        if (!SQ.e(C2324n.class)) {
            try {
                C6562gT0.p(h2, SQ0.n);
                C2317g c2317g = C2317g.a;
                f.b(C2317g.a());
                try {
                    J u = u(h2, f);
                    if (u != null) {
                        Intent intent = new Intent(C2327q.d);
                        intent.putExtra(C2327q.e, u.a());
                        intent.putExtra(C2327q.f, u.b());
                        com.facebook.M m = com.facebook.M.a;
                        C6200f21.b(com.facebook.M.n()).d(intent);
                    }
                } catch (Exception e2) {
                    Log.w(b, "Caught unexpected exception while flushing app events: ", e2);
                }
            } catch (Throwable th) {
                SQ.c(th, C2324n.class);
            }
        }
    }

    public static final void o() {
        if (!SQ.e(C2324n.class)) {
            try {
                h = null;
                if (C2327q.b.g() != C2327q.b.EXPLICIT_ONLY) {
                    n(H.TIMER);
                }
            } catch (Throwable th) {
                SQ.c(th, C2324n.class);
            }
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Set<C2311a> p() {
        if (SQ.e(C2324n.class)) {
            return null;
        }
        try {
            return f.f();
        } catch (Throwable th) {
            SQ.c(th, C2324n.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    public static final void q(@NotNull final C2311a c2311a, @NotNull S s, @NotNull Y y, @NotNull final M m, @NotNull J j) {
        boolean z;
        String str;
        if (!SQ.e(C2324n.class)) {
            try {
                C6562gT0.p(c2311a, "accessTokenAppId");
                C6562gT0.p(s, "request");
                C6562gT0.p(y, "response");
                C6562gT0.p(m, "appEvents");
                C6562gT0.p(j, "flushState");
                com.facebook.C g2 = y.g();
                String str2 = "Success";
                I i2 = I.SUCCESS;
                if (g2 != null) {
                    if (g2.g() == -1) {
                        str2 = "Failed: No Connectivity";
                        i2 = I.NO_CONNECTIVITY;
                    } else {
                        C8319ne2 c8319ne2 = C8319ne2.a;
                        str2 = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{y.toString(), g2.toString()}, 2));
                        C6562gT0.o(str2, "java.lang.String.format(format, *args)");
                        i2 = I.SERVER_ERROR;
                    }
                }
                com.facebook.M m2 = com.facebook.M.a;
                if (com.facebook.M.P(b0.APP_EVENTS)) {
                    try {
                        str = new JSONArray((String) s.M()).toString(2);
                        C6562gT0.o(str, "{\n            val jsonArray = JSONArray(eventsJsonString)\n            jsonArray.toString(2)\n          }");
                    } catch (JSONException unused) {
                        str = "<Can't encode events for debug logging>";
                    }
                    V.a aVar = V.e;
                    b0 b0Var = b0.APP_EVENTS;
                    String str3 = b;
                    C6562gT0.o(str3, "TAG");
                    aVar.e(b0Var, str3, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(s.G()), str2, str);
                }
                if (g2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                m.c(z);
                I i3 = I.NO_CONNECTIVITY;
                if (i2 == i3) {
                    com.facebook.M m3 = com.facebook.M.a;
                    com.facebook.M.y().execute(new Runnable() { // from class: com.facebook.appevents.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2324n.r(C2311a.this, m);
                        }
                    });
                }
                if (i2 != I.SUCCESS && j.b() != i3) {
                    j.d(i2);
                }
            } catch (Throwable th) {
                SQ.c(th, C2324n.class);
            }
        }
    }

    public static final void r(C2311a c2311a, M m) {
        if (SQ.e(C2324n.class)) {
            return;
        }
        try {
            C6562gT0.p(c2311a, "$accessTokenAppId");
            C6562gT0.p(m, "$appEvents");
            C2325o c2325o = C2325o.a;
            C2325o.a(c2311a, m);
        } catch (Throwable th) {
            SQ.c(th, C2324n.class);
        }
    }

    @InterfaceC9511sW0
    public static final void s() {
        if (SQ.e(C2324n.class)) {
            return;
        }
        try {
            g.execute(new Runnable() { // from class: com.facebook.appevents.i
                @Override // java.lang.Runnable
                public final void run() {
                    C2324n.t();
                }
            });
        } catch (Throwable th) {
            SQ.c(th, C2324n.class);
        }
    }

    public static final void t() {
        if (SQ.e(C2324n.class)) {
            return;
        }
        try {
            C2325o c2325o = C2325o.a;
            C2325o.b(f);
            f = new C2316f();
        } catch (Throwable th) {
            SQ.c(th, C2324n.class);
        }
    }

    @InterfaceC9511sW0
    @InterfaceC5056aJ2(otherwise = 2)
    @Nullable
    public static final J u(@NotNull H h2, @NotNull C2316f c2316f) {
        if (SQ.e(C2324n.class)) {
            return null;
        }
        try {
            C6562gT0.p(h2, SQ0.n);
            C6562gT0.p(c2316f, "appEventCollection");
            J j = new J();
            List<S> k = k(c2316f, j);
            if (k.isEmpty()) {
                return null;
            }
            V.a aVar = V.e;
            b0 b0Var = b0.APP_EVENTS;
            String str = b;
            C6562gT0.o(str, "TAG");
            aVar.e(b0Var, str, "Flushing %d events due to %s.", Integer.valueOf(j.a()), h2.toString());
            for (S s : k) {
                s.l();
            }
            return j;
        } catch (Throwable th) {
            SQ.c(th, C2324n.class);
            return null;
        }
    }
}
