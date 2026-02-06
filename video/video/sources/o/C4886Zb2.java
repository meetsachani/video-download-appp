package o;

import android.os.Bundle;
import o.InterfaceC8368nr;

@Deprecated
/* renamed from: o.Zb2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4886Zb2 extends AbstractC5803dO1 {
    public static final int f1 = 2;
    public static final int g1 = 5;
    public static final String h1 = TD2.R0(1);
    public static final String i1 = TD2.R0(2);
    public static final InterfaceC8368nr.a<C4886Zb2> j1 = new InterfaceC8368nr.a() { // from class: o.Yb2
        @Override // o.InterfaceC8368nr.a
        public final InterfaceC8368nr a(Bundle bundle) {
            C4886Zb2 f;
            f = C4886Zb2.f(bundle);
            return f;
        }
    };
    @BR0(from = 1)
    public final int d1;
    public final float e1;

    public C4886Zb2(@BR0(from = 1) int i) {
        C9542sf.b(i > 0, "maxStars must be a positive integer");
        this.d1 = i;
        this.e1 = -1.0f;
    }

    public static C4886Zb2 f(Bundle bundle) {
        boolean z;
        if (bundle.getInt(AbstractC5803dO1.b1, -1) == 2) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        int i = bundle.getInt(h1, 5);
        float f = bundle.getFloat(i1, -1.0f);
        if (f == -1.0f) {
            return new C4886Zb2(i);
        }
        return new C4886Zb2(i, f);
    }

    @Override // o.AbstractC5803dO1
    public boolean c() {
        if (this.e1 != -1.0f) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC8368nr
    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC5803dO1.b1, 2);
        bundle.putInt(h1, this.d1);
        bundle.putFloat(i1, this.e1);
        return bundle;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (!(obj instanceof C4886Zb2)) {
            return false;
        }
        C4886Zb2 c4886Zb2 = (C4886Zb2) obj;
        if (this.d1 != c4886Zb2.d1 || this.e1 != c4886Zb2.e1) {
            return false;
        }
        return true;
    }

    @BR0(from = 1)
    public int g() {
        return this.d1;
    }

    public float h() {
        return this.e1;
    }

    public int hashCode() {
        return C2593Bt1.b(Integer.valueOf(this.d1), Float.valueOf(this.e1));
    }

    public C4886Zb2(@BR0(from = 1) int i, @InterfaceC2501Av0(from = 0.0d) float f) {
        boolean z = false;
        C9542sf.b(i > 0, "maxStars must be a positive integer");
        if (f >= 0.0f && f <= i) {
            z = true;
        }
        C9542sf.b(z, "starRating is out of range [0, maxStars]");
        this.d1 = i;
        this.e1 = f;
    }
}
