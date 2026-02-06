package o;

import android.graphics.Rect;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import o.AbstractC7373jp2;
import o.C11005yf1;
import o.C3773Nr2;
import o.C4224Si1;
import o.C8322nf1;
import o.C9876u11;
import o.G72;
import o.HD1;

@Deprecated
/* loaded from: classes2.dex */
public abstract class G72 extends AbstractC2559Bl {
    public static final long g1 = 1000;
    public final C9876u11<HD1.g> Z0;
    public final Looper a1;
    public final InterfaceC5285bG0 b1;
    public final HashSet<InterfaceFutureC8411o11<?>> c1;
    public final AbstractC7373jp2.b d1;
    public g e1;
    public boolean f1;

    /* loaded from: classes2.dex */
    public static final class b {
        public final Object a;
        public final C3773Nr2 b;
        public final C8322nf1 c;
        @InterfaceC11300zs1
        public final C11005yf1 d;
        @InterfaceC11300zs1
        public final Object e;
        @InterfaceC11300zs1
        public final C8322nf1.g f;
        public final long g;
        public final long h;
        public final long i;
        public final boolean j;
        public final boolean k;
        public final long l;
        public final long m;
        public final long n;

        /* renamed from: o  reason: collision with root package name */
        public final boolean f462o;
        public final AbstractC5317bO0<c> p;
        public final long[] q;
        public final C11005yf1 r;

        /* loaded from: classes2.dex */
        public static final class a {
            public Object a;
            public C3773Nr2 b;
            public C8322nf1 c;
            @InterfaceC11300zs1
            public C11005yf1 d;
            @InterfaceC11300zs1
            public Object e;
            @InterfaceC11300zs1
            public C8322nf1.g f;
            public long g;
            public long h;
            public long i;
            public boolean j;
            public boolean k;
            public long l;
            public long m;
            public long n;

            /* renamed from: o  reason: collision with root package name */
            public boolean f463o;
            public AbstractC5317bO0<c> p;

            @InterfaceC6181ey
            public a A(@InterfaceC11300zs1 C11005yf1 c11005yf1) {
                this.d = c11005yf1;
                return this;
            }

