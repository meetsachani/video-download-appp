package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.exoplayer2.source.rtsp.a;
import com.google.android.exoplayer2.source.rtsp.b;
import com.google.android.exoplayer2.source.rtsp.d;
import com.google.android.exoplayer2.source.rtsp.f;
import com.google.android.exoplayer2.source.rtsp.g;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import o.AbstractC5317bO0;
import o.C10079ur2;
import o.C10323vs;
import o.C10833xx0;
import o.C2899Ex0;
import o.C3031Gd2;
import o.C5105aW1;
import o.C6816hW1;
import o.C7059iW1;
import o.C9267rW;
import o.C9542sf;
import o.C9593sr2;
import o.GX1;
import o.IX1;
import o.InterfaceC10568wr2;
import o.InterfaceC10877y8;
import o.InterfaceC11300zs1;
import o.InterfaceC4410Ug1;
import o.InterfaceC4518Vj0;
import o.InterfaceC6859hi0;
import o.KZ1;
import o.LZ1;
import o.R11;
import o.TD2;

@Deprecated
/* loaded from: classes2.dex */
public final class f implements InterfaceC4410Ug1 {
    public static final int r1 = 3;
    public final InterfaceC10877y8 X;
    public final Handler Y = TD2.C();
    public final com.google.android.exoplayer2.source.rtsp.d Y0;
    public final b Z;
    public final List<e> Z0;
    public final List<d> a1;
    public final c b1;
    public final a.InterfaceC0095a c1;
    public InterfaceC4410Ug1.a d1;
    public AbstractC5317bO0<C9593sr2> e1;
    @InterfaceC11300zs1
    public IOException f1;
    @InterfaceC11300zs1
    public RtspMediaSource.c g1;
    public long h1;
    public long i1;
    public long j1;
    public boolean k1;
    public boolean l1;
    public boolean m1;
    public boolean n1;
    public boolean o1;
    public int p1;
    public boolean q1;

    /* loaded from: classes2.dex */
    public interface c {
        default void a() {
        }

        void b(C6816hW1 c6816hW1);
    }

    /* loaded from: classes2.dex */
    public final class d {
        public final C5105aW1 a;
        public final com.google.android.exoplayer2.source.rtsp.b b;
        @InterfaceC11300zs1
        public String c;

        public d(C5105aW1 c5105aW1, int i, a.InterfaceC0095a interfaceC0095a) {
            this.a = c5105aW1;
            this.b = new com.google.android.exoplayer2.source.rtsp.b(i, c5105aW1, new b.a() { // from class: o.ZV1
                @Override // com.google.android.exoplayer2.source.rtsp.b.a
                public final void a(String str, com.google.android.exoplayer2.source.rtsp.a aVar) {
                    f.d.a(f.d.this, str, aVar);
                }
            }, f.this.Z, interfaceC0095a);
        }

        public static /* synthetic */ void a(d dVar, String str, com.google.android.exoplayer2.source.rtsp.a aVar) {
            dVar.c = str;
            g.b o2 = aVar.o();
            if (o2 != null) {
                f.this.Y0.T(aVar.e(), o2);
                f.this.q1 = true;
            }
            f.this.W();
        }

        public Uri c() {
            return this.b.b.b;
        }

        public String d() {
            C9542sf.k(this.c);
            return this.c;
        }

