package o;

import java.util.Arrays;

@InterfaceC10420wF0(emulated = true, serializable = true)
@InterfaceC6329fa0
/* renamed from: o.et1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6163et1<K> extends C5920dt1<K> {
    public static final int r = -2;
    @InterfaceC5299bJ2

    /* renamed from: o  reason: collision with root package name */
    public transient long[] f732o;
    public transient int p;
    public transient int q;

    public C6163et1() {
        this(3);
    }

    public static <K> C6163et1<K> F() {
        return new C6163et1<>();
    }

    public static <K> C6163et1<K> G(int i) {
        return new C6163et1<>(i);
    }

    public final int H(int i) {
        return (int) (this.f732o[i] >>> 32);
    }

    public final int I(int i) {
        return (int) this.f732o[i];
    }

    public final void J(int i, int i2) {
        long[] jArr = this.f732o;
        jArr[i] = (jArr[i] & 4294967295L) | (i2 << 32);
    }

    public final void K(int i, int i2) {
        if (i == -2) {
            this.p = i2;
        } else {
            L(i, i2);
        }
        if (i2 == -2) {
            this.q = i;
        } else {
            J(i2, i);
        }
    }

    public final void L(int i, int i2) {
        long[] jArr = this.f732o;
        jArr[i] = (jArr[i] & C5920dt1.l) | (i2 & 4294967295L);
    }

    @Override // o.C5920dt1
    public void a() {
        super.a();
        this.p = -2;
        this.q = -2;
    }

    @Override // o.C5920dt1
    public int f() {
        int i = this.p;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    @Override // o.C5920dt1
    public void o(int i, float f) {
        super.o(i, f);
        this.p = -2;
        this.q = -2;
        long[] jArr = new long[i];
        this.f732o = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // o.C5920dt1
    public void p(int i, @InterfaceC7894ly1 K k, int i2, int i3) {
        super.p(i, k, i2, i3);
        K(this.q, i);
        K(i, -2);
    }

    @Override // o.C5920dt1
    public void q(int i) {
        int D = D() - 1;
        K(H(i), I(i));
        if (i < D) {
            K(H(D), i);
            K(i, I(D));
        }
        super.q(i);
    }

    @Override // o.C5920dt1
    public int t(int i) {
        int I = I(i);
        if (I == -2) {
            return -1;
        }
        return I;
    }

    @Override // o.C5920dt1
    public int u(int i, int i2) {
        if (i == D()) {
            return i2;
        }
        return i;
    }

    @Override // o.C5920dt1
    public void z(int i) {
        super.z(i);
        long[] jArr = this.f732o;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        this.f732o = copyOf;
        Arrays.fill(copyOf, length, i, -1L);
    }

    public C6163et1(int i) {
        this(i, 1.0f);
    }

    public C6163et1(int i, float f) {
        super(i, f);
    }

    public C6163et1(C5920dt1<K> c5920dt1) {
        o(c5920dt1.D(), 1.0f);
        int f = c5920dt1.f();
        while (f != -1) {
            v(c5920dt1.j(f), c5920dt1.l(f));
            f = c5920dt1.t(f);
        }
    }
}
