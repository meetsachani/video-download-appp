package androidx.camera.core;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.f;
import androidx.camera.core.m;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC2464Al2;
import o.AbstractC4008Qd2;
import o.BM0;
import o.C10206vN0;
import o.C10544wl2;
import o.C10589wx;
import o.C10907yF1;
import o.C11251zg0;
import o.C2569Bn1;
import o.C2898Ex;
import o.C3139Hg0;
import o.C3597Ly;
import o.C5211ay;
import o.C5433bs2;
import o.C5901do2;
import o.C5932dw1;
import o.C6283fN0;
import o.C6566gU0;
import o.C7221jC0;
import o.C7433k41;
import o.C8145mw;
import o.C8807pf;
import o.CM0;
import o.DM0;
import o.F22;
import o.F92;
import o.FT0;
import o.HJ;
import o.HM0;
import o.InterfaceC3063Gl2;
import o.InterfaceC3849Om1;
import o.InterfaceC5070aN0;
import o.InterfaceC6040eN0;
import o.InterfaceC6490gB0;
import o.InterfaceC6743hD2;
import o.InterfaceC6918hx;
import o.InterfaceC6986iD2;
import o.InterfaceC7402jx;
import o.InterfaceC7470kD2;
import o.InterfaceC8499oN0;
import o.InterfaceC8742pN0;
import o.InterfaceFutureC8411o11;
import o.N80;
import o.SJ;
import o.T12;
import o.TS1;
import o.US1;
import o.WS1;
import o.ZN0;

/* loaded from: classes.dex */
public final class f extends androidx.camera.core.m {
    public static final int A = 3;
    public static final int B = 4;
    public static final int C = 0;
    public static final int D = 1;
    public static final int E = 2;
    public static final int F = -1;
    public static final int G = 0;
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = 0;
    public static final int K = 1;
    public static final String M = "ImageCapture";
    public static final int N = 2;
    public static final byte O = 100;
    public static final byte P = 95;
    public static final int Q = 1;
    public static final int R = 2;
    public static final int x = 0;
    public static final int y = 1;
    public static final int z = 2;
    public final InterfaceC8499oN0.a n;

    /* renamed from: o  reason: collision with root package name */
    public final int f14o;
    public final AtomicReference<Integer> p;
    public final int q;
    public int r;
    public Rational s;
    public T12.b t;
    public C6283fN0 u;
    public C10544wl2 v;
    public final CM0 w;
    public static final d L = new d();
    public static final C3139Hg0 S = new C3139Hg0();

    /* loaded from: classes.dex */
    public class a implements CM0 {
        public a() {
        }

        @Override // o.CM0
        public InterfaceFutureC8411o11<Void> a(List<C3597Ly> list) {
            return f.this.F0(list);
        }

        @Override // o.CM0
        public void b() {
            f.this.A0();
        }

