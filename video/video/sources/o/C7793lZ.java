package o;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o.C7793lZ;
import o.InterfaceC10186vI0;
import o.InterfaceC9309rh1;
import o.M11;
import o.R11;
import o.UH0;
import o.VH0;
import o.XH0;
import o.ZH0;

@Deprecated
/* renamed from: o.lZ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7793lZ implements ZH0, R11.b<C4086Qy1<WH0>> {
    public static final ZH0.a k1 = new ZH0.a() { // from class: o.kZ
        @Override // o.ZH0.a
        public final ZH0 a(NH0 nh0, M11 m11, YH0 yh0) {
            return new C7793lZ(nh0, m11, yh0);
        }
    };
    public static final double l1 = 3.5d;
    public final NH0 X;
    public final YH0 Y;
    public final HashMap<Uri, c> Y0;
    public final M11 Z;
    public final CopyOnWriteArrayList<ZH0.b> Z0;
    public final double a1;
    @InterfaceC11300zs1
    public InterfaceC9309rh1.a b1;
    @InterfaceC11300zs1
    public R11 c1;
    @InterfaceC11300zs1
    public Handler d1;
    @InterfaceC11300zs1
    public ZH0.e e1;
    @InterfaceC11300zs1
    public VH0 f1;
    @InterfaceC11300zs1
    public Uri g1;
    @InterfaceC11300zs1
    public UH0 h1;
    public boolean i1;
    public long j1;

    /* renamed from: o.lZ$b */
    /* loaded from: classes2.dex */
    public class b implements ZH0.b {
        public b() {
        }

        @Override // o.ZH0.b
        public boolean b(Uri uri, M11.d dVar, boolean z) {
            c cVar;
            if (C7793lZ.this.h1 == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                List<VH0.b> list = ((VH0) TD2.o(C7793lZ.this.f1)).e;
                int i = 0;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    c cVar2 = (c) C7793lZ.this.Y0.get(list.get(i2).a);
                    if (cVar2 != null && elapsedRealtime < cVar2.c1) {
                        i++;
                    }
                }
                M11.b b = C7793lZ.this.Z.b(new M11.a(1, 0, C7793lZ.this.f1.e.size(), i), dVar);
                if (b != null && b.a == 2 && (cVar = (c) C7793lZ.this.Y0.get(uri)) != null) {
                    cVar.h(b.b);
                }
            }
            return false;
        }

        @Override // o.ZH0.b
        public void j() {
            C7793lZ.this.Z0.remove(this);
        }
    }

    /* renamed from: o.lZ$c */
    /* loaded from: classes2.dex */
    public final class c implements R11.b<C4086Qy1<WH0>> {
        public static final String g1 = "_HLS_msn";
        public static final String h1 = "_HLS_part";
        public static final String i1 = "_HLS_skip";
        public final Uri X;
        public final R11 Y = new R11("DefaultHlsPlaylistTracker:MediaPlaylist");
        @InterfaceC11300zs1
        public UH0 Y0;
        public final FU Z;
        public long Z0;
        public long a1;
        public long b1;
        public long c1;
        public boolean d1;
        @InterfaceC11300zs1
        public IOException e1;

        public c(Uri uri) {
            this.X = uri;
            this.Z = C7793lZ.this.X.a(4);
        }

        public static /* synthetic */ void a(c cVar, Uri uri) {
            cVar.d1 = false;
            cVar.m(uri);
        }

        public final boolean h(long j) {
            this.c1 = SystemClock.elapsedRealtime() + j;
            if (this.X.equals(C7793lZ.this.g1) && !C7793lZ.this.J()) {
                return true;
            }
            return false;
        }

        public final Uri i() {
            String str;
            UH0 uh0 = this.Y0;
            if (uh0 != null) {
                UH0.g gVar = uh0.v;
                if (gVar.a != C10323vs.b || gVar.e) {
                    Uri.Builder buildUpon = this.X.buildUpon();
                    UH0 uh02 = this.Y0;
                    if (uh02.v.e) {
                        buildUpon.appendQueryParameter(g1, String.valueOf(uh02.k + uh02.r.size()));
                        UH0 uh03 = this.Y0;
                        if (uh03.n != C10323vs.b) {
                            List<UH0.b> list = uh03.s;
                            int size = list.size();
                            if (!list.isEmpty() && ((UH0.b) C5098aU0.w(list)).h1) {
                                size--;
                            }
                            buildUpon.appendQueryParameter(h1, String.valueOf(size));
                        }
                    }
                    UH0.g gVar2 = this.Y0.v;
                    if (gVar2.a != C10323vs.b) {
                        if (gVar2.b) {
                            str = "v2";
                        } else {
                            str = XH0.V;
                        }
                        buildUpon.appendQueryParameter(i1, str);
                    }
                    return buildUpon.build();
                }
            }
            return this.X;
        }

        @InterfaceC11300zs1
        public UH0 j() {
            return this.Y0;
        }

        public boolean k() {
            int i;
            if (this.Y0 == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, TD2.b2(this.Y0.u));
            UH0 uh0 = this.Y0;
            if (!uh0.f624o && (i = uh0.d) != 2 && i != 1 && this.Z0 + max <= elapsedRealtime) {
                return false;
            }
            return true;
        }

        public void l() {
            n(this.X);
        }

        public final void m(Uri uri) {
            C4086Qy1 c4086Qy1 = new C4086Qy1(this.Z, uri, 4, C7793lZ.this.Y.b(C7793lZ.this.f1, this.Y0));
            C7793lZ.this.b1.s(new N11(c4086Qy1.a, c4086Qy1.b, this.Y.n(c4086Qy1, this, C7793lZ.this.Z.a(c4086Qy1.c))), c4086Qy1.c);
        }

        public final void n(final Uri uri) {
            this.c1 = 0L;
            if (!this.d1 && !this.Y.k() && !this.Y.j()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime < this.b1) {
                    this.d1 = true;
                    C7793lZ.this.d1.postDelayed(new Runnable() { // from class: o.mZ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C7793lZ.c.a(C7793lZ.c.this, uri);
                        }
                    }, this.b1 - elapsedRealtime);
                    return;
                }
                m(uri);
            }
        }

        public void o() throws IOException {
            this.Y.b();
            IOException iOException = this.e1;
            if (iOException == null) {
                return;
            }
            throw iOException;
        }

        @Override // o.R11.b
        /* renamed from: p */
        public void M(C4086Qy1<WH0> c4086Qy1, long j, long j2, boolean z) {
            N11 n11 = new N11(c4086Qy1.a, c4086Qy1.b, c4086Qy1.f(), c4086Qy1.d(), j, j2, c4086Qy1.b());
            C7793lZ.this.Z.c(c4086Qy1.a);
            C7793lZ.this.b1.j(n11, 4);
        }

        @Override // o.R11.b
        /* renamed from: q */
        public void t(C4086Qy1<WH0> c4086Qy1, long j, long j2) {
            WH0 e = c4086Qy1.e();
            N11 n11 = new N11(c4086Qy1.a, c4086Qy1.b, c4086Qy1.f(), c4086Qy1.d(), j, j2, c4086Qy1.b());
            if (e instanceof UH0) {
                s((UH0) e, n11);
                C7793lZ.this.b1.m(n11, 4);
            } else {
                this.e1 = C3989Py1.c("Loaded playlist has unexpected type.", null);
                C7793lZ.this.b1.q(n11, 4, this.e1, true);
            }
            C7793lZ.this.Z.c(c4086Qy1.a);
        }

        @Override // o.R11.b
        /* renamed from: r */
        public R11.c N(C4086Qy1<WH0> c4086Qy1, long j, long j2, IOException iOException, int i) {
            boolean z;
            int i2;
            R11.c cVar;
            N11 n11 = new N11(c4086Qy1.a, c4086Qy1.b, c4086Qy1.f(), c4086Qy1.d(), j, j2, c4086Qy1.b());
            if (c4086Qy1.f().getQueryParameter(g1) != null) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = iOException instanceof XH0.a;
            if (z || z2) {
                if (iOException instanceof InterfaceC10186vI0.f) {
                    i2 = ((InterfaceC10186vI0.f) iOException).c1;
                } else {
                    i2 = Integer.MAX_VALUE;
                }
                if (z2 || i2 == 400 || i2 == 503) {
                    this.b1 = SystemClock.elapsedRealtime();
                    l();
                    ((InterfaceC9309rh1.a) TD2.o(C7793lZ.this.b1)).q(n11, c4086Qy1.c, iOException, true);
                    return R11.k;
                }
            }
            M11.d dVar = new M11.d(n11, new C10519wf1(c4086Qy1.c), iOException, i);
            if (C7793lZ.this.L(this.X, dVar, false)) {
                long d = C7793lZ.this.Z.d(dVar);
                if (d != C10323vs.b) {
                    cVar = R11.i(false, d);
                } else {
                    cVar = R11.l;
                }
            } else {
                cVar = R11.k;
            }
            boolean c = cVar.c();
            C7793lZ.this.b1.q(n11, c4086Qy1.c, iOException, !c);
            if (!c) {
                C7793lZ.this.Z.c(c4086Qy1.a);
            }
            return cVar;
        }

        public final void s(UH0 uh0, N11 n11) {
            UH0 uh02;
            boolean z;
            long j;
            UH0 uh03 = this.Y0;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.Z0 = elapsedRealtime;
            UH0 E = C7793lZ.this.E(uh03, uh0);
            this.Y0 = E;
            IOException iOException = null;
            if (E != uh03) {
                this.e1 = null;
                this.a1 = elapsedRealtime;
                C7793lZ.this.R(this.X, E);
            } else if (!E.f624o) {
                if (uh0.k + uh0.r.size() < this.Y0.k) {
                    iOException = new ZH0.c(this.X);
                    z = true;
                } else {
                    z = false;
                    if (elapsedRealtime - this.a1 > TD2.b2(uh02.m) * C7793lZ.this.a1) {
                        iOException = new ZH0.d(this.X);
                    }
                }
                if (iOException != null) {
                    this.e1 = iOException;
                    C7793lZ.this.L(this.X, new M11.d(n11, new C10519wf1(4), iOException, 1), z);
                }
            }
            UH0 uh04 = this.Y0;
            if (!uh04.v.e) {
                if (uh04 != uh03) {
                    j = uh04.m;
                } else {
                    j = uh04.m / 2;
                }
            } else {
                j = 0;
            }
            this.b1 = elapsedRealtime + TD2.b2(j);
            if ((this.Y0.n != C10323vs.b || this.X.equals(C7793lZ.this.g1)) && !this.Y0.f624o) {
                n(i());
            }
        }

        public void u() {
            this.Y.l();
        }
    }

    public C7793lZ(NH0 nh0, M11 m11, YH0 yh0) {
        this(nh0, m11, yh0, 3.5d);
    }

    public static UH0.e D(UH0 uh0, UH0 uh02) {
        int i = (int) (uh02.k - uh0.k);
        List<UH0.e> list = uh0.r;
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    public final void C(List<Uri> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = list.get(i);
            this.Y0.put(uri, new c(uri));
        }
    }

    public final UH0 E(@InterfaceC11300zs1 UH0 uh0, UH0 uh02) {
        if (!uh02.f(uh0)) {
            if (uh02.f624o) {
                return uh0.d();
            }
            return uh0;
        }
        return uh02.c(G(uh0, uh02), F(uh0, uh02));
    }

    public final int F(@InterfaceC11300zs1 UH0 uh0, UH0 uh02) {
        int i;
        UH0.e D;
        if (uh02.i) {
            return uh02.j;
        }
        UH0 uh03 = this.h1;
        if (uh03 != null) {
            i = uh03.j;
        } else {
            i = 0;
        }
        if (uh0 != null && (D = D(uh0, uh02)) != null) {
            return (uh0.j + D.Y0) - uh02.r.get(0).Y0;
        }
        return i;
    }

    public final long G(@InterfaceC11300zs1 UH0 uh0, UH0 uh02) {
        long j;
        if (uh02.p) {
            return uh02.h;
        }
        UH0 uh03 = this.h1;
        if (uh03 != null) {
            j = uh03.h;
        } else {
            j = 0;
        }
        if (uh0 != null) {
            int size = uh0.r.size();
            UH0.e D = D(uh0, uh02);
            if (D != null) {
                return uh0.h + D.Z0;
            }
            if (size == uh02.k - uh0.k) {
                return uh0.e();
            }
        }
        return j;
    }

    public final Uri H(Uri uri) {
        UH0.d dVar;
        UH0 uh0 = this.h1;
        if (uh0 != null && uh0.v.e && (dVar = uh0.t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter(c.g1, String.valueOf(dVar.b));
            int i = dVar.c;
            if (i != -1) {
                buildUpon.appendQueryParameter(c.h1, String.valueOf(i));
            }
            return buildUpon.build();
        }
        return uri;
    }

    public final boolean I(Uri uri) {
        List<VH0.b> list = this.f1.e;
        for (int i = 0; i < list.size(); i++) {
            if (uri.equals(list.get(i).a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean J() {
        List<VH0.b> list = this.f1.e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            c cVar = (c) C9542sf.g(this.Y0.get(list.get(i).a));
            if (elapsedRealtime > cVar.c1) {
                Uri uri = cVar.X;
                this.g1 = uri;
                cVar.n(H(uri));
                return true;
            }
        }
        return false;
    }

    public final void K(Uri uri) {
        if (!uri.equals(this.g1) && I(uri)) {
            UH0 uh0 = this.h1;
            if (uh0 == null || !uh0.f624o) {
                this.g1 = uri;
                c cVar = this.Y0.get(uri);
                UH0 uh02 = cVar.Y0;
                if (uh02 == null || !uh02.f624o) {
                    cVar.n(H(uri));
                    return;
                }
                this.h1 = uh02;
                this.e1.K(uh02);
            }
        }
    }

    public final boolean L(Uri uri, M11.d dVar, boolean z) {
        Iterator<ZH0.b> it = this.Z0.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= !it.next().b(uri, dVar, z);
        }
        return z2;
    }

    @Override // o.R11.b
    /* renamed from: O */
    public void M(C4086Qy1<WH0> c4086Qy1, long j, long j2, boolean z) {
        N11 n11 = new N11(c4086Qy1.a, c4086Qy1.b, c4086Qy1.f(), c4086Qy1.d(), j, j2, c4086Qy1.b());
        this.Z.c(c4086Qy1.a);
        this.b1.j(n11, 4);
    }

    @Override // o.R11.b
    /* renamed from: P */
    public void t(C4086Qy1<WH0> c4086Qy1, long j, long j2) {
        VH0 vh0;
        WH0 e = c4086Qy1.e();
        boolean z = e instanceof UH0;
        if (z) {
            vh0 = VH0.e(e.a);
        } else {
            vh0 = (VH0) e;
        }
        this.f1 = vh0;
        this.g1 = vh0.e.get(0).a;
        this.Z0.add(new b());
        C(vh0.d);
        N11 n11 = new N11(c4086Qy1.a, c4086Qy1.b, c4086Qy1.f(), c4086Qy1.d(), j, j2, c4086Qy1.b());
        c cVar = this.Y0.get(this.g1);
        if (z) {
            cVar.s((UH0) e, n11);
        } else {
            cVar.l();
        }
        this.Z.c(c4086Qy1.a);
        this.b1.m(n11, 4);
    }

    @Override // o.R11.b
    /* renamed from: Q */
    public R11.c N(C4086Qy1<WH0> c4086Qy1, long j, long j2, IOException iOException, int i) {
        boolean z;
        N11 n11 = new N11(c4086Qy1.a, c4086Qy1.b, c4086Qy1.f(), c4086Qy1.d(), j, j2, c4086Qy1.b());
        long d = this.Z.d(new M11.d(n11, new C10519wf1(c4086Qy1.c), iOException, i));
        if (d == C10323vs.b) {
            z = true;
        } else {
            z = false;
        }
        this.b1.q(n11, c4086Qy1.c, iOException, z);
        if (z) {
            this.Z.c(c4086Qy1.a);
        }
        if (z) {
            return R11.l;
        }
        return R11.i(false, d);
    }

    public final void R(Uri uri, UH0 uh0) {
        if (uri.equals(this.g1)) {
            if (this.h1 == null) {
                this.i1 = !uh0.f624o;
                this.j1 = uh0.h;
            }
            this.h1 = uh0;
            this.e1.K(uh0);
        }
        Iterator<ZH0.b> it = this.Z0.iterator();
        while (it.hasNext()) {
            it.next().j();
        }
    }

    @Override // o.ZH0
    public void a(Uri uri) throws IOException {
        this.Y0.get(uri).o();
    }

    @Override // o.ZH0
    public void b(ZH0.b bVar) {
        C9542sf.g(bVar);
        this.Z0.add(bVar);
    }

    @Override // o.ZH0
    public long c() {
        return this.j1;
    }

    @Override // o.ZH0
    @InterfaceC11300zs1
    public VH0 d() {
        return this.f1;
    }

    @Override // o.ZH0
    public void e(Uri uri) {
        this.Y0.get(uri).l();
    }

    @Override // o.ZH0
    public boolean f(Uri uri) {
        return this.Y0.get(uri).k();
    }

    @Override // o.ZH0
    public void g(ZH0.b bVar) {
        this.Z0.remove(bVar);
    }

    @Override // o.ZH0
    public void h(Uri uri, InterfaceC9309rh1.a aVar, ZH0.e eVar) {
        boolean z;
        this.d1 = TD2.C();
        this.b1 = aVar;
        this.e1 = eVar;
        C4086Qy1 c4086Qy1 = new C4086Qy1(this.X.a(4), uri, 4, this.Y.a());
        if (this.c1 == null) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        R11 r11 = new R11("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.c1 = r11;
        aVar.s(new N11(c4086Qy1.a, c4086Qy1.b, r11.n(c4086Qy1, this, this.Z.a(c4086Qy1.c))), c4086Qy1.c);
    }

    @Override // o.ZH0
    public boolean i() {
        return this.i1;
    }

    @Override // o.ZH0
    public boolean j(Uri uri, long j) {
        c cVar = this.Y0.get(uri);
        if (cVar != null) {
            return !cVar.h(j);
        }
        return false;
    }

    @Override // o.ZH0
    public void k() throws IOException {
        R11 r11 = this.c1;
        if (r11 != null) {
            r11.b();
        }
        Uri uri = this.g1;
        if (uri != null) {
            a(uri);
        }
    }

    @Override // o.ZH0
    @InterfaceC11300zs1
    public UH0 l(Uri uri, boolean z) {
        UH0 j = this.Y0.get(uri).j();
        if (j != null && z) {
            K(uri);
        }
        return j;
    }

    @Override // o.ZH0
    public void stop() {
        this.g1 = null;
        this.h1 = null;
        this.f1 = null;
        this.j1 = C10323vs.b;
        this.c1.l();
        this.c1 = null;
        for (c cVar : this.Y0.values()) {
            cVar.u();
        }
        this.d1.removeCallbacksAndMessages(null);
        this.d1 = null;
        this.Y0.clear();
    }

    public C7793lZ(NH0 nh0, M11 m11, YH0 yh0, double d) {
        this.X = nh0;
        this.Y = yh0;
        this.Z = m11;
        this.a1 = d;
        this.Z0 = new CopyOnWriteArrayList<>();
        this.Y0 = new HashMap<>();
        this.j1 = C10323vs.b;
    }
}
