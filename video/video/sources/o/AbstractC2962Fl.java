package o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Map;
import o.AbstractC2962Fl;

/* renamed from: o.Fl  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2962Fl<T extends AbstractC2962Fl<T>> implements Cloneable {
    public static final int A1 = 32;
    public static final int B1 = 64;
    public static final int C1 = 128;
    public static final int D1 = 256;
    public static final int E1 = 512;
    public static final int F1 = 1024;
    public static final int G1 = 2048;
    public static final int H1 = 4096;
    public static final int I1 = 8192;
    public static final int J1 = 16384;
    public static final int K1 = 32768;
    public static final int L1 = 65536;
    public static final int M1 = 131072;
    public static final int N1 = 262144;
    public static final int O1 = 524288;
    public static final int P1 = 1048576;
    public static final int v1 = -1;
    public static final int w1 = 2;
    public static final int x1 = 4;
    public static final int y1 = 8;
    public static final int z1 = 16;
    public int X;
    public Drawable Z0;
    public int a1;
    public Drawable b1;
    public int c1;
    public boolean h1;
    public Drawable j1;
    public int k1;
    public boolean o1;
    public Resources.Theme p1;
    public boolean q1;
    public boolean r1;
    public boolean s1;
    public boolean u1;
    public float Y = 1.0f;
    public AbstractC4994a40 Z = AbstractC4994a40.e;
    public EnumC10672xH1 Y0 = EnumC10672xH1.NORMAL;
    public boolean d1 = true;
    public int e1 = -1;
    public int f1 = -1;
    public InterfaceC6575gX0 g1 = C8549ob0.c();
    public boolean i1 = true;
    public C5448bw1 l1 = new C5448bw1();
    public Map<Class<?>, InterfaceC5675cs2<?>> m1 = new C9598st();
    public Class<?> n1 = Object.class;
    public boolean t1 = true;

    public static boolean i0(int i, int i2) {
        if ((i & i2) != 0) {
            return true;
        }
        return false;
    }

    public T A(int i) {
        if (this.q1) {
            return (T) clone().A(i);
        }
        this.k1 = i;
        this.j1 = null;
        this.X = (this.X | 16384) & (-8193);
        return L0();
    }

    public T A0(int i) {
        if (this.q1) {
            return (T) clone().A0(i);
        }
        this.c1 = i;
        this.b1 = null;
        this.X = (this.X | 128) & (-65);
        return L0();
    }

    public T B(Drawable drawable) {
        if (this.q1) {
            return (T) clone().B(drawable);
        }
        this.j1 = drawable;
        this.k1 = 0;
        this.X = (this.X | 8192) & (-16385);
        return L0();
    }

    public T C() {
        return I0(AbstractC8674p60.c, new C7877lu0());
    }

    public T C0(Drawable drawable) {
        if (this.q1) {
            return (T) clone().C0(drawable);
        }
        this.b1 = drawable;
        this.c1 = 0;
        this.X = (this.X | 64) & (-129);
        return L0();
    }

    public T D(VV vv) {
        C10175vF1.e(vv);
        return (T) M0(C10138v60.g, vv).M0(C9923uD0.a, vv);
    }

    public T D0(EnumC10672xH1 enumC10672xH1) {
        if (this.q1) {
            return (T) clone().D0(enumC10672xH1);
        }
        this.Y0 = (EnumC10672xH1) C10175vF1.e(enumC10672xH1);
        this.X |= 8;
        return L0();
    }

    public T E(long j) {
        return M0(C11151zF2.g, Long.valueOf(j));
    }

    public final AbstractC4994a40 F() {
        return this.Z;
    }

    public T F0(C4274Sv1<?> c4274Sv1) {
        if (this.q1) {
            return (T) clone().F0(c4274Sv1);
        }
        this.l1.e(c4274Sv1);
        return L0();
    }

    public final int G() {
        return this.a1;
    }

    public final Drawable H() {
        return this.Z0;
    }

    public final Drawable I() {
        return this.j1;
    }

    public final T I0(AbstractC8674p60 abstractC8674p60, InterfaceC5675cs2<Bitmap> interfaceC5675cs2) {
        return J0(abstractC8674p60, interfaceC5675cs2, true);
    }

    public final int J() {
        return this.k1;
    }

    public final T J0(AbstractC8674p60 abstractC8674p60, InterfaceC5675cs2<Bitmap> interfaceC5675cs2, boolean z) {
        T w0;
        if (z) {
            w0 = V0(abstractC8674p60, interfaceC5675cs2);
        } else {
            w0 = w0(abstractC8674p60, interfaceC5675cs2);
        }
        w0.t1 = true;
        return w0;
    }

    public final boolean K() {
        return this.s1;
    }

    public final C5448bw1 L() {
        return this.l1;
    }

    public final T L0() {
        if (!this.o1) {
            return K0();
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    public final int M() {
        return this.e1;
    }

    public <Y> T M0(C4274Sv1<Y> c4274Sv1, Y y) {
        if (this.q1) {
            return (T) clone().M0(c4274Sv1, y);
        }
        C10175vF1.e(c4274Sv1);
        C10175vF1.e(y);
        this.l1.f(c4274Sv1, y);
        return L0();
    }

    public final int N() {
        return this.f1;
    }

    public T N0(InterfaceC6575gX0 interfaceC6575gX0) {
        if (this.q1) {
            return (T) clone().N0(interfaceC6575gX0);
        }
        this.g1 = (InterfaceC6575gX0) C10175vF1.e(interfaceC6575gX0);
        this.X |= 1024;
        return L0();
    }

    public final Drawable O() {
        return this.b1;
    }

    public T O0(float f) {
        if (this.q1) {
            return (T) clone().O0(f);
        }
        if (f >= 0.0f && f <= 1.0f) {
            this.Y = f;
            this.X |= 2;
            return L0();
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    public final int P() {
        return this.c1;
    }

    public T P0(boolean z) {
        if (this.q1) {
            return (T) clone().P0(true);
        }
        this.d1 = !z;
        this.X |= 256;
        return L0();
    }

    public final EnumC10672xH1 Q() {
        return this.Y0;
    }

    public T Q0(Resources.Theme theme) {
        if (this.q1) {
            return (T) clone().Q0(theme);
        }
        this.p1 = theme;
        if (theme != null) {
            this.X |= 32768;
            return M0(C7776lT1.b, theme);
        }
        this.X &= -32769;
        return F0(C7776lT1.b);
    }

    public final Class<?> R() {
        return this.n1;
    }

    public T R0(int i) {
        return M0(C10918yI0.b, Integer.valueOf(i));
    }

    public final InterfaceC6575gX0 S() {
        return this.g1;
    }

    public <Y> T S0(Class<Y> cls, InterfaceC5675cs2<Y> interfaceC5675cs2) {
        return T0(cls, interfaceC5675cs2, true);
    }

    public final float T() {
        return this.Y;
    }

    public <Y> T T0(Class<Y> cls, InterfaceC5675cs2<Y> interfaceC5675cs2, boolean z) {
        if (this.q1) {
            return (T) clone().T0(cls, interfaceC5675cs2, z);
        }
        C10175vF1.e(cls);
        C10175vF1.e(interfaceC5675cs2);
        this.m1.put(cls, interfaceC5675cs2);
        int i = this.X;
        this.i1 = true;
        this.X = 67584 | i;
        this.t1 = false;
        if (z) {
            this.X = i | 198656;
            this.h1 = true;
        }
        return L0();
    }

    public final Resources.Theme U() {
        return this.p1;
    }

    public final Map<Class<?>, InterfaceC5675cs2<?>> V() {
        return this.m1;
    }

    public final T V0(AbstractC8674p60 abstractC8674p60, InterfaceC5675cs2<Bitmap> interfaceC5675cs2) {
        if (this.q1) {
            return (T) clone().V0(abstractC8674p60, interfaceC5675cs2);
        }
        v(abstractC8674p60);
        return W0(interfaceC5675cs2);
    }

    public final boolean W() {
        return this.u1;
    }

    public T W0(InterfaceC5675cs2<Bitmap> interfaceC5675cs2) {
        return X0(interfaceC5675cs2, true);
    }

    public final boolean X() {
        return this.r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T X0(InterfaceC5675cs2<Bitmap> interfaceC5675cs2, boolean z) {
        if (this.q1) {
            return (T) clone().X0(interfaceC5675cs2, z);
        }
        O60 o60 = new O60(interfaceC5675cs2, z);
        T0(Bitmap.class, interfaceC5675cs2, z);
        T0(Drawable.class, o60, z);
        T0(BitmapDrawable.class, o60.c(), z);
        T0(C7468kD0.class, new C8458oD0(interfaceC5675cs2), z);
        return L0();
    }

    public final boolean Y() {
        return this.q1;
    }

    public T Y0(InterfaceC5675cs2<Bitmap>... interfaceC5675cs2Arr) {
        if (interfaceC5675cs2Arr.length > 1) {
            return X0(new C6633gm1(interfaceC5675cs2Arr), true);
        }
        if (interfaceC5675cs2Arr.length == 1) {
            return W0(interfaceC5675cs2Arr[0]);
        }
        return L0();
    }

    public final boolean Z() {
        return h0(4);
    }

    @Deprecated
    public T a1(InterfaceC5675cs2<Bitmap>... interfaceC5675cs2Arr) {
        return X0(new C6633gm1(interfaceC5675cs2Arr), true);
    }

    public final boolean b0(AbstractC2962Fl<?> abstractC2962Fl) {
        if (Float.compare(abstractC2962Fl.Y, this.Y) == 0 && this.a1 == abstractC2962Fl.a1 && SD2.e(this.Z0, abstractC2962Fl.Z0) && this.c1 == abstractC2962Fl.c1 && SD2.e(this.b1, abstractC2962Fl.b1) && this.k1 == abstractC2962Fl.k1 && SD2.e(this.j1, abstractC2962Fl.j1) && this.d1 == abstractC2962Fl.d1 && this.e1 == abstractC2962Fl.e1 && this.f1 == abstractC2962Fl.f1 && this.h1 == abstractC2962Fl.h1 && this.i1 == abstractC2962Fl.i1 && this.r1 == abstractC2962Fl.r1 && this.s1 == abstractC2962Fl.s1 && this.Z.equals(abstractC2962Fl.Z) && this.Y0 == abstractC2962Fl.Y0 && this.l1.equals(abstractC2962Fl.l1) && this.m1.equals(abstractC2962Fl.m1) && this.n1.equals(abstractC2962Fl.n1) && SD2.e(this.g1, abstractC2962Fl.g1) && SD2.e(this.p1, abstractC2962Fl.p1)) {
            return true;
        }
        return false;
    }

    public T b1(boolean z) {
        if (this.q1) {
            return (T) clone().b1(z);
        }
        this.u1 = z;
        this.X |= 1048576;
        return L0();
    }

    public final boolean c0() {
        return this.o1;
    }

    public T c1(boolean z) {
        if (this.q1) {
            return (T) clone().c1(z);
        }
        this.r1 = z;
        this.X |= 262144;
        return L0();
    }

    public final boolean d0() {
        return this.d1;
    }

    public T e(AbstractC2962Fl<?> abstractC2962Fl) {
        if (this.q1) {
            return (T) clone().e(abstractC2962Fl);
        }
        if (i0(abstractC2962Fl.X, 2)) {
            this.Y = abstractC2962Fl.Y;
        }
        if (i0(abstractC2962Fl.X, 262144)) {
            this.r1 = abstractC2962Fl.r1;
        }
        if (i0(abstractC2962Fl.X, 1048576)) {
            this.u1 = abstractC2962Fl.u1;
        }
        if (i0(abstractC2962Fl.X, 4)) {
            this.Z = abstractC2962Fl.Z;
        }
        if (i0(abstractC2962Fl.X, 8)) {
            this.Y0 = abstractC2962Fl.Y0;
        }
        if (i0(abstractC2962Fl.X, 16)) {
            this.Z0 = abstractC2962Fl.Z0;
            this.a1 = 0;
            this.X &= -33;
        }
        if (i0(abstractC2962Fl.X, 32)) {
            this.a1 = abstractC2962Fl.a1;
            this.Z0 = null;
            this.X &= -17;
        }
        if (i0(abstractC2962Fl.X, 64)) {
            this.b1 = abstractC2962Fl.b1;
            this.c1 = 0;
            this.X &= -129;
        }
        if (i0(abstractC2962Fl.X, 128)) {
            this.c1 = abstractC2962Fl.c1;
            this.b1 = null;
            this.X &= -65;
        }
        if (i0(abstractC2962Fl.X, 256)) {
            this.d1 = abstractC2962Fl.d1;
        }
        if (i0(abstractC2962Fl.X, 512)) {
            this.f1 = abstractC2962Fl.f1;
            this.e1 = abstractC2962Fl.e1;
        }
        if (i0(abstractC2962Fl.X, 1024)) {
            this.g1 = abstractC2962Fl.g1;
        }
        if (i0(abstractC2962Fl.X, 4096)) {
            this.n1 = abstractC2962Fl.n1;
        }
        if (i0(abstractC2962Fl.X, 8192)) {
            this.j1 = abstractC2962Fl.j1;
            this.k1 = 0;
            this.X &= -16385;
        }
        if (i0(abstractC2962Fl.X, 16384)) {
            this.k1 = abstractC2962Fl.k1;
            this.j1 = null;
            this.X &= -8193;
        }
        if (i0(abstractC2962Fl.X, 32768)) {
            this.p1 = abstractC2962Fl.p1;
        }
        if (i0(abstractC2962Fl.X, 65536)) {
            this.i1 = abstractC2962Fl.i1;
        }
        if (i0(abstractC2962Fl.X, 131072)) {
            this.h1 = abstractC2962Fl.h1;
        }
        if (i0(abstractC2962Fl.X, 2048)) {
            this.m1.putAll(abstractC2962Fl.m1);
            this.t1 = abstractC2962Fl.t1;
        }
        if (i0(abstractC2962Fl.X, 524288)) {
            this.s1 = abstractC2962Fl.s1;
        }
        if (!this.i1) {
            this.m1.clear();
            int i = this.X;
            this.h1 = false;
            this.X = i & (-133121);
            this.t1 = true;
        }
        this.X |= abstractC2962Fl.X;
        this.l1.d(abstractC2962Fl.l1);
        return L0();
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC2962Fl) {
            return b0((AbstractC2962Fl) obj);
        }
        return false;
    }

    public final boolean f0() {
        return h0(8);
    }

    public boolean g0() {
        return this.t1;
    }

    public T h() {
        if (this.o1 && !this.q1) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.q1 = true;
        return o0();
    }

    public final boolean h0(int i) {
        return i0(this.X, i);
    }

    public int hashCode() {
        return SD2.r(this.p1, SD2.r(this.g1, SD2.r(this.n1, SD2.r(this.m1, SD2.r(this.l1, SD2.r(this.Y0, SD2.r(this.Z, SD2.t(this.s1, SD2.t(this.r1, SD2.t(this.i1, SD2.t(this.h1, SD2.q(this.f1, SD2.q(this.e1, SD2.t(this.d1, SD2.r(this.j1, SD2.q(this.k1, SD2.r(this.b1, SD2.q(this.c1, SD2.r(this.Z0, SD2.q(this.a1, SD2.n(this.Y)))))))))))))))))))));
    }

    public T i() {
        return V0(AbstractC8674p60.e, new C3990Pz());
    }

    public T j() {
        return I0(AbstractC8674p60.d, new C4087Qz());
    }

    public final boolean j0() {
        return h0(256);
    }

    public T k() {
        return V0(AbstractC8674p60.d, new C9189rC());
    }

    public final boolean k0() {
        return this.i1;
    }

    public final boolean l0() {
        return this.h1;
    }

    @Override // 
    /* renamed from: m */
    public T clone() {
        try {
            T t = (T) super.clone();
            C5448bw1 c5448bw1 = new C5448bw1();
            t.l1 = c5448bw1;
            c5448bw1.d(this.l1);
            C9598st c9598st = new C9598st();
            t.m1 = c9598st;
            c9598st.putAll(this.m1);
            t.o1 = false;
            t.q1 = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean m0() {
        return h0(2048);
    }

    public final boolean n0() {
        return SD2.x(this.f1, this.e1);
    }

    public T o(Class<?> cls) {
        if (this.q1) {
            return (T) clone().o(cls);
        }
        this.n1 = (Class) C10175vF1.e(cls);
        this.X |= 4096;
        return L0();
    }

    public T o0() {
        this.o1 = true;
        return K0();
    }

    public T p0(boolean z) {
        if (this.q1) {
            return (T) clone().p0(z);
        }
        this.s1 = z;
        this.X |= 524288;
        return L0();
    }

    public T q() {
        return M0(C10138v60.k, Boolean.FALSE);
    }

    public T q0() {
        return w0(AbstractC8674p60.e, new C3990Pz());
    }

    public T r0() {
        return u0(AbstractC8674p60.d, new C4087Qz());
    }

    public T s(AbstractC4994a40 abstractC4994a40) {
        if (this.q1) {
            return (T) clone().s(abstractC4994a40);
        }
        this.Z = (AbstractC4994a40) C10175vF1.e(abstractC4994a40);
        this.X |= 4;
        return L0();
    }

    public T s0() {
        return w0(AbstractC8674p60.e, new C9189rC());
    }

    public T t() {
        return M0(C9923uD0.b, Boolean.TRUE);
    }

    public T t0() {
        return u0(AbstractC8674p60.c, new C7877lu0());
    }

    public T u() {
        if (this.q1) {
            return (T) clone().u();
        }
        this.m1.clear();
        int i = this.X;
        this.h1 = false;
        this.i1 = false;
        this.X = (i & (-133121)) | 65536;
        this.t1 = true;
        return L0();
    }

    public final T u0(AbstractC8674p60 abstractC8674p60, InterfaceC5675cs2<Bitmap> interfaceC5675cs2) {
        return J0(abstractC8674p60, interfaceC5675cs2, false);
    }

    public T v(AbstractC8674p60 abstractC8674p60) {
        return M0(AbstractC8674p60.h, (AbstractC8674p60) C10175vF1.e(abstractC8674p60));
    }

    public <Y> T v0(Class<Y> cls, InterfaceC5675cs2<Y> interfaceC5675cs2) {
        return T0(cls, interfaceC5675cs2, false);
    }

    public T w(Bitmap.CompressFormat compressFormat) {
        return M0(C4045Qn.c, (Bitmap.CompressFormat) C10175vF1.e(compressFormat));
    }

    public final T w0(AbstractC8674p60 abstractC8674p60, InterfaceC5675cs2<Bitmap> interfaceC5675cs2) {
        if (this.q1) {
            return (T) clone().w0(abstractC8674p60, interfaceC5675cs2);
        }
        v(abstractC8674p60);
        return X0(interfaceC5675cs2, false);
    }

    public T x(int i) {
        return M0(C4045Qn.b, Integer.valueOf(i));
    }

    public T x0(InterfaceC5675cs2<Bitmap> interfaceC5675cs2) {
        return X0(interfaceC5675cs2, false);
    }

    public T y(int i) {
        if (this.q1) {
            return (T) clone().y(i);
        }
        this.a1 = i;
        this.Z0 = null;
        this.X = (this.X | 32) & (-17);
        return L0();
    }

    public T y0(int i) {
        return z0(i, i);
    }

    public T z(Drawable drawable) {
        if (this.q1) {
            return (T) clone().z(drawable);
        }
        this.Z0 = drawable;
        this.a1 = 0;
        this.X = (this.X | 16) & (-33);
        return L0();
    }

    public T z0(int i, int i2) {
        if (this.q1) {
            return (T) clone().z0(i, i2);
        }
        this.f1 = i;
        this.e1 = i2;
        this.X |= 512;
        return L0();
    }

    public final T K0() {
        return this;
    }
}
