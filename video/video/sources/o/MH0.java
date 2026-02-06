package o;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.OU;
import o.UH0;

@Deprecated
/* loaded from: classes2.dex */
public class MH0 {
    public static final int v = 0;
    public static final int w = 1;
    public static final int x = 2;
    public static final int y = 4;
    public final PH0 a;
    public final FU b;
    public final FU c;
    public final C10314vp2 d;
    public final Uri[] e;
    public final C10833xx0[] f;
    public final ZH0 g;
    public final C9593sr2 h;
    @InterfaceC11300zs1
    public final List<C10833xx0> i;
    public final ND1 k;
    @InterfaceC11300zs1
    public final C10415wE l;
    public final long m;
    public boolean n;
    @InterfaceC11300zs1
    public IOException p;
    @InterfaceC11300zs1
    public Uri q;
    public boolean r;
    public InterfaceC6859hi0 s;
    public boolean u;
    public final C10886yA0 j = new C10886yA0(4);

    /* renamed from: o  reason: collision with root package name */
    public byte[] f543o = TD2.f;
    public long t = C10323vs.b;

    /* loaded from: classes2.dex */
    public static final class a extends AbstractC9747tU {
        public byte[] m;

        public a(FU fu, OU ou, C10833xx0 c10833xx0, int i, @InterfaceC11300zs1 Object obj, byte[] bArr) {
            super(fu, ou, 3, c10833xx0, i, obj, bArr);
        }

        @Override // o.AbstractC9747tU
        public void g(byte[] bArr, int i) {
            this.m = Arrays.copyOf(bArr, i);
        }

        @InterfaceC11300zs1
        public byte[] j() {
            return this.m;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        @InterfaceC11300zs1
        public AbstractC6238fC a;
        public boolean b;
        @InterfaceC11300zs1
        public Uri c;

        public b() {
            a();
        }

        public void a() {
            this.a = null;
            this.b = false;
            this.c = null;
        }
    }

