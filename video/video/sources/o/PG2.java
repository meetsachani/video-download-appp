package o;

import android.os.Bundle;
import o.InterfaceC8368nr;

@Deprecated
/* loaded from: classes2.dex */
public final class PG2 implements InterfaceC8368nr {
    public static final int Z0 = 0;
    public static final int a1 = 0;
    public static final int b1 = 0;
    public static final float c1 = 1.0f;
    public static final PG2 d1 = new PG2(0, 0);
    public static final String e1 = TD2.R0(0);
    public static final String f1 = TD2.R0(1);
    public static final String g1 = TD2.R0(2);
    public static final String h1 = TD2.R0(3);
    public static final InterfaceC8368nr.a<PG2> i1 = new InterfaceC8368nr.a() { // from class: o.OG2
        @Override // o.InterfaceC8368nr.a
        public final InterfaceC8368nr a(Bundle bundle) {
            return PG2.a(bundle);
        }
    };
    @BR0(from = 0)
    public final int X;
    @BR0(from = 0)
    public final int Y;
    @InterfaceC2501Av0(from = 0.0d, fromInclusive = false)
    public final float Y0;
    @BR0(from = 0, to = 359)
    public final int Z;

    public PG2(@BR0(from = 0) int i, @BR0(from = 0) int i2) {
        this(i, i2, 0, 1.0f);
    }

    public static /* synthetic */ PG2 a(Bundle bundle) {
        return new PG2(bundle.getInt(e1, 0), bundle.getInt(f1, 0), bundle.getInt(g1, 0), bundle.getFloat(h1, 1.0f));
    }

    @Override // o.InterfaceC8368nr
    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putInt(e1, this.X);
        bundle.putInt(f1, this.Y);
        bundle.putInt(g1, this.Z);
        bundle.putFloat(h1, this.Y0);
        return bundle;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PG2) {
            PG2 pg2 = (PG2) obj;
            if (this.X == pg2.X && this.Y == pg2.Y && this.Z == pg2.Z && this.Y0 == pg2.Y0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((217 + this.X) * 31) + this.Y) * 31) + this.Z) * 31) + Float.floatToRawIntBits(this.Y0);
    }

    public PG2(@BR0(from = 0) int i, @BR0(from = 0) int i2, @BR0(from = 0, to = 359) int i3, @InterfaceC2501Av0(from = 0.0d, fromInclusive = false) float f) {
        this.X = i;
        this.Y = i2;
        this.Z = i3;
        this.Y0 = f;
    }
}
