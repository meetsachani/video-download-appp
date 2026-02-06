package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.exoplayer2.source.rtsp.d;
import com.google.android.exoplayer2.source.rtsp.e;
import com.google.android.exoplayer2.source.rtsp.f;
import com.google.android.exoplayer2.source.rtsp.g;
import com.google.android.exoplayer2.source.rtsp.h;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.SocketFactory;
import o.AbstractC5317bO0;
import o.AbstractC6044eO0;
import o.C10323vs;
import o.C3989Py1;
import o.C4500Ve2;
import o.C5098aU0;
import o.C5105aW1;
import o.C5559cO0;
import o.C5833dW1;
import o.C6075eW1;
import o.C6108ef2;
import o.C6318fW1;
import o.C6573gW1;
import o.C6816hW1;
import o.C6848hf1;
import o.C7059iW1;
import o.C7782lV0;
import o.C9542sf;
import o.I31;
import o.InterfaceC11300zs1;
import o.OV1;
import o.TD2;
import o.V12;
import o.W12;
import o.WV1;

@Deprecated
/* loaded from: classes2.dex */
public final class d implements Closeable {
    public static final int o1 = -1;
    public static final int p1 = 0;
    public static final int q1 = 1;
    public static final int r1 = 2;
    public static final String s1 = "RtspClient";
    public static final long t1 = 30000;
    public final g X;
    public final e Y;
    public final SocketFactory Y0;
    public final String Z;
    public final boolean Z0;
    public Uri d1;
    @InterfaceC11300zs1
    public h.a f1;
    @InterfaceC11300zs1
    public String g1;
    @InterfaceC11300zs1
    public b h1;
    @InterfaceC11300zs1
    public com.google.android.exoplayer2.source.rtsp.c i1;
    public boolean k1;
    public boolean l1;
    public boolean m1;
    public final ArrayDeque<f.d> a1 = new ArrayDeque<>();
    public final SparseArray<C6318fW1> b1 = new SparseArray<>();
    public final C0096d c1 = new C0096d();
    public com.google.android.exoplayer2.source.rtsp.g e1 = new com.google.android.exoplayer2.source.rtsp.g(new c());
    public long n1 = C10323vs.b;
    public int j1 = -1;

    /* loaded from: classes2.dex */
    public final class b implements Runnable, Closeable {
        public final Handler X = TD2.C();
        public final long Y;
        public boolean Z;

        public b(long j) {
            this.Y = j;
        }

        public void a() {
            if (this.Z) {
                return;
            }
            this.Z = true;
            this.X.postDelayed(this, this.Y);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.Z = false;
            this.X.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.c1.e(d.this.d1, d.this.g1);
            this.X.postDelayed(this, this.Y);
        }
    }

    /* loaded from: classes2.dex */
    public final class c implements g.d {
        public final Handler a = TD2.C();