    @InterfaceC5056aJ2
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC10052ul {
        public final List<UH0.f> e;
        public final long f;
        public final String g;

        public c(String str, long j, List<UH0.f> list) {
            super(0L, list.size() - 1);
            this.g = str;
            this.f = j;
            this.e = list;
        }

        @Override // o.InterfaceC2631Ce1
        public long a() {
            e();
            return this.f + this.e.get((int) f()).Z0;
        }

        @Override // o.InterfaceC2631Ce1
        public long b() {
            e();
            UH0.f fVar = this.e.get((int) f());
            return this.f + fVar.Z0 + fVar.Z;
        }

        @Override // o.InterfaceC2631Ce1
        public OU d() {
            e();
            UH0.f fVar = this.e.get((int) f());
            return new OU(RC2.f(this.g, fVar.X), fVar.d1, fVar.e1);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends AbstractC4037Ql {
        public int j;

        public d(C9593sr2 c9593sr2, int[] iArr) {
            super(c9593sr2, iArr);
            this.j = o(c9593sr2.c(iArr[0]));
        }

        @Override // o.InterfaceC6859hi0
        public int f() {
            return this.j;
        }

        @Override // o.InterfaceC6859hi0
        @InterfaceC11300zs1
        public Object j() {
            return null;
        }

        @Override // o.InterfaceC6859hi0
        public void l(long j, long j2, long j3, List<? extends AbstractC2533Be1> list, InterfaceC2631Ce1[] interfaceC2631Ce1Arr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!d(this.j, elapsedRealtime)) {
                return;
            }
            for (int i = this.d - 1; i >= 0; i--) {
                if (!d(i, elapsedRealtime)) {
                    this.j = i;
                    return;
                }
            }
            throw new IllegalStateException();
        }

        @Override // o.InterfaceC6859hi0
        public int u() {
            return 0;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e {
        public final UH0.f a;
        public final long b;
        public final int c;
        public final boolean d;

        public e(UH0.f fVar, long j, int i) {
            boolean z;
            this.a = fVar;
            this.b = j;
            this.c = i;
            if ((fVar instanceof UH0.b) && ((UH0.b) fVar).h1) {
                z = true;
            } else {
                z = false;
            }
            this.d = z;
        }
    }

    public MH0(PH0 ph0, ZH0 zh0, Uri[] uriArr, C10833xx0[] c10833xx0Arr, NH0 nh0, @InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2, C10314vp2 c10314vp2, long j, @InterfaceC11300zs1 List<C10833xx0> list, ND1 nd1, @InterfaceC11300zs1 C10415wE c10415wE) {
        this.a = ph0;
        this.g = zh0;
        this.e = uriArr;
        this.f = c10833xx0Arr;
        this.d = c10314vp2;
        this.m = j;
        this.i = list;
        this.k = nd1;
        this.l = c10415wE;
        FU a2 = nh0.a(1);
        this.b = a2;
        if (interfaceC4261Sr2 != null) {
            a2.s(interfaceC4261Sr2);
        }
        this.c = nh0.a(3);
        this.h = new C9593sr2(c10833xx0Arr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((c10833xx0Arr[i].Z0 & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.s = new d(this.h, C7775lT0.B(arrayList));
    }

    @InterfaceC11300zs1
    public static Uri d(UH0 uh0, @InterfaceC11300zs1 UH0.f fVar) {
        String str;
        if (fVar != null && (str = fVar.b1) != null) {
            return RC2.f(uh0.a, str);
        }
        return null;
    }

    @InterfaceC11300zs1
    public static e h(UH0 uh0, long j, int i) {
        int i2 = (int) (j - uh0.k);
        if (i2 == uh0.r.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i >= uh0.s.size()) {
                return null;
            }
            return new e(uh0.s.get(i), j, i);
        }
        UH0.e eVar = uh0.r.get(i2);
        if (i == -1) {
            return new e(eVar, j, -1);
        }
        if (i < eVar.h1.size()) {
            return new e(eVar.h1.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < uh0.r.size()) {
            return new e(uh0.r.get(i3), j + 1, -1);
        }
        if (uh0.s.isEmpty()) {
            return null;
        }
        return new e(uh0.s.get(0), j + 1, 0);
    }

    @InterfaceC5056aJ2
    public static List<UH0.f> j(UH0 uh0, long j, int i) {
        int i2 = (int) (j - uh0.k);
        if (i2 >= 0 && uh0.r.size() >= i2) {
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            if (i2 < uh0.r.size()) {
                if (i != -1) {
                    UH0.e eVar = uh0.r.get(i2);
                    if (i == 0) {
                        arrayList.add(eVar);
                    } else if (i < eVar.h1.size()) {
                        List<UH0.b> list = eVar.h1;
                        arrayList.addAll(list.subList(i, list.size()));
                    }
                    i2++;
                }
                List<UH0.e> list2 = uh0.r;
                arrayList.addAll(list2.subList(i2, list2.size()));
                i = 0;
            }
            if (uh0.n != C10323vs.b) {
                if (i != -1) {
                    i3 = i;
                }
                if (i3 < uh0.s.size()) {
                    List<UH0.b> list3 = uh0.s;
                    arrayList.addAll(list3.subList(i3, list3.size()));
                }
            }
            return Collections.unmodifiableList(arrayList);
        }
        return AbstractC5317bO0.L();
    }

    public InterfaceC2631Ce1[] a(@InterfaceC11300zs1 RH0 rh0, long j) {
        int d2;
        boolean z;
        if (rh0 == null) {
            d2 = -1;
        } else {
            d2 = this.h.d(rh0.d);
        }
        int i = d2;
        int length = this.s.length();
        InterfaceC2631Ce1[] interfaceC2631Ce1Arr = new InterfaceC2631Ce1[length];
        for (int i2 = 0; i2 < length; i2++) {
            int g = this.s.g(i2);
            Uri uri = this.e[g];
            if (!this.g.f(uri)) {
                interfaceC2631Ce1Arr[i2] = InterfaceC2631Ce1.a;
            } else {
                UH0 l = this.g.l(uri, false);
                C9542sf.g(l);
                long c2 = l.h - this.g.c();
                if (g != i) {
                    z = true;
                } else {
                    z = false;
                }
                Pair<Long, Integer> g2 = g(rh0, z, l, c2, j);
                interfaceC2631Ce1Arr[i2] = new c(l.a, c2, j(l, ((Long) g2.first).longValue(), ((Integer) g2.second).intValue()));
            }
        }
        return interfaceC2631Ce1Arr;
    }

    public long b(long j, LZ1 lz1) {
        UH0 uh0;
        long j2;
        int f = this.s.f();
        Uri[] uriArr = this.e;
        if (f < uriArr.length && f != -1) {
            uh0 = this.g.l(uriArr[this.s.s()], true);
        } else {
            uh0 = null;
        }
        if (uh0 != null && !uh0.r.isEmpty() && uh0.c) {
            long c2 = uh0.h - this.g.c();
            long j3 = j - c2;
            int k = TD2.k(uh0.r, Long.valueOf(j3), true, true);
            long j4 = uh0.r.get(k).Z0;
            if (k != uh0.r.size() - 1) {
                j2 = uh0.r.get(k + 1).Z0;
            } else {
                j2 = j4;
            }
            return lz1.a(j3, j4, j2) + c2;
        }
        return j;
    }

    public int c(RH0 rh0) {
        List<UH0.b> list;
        if (rh0.f596o == -1) {
            return 1;
        }
        UH0 uh0 = (UH0) C9542sf.g(this.g.l(this.e[this.h.d(rh0.d)], false));
        int i = (int) (rh0.j - uh0.k);
        if (i < 0) {
            return 1;
        }
        if (i < uh0.r.size()) {
            list = uh0.r.get(i).h1;
        } else {
            list = uh0.s;
        }
        if (rh0.f596o >= list.size()) {
            return 2;
        }
        UH0.b bVar = list.get(rh0.f596o);
        if (bVar.h1) {
            return 0;
        }
        if (TD2.g(Uri.parse(RC2.e(uh0.a, bVar.X)), rh0.b.a)) {
            return 1;
        }
        return 2;
    }

    public final boolean e() {
        C10833xx0 c2 = this.h.c(this.s.f());
        String c3 = C4128Rj1.c(c2.d1);
        String o2 = C4128Rj1.o(c2.d1);
        if (c3 != null && o2 != null) {
            return true;
        }
        return false;
    }

    public void f(long j, long j2, List<RH0> list, boolean z, b bVar) {
        RH0 rh0;
        int d2;
        boolean z2;
        String c2;
        if (list.isEmpty()) {
            rh0 = null;
        } else {
            rh0 = (RH0) C5098aU0.w(list);
        }
        if (rh0 == null) {
            d2 = -1;
        } else {
            d2 = this.h.d(rh0.d);
        }
        long j3 = j2 - j;
        long t = t(j);
        if (rh0 != null && !this.r) {
            long d3 = rh0.d();
            j3 = Math.max(0L, j3 - d3);
            if (t != C10323vs.b) {
                t = Math.max(0L, t - d3);
            }
        }
        long j4 = j3;
        this.s.l(j, j4, t, list, a(rh0, j2));
        int s = this.s.s();
        if (d2 != s) {
            z2 = true;
        } else {
            z2 = false;
        }
        Uri uri = this.e[s];
        if (!this.g.f(uri)) {
            bVar.c = uri;
            this.u &= uri.equals(this.q);
            this.q = uri;
            return;
        }
        UH0 l = this.g.l(uri, true);
        C9542sf.g(l);
        this.r = l.c;
        x(l);
        Uri uri2 = uri;
        UH0 uh0 = l;
        long c3 = l.h - this.g.c();
        Pair<Long, Integer> g = g(rh0, z2, uh0, c3, j2);
        long longValue = ((Long) g.first).longValue();
        int intValue = ((Integer) g.second).intValue();
        if (longValue < uh0.k && rh0 != null && z2) {
            uri2 = this.e[d2];
            UH0 l2 = this.g.l(uri2, true);
            C9542sf.g(l2);
            c3 = l2.h - this.g.c();
            uh0 = l2;
            Pair<Long, Integer> g2 = g(rh0, false, uh0, c3, j2);
            longValue = ((Long) g2.first).longValue();
            intValue = ((Integer) g2.second).intValue();
        } else {
            d2 = s;
        }
        int i = intValue;
        long j5 = c3;
        UH0 uh02 = uh0;
        Uri uri3 = uri2;
        if (longValue < uh02.k) {
            this.p = new C4041Qm();
            return;
        }
        e h = h(uh02, longValue, i);
        if (h == null) {
            if (!uh02.f624o) {
                bVar.c = uri3;
                this.u &= uri3.equals(this.q);
                this.q = uri3;
                return;
            } else if (!z && !uh02.r.isEmpty()) {
                h = new e((UH0.f) C5098aU0.w(uh02.r), (uh02.k + uh02.r.size()) - 1, -1);
            } else {
                bVar.b = true;
                return;
            }
        }
        this.u = false;
        C10901yE c10901yE = null;
        this.q = null;
        C10415wE c10415wE = this.l;
        if (c10415wE != null) {
            C10901yE c10901yE2 = new C10901yE(c10415wE, this.s, j4, C10901yE.i, !uh02.f624o);
            if (e()) {
                c2 = C10901yE.p;
            } else {
                c2 = C10901yE.c(this.s);
            }
            c10901yE = c10901yE2.e(c2);
        }
        Uri d4 = d(uh02, h.a.Y);
        AbstractC6238fC m = m(d4, d2, true, c10901yE);
        bVar.a = m;
        if (m == null) {
            Uri d5 = d(uh02, h.a);
            AbstractC6238fC m2 = m(d5, d2, false, c10901yE);
            bVar.a = m2;
            if (m2 == null) {
                boolean w2 = RH0.w(rh0, uri3, uh02, h, j5);
                if (w2 && h.d) {
                    return;
                }
                e eVar = h;
                bVar.a = RH0.j(this.a, this.b, this.f[d2], j5, uh02, eVar, uri3, this.i, this.s.u(), this.s.j(), this.n, this.d, this.m, rh0, this.j.b(d5), this.j.b(d4), w2, this.k, c10901yE);
            }
        }
    }

    public final Pair<Long, Integer> g(@InterfaceC11300zs1 RH0 rh0, boolean z, UH0 uh0, long j, long j2) {
        boolean z2;
        List<UH0.b> list;
        long j3;
        long j4;
        int i = -1;
        if (rh0 != null && !z) {
            if (rh0.h()) {
                if (rh0.f596o == -1) {
                    j4 = rh0.g();
                } else {
                    j4 = rh0.j;
                }
                Long valueOf = Long.valueOf(j4);
                int i2 = rh0.f596o;
                if (i2 != -1) {
                    i = i2 + 1;
                }
                return new Pair<>(valueOf, Integer.valueOf(i));
            }
            return new Pair<>(Long.valueOf(rh0.j), Integer.valueOf(rh0.f596o));
        }
        long j5 = uh0.u + j;
        if (rh0 != null && !this.r) {
            j2 = rh0.g;
        }
        if (!uh0.f624o && j2 >= j5) {
            return new Pair<>(Long.valueOf(uh0.k + uh0.r.size()), -1);
        }
        long j6 = j2 - j;
        List<UH0.e> list2 = uh0.r;
        Long valueOf2 = Long.valueOf(j6);
        int i3 = 0;
        if (this.g.i() && rh0 != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        int k = TD2.k(list2, valueOf2, true, z2);
        long j7 = k + uh0.k;
        if (k >= 0) {
            UH0.e eVar = uh0.r.get(k);
            if (j6 < eVar.Z0 + eVar.Z) {
                list = eVar.h1;
            } else {
                list = uh0.s;
            }
            while (true) {
                if (i3 >= list.size()) {
                    break;
                }
                UH0.b bVar = list.get(i3);
                if (j6 < bVar.Z0 + bVar.Z) {
                    if (bVar.g1) {
                        if (list == uh0.s) {
                            j3 = 1;
                        } else {
                            j3 = 0;
                        }
                        j7 += j3;
                        i = i3;
                    }
                } else {
                    i3++;
                }
            }
        }
        return new Pair<>(Long.valueOf(j7), Integer.valueOf(i));
    }

    public int i(long j, List<? extends AbstractC2533Be1> list) {
        if (this.p == null && this.s.length() >= 2) {
            return this.s.r(j, list);
        }
        return list.size();
    }

    public C9593sr2 k() {
        return this.h;
    }

    public InterfaceC6859hi0 l() {
        return this.s;
    }

    @InterfaceC11300zs1
    public final AbstractC6238fC m(@InterfaceC11300zs1 Uri uri, int i, boolean z, @InterfaceC11300zs1 C10901yE c10901yE) {
        if (uri == null) {
            return null;
        }
        byte[] d2 = this.j.d(uri);
        if (d2 != null) {
            this.j.c(uri, d2);
            return null;
        }
        AbstractC6044eO0<String, String> u = AbstractC6044eO0.u();
        if (c10901yE != null) {
            if (z) {
                c10901yE.e("i");
            }
            u = c10901yE.a();
        }
        return new a(this.c, new OU.b().j(uri).c(1).f(u).a(), this.f[i], this.s.u(), this.s.j(), this.f543o);
    }

    public boolean n(AbstractC6238fC abstractC6238fC, long j) {
        InterfaceC6859hi0 interfaceC6859hi0 = this.s;
        return interfaceC6859hi0.h(interfaceC6859hi0.m(this.h.d(abstractC6238fC.d)), j);
    }

    public void o() throws IOException {
        IOException iOException = this.p;
        if (iOException == null) {
            Uri uri = this.q;
            if (uri != null && this.u) {
                this.g.a(uri);
                return;
            }
            return;
        }
        throw iOException;
    }

    public boolean p(Uri uri) {
        return TD2.y(this.e, uri);
    }

    public void q(AbstractC6238fC abstractC6238fC) {
        if (abstractC6238fC instanceof a) {
            a aVar = (a) abstractC6238fC;
            this.f543o = aVar.h();
            this.j.c(aVar.b.a, (byte[]) C9542sf.g(aVar.j()));
        }
    }

    public boolean r(Uri uri, long j) {
        int m;
        int i = 0;
        while (true) {
            Uri[] uriArr = this.e;
            if (i < uriArr.length) {
                if (uriArr[i].equals(uri)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1 || (m = this.s.m(i)) == -1) {
            return true;
        }
        this.u |= uri.equals(this.q);
        if (j != C10323vs.b && (!this.s.h(m, j) || !this.g.j(uri, j))) {
            return false;
        }
        return true;
    }

    public void s() {
        this.p = null;
    }

    public final long t(long j) {
        long j2 = this.t;
        if (j2 == C10323vs.b) {
            return C10323vs.b;
        }
        return j2 - j;
    }

    public void u(boolean z) {
        this.n = z;
    }

    public void v(InterfaceC6859hi0 interfaceC6859hi0) {
        this.s = interfaceC6859hi0;
    }

    public boolean w(long j, AbstractC6238fC abstractC6238fC, List<? extends AbstractC2533Be1> list) {
        if (this.p != null) {
            return false;
        }
        return this.s.e(j, abstractC6238fC, list);
    }

    public final void x(UH0 uh0) {
        long e2;
        if (uh0.f624o) {
            e2 = C10323vs.b;
        } else {
            e2 = uh0.e() - this.g.c();
        }
        this.t = e2;
    }
}