        @Override // o.CM0
        public void c() {
            f.this.K0();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements InterfaceC6743hD2.a<f, BM0, b>, InterfaceC6040eN0.a<b>, FT0.a<b>, InterfaceC5070aN0.a<b> {
        public final C2569Bn1 a;

        public b() {
            this(C2569Bn1.u0());
        }

        public static b A(HJ hj) {
            return new b(C2569Bn1.v0(hj));
        }

        public static b B(BM0 bm0) {
            return new b(C2569Bn1.v0(bm0));
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: C */
        public BM0 t() {
            return new BM0(C5932dw1.t0(this.a));
        }

        public b D(int i) {
            e().h0(BM0.O, Integer.valueOf(i));
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: E */
        public b b(C2898Ex c2898Ex) {
            e().h0(InterfaceC6743hD2.E, c2898Ex);
            return this;
        }

        public b F(int i) {
            e().h0(BM0.L, Integer.valueOf(i));
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: G */
        public b i(C3597Ly.b bVar) {
            e().h0(InterfaceC6743hD2.C, bVar);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: H */
        public b x(InterfaceC6986iD2.b bVar) {
            e().h0(InterfaceC6743hD2.I, bVar);
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: I */
        public b m(List<Size> list) {
            e().h0(InterfaceC6040eN0.u, list);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: J */
        public b v(C3597Ly c3597Ly) {
            e().h0(InterfaceC6743hD2.A, c3597Ly);
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: K */
        public b l(Size size) {
            e().h0(InterfaceC6040eN0.q, size);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: L */
        public b j(T12 t12) {
            e().h0(InterfaceC6743hD2.z, t12);
            return this;
        }

        @Override // o.InterfaceC5070aN0.a
        /* renamed from: M */
        public b p(N80 n80) {
            if (Objects.equals(N80.n, n80)) {
                e().h0(InterfaceC5070aN0.i, n80);
                return this;
            }
            throw new UnsupportedOperationException("ImageCapture currently only supports SDR");
        }

        public b N(int i) {
            e().h0(BM0.M, Integer.valueOf(i));
            return this;
        }

        public b O(int i) {
            e().h0(BM0.S, Integer.valueOf(i));
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: P */
        public b n(boolean z) {
            e().h0(InterfaceC6743hD2.H, Boolean.valueOf(z));
            return this;
        }

        public b Q(InterfaceC8742pN0 interfaceC8742pN0) {
            e().h0(BM0.Q, interfaceC8742pN0);
            return this;
        }

        @Override // o.FT0.a
        /* renamed from: R */
        public b h(Executor executor) {
            e().h0(FT0.v, executor);
            return this;
        }

        public b S(int i) {
            C10907yF1.g(i, 1, 100, "jpegQuality");
            e().h0(BM0.T, Integer.valueOf(i));
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: T */
        public b o(Size size) {
            e().h0(InterfaceC6040eN0.r, size);
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: U */
        public b u(int i) {
            throw new UnsupportedOperationException("setMirrorMode is not supported.");
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: V */
        public b f(US1 us1) {
            e().h0(InterfaceC6040eN0.t, us1);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: W */
        public b d(T12.d dVar) {
            e().h0(InterfaceC6743hD2.B, dVar);
            return this;
        }

        public b X(boolean z) {
            e().h0(BM0.R, Boolean.valueOf(z));
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: Y */
        public b w(List<Pair<Integer, Size[]>> list) {
            e().h0(InterfaceC6040eN0.s, list);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: Z */
        public b y(int i) {
            e().h0(InterfaceC6743hD2.D, Integer.valueOf(i));
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        @Deprecated
        /* renamed from: a0 */
        public b s(int i) {
            if (i == -1) {
                i = 0;
            }
            e().h0(InterfaceC6040eN0.l, Integer.valueOf(i));
            return this;
        }

        @Override // o.InterfaceC3063Gl2.a
        /* renamed from: b0 */
        public b q(Class<f> cls) {
            e().h0(InterfaceC3063Gl2.x, cls);
            if (e().h(InterfaceC3063Gl2.w, null) == null) {
                k(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        @Override // o.InterfaceC3063Gl2.a
        /* renamed from: c0 */
        public b k(String str) {
            e().h0(InterfaceC3063Gl2.w, str);
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        @Deprecated
        /* renamed from: d0 */
        public b r(Size size) {
            e().h0(InterfaceC6040eN0.p, size);
            return this;
        }

        @Override // o.InterfaceC10288vj0
        public InterfaceC3849Om1 e() {
            return this.a;
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: e0 */
        public b g(int i) {
            e().h0(InterfaceC6040eN0.m, Integer.valueOf(i));
            return this;
        }

        @Override // o.InterfaceC7470kD2.a
        /* renamed from: f0 */
        public b c(m.b bVar) {
            e().h0(InterfaceC7470kD2.J, bVar);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: g0 */
        public b a(boolean z) {
            e().h0(InterfaceC6743hD2.G, Boolean.valueOf(z));
            return this;
        }

        @Override // o.InterfaceC10288vj0
        /* renamed from: z */
        public f build() {
            Integer num;
            Integer num2 = (Integer) e().h(BM0.O, null);
            if (num2 != null) {
                e().h0(InterfaceC5070aN0.h, num2);
            } else {
                e().h0(InterfaceC5070aN0.h, 256);
            }
            BM0 t = t();
            InterfaceC6040eN0.n0(t);
            f fVar = new f(t);
            Size size = (Size) e().h(InterfaceC6040eN0.p, null);
            if (size != null) {
                fVar.C0(new Rational(size.getWidth(), size.getHeight()));
            }
            C10907yF1.m((Executor) e().h(FT0.v, C5211ay.d()), "The IO executor can't be null");
            InterfaceC3849Om1 e = e();
            HJ.a<Integer> aVar = BM0.M;
            if (e.g(aVar) && ((num = (Integer) e().j(aVar)) == null || (num.intValue() != 0 && num.intValue() != 1 && num.intValue() != 2))) {
                throw new IllegalArgumentException("The flash mode is not allowed to set: " + num);
            }
            return fVar;
        }

        public b(C2569Bn1 c2569Bn1) {
            this.a = c2569Bn1;
            Class cls = (Class) c2569Bn1.h(InterfaceC3063Gl2.x, null);
            if (cls != null && !cls.equals(f.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            q(f.class);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    /* loaded from: classes.dex */
    public static final class d implements SJ<BM0> {
        public static final int a = 4;
        public static final int b = 0;
        public static final US1 c;
        public static final BM0 d;
        public static final N80 e;

        static {
            US1 a2 = new US1.b().d(C8807pf.e).f(WS1.c).a();
            c = a2;
            N80 n80 = N80.n;
            e = n80;
            d = new b().y(4).s(0).f(a2).x(InterfaceC6986iD2.b.IMAGE_CAPTURE).p(n80).t();
        }

        @Override // o.SJ
        /* renamed from: a */
        public BM0 d() {
            return d;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface e {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public @interface InterfaceC0015f {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface g {
    }

    /* loaded from: classes.dex */
    public static class h {
        public final int a;
        public final int b;
        public final Rational c;
        public final Executor d;
        public final j e;
        public AtomicBoolean f = new AtomicBoolean(false);
        public final Rect g;
        public final Matrix h;

        public h(int i, int i2, Rational rational, Rect rect, Matrix matrix, Executor executor, j jVar) {
            this.a = i;
            this.b = i2;
            if (rational != null) {
                C10907yF1.b(!rational.isZero(), "Target ratio cannot be zero");
                C10907yF1.b(rational.floatValue() > 0.0f, "Target ratio must be positive");
            }
            this.c = rational;
            this.g = rect;
            this.h = matrix;
            this.d = executor;
            this.e = jVar;
        }

        public void c(androidx.camera.core.g gVar) {
            Size size;
            int v;
            if (!this.f.compareAndSet(false, true)) {
                gVar.close();
                return;
            }
            if (f.S.b(gVar)) {
                try {
                    ByteBuffer B = gVar.f3()[0].B();
                    B.rewind();
                    byte[] bArr = new byte[B.capacity()];
                    B.get(bArr);
                    C11251zg0 l = C11251zg0.l(new ByteArrayInputStream(bArr));
                    B.rewind();
                    size = new Size(l.x(), l.r());
                    v = l.v();
                } catch (IOException e) {
                    d(1, "Unable to parse JPEG exif", e);
                    gVar.close();
                    return;
                }
            } else {
                size = new Size(gVar.getWidth(), gVar.getHeight());
                v = this.a;
            }
            final F22 f22 = new F22(gVar, size, ZN0.f(gVar.I4().a(), gVar.I4().c(), v, this.h));
            f22.b2(f.i0(this.g, this.c, this.a, size, v));
            try {
                this.d.execute(new Runnable() { // from class: o.AM0
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.h.this.e.a(f22);
                    }
                });
            } catch (RejectedExecutionException unused) {
                C7433k41.c(f.M, "Unable to post to the supplied executor.");
                gVar.close();
            }
        }

        public void d(final int i, final String str, final Throwable th) {
            if (!this.f.compareAndSet(false, true)) {
                return;
            }
            try {
                this.d.execute(new Runnable() { // from class: o.zM0
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.h.this.e.b(new DM0(i, str, th));
                    }
                });
            } catch (RejectedExecutionException unused) {
                C7433k41.c(f.M, "Unable to post to the supplied executor.");
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class i {
        public boolean a;
        public boolean b = false;
        public boolean c;
        public Location d;

        public Location a() {
            return this.d;
        }

        public boolean b() {
            return this.a;
        }

        public boolean c() {
            return this.b;
        }

        public boolean d() {
            return this.c;
        }

        public void e(Location location) {
            this.d = location;
        }

        public void f(boolean z) {
            this.a = z;
            this.b = true;
        }

        public void g(boolean z) {
            this.c = z;
        }

        public String toString() {
            return "Metadata{mIsReversedHorizontal=" + this.a + ", mIsReversedVertical=" + this.c + ", mLocation=" + this.d + "}";
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        void a(m mVar);

        void b(DM0 dm0);
    }

    /* loaded from: classes.dex */
    public static final class l {
        public final File a;
        public final ContentResolver b;
        public final Uri c;
        public final ContentValues d;
        public final OutputStream e;
        public final i f;

        public l(File file, ContentResolver contentResolver, Uri uri, ContentValues contentValues, OutputStream outputStream, i iVar) {
            this.a = file;
            this.b = contentResolver;
            this.c = uri;
            this.d = contentValues;
            this.e = outputStream;
            this.f = iVar == null ? new i() : iVar;
        }

        public ContentResolver a() {
            return this.b;
        }

        public ContentValues b() {
            return this.d;
        }

        public File c() {
            return this.a;
        }

        public i d() {
            return this.f;
        }

        public OutputStream e() {
            return this.e;
        }

        public Uri f() {
            return this.c;
        }

        public String toString() {
            return "OutputFileOptions{mFile=" + this.a + ", mContentResolver=" + this.b + ", mSaveCollection=" + this.c + ", mContentValues=" + this.d + ", mOutputStream=" + this.e + ", mMetadata=" + this.f + "}";
        }

        /* loaded from: classes.dex */
        public static final class a {
            public File a;
            public ContentResolver b;
            public Uri c;
            public ContentValues d;
            public OutputStream e;
            public i f;

            public a(File file) {
                this.a = file;
            }

            public l a() {
                return new l(this.a, this.b, this.c, this.d, this.e, this.f);
            }

            public a b(i iVar) {
                this.f = iVar;
                return this;
            }

            public a(ContentResolver contentResolver, Uri uri, ContentValues contentValues) {
                this.b = contentResolver;
                this.c = uri;
                this.d = contentValues;
            }

            public a(OutputStream outputStream) {
                this.e = outputStream;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class m {
        public final Uri a;

        public m(Uri uri) {
            this.a = uri;
        }

        public Uri a() {
            return this.a;
        }
    }

    public f(BM0 bm0) {
        super(bm0);
        this.n = new InterfaceC8499oN0.a() { // from class: o.xM0
            @Override // o.InterfaceC8499oN0.a
            public final void a(InterfaceC8499oN0 interfaceC8499oN0) {
                androidx.camera.core.f.b0(interfaceC8499oN0);
            }
        };
        this.p = new AtomicReference<>(null);
        this.r = -1;
        this.s = null;
        this.w = new a();
        BM0 bm02 = (BM0) j();
        if (bm02.g(BM0.L)) {
            this.f14o = bm02.v0();
        } else {
            this.f14o = 1;
        }
        this.q = bm02.z0(0);
    }

    public static /* synthetic */ Void a0(List list) {
        return null;
    }

    public static /* synthetic */ void b0(InterfaceC8499oN0 interfaceC8499oN0) {
        try {
            androidx.camera.core.g a2 = interfaceC8499oN0.a();
            Log.d(M, "Discarding ImageProxy which was inadvertently acquired: " + a2);
            if (a2 != null) {
                a2.close();
            }
        } catch (IllegalStateException e2) {
            Log.e(M, "Failed to acquire latest image.", e2);
        }
    }

    public static /* synthetic */ void d0(f fVar, String str, BM0 bm0, AbstractC4008Qd2 abstractC4008Qd2, T12 t12, T12.f fVar2) {
        if (fVar.z(str)) {
            fVar.v.k();
            fVar.h0(true);
            T12.b j0 = fVar.j0(str, bm0, abstractC4008Qd2);
            fVar.t = j0;
            fVar.X(j0.q());
            fVar.F();
            fVar.v.l();
            return;
        }
        fVar.g0();
    }

    private void g0() {
        h0(false);
    }

    public static Rect i0(Rect rect, Rational rational, int i2, Size size, int i3) {
        if (rect != null) {
            return C10206vN0.b(rect, i2, size, i3);
        }
        if (rational != null) {
            if (i3 % 180 != 0) {
                rational = new Rational(rational.getDenominator(), rational.getNumerator());
            }
            if (C10206vN0.l(size, rational)) {
                Rect a2 = C10206vN0.a(size, rational);
                Objects.requireNonNull(a2);
                return a2;
            }
        }
        return new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    public static int m0(Throwable th) {
        if (th instanceof C8145mw) {
            return 3;
        }
        if (th instanceof DM0) {
            return ((DM0) th).a();
        }
        return 0;
    }

    public static boolean x0(List<Pair<Integer, Size[]>> list, int i2) {
        if (list == null) {
            return false;
        }
        for (Pair<Integer, Size[]> pair : list) {
            if (((Integer) pair.first).equals(Integer.valueOf(i2))) {
                return true;
            }
        }
        return false;
    }

    public void A0() {
        synchronized (this.p) {
            try {
                if (this.p.get() != null) {
                    return;
                }
                this.p.set(Integer.valueOf(n0()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B0(Executor executor, j jVar, k kVar) {
        DM0 dm0 = new DM0(4, "Not bound to a valid Camera [" + this + C6566gU0.g, null);
        if (jVar != null) {
            jVar.b(dm0);
        } else if (kVar != null) {
            kVar.b(dm0);
        } else {
            throw new IllegalArgumentException("Must have either in-memory or on-disk callback.");
        }
    }

    public void C0(Rational rational) {
        this.s = rational;
    }

    public void D0(int i2) {
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("Invalid flash mode: " + i2);
        }
        synchronized (this.p) {
            this.r = i2;
            J0();
        }
    }

    public void E0(int i2) {
        int w0 = w0();
        if (T(i2) && this.s != null) {
            this.s = C10206vN0.i(Math.abs(C10589wx.c(i2) - C10589wx.c(w0)), this.s);
        }
    }

    public InterfaceFutureC8411o11<Void> F0(List<C3597Ly> list) {
        C5901do2.c();
        return C7221jC0.n(h().e(list, this.f14o, this.q), new InterfaceC6490gB0() { // from class: o.yM0
            @Override // o.InterfaceC6490gB0
            public final Object apply(Object obj) {
                return androidx.camera.core.f.a0((List) obj);
            }
        }, C5211ay.b());
    }

    public void G0(final l lVar, final Executor executor, final k kVar) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            C5211ay.f().execute(new Runnable() { // from class: o.wM0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.f.this.G0(lVar, executor, kVar);
                }
            });
        } else {
            I0(executor, null, kVar, lVar);
        }
    }

    public void H0(final Executor executor, final j jVar) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            C5211ay.f().execute(new Runnable() { // from class: o.vM0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.f.this.H0(executor, jVar);
                }
            });
        } else {
            I0(executor, jVar, null, null);
        }
    }

    @Override // androidx.camera.core.m
    public void I() {
        C10907yF1.m(g(), "Attached camera cannot be null");
    }

    public final void I0(Executor executor, j jVar, k kVar, l lVar) {
        C5901do2.c();
        Log.d(M, "takePictureInternal");
        InterfaceC7402jx g2 = g();
        if (g2 == null) {
            B0(executor, jVar, kVar);
            return;
        }
        C10544wl2 c10544wl2 = this.v;
        Objects.requireNonNull(c10544wl2);
        c10544wl2.j(AbstractC2464Al2.q(executor, jVar, kVar, lVar, u0(), s(), p(g2), q0(), l0(), this.t.t()));
    }

    @Override // androidx.camera.core.m
    public void J() {
        J0();
    }

    public final void J0() {
        synchronized (this.p) {
            try {
                if (this.p.get() != null) {
                    return;
                }
                h().i(n0());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r8v13, types: [o.hD2, o.hD2<?>] */
    @Override // androidx.camera.core.m
    public InterfaceC6743hD2<?> K(InterfaceC6918hx interfaceC6918hx, InterfaceC6743hD2.a<?, ?, ?> aVar) {
        boolean z2;
        int i2 = 35;
        if (interfaceC6918hx.m().a(F92.class)) {
            Boolean bool = Boolean.FALSE;
            InterfaceC3849Om1 e2 = aVar.e();
            HJ.a<Boolean> aVar2 = BM0.R;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(e2.h(aVar2, bool2))) {
                C7433k41.p(M, "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                C7433k41.f(M, "Requesting software JPEG due to device quirk.");
                aVar.e().h0(aVar2, bool2);
            }
        }
        boolean k0 = k0(aVar.e());
        Integer num = (Integer) aVar.e().h(BM0.O, null);
        if (num != null) {
            if (z0() && num.intValue() != 256) {
                z2 = false;
            } else {
                z2 = true;
            }
            C10907yF1.b(z2, "Cannot set non-JPEG buffer format with Extensions enabled.");
            InterfaceC3849Om1 e3 = aVar.e();
            HJ.a<Integer> aVar3 = InterfaceC5070aN0.h;
            if (!k0) {
                i2 = num.intValue();
            }
            e3.h0(aVar3, Integer.valueOf(i2));
        } else if (k0) {
            aVar.e().h0(InterfaceC5070aN0.h, 35);
        } else {
            List list = (List) aVar.e().h(InterfaceC6040eN0.s, null);
            if (list == null) {
                aVar.e().h0(InterfaceC5070aN0.h, 256);
            } else if (x0(list, 256)) {
                aVar.e().h0(InterfaceC5070aN0.h, 256);
            } else if (x0(list, 35)) {
                aVar.e().h0(InterfaceC5070aN0.h, 35);
            }
        }
        return aVar.t();
    }

    public void K0() {
        synchronized (this.p) {
            try {
                Integer andSet = this.p.getAndSet(null);
                if (andSet == null) {
                    return;
                }
                if (andSet.intValue() != n0()) {
                    J0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.m
    public void M() {
        f0();
    }

    @Override // androidx.camera.core.m
    public AbstractC4008Qd2 N(HJ hj) {
        this.t.h(hj);
        X(this.t.q());
        return e().f().d(hj).a();
    }

    @Override // androidx.camera.core.m
    public AbstractC4008Qd2 O(AbstractC4008Qd2 abstractC4008Qd2) {
        T12.b j0 = j0(i(), (BM0) j(), abstractC4008Qd2);
        this.t = j0;
        X(j0.q());
        D();
        return abstractC4008Qd2;
    }

    @Override // androidx.camera.core.m
    public void P() {
        f0();
        g0();
    }

    public final void f0() {
        C10544wl2 c10544wl2 = this.v;
        if (c10544wl2 != null) {
            c10544wl2.e();
        }
    }

    public final void h0(boolean z2) {
        C10544wl2 c10544wl2;
        Log.d(M, "clearPipeline");
        C5901do2.c();
        C6283fN0 c6283fN0 = this.u;
        if (c6283fN0 != null) {
            c6283fN0.a();
            this.u = null;
        }
        if (!z2 && (c10544wl2 = this.v) != null) {
            c10544wl2.e();
            this.v = null;
        }
    }

    public final T12.b j0(final String str, final BM0 bm0, final AbstractC4008Qd2 abstractC4008Qd2) {
        boolean z2;
        C5901do2.c();
        Log.d(M, String.format("createPipeline(cameraId: %s, streamSpec: %s)", str, abstractC4008Qd2));
        Size e2 = abstractC4008Qd2.e();
        InterfaceC7402jx g2 = g();
        Objects.requireNonNull(g2);
        if (g2.r() && !z0()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.u != null) {
            C10907yF1.n(z2);
            this.u.a();
        }
        this.u = new C6283fN0(bm0, e2, l(), z2);
        if (this.v == null) {
            this.v = new C10544wl2(this.w);
        }
        this.v.m(this.u);
        T12.b f = this.u.f(abstractC4008Qd2.e());
        if (l0() == 2) {
            h().b(f);
        }
        if (abstractC4008Qd2.d() != null) {
            f.h(abstractC4008Qd2.d());
        }
        f.g(new T12.c() { // from class: o.uM0
            @Override // o.T12.c
            public final void a(T12 t12, T12.f fVar) {
                androidx.camera.core.f.d0(androidx.camera.core.f.this, str, bm0, abstractC4008Qd2, t12, fVar);
            }
        });
        return f;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [o.hD2, o.hD2<?>] */
    @Override // androidx.camera.core.m
    public InterfaceC6743hD2<?> k(boolean z2, InterfaceC6986iD2 interfaceC6986iD2) {
        d dVar = L;
        HJ a2 = interfaceC6986iD2.a(dVar.d().g0(), l0());
        if (z2) {
            a2 = HJ.J(a2, dVar.d());
        }
        if (a2 == null) {
            return null;
        }
        return x(a2).t();
    }

    public boolean k0(InterfaceC3849Om1 interfaceC3849Om1) {
        boolean z2;
        Boolean bool = Boolean.TRUE;
        HJ.a<Boolean> aVar = BM0.R;
        Boolean bool2 = Boolean.FALSE;
        boolean z3 = false;
        if (bool.equals(interfaceC3849Om1.h(aVar, bool2))) {
            if (z0()) {
                C7433k41.p(M, "Software JPEG cannot be used with Extensions.");
                z2 = false;
            } else {
                z2 = true;
            }
            Integer num = (Integer) interfaceC3849Om1.h(BM0.O, null);
            if (num != null && num.intValue() != 256) {
                C7433k41.p(M, "Software JPEG cannot be used with non-JPEG output buffer format.");
            } else {
                z3 = z2;
            }
            if (!z3) {
                C7433k41.p(M, "Unable to support software JPEG. Disabling.");
                interfaceC3849Om1.h0(aVar, bool2);
            }
        }
        return z3;
    }

    public int l0() {
        return this.f14o;
    }

    public int n0() {
        int i2;
        synchronized (this.p) {
            i2 = this.r;
            if (i2 == -1) {
                i2 = ((BM0) j()).x0(2);
            }
        }
        return i2;
    }

    public C6283fN0 o0() {
        return this.u;
    }

    public int p0() {
        return q0();
    }

    public final int q0() {
        BM0 bm0 = (BM0) j();
        if (bm0.g(BM0.T)) {
            return bm0.B0();
        }
        int i2 = this.f14o;
        if (i2 != 0) {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("CaptureMode " + this.f14o + " is invalid");
            }
            return 95;
        }
        return 100;
    }

    @Override // androidx.camera.core.m
    public TS1 r() {
        InterfaceC7402jx g2 = g();
        Size f = f();
        if (g2 != null && f != null) {
            Rect y2 = y();
            Rational rational = this.s;
            if (y2 == null) {
                if (rational != null) {
                    y2 = C10206vN0.a(f, rational);
                } else {
                    y2 = new Rect(0, 0, f.getWidth(), f.getHeight());
                }
            }
            int p = p(g2);
            Objects.requireNonNull(y2);
            return new TS1(f, y2, p);
        }
        return null;
    }

    public HM0 r0() {
        InterfaceC7402jx g2 = g();
        if (g2 == null) {
            return HM0.e;
        }
        Pair<Long, Long> j2 = g2.b().C().j();
        if (j2 == null) {
            return HM0.e;
        }
        return new HM0(((Long) j2.first).longValue(), ((Long) j2.second).longValue());
    }

    public TS1 s0() {
        return r();
    }

    public US1 t0() {
        return ((InterfaceC6040eN0) j()).T(null);
    }

    public String toString() {
        return "ImageCapture:" + o();
    }

    @Override // androidx.camera.core.m
    public Set<Integer> u() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    public final Rect u0() {
        Rect y2 = y();
        Size f = f();
        Objects.requireNonNull(f);
        if (y2 != null) {
            return y2;
        }
        if (C10206vN0.k(this.s)) {
            InterfaceC7402jx g2 = g();
            Objects.requireNonNull(g2);
            int p = p(g2);
            Rational rational = new Rational(this.s.getDenominator(), this.s.getNumerator());
            if (!C5433bs2.h(p)) {
                rational = this.s;
            }
            Rect a2 = C10206vN0.a(f, rational);
            Objects.requireNonNull(a2);
            return a2;
        }
        return new Rect(0, 0, f.getWidth(), f.getHeight());
    }

    public C10544wl2 v0() {
        C10544wl2 c10544wl2 = this.v;
        Objects.requireNonNull(c10544wl2);
        return c10544wl2;
    }

    public int w0() {
        return w();
    }

    @Override // androidx.camera.core.m
    public InterfaceC6743hD2.a<?, ?, ?> x(HJ hj) {
        return b.A(hj);
    }

    public boolean y0() {
        if (this.u != null && this.v != null) {
            return true;
        }
        return false;
    }

    public final boolean z0() {
        if (g() == null || g().b().D(null) == null) {
            return false;
        }
        return true;
    }

    /* loaded from: classes.dex */
    public static abstract class j {
        public void a(androidx.camera.core.g gVar) {
        }

        public void b(DM0 dm0) {
        }
    }
}
