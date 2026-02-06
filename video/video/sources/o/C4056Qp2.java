package o;

/* renamed from: o.Qp2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4056Qp2 implements InterfaceC4943Zq<String> {
    public static volatile AbstractC4253Sp2 Y0 = AbstractC4253Sp2.p1;
    public final StringBuffer X;
    public final Object Y;
    public final AbstractC4253Sp2 Z;

    public C4056Qp2(Object obj) {
        this(obj, null, null);
    }

    public static AbstractC4253Sp2 Y() {
        return Y0;
    }

    public static String c0(Object obj) {
        return C8755pQ1.y0(obj);
    }

    public static String d0(Object obj, AbstractC4253Sp2 abstractC4253Sp2) {
        return C8755pQ1.z0(obj, abstractC4253Sp2);
    }

    public static String e0(Object obj, AbstractC4253Sp2 abstractC4253Sp2, boolean z) {
        return C8755pQ1.C0(obj, abstractC4253Sp2, z, false, null);
    }

    public static <T> String f0(T t, AbstractC4253Sp2 abstractC4253Sp2, boolean z, Class<? super T> cls) {
        return C8755pQ1.C0(t, abstractC4253Sp2, z, false, cls);
    }

    public static void g0(AbstractC4253Sp2 abstractC4253Sp2) {
        Y0 = (AbstractC4253Sp2) C11147zE2.V(abstractC4253Sp2, "style", new Object[0]);
    }

    public C4056Qp2 A(String str, int[] iArr, boolean z) {
        this.Z.n(this.X, str, iArr, Boolean.valueOf(z));
        return this;
    }

    public C4056Qp2 B(String str, long[] jArr) {
        this.Z.o(this.X, str, jArr, null);
        return this;
    }

    public C4056Qp2 C(String str, long[] jArr, boolean z) {
        this.Z.o(this.X, str, jArr, Boolean.valueOf(z));
        return this;
    }

    public C4056Qp2 D(String str, Object[] objArr) {
        this.Z.p(this.X, str, objArr, null);
        return this;
    }

    public C4056Qp2 E(String str, Object[] objArr, boolean z) {
        this.Z.p(this.X, str, objArr, Boolean.valueOf(z));
        return this;
    }

    public C4056Qp2 F(String str, short[] sArr) {
        this.Z.q(this.X, str, sArr, null);
        return this;
    }

    public C4056Qp2 G(String str, short[] sArr, boolean z) {
        this.Z.q(this.X, str, sArr, Boolean.valueOf(z));
        return this;
    }

    public C4056Qp2 H(String str, boolean[] zArr) {
        this.Z.r(this.X, str, zArr, null);
        return this;
    }

    public C4056Qp2 I(String str, boolean[] zArr, boolean z) {
        this.Z.r(this.X, str, zArr, Boolean.valueOf(z));
        return this;
    }

    public C4056Qp2 J(short s) {
        this.Z.h(this.X, null, s);
        return this;
    }

    public C4056Qp2 K(boolean z) {
        this.Z.i(this.X, null, z);
        return this;
    }

    public C4056Qp2 L(byte[] bArr) {
        this.Z.j(this.X, null, bArr, null);
        return this;
    }

    public C4056Qp2 M(char[] cArr) {
        this.Z.k(this.X, null, cArr, null);
        return this;
    }

    public C4056Qp2 N(double[] dArr) {
        this.Z.l(this.X, null, dArr, null);
        return this;
    }

    public C4056Qp2 O(float[] fArr) {
        this.Z.m(this.X, null, fArr, null);
        return this;
    }

    public C4056Qp2 P(int[] iArr) {
        this.Z.n(this.X, null, iArr, null);
        return this;
    }

    public C4056Qp2 Q(long[] jArr) {
        this.Z.o(this.X, null, jArr, null);
        return this;
    }

    public C4056Qp2 R(Object[] objArr) {
        this.Z.p(this.X, null, objArr, null);
        return this;
    }

    public C4056Qp2 S(short[] sArr) {
        this.Z.q(this.X, null, sArr, null);
        return this;
    }

    public C4056Qp2 T(boolean[] zArr) {
        this.Z.r(this.X, null, zArr, null);
        return this;
    }

    public C4056Qp2 U(Object obj) {
        C11304zt1.C(a0(), obj);
        return this;
    }

    public C4056Qp2 V(String str) {
        if (str != null) {
            this.Z.k0(this.X, str);
        }
        return this;
    }

    public C4056Qp2 W(String str) {
        if (str != null) {
            this.Z.l0(this.X, str);
        }
        return this;
    }

    @Override // o.InterfaceC4943Zq
    /* renamed from: X */
    public String build() {
        return toString();
    }

    public Object Z() {
        return this.Y;
    }

    public C4056Qp2 a(byte b) {
        this.Z.a(this.X, null, b);
        return this;
    }

    public StringBuffer a0() {
        return this.X;
    }

    public C4056Qp2 b(char c) {
        this.Z.b(this.X, null, c);
        return this;
    }

    public AbstractC4253Sp2 b0() {
        return this.Z;
    }

    public C4056Qp2 c(double d) {
        this.Z.c(this.X, null, d);
        return this;
    }

    public C4056Qp2 d(float f) {
        this.Z.d(this.X, null, f);
        return this;
    }

    public C4056Qp2 e(int i) {
        this.Z.e(this.X, null, i);
        return this;
    }

    public C4056Qp2 f(long j) {
        this.Z.f(this.X, null, j);
        return this;
    }

    public C4056Qp2 g(Object obj) {
        this.Z.g(this.X, null, obj, null);
        return this;
    }

    public C4056Qp2 h(String str, byte b) {
        this.Z.a(this.X, str, b);
        return this;
    }

    public C4056Qp2 i(String str, char c) {
        this.Z.b(this.X, str, c);
        return this;
    }

    public C4056Qp2 j(String str, double d) {
        this.Z.c(this.X, str, d);
        return this;
    }

    public C4056Qp2 k(String str, float f) {
        this.Z.d(this.X, str, f);
        return this;
    }

    public C4056Qp2 l(String str, int i) {
        this.Z.e(this.X, str, i);
        return this;
    }

    public C4056Qp2 m(String str, long j) {
        this.Z.f(this.X, str, j);
        return this;
    }

    public C4056Qp2 n(String str, Object obj) {
        this.Z.g(this.X, str, obj, null);
        return this;
    }

    public C4056Qp2 o(String str, Object obj, boolean z) {
        this.Z.g(this.X, str, obj, Boolean.valueOf(z));
        return this;
    }

    public C4056Qp2 p(String str, short s) {
        this.Z.h(this.X, str, s);
        return this;
    }

    public C4056Qp2 q(String str, boolean z) {
        this.Z.i(this.X, str, z);
        return this;
    }

    public C4056Qp2 r(String str, byte[] bArr) {
        this.Z.j(this.X, str, bArr, null);
        return this;
    }

    public C4056Qp2 s(String str, byte[] bArr, boolean z) {
        this.Z.j(this.X, str, bArr, Boolean.valueOf(z));
        return this;
    }

    public C4056Qp2 t(String str, char[] cArr) {
        this.Z.k(this.X, str, cArr, null);
        return this;
    }

    public String toString() {
        if (Z() == null) {
            a0().append(b0().t0());
        } else {
            this.Z.R(a0(), Z());
        }
        return a0().toString();
    }

    public C4056Qp2 u(String str, char[] cArr, boolean z) {
        this.Z.k(this.X, str, cArr, Boolean.valueOf(z));
        return this;
    }

    public C4056Qp2 v(String str, double[] dArr) {
        this.Z.l(this.X, str, dArr, null);
        return this;
    }

    public C4056Qp2 w(String str, double[] dArr, boolean z) {
        this.Z.l(this.X, str, dArr, Boolean.valueOf(z));
        return this;
    }

    public C4056Qp2 x(String str, float[] fArr) {
        this.Z.m(this.X, str, fArr, null);
        return this;
    }

    public C4056Qp2 y(String str, float[] fArr, boolean z) {
        this.Z.m(this.X, str, fArr, Boolean.valueOf(z));
        return this;
    }

    public C4056Qp2 z(String str, int[] iArr) {
        this.Z.n(this.X, str, iArr, null);
        return this;
    }

    public C4056Qp2(Object obj, AbstractC4253Sp2 abstractC4253Sp2) {
        this(obj, abstractC4253Sp2, null);
    }

    public C4056Qp2(Object obj, AbstractC4253Sp2 abstractC4253Sp2, StringBuffer stringBuffer) {
        abstractC4253Sp2 = abstractC4253Sp2 == null ? Y() : abstractC4253Sp2;
        stringBuffer = stringBuffer == null ? new StringBuffer(512) : stringBuffer;
        this.X = stringBuffer;
        this.Z = abstractC4253Sp2;
        this.Y = obj;
        abstractC4253Sp2.Y(stringBuffer, obj);
    }
}
