package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.c;
import com.google.android.exoplayer2.source.dash.d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.AD2;
import o.AbstractC10541wl;
import o.AbstractC7373jp2;
import o.C10323vs;
import o.C10415wE;
import o.C10519wf1;
import o.C11223zZ;
import o.C2555Bk;
import o.C3031Gd2;
import o.C3989Py1;
import o.C4086Qy1;
import o.C4128Rj1;
import o.C4331Tl;
import o.C6067eU;
import o.C6310fU;
import o.C6361fi0;
import o.C6565gU;
import o.C6566gU0;
import o.C6903ht0;
import o.C8190n7;
import o.C8322nf1;
import o.C8781pY;
import o.C92;
import o.C9542sf;
import o.CC1;
import o.FU;
import o.I12;
import o.I31;
import o.InterfaceC10877y8;
import o.InterfaceC11300zs1;
import o.InterfaceC4261Sr2;
import o.InterfaceC4410Ug1;
import o.InterfaceC6181ey;
import o.InterfaceC7292jU;
import o.InterfaceC7583kh1;
import o.InterfaceC9170r70;
import o.InterfaceC9309rh1;
import o.InterfaceC9552sh1;
import o.InterfaceC9656t70;
import o.KB;
import o.M11;
import o.N11;
import o.OY;
import o.R11;
import o.R41;
import o.T11;
import o.TD2;
import o.VI;
import o.ZR1;

@Deprecated
/* loaded from: classes2.dex */
public final class DashMediaSource extends AbstractC10541wl {
    public static final long M1 = 30000;
    @Deprecated
    public static final long N1 = 30000;
    public static final String O1 = "DashMediaSource";
    public static final long P1 = 5000000;
    public static final long Q1 = 5000;
    public static final String R1 = "DashMediaSource";
    public Handler A1;
    public C8322nf1.g B1;
    public Uri C1;
    public Uri D1;
    public C6067eU E1;
    public boolean F1;
    public long G1;
    public long H1;
    public long I1;
    public int J1;
    public long K1;
    public int L1;
    public final C8322nf1 c1;
    public final boolean d1;
    public final FU.a e1;
    public final a.InterfaceC0092a f1;
    public final VI g1;
    @InterfaceC11300zs1
    public final C10415wE h1;
    public final InterfaceC9170r70 i1;
    public final M11 j1;
    public final C4331Tl k1;
    public final long l1;
    public final long m1;
    public final InterfaceC9309rh1.a n1;
    public final C4086Qy1.a<? extends C6067eU> o1;
    public final e p1;
    public final Object q1;
    public final SparseArray<com.google.android.exoplayer2.source.dash.b> r1;
    public final Runnable s1;
    public final Runnable t1;
    public final d.b u1;
    public final T11 v1;
    public FU w1;
    public R11 x1;
    @InterfaceC11300zs1
    public InterfaceC4261Sr2 y1;
    public IOException z1;

    /* loaded from: classes2.dex */
    public static final class Factory implements InterfaceC9552sh1 {
        public final a.InterfaceC0092a c;
        @InterfaceC11300zs1
        public final FU.a d;
        public C10415wE.b e;
        public InterfaceC9656t70 f;
        public VI g;
        public M11 h;
        public long i;
        public long j;
        @InterfaceC11300zs1
        public C4086Qy1.a<? extends C6067eU> k;

        public Factory(FU.a aVar) {
            this(new c.a(aVar), aVar);
        }

        @Override // o.InterfaceC7583kh1.a
        public int[] b() {
            return new int[]{0};
        }

        public DashMediaSource f(C6067eU c6067eU) {
            return g(c6067eU, new C8322nf1.c().L(Uri.EMPTY).D("DashMediaSource").F(C4128Rj1.t0).a());
        }

        public DashMediaSource g(C6067eU c6067eU, C8322nf1 c8322nf1) {
            C10415wE a;
            C9542sf.a(!c6067eU.d);
            C8322nf1.c F = c8322nf1.b().F(C4128Rj1.t0);
            if (c8322nf1.Y == null) {
                F.L(Uri.EMPTY);
            }
            C8322nf1 a2 = F.a();
            C10415wE.b bVar = this.e;
            if (bVar == null) {
                a = null;
            } else {
                a = bVar.a(a2);
            }
            return new DashMediaSource(a2, c6067eU, null, null, this.c, this.g, a, this.f.a(a2), this.h, this.i, this.j, null);
        }