        public c() {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.g.d
        public void c(final List<String> list) {
            this.a.post(new Runnable() { // from class: o.VV1
                @Override // java.lang.Runnable
                public final void run() {
                    d.c.this.e(list);
                }
            });
        }

        public final void e(List<String> list) {
            d.this.S(list);
            if (h.e(list)) {
                g(list);
            } else {
                f(list);
            }
        }

        public final void f(List<String> list) {
            d.this.c1.d(Integer.parseInt((String) C9542sf.g(h.k(list).c.e(com.google.android.exoplayer2.source.rtsp.e.f163o))));
        }

        public final void g(List<String> list) {
            C6816hW1 d;
            AbstractC5317bO0<C7059iW1> L;
            Throwable cVar;
            C6573gW1 l = h.l(list);
            int parseInt = Integer.parseInt((String) C9542sf.g(l.b.e(com.google.android.exoplayer2.source.rtsp.e.f163o)));
            C6318fW1 c6318fW1 = (C6318fW1) d.this.b1.get(parseInt);
            if (c6318fW1 != null) {
                d.this.b1.remove(parseInt);
                int i = c6318fW1.b;
                try {
                    try {
                        int i2 = l.a;
                        if (i2 != 200) {
                            if (i2 != 401) {
                                if (i2 != 461) {
                                    if (i2 != 301 && i2 != 302) {
                                        d.this.P(new RtspMediaSource.c(h.t(i) + C4500Ve2.b + l.a));
                                        return;
                                    }
                                    if (d.this.j1 != -1) {
                                        d.this.j1 = 0;
                                    }
                                    String e = l.b.e("Location");
                                    if (e == null) {
                                        d.this.X.c("Redirection without new location.", null);
                                        return;
                                    }
                                    Uri parse = Uri.parse(e);
                                    d.this.d1 = h.p(parse);
                                    d.this.f1 = h.n(parse);
                                    d.this.c1.c(d.this.d1, d.this.g1);
                                    return;
                                }
                                String str = h.t(i) + C4500Ve2.b + l.a;
                                String str2 = (String) C9542sf.g(c6318fW1.c.e(com.google.android.exoplayer2.source.rtsp.e.D));
                                d dVar = d.this;
                                if (i == 10 && !str2.contains("TCP")) {
                                    cVar = new RtspMediaSource.d(str);
                                } else {
                                    cVar = new RtspMediaSource.c(str);
                                }
                                dVar.P(cVar);
                                return;
                            } else if (d.this.f1 == null || d.this.l1) {
                                d.this.P(new RtspMediaSource.c(h.t(i) + C4500Ve2.b + l.a));
                                return;
                            } else {
                                AbstractC5317bO0<String> f = l.b.f("WWW-Authenticate");
                                if (!f.isEmpty()) {
                                    for (int i3 = 0; i3 < f.size(); i3++) {
                                        d.this.i1 = h.o(f.get(i3));
                                        if (d.this.i1.a == 2) {
                                            break;
                                        }
                                    }
                                    d.this.c1.b();
                                    d.this.l1 = true;
                                    return;
                                }
                                throw C3989Py1.c("Missing WWW-Authenticate header in a 401 response.", null);
                            }
                        }
                        switch (i) {
                            case 1:
                            case 3:
                            case 7:
                            case 8:
                            case 9:
                            case 11:
                            case 12:
                                return;
                            case 2:
                                h(new WV1(l.b, i2, W12.b(l.c)));
                                return;
                            case 4:
                                i(new C5833dW1(i2, h.j(l.b.e(com.google.android.exoplayer2.source.rtsp.e.u))));
                                return;
                            case 5:
                                j();
                                return;
                            case 6:
                                String e2 = l.b.e("Range");
                                if (e2 == null) {
                                    d = C6816hW1.c;
                                } else {
                                    d = C6816hW1.d(e2);
                                }
                                try {
                                    String e3 = l.b.e(com.google.android.exoplayer2.source.rtsp.e.w);
                                    if (e3 == null) {
                                        L = AbstractC5317bO0.L();
                                    } else {
                                        L = C7059iW1.a(e3, d.this.d1);
                                    }
                                } catch (C3989Py1 unused) {
                                    L = AbstractC5317bO0.L();
                                }
                                k(new C6075eW1(l.a, d, L));
                                return;
                            case 10:
                                String e4 = l.b.e(com.google.android.exoplayer2.source.rtsp.e.z);
                                String e5 = l.b.e(com.google.android.exoplayer2.source.rtsp.e.D);
                                if (e4 != null && e5 != null) {
                                    l(new i(l.a, h.m(e4), e5));
                                    return;
                                }
                                throw C3989Py1.c("Missing mandatory session or transport header", null);
                            default:
                                throw new IllegalStateException();
                        }
                    } catch (IllegalArgumentException e6) {
                        e = e6;
                        d.this.P(new RtspMediaSource.c(e));
                    }
                } catch (C3989Py1 e7) {
                    e = e7;
                    d.this.P(new RtspMediaSource.c(e));
                }
            }
        }

        public final void h(WV1 wv1) {
            C6816hW1 c6816hW1 = C6816hW1.c;
            String str = wv1.c.a.get(V12.q);
            if (str != null) {
                try {
                    c6816hW1 = C6816hW1.d(str);
                } catch (C3989Py1 e) {
                    d.this.X.c("SDP format error.", e);
                    return;
                }
            }
            AbstractC5317bO0<C5105aW1> N = d.N(wv1, d.this.d1);
            if (N.isEmpty()) {
                d.this.X.c("No playable track.", null);
                return;
            }
            d.this.X.a(c6816hW1, N);
            d.this.k1 = true;
        }

        public final void i(C5833dW1 c5833dW1) {
            if (d.this.h1 != null) {
                return;
            }
            if (d.W(c5833dW1.b)) {
                d.this.c1.c(d.this.d1, d.this.g1);
            } else {
                d.this.X.c("DESCRIBE not supported.", null);
            }
        }

        public final void j() {
            boolean z;
            if (d.this.j1 == 2) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.i(z);
            d.this.j1 = 1;
            d.this.m1 = false;
            if (d.this.n1 != C10323vs.b) {
                d dVar = d.this;
                dVar.c0(TD2.b2(dVar.n1));
            }
        }

        public final void k(C6075eW1 c6075eW1) {
            boolean z = true;
            if (d.this.j1 != 1 && d.this.j1 != 2) {
                z = false;
            }
            C9542sf.i(z);
            d.this.j1 = 2;
            if (d.this.h1 == null) {
                d dVar = d.this;
                dVar.h1 = new b(30000L);
                d.this.h1.a();
            }
            d.this.n1 = C10323vs.b;
            d.this.Y.f(TD2.j1(c6075eW1.b.a), c6075eW1.c);
        }

        public final void l(i iVar) {
            boolean z;
            if (d.this.j1 != -1) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.i(z);
            d.this.j1 = 1;
            d.this.g1 = iVar.b.a;
            d.this.O();
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.rtsp.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0096d {
        public int a;
        public C6318fW1 b;

        public C0096d() {
        }

        public final C6318fW1 a(int i, @InterfaceC11300zs1 String str, Map<String, String> map, Uri uri) {
            String str2 = d.this.Z;
            int i2 = this.a;
            this.a = i2 + 1;
            e.b bVar = new e.b(str2, str, i2);
            if (d.this.i1 != null) {
                C9542sf.k(d.this.f1);
                try {
                    bVar.b("Authorization", d.this.i1.a(d.this.f1, uri, i));
                } catch (C3989Py1 e) {
                    d.this.P(new RtspMediaSource.c(e));
                }
            }
            bVar.d(map);
            return new C6318fW1(uri, i, bVar.e(), "");
        }

        public void b() {
            C9542sf.k(this.b);
            C5559cO0<String, String> b = this.b.c.b();
            HashMap hashMap = new HashMap();
            for (String str : b.keySet()) {
                if (!str.equals(com.google.android.exoplayer2.source.rtsp.e.f163o) && !str.equals("User-Agent") && !str.equals(com.google.android.exoplayer2.source.rtsp.e.z) && !str.equals("Authorization")) {
                    hashMap.put(str, (String) C5098aU0.w(b.get((C5559cO0<String, String>) str)));
                }
            }
            h(a(this.b.b, d.this.g1, hashMap, this.b.a));
        }

        public void c(Uri uri, @InterfaceC11300zs1 String str) {
            h(a(2, str, AbstractC6044eO0.u(), uri));
        }

        public void d(int i) {
            i(new C6573gW1(405, new e.b(d.this.Z, d.this.g1, i).e()));
            this.a = Math.max(this.a, i + 1);
        }

        public void e(Uri uri, @InterfaceC11300zs1 String str) {
            h(a(4, str, AbstractC6044eO0.u(), uri));
        }

        public void f(Uri uri, String str) {
            boolean z;
            if (d.this.j1 == 2) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.i(z);
            h(a(5, str, AbstractC6044eO0.u(), uri));
            d.this.m1 = true;
        }

        public void g(Uri uri, long j, String str) {
            boolean z = true;
            if (d.this.j1 != 1 && d.this.j1 != 2) {
                z = false;
            }
            C9542sf.i(z);
            h(a(6, str, AbstractC6044eO0.v("Range", C6816hW1.b(j)), uri));
        }

        public final void h(C6318fW1 c6318fW1) {
            boolean z;
            int parseInt = Integer.parseInt((String) C9542sf.g(c6318fW1.c.e(com.google.android.exoplayer2.source.rtsp.e.f163o)));
            if (d.this.b1.get(parseInt) == null) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.i(z);
            d.this.b1.append(parseInt, c6318fW1);
            AbstractC5317bO0<String> q = h.q(c6318fW1);
            d.this.S(q);
            d.this.e1.j(q);
            this.b = c6318fW1;
        }

        public final void i(C6573gW1 c6573gW1) {
            AbstractC5317bO0<String> r = h.r(c6573gW1);
            d.this.S(r);
            d.this.e1.j(r);
        }

        public void j(Uri uri, String str, @InterfaceC11300zs1 String str2) {
            d.this.j1 = 0;
            h(a(10, str2, AbstractC6044eO0.v(com.google.android.exoplayer2.source.rtsp.e.D, str), uri));
        }

        public void k(Uri uri, String str) {
            if (d.this.j1 != -1 && d.this.j1 != 0) {
                d.this.j1 = 0;
                h(a(12, str, AbstractC6044eO0.u(), uri));
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface e {
        void d(RtspMediaSource.c cVar);

        void e();

        void f(long j, AbstractC5317bO0<C7059iW1> abstractC5317bO0);
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface f {
    }

    /* loaded from: classes2.dex */
    public interface g {
        void a(C6816hW1 c6816hW1, AbstractC5317bO0<C5105aW1> abstractC5317bO0);

        void c(String str, @InterfaceC11300zs1 Throwable th);
    }

    public d(g gVar, e eVar, String str, Uri uri, SocketFactory socketFactory, boolean z) {
        this.X = gVar;
        this.Y = eVar;
        this.Z = str;
        this.Y0 = socketFactory;
        this.Z0 = z;
        this.d1 = h.p(uri);
        this.f1 = h.n(uri);
    }

    public static AbstractC5317bO0<C5105aW1> N(WV1 wv1, Uri uri) {
        AbstractC5317bO0.a aVar = new AbstractC5317bO0.a();
        for (int i = 0; i < wv1.c.b.size(); i++) {
            C6848hf1 c6848hf1 = wv1.c.b.get(i);
            if (OV1.c(c6848hf1)) {
                aVar.g(new C5105aW1(wv1.a, c6848hf1, uri));
            }
        }
        return aVar.e();
    }

    public static boolean W(List<Integer> list) {
        if (!list.isEmpty() && !list.contains(2)) {
            return false;
        }
        return true;
    }

    public final void O() {
        f.d pollFirst = this.a1.pollFirst();
        if (pollFirst == null) {
            this.Y.e();
        } else {
            this.c1.j(pollFirst.c(), pollFirst.d(), this.g1);
        }
    }

    public final void P(Throwable th) {
        RtspMediaSource.c cVar;
        if (th instanceof RtspMediaSource.c) {
            cVar = (RtspMediaSource.c) th;
        } else {
            cVar = new RtspMediaSource.c(th);
        }
        if (this.k1) {
            this.Y.d(cVar);
        } else {
            this.X.c(C6108ef2.g(th.getMessage()), th);
        }
    }

    public final Socket Q(Uri uri) throws IOException {
        boolean z;
        int i;
        if (uri.getHost() != null) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        if (uri.getPort() > 0) {
            i = uri.getPort();
        } else {
            i = com.google.android.exoplayer2.source.rtsp.g.d1;
        }
        return this.Y0.createSocket((String) C9542sf.g(uri.getHost()), i);
    }

    public int R() {
        return this.j1;
    }

    public final void S(List<String> list) {
        if (this.Z0) {
            I31.b(s1, C7782lV0.p("\n").k(list));
        }
    }

    public void T(int i, g.b bVar) {
        this.e1.i(i, bVar);
    }

    public void U() {
        try {
            close();
            com.google.android.exoplayer2.source.rtsp.g gVar = new com.google.android.exoplayer2.source.rtsp.g(new c());
            this.e1 = gVar;
            gVar.h(Q(this.d1));
            this.g1 = null;
            this.l1 = false;
            this.i1 = null;
        } catch (IOException e2) {
            this.Y.d(new RtspMediaSource.c(e2));
        }
    }

    public void V(long j) {
        if (this.j1 == 2 && !this.m1) {
            this.c1.f(this.d1, (String) C9542sf.g(this.g1));
        }
        this.n1 = j;
    }

    public void Z(List<f.d> list) {
        this.a1.addAll(list);
        O();
    }

    public void a0() {
        this.j1 = 1;
    }

    public void b0() throws IOException {
        try {
            this.e1.h(Q(this.d1));
            this.c1.e(this.d1, this.g1);
        } catch (IOException e2) {
            TD2.t(this.e1);
            throw e2;
        }
    }

    public void c0(long j) {
        this.c1.g(this.d1, j, (String) C9542sf.g(this.g1));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        b bVar = this.h1;
        if (bVar != null) {
            bVar.close();
            this.h1 = null;
            this.c1.k(this.d1, (String) C9542sf.g(this.g1));
        }
        this.e1.close();
    }
}
