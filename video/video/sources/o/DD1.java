package o;

import android.os.Bundle;
import o.InterfaceC8368nr;

@Deprecated
/* loaded from: classes2.dex */
public final class DD1 implements InterfaceC8368nr {
    public static final DD1 Y0 = new DD1(1.0f);
    public static final String Z0 = TD2.R0(0);
    public static final String a1 = TD2.R0(1);
    public static final InterfaceC8368nr.a<DD1> b1 = new InterfaceC8368nr.a() { // from class: o.CD1
        @Override // o.InterfaceC8368nr.a
        public final InterfaceC8368nr a(Bundle bundle) {
            return DD1.a(bundle);
        }
    };
    public final float X;
    public final float Y;
    public final int Z;

    public DD1(@InterfaceC2501Av0(from = 0.0d, fromInclusive = false) float f) {
        this(f, 1.0f);
    }

    public static /* synthetic */ DD1 a(Bundle bundle) {
        return new DD1(bundle.getFloat(Z0, 1.0f), bundle.getFloat(a1, 1.0f));
    }

    public long b(long j) {
        return j * this.Z;
    }

    @OB
    public DD1 c(@InterfaceC2501Av0(from = 0.0d, fromInclusive = false) float f) {
        return new DD1(f, this.Y);
    }

    @Override // o.InterfaceC8368nr
    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putFloat(Z0, this.X);
        bundle.putFloat(a1, this.Y);
        return bundle;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DD1.class == obj.getClass()) {
            DD1 dd1 = (DD1) obj;
            if (this.X == dd1.X && this.Y == dd1.Y) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.X)) * 31) + Float.floatToRawIntBits(this.Y);
    }

    public String toString() {
        return TD2.M("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.X), Float.valueOf(this.Y));
    }

    public DD1(@InterfaceC2501Av0(from = 0.0d, fromInclusive = false) float f, @InterfaceC2501Av0(from = 0.0d, fromInclusive = false) float f2) {
        C9542sf.a(f > 0.0f);
        C9542sf.a(f2 > 0.0f);
        this.X = f;
        this.Y = f2;
        this.Z = Math.round(f * 1000.0f);
    }
}
