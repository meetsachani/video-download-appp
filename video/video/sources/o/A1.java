package o;

import o.InterfaceC4734Xo2;
import o.ZG;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC6480g82(version = "1.9")
@InterfaceC10924yJ2(markerClass = {InterfaceC5395bj0.class})
/* loaded from: classes3.dex */
public abstract class A1 implements InterfaceC4734Xo2.c {
    @NotNull
    public final EnumC6964i80 b;
    @NotNull
    public final EY0 c;

    @InterfaceC8303na2({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,202:1\n80#2:203\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n*L\n67#1:203\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class a implements ZG {
        public final long X;
        @NotNull
        public final A1 Y;
        public final long Z;

        public /* synthetic */ a(long j, A1 a1, long j2, C9516sY c9516sY) {
            this(j, a1, j2);
        }

        @Override // o.ZG
        public long E0(@NotNull ZG zg) {
            C6562gT0.p(zg, "other");
            if (zg instanceof a) {
                a aVar = (a) zg;
                if (C6562gT0.g(this.Y, aVar.Y)) {
                    return Y70.V(Y41.h(this.X, aVar.X, this.Y.e()), Y70.U(this.Z, aVar.Z));
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + zg);
        }

        @Override // java.lang.Comparable
        /* renamed from: H0 */
        public int compareTo(@NotNull ZG zg) {
            return ZG.a.a(this, zg);
        }

        @Override // o.InterfaceC3760No2
        public long e() {
            return Y70.U(Y41.h(this.Y.d(), this.X, this.Y.e()), this.Z);
        }

        @Override // o.ZG
        public boolean equals(@Nullable Object obj) {
            if ((obj instanceof a) && C6562gT0.g(this.Y, ((a) obj).Y) && Y70.t(E0((ZG) obj), Y70.Y.T())) {
                return true;
            }
            return false;
        }

        @Override // o.InterfaceC3760No2
        public boolean g() {
            return ZG.a.c(this);
        }

        @Override // o.InterfaceC3760No2
        public boolean h() {
            return ZG.a.b(this);
        }

        @Override // o.ZG
        public int hashCode() {
            return (Y70.N(this.Z) * 37) + Long.hashCode(this.X);
        }

        @Override // o.InterfaceC3760No2
        @NotNull
        public ZG m0(long j) {
            return ZG.a.d(this, j);
        }

        @NotNull
        public String toString() {
            return "LongTimeMark(" + this.X + C7691l80.h(this.Y.e()) + " + " + ((Object) Y70.h0(this.Z)) + C6566gU0.h + this.Y + ')';
        }

        public a(long j, A1 a1, long j2) {
            C6562gT0.p(a1, "timeSource");
            this.X = j;
            this.Y = a1;
            this.Z = j2;
        }

        @Override // o.InterfaceC3760No2
        @NotNull
        public ZG a0(long j) {
            EnumC6964i80 e = this.Y.e();
            if (Y70.R(j)) {
                return new a(Y41.d(this.X, e, j), this.Y, Y70.Y.T(), null);
            }
            long k0 = Y70.k0(j, e);
            long V = Y70.V(Y70.U(j, k0), this.Z);
            long d = Y41.d(this.X, e, k0);
            long k02 = Y70.k0(V, e);
            long d2 = Y41.d(d, e, k02);
            long U = Y70.U(V, k02);
            long C = Y70.C(U);
            if (d2 != 0 && C != 0 && (d2 ^ C) < 0) {
                long w = C6223f80.w(C8071md1.V(C), e);
                d2 = Y41.d(d2, e, w);
                U = Y70.U(U, w);
            }
            if ((1 | (d2 - 1)) == Long.MAX_VALUE) {
                U = Y70.Y.T();
            }
            return new a(d2, this.Y, U, null);
        }
    }

    public A1(@NotNull EnumC6964i80 enumC6964i80) {
        C6562gT0.p(enumC6964i80, "unit");
        this.b = enumC6964i80;
        this.c = WY0.b(new FA0() { // from class: o.z1
            @Override // o.FA0
            public final Object invoke() {
                long h;
                h = A1.h(A1.this);
                return Long.valueOf(h);
            }
        });
    }

    public static final long h(A1 a1) {
        return a1.g();
    }

    public final long d() {
        return g() - f();
    }

    @NotNull
    public final EnumC6964i80 e() {
        return this.b;
    }

    public final long f() {
        return ((Number) this.c.getValue()).longValue();
    }

    public abstract long g();

    @Override // o.InterfaceC4734Xo2
    @NotNull
    public ZG a() {
        return new a(d(), this, Y70.Y.T(), null);
    }
}