        @Override // o.InterfaceC7583kh1.a
        /* renamed from: h */
        public DashMediaSource e(C8322nf1 c8322nf1) {
            C6903ht0 c6903ht0;
            C10415wE a;
            C9542sf.g(c8322nf1.Y);
            C4086Qy1.a aVar = this.k;
            if (aVar == null) {
                aVar = new C6310fU();
            }
            List<C3031Gd2> list = c8322nf1.Y.Z0;
            if (!list.isEmpty()) {
                c6903ht0 = new C6903ht0(aVar, list);
            } else {
                c6903ht0 = aVar;
            }
            C10415wE.b bVar = this.e;
            if (bVar == null) {
                a = null;
            } else {
                a = bVar.a(c8322nf1);
            }
            return new DashMediaSource(c8322nf1, null, this.d, c6903ht0, this.c, this.g, a, this.f.a(c8322nf1), this.h, this.i, this.j, null);
        }

        @Override // o.InterfaceC7583kh1.a
        @InterfaceC6181ey
        /* renamed from: i */
        public Factory c(C10415wE.b bVar) {
            this.e = (C10415wE.b) C9542sf.g(bVar);
            return this;
        }

        @InterfaceC6181ey
        public Factory j(VI vi) {
            this.g = (VI) C9542sf.h(vi, "DashMediaSource.Factory#setCompositeSequenceableLoaderFactory no longer handles null by instantiating a new DefaultCompositeSequenceableLoaderFactory. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // o.InterfaceC7583kh1.a
        @InterfaceC6181ey
        /* renamed from: k */
        public Factory d(InterfaceC9656t70 interfaceC9656t70) {
            this.f = (InterfaceC9656t70) C9542sf.h(interfaceC9656t70, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @InterfaceC6181ey
        public Factory l(long j) {
            this.i = j;
            return this;
        }

        @Override // o.InterfaceC7583kh1.a
        @InterfaceC6181ey
        /* renamed from: m */
        public Factory a(M11 m11) {
            this.h = (M11) C9542sf.h(m11, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @InterfaceC6181ey
        public Factory n(@InterfaceC11300zs1 C4086Qy1.a<? extends C6067eU> aVar) {
            this.k = aVar;
            return this;
        }

        @InterfaceC6181ey
        public Factory o(long j) {
            this.j = j;
            return this;
        }

        public Factory(a.InterfaceC0092a interfaceC0092a, @InterfaceC11300zs1 FU.a aVar) {
            this.c = (a.InterfaceC0092a) C9542sf.g(interfaceC0092a);
            this.d = aVar;
            this.f = new OY();
            this.h = new C11223zZ();
            this.i = 30000L;
            this.j = 5000000L;
            this.g = new C8781pY();
        }
    }

    /* loaded from: classes2.dex */
    public class a implements C92.b {
        public a() {
        }

        @Override // o.C92.b
        public void a() {
            DashMediaSource.this.O0(C92.h());
        }

        @Override // o.C92.b
        public void b(IOException iOException) {
            DashMediaSource.this.N0(iOException);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends AbstractC7373jp2 {
        public final long a1;
        public final long b1;
        public final long c1;
        public final int d1;
        public final long e1;
        public final long f1;
        public final long g1;
        public final C6067eU h1;
        public final C8322nf1 i1;
        @InterfaceC11300zs1
        public final C8322nf1.g j1;

        public b(long j, long j2, long j3, int i, long j4, long j5, long j6, C6067eU c6067eU, C8322nf1 c8322nf1, @InterfaceC11300zs1 C8322nf1.g gVar) {
            boolean z;
            boolean z2 = c6067eU.d;
            if (gVar != null) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.i(z2 == z);
            this.a1 = j;
            this.b1 = j2;
            this.c1 = j3;
            this.d1 = i;
            this.e1 = j4;
            this.f1 = j5;
            this.g1 = j6;
            this.h1 = c6067eU;
            this.i1 = c8322nf1;
            this.j1 = gVar;
        }

        public static boolean B(C6067eU c6067eU) {
            if (c6067eU.d && c6067eU.e != C10323vs.b && c6067eU.b == C10323vs.b) {
                return true;
            }
            return false;
        }

        public final long A(long j) {
            InterfaceC7292jU b;
            long j2 = this.g1;
            if (!B(this.h1)) {
                return j2;
            }
            if (j > 0) {
                j2 += j;
                if (j2 > this.f1) {
                    return C10323vs.b;
                }
            }
            long j3 = this.e1 + j2;
            long g = this.h1.g(0);
            int i = 0;
            while (i < this.h1.e() - 1 && j3 >= g) {
                j3 -= g;
                i++;
                g = this.h1.g(i);
            }
            CC1 d = this.h1.d(i);
            int a = d.a(2);
            if (a != -1 && (b = d.c.get(a).c.get(0).b()) != null && b.i(g) != 0) {
                return (j2 + b.c(b.h(j3, g))) - j3;
            }
            return j2;
        }

        @Override // o.AbstractC7373jp2
        public int g(Object obj) {
            int intValue;
            if (!(obj instanceof Integer) || (intValue = ((Integer) obj).intValue() - this.d1) < 0 || intValue >= n()) {
                return -1;
            }
            return intValue;
        }

        @Override // o.AbstractC7373jp2
        public AbstractC7373jp2.b l(int i, AbstractC7373jp2.b bVar, boolean z) {
            String str;
            C9542sf.c(i, 0, n());
            Integer num = null;
            if (z) {
                str = this.h1.d(i).a;
            } else {
                str = null;
            }
            if (z) {
                num = Integer.valueOf(this.d1 + i);
            }
            return bVar.y(str, num, 0, this.h1.g(i), TD2.j1(this.h1.d(i).b - this.h1.d(0).b) - this.e1);
        }

        @Override // o.AbstractC7373jp2
        public int n() {
            return this.h1.e();
        }

        @Override // o.AbstractC7373jp2
        public Object t(int i) {
            C9542sf.c(i, 0, n());
            return Integer.valueOf(this.d1 + i);
        }

        @Override // o.AbstractC7373jp2
        public AbstractC7373jp2.d v(int i, AbstractC7373jp2.d dVar, long j) {
            C9542sf.c(i, 0, 1);
            long A = A(j);
            Object obj = AbstractC7373jp2.d.m1;
            C8322nf1 c8322nf1 = this.i1;
            C6067eU c6067eU = this.h1;
            return dVar.l(obj, c8322nf1, c6067eU, this.a1, this.b1, this.c1, true, B(c6067eU), this.j1, A, this.f1, 0, n() - 1, this.e1);
        }

        @Override // o.AbstractC7373jp2
        public int w() {
            return 1;
        }
    }

    /* loaded from: classes2.dex */
    public final class c implements d.b {
        public c() {
        }

        @Override // com.google.android.exoplayer2.source.dash.d.b
        public void a(long j) {
            DashMediaSource.this.G0(j);
        }

        @Override // com.google.android.exoplayer2.source.dash.d.b
        public void b() {
            DashMediaSource.this.H0();
        }

        public /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements C4086Qy1.a<Long> {
        public static final Pattern a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        @Override // o.C4086Qy1.a
        /* renamed from: b */
        public Long a(Uri uri, InputStream inputStream) throws IOException {
            long j;
            long parseLong;
            String readLine = new BufferedReader(new InputStreamReader(inputStream, KB.c)).readLine();
            try {
                Matcher matcher = a.matcher(readLine);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    long time = simpleDateFormat.parse(group).getTime();
                    if (!"Z".equals(matcher.group(2))) {
                        if (C2555Bk.p1.equals(matcher.group(4))) {
                            j = 1;
                        } else {
                            j = -1;
                        }
                        long parseLong2 = Long.parseLong(matcher.group(5));
                        String group2 = matcher.group(7);
                        if (TextUtils.isEmpty(group2)) {
                            parseLong = 0;
                        } else {
                            parseLong = Long.parseLong(group2);
                        }
                        time -= j * (((parseLong2 * 60) + parseLong) * 60000);
                    }
                    return Long.valueOf(time);
                }
                throw C3989Py1.c("Couldn't parse timestamp: " + readLine, null);
            } catch (ParseException e) {
                throw C3989Py1.c(null, e);
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class e implements R11.b<C4086Qy1<C6067eU>> {
        public e() {
        }

        @Override // o.R11.b
        /* renamed from: a */
        public void M(C4086Qy1<C6067eU> c4086Qy1, long j, long j2, boolean z) {
            DashMediaSource.this.I0(c4086Qy1, j, j2);
        }

        @Override // o.R11.b
        /* renamed from: b */
        public void t(C4086Qy1<C6067eU> c4086Qy1, long j, long j2) {
            DashMediaSource.this.J0(c4086Qy1, j, j2);
        }

        @Override // o.R11.b
        /* renamed from: c */
        public R11.c N(C4086Qy1<C6067eU> c4086Qy1, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.K0(c4086Qy1, j, j2, iOException, i);
        }

        public /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public final class f implements T11 {
        public f() {
        }

        @Override // o.T11
        public void a(int i) throws IOException {
            DashMediaSource.this.x1.a(i);
            c();
        }

        @Override // o.T11
        public void b() throws IOException {
            DashMediaSource.this.x1.b();
            c();
        }

        public final void c() throws IOException {
            if (DashMediaSource.this.z1 == null) {
                return;
            }
            throw DashMediaSource.this.z1;
        }
    }

    /* loaded from: classes2.dex */
    public final class g implements R11.b<C4086Qy1<Long>> {
        public g() {
        }

        @Override // o.R11.b
        /* renamed from: a */
        public void M(C4086Qy1<Long> c4086Qy1, long j, long j2, boolean z) {
            DashMediaSource.this.I0(c4086Qy1, j, j2);
        }

        @Override // o.R11.b
        /* renamed from: b */
        public void t(C4086Qy1<Long> c4086Qy1, long j, long j2) {
            DashMediaSource.this.L0(c4086Qy1, j, j2);
        }

        @Override // o.R11.b
        /* renamed from: c */
        public R11.c N(C4086Qy1<Long> c4086Qy1, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.M0(c4086Qy1, j, j2, iOException);
        }

        public /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class h implements C4086Qy1.a<Long> {
        public h() {
        }

        @Override // o.C4086Qy1.a
        /* renamed from: b */
        public Long a(Uri uri, InputStream inputStream) throws IOException {
            return Long.valueOf(TD2.s1(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }

        public /* synthetic */ h(a aVar) {
            this();
        }
    }

    static {
        C6361fi0.a("goog.exo.dash");
    }

    public /* synthetic */ DashMediaSource(C8322nf1 c8322nf1, C6067eU c6067eU, FU.a aVar, C4086Qy1.a aVar2, a.InterfaceC0092a interfaceC0092a, VI vi, C10415wE c10415wE, InterfaceC9170r70 interfaceC9170r70, M11 m11, long j, long j2, a aVar3) {
        this(c8322nf1, c6067eU, aVar, aVar2, interfaceC0092a, vi, c10415wE, interfaceC9170r70, m11, j, j2);
    }

    public static long A0(CC1 cc1, long j, long j2) {
        long j1 = TD2.j1(cc1.b);
        boolean D0 = D0(cc1);
        long j3 = j1;
        for (int i = 0; i < cc1.c.size(); i++) {
            C8190n7 c8190n7 = cc1.c.get(i);
            List<ZR1> list = c8190n7.c;
            int i2 = c8190n7.b;
            boolean z = true;
            z = (i2 == 1 || i2 == 2) ? false : false;
            if ((!D0 || !z) && !list.isEmpty()) {
                InterfaceC7292jU b2 = list.get(0).b();
                if (b2 == null || b2.l(j, j2) == 0) {
                    return j1;
                }
                j3 = Math.max(j3, b2.c(b2.e(j, j2)) + j1);
            }
        }
        return j3;
    }

    public static long B0(C6067eU c6067eU, long j) {
        InterfaceC7292jU b2;
        int e2 = c6067eU.e() - 1;
        CC1 d2 = c6067eU.d(e2);
        long j1 = TD2.j1(d2.b);
        long g2 = c6067eU.g(e2);
        long j12 = TD2.j1(j);
        long j13 = TD2.j1(c6067eU.a);
        long j14 = TD2.j1(5000L);
        for (int i = 0; i < d2.c.size(); i++) {
            List<ZR1> list = d2.c.get(i).c;
            if (!list.isEmpty() && (b2 = list.get(0).b()) != null) {
                long f2 = ((j13 + j1) + b2.f(g2, j12)) - j12;
                if (f2 < j14 - 100000 || (f2 > j14 && f2 < j14 + 100000)) {
                    j14 = f2;
                }
            }
        }
        return R41.g(j14, 1000L, RoundingMode.CEILING);
    }

    public static boolean D0(CC1 cc1) {
        for (int i = 0; i < cc1.c.size(); i++) {
            int i2 = cc1.c.get(i).b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    public static boolean E0(CC1 cc1) {
        for (int i = 0; i < cc1.c.size(); i++) {
            InterfaceC7292jU b2 = cc1.c.get(i).c.get(0).b();
            if (b2 == null || b2.j()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0() {
        Uri uri;
        this.A1.removeCallbacks(this.s1);
        if (this.x1.j()) {
            return;
        }
        if (this.x1.k()) {
            this.F1 = true;
            return;
        }
        synchronized (this.q1) {
            uri = this.C1;
        }
        this.F1 = false;
        V0(new C4086Qy1(this.w1, uri, 4, this.o1), this.p1, this.j1.a(4));
    }

    public static long z0(CC1 cc1, long j, long j2) {
        long j1 = TD2.j1(cc1.b);
        boolean D0 = D0(cc1);
        long j3 = Long.MAX_VALUE;
        for (int i = 0; i < cc1.c.size(); i++) {
            C8190n7 c8190n7 = cc1.c.get(i);
            List<ZR1> list = c8190n7.c;
            int i2 = c8190n7.b;
            boolean z = true;
            z = (i2 == 1 || i2 == 2) ? false : false;
            if ((!D0 || !z) && !list.isEmpty()) {
                InterfaceC7292jU b2 = list.get(0).b();
                if (b2 == null) {
                    return j1 + j;
                }
                long l = b2.l(j, j2);
                if (l == 0) {
                    return j1;
                }
                long e2 = (b2.e(j, j2) + l) - 1;
                j3 = Math.min(j3, b2.d(e2, j) + b2.c(e2) + j1);
            }
        }
        return j3;
    }

    public final long C0() {
        return Math.min((this.J1 - 1) * 1000, 5000);
    }

    public final void F0() {
        C92.j(this.x1, new a());
    }

    public void G0(long j) {
        long j2 = this.K1;
        if (j2 != C10323vs.b && j2 >= j) {
            return;
        }
        this.K1 = j;
    }

    public void H0() {
        this.A1.removeCallbacks(this.t1);
        W0();
    }

    public void I0(C4086Qy1<?> c4086Qy1, long j, long j2) {
        N11 n11 = new N11(c4086Qy1.a, c4086Qy1.b, c4086Qy1.f(), c4086Qy1.d(), j, j2, c4086Qy1.b());
        this.j1.c(c4086Qy1.a);
        this.n1.j(n11, c4086Qy1.c);
    }

    public void J0(C4086Qy1<C6067eU> c4086Qy1, long j, long j2) {
        int e2;
        N11 n11 = new N11(c4086Qy1.a, c4086Qy1.b, c4086Qy1.f(), c4086Qy1.d(), j, j2, c4086Qy1.b());
        this.j1.c(c4086Qy1.a);
        this.n1.m(n11, c4086Qy1.c);
        C6067eU e3 = c4086Qy1.e();
        C6067eU c6067eU = this.E1;
        if (c6067eU == null) {
            e2 = 0;
        } else {
            e2 = c6067eU.e();
        }
        long j3 = e3.d(0).b;
        int i = 0;
        while (i < e2 && this.E1.d(i).b < j3) {
            i++;
        }
        if (e3.d) {
            if (e2 - i > e3.e()) {
                I31.n("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j4 = this.K1;
                if (j4 != C10323vs.b && e3.h * 1000 <= j4) {
                    I31.n("DashMediaSource", "Loaded stale dynamic manifest: " + e3.h + C6566gU0.h + this.K1);
                } else {
                    this.J1 = 0;
                }
            }
            int i2 = this.J1;
            this.J1 = i2 + 1;
            if (i2 < this.j1.a(c4086Qy1.c)) {
                U0(C0());
                return;
            } else {
                this.z1 = new C6565gU();
                return;
            }
        }
        this.E1 = e3;
        this.F1 = e3.d & this.F1;
        this.G1 = j - j2;
        this.H1 = j;
        synchronized (this.q1) {
            try {
                if (c4086Qy1.b.a == this.C1) {
                    Uri uri = this.E1.k;
                    if (uri == null) {
                        uri = c4086Qy1.f();
                    }
                    this.C1 = uri;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (e2 == 0) {
            C6067eU c6067eU2 = this.E1;
            if (c6067eU2.d) {
                AD2 ad2 = c6067eU2.i;
                if (ad2 != null) {
                    R0(ad2);
                    return;
                } else {
                    F0();
                    return;
                }
            }
            P0(true);
            return;
        }
        this.L1 += i;
        P0(true);
    }

    public R11.c K0(C4086Qy1<C6067eU> c4086Qy1, long j, long j2, IOException iOException, int i) {
        R11.c i2;
        N11 n11 = new N11(c4086Qy1.a, c4086Qy1.b, c4086Qy1.f(), c4086Qy1.d(), j, j2, c4086Qy1.b());
        long d2 = this.j1.d(new M11.d(n11, new C10519wf1(c4086Qy1.c), iOException, i));
        if (d2 == C10323vs.b) {
            i2 = R11.l;
        } else {
            i2 = R11.i(false, d2);
        }
        boolean c2 = i2.c();
        this.n1.q(n11, c4086Qy1.c, iOException, !c2);
        if (!c2) {
            this.j1.c(c4086Qy1.a);
        }
        return i2;
    }

    public void L0(C4086Qy1<Long> c4086Qy1, long j, long j2) {
        N11 n11 = new N11(c4086Qy1.a, c4086Qy1.b, c4086Qy1.f(), c4086Qy1.d(), j, j2, c4086Qy1.b());
        this.j1.c(c4086Qy1.a);
        this.n1.m(n11, c4086Qy1.c);
        O0(c4086Qy1.e().longValue() - j);
    }

    public R11.c M0(C4086Qy1<Long> c4086Qy1, long j, long j2, IOException iOException) {
        this.n1.q(new N11(c4086Qy1.a, c4086Qy1.b, c4086Qy1.f(), c4086Qy1.d(), j, j2, c4086Qy1.b()), c4086Qy1.c, iOException, true);
        this.j1.c(c4086Qy1.a);
        N0(iOException);
        return R11.k;
    }

    public final void N0(IOException iOException) {
        I31.e("DashMediaSource", "Failed to resolve time offset.", iOException);
        P0(true);
    }

    public final void O0(long j) {
        this.I1 = j;
        P0(true);
    }

    public final void P0(boolean z) {
        boolean z2;
        long j;
        long j2;
        long j3;
        C8322nf1.g gVar;
        boolean z3 = false;
        for (int i = 0; i < this.r1.size(); i++) {
            int keyAt = this.r1.keyAt(i);
            if (keyAt >= this.L1) {
                this.r1.valueAt(i).M(this.E1, keyAt - this.L1);
            }
        }
        CC1 d2 = this.E1.d(0);
        int e2 = this.E1.e() - 1;
        CC1 d3 = this.E1.d(e2);
        long g2 = this.E1.g(e2);
        long j1 = TD2.j1(TD2.t0(this.I1));
        long A0 = A0(d2, this.E1.g(0), j1);
        long z0 = z0(d3, g2, j1);
        if (this.E1.d && !E0(d3)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            long j4 = this.E1.f;
            if (j4 != C10323vs.b) {
                A0 = Math.max(A0, z0 - TD2.j1(j4));
            }
        }
        long j5 = z0 - A0;
        C6067eU c6067eU = this.E1;
        if (c6067eU.d) {
            if (c6067eU.a != C10323vs.b) {
                z3 = true;
            }
            C9542sf.i(z3);
            long j12 = (j1 - TD2.j1(this.E1.a)) - A0;
            X0(j12, j5);
            long b2 = this.E1.a + TD2.b2(A0);
            long j13 = j12 - TD2.j1(this.B1.X);
            j = 0;
            long min = Math.min(this.m1, j5 / 2);
            j2 = b2;
            if (j13 < min) {
                j3 = min;
            } else {
                j3 = j13;
            }
        } else {
            j = 0;
            j2 = -9223372036854775807L;
            j3 = 0;
        }
        long j14 = A0 - TD2.j1(d2.b);
        C6067eU c6067eU2 = this.E1;
        long j6 = c6067eU2.a;
        long j7 = this.I1;
        int i2 = this.L1;
        C8322nf1 c8322nf1 = this.c1;
        if (c6067eU2.d) {
            gVar = this.B1;
        } else {
            gVar = null;
        }
        p0(new b(j6, j2, j7, i2, j14, j5, j3, c6067eU2, c8322nf1, gVar));
        if (!this.d1) {
            this.A1.removeCallbacks(this.t1);
            if (z2) {
                this.A1.postDelayed(this.t1, B0(this.E1, TD2.t0(this.I1)));
            }
            if (this.F1) {
                W0();
            } else if (z) {
                C6067eU c6067eU3 = this.E1;
                if (c6067eU3.d) {
                    long j8 = c6067eU3.e;
                    if (j8 != C10323vs.b) {
                        if (j8 == j) {
                            j8 = 5000;
                        }
                        U0(Math.max(j, (this.G1 + j8) - SystemClock.elapsedRealtime()));
                    }
                }
            }
        }
    }

    @Override // o.InterfaceC7583kh1
    public void Q() throws IOException {
        this.v1.b();
    }

    public void Q0(Uri uri) {
        synchronized (this.q1) {
            this.C1 = uri;
            this.D1 = uri;
        }
    }

    public final void R0(AD2 ad2) {
        String str = ad2.a;
        if (!TD2.g(str, "urn:mpeg:dash:utc:direct:2014") && !TD2.g(str, "urn:mpeg:dash:utc:direct:2012")) {
            if (!TD2.g(str, "urn:mpeg:dash:utc:http-iso:2014") && !TD2.g(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                if (!TD2.g(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !TD2.g(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                    if (!TD2.g(str, "urn:mpeg:dash:utc:ntp:2014") && !TD2.g(str, "urn:mpeg:dash:utc:ntp:2012")) {
                        N0(new IOException("Unsupported UTC timing scheme"));
                        return;
                    } else {
                        F0();
                        return;
                    }
                }
                T0(ad2, new h(null));
                return;
            }
            T0(ad2, new d());
            return;
        }
        S0(ad2);
    }

    public final void S0(AD2 ad2) {
        try {
            O0(TD2.s1(ad2.b) - this.H1);
        } catch (C3989Py1 e2) {
            N0(e2);
        }
    }

    public final void T0(AD2 ad2, C4086Qy1.a<Long> aVar) {
        V0(new C4086Qy1(this.w1, Uri.parse(ad2.b), 5, aVar), new g(this, null), 1);
    }

    public final void U0(long j) {
        this.A1.postDelayed(this.s1, j);
    }

    public final <T> void V0(C4086Qy1<T> c4086Qy1, R11.b<C4086Qy1<T>> bVar, int i) {
        this.n1.s(new N11(c4086Qy1.a, c4086Qy1.b, this.x1.n(c4086Qy1, bVar, i)), c4086Qy1.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X0(long j, long j2) {
        long j3;
        long min;
        long b2;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        float f2;
        float f3;
        I12 i12;
        long b22 = TD2.b2(j);
        long j9 = this.c1.Y0.Z;
        if (j9 != C10323vs.b) {
            min = Math.min(b22, j9);
        } else {
            I12 i122 = this.E1.j;
            if (i122 != null) {
                long j10 = i122.c;
                if (j10 != C10323vs.b) {
                    min = Math.min(b22, j10);
                }
            }
            j3 = b22;
            b2 = TD2.b2(j - j2);
            if (b2 < 0 && j3 > 0) {
                b2 = 0;
            }
            j4 = this.E1.c;
            if (j4 != C10323vs.b) {
                b2 = Math.min(b2 + j4, b22);
            }
            long j11 = b2;
            j5 = this.c1.Y0.Y;
            if (j5 == C10323vs.b) {
                j11 = TD2.x(j5, j11, b22);
            } else {
                I12 i123 = this.E1.j;
                if (i123 != null) {
                    long j12 = i123.b;
                    if (j12 != C10323vs.b) {
                        j11 = TD2.x(j12, j11, b22);
                    }
                }
            }
            j6 = j11;
            if (j6 <= j3) {
                j7 = j6;
            } else {
                j7 = j3;
            }
            j8 = this.B1.X;
            if (j8 == C10323vs.b) {
                C6067eU c6067eU = this.E1;
                I12 i124 = c6067eU.j;
                if (i124 != null) {
                    long j13 = i124.a;
                    if (j13 != C10323vs.b) {
                        j8 = j13;
                    }
                }
                j8 = c6067eU.g;
                if (j8 == C10323vs.b) {
                    j8 = this.l1;
                }
            }
            if (j8 < j6) {
                j8 = j6;
            }
            if (j8 > j7) {
                j8 = TD2.x(TD2.b2(j - Math.min(this.m1, j2 / 2)), j6, j7);
            }
            long j14 = j7;
            C8322nf1.g gVar = this.c1.Y0;
            f2 = gVar.Y0;
            if (f2 == -3.4028235E38f) {
                I12 i125 = this.E1.j;
                if (i125 != null) {
                    f2 = i125.d;
                } else {
                    f2 = -3.4028235E38f;
                }
            }
            f3 = gVar.Z0;
            if (f3 == -3.4028235E38f) {
                I12 i126 = this.E1.j;
                if (i126 != null) {
                    f3 = i126.e;
                } else {
                    f3 = -3.4028235E38f;
                }
            }
            if (f2 == -3.4028235E38f && f3 == -3.4028235E38f && ((i12 = this.E1.j) == null || i12.a == C10323vs.b)) {
                f2 = 1.0f;
                f3 = 1.0f;
            }
            this.B1 = new C8322nf1.g.a().k(j8).i(j6).g(j14).j(f2).h(f3).f();
        }
        j3 = min;
        b2 = TD2.b2(j - j2);
        if (b2 < 0) {
            b2 = 0;
        }
        j4 = this.E1.c;
        if (j4 != C10323vs.b) {
        }
        long j112 = b2;
        j5 = this.c1.Y0.Y;
        if (j5 == C10323vs.b) {
        }
        j6 = j112;
        if (j6 <= j3) {
        }
        j8 = this.B1.X;
        if (j8 == C10323vs.b) {
        }
        if (j8 < j6) {
        }
        if (j8 > j7) {
        }
        long j142 = j7;
        C8322nf1.g gVar2 = this.c1.Y0;
        f2 = gVar2.Y0;
        if (f2 == -3.4028235E38f) {
        }
        f3 = gVar2.Z0;
        if (f3 == -3.4028235E38f) {
        }
        if (f2 == -3.4028235E38f) {
            f2 = 1.0f;
            f3 = 1.0f;
        }
        this.B1 = new C8322nf1.g.a().k(j8).i(j6).g(j142).j(f2).h(f3).f();
    }

    @Override // o.InterfaceC7583kh1
    public InterfaceC4410Ug1 h(InterfaceC7583kh1.b bVar, InterfaceC10877y8 interfaceC10877y8, long j) {
        int intValue = ((Integer) bVar.a).intValue() - this.L1;
        InterfaceC9309rh1.a b0 = b0(bVar);
        com.google.android.exoplayer2.source.dash.b bVar2 = new com.google.android.exoplayer2.source.dash.b(this.L1 + intValue, this.E1, this.k1, intValue, this.f1, this.y1, this.h1, this.i1, Y(bVar), this.j1, b0, this.I1, this.v1, interfaceC10877y8, this.g1, this.u1, i0());
        this.r1.put(bVar2.X, bVar2);
        return bVar2;
    }

    @Override // o.InterfaceC7583kh1
    public C8322nf1 k() {
        return this.c1;
    }

    @Override // o.AbstractC10541wl
    public void k0(@InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2) {
        this.y1 = interfaceC4261Sr2;
        this.i1.e(Looper.myLooper(), i0());
        this.i1.m0();
        if (this.d1) {
            P0(false);
            return;
        }
        this.w1 = this.e1.a();
        this.x1 = new R11("DashMediaSource");
        this.A1 = TD2.C();
        W0();
    }

    @Override // o.AbstractC10541wl
    public void q0() {
        C6067eU c6067eU;
        this.F1 = false;
        this.w1 = null;
        R11 r11 = this.x1;
        if (r11 != null) {
            r11.l();
            this.x1 = null;
        }
        this.G1 = 0L;
        this.H1 = 0L;
        if (this.d1) {
            c6067eU = this.E1;
        } else {
            c6067eU = null;
        }
        this.E1 = c6067eU;
        this.C1 = this.D1;
        this.z1 = null;
        Handler handler = this.A1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.A1 = null;
        }
        this.I1 = C10323vs.b;
        this.J1 = 0;
        this.K1 = C10323vs.b;
        this.r1.clear();
        this.k1.i();
        this.i1.g();
    }

    @Override // o.InterfaceC7583kh1
    public void s(InterfaceC4410Ug1 interfaceC4410Ug1) {
        com.google.android.exoplayer2.source.dash.b bVar = (com.google.android.exoplayer2.source.dash.b) interfaceC4410Ug1;
        bVar.I();
        this.r1.remove(bVar.X);
    }

    public DashMediaSource(C8322nf1 c8322nf1, @InterfaceC11300zs1 C6067eU c6067eU, @InterfaceC11300zs1 FU.a aVar, @InterfaceC11300zs1 C4086Qy1.a<? extends C6067eU> aVar2, a.InterfaceC0092a interfaceC0092a, VI vi, @InterfaceC11300zs1 C10415wE c10415wE, InterfaceC9170r70 interfaceC9170r70, M11 m11, long j, long j2) {
        this.c1 = c8322nf1;
        this.B1 = c8322nf1.Y0;
        this.C1 = ((C8322nf1.h) C9542sf.g(c8322nf1.Y)).X;
        this.D1 = c8322nf1.Y.X;
        this.E1 = c6067eU;
        this.e1 = aVar;
        this.o1 = aVar2;
        this.f1 = interfaceC0092a;
        this.h1 = c10415wE;
        this.i1 = interfaceC9170r70;
        this.j1 = m11;
        this.l1 = j;
        this.m1 = j2;
        this.g1 = vi;
        this.k1 = new C4331Tl();
        boolean z = c6067eU != null;
        this.d1 = z;
        this.n1 = b0(null);
        this.q1 = new Object();
        this.r1 = new SparseArray<>();
        this.u1 = new c(this, null);
        this.K1 = C10323vs.b;
        this.I1 = C10323vs.b;
        if (z) {
            C9542sf.i(true ^ c6067eU.d);
            this.p1 = null;
            this.s1 = null;
            this.t1 = null;
            this.v1 = new T11.a();
            return;
        }
        this.p1 = new e(this, null);
        this.v1 = new f();
        this.s1 = new Runnable() { // from class: o.hU
            @Override // java.lang.Runnable
            public final void run() {
                DashMediaSource.this.W0();
            }
        };
        this.t1 = new Runnable() { // from class: o.iU
            @Override // java.lang.Runnable
            public final void run() {
                DashMediaSource.this.P0(false);
            }
        };
    }
}
