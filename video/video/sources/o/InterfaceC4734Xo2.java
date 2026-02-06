package o;

import o.ZG;
import org.jetbrains.annotations.NotNull;

@InterfaceC6480g82(version = "1.9")
@InterfaceC10924yJ2(markerClass = {InterfaceC5395bj0.class})
/* renamed from: o.Xo2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4734Xo2 {
    @NotNull
    public static final a a = a.a;

    /* renamed from: o.Xo2$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
    }

    /* renamed from: o.Xo2$b */
    /* loaded from: classes3.dex */
    public static final class b implements c {
        @NotNull
        public static final b b = new b();

        @InterfaceC7542kW0
        @InterfaceC6480g82(version = "1.9")
        @InterfaceC10924yJ2(markerClass = {InterfaceC5395bj0.class})
        /* renamed from: o.Xo2$b$a */
        /* loaded from: classes3.dex */
        public static final class a implements ZG {
            public final long X;

            public /* synthetic */ a(long j) {
                this.X = j;
            }

            public static final /* synthetic */ a i(long j) {
                return new a(j);
            }

            public static final int j(long j, long j2) {
                return Y70.n(t(j, j2), Y70.Y.T());
            }

            public static int l(long j, @NotNull ZG zg) {
                C6562gT0.p(zg, "other");
                return i(j).compareTo(zg);
            }

            public static long n(long j) {
                return C3450Kk1.b.d(j);
            }

            public static boolean o(long j, Object obj) {
                if (!(obj instanceof a) || j != ((a) obj).A()) {
                    return false;
                }
                return true;
            }

            public static final boolean p(long j, long j2) {
                if (j == j2) {
                    return true;
                }
                return false;
            }

            public static boolean q(long j) {
                return Y70.S(n(j));
            }

            public static boolean r(long j) {
                return !Y70.S(n(j));
            }

            public static int s(long j) {
                return Long.hashCode(j);
            }

            public static final long t(long j, long j2) {
                return C3450Kk1.b.c(j, j2);
            }

            public static long v(long j, long j2) {
                return C3450Kk1.b.b(j, Y70.l0(j2));
            }

            public static long w(long j, @NotNull ZG zg) {
                C6562gT0.p(zg, "other");
                if (zg instanceof a) {
                    return t(j, ((a) zg).A());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) z(j)) + " and " + zg);
            }

            public static long y(long j, long j2) {
                return C3450Kk1.b.b(j, j2);
            }

            public static String z(long j) {
                return "ValueTimeMark(reading=" + j + ')';
            }

            public final /* synthetic */ long A() {
                return this.X;
            }

            @Override // o.ZG
            public long E0(@NotNull ZG zg) {
                C6562gT0.p(zg, "other");
                return w(this.X, zg);
            }

            @Override // java.lang.Comparable
            /* renamed from: H0 */
            public int compareTo(@NotNull ZG zg) {
                return ZG.a.a(this, zg);
            }

            @Override // o.ZG, o.InterfaceC3760No2
            public /* bridge */ /* synthetic */ ZG a0(long j) {
                return i(x(j));
            }

            @Override // o.InterfaceC3760No2
            public long e() {
                return n(this.X);
            }

            @Override // o.ZG
            public boolean equals(Object obj) {
                return o(this.X, obj);
            }

            @Override // o.InterfaceC3760No2
            public boolean g() {
                return r(this.X);
            }

            @Override // o.InterfaceC3760No2
            public boolean h() {
                return q(this.X);
            }

            @Override // o.ZG
            public int hashCode() {
                return s(this.X);
            }

            @Override // o.ZG, o.InterfaceC3760No2
            public /* bridge */ /* synthetic */ ZG m0(long j) {
                return i(u(j));
            }

            public String toString() {
                return z(this.X);
            }

            public long u(long j) {
                return v(this.X, j);
            }

            public long x(long j) {
                return y(this.X, j);
            }

            @Override // o.InterfaceC3760No2
            public /* bridge */ /* synthetic */ InterfaceC3760No2 a0(long j) {
                return i(x(j));
            }

            @Override // o.InterfaceC3760No2
            public /* bridge */ /* synthetic */ InterfaceC3760No2 m0(long j) {
                return i(u(j));
            }

            public static long m(long j) {
                return j;
            }
        }

        @Override // o.InterfaceC4734Xo2.c, o.InterfaceC4734Xo2
        public /* bridge */ /* synthetic */ ZG a() {
            return a.i(b());
        }

        public long b() {
            return C3450Kk1.b.e();
        }

        @NotNull
        public String toString() {
            return C3450Kk1.b.toString();
        }

        @Override // o.InterfaceC4734Xo2
        public /* bridge */ /* synthetic */ InterfaceC3760No2 a() {
            return a.i(b());
        }
    }

    @InterfaceC6480g82(version = "1.9")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5395bj0.class})
    /* renamed from: o.Xo2$c */
    /* loaded from: classes3.dex */
    public interface c extends InterfaceC4734Xo2 {
        @Override // o.InterfaceC4734Xo2
        @NotNull
        ZG a();
    }

    @NotNull
    InterfaceC3760No2 a();
}