            @InterfaceC6181ey
            public a B(List<c> list) {
                boolean z;
                int size = list.size();
                int i = 0;
                while (i < size - 1) {
                    if (list.get(i).b != C10323vs.b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C9542sf.b(z, "Periods other than last need a duration");
                    int i2 = i + 1;
                    for (int i3 = i2; i3 < size; i3++) {
                        C9542sf.b(!list.get(i).a.equals(list.get(i3).a), "Duplicate PeriodData UIDs in period list");
                    }
                    i = i2;
                }
                this.p = AbstractC5317bO0.F(list);
                return this;
            }

            @InterfaceC6181ey
            public a C(long j) {
                boolean z;
                if (j >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                C9542sf.a(z);
                this.n = j;
                return this;
            }

            @InterfaceC6181ey
            public a D(long j) {
                this.g = j;
                return this;
            }

            @InterfaceC6181ey
            public a E(C3773Nr2 c3773Nr2) {
                this.b = c3773Nr2;
                return this;
            }

            @InterfaceC6181ey
            public a F(Object obj) {
                this.a = obj;
                return this;
            }

            @InterfaceC6181ey
            public a G(long j) {
                this.h = j;
                return this;
            }

            public b q() {
                return new b(this);
            }

            @InterfaceC6181ey
            public a r(long j) {
                boolean z;
                if (j >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                C9542sf.a(z);
                this.l = j;
                return this;
            }

            @InterfaceC6181ey
            public a s(long j) {
                boolean z;
                if (j != C10323vs.b && j < 0) {
                    z = false;
                } else {
                    z = true;
                }
                C9542sf.a(z);
                this.m = j;
                return this;
            }

            @InterfaceC6181ey
            public a t(long j) {
                this.i = j;
                return this;
            }

            @InterfaceC6181ey
            public a u(boolean z) {
                this.k = z;
                return this;
            }

            @InterfaceC6181ey
            public a v(boolean z) {
                this.f463o = z;
                return this;
            }

            @InterfaceC6181ey
            public a w(boolean z) {
                this.j = z;
                return this;
            }

            @InterfaceC6181ey
            public a x(@InterfaceC11300zs1 C8322nf1.g gVar) {
                this.f = gVar;
                return this;
            }

            @InterfaceC6181ey
            public a y(@InterfaceC11300zs1 Object obj) {
                this.e = obj;
                return this;
            }

            @InterfaceC6181ey
            public a z(C8322nf1 c8322nf1) {
                this.c = c8322nf1;
                return this;
            }

            public a(Object obj) {
                this.a = obj;
                this.b = C3773Nr2.Y;
                this.c = C8322nf1.e1;
                this.d = null;
                this.e = null;
                this.f = null;
                this.g = C10323vs.b;
                this.h = C10323vs.b;
                this.i = C10323vs.b;
                this.j = false;
                this.k = false;
                this.l = 0L;
                this.m = C10323vs.b;
                this.n = 0L;
                this.f463o = false;
                this.p = AbstractC5317bO0.L();
            }

            public a(b bVar) {
                this.a = bVar.a;
                this.b = bVar.b;
                this.c = bVar.c;
                this.d = bVar.d;
                this.e = bVar.e;
                this.f = bVar.f;
                this.g = bVar.g;
                this.h = bVar.h;
                this.i = bVar.i;
                this.j = bVar.j;
                this.k = bVar.k;
                this.l = bVar.l;
                this.m = bVar.m;
                this.n = bVar.n;
                this.f463o = bVar.f462o;
                this.p = bVar.p;
            }
        }

        public static C11005yf1 f(C8322nf1 c8322nf1, C3773Nr2 c3773Nr2) {
            C11005yf1.b bVar = new C11005yf1.b();
            int size = c3773Nr2.c().size();
            for (int i = 0; i < size; i++) {
                C3773Nr2.a aVar = c3773Nr2.c().get(i);
                for (int i2 = 0; i2 < aVar.X; i2++) {
                    if (aVar.l(i2)) {
                        C10833xx0 d = aVar.d(i2);
                        if (d.e1 != null) {
                            for (int i3 = 0; i3 < d.e1.e(); i3++) {
                                d.e1.d(i3).r(bVar);
                            }
                        }
                    }
                }
            }
            return bVar.J(c8322nf1.Z0).H();
        }

        public a e() {
            return new a();
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && TD2.g(this.d, bVar.d) && TD2.g(this.e, bVar.e) && TD2.g(this.f, bVar.f) && this.g == bVar.g && this.h == bVar.h && this.i == bVar.i && this.j == bVar.j && this.k == bVar.k && this.l == bVar.l && this.m == bVar.m && this.n == bVar.n && this.f462o == bVar.f462o && this.p.equals(bVar.p)) {
                return true;
            }
            return false;
        }

        public final AbstractC7373jp2.b g(int i, int i2, AbstractC7373jp2.b bVar) {
            if (this.p.isEmpty()) {
                Object obj = this.a;
                bVar.z(obj, obj, i, this.n + this.m, 0L, J6.g1, this.f462o);
                return bVar;
            }
            c cVar = this.p.get(i2);
            Object obj2 = cVar.a;
            bVar.z(obj2, Pair.create(this.a, obj2), i, cVar.b, this.q[i2], cVar.c, cVar.d);
            return bVar;
        }

        public final Object h(int i) {
            if (this.p.isEmpty()) {
                return this.a;
            }
            return Pair.create(this.a, this.p.get(i).a);
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = (((((217 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
            C11005yf1 c11005yf1 = this.d;
            int i = 0;
            if (c11005yf1 == null) {
                hashCode = 0;
            } else {
                hashCode = c11005yf1.hashCode();
            }
            int i2 = (hashCode3 + hashCode) * 31;
            Object obj = this.e;
            if (obj == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = obj.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            C8322nf1.g gVar = this.f;
            if (gVar != null) {
                i = gVar.hashCode();
            }
            long j = this.g;
            long j2 = this.h;
            long j3 = this.i;
            long j4 = this.l;
            long j5 = this.m;
            long j6 = this.n;
            return ((((((((((((((((((((i3 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.j ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + (this.f462o ? 1 : 0)) * 31) + this.p.hashCode();
        }

        public final AbstractC7373jp2.d i(int i, AbstractC7373jp2.d dVar) {
            int size;
            boolean z;
            if (this.p.isEmpty()) {
                size = 1;
                z = true;
            } else {
                size = this.p.size();
                z = true;
            }
            dVar.l(this.a, this.c, this.e, this.g, this.h, this.i, this.j, this.k, this.f, this.l, this.m, i, (i + size) - 1, this.n);
            dVar.g1 = this.f462o;
            return dVar;
        }

        public b(a aVar) {
            int i = 0;
            if (aVar.f != null) {
                if (aVar.g != C10323vs.b && aVar.h != C10323vs.b) {
                    C9542sf.b(aVar.h >= aVar.g, "windowStartTimeMs can't be less than presentationStartTimeMs");
                }
            } else {
                C9542sf.b(aVar.g == C10323vs.b, "presentationStartTimeMs can only be set if liveConfiguration != null");
                C9542sf.b(aVar.h == C10323vs.b, "windowStartTimeMs can only be set if liveConfiguration != null");
                C9542sf.b(aVar.i == C10323vs.b, "elapsedRealtimeEpochOffsetMs can only be set if liveConfiguration != null");
            }
            int size = aVar.p.size();
            if (aVar.m != C10323vs.b) {
                C9542sf.b(aVar.l <= aVar.m, "defaultPositionUs can't be greater than durationUs");
            }
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
            this.h = aVar.h;
            this.i = aVar.i;
            this.j = aVar.j;
            this.k = aVar.k;
            this.l = aVar.l;
            this.m = aVar.m;
            long j = aVar.n;
            this.n = j;
            this.f462o = aVar.f463o;
            AbstractC5317bO0<c> abstractC5317bO0 = aVar.p;
            this.p = abstractC5317bO0;
            long[] jArr = new long[abstractC5317bO0.size()];
            this.q = jArr;
            if (!abstractC5317bO0.isEmpty()) {
                jArr[0] = -j;
                while (i < size - 1) {
                    long[] jArr2 = this.q;
                    int i2 = i + 1;
                    jArr2[i2] = jArr2[i] + this.p.get(i).b;
                    i = i2;
                }
            }
            C11005yf1 c11005yf1 = this.d;
            this.r = c11005yf1 == null ? f(this.c, this.b) : c11005yf1;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public final Object a;
        public final long b;
        public final J6 c;
        public final boolean d;

        /* loaded from: classes2.dex */
        public static final class a {
            public Object a;
            public long b;
            public J6 c;
            public boolean d;

            public c e() {
                return new c(this);
            }

            @InterfaceC6181ey
            public a f(J6 j6) {
                this.c = j6;
                return this;
            }

            @InterfaceC6181ey
            public a g(long j) {
                boolean z;
                if (j != C10323vs.b && j < 0) {
                    z = false;
                } else {
                    z = true;
                }
                C9542sf.a(z);
                this.b = j;
                return this;
            }

            @InterfaceC6181ey
            public a h(boolean z) {
                this.d = z;
                return this;
            }

            @InterfaceC6181ey
            public a i(Object obj) {
                this.a = obj;
                return this;
            }

            public a(Object obj) {
                this.a = obj;
                this.b = 0L;
                this.c = J6.g1;
                this.d = false;
            }

            public a(c cVar) {
                this.a = cVar.a;
                this.b = cVar.b;
                this.c = cVar.c;
                this.d = cVar.d;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.a.equals(cVar.a) && this.b == cVar.b && this.c.equals(cVar.c) && this.d == cVar.d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j = this.b;
            return ((((((217 + this.a.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.c.hashCode()) * 31) + (this.d ? 1 : 0);
        }

        public c(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {
        public d() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends AbstractC7373jp2 {
        public final AbstractC5317bO0<b> a1;
        public final int[] b1;
        public final int[] c1;
        public final HashMap<Object, Integer> d1;

        public e(AbstractC5317bO0<b> abstractC5317bO0) {
            int size = abstractC5317bO0.size();
            this.a1 = abstractC5317bO0;
            this.b1 = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                this.b1[i2] = i;
                i += A(abstractC5317bO0.get(i2));
            }
            this.c1 = new int[i];
            this.d1 = new HashMap<>();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                b bVar = abstractC5317bO0.get(i4);
                for (int i5 = 0; i5 < A(bVar); i5++) {
                    this.d1.put(bVar.h(i5), Integer.valueOf(i3));
                    this.c1[i3] = i4;
                    i3++;
                }
            }
        }

        public static int A(b bVar) {
            if (bVar.p.isEmpty()) {
                return 1;
            }
            return bVar.p.size();
        }

        @Override // o.AbstractC7373jp2
        public int f(boolean z) {
            return super.f(z);
        }

        @Override // o.AbstractC7373jp2
        public int g(Object obj) {
            Integer num = this.d1.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // o.AbstractC7373jp2
        public int h(boolean z) {
            return super.h(z);
        }

        @Override // o.AbstractC7373jp2
        public int j(int i, int i2, boolean z) {
            return super.j(i, i2, z);
        }

        @Override // o.AbstractC7373jp2
        public AbstractC7373jp2.b l(int i, AbstractC7373jp2.b bVar, boolean z) {
            int i2 = this.c1[i];
            return this.a1.get(i2).g(i2, i - this.b1[i2], bVar);
        }

        @Override // o.AbstractC7373jp2
        public AbstractC7373jp2.b m(Object obj, AbstractC7373jp2.b bVar) {
            return l(((Integer) C9542sf.g(this.d1.get(obj))).intValue(), bVar, true);
        }

        @Override // o.AbstractC7373jp2
        public int n() {
            return this.c1.length;
        }

        @Override // o.AbstractC7373jp2
        public int s(int i, int i2, boolean z) {
            return super.s(i, i2, z);
        }

        @Override // o.AbstractC7373jp2
        public Object t(int i) {
            int i2 = this.c1[i];
            return this.a1.get(i2).h(i - this.b1[i2]);
        }

        @Override // o.AbstractC7373jp2
        public AbstractC7373jp2.d v(int i, AbstractC7373jp2.d dVar, long j) {
            return this.a1.get(i).i(this.b1[i], dVar);
        }

        @Override // o.AbstractC7373jp2
        public int w() {
            return this.a1.size();
        }
    }

    /* loaded from: classes2.dex */
    public interface f {
        public static final f a = b(0);

        static /* synthetic */ long a(long j, long j2, float f) {
            return j + (((float) (SystemClock.elapsedRealtime() - j2)) * f);
        }

        static f b(final long j) {
            return new f() { // from class: o.I72
                @Override // o.G72.f
                public final long get() {
                    return G72.f.d(j);
                }
            };
        }

        static f c(final long j, final float f) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            return new f() { // from class: o.H72
                @Override // o.G72.f
                public final long get() {
                    return G72.f.a(j, elapsedRealtime, f);
                }
            };
        }

        static /* synthetic */ long d(long j) {
            return j;
        }

        long get();
    }

    /* loaded from: classes2.dex */
    public static final class g {
        public final C11005yf1 A;
        public final int B;
        public final int C;
        public final int D;
        public final f E;
        public final f F;
        public final f G;
        public final f H;
        public final f I;
        public final boolean J;
        public final int K;
        public final long L;
        public final HD1.c a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        @InterfaceC11300zs1
        public final AD1 f;
        public final int g;
        public final boolean h;
        public final boolean i;
        public final long j;
        public final long k;
        public final long l;
        public final DD1 m;
        public final C2989Fr2 n;

        /* renamed from: o  reason: collision with root package name */
        public final C9546sg f464o;
        @InterfaceC2501Av0(from = 0.0d, to = 1.0d)
        public final float p;
        public final PG2 q;
        public final C8274nS r;
        public final Q20 s;
        @BR0(from = 0)
        public final int t;
        public final boolean u;
        public final L82 v;
        public final boolean w;
        public final C4224Si1 x;
        public final AbstractC5317bO0<b> y;
        public final AbstractC7373jp2 z;

        /* loaded from: classes2.dex */
        public static final class a {
            public C11005yf1 A;
            public int B;
            public int C;
            public int D;
            @InterfaceC11300zs1
            public Long E;
            public f F;
            @InterfaceC11300zs1
            public Long G;
            public f H;
            public f I;
            public f J;
            public f K;
            public boolean L;
            public int M;
            public long N;
            public HD1.c a;
            public boolean b;
            public int c;
            public int d;
            public int e;
            @InterfaceC11300zs1
            public AD1 f;
            public int g;
            public boolean h;
            public boolean i;
            public long j;
            public long k;
            public long l;
            public DD1 m;
            public C2989Fr2 n;

            /* renamed from: o  reason: collision with root package name */
            public C9546sg f465o;
            public float p;
            public PG2 q;
            public C8274nS r;
            public Q20 s;
            public int t;
            public boolean u;
            public L82 v;
            public boolean w;
            public C4224Si1 x;
            public AbstractC5317bO0<b> y;
            public AbstractC7373jp2 z;

            public g O() {
                return new g(this);
            }

            @InterfaceC6181ey
            public a P() {
                this.L = false;
                return this;
            }

            @InterfaceC6181ey
            public a Q(f fVar) {
                this.J = fVar;
                return this;
            }

            @InterfaceC6181ey
            public a R(long j) {
                this.G = Long.valueOf(j);
                return this;
            }

            @InterfaceC6181ey
            public a S(f fVar) {
                this.G = null;
                this.H = fVar;
                return this;
            }

            @InterfaceC6181ey
            public a T(C9546sg c9546sg) {
                this.f465o = c9546sg;
                return this;
            }

            @InterfaceC6181ey
            public a U(HD1.c cVar) {
                this.a = cVar;
                return this;
            }

            @InterfaceC6181ey
            public a V(f fVar) {
                this.I = fVar;
                return this;
            }

            @InterfaceC6181ey
            public a W(long j) {
                this.E = Long.valueOf(j);
                return this;
            }

            @InterfaceC6181ey
            public a X(f fVar) {
                this.E = null;
                this.F = fVar;
                return this;
            }

            @InterfaceC6181ey
            public a Y(int i, int i2) {
                boolean z;
                boolean z2;
                boolean z3 = false;
                if (i == -1) {
                    z = true;
                } else {
                    z = false;
                }
                if (i2 == -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z == z2) {
                    z3 = true;
                }
                C9542sf.a(z3);
                this.C = i;
                this.D = i2;
                return this;
            }

            @InterfaceC6181ey
            public a Z(C8274nS c8274nS) {
                this.r = c8274nS;
                return this;
            }

            @InterfaceC6181ey
            public a a0(int i) {
                this.B = i;
                return this;
            }

            @InterfaceC6181ey
            public a b0(Q20 q20) {
                this.s = q20;
                return this;
            }

            @InterfaceC6181ey
            public a c0(@BR0(from = 0) int i) {
                boolean z;
                if (i >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                C9542sf.a(z);
                this.t = i;
                return this;
            }

            @InterfaceC6181ey
            public a d0(boolean z) {
                this.u = z;
                return this;
            }

            @InterfaceC6181ey
            public a e0(boolean z) {
                this.i = z;
                return this;
            }

            @InterfaceC6181ey
            public a f0(long j) {
                this.l = j;
                return this;
            }

            @InterfaceC6181ey
            public a g0(boolean z) {
                this.w = z;
                return this;
            }

            @InterfaceC6181ey
            public a h0(boolean z, int i) {
                this.b = z;
                this.c = i;
                return this;
            }

            @InterfaceC6181ey
            public a i0(DD1 dd1) {
                this.m = dd1;
                return this;
            }

            @InterfaceC6181ey
            public a j0(int i) {
                this.d = i;
                return this;
            }

            @InterfaceC6181ey
            public a k0(int i) {
                this.e = i;
                return this;
            }

            @InterfaceC6181ey
            public a l0(@InterfaceC11300zs1 AD1 ad1) {
                this.f = ad1;
                return this;
            }

            @InterfaceC6181ey
            public a m0(List<b> list) {
                HashSet hashSet = new HashSet();
                for (int i = 0; i < list.size(); i++) {
                    C9542sf.b(hashSet.add(list.get(i).a), "Duplicate MediaItemData UID in playlist");
                }
                this.y = AbstractC5317bO0.F(list);
                this.z = new e(this.y);
                return this;
            }

            @InterfaceC6181ey
            public a n0(C11005yf1 c11005yf1) {
                this.A = c11005yf1;
                return this;
            }

            @InterfaceC6181ey
            public a o0(int i, long j) {
                this.L = true;
                this.M = i;
                this.N = j;
                return this;
            }

            @InterfaceC6181ey
            public a p0(int i) {
                this.g = i;
                return this;
            }

            @InterfaceC6181ey
            public a q0(long j) {
                this.j = j;
                return this;
            }

            @InterfaceC6181ey
            public a r0(long j) {
                this.k = j;
                return this;
            }

            @InterfaceC6181ey
            public a s0(boolean z) {
                this.h = z;
                return this;
            }

            @InterfaceC6181ey
            public a t0(L82 l82) {
                this.v = l82;
                return this;
            }

            @InterfaceC6181ey
            public a u0(C4224Si1 c4224Si1) {
                this.x = c4224Si1;
                return this;
            }

            @InterfaceC6181ey
            public a v0(f fVar) {
                this.K = fVar;
                return this;
            }

            @InterfaceC6181ey
            public a w0(C2989Fr2 c2989Fr2) {
                this.n = c2989Fr2;
                return this;
            }

            @InterfaceC6181ey
            public a x0(PG2 pg2) {
                this.q = pg2;
                return this;
            }

            @InterfaceC6181ey
            public a y0(@InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f) {
                boolean z;
                if (f >= 0.0f && f <= 1.0f) {
                    z = true;
                } else {
                    z = false;
                }
                C9542sf.a(z);
                this.p = f;
                return this;
            }

            public a() {
                this.a = HD1.c.Y;
                this.b = false;
                this.c = 1;
                this.d = 1;
                this.e = 0;
                this.f = null;
                this.g = 0;
                this.h = false;
                this.i = false;
                this.j = 5000L;
                this.k = 15000L;
                this.l = 3000L;
                this.m = DD1.Y0;
                this.n = C2989Fr2.v1;
                this.f465o = C9546sg.b1;
                this.p = 1.0f;
                this.q = PG2.d1;
                this.r = C8274nS.Z;
                this.s = Q20.b1;
                this.t = 0;
                this.u = false;
                this.v = L82.c;
                this.w = false;
                this.x = new C4224Si1((long) C10323vs.b, new C4224Si1.b[0]);
                this.y = AbstractC5317bO0.L();
                this.z = AbstractC7373jp2.X;
                this.A = C11005yf1.Q2;
                this.B = -1;
                this.C = -1;
                this.D = -1;
                this.E = null;
                this.F = f.b(C10323vs.b);
                this.G = null;
                f fVar = f.a;
                this.H = fVar;
                this.I = f.b(C10323vs.b);
                this.J = fVar;
                this.K = fVar;
                this.L = false;
                this.M = 5;
                this.N = 0L;
            }

            public a(g gVar) {
                this.a = gVar.a;
                this.b = gVar.b;
                this.c = gVar.c;
                this.d = gVar.d;
                this.e = gVar.e;
                this.f = gVar.f;
                this.g = gVar.g;
                this.h = gVar.h;
                this.i = gVar.i;
                this.j = gVar.j;
                this.k = gVar.k;
                this.l = gVar.l;
                this.m = gVar.m;
                this.n = gVar.n;
                this.f465o = gVar.f464o;
                this.p = gVar.p;
                this.q = gVar.q;
                this.r = gVar.r;
                this.s = gVar.s;
                this.t = gVar.t;
                this.u = gVar.u;
                this.v = gVar.v;
                this.w = gVar.w;
                this.x = gVar.x;
                this.y = gVar.y;
                this.z = gVar.z;
                this.A = gVar.A;
                this.B = gVar.B;
                this.C = gVar.C;
                this.D = gVar.D;
                this.E = null;
                this.F = gVar.E;
                this.G = null;
                this.H = gVar.F;
                this.I = gVar.G;
                this.J = gVar.H;
                this.K = gVar.I;
                this.L = gVar.J;
                this.M = gVar.K;
                this.N = gVar.L;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (this.b == gVar.b && this.c == gVar.c && this.a.equals(gVar.a) && this.d == gVar.d && this.e == gVar.e && TD2.g(this.f, gVar.f) && this.g == gVar.g && this.h == gVar.h && this.i == gVar.i && this.j == gVar.j && this.k == gVar.k && this.l == gVar.l && this.m.equals(gVar.m) && this.n.equals(gVar.n) && this.f464o.equals(gVar.f464o) && this.p == gVar.p && this.q.equals(gVar.q) && this.r.equals(gVar.r) && this.s.equals(gVar.s) && this.t == gVar.t && this.u == gVar.u && this.v.equals(gVar.v) && this.w == gVar.w && this.x.equals(gVar.x) && this.y.equals(gVar.y) && this.A.equals(gVar.A) && this.B == gVar.B && this.C == gVar.C && this.D == gVar.D && this.E.equals(gVar.E) && this.F.equals(gVar.F) && this.G.equals(gVar.G) && this.H.equals(gVar.H) && this.I.equals(gVar.I) && this.J == gVar.J && this.K == gVar.K && this.L == gVar.L) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = (((((((((217 + this.a.hashCode()) * 31) + (this.b ? 1 : 0)) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31;
            AD1 ad1 = this.f;
            if (ad1 == null) {
                hashCode = 0;
            } else {
                hashCode = ad1.hashCode();
            }
            long j = this.j;
            long j2 = this.k;
            long j3 = this.l;
            long j4 = this.L;
            return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode2 + hashCode) * 31) + this.g) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.f464o.hashCode()) * 31) + Float.floatToRawIntBits(this.p)) * 31) + this.q.hashCode()) * 31) + this.r.hashCode()) * 31) + this.s.hashCode()) * 31) + this.t) * 31) + (this.u ? 1 : 0)) * 31) + this.v.hashCode()) * 31) + (this.w ? 1 : 0)) * 31) + this.x.hashCode()) * 31) + this.y.hashCode()) * 31) + this.A.hashCode()) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E.hashCode()) * 31) + this.F.hashCode()) * 31) + this.G.hashCode()) * 31) + this.H.hashCode()) * 31) + this.I.hashCode()) * 31) + (this.J ? 1 : 0)) * 31) + this.K) * 31) + ((int) (j4 ^ (j4 >>> 32)));
        }

