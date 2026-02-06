package o;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.C4829Yo0;
import o.C5918dt;
import o.EU;
import o.FU;
import o.InterfaceC4844Ys;

@Deprecated
/* renamed from: o.et  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6161et implements FU {
    public static final int A = 0;
    public static final int B = 1;
    public static final long C = 102400;
    public static final int w = 1;
    public static final int x = 2;
    public static final int y = 4;
    public static final int z = -1;
    public final InterfaceC4844Ys b;
    public final FU c;
    @InterfaceC11300zs1
    public final FU d;
    public final FU e;
    public final InterfaceC7872lt f;
    @InterfaceC11300zs1
    public final c g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    @InterfaceC11300zs1
    public Uri k;
    @InterfaceC11300zs1
    public OU l;
    @InterfaceC11300zs1
    public OU m;
    @InterfaceC11300zs1
    public FU n;

    /* renamed from: o  reason: collision with root package name */
    public long f731o;
    public long p;
    public long q;
    @InterfaceC11300zs1
    public C8376nt r;
    public boolean s;
    public boolean t;
    public long u;
    public long v;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.et$b */
    /* loaded from: classes2.dex */
    public @interface b {
    }

    /* renamed from: o.et$c */
    /* loaded from: classes2.dex */
    public interface c {
        void a(int i);

        void b(long j, long j2);
    }

    /* renamed from: o.et$d */
    /* loaded from: classes2.dex */
    public static final class d implements FU.a {
        public InterfaceC4844Ys a;
        @InterfaceC11300zs1
        public EU.a c;
        public boolean e;
        @InterfaceC11300zs1
        public FU.a f;
        @InterfaceC11300zs1
        public FH1 g;
        public int h;
        public int i;
        @InterfaceC11300zs1
        public c j;
        public FU.a b = new C4829Yo0.b();
        public InterfaceC7872lt d = InterfaceC7872lt.a;

        @Override // o.FU.a
        /* renamed from: c */
        public C6161et a() {
            FU fu;
            FU.a aVar = this.f;
            if (aVar != null) {
                fu = aVar.a();
            } else {
                fu = null;
            }
            return f(fu, this.i, this.h);
        }

        public C6161et d() {
            FU fu;
            FU.a aVar = this.f;
            if (aVar != null) {
                fu = aVar.a();
            } else {
                fu = null;
            }
            return f(fu, this.i | 1, -1000);
        }

        public C6161et e() {
            return f(null, this.i | 1, -1000);
        }

        public final C6161et f(@InterfaceC11300zs1 FU fu, int i, int i2) {
            EU eu;
            InterfaceC4844Ys interfaceC4844Ys = (InterfaceC4844Ys) C9542sf.g(this.a);
            if (!this.e && fu != null) {
                EU.a aVar = this.c;
                if (aVar != null) {
                    eu = aVar.a();
                } else {
                    eu = new C5918dt.b().c(interfaceC4844Ys).a();
                }
            } else {
                eu = null;
            }
            return new C6161et(interfaceC4844Ys, fu, this.b.a(), eu, this.d, i, this.g, i2, this.j);
        }

        @InterfaceC11300zs1
        public InterfaceC4844Ys g() {
            return this.a;
        }

        public InterfaceC7872lt h() {
            return this.d;
        }

        @InterfaceC11300zs1
        public FH1 i() {
            return this.g;
        }

        @InterfaceC6181ey
        public d j(InterfaceC4844Ys interfaceC4844Ys) {
            this.a = interfaceC4844Ys;
            return this;
        }

        @InterfaceC6181ey
        public d k(InterfaceC7872lt interfaceC7872lt) {
            this.d = interfaceC7872lt;
            return this;
        }

        @InterfaceC6181ey
        public d l(FU.a aVar) {
            this.b = aVar;
            return this;
        }

        @InterfaceC6181ey
        public d m(@InterfaceC11300zs1 EU.a aVar) {
            boolean z;
            this.c = aVar;
            if (aVar == null) {
                z = true;
            } else {
                z = false;
            }
            this.e = z;
            return this;
        }

        @InterfaceC6181ey
        public d n(@InterfaceC11300zs1 c cVar) {
            this.j = cVar;
            return this;
        }

        @InterfaceC6181ey
        public d o(int i) {
            this.i = i;
            return this;
        }

        @InterfaceC6181ey
        public d p(@InterfaceC11300zs1 FU.a aVar) {
            this.f = aVar;
            return this;
        }

        @InterfaceC6181ey
        public d q(int i) {
            this.h = i;
            return this;
        }

        @InterfaceC6181ey
        public d r(@InterfaceC11300zs1 FH1 fh1) {
            this.g = fh1;
            return this;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.et$e */
    /* loaded from: classes2.dex */
    public @interface e {
    }

    public static Uri A(InterfaceC4844Ys interfaceC4844Ys, String str, Uri uri) {
        Uri d2 = InterfaceC6278fM.d(interfaceC4844Ys.d(str));
        if (d2 != null) {
            return d2;
        }
        return uri;
    }

    public final void B(Throwable th) {
        if (!D() && !(th instanceof InterfaceC4844Ys.a)) {
            return;
        }
        this.s = true;
    }

    public final boolean C() {
        if (this.n == this.e) {
            return true;
        }
        return false;
    }

    public final boolean D() {
        if (this.n == this.c) {
            return true;
        }
        return false;
    }

    public final boolean E() {
        return !D();
    }

    public final boolean F() {
        if (this.n == this.d) {
            return true;
        }
        return false;
    }

    public final void G() {
        c cVar = this.g;
        if (cVar != null && this.u > 0) {
            cVar.b(this.b.k(), this.u);
            this.u = 0L;
        }
    }

    public final void H(int i) {
        c cVar = this.g;
        if (cVar != null) {
            cVar.a(i);
        }
    }

    public final void I(OU ou, boolean z2) throws IOException {
        C8376nt n;
        long j;
        OU a2;
        FU fu;
        long j2;
        String str = (String) TD2.o(ou.i);
        Uri uri = null;
        if (this.t) {
            n = null;
        } else if (this.h) {
            try {
                n = this.b.n(str, this.p, this.q);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            n = this.b.f(str, this.p, this.q);
        }
        if (n == null) {
            fu = this.e;
            a2 = ou.a().i(this.p).h(this.q).a();
        } else if (n.Y0) {
            Uri fromFile = Uri.fromFile((File) TD2.o(n.Z0));
            long j3 = n.Y;
            long j4 = this.p - j3;
            long j5 = n.Z - j4;
            long j6 = this.q;
            if (j6 != -1) {
                j5 = Math.min(j5, j6);
            }
            a2 = ou.a().j(fromFile).l(j3).i(j4).h(j5).a();
            fu = this.c;
        } else {
            if (n.h()) {
                j = this.q;
            } else {
                j = n.Z;
                long j7 = this.q;
                if (j7 != -1) {
                    j = Math.min(j, j7);
                }
            }
            a2 = ou.a().i(this.p).h(j).a();
            fu = this.d;
            if (fu == null) {
                fu = this.e;
                this.b.l(n);
                n = null;
            }
        }
        if (!this.t && fu == this.e) {
            j2 = this.p + C;
        } else {
            j2 = Long.MAX_VALUE;
        }
        this.v = j2;
        if (z2) {
            C9542sf.i(C());
            if (fu != this.e) {
                try {
                    m();
                } catch (Throwable th) {
                    if (((C8376nt) TD2.o(n)).g()) {
                        this.b.l(n);
                    }
                    throw th;
                }
            } else {
                return;
            }
        }
        if (n != null && n.g()) {
            this.r = n;
        }
        this.n = fu;
        this.m = a2;
        this.f731o = 0L;
        long a3 = fu.a(a2);
        C6533gM c6533gM = new C6533gM();
        if (a2.h == -1 && a3 != -1) {
            this.q = a3;
            C6533gM.h(c6533gM, this.p + a3);
        }
        if (E()) {
            Uri uri2 = fu.getUri();
            this.k = uri2;
            if (!ou.a.equals(uri2)) {
                uri = this.k;
            }
            C6533gM.i(c6533gM, uri);
        }
        if (F()) {
            this.b.m(str, c6533gM);
        }
    }

    public final void J(String str) throws IOException {
        this.q = 0L;
        if (F()) {
            C6533gM c6533gM = new C6533gM();
            C6533gM.h(c6533gM, this.p);
            this.b.m(str, c6533gM);
        }
    }

    public final int K(OU ou) {
        if (this.i && this.s) {
            return 0;
        }
        if (this.j && ou.h == -1) {
            return 1;
        }
        return -1;
    }

    @Override // o.FU
    public long a(OU ou) throws IOException {
        boolean z2;
        try {
            String a2 = this.f.a(ou);
            OU a3 = ou.a().g(a2).a();
            this.l = a3;
            this.k = A(this.b, a2, a3.a);
            this.p = ou.g;
            int K = K(ou);
            if (K != -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.t = z2;
            if (z2) {
                H(K);
            }
            if (this.t) {
                this.q = -1L;
            } else {
                long g = InterfaceC6278fM.g(this.b.d(a2));
                this.q = g;
                if (g != -1) {
                    long j = g - ou.g;
                    this.q = j;
                    if (j < 0) {
                        throw new LU(2008);
                    }
                }
            }
            long j2 = ou.h;
            if (j2 != -1) {
                long j3 = this.q;
                if (j3 != -1) {
                    j2 = Math.min(j3, j2);
                }
                this.q = j2;
            }
            long j4 = this.q;
            if (j4 > 0 || j4 == -1) {
                I(a3, false);
            }
            long j5 = ou.h;
            if (j5 != -1) {
                return j5;
            }
            return this.q;
        } catch (Throwable th) {
            B(th);
            throw th;
        }
    }

    @Override // o.FU
    public Map<String, List<String>> b() {
        if (E()) {
            return this.e.b();
        }
        return Collections.EMPTY_MAP;
    }

    @Override // o.FU
    public void close() throws IOException {
        this.l = null;
        this.k = null;
        this.p = 0L;
        G();
        try {
            m();
        } catch (Throwable th) {
            B(th);
            throw th;
        }
    }

    @Override // o.FU
    @InterfaceC11300zs1
    public Uri getUri() {
        return this.k;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [o.OU, o.nt, o.FU] */
    public final void m() throws IOException {
        FU fu = this.n;
        if (fu != null) {
            try {
                fu.close();
            } finally {
                this.m = null;
                this.n = null;
                C8376nt c8376nt = this.r;
                if (c8376nt != null) {
                    this.b.l(c8376nt);
                    this.r = null;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
        if (r17.f731o < r13) goto L36;
     */
    @Override // o.CU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int read(byte[] bArr, int i, int i2) throws IOException {
        long j;
        if (i2 == 0) {
            return 0;
        }
        if (this.q == 0) {
            return -1;
        }
        OU ou = (OU) C9542sf.g(this.l);
        OU ou2 = (OU) C9542sf.g(this.m);
        try {
            if (this.p >= this.v) {
                I(ou, true);
            }
            int read = ((FU) C9542sf.g(this.n)).read(bArr, i, i2);
            if (read != -1) {
                if (D()) {
                    this.u += read;
                }
                long j2 = read;
                this.p += j2;
                this.f731o += j2;
                long j3 = this.q;
                if (j3 != -1) {
                    this.q = j3 - j2;
                    return read;
                }
            } else {
                if (E()) {
                    long j4 = ou2.h;
                    if (j4 != -1) {
                        j = 0;
                    }
                    J((String) TD2.o(ou.i));
                    return read;
                }
                j = 0;
                long j5 = this.q;
                if (j5 <= j) {
                    if (j5 == -1) {
                    }
                }
                m();
                I(ou, false);
                return read(bArr, i, i2);
            }
            return read;
        } catch (Throwable th) {
            B(th);
            throw th;
        }
    }

    @Override // o.FU
    public void s(InterfaceC4261Sr2 interfaceC4261Sr2) {
        C9542sf.g(interfaceC4261Sr2);
        this.c.s(interfaceC4261Sr2);
        this.e.s(interfaceC4261Sr2);
    }

    public InterfaceC4844Ys y() {
        return this.b;
    }

    public InterfaceC7872lt z() {
        return this.f;
    }

    public C6161et(InterfaceC4844Ys interfaceC4844Ys, @InterfaceC11300zs1 FU fu) {
        this(interfaceC4844Ys, fu, 0);
    }

    public C6161et(InterfaceC4844Ys interfaceC4844Ys, @InterfaceC11300zs1 FU fu, int i) {
        this(interfaceC4844Ys, fu, new C4829Yo0(), new C5918dt(interfaceC4844Ys, C5918dt.k), i, null);
    }

    public C6161et(InterfaceC4844Ys interfaceC4844Ys, @InterfaceC11300zs1 FU fu, FU fu2, @InterfaceC11300zs1 EU eu, int i, @InterfaceC11300zs1 c cVar) {
        this(interfaceC4844Ys, fu, fu2, eu, i, cVar, null);
    }

    public C6161et(InterfaceC4844Ys interfaceC4844Ys, @InterfaceC11300zs1 FU fu, FU fu2, @InterfaceC11300zs1 EU eu, int i, @InterfaceC11300zs1 c cVar, @InterfaceC11300zs1 InterfaceC7872lt interfaceC7872lt) {
        this(interfaceC4844Ys, fu, fu2, eu, interfaceC7872lt, i, null, 0, cVar);
    }

    public C6161et(InterfaceC4844Ys interfaceC4844Ys, @InterfaceC11300zs1 FU fu, FU fu2, @InterfaceC11300zs1 EU eu, @InterfaceC11300zs1 InterfaceC7872lt interfaceC7872lt, int i, @InterfaceC11300zs1 FH1 fh1, int i2, @InterfaceC11300zs1 c cVar) {
        this.b = interfaceC4844Ys;
        this.c = fu2;
        this.f = interfaceC7872lt == null ? InterfaceC7872lt.a : interfaceC7872lt;
        this.h = (i & 1) != 0;
        this.i = (i & 2) != 0;
        this.j = (i & 4) != 0;
        if (fu != null) {
            fu = fh1 != null ? new AH1(fu, fh1, i2) : fu;
            this.e = fu;
            this.d = eu != null ? new C4722Xl2(fu, eu) : null;
        } else {
            this.e = C6499gD1.b;
            this.d = null;
        }
        this.g = cVar;
    }
}
