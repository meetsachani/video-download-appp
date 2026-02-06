package o;

import java.io.Serializable;
import o.Y70;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC5395bj0
@InterfaceC8303na2({"SMAP\nInstant.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Instant.kt\nkotlin/time/Instant\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Instant.kt\nkotlin/time/InstantKt\n+ 4 Duration.kt\nkotlin/time/Duration\n*L\n1#1,799:1\n1#2:800\n738#3,14:801\n721#3,6:815\n738#3,14:821\n721#3,6:835\n721#3,6:842\n549#4:841\n*S KotlinDebug\n*F\n+ 1 Instant.kt\nkotlin/time/Instant\n*L\n148#1:801,14\n151#1:815,6\n159#1:821,14\n162#1:835,6\n186#1:842,6\n182#1:841\n*E\n"})
@InterfaceC6480g82(version = "2.1")
/* renamed from: o.zQ0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11193zQ0 implements Comparable<C11193zQ0>, Serializable {
    public final long X;
    public final int Y;
    @NotNull
    public static final a Z = new a(null);
    @NotNull
    public static final C11193zQ0 Y0 = new C11193zQ0(MQ0.c, 0);
    @NotNull
    public static final C11193zQ0 Z0 = new C11193zQ0(MQ0.d, 999999999);

    @InterfaceC8303na2({"SMAP\nInstant.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Instant.kt\nkotlin/time/Instant$Companion\n+ 2 Instant.kt\nkotlin/time/InstantKt\n*L\n1#1,799:1\n721#2,6:800\n*S KotlinDebug\n*F\n+ 1 Instant.kt\nkotlin/time/Instant$Companion\n*L\n308#1:800,6\n*E\n"})
    /* renamed from: o.zQ0$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public static /* synthetic */ C11193zQ0 d(a aVar, long j, long j2, int i, Object obj) {
            if ((i & 2) != 0) {
                j2 = 0;
            }
            return aVar.c(j, j2);
        }

        @NotNull
        public final C11193zQ0 a(long j) {
            long j2 = j / 1000;
            if ((j ^ 1000) < 0 && j2 * 1000 != j) {
                j2--;
            }
            long j3 = j % 1000;
            int i = (int) ((j3 + (1000 & (((j3 ^ 1000) & ((-j3) | j3)) >> 63))) * 1000000);
            if (j2 < MQ0.c) {
                return h();
            }
            if (j2 > MQ0.d) {
                return g();
            }
            return b(j2, i);
        }

        @NotNull
        public final C11193zQ0 b(long j, int i) {
            return c(j, i);
        }

        @NotNull
        public final C11193zQ0 c(long j, long j2) {
            long j3 = j2 / C10323vs.k;
            if ((j2 ^ C10323vs.k) < 0 && j3 * C10323vs.k != j2) {
                j3--;
            }
            long j4 = j + j3;
            if ((j ^ j4) < 0 && (j3 ^ j) >= 0) {
                if (j > 0) {
                    return C11193zQ0.Z.g();
                }
                return C11193zQ0.Z.h();
            } else if (j4 < MQ0.c) {
                return h();
            } else {
                if (j4 > MQ0.d) {
                    return g();
                }
                long j5 = j2 % C10323vs.k;
                return new C11193zQ0(j4, (int) (j5 + ((((j5 ^ C10323vs.k) & ((-j5) | j5)) >> 63) & C10323vs.k)));
            }
        }

        @NotNull
        public final C11193zQ0 e() {
            return b(MQ0.b, 0);
        }

        @NotNull
        public final C11193zQ0 f() {
            return b(MQ0.a, 999999999);
        }

        @NotNull
        public final C11193zQ0 g() {
            return C11193zQ0.Z0;
        }

        @NotNull
        public final C11193zQ0 h() {
            return C11193zQ0.Y0;
        }

        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Use Clock.System.now() instead", replaceWith = @IR1(expression = "Clock.System.now()", imports = {"kotlin.time.Clock"}))
        @NotNull
        public final C11193zQ0 i() {
            throw new C9592sr1(null, 1, null);
        }

        @NotNull
        public final C11193zQ0 j(@NotNull CharSequence charSequence) {
            C11193zQ0 q;
            C6562gT0.p(charSequence, "input");
            q = MQ0.q(charSequence);
            return q;
        }

        public a() {
        }
    }

    public C11193zQ0(long j, int i) {
        this.X = j;
        this.Y = i;
        if (MQ0.c <= j && j < 31556889864403200L) {
            return;
        }
        throw new IllegalArgumentException("Instant exceeds minimum or maximum instant");
    }

    private final Object writeReplace() {
        return FQ0.b(this);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof C11193zQ0) {
                C11193zQ0 c11193zQ0 = (C11193zQ0) obj;
                if (this.X != c11193zQ0.X || this.Y != c11193zQ0.Y) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: h */
    public int compareTo(@NotNull C11193zQ0 c11193zQ0) {
        C6562gT0.p(c11193zQ0, "other");
        int u = C6562gT0.u(this.X, c11193zQ0.X);
        if (u != 0) {
            return u;
        }
        return C6562gT0.t(this.Y, c11193zQ0.Y);
    }

    public int hashCode() {
        return Long.hashCode(this.X) + (this.Y * 51);
    }

    public final long i() {
        return this.X;
    }

    public final int j() {
        return this.Y;
    }

    @NotNull
    public final C11193zQ0 l(long j) {
        return n(Y70.l0(j));
    }

    public final long m(@NotNull C11193zQ0 c11193zQ0) {
        C6562gT0.p(c11193zQ0, "other");
        Y70.a aVar = Y70.Y;
        return Y70.V(C6223f80.x(this.X - c11193zQ0.X, EnumC6964i80.Z0), C6223f80.w(this.Y - c11193zQ0.Y, EnumC6964i80.Y));
    }

    @NotNull
    public final C11193zQ0 n(long j) {
        long D = Y70.D(j);
        int H = Y70.H(j);
        if (D == 0 && H == 0) {
            return this;
        }
        long j2 = this.X;
        long j3 = j2 + D;
        if ((j2 ^ j3) < 0 && (D ^ j2) >= 0) {
            if (Y70.T(j)) {
                return Z0;
            }
            return Y0;
        }
        return Z.b(j3, this.Y + H);
    }

    public final long o() {
        long j = this.X;
        long j2 = 1000;
        if (j >= 0) {
            if (j != 1) {
                if (j != 0) {
                    long j3 = j * 1000;
                    if (j3 / 1000 != j) {
                        return Long.MAX_VALUE;
                    }
                    j2 = j3;
                } else {
                    j2 = 0;
                }
            }
            long j4 = this.Y / 1000000;
            long j5 = j2 + j4;
            if ((j2 ^ j5) < 0 && (j4 ^ j2) >= 0) {
                return Long.MAX_VALUE;
            }
            return j5;
        }
        long j6 = j + 1;
        if (j6 != 1) {
            if (j6 != 0) {
                long j7 = j6 * 1000;
                if (j7 / 1000 != j6) {
                    return Long.MIN_VALUE;
                }
                j2 = j7;
            } else {
                j2 = 0;
            }
        }
        long j8 = (this.Y / 1000000) - 1000;
        long j9 = j2 + j8;
        if ((j2 ^ j9) < 0 && (j8 ^ j2) >= 0) {
            return Long.MIN_VALUE;
        }
        return j9;
    }

    @NotNull
    public String toString() {
        String i;
        i = MQ0.i(this);
        return i;
    }
}
