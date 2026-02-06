package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* renamed from: o.oS1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8520oS1 extends AbstractC2962Fl<C8520oS1> {
    public static C8520oS1 Q1;
    public static C8520oS1 R1;
    public static C8520oS1 S1;
    public static C8520oS1 T1;
    public static C8520oS1 U1;
    public static C8520oS1 V1;
    public static C8520oS1 W1;
    public static C8520oS1 X1;

    public static C8520oS1 A1(InterfaceC6575gX0 interfaceC6575gX0) {
        return new C8520oS1().N0(interfaceC6575gX0);
    }

    public static C8520oS1 B1(float f) {
        return new C8520oS1().O0(f);
    }

    public static C8520oS1 C1(boolean z) {
        if (z) {
            if (Q1 == null) {
                Q1 = new C8520oS1().P0(true).h();
            }
            return Q1;
        }
        if (R1 == null) {
            R1 = new C8520oS1().P0(false).h();
        }
        return R1;
    }

    public static C8520oS1 D1(int i) {
        return new C8520oS1().R0(i);
    }

    public static C8520oS1 d1(InterfaceC5675cs2<Bitmap> interfaceC5675cs2) {
        return new C8520oS1().W0(interfaceC5675cs2);
    }

    public static C8520oS1 e1() {
        if (U1 == null) {
            U1 = new C8520oS1().i().h();
        }
        return U1;
    }

    public static C8520oS1 f1() {
        if (T1 == null) {
            T1 = new C8520oS1().j().h();
        }
        return T1;
    }

    public static C8520oS1 g1() {
        if (V1 == null) {
            V1 = new C8520oS1().k().h();
        }
        return V1;
    }

    public static C8520oS1 h1(Class<?> cls) {
        return new C8520oS1().o(cls);
    }

    public static C8520oS1 i1(AbstractC4994a40 abstractC4994a40) {
        return new C8520oS1().s(abstractC4994a40);
    }

    public static C8520oS1 j1(AbstractC8674p60 abstractC8674p60) {
        return new C8520oS1().v(abstractC8674p60);
    }

    public static C8520oS1 k1(Bitmap.CompressFormat compressFormat) {
        return new C8520oS1().w(compressFormat);
    }

    public static C8520oS1 l1(int i) {
        return new C8520oS1().x(i);
    }

    public static C8520oS1 m1(int i) {
        return new C8520oS1().y(i);
    }

    public static C8520oS1 n1(Drawable drawable) {
        return new C8520oS1().z(drawable);
    }

    public static C8520oS1 o1() {
        if (S1 == null) {
            S1 = new C8520oS1().C().h();
        }
        return S1;
    }

    public static C8520oS1 p1(VV vv) {
        return new C8520oS1().D(vv);
    }

    public static C8520oS1 q1(long j) {
        return new C8520oS1().E(j);
    }

    public static C8520oS1 r1() {
        if (X1 == null) {
            X1 = new C8520oS1().t().h();
        }
        return X1;
    }

    public static C8520oS1 s1() {
        if (W1 == null) {
            W1 = new C8520oS1().u().h();
        }
        return W1;
    }

    public static <T> C8520oS1 t1(C4274Sv1<T> c4274Sv1, T t) {
        return new C8520oS1().M0(c4274Sv1, t);
    }

    public static C8520oS1 u1(int i) {
        return v1(i, i);
    }

    public static C8520oS1 v1(int i, int i2) {
        return new C8520oS1().z0(i, i2);
    }

    public static C8520oS1 w1(int i) {
        return new C8520oS1().A0(i);
    }

    public static C8520oS1 y1(Drawable drawable) {
        return new C8520oS1().C0(drawable);
    }

    public static C8520oS1 z1(EnumC10672xH1 enumC10672xH1) {
        return new C8520oS1().D0(enumC10672xH1);
    }

    @Override // o.AbstractC2962Fl
    public boolean equals(Object obj) {
        if ((obj instanceof C8520oS1) && super.equals(obj)) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC2962Fl
    public int hashCode() {
        return super.hashCode();
    }
}