        public g(a aVar) {
            int i;
            if (!aVar.z.x()) {
                int i2 = aVar.B;
                if (i2 == -1) {
                    i = 0;
                } else {
                    C9542sf.b(aVar.B < aVar.z.w(), "currentMediaItemIndex must be less than playlist.size()");
                    i = i2;
                }
                if (aVar.C != -1) {
                    AbstractC7373jp2.b bVar = new AbstractC7373jp2.b();
                    aVar.z.k(G72.b4(aVar.z, i, aVar.E != null ? aVar.E.longValue() : aVar.F.get(), new AbstractC7373jp2.d(), bVar), bVar);
                    C9542sf.b(aVar.C < bVar.g(), "PeriodData has less ad groups than adGroupIndex");
                    int d = bVar.d(aVar.C);
                    if (d != -1) {
                        C9542sf.b(aVar.D < d, "Ad group has less ads than adIndexInGroupIndex");
                    }
                }
            } else {
                C9542sf.b(aVar.d == 1 || aVar.d == 4, "Empty playlist only allowed in STATE_IDLE or STATE_ENDED");
                C9542sf.b(aVar.C == -1 && aVar.D == -1, "Ads not allowed if playlist is empty");
            }
            if (aVar.f != null) {
                C9542sf.b(aVar.d == 1, "Player error only allowed in STATE_IDLE");
            }
            if (aVar.d == 1 || aVar.d == 4) {
                C9542sf.b(!aVar.i, "isLoading only allowed when not in STATE_IDLE or STATE_ENDED");
            }
            f c = aVar.E != null ? (aVar.C == -1 && aVar.b && aVar.d == 3 && aVar.e == 0 && aVar.E.longValue() != C10323vs.b) ? f.c(aVar.E.longValue(), aVar.m.X) : f.b(aVar.E.longValue()) : aVar.F;
            f c2 = aVar.G != null ? (aVar.C != -1 && aVar.b && aVar.d == 3 && aVar.e == 0) ? f.c(aVar.G.longValue(), 1.0f) : f.b(aVar.G.longValue()) : aVar.H;
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
            this.h = aVar.h;
            this.i = aVar.i;
            this.j = aVar.j;
            this.k = aVar.k;
            this.l = aVar.l;
            this.m = aVar.m;
            this.n = aVar.n;
            this.f464o = aVar.f465o;
            this.p = aVar.p;
            this.q = aVar.q;
            this.r = aVar.r;
            this.s = aVar.s;
            this.t = aVar.t;
            this.u = aVar.u;
            this.v = aVar.v;
            this.w = aVar.w;
            this.x = aVar.x;
            this.y = aVar.y;
            this.z = aVar.z;
            this.A = aVar.A;
            this.B = aVar.B;
            this.C = aVar.C;
            this.D = aVar.D;
            this.E = c;
            this.F = c2;
            this.G = aVar.I;
            this.H = aVar.J;
            this.I = aVar.K;
            this.J = aVar.L;
            this.K = aVar.M;
            this.L = aVar.N;
        }
    }

