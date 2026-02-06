package o;

import android.os.Bundle;
import o.InterfaceC8368nr;

@Deprecated
/* renamed from: o.yC1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10895yC1 extends AbstractC5803dO1 {
    public static final int e1 = 1;
    public static final String f1 = TD2.R0(1);
    public static final InterfaceC8368nr.a<C10895yC1> g1 = new InterfaceC8368nr.a() { // from class: o.xC1
        @Override // o.InterfaceC8368nr.a
        public final InterfaceC8368nr a(Bundle bundle) {
            C10895yC1 f;
            f = C10895yC1.f(bundle);
            return f;
        }
    };
    public final float d1;

    public C10895yC1() {
        this.d1 = -1.0f;
    }

    public static C10895yC1 f(Bundle bundle) {
        boolean z = true;
        if (bundle.getInt(AbstractC5803dO1.b1, -1) != 1) {
            z = false;
        }
        C9542sf.a(z);
        float f = bundle.getFloat(f1, -1.0f);
        if (f == -1.0f) {
            return new C10895yC1();
        }
        return new C10895yC1(f);
    }

    @Override // o.AbstractC5803dO1
    public boolean c() {
        if (this.d1 != -1.0f) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC8368nr
    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC5803dO1.b1, 1);
        bundle.putFloat(f1, this.d1);
        return bundle;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (!(obj instanceof C10895yC1) || this.d1 != ((C10895yC1) obj).d1) {
            return false;
        }
        return true;
    }

    public float g() {
        return this.d1;
    }

    public int hashCode() {
        return C2593Bt1.b(Float.valueOf(this.d1));
    }

    public C10895yC1(@InterfaceC2501Av0(from = 0.0d, to = 100.0d) float f) {
        C9542sf.b(f >= 0.0f && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.d1 = f;
    }
}