        public boolean e() {
            if (this.c != null) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public final class e {
        public final d a;
        public final R11 b;
        public final GX1 c;
        public boolean d;
        public boolean e;

        public e(C5105aW1 c5105aW1, int i, a.InterfaceC0095a interfaceC0095a) {
            this.a = new d(c5105aW1, i, interfaceC0095a);
            this.b = new R11("ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper " + i);
            GX1 m = GX1.m(f.this.X);
            this.c = m;
            m.e0(f.this.Z);
        }

        public void c() {
            if (!this.d) {
                this.a.b.c();
                this.d = true;
                f.this.d0();
            }
        }

        public long d() {
            return this.c.B();
        }

        public boolean e() {
            return this.c.M(this.d);
        }

        public int f(C2899Ex0 c2899Ex0, C9267rW c9267rW, int i) {
            return this.c.T(c2899Ex0, c9267rW, i, this.d);
        }

        public void g() {
            if (this.e) {
                return;
            }
            this.b.l();
            this.c.U();
            this.e = true;
        }

        public void h() {
            C9542sf.i(this.d);
            this.d = false;
            f.this.d0();
            k();
        }

        public void i(long j) {
            if (!this.d) {
                this.a.b.d();
                this.c.W();
                this.c.c0(j);
            }
        }

        public int j(long j) {
            int G = this.c.G(j, this.d);
            this.c.f0(G);
            return G;
        }

        public void k() {
            this.b.n(this.a.b, f.this.Z, 0);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.rtsp.f$f  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0097f implements IX1 {
        public final int X;

        public C0097f(int i) {
            this.X = i;
        }

        @Override // o.IX1
        public void b() throws RtspMediaSource.c {
            if (f.this.g1 == null) {
                return;
            }
            throw f.this.g1;
        }

        @Override // o.IX1
        public boolean isReady() {
            return f.this.T(this.X);
        }

        @Override // o.IX1
        public int j(C2899Ex0 c2899Ex0, C9267rW c9267rW, int i) {
            return f.this.X(this.X, c2899Ex0, c9267rW, i);
        }

        @Override // o.IX1
        public int n(long j) {
            return f.this.b0(this.X, j);
        }
    }

    public f(InterfaceC10877y8 interfaceC10877y8, a.InterfaceC0095a interfaceC0095a, Uri uri, c cVar, String str, SocketFactory socketFactory, boolean z) {
        this.X = interfaceC10877y8;
        this.c1 = interfaceC0095a;
        this.b1 = cVar;
        b bVar = new b();
        this.Z = bVar;
        this.Y0 = new com.google.android.exoplayer2.source.rtsp.d(bVar, bVar, str, uri, socketFactory, z);
        this.Z0 = new ArrayList();
        this.a1 = new ArrayList();
        this.i1 = C10323vs.b;
        this.h1 = C10323vs.b;
        this.j1 = C10323vs.b;
    }

    public static AbstractC5317bO0<C9593sr2> Q(AbstractC5317bO0<e> abstractC5317bO0) {
        AbstractC5317bO0.a aVar = new AbstractC5317bO0.a();
        for (int i = 0; i < abstractC5317bO0.size(); i++) {
            aVar.g(new C9593sr2(Integer.toString(i), (C10833xx0) C9542sf.g(abstractC5317bO0.get(i).c.H())));
        }
        return aVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        if (!this.m1 && !this.n1) {
            for (int i = 0; i < this.Z0.size(); i++) {
                if (this.Z0.get(i).c.H() == null) {
                    return;
                }
            }
            this.n1 = true;
            this.e1 = Q(AbstractC5317bO0.F(this.Z0));
            ((InterfaceC4410Ug1.a) C9542sf.g(this.d1)).j(this);
        }
    }

    private boolean a0(long j) {
        for (int i = 0; i < this.Z0.size(); i++) {
            if (!this.Z0.get(i).c.a0(j, false)) {
                return false;
            }
        }
        return true;
    }

    private boolean c0() {
        return this.l1;
    }

    public static /* synthetic */ int j(f fVar) {
        int i = fVar.p1;
        fVar.p1 = i + 1;
        return i;
    }

    @InterfaceC11300zs1
    public final com.google.android.exoplayer2.source.rtsp.b R(Uri uri) {
        for (int i = 0; i < this.Z0.size(); i++) {
            if (!this.Z0.get(i).d) {
                d dVar = this.Z0.get(i).a;
                if (dVar.c().equals(uri)) {
                    return dVar.b;
                }
            }
        }
        return null;
    }

    @Override // o.InterfaceC4410Ug1
    /* renamed from: S */
    public AbstractC5317bO0<C3031Gd2> h(List<InterfaceC6859hi0> list) {
        return AbstractC5317bO0.L();
    }

    public boolean T(int i) {
        if (!c0() && this.Z0.get(i).e()) {
            return true;
        }
        return false;
    }

    public final boolean U() {
        if (this.i1 != C10323vs.b) {
            return true;
        }
        return false;
    }

    public final void W() {
        boolean z = true;
        for (int i = 0; i < this.a1.size(); i++) {
            z &= this.a1.get(i).e();
        }
        if (z && this.o1) {
            this.Y0.Z(this.a1);
        }
    }

    public int X(int i, C2899Ex0 c2899Ex0, C9267rW c9267rW, int i2) {
        if (c0()) {
            return -3;
        }
        return this.Z0.get(i).f(c2899Ex0, c9267rW, i2);
    }

    public void Y() {
        for (int i = 0; i < this.Z0.size(); i++) {
            this.Z0.get(i).g();
        }
        TD2.t(this.Y0);
        this.m1 = true;
    }

    public final void Z() {
        this.q1 = true;
        this.Y0.U();
        a.InterfaceC0095a b2 = this.c1.b();
        if (b2 == null) {
            this.g1 = new RtspMediaSource.c("No fallback data channel factory for TCP retry");
            return;
        }
        ArrayList arrayList = new ArrayList(this.Z0.size());
        ArrayList arrayList2 = new ArrayList(this.a1.size());
        for (int i = 0; i < this.Z0.size(); i++) {
            e eVar = this.Z0.get(i);
            if (!eVar.d) {
                e eVar2 = new e(eVar.a.a, i, b2);
                arrayList.add(eVar2);
                eVar2.k();
                if (this.a1.contains(eVar.a)) {
                    arrayList2.add(eVar2.a);
                }
            } else {
                arrayList.add(eVar);
            }
        }
        AbstractC5317bO0 F = AbstractC5317bO0.F(this.Z0);
        this.Z0.clear();
        this.Z0.addAll(arrayList);
        this.a1.clear();
        this.a1.addAll(arrayList2);
        for (int i2 = 0; i2 < F.size(); i2++) {
            ((e) F.get(i2)).c();
        }
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public boolean a() {
        return !this.k1;
    }

    public int b0(int i, long j) {
        if (c0()) {
            return -3;
        }
        return this.Z0.get(i).j(j);
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public long c() {
        return f();
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public boolean d(long j) {
        return a();
    }

    public final void d0() {
        this.k1 = true;
        for (int i = 0; i < this.Z0.size(); i++) {
            this.k1 &= this.Z0.get(i).d;
        }
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public long f() {
        if (this.k1 || this.Z0.isEmpty()) {
            return Long.MIN_VALUE;
        }
        long j = this.h1;
        if (j != C10323vs.b) {
            return j;
        }
        boolean z = true;
        long j2 = Long.MAX_VALUE;
        for (int i = 0; i < this.Z0.size(); i++) {
            e eVar = this.Z0.get(i);
            if (!eVar.d) {
                j2 = Math.min(j2, eVar.d());
                z = false;
            }
        }
        if (!z && j2 != Long.MIN_VALUE) {
            return j2;
        }
        return 0L;
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public void g(long j) {
    }

    @Override // o.InterfaceC4410Ug1
    public long i(long j) {
        if (f() == 0 && !this.q1) {
            this.j1 = j;
            return j;
        }
        r(j, false);
        this.h1 = j;
        if (U()) {
            int R = this.Y0.R();
            if (R != 1) {
                if (R == 2) {
                    this.i1 = j;
                    this.Y0.V(j);
                    return j;
                }
                throw new IllegalStateException();
            }
        } else if (!a0(j)) {
            this.i1 = j;
            if (this.k1) {
                for (int i = 0; i < this.Z0.size(); i++) {
                    this.Z0.get(i).h();
                }
                if (this.q1) {
                    this.Y0.c0(TD2.b2(j));
                } else {
                    this.Y0.V(j);
                }
            } else {
                this.Y0.V(j);
            }
            for (int i2 = 0; i2 < this.Z0.size(); i2++) {
                this.Z0.get(i2).i(j);
            }
        }
        return j;
    }

    @Override // o.InterfaceC4410Ug1
    public long k() {
        if (this.l1) {
            this.l1 = false;
            return 0L;
        }
        return C10323vs.b;
    }

    @Override // o.InterfaceC4410Ug1
    public void m() throws IOException {
        IOException iOException = this.f1;
        if (iOException == null) {
            return;
        }
        throw iOException;
    }

    @Override // o.InterfaceC4410Ug1
    public void o(InterfaceC4410Ug1.a aVar, long j) {
        this.d1 = aVar;
        try {
            this.Y0.b0();
        } catch (IOException e2) {
            this.f1 = e2;
            TD2.t(this.Y0);
        }
    }

    @Override // o.InterfaceC4410Ug1
    public C10079ur2 q() {
        C9542sf.i(this.n1);
        return new C10079ur2((C9593sr2[]) ((AbstractC5317bO0) C9542sf.g(this.e1)).toArray(new C9593sr2[0]));
    }

    @Override // o.InterfaceC4410Ug1
    public void r(long j, boolean z) {
        if (!U()) {
            for (int i = 0; i < this.Z0.size(); i++) {
                e eVar = this.Z0.get(i);
                if (!eVar.d) {
                    eVar.c.r(j, z, true);
                }
            }
        }
    }

    @Override // o.InterfaceC4410Ug1
    public long s(InterfaceC6859hi0[] interfaceC6859hi0Arr, boolean[] zArr, IX1[] ix1Arr, boolean[] zArr2, long j) {
        for (int i = 0; i < interfaceC6859hi0Arr.length; i++) {
            if (ix1Arr[i] != null && (interfaceC6859hi0Arr[i] == null || !zArr[i])) {
                ix1Arr[i] = null;
            }
        }
        this.a1.clear();
        for (int i2 = 0; i2 < interfaceC6859hi0Arr.length; i2++) {
            InterfaceC6859hi0 interfaceC6859hi0 = interfaceC6859hi0Arr[i2];
            if (interfaceC6859hi0 != null) {
                C9593sr2 n = interfaceC6859hi0.n();
                int indexOf = ((AbstractC5317bO0) C9542sf.g(this.e1)).indexOf(n);
                this.a1.add(((e) C9542sf.g(this.Z0.get(indexOf))).a);
                if (this.e1.contains(n) && ix1Arr[i2] == null) {
                    ix1Arr[i2] = new C0097f(indexOf);
                    zArr2[i2] = true;
                }
            }
        }
        for (int i3 = 0; i3 < this.Z0.size(); i3++) {
            e eVar = this.Z0.get(i3);
            if (!this.a1.contains(eVar.a)) {
                eVar.c();
            }
        }
        this.o1 = true;
        if (j != 0) {
            this.h1 = j;
            this.i1 = j;
            this.j1 = j;
        }
        W();
        return j;
    }

    /* loaded from: classes2.dex */
    public final class b implements InterfaceC4518Vj0, R11.b<com.google.android.exoplayer2.source.rtsp.b>, GX1.d, d.g, d.e {
        public b() {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.d.g
        public void a(C6816hW1 c6816hW1, AbstractC5317bO0<C5105aW1> abstractC5317bO0) {
            for (int i = 0; i < abstractC5317bO0.size(); i++) {
                f fVar = f.this;
                e eVar = new e(abstractC5317bO0.get(i), i, fVar.c1);
                f.this.Z0.add(eVar);
                eVar.k();
            }
            f.this.b1.b(c6816hW1);
        }

        @Override // o.InterfaceC4518Vj0
        public InterfaceC10568wr2 b(int i, int i2) {
            return ((e) C9542sf.g((e) f.this.Z0.get(i))).c;
        }

        @Override // com.google.android.exoplayer2.source.rtsp.d.g
        public void c(String str, @InterfaceC11300zs1 Throwable th) {
            IOException iOException;
            f fVar = f.this;
            if (th == null) {
                iOException = new IOException(str);
            } else {
                iOException = new IOException(str, th);
            }
            fVar.f1 = iOException;
        }

        @Override // com.google.android.exoplayer2.source.rtsp.d.e
        public void d(RtspMediaSource.c cVar) {
            if (!(cVar instanceof RtspMediaSource.d) || f.this.q1) {
                f.this.g1 = cVar;
            } else {
                f.this.Z();
            }
        }

        @Override // com.google.android.exoplayer2.source.rtsp.d.e
        public void e() {
            long j;
            if (f.this.i1 != C10323vs.b) {
                j = TD2.b2(f.this.i1);
            } else if (f.this.j1 != C10323vs.b) {
                j = TD2.b2(f.this.j1);
            } else {
                j = 0;
            }
            f.this.Y0.c0(j);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.d.e
        public void f(long j, AbstractC5317bO0<C7059iW1> abstractC5317bO0) {
            ArrayList arrayList = new ArrayList(abstractC5317bO0.size());
            for (int i = 0; i < abstractC5317bO0.size(); i++) {
                arrayList.add((String) C9542sf.g(abstractC5317bO0.get(i).c.getPath()));
            }
            for (int i2 = 0; i2 < f.this.a1.size(); i2++) {
                if (!arrayList.contains(((d) f.this.a1.get(i2)).c().getPath())) {
                    f.this.b1.a();
                    if (f.this.U()) {
                        f.this.l1 = true;
                        f.this.i1 = C10323vs.b;
                        f.this.h1 = C10323vs.b;
                        f.this.j1 = C10323vs.b;
                    }
                }
            }
            for (int i3 = 0; i3 < abstractC5317bO0.size(); i3++) {
                C7059iW1 c7059iW1 = abstractC5317bO0.get(i3);
                com.google.android.exoplayer2.source.rtsp.b R = f.this.R(c7059iW1.c);
                if (R != null) {
                    R.g(c7059iW1.a);
                    R.f(c7059iW1.b);
                    if (f.this.U() && f.this.i1 == f.this.h1) {
                        R.e(j, c7059iW1.a);
                    }
                }
            }
            if (f.this.U()) {
                if (f.this.i1 == f.this.h1) {
                    f.this.i1 = C10323vs.b;
                    f.this.h1 = C10323vs.b;
                    return;
                }
                f.this.i1 = C10323vs.b;
                f fVar = f.this;
                fVar.i(fVar.h1);
            } else if (f.this.j1 != C10323vs.b && f.this.q1) {
                f fVar2 = f.this;
                fVar2.i(fVar2.j1);
                f.this.j1 = C10323vs.b;
            }
        }

        @Override // o.R11.b
        /* renamed from: i */
        public void M(com.google.android.exoplayer2.source.rtsp.b bVar, long j, long j2, boolean z) {
        }

        @Override // o.GX1.d
        public void j(C10833xx0 c10833xx0) {
            Handler handler = f.this.Y;
            final f fVar = f.this;
            handler.post(new Runnable() { // from class: o.YV1
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.exoplayer2.source.rtsp.f.this.V();
                }
            });
        }

        @Override // o.R11.b
        /* renamed from: k */
        public void t(com.google.android.exoplayer2.source.rtsp.b bVar, long j, long j2) {
            if (f.this.f() == 0) {
                if (!f.this.q1) {
                    f.this.Z();
                    return;
                }
                return;
            }
            int i = 0;
            while (true) {
                if (i >= f.this.Z0.size()) {
                    break;
                }
                e eVar = (e) f.this.Z0.get(i);
                if (eVar.a.b == bVar) {
                    eVar.c();
                    break;
                }
                i++;
            }
            f.this.Y0.a0();
        }

        @Override // o.R11.b
        /* renamed from: l */
        public R11.c N(com.google.android.exoplayer2.source.rtsp.b bVar, long j, long j2, IOException iOException, int i) {
            if (!f.this.n1) {
                f.this.f1 = iOException;
            } else if (iOException.getCause() instanceof BindException) {
                if (f.j(f.this) < 3) {
                    return R11.i;
                }
            } else {
                f.this.g1 = new RtspMediaSource.c(bVar.b.b.toString(), iOException);
            }
            return R11.k;
        }

        @Override // o.InterfaceC4518Vj0
        public void n() {
            Handler handler = f.this.Y;
            final f fVar = f.this;
            handler.post(new Runnable() { // from class: o.XV1
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.exoplayer2.source.rtsp.f.this.V();
                }
            });
        }

        @Override // o.InterfaceC4518Vj0
        public void p(KZ1 kz1) {
        }
    }

    @Override // o.InterfaceC4410Ug1
    public long e(long j, LZ1 lz1) {
        return j;
    }
}