    public G72(Looper looper) {
        this(looper, LD.a);
    }

    public static /* synthetic */ g B3(g gVar) {
        int i;
        g.a l0 = gVar.a().l0(null);
        if (gVar.z.x()) {
            i = 4;
        } else {
            i = 2;
        }
        return l0.j0(i).O();
    }

    public static /* synthetic */ g E3(G72 g72, g gVar, List list, int i) {
        g72.getClass();
        ArrayList arrayList = new ArrayList(gVar.y);
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(i2 + i, g72.d4((C8322nf1) list.get(i2)));
        }
        if (!gVar.y.isEmpty()) {
            return j4(gVar, arrayList, g72.d1);
        }
        return k4(gVar, arrayList, gVar.B, gVar.E.get());
    }

    public static /* synthetic */ g G2(g gVar) {
        return gVar;
    }

    public static /* synthetic */ void H2(int i, HD1.k kVar, HD1.k kVar2, HD1.g gVar) {
        gVar.e0(i);
        gVar.R(kVar, kVar2, i);
    }

    public static /* synthetic */ void H3(g gVar, HD1.g gVar2) {
        gVar2.u(gVar.r.X);
        gVar2.G(gVar.r);
    }

    public static /* synthetic */ g K3(G72 g72, g gVar, List list, int i, int i2) {
        g k4;
        g72.getClass();
        ArrayList arrayList = new ArrayList(gVar.y);
        for (int i3 = 0; i3 < list.size(); i3++) {
            arrayList.add(i3 + i, g72.d4((C8322nf1) list.get(i3)));
        }
        if (!gVar.y.isEmpty()) {
            k4 = j4(gVar, arrayList, g72.d1);
        } else {
            k4 = k4(gVar, arrayList, gVar.B, gVar.E.get());
        }
        if (i2 < i) {
            TD2.z1(arrayList, i2, i);
            return j4(k4, arrayList, g72.d1);
        }
        return k4;
    }

    public static boolean K4(g gVar) {
        if (gVar.b && gVar.d == 3 && gVar.e == 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void N3(G72 g72, HD1.g gVar, C4170Ru0 c4170Ru0) {
        g72.getClass();
        gVar.c0(g72, new HD1.f(c4170Ru0));
    }

    public static /* synthetic */ void P2(g gVar, HD1.g gVar2) {
        gVar2.L(gVar.i);
        gVar2.i0(gVar.i);
    }

    public static g Q3(g.a aVar, g gVar, long j, List<b> list, int i, long j2, boolean z) {
        boolean z2;
        int i2;
        long h4 = h4(j, gVar);
        boolean z3 = false;
        if (!list.isEmpty() && (i == -1 || i >= list.size())) {
            j2 = -9223372036854775807L;
            i = 0;
        }
        if (!list.isEmpty() && j2 == C10323vs.b) {
            j2 = TD2.b2(list.get(i).l);
        }
        if (!gVar.y.isEmpty() && !list.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 && !gVar.y.get(U3(gVar)).a.equals(list.get(i).a)) {
            z3 = true;
        }
        if (!z2 && !z3 && j2 >= h4) {
            if (i2 == 0) {
                aVar.a0(i);
                if (gVar.C != -1 && z) {
                    aVar.v0(f.b(gVar.H.get() - gVar.F.get()));
                } else {
                    aVar.Y(-1, -1).v0(f.b(S3(gVar) - h4));
                }
            } else {
                aVar.a0(i).Y(-1, -1).W(j2).V(f.b(Math.max(S3(gVar), j2))).v0(f.b(Math.max(0L, gVar.I.get() - (j2 - h4))));
            }
        } else {
            aVar.a0(i).Y(-1, -1).W(j2).V(f.b(j2)).v0(f.a);
        }
        return aVar.O();
    }

    public static /* synthetic */ void R2(G72 g72, InterfaceFutureC8411o11 interfaceFutureC8411o11) {
        TD2.o(g72.e1);
        g72.c1.remove(interfaceFutureC8411o11);
        if (g72.c1.isEmpty() && !g72.f1) {
            g72.O4(g72.i4(), false, false);
        }
    }

    public static long S3(g gVar) {
        return h4(gVar.G.get(), gVar);
    }

    public static long T3(g gVar) {
        return h4(gVar.E.get(), gVar);
    }

    public static /* synthetic */ g U2(G72 g72, g gVar, int i, int i2, int i3) {
        g72.getClass();
        ArrayList arrayList = new ArrayList(gVar.y);
        TD2.i1(arrayList, i, i2, i3);
        return j4(gVar, arrayList, g72.d1);
    }

    public static int U3(g gVar) {
        int i = gVar.B;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    public static int V3(g gVar, AbstractC7373jp2.d dVar, AbstractC7373jp2.b bVar) {
        int U3 = U3(gVar);
        if (gVar.z.x()) {
            return U3;
        }
        return b4(gVar.z, U3, T3(gVar), dVar, bVar);
    }

    public static long W3(g gVar, Object obj, AbstractC7373jp2.b bVar) {
        if (gVar.C != -1) {
            return gVar.F.get();
        }
        return T3(gVar) - gVar.z.m(obj, bVar).s();
    }

    public static C3773Nr2 X3(g gVar) {
        if (gVar.y.isEmpty()) {
            return C3773Nr2.Y;
        }
        return gVar.y.get(U3(gVar)).b;
    }

    public static int Y3(List<b> list, AbstractC7373jp2 abstractC7373jp2, int i, AbstractC7373jp2.b bVar) {
        if (!list.isEmpty()) {
            Object h = list.get(i).h(0);
            if (abstractC7373jp2.g(h) == -1) {
                return -1;
            }
            return abstractC7373jp2.m(h, bVar).Z;
        } else if (i >= abstractC7373jp2.w()) {
            return -1;
        } else {
            return i;
        }
    }

    public static int Z3(g gVar, g gVar2, int i, boolean z, AbstractC7373jp2.d dVar) {
        AbstractC7373jp2 abstractC7373jp2 = gVar.z;
        AbstractC7373jp2 abstractC7373jp22 = gVar2.z;
        if (abstractC7373jp22.x() && abstractC7373jp2.x()) {
            return -1;
        }
        if (abstractC7373jp22.x() != abstractC7373jp2.x()) {
            return 3;
        }
        Object obj = gVar.z.u(U3(gVar), dVar).X;
        Object obj2 = gVar2.z.u(U3(gVar2), dVar).X;
        if ((obj instanceof d) && !(obj2 instanceof d)) {
            return -1;
        }
        if (!obj.equals(obj2)) {
            if (i == 0) {
                return 1;
            }
            if (i != 1) {
                return 3;
            }
            return 2;
        } else if (i == 0 && T3(gVar) > T3(gVar2)) {
            return 0;
        } else {
            if (i != 1 || !z) {
                return -1;
            }
            return 2;
        }
    }

    public static C11005yf1 a4(g gVar) {
        if (!gVar.y.isEmpty()) {
            return gVar.y.get(U3(gVar)).r;
        }
        return C11005yf1.Q2;
    }

    public static int b4(AbstractC7373jp2 abstractC7373jp2, int i, long j, AbstractC7373jp2.d dVar, AbstractC7373jp2.b bVar) {
        return abstractC7373jp2.g(abstractC7373jp2.q(dVar, bVar, i, TD2.j1(j)).first);
    }

    public static long c4(g gVar, Object obj, AbstractC7373jp2.b bVar) {
        long f2;
        gVar.z.m(obj, bVar);
        int i = gVar.C;
        if (i == -1) {
            f2 = bVar.Y0;
        } else {
            f2 = bVar.f(i, gVar.D);
        }
        return TD2.b2(f2);
    }

    public static int f4(g gVar, g gVar2, boolean z, AbstractC7373jp2.d dVar, AbstractC7373jp2.b bVar) {
        if (gVar2.J) {
            return gVar2.K;
        }
        if (z) {
            return 1;
        }
        if (gVar.y.isEmpty()) {
            return -1;
        }
        if (gVar2.y.isEmpty()) {
            return 4;
        }
        Object t = gVar.z.t(V3(gVar, dVar, bVar));
        Object t2 = gVar2.z.t(V3(gVar2, dVar, bVar));
        if ((t instanceof d) && !(t2 instanceof d)) {
            return -1;
        }
        if (t2.equals(t) && gVar.C == gVar2.C && gVar.D == gVar2.D) {
            long W3 = W3(gVar, t, bVar);
            if (Math.abs(W3 - W3(gVar2, t2, bVar)) < 1000) {
                return -1;
            }
            long c4 = c4(gVar, t, bVar);
            if (c4 != C10323vs.b && W3 >= c4) {
                return 0;
            }
            return 5;
        } else if (gVar2.z.g(t) == -1) {
            return 4;
        } else {
            long W32 = W3(gVar, t, bVar);
            long c42 = c4(gVar, t, bVar);
            if (c42 != C10323vs.b && W32 >= c42) {
                return 0;
            }
            return 3;
        }
    }

    public static /* synthetic */ g g3(G72 g72, List list, g gVar, int i, long j) {
        g72.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(g72.d4((C8322nf1) list.get(i2)));
        }
        return k4(gVar, arrayList, i, j);
    }

    public static HD1.k g4(g gVar, boolean z, AbstractC7373jp2.d dVar, AbstractC7373jp2.b bVar) {
        C8322nf1 c8322nf1;
        Object obj;
        int i;
        int i2;
        Object obj2;
        long j;
        long j2;
        long j3;
        long T3;
        int U3 = U3(gVar);
        if (!gVar.z.x()) {
            int V3 = V3(gVar, dVar, bVar);
            Object obj3 = gVar.z.l(V3, bVar, true).Y;
            Object obj4 = gVar.z.u(U3, dVar).X;
            c8322nf1 = dVar.Z;
            i = -1;
            obj2 = obj4;
            obj = obj3;
            i2 = V3;
        } else {
            c8322nf1 = null;
            obj = null;
            i = -1;
            i2 = -1;
            obj2 = null;
        }
        if (z) {
            j3 = gVar.L;
            if (gVar.C == i) {
                T3 = j3;
            } else {
                T3 = T3(gVar);
            }
            j2 = T3;
        } else {
            long T32 = T3(gVar);
            if (gVar.C != i) {
                j = gVar.F.get();
            } else {
                j = T32;
            }
            j2 = T32;
            j3 = j;
        }
        return new HD1.k(obj2, U3, c8322nf1, obj, i2, j3, j2, gVar.C, gVar.D);
    }

    public static long h4(long j, g gVar) {
        if (j != C10323vs.b) {
            return j;
        }
        if (gVar.y.isEmpty()) {
            return 0L;
        }
        return TD2.b2(gVar.y.get(U3(gVar)).l);
    }

    public static g j4(g gVar, List<b> list, AbstractC7373jp2.b bVar) {
        long j;
        g.a a2 = gVar.a();
        a2.m0(list);
        AbstractC7373jp2 abstractC7373jp2 = a2.z;
        long j2 = gVar.E.get();
        int U3 = U3(gVar);
        int Y3 = Y3(gVar.y, abstractC7373jp2, U3, bVar);
        if (Y3 == -1) {
            j = C10323vs.b;
        } else {
            j = j2;
        }
        for (int i = U3 + 1; Y3 == -1 && i < gVar.y.size(); i++) {
            Y3 = Y3(gVar.y, abstractC7373jp2, i, bVar);
        }
        if (gVar.d != 1 && Y3 == -1) {
            a2.j0(4).e0(false);
        }
        return Q3(a2, gVar, j2, list, Y3, j, true);
    }

    public static g k4(g gVar, List<b> list, int i, long j) {
        g.a a2 = gVar.a();
        a2.m0(list);
        if (gVar.d != 1) {
            if (!list.isEmpty() && (i == -1 || i < list.size())) {
                a2.j0(2);
            } else {
                a2.j0(4).e0(false);
            }
        }
        return Q3(a2, gVar, gVar.E.get(), list, i, j, false);
    }

    public static L82 l4(SurfaceHolder surfaceHolder) {
        if (!surfaceHolder.getSurface().isValid()) {
            return L82.d;
        }
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        return new L82(surfaceFrame.width(), surfaceFrame.height());
    }

    public static int m4(List<b> list, List<b> list2) {
        if (list.size() != list2.size()) {
            return 0;
        }
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= list.size()) {
                return 1;
            }
            Object obj = list.get(i).a;
            Object obj2 = list2.get(i).a;
            if (!(obj instanceof d) || (obj2 instanceof d)) {
                z = false;
            }
            if (!obj.equals(obj2) && !z) {
                return 0;
            }
            i++;
        }
    }

