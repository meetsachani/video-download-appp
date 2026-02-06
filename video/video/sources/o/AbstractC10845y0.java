package o;

import o.InterfaceC4734Xo2;
import o.ZG;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC5395bj0
@InterfaceC9150r20(message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
@InterfaceC6480g82(version = "1.3")
/* renamed from: o.y0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10845y0 implements InterfaceC4734Xo2.c {
    @NotNull
    public final EnumC6964i80 b;

    /* renamed from: o.y0$a */
    /* loaded from: classes3.dex */
    public static final class a implements ZG {
        public final double X;
        @NotNull
        public final AbstractC10845y0 Y;
        public final long Z;

        public /* synthetic */ a(double d, AbstractC10845y0 abstractC10845y0, long j, C9516sY c9516sY) {
            this(d, abstractC10845y0, j);
        }

        @Override // o.ZG
        public long E0(@NotNull ZG zg) {
            C6562gT0.p(zg, "other");
            if (zg instanceof a) {
                a aVar = (a) zg;
                if (C6562gT0.g(this.Y, aVar.Y)) {
                    if (Y70.t(this.Z, aVar.Z) && Y70.R(this.Z)) {
                        return Y70.Y.T();
                    }
                    long U = Y70.U(this.Z, aVar.Z);
                    long v = C6223f80.v(this.X - aVar.X, this.Y.b());
                    if (Y70.t(v, Y70.l0(U))) {
                        return Y70.Y.T();
                    }
                    return Y70.V(v, U);
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
            return Y70.U(C6223f80.v(this.Y.c() - this.X, this.Y.b()), this.Z);
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
            return Y70.N(Y70.V(C6223f80.v(this.X, this.Y.b()), this.Z));
        }

        @Override // o.InterfaceC3760No2
        @NotNull
        public ZG m0(long j) {
            return ZG.a.d(this, j);
        }

        @NotNull
        public String toString() {
            return "DoubleTimeMark(" + this.X + C7691l80.h(this.Y.b()) + " + " + ((Object) Y70.h0(this.Z)) + C6566gU0.h + this.Y + ')';
        }

        public a(double d, AbstractC10845y0 abstractC10845y0, long j) {
            C6562gT0.p(abstractC10845y0, "timeSource");
            this.X = d;
            this.Y = abstractC10845y0;
            this.Z = j;
        }

        @Override // o.InterfaceC3760No2
        @NotNull
        public ZG a0(long j) {
            return new a(this.X, this.Y, Y70.V(this.Z, j), null);
        }
    }

    public AbstractC10845y0(@NotNull EnumC6964i80 enumC6964i80) {
        C6562gT0.p(enumC6964i80, "unit");
        this.b = enumC6964i80;
    }

    @NotNull
    public final EnumC6964i80 b() {
        return this.b;
    }

    public abstract double c();

    @Override // o.InterfaceC4734Xo2
    @NotNull
    public ZG a() {
        return new a(c(), this, Y70.Y.T(), null);
    }
}
