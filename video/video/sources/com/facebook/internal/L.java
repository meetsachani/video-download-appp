package com.facebook.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.C2416z;
import com.facebook.internal.M;
import com.facebook.internal.t0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import o.C6562gT0;
import o.C7458kA2;
import o.C9516sY;
import o.InterfaceC5056aJ2;
import o.InterfaceC9511sW0;
import o.SQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class L {
    public static final int b = 8;
    public static final int c = 2;
    @Nullable
    public static Handler d;
    @NotNull
    public static final L a = new L();
    @NotNull
    public static final t0 e = new t0(8, null, 2, null);
    @NotNull
    public static final t0 f = new t0(2, null, 2, null);
    @NotNull
    public static final Map<d, c> g = new HashMap();

    /* loaded from: classes2.dex */
    public static final class a implements Runnable {
        @NotNull
        public final d X;
        public final boolean Y;

        public a(@NotNull d dVar, boolean z) {
            C6562gT0.p(dVar, "key");
            this.X = dVar;
            this.Y = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!SQ.e(this)) {
                try {
                    if (!SQ.e(this) && !SQ.e(this)) {
                        L.a.p(this.X, this.Y);
                    }
                } catch (Throwable th) {
                    SQ.c(th, this);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Runnable {
        @NotNull
        public final d X;

        public b(@NotNull d dVar) {
            C6562gT0.p(dVar, "key");
            this.X = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!SQ.e(this)) {
                try {
                    if (!SQ.e(this) && !SQ.e(this)) {
                        L.a.f(this.X);
                    }
                } catch (Throwable th) {
                    SQ.c(th, this);
                }
            }
        }
    }

    @InterfaceC5056aJ2(otherwise = 2)
    /* loaded from: classes2.dex */
    public static final class c {
        @NotNull
        public M a;
        @Nullable
        public t0.b b;
        public boolean c;

        public c(@NotNull M m) {
            C6562gT0.p(m, "request");
            this.a = m;
        }

        @NotNull
        public final M a() {
            return this.a;
        }

        @Nullable
        public final t0.b b() {
            return this.b;
        }

        public final boolean c() {
            return this.c;
        }

        public final void d(boolean z) {
            this.c = z;
        }

        public final void e(@NotNull M m) {
            C6562gT0.p(m, "<set-?>");
            this.a = m;
        }

        public final void f(@Nullable t0.b bVar) {
            this.b = bVar;
        }
    }

    @InterfaceC5056aJ2(otherwise = 2)
    /* loaded from: classes2.dex */
    public static final class d {
        @NotNull
        public static final a c = new a(null);
        public static final int d = 29;
        public static final int e = 37;
        @NotNull
        public Uri a;
        @NotNull
        public Object b;

        /* loaded from: classes2.dex */
        public static final class a {
            public /* synthetic */ a(C9516sY c9516sY) {
                this();
            }

            public a() {
            }
        }

        public d(@NotNull Uri uri, @NotNull Object obj) {
            C6562gT0.p(uri, "uri");
            C6562gT0.p(obj, "tag");
            this.a = uri;
            this.b = obj;
        }

        @NotNull
        public final Object a() {
            return this.b;
        }

        @NotNull
        public final Uri b() {
            return this.a;
        }

        public final void c(@NotNull Object obj) {
            C6562gT0.p(obj, "<set-?>");
            this.b = obj;
        }

        public final void d(@NotNull Uri uri) {
            C6562gT0.p(uri, "<set-?>");
            this.a = uri;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj != null && (obj instanceof d)) {
                d dVar = (d) obj;
                if (dVar.a == this.a && dVar.b == this.b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((1073 + this.a.hashCode()) * 37) + this.b.hashCode();
        }
    }

    @InterfaceC9511sW0
    public static final boolean d(@NotNull M m) {
        boolean z;
        C6562gT0.p(m, "request");
        d dVar = new d(m.e(), m.c());
        Map<d, c> map = g;
        synchronized (map) {
            try {
                c cVar = map.get(dVar);
                if (cVar != null) {
                    t0.b b2 = cVar.b();
                    z = true;
                    if (b2 != null && b2.cancel()) {
                        map.remove(dVar);
                    } else {
                        cVar.d(true);
                    }
                } else {
                    z = false;
                }
                C7458kA2 c7458kA2 = C7458kA2.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @InterfaceC9511sW0
    public static final void e() {
        O o2 = O.a;
        O.a();
        e0 e0Var = e0.a;
        e0.b();
    }

    @InterfaceC9511sW0
    public static final void g(@Nullable M m) {
        if (m == null) {
            return;
        }
        d dVar = new d(m.e(), m.c());
        Map<d, c> map = g;
        synchronized (map) {
            try {
                c cVar = map.get(dVar);
                if (cVar != null) {
                    cVar.e(m);
                    cVar.d(false);
                    t0.b b2 = cVar.b();
                    if (b2 != null) {
                        b2.a();
                        C7458kA2 c7458kA2 = C7458kA2.a;
                    }
                } else {
                    a.h(m, dVar, m.h());
                    C7458kA2 c7458kA22 = C7458kA2.a;
                }
            } finally {
            }
        }
    }

    public static final void n(M m, Exception exc, boolean z, Bitmap bitmap, M.b bVar) {
        C6562gT0.p(m, "$request");
        bVar.a(new N(m, exc, z, bitmap));
    }

    @InterfaceC9511sW0
    public static final void o(@NotNull M m) {
        t0.b b2;
        C6562gT0.p(m, "request");
        d dVar = new d(m.e(), m.c());
        Map<d, c> map = g;
        synchronized (map) {
            try {
                c cVar = map.get(dVar);
                if (cVar != null && (b2 = cVar.b()) != null) {
                    b2.a();
                }
                C7458kA2 c7458kA2 = C7458kA2.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v6, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(d dVar) {
        HttpURLConnection httpURLConnection;
        Closeable closeable;
        C2416z c2416z;
        URLConnection openConnection;
        ?? responseCode;
        InputStream e2;
        Bitmap decodeStream;
        C2416z c2416z2;
        Closeable closeable2 = null;
        InputStream inputStream = null;
        closeable2 = null;
        Bitmap bitmap = null;
        boolean z = true;
        try {
            openConnection = new URL(dVar.b().toString()).openConnection();
        } catch (IOException e3) {
            e = e3;
            httpURLConnection = null;
            closeable = null;
        } catch (Throwable th) {
            th = th;
            httpURLConnection = null;
        }
        if (openConnection != null) {
            httpURLConnection = (HttpURLConnection) openConnection;
            try {
                try {
                    httpURLConnection.setInstanceFollowRedirects(false);
                    responseCode = httpURLConnection.getResponseCode();
                    try {
                    } catch (IOException e4) {
                        e = e4;
                        closeable = responseCode;
                        l0 l0Var = l0.a;
                        l0.j(closeable);
                        l0.r(httpURLConnection);
                        c2416z = e;
                        if (!z) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        closeable2 = responseCode;
                        l0 l0Var2 = l0.a;
                        l0.j(closeable2);
                        l0.r(httpURLConnection);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e5) {
                e = e5;
            }
            if (responseCode != 200) {
                if (responseCode != 301 && responseCode != 302) {
                    e2 = httpURLConnection.getErrorStream();
                    StringBuilder sb = new StringBuilder();
                    if (e2 != null) {
                        InputStreamReader inputStreamReader = new InputStreamReader(e2);
                        char[] cArr = new char[128];
                        while (true) {
                            int read = inputStreamReader.read(cArr, 0, 128);
                            if (read <= 0) {
                                break;
                            }
                            sb.append(cArr, 0, read);
                        }
                        l0 l0Var3 = l0.a;
                        l0.j(inputStreamReader);
                    } else {
                        sb.append("Unexpected error while downloading an image.");
                    }
                    c2416z2 = new C2416z(sb.toString());
                    decodeStream = null;
                } else {
                    try {
                        String headerField = httpURLConnection.getHeaderField(FirebaseAnalytics.Param.s);
                        l0 l0Var4 = l0.a;
                        if (!l0.f0(headerField)) {
                            Uri parse = Uri.parse(headerField);
                            e0 e0Var = e0.a;
                            e0.a(dVar.b(), parse);
                            c q = q(dVar);
                            if (q != null && !q.c()) {
                                M a2 = q.a();
                                C6562gT0.o(parse, "redirectUri");
                                h(a2, new d(parse, dVar.a()), false);
                            }
                        }
                        z = false;
                        decodeStream = null;
                        c2416z2 = null;
                        l0 l0Var5 = l0.a;
                        l0.j(inputStream);
                        l0.r(httpURLConnection);
                        bitmap = decodeStream;
                        c2416z = c2416z2;
                    } catch (IOException e6) {
                        e = e6;
                        z = false;
                        closeable = null;
                        l0 l0Var6 = l0.a;
                        l0.j(closeable);
                        l0.r(httpURLConnection);
                        c2416z = e;
                        if (!z) {
                        }
                    }
                    if (!z) {
                        m(dVar, c2416z, bitmap, false);
                        return;
                    }
                    return;
                }
            } else {
                O o2 = O.a;
                e2 = O.e(httpURLConnection);
                decodeStream = BitmapFactory.decodeStream(e2);
                c2416z2 = null;
            }
            inputStream = e2;
            l0 l0Var52 = l0.a;
            l0.j(inputStream);
            l0.r(httpURLConnection);
            bitmap = decodeStream;
            c2416z = c2416z2;
            if (!z) {
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
    }

    public final void h(M m, d dVar, boolean z) {
        j(m, dVar, f, new a(dVar, z));
    }

    public final void i(M m, d dVar) {
        j(m, dVar, e, new b(dVar));
    }

    public final void j(M m, d dVar, t0 t0Var, Runnable runnable) {
        Map<d, c> map = g;
        synchronized (map) {
            c cVar = new c(m);
            map.put(dVar, cVar);
            cVar.f(t0.g(t0Var, runnable, false, 2, null));
            C7458kA2 c7458kA2 = C7458kA2.a;
        }
    }

    public final synchronized Handler k() {
        try {
            if (d == null) {
                d = new Handler(Looper.getMainLooper());
            }
        } catch (Throwable th) {
            throw th;
        }
        return d;
    }

    @InterfaceC5056aJ2(otherwise = 2)
    @NotNull
    public final Map<d, c> l() {
        return g;
    }

    public final void m(d dVar, final Exception exc, final Bitmap bitmap, final boolean z) {
        M.b b2;
        Handler k;
        c q = q(dVar);
        if (q != null && !q.c()) {
            final M a2 = q.a();
            if (a2 == null) {
                b2 = null;
            } else {
                b2 = a2.b();
            }
            final M.b bVar = b2;
            if (bVar != null && (k = k()) != null) {
                k.post(new Runnable() { // from class: com.facebook.internal.K
                    @Override // java.lang.Runnable
                    public final void run() {
                        L.n(M.this, exc, z, bitmap, bVar);
                    }
                });
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(d dVar, boolean z) {
        InputStream inputStream;
        M m = null;
        boolean z2 = false;
        if (z) {
            e0 e0Var = e0.a;
            Uri d2 = e0.d(dVar.b());
            if (d2 != null) {
                O o2 = O.a;
                inputStream = O.c(d2);
                if (inputStream != null) {
                    z2 = true;
                }
                if (!z2) {
                    O o3 = O.a;
                    inputStream = O.c(dVar.b());
                }
                if (inputStream == null) {
                    Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                    l0 l0Var = l0.a;
                    l0.j(inputStream);
                    m(dVar, null, decodeStream, z2);
                    return;
                }
                c q = q(dVar);
                if (q != null) {
                    m = q.a();
                }
                if (q != null && !q.c() && m != null) {
                    i(m, dVar);
                    return;
                }
                return;
            }
        }
        inputStream = null;
        if (!z2) {
        }
        if (inputStream == null) {
        }
    }

    public final c q(d dVar) {
        c remove;
        Map<d, c> map = g;
        synchronized (map) {
            remove = map.remove(dVar);
        }
        return remove;
    }
}