    public static /* synthetic */ InterfaceFutureC8411o11 v3(InterfaceFutureC8411o11 interfaceFutureC8411o11, Object obj) {
        return interfaceFutureC8411o11;
    }

    public static /* synthetic */ g w3(G72 g72, g gVar, int i, int i2) {
        g72.getClass();
        ArrayList arrayList = new ArrayList(gVar.y);
        TD2.z1(arrayList, i, i2);
        return j4(gVar, arrayList, g72.d1);
    }

    @Override // o.HD1
    public final void A(@InterfaceC11300zs1 TextureView textureView) {
        R3(textureView);
    }

    @InterfaceC6919hx0
    public InterfaceFutureC8411o11<?> A4(boolean z) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_PLAY_PAUSE");
    }

    @Override // o.HD1
    public final PG2 B() {
        R4();
        return this.e1.q;
    }

    @InterfaceC6919hx0
    public InterfaceFutureC8411o11<?> B4(DD1 dd1) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_SPEED_AND_PITCH");
    }

    @Override // o.HD1
    public final Q20 C() {
        R4();
        return this.e1.s;
    }

    @Override // o.HD1
    public final int C1() {
        R4();
        return V3(this.e1, this.Y0, this.d1);
    }

    @InterfaceC6919hx0
    public InterfaceFutureC8411o11<?> C4(C11005yf1 c11005yf1) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_PLAYLIST_METADATA");
    }

    @Override // o.HD1
    public final void D0(final boolean z) {
        R4();
        final g gVar = this.e1;
        if (!N4(1)) {
            return;
        }
        P4(A4(z), new InterfaceC8331nh2() { // from class: o.Z62
            @Override // o.InterfaceC8331nh2
            public final Object get() {
                G72.g O;
                O = G72.g.this.a().h0(z, 1).O();
                return O;
            }
        });
    }

    @Override // o.HD1
    public final void D1(final int i, int i2) {
        R4();
        final g gVar = this.e1;
        if (!N4(33)) {
            return;
        }
        P4(y4(i, i2), new InterfaceC8331nh2() { // from class: o.o72
            @Override // o.InterfaceC8331nh2
            public final Object get() {
                G72.g O;
                O = G72.g.this.a().c0(i).O();
                return O;
            }
        });
    }

    @InterfaceC6919hx0
    public InterfaceFutureC8411o11<?> D4(int i) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_REPEAT_MODE");
    }

    @InterfaceC6919hx0
    public InterfaceFutureC8411o11<?> E4(boolean z) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_SHUFFLE_MODE");
    }

    @Override // o.HD1
    public final void F() {
        R3(null);
    }

    @Override // o.HD1
    public final void F1(final C11005yf1 c11005yf1) {
        R4();
        final g gVar = this.e1;
        if (!N4(19)) {
            return;
        }
        P4(C4(c11005yf1), new InterfaceC8331nh2() { // from class: o.s72
            @Override // o.InterfaceC8331nh2
            public final Object get() {
                G72.g O;
                O = G72.g.this.a().n0(c11005yf1).O();
                return O;
            }
        });
    }

    @InterfaceC6919hx0
    public InterfaceFutureC8411o11<?> F4(C2989Fr2 c2989Fr2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_TRACK_SELECTION_PARAMETERS");
    }

    @Override // o.HD1
    public final void G(@InterfaceC11300zs1 SurfaceView surfaceView) {
        R3(surfaceView);
    }

    @Override // o.HD1
    public final int G1() {
        R4();
        return this.e1.D;
    }

    @InterfaceC6919hx0
    public InterfaceFutureC8411o11<?> G4(Object obj) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
    }

    @Override // o.HD1
    public final boolean H() {
        R4();
        return this.e1.u;
    }

    @InterfaceC6919hx0
    public InterfaceFutureC8411o11<?> H4(@InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VOLUME");
    }

    @InterfaceC6919hx0
    public InterfaceFutureC8411o11<?> I4() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_STOP");
    }

    public final void J4() {
        R4();
        if (this.c1.isEmpty() && !this.f1) {
            O4(i4(), false, false);
        }
    }

    @Override // o.HD1
    @Deprecated
    public final void K(final int i) {
        R4();
        final g gVar = this.e1;
        if (!N4(25)) {
            return;
        }
        P4(y4(i, 1), new InterfaceC8331nh2() { // from class: o.n72
            @Override // o.InterfaceC8331nh2
            public final Object get() {
                G72.g O;
                O = G72.g.this.a().c0(i).O();
                return O;
            }
        });
    }

    @Override // o.HD1
    public final void K0(int i) {
        R4();
        final g gVar = this.e1;
        if (!N4(34)) {
            return;
        }
        P4(p4(i), new InterfaceC8331nh2() { // from class: o.b72
            @Override // o.InterfaceC8331nh2
            public final Object get() {
                G72.g O;
                G72.g gVar2 = G72.g.this;
                O = gVar2.a().c0(Math.max(0, gVar2.t - 1)).O();
                return O;
            }
        });
    }

    @Override // o.HD1
    public final C3773Nr2 L0() {
        R4();
        return X3(this.e1);
    }

    @Override // o.HD1
    public final void L1(List<C8322nf1> list, int i, long j) {
        R4();
        if (i == -1) {
            g gVar = this.e1;
            int i2 = gVar.B;
            long j2 = gVar.E.get();
            i = i2;
            j = j2;
        }
        M4(list, i, j);
    }

    public final void L4(Runnable runnable) {
        if (this.b1.h() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.b1.k(runnable);
        }
    }

    @HS1({"state"})
    public final void M4(final List<C8322nf1> list, final int i, final long j) {
        boolean z;
        if (i != -1 && i < 0) {
            z = false;
        } else {
            z = true;
        }
        C9542sf.a(z);
        final g gVar = this.e1;
        if (!N4(20) && (list.size() != 1 || !N4(31))) {
            return;
        }
        P4(z4(list, i, j), new InterfaceC8331nh2() { // from class: o.w72
            @Override // o.InterfaceC8331nh2
            public final Object get() {
                return G72.g3(G72.this, list, gVar, i, j);
            }
        });
    }

    @Override // o.HD1
    public final void N(final C2989Fr2 c2989Fr2) {
        R4();
        final g gVar = this.e1;
        if (!N4(29)) {
            return;
        }
        P4(F4(c2989Fr2), new InterfaceC8331nh2() { // from class: o.z72
            @Override // o.InterfaceC8331nh2
            public final Object get() {
                G72.g O;
                O = G72.g.this.a().w0(c2989Fr2).O();
                return O;
            }
        });
    }

    @Override // o.HD1
    public final long N1() {
        R4();
        return this.e1.k;
    }

    @HS1({"state"})
    public final boolean N4(int i) {
        if (!this.f1 && this.e1.a.d(i)) {
            return true;
        }
        return false;
    }

    @Override // o.HD1
    public final boolean O() {
        R4();
        if (this.e1.C != -1) {
            return true;
        }
        return false;
    }

    @HS1({"state"})
    public final void O4(final g gVar, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        final C8322nf1 c8322nf1;
        g gVar2 = this.e1;
        this.e1 = gVar;
        if (gVar.J || gVar.w) {
            this.e1 = gVar.a().P().g0(false).O();
        }
        if (gVar2.b != gVar.b) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (gVar2.d != gVar.d) {
            z4 = true;
        } else {
            z4 = false;
        }
        C3773Nr2 X3 = X3(gVar2);
        final C3773Nr2 X32 = X3(gVar);
        C11005yf1 a4 = a4(gVar2);
        final C11005yf1 a42 = a4(gVar);
        final int f4 = f4(gVar2, gVar, z, this.Y0, this.d1);
        boolean equals = gVar2.z.equals(gVar.z);
        final int Z3 = Z3(gVar2, gVar, f4, z2, this.Y0);
        if (!equals) {
            final int m4 = m4(gVar2.y, gVar.y);
            this.Z0.i(0, new C9876u11.a() { // from class: o.D72
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    HD1.g gVar3 = (HD1.g) obj;
                    gVar3.T(G72.g.this.z, m4);
                }
            });
        }
        if (f4 != -1) {
            final HD1.k g4 = g4(gVar2, false, this.Y0, this.d1);
            final HD1.k g42 = g4(gVar, gVar.J, this.Y0, this.d1);
            this.Z0.i(11, new C9876u11.a() { // from class: o.E62
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    G72.H2(f4, g4, g42, (HD1.g) obj);
                }
            });
        }
        if (Z3 != -1) {
            if (gVar.z.x()) {
                c8322nf1 = null;
            } else {
                c8322nf1 = gVar.y.get(U3(gVar)).c;
            }
            this.Z0.i(1, new C9876u11.a() { // from class: o.P62
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).x0(C8322nf1.this, Z3);
                }
            });
        }
        if (!TD2.g(gVar2.f, gVar.f)) {
            this.Z0.i(10, new C9876u11.a() { // from class: o.S62
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).g0(G72.g.this.f);
                }
            });
            if (gVar.f != null) {
                this.Z0.i(10, new C9876u11.a() { // from class: o.T62
                    @Override // o.C9876u11.a
                    public final void invoke(Object obj) {
                        ((HD1.g) obj).S((AD1) TD2.o(G72.g.this.f));
                    }
                });
            }
        }
        if (!gVar2.n.equals(gVar.n)) {
            this.Z0.i(19, new C9876u11.a() { // from class: o.U62
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).k0(G72.g.this.n);
                }
            });
        }
        if (!X3.equals(X32)) {
            this.Z0.i(2, new C9876u11.a() { // from class: o.V62
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).M(C3773Nr2.this);
                }
            });
        }
        if (!a4.equals(a42)) {
            this.Z0.i(14, new C9876u11.a() { // from class: o.W62
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).p0(C11005yf1.this);
                }
            });
        }
        if (gVar2.i != gVar.i) {
            this.Z0.i(3, new C9876u11.a() { // from class: o.X62
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    G72.P2(G72.g.this, (HD1.g) obj);
                }
            });
        }
        if (z3 || z4) {
            this.Z0.i(-1, new C9876u11.a() { // from class: o.Y62
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).q0(r0.b, G72.g.this.d);
                }
            });
        }
        if (z4) {
            this.Z0.i(4, new C9876u11.a() { // from class: o.E72
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).O(G72.g.this.d);
                }
            });
        }
        if (z3 || gVar2.c != gVar.c) {
            this.Z0.i(5, new C9876u11.a() { // from class: o.F72
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).w0(r0.b, G72.g.this.c);
                }
            });
        }
        if (gVar2.e != gVar.e) {
            this.Z0.i(6, new C9876u11.a() { // from class: o.w62
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).K(G72.g.this.e);
                }
            });
        }
        if (K4(gVar2) != K4(gVar)) {
            this.Z0.i(7, new C9876u11.a() { // from class: o.x62
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).y0(G72.K4(G72.g.this));
                }
            });
        }
        if (!gVar2.m.equals(gVar.m)) {
            this.Z0.i(12, new C9876u11.a() { // from class: o.y62
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).A(G72.g.this.m);
                }
            });
        }
        if (gVar2.g != gVar.g) {
            this.Z0.i(8, new C9876u11.a() { // from class: o.z62
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).f1(G72.g.this.g);
                }
            });
        }
        if (gVar2.h != gVar.h) {
            this.Z0.i(9, new C9876u11.a() { // from class: o.A62
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).Q(G72.g.this.h);
                }
            });
        }
        if (gVar2.j != gVar.j) {
            this.Z0.i(16, new C9876u11.a() { // from class: o.B62
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).V(G72.g.this.j);
                }
            });
        }
        if (gVar2.k != gVar.k) {
            this.Z0.i(17, new C9876u11.a() { // from class: o.C62
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).t0(G72.g.this.k);
                }
            });
        }
        if (gVar2.l != gVar.l) {
            this.Z0.i(18, new C9876u11.a() { // from class: o.D62
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).v0(G72.g.this.l);
                }
            });
        }
        if (!gVar2.f464o.equals(gVar.f464o)) {
            this.Z0.i(20, new C9876u11.a() { // from class: o.F62
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).X(G72.g.this.f464o);
                }
            });
        }
        if (!gVar2.q.equals(gVar.q)) {
            this.Z0.i(25, new C9876u11.a() { // from class: o.H62
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).t(G72.g.this.q);
                }
            });
        }
        if (!gVar2.s.equals(gVar.s)) {
            this.Z0.i(29, new C9876u11.a() { // from class: o.I62
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).r0(G72.g.this.s);
                }
            });
        }
        if (!gVar2.A.equals(gVar.A)) {
            this.Z0.i(15, new C9876u11.a() { // from class: o.J62
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).Y(G72.g.this.A);
                }
            });
        }
        if (gVar.w) {
            this.Z0.i(26, new C4607Wh0());
        }
        if (!gVar2.v.equals(gVar.v)) {
            this.Z0.i(24, new C9876u11.a() { // from class: o.K62
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).a0(r0.v.b(), G72.g.this.v.a());
                }
            });
        }
        if (gVar2.p != gVar.p) {
            this.Z0.i(22, new C9876u11.a() { // from class: o.L62
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).j0(G72.g.this.p);
                }
            });
        }
        if (gVar2.t != gVar.t || gVar2.u != gVar.u) {
            this.Z0.i(30, new C9876u11.a() { // from class: o.M62
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).U(r0.t, G72.g.this.u);
                }
            });
        }
        if (!gVar2.r.equals(gVar.r)) {
            this.Z0.i(27, new C9876u11.a() { // from class: o.N62
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    G72.H3(G72.g.this, (HD1.g) obj);
                }
            });
        }
        if (!gVar2.x.equals(gVar.x) && gVar.x.Y != C10323vs.b) {
            this.Z0.i(28, new C9876u11.a() { // from class: o.O62
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).s(G72.g.this.x);
                }
            });
        }
        if (!gVar2.a.equals(gVar.a)) {
            this.Z0.i(13, new C9876u11.a() { // from class: o.Q62
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).b0(G72.g.this.a);
                }
            });
        }
        this.Z0.g();
    }

    @Override // o.HD1
    public final long P1() {
        R4();
        return T3(this.e1);
    }

    @HS1({"state"})
    public final void P4(InterfaceFutureC8411o11<?> interfaceFutureC8411o11, InterfaceC8331nh2<g> interfaceC8331nh2) {
        Q4(interfaceFutureC8411o11, interfaceC8331nh2, false, false);
    }

    @HS1({"state"})
    public final void Q4(final InterfaceFutureC8411o11<?> interfaceFutureC8411o11, InterfaceC8331nh2<g> interfaceC8331nh2, boolean z, boolean z2) {
        if (interfaceFutureC8411o11.isDone() && this.c1.isEmpty()) {
            O4(i4(), z, z2);
            return;
        }
        this.c1.add(interfaceFutureC8411o11);
        O4(e4(interfaceC8331nh2.get()), z, z2);
        interfaceFutureC8411o11.h4(new Runnable() { // from class: o.k72
            @Override // java.lang.Runnable
            public final void run() {
                G72.R2(G72.this, interfaceFutureC8411o11);
            }
        }, new Executor() { // from class: o.l72
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                G72.this.L4(runnable);
            }
        });
    }

    @Override // o.HD1
    public final long R() {
        R4();
        return this.e1.I.get();
    }

    @Override // o.HD1
    public final int R0() {
        R4();
        return this.e1.C;
    }

    public final void R3(@InterfaceC11300zs1 Object obj) {
        R4();
        final g gVar = this.e1;
        if (!N4(27)) {
            return;
        }
        P4(o4(obj), new InterfaceC8331nh2() { // from class: o.q72
            @Override // o.InterfaceC8331nh2
            public final Object get() {
                G72.g O;
                O = G72.g.this.a().t0(L82.d).O();
                return O;
            }
        });
    }

    @InterfaceC8557od0({"state"})
    public final void R4() {
        if (Thread.currentThread() == this.a1.getThread()) {
            if (this.e1 == null) {
                this.e1 = i4();
                return;
            }
            return;
        }
        throw new IllegalStateException(TD2.M("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.a1.getThread().getName()));
    }

    @Override // o.HD1
    public final void S(final boolean z, int i) {
        R4();
        final g gVar = this.e1;
        if (!N4(34)) {
            return;
        }
        P4(x4(z, i), new InterfaceC8331nh2() { // from class: o.u72
            @Override // o.InterfaceC8331nh2
            public final Object get() {
                G72.g O;
                O = G72.g.this.a().d0(z).O();
                return O;
            }
        });
    }

    @Override // o.HD1
    public final void S1(int i, final List<C8322nf1> list) {
        boolean z;
        R4();
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        final g gVar = this.e1;
        int size = gVar.y.size();
        if (N4(20) && !list.isEmpty()) {
            final int min = Math.min(i, size);
            P4(n4(min, list), new InterfaceC8331nh2() { // from class: o.v62
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    return G72.E3(G72.this, gVar, list, min);
                }
            });
        }
    }

    @Override // o.HD1
    public final long U1() {
        R4();
        if (O()) {
            return Math.max(this.e1.H.get(), this.e1.F.get());
        }
        return o2();
    }

    @Override // o.HD1
    public final int X() {
        R4();
        return this.e1.d;
    }

    @Override // o.HD1
    public final C11005yf1 Y1() {
        R4();
        return this.e1.A;
    }

    @Override // o.HD1
    public final int Z0() {
        R4();
        return this.e1.e;
    }

    @Override // o.HD1
    public final boolean a() {
        R4();
        return this.e1.i;
    }

    @Override // o.HD1
    public final C9546sg b() {
        R4();
        return this.e1.f464o;
    }

    @Override // o.HD1
    @InterfaceC11300zs1
    public final AD1 c() {
        R4();
        return this.e1.f;
    }

    @Override // o.HD1
    public final int c2() {
        R4();
        return U3(this.e1);
    }

    @InterfaceC6919hx0
    public b d4(C8322nf1 c8322nf1) {
        return new b.a(new d()).z(c8322nf1).u(true).v(true).q();
    }

    @Override // o.HD1
    public final void e0(List<C8322nf1> list, boolean z) {
        int i;
        long j;
        R4();
        if (z) {
            i = -1;
        } else {
            i = this.e1.B;
        }
        if (z) {
            j = C10323vs.b;
        } else {
            j = this.e1.E.get();
        }
        M4(list, i, j);
    }

    @Override // o.HD1
    public final AbstractC7373jp2 e1() {
        R4();
        return this.e1.z;
    }

    @Override // o.HD1
    public final void f(final DD1 dd1) {
        R4();
        final g gVar = this.e1;
        if (!N4(13)) {
            return;
        }
        P4(B4(dd1), new InterfaceC8331nh2() { // from class: o.x72
            @Override // o.InterfaceC8331nh2
            public final Object get() {
                G72.g O;
                O = G72.g.this.a().i0(dd1).O();
                return O;
            }
        });
    }

    @Override // o.HD1
    public final void f1(HD1.g gVar) {
        R4();
        this.Z0.k(gVar);
    }

    @Override // o.HD1
    public final void g() {
        R4();
        final g gVar = this.e1;
        if (!N4(32)) {
            return;
        }
        P4(t4(), new InterfaceC8331nh2() { // from class: o.a72
            @Override // o.InterfaceC8331nh2
            public final Object get() {
                return G72.G2(G72.g.this);
            }
        });
        this.f1 = true;
        this.Z0.j();
        this.e1 = this.e1.a().j0(1).v0(f.a).V(f.b(T3(gVar))).Q(gVar.F).e0(false).O();
    }

    @Override // o.HD1
    public final long getCurrentPosition() {
        R4();
        if (O()) {
            return this.e1.F.get();
        }
        return P1();
    }

    @Override // o.HD1
    public final long getDuration() {
        R4();
        if (O()) {
            this.e1.z.k(C1(), this.d1);
            AbstractC7373jp2.b bVar = this.d1;
            g gVar = this.e1;
            return TD2.b2(bVar.f(gVar.C, gVar.D));
        }
        return B1();
    }

    @Override // o.HD1
    public final float getVolume() {
        R4();
        return this.e1.p;
    }

    @Override // o.HD1
    public final DD1 h() {
        R4();
        return this.e1.m;
    }

    @Override // o.HD1
    public final void h0(int i) {
        R4();
        final g gVar = this.e1;
        if (!N4(34)) {
            return;
        }
        P4(q4(i), new InterfaceC8331nh2() { // from class: o.f72
            @Override // o.InterfaceC8331nh2
            public final Object get() {
                G72.g O;
                O = r0.a().c0(G72.g.this.t + 1).O();
                return O;
            }
        });
    }

    @Override // o.HD1
    public final Looper h1() {
        return this.a1;
    }

    @Override // o.HD1
    public final C2989Fr2 i1() {
        R4();
        return this.e1.n;
    }

    @InterfaceC6919hx0
    public abstract g i4();

    @Override // o.HD1
    public final L82 k0() {
        R4();
        return this.e1.v;
    }

    @Override // o.HD1
    public final void k2(final int i, int i2, int i3) {
        boolean z;
        R4();
        if (i >= 0 && i2 >= i && i3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        final g gVar = this.e1;
        int size = gVar.y.size();
        if (N4(20) && size != 0 && i < size) {
            final int min = Math.min(i2, size);
            final int min2 = Math.min(i3, gVar.y.size() - (min - i));
            if (i != min && min2 != i) {
                P4(r4(i, min, min2), new InterfaceC8331nh2() { // from class: o.A72
                    @Override // o.InterfaceC8331nh2
                    public final Object get() {
                        return G72.U2(G72.this, gVar, i, min, min2);
                    }
                });
            }
        }
    }

    @Override // o.HD1
    public final void l(@InterfaceC11300zs1 Surface surface) {
        R4();
        final g gVar = this.e1;
        if (!N4(27)) {
            return;
        }
        if (surface == null) {
            F();
        } else {
            P4(G4(surface), new InterfaceC8331nh2() { // from class: o.e72
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    G72.g O;
                    O = G72.g.this.a().t0(L82.c).O();
                    return O;
                }
            });
        }
    }

    @Override // o.HD1
    public final void l0(final int i, int i2, final List<C8322nf1> list) {
        boolean z;
        R4();
        if (i >= 0 && i <= i2) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        final g gVar = this.e1;
        int size = gVar.y.size();
        if (N4(20) && i <= size) {
            final int min = Math.min(i2, size);
            P4(v4(i, min, list), new InterfaceC8331nh2() { // from class: o.C72
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    return G72.K3(G72.this, gVar, list, min, i);
                }
            });
        }
    }

    @Override // o.HD1
    public final void l1(HD1.g gVar) {
        this.Z0.c((HD1.g) C9542sf.g(gVar));
    }

    @Override // o.HD1
    public final void m(@InterfaceC11300zs1 Surface surface) {
        R3(surface);
    }

    @Override // o.HD1
    public final void m0() {
        R4();
        final g gVar = this.e1;
        if (!N4(2)) {
            return;
        }
        P4(s4(), new InterfaceC8331nh2() { // from class: o.i72
            @Override // o.InterfaceC8331nh2
            public final Object get() {
                return G72.B3(G72.g.this);
            }
        });
    }

    @Override // o.HD1
    @Deprecated
    public final void n() {
        R4();
        final g gVar = this.e1;
        if (!N4(26)) {
            return;
        }
        P4(p4(1), new InterfaceC8331nh2() { // from class: o.j72
            @Override // o.InterfaceC8331nh2
            public final Object get() {
                G72.g O;
                G72.g gVar2 = G72.g.this;
                O = gVar2.a().c0(Math.max(0, gVar2.t - 1)).O();
                return O;
            }
        });
    }

    @Override // o.HD1
    public final boolean n2() {
        R4();
        return this.e1.h;
    }

    @InterfaceC6919hx0
    public InterfaceFutureC8411o11<?> n4(int i, List<C8322nf1> list) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    @Override // o.HD1
    public final void o(@InterfaceC11300zs1 final SurfaceView surfaceView) {
        R4();
        final g gVar = this.e1;
        if (!N4(27)) {
            return;
        }
        if (surfaceView == null) {
            F();
        } else {
            P4(G4(surfaceView), new InterfaceC8331nh2() { // from class: o.R62
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    G72.g O;
                    O = G72.g.this.a().t0(G72.l4(surfaceView.getHolder())).O();
                    return O;
                }
            });
        }
    }

    @Override // o.HD1
    public final long o2() {
        R4();
        return Math.max(S3(this.e1), T3(this.e1));
    }

    @InterfaceC6919hx0
    public InterfaceFutureC8411o11<?> o4(@InterfaceC11300zs1 Object obj) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
    }

    @Override // o.HD1
    public final void p(@InterfaceC11300zs1 final SurfaceHolder surfaceHolder) {
        R4();
        final g gVar = this.e1;
        if (!N4(27)) {
            return;
        }
        if (surfaceHolder == null) {
            F();
        } else {
            P4(G4(surfaceHolder), new InterfaceC8331nh2() { // from class: o.v72
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    G72.g O;
                    O = G72.g.this.a().t0(G72.l4(surfaceHolder)).O();
                    return O;
                }
            });
        }
    }

    @InterfaceC6919hx0
    public InterfaceFutureC8411o11<?> p4(int i) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    @InterfaceC6919hx0
    public InterfaceFutureC8411o11<?> q4(int i) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    @InterfaceC6919hx0
    public InterfaceFutureC8411o11<?> r4(int i, int i2, int i3) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    @Override // o.HD1
    public final C8274nS s() {
        R4();
        return this.e1.r;
    }

    @Override // o.HD1
    public final void s0(final int i, int i2) {
        boolean z;
        final int min;
        R4();
        if (i >= 0 && i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        final g gVar = this.e1;
        int size = gVar.y.size();
        if (N4(20) && size != 0 && i < size && i != (min = Math.min(i2, size))) {
            P4(u4(i, min), new InterfaceC8331nh2() { // from class: o.t72
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    return G72.w3(G72.this, gVar, i, min);
                }
            });
        }
    }

    @Override // o.HD1
    public final C11005yf1 s2() {
        R4();
        return a4(this.e1);
    }

    @InterfaceC6919hx0
    public InterfaceFutureC8411o11<?> s4() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_PREPARE");
    }

    @Override // o.HD1
    public final void setVolume(final float f2) {
        R4();
        final g gVar = this.e1;
        if (!N4(24)) {
            return;
        }
        P4(H4(f2), new InterfaceC8331nh2() { // from class: o.d72
            @Override // o.InterfaceC8331nh2
            public final Object get() {
                G72.g O;
                O = G72.g.this.a().y0(f2).O();
                return O;
            }
        });
    }

    @Override // o.HD1
    public final void stop() {
        R4();
        final g gVar = this.e1;
        if (!N4(3)) {
            return;
        }
        P4(I4(), new InterfaceC8331nh2() { // from class: o.h72
            @Override // o.InterfaceC8331nh2
            public final Object get() {
                G72.g O;
                O = r0.a().j0(1).v0(G72.f.a).V(G72.f.b(G72.T3(r0))).Q(G72.g.this.F).e0(false).O();
                return O;
            }
        });
    }

    @Override // o.HD1
    @Deprecated
    public final void t(final boolean z) {
        R4();
        final g gVar = this.e1;
        if (!N4(26)) {
            return;
        }
        P4(x4(z, 1), new InterfaceC8331nh2() { // from class: o.p72
            @Override // o.InterfaceC8331nh2
            public final Object get() {
                G72.g O;
                O = G72.g.this.a().d0(z).O();
                return O;
            }
        });
    }

    @Override // o.HD1
    public final HD1.c t1() {
        R4();
        return this.e1.a;
    }

    @InterfaceC6919hx0
    public InterfaceFutureC8411o11<?> t4() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_RELEASE");
    }

    @Override // o.HD1
    public final void u0(final int i) {
        R4();
        final g gVar = this.e1;
        if (!N4(15)) {
            return;
        }
        P4(D4(i), new InterfaceC8331nh2() { // from class: o.g72
            @Override // o.InterfaceC8331nh2
            public final Object get() {
                G72.g O;
                O = G72.g.this.a().p0(i).O();
                return O;
            }
        });
    }

    @Override // o.HD1
    public final boolean u1() {
        R4();
        return this.e1.b;
    }

    @Override // o.HD1
    public final long u2() {
        R4();
        return this.e1.j;
    }

    @InterfaceC6919hx0
    public InterfaceFutureC8411o11<?> u4(int i, int i2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    @Override // o.HD1
    @Deprecated
    public final void v() {
        R4();
        final g gVar = this.e1;
        if (!N4(26)) {
            return;
        }
        P4(q4(1), new InterfaceC8331nh2() { // from class: o.G62
            @Override // o.InterfaceC8331nh2
            public final Object get() {
                G72.g O;
                O = r0.a().c0(G72.g.this.t + 1).O();
                return O;
            }
        });
    }

    @Override // o.HD1
    public final void v1(final boolean z) {
        R4();
        final g gVar = this.e1;
        if (!N4(14)) {
            return;
        }
        P4(E4(z), new InterfaceC8331nh2() { // from class: o.c72
            @Override // o.InterfaceC8331nh2
            public final Object get() {
                G72.g O;
                O = G72.g.this.a().s0(z).O();
                return O;
            }
        });
    }

    @InterfaceC6919hx0
    public InterfaceFutureC8411o11<?> v4(int i, int i2, List<C8322nf1> list) {
        InterfaceFutureC8411o11<?> n4 = n4(i2, list);
        final InterfaceFutureC8411o11<?> u4 = u4(i, i2);
        return TD2.Z1(n4, new InterfaceC2731Df() { // from class: o.r72
            @Override // o.InterfaceC2731Df
            public final InterfaceFutureC8411o11 apply(Object obj) {
                return G72.v3(InterfaceFutureC8411o11.this, obj);
            }
        });
    }

    @Override // o.HD1
    public final void w(@InterfaceC11300zs1 TextureView textureView) {
        final L82 l82;
        R4();
        final g gVar = this.e1;
        if (!N4(27)) {
            return;
        }
        if (textureView == null) {
            F();
            return;
        }
        if (textureView.isAvailable()) {
            l82 = new L82(textureView.getWidth(), textureView.getHeight());
        } else {
            l82 = L82.d;
        }
        P4(G4(textureView), new InterfaceC8331nh2() { // from class: o.y72
            @Override // o.InterfaceC8331nh2
            public final Object get() {
                G72.g O;
                O = G72.g.this.a().t0(l82).O();
                return O;
            }
        });
    }

    @Override // o.HD1
    public final int w0() {
        R4();
        return this.e1.g;
    }

    @InterfaceC6919hx0
    public InterfaceFutureC8411o11<?> w4(int i, long j, int i2) {
        throw new IllegalStateException("Missing implementation to handle one of the COMMAND_SEEK_*");
    }

    @Override // o.HD1
    public final void x(@InterfaceC11300zs1 SurfaceHolder surfaceHolder) {
        R3(surfaceHolder);
    }

    @InterfaceC6919hx0
    public InterfaceFutureC8411o11<?> x4(boolean z, int i) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    @Override // o.HD1
    public final long y1() {
        R4();
        return this.e1.l;
    }

    @Override // o.AbstractC2559Bl
    @InterfaceC5056aJ2(otherwise = 4)
    public final void y2(final int i, final long j, int i2, boolean z) {
        boolean z2;
        R4();
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C9542sf.a(z2);
        final g gVar = this.e1;
        if (N4(i2) && !O()) {
            if (gVar.y.isEmpty() || i < gVar.y.size()) {
                Q4(w4(i, j, i2), new InterfaceC8331nh2() { // from class: o.m72
                    @Override // o.InterfaceC8331nh2
                    public final Object get() {
                        G72.g k4;
                        k4 = G72.k4(r0, G72.g.this.y, i, j);
                        return k4;
                    }
                }, true, z);
            }
        }
    }

    @InterfaceC6919hx0
    public InterfaceFutureC8411o11<?> y4(@BR0(from = 0) int i, int i2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_DEVICE_VOLUME or COMMAND_SET_DEVICE_VOLUME_WITH_FLAGS");
    }

    @Override // o.HD1
    public final int z() {
        R4();
        return this.e1.t;
    }

    @InterfaceC6919hx0
    public InterfaceFutureC8411o11<?> z4(List<C8322nf1> list, int i, long j) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_MEDIA_ITEM(S)");
    }

    public G72(Looper looper, LD ld) {
        this.a1 = looper;
        this.b1 = ld.d(looper, null);
        this.c1 = new HashSet<>();
        this.d1 = new AbstractC7373jp2.b();
        this.Z0 = new C9876u11<>(looper, ld, new C9876u11.b() { // from class: o.B72
            @Override // o.C9876u11.b
            public final void a(Object obj, C4170Ru0 c4170Ru0) {
                G72.N3(G72.this, (HD1.g) obj, c4170Ru0);
            }
        });
    }

    @InterfaceC6919hx0
    public g e4(g gVar) {
        return gVar;
    }
}
