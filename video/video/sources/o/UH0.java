package o;

import android.net.Uri;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public final class UH0 extends WH0 {
    public static final int w = 0;
    public static final int x = 1;
    public static final int y = 2;
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f624o;
    public final boolean p;
    @InterfaceC11300zs1
    public final C6960i70 q;
    public final List<e> r;
    public final List<b> s;
    public final Map<Uri, d> t;
    public final long u;
    public final g v;

    /* loaded from: classes2.dex */
    public static final class b extends f {
        public final boolean g1;
        public final boolean h1;

        public b(String str, @InterfaceC11300zs1 e eVar, long j, int i, long j2, @InterfaceC11300zs1 C6960i70 c6960i70, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 String str3, long j3, long j4, boolean z, boolean z2, boolean z3) {
            super(str, eVar, j, i, j2, c6960i70, str2, str3, j3, j4, z);
            this.g1 = z2;
            this.h1 = z3;
        }

        public b g(long j, int i) {
            return new b(this.X, this.Y, this.Z, i, j, this.a1, this.b1, this.c1, this.d1, this.e1, this.f1, this.g1, this.h1);
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface c {
    }

    /* loaded from: classes2.dex */
    public static final class d {
        public final Uri a;
        public final long b;
        public final int c;

        public d(Uri uri, long j, int i) {
            this.a = uri;
            this.b = j;
            this.c = i;
        }
    }

    /* loaded from: classes2.dex */
    public static class f implements Comparable<Long> {
        public final String X;
        @InterfaceC11300zs1
        public final e Y;
        public final int Y0;
        public final long Z;
        public final long Z0;
        @InterfaceC11300zs1
        public final C6960i70 a1;
        @InterfaceC11300zs1
        public final String b1;
        @InterfaceC11300zs1
        public final String c1;
        public final long d1;
        public final long e1;
        public final boolean f1;

        @Override // java.lang.Comparable
        /* renamed from: e */
        public int compareTo(Long l) {
            if (this.Z0 > l.longValue()) {
                return 1;
            }
            if (this.Z0 < l.longValue()) {
                return -1;
            }
            return 0;
        }

        public f(String str, @InterfaceC11300zs1 e eVar, long j, int i, long j2, @InterfaceC11300zs1 C6960i70 c6960i70, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 String str3, long j3, long j4, boolean z) {
            this.X = str;
            this.Y = eVar;
            this.Z = j;
            this.Y0 = i;
            this.Z0 = j2;
            this.a1 = c6960i70;
            this.b1 = str2;
            this.c1 = str3;
            this.d1 = j3;
            this.e1 = j4;
            this.f1 = z;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g {
        public final long a;
        public final boolean b;
        public final long c;
        public final long d;
        public final boolean e;

        public g(long j, boolean z, long j2, long j3, boolean z2) {
            this.a = j;
            this.b = z;
            this.c = j2;
            this.d = j3;
            this.e = z2;
        }
    }

    public UH0(int i, String str, List<String> list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, @InterfaceC11300zs1 C6960i70 c6960i70, List<e> list2, List<b> list3, g gVar, Map<Uri, d> map) {
        super(str, list, z3);
        this.d = i;
        this.h = j2;
        this.g = z;
        this.i = z2;
        this.j = i2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.f624o = z4;
        this.p = z5;
        this.q = c6960i70;
        this.r = AbstractC5317bO0.F(list2);
        this.s = AbstractC5317bO0.F(list3);
        this.t = AbstractC6044eO0.g(map);
        if (!list3.isEmpty()) {
            b bVar = (b) C5098aU0.w(list3);
            this.u = bVar.Z0 + bVar.Z;
        } else if (!list2.isEmpty()) {
            e eVar = (e) C5098aU0.w(list2);
            this.u = eVar.Z0 + eVar.Z;
        } else {
            this.u = 0L;
        }
        long j6 = C10323vs.b;
        if (j != C10323vs.b) {
            if (j >= 0) {
                j6 = Math.min(this.u, j);
            } else {
                j6 = Math.max(0L, this.u + j);
            }
        }
        this.e = j6;
        this.f = j >= 0;
        this.v = gVar;
    }

    public UH0 c(long j, int i) {
        return new UH0(this.d, this.a, this.b, this.e, this.g, j, true, i, this.k, this.l, this.m, this.n, this.c, this.f624o, this.p, this.q, this.r, this.s, this.v, this.t);
    }

    public UH0 d() {
        if (this.f624o) {
            return this;
        }
        return new UH0(this.d, this.a, this.b, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.c, true, this.p, this.q, this.r, this.s, this.v, this.t);
    }

    public long e() {
        return this.h + this.u;
    }

    public boolean f(@InterfaceC11300zs1 UH0 uh0) {
        if (uh0 != null) {
            long j = this.k;
            long j2 = uh0.k;
            if (j <= j2) {
                if (j < j2) {
                    return false;
                }
                int size = this.r.size() - uh0.r.size();
                if (size != 0) {
                    if (size > 0) {
                        return true;
                    }
                    return false;
                }
                int size2 = this.s.size();
                int size3 = uh0.s.size();
                if (size2 <= size3 && (size2 != size3 || !this.f624o || uh0.f624o)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* loaded from: classes2.dex */
    public static final class e extends f {
        public final String g1;
        public final List<b> h1;

        public e(String str, long j, long j2, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 String str3) {
            this(str, null, "", 0L, -1, C10323vs.b, null, str2, str3, j, j2, false, AbstractC5317bO0.L());
        }

        public e g(long j, int i) {
            ArrayList arrayList = new ArrayList();
            long j2 = j;
            for (int i2 = 0; i2 < this.h1.size(); i2++) {
                b bVar = this.h1.get(i2);
                arrayList.add(bVar.g(j2, i));
                j2 += bVar.Z;
            }
            return new e(this.X, this.Y, this.g1, this.Z, i, j, this.a1, this.b1, this.c1, this.d1, this.e1, this.f1, arrayList);
        }

        public e(String str, @InterfaceC11300zs1 e eVar, String str2, long j, int i, long j2, @InterfaceC11300zs1 C6960i70 c6960i70, @InterfaceC11300zs1 String str3, @InterfaceC11300zs1 String str4, long j3, long j4, boolean z, List<b> list) {
            super(str, eVar, j, i, j2, c6960i70, str3, str4, j3, j4, z);
            this.g1 = str2;
            this.h1 = AbstractC5317bO0.F(list);
        }
    }

    @Override // o.InterfaceC4651Ws0
    /* renamed from: b */
    public UH0 a(List<C3031Gd2> list) {
        return this;
    }
}
