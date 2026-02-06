package o;

import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import o.C10833xx0;
import o.KZ1;

@Deprecated
/* loaded from: classes2.dex */
public final class E8 implements InterfaceC4324Tj0 {
    public static final int A = 20;
    public static final int B = 16000;
    public static final int C = 8000;
    public static final int D = 20000;
    public static final int t = 1;
    public static final int u = 2;
    public static final int[] w;
    public static final int z;
    public final byte[] d;
    public final int e;
    public boolean f;
    public long g;
    public int h;
    public int i;
    public boolean j;
    public long k;
    public int l;
    public int m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public InterfaceC4518Vj0 f445o;
    public InterfaceC10568wr2 p;
    public KZ1 q;
    public boolean r;
    public static final InterfaceC4809Yj0 s = new InterfaceC4809Yj0() { // from class: o.D8
        @Override // o.InterfaceC4809Yj0
        public final InterfaceC4324Tj0[] b() {
            return E8.c();
        }
    };
    public static final int[] v = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final byte[] x = TD2.G0("#!AMR\n");
    public static final byte[] y = TD2.G0("#!AMR-WB\n");

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface a {
    }

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        w = iArr;
        z = iArr[8];
    }

    public E8() {
        this(0);
    }

    public static /* synthetic */ InterfaceC4324Tj0[] c() {
        return new InterfaceC4324Tj0[]{new E8()};
    }

    public static byte[] e() {
        byte[] bArr = x;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public static byte[] f() {
        byte[] bArr = y;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public static int i(int i) {
        return v[i];
    }

    public static int k(int i) {
        return w[i];
    }

    public static int l(int i, long j) {
        return (int) ((i * 8000000) / j);
    }

    public static boolean t(InterfaceC4421Uj0 interfaceC4421Uj0, byte[] bArr) throws IOException {
        interfaceC4421Uj0.i();
        byte[] bArr2 = new byte[bArr.length];
        interfaceC4421Uj0.x(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // o.InterfaceC4324Tj0
    public void a(long j, long j2) {
        this.g = 0L;
        this.h = 0;
        this.i = 0;
        if (j != 0) {
            KZ1 kz1 = this.q;
            if (kz1 instanceof C7999mK) {
                this.n = ((C7999mK) kz1).b(j);
                return;
            }
        }
        this.n = 0L;
    }

    @Override // o.InterfaceC4324Tj0
    public void b(InterfaceC4518Vj0 interfaceC4518Vj0) {
        this.f445o = interfaceC4518Vj0;
        this.p = interfaceC4518Vj0.b(0, 1);
        interfaceC4518Vj0.n();
    }

    @Override // o.InterfaceC4324Tj0
    public boolean d(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        return v(interfaceC4421Uj0);
    }

    @InterfaceC8557od0({"extractorOutput", "trackOutput"})
    public final void h() {
        C9542sf.k(this.p);
        TD2.o(this.f445o);
    }

    @Override // o.InterfaceC4324Tj0
    public int j(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        h();
        if (interfaceC4421Uj0.getPosition() == 0 && !v(interfaceC4421Uj0)) {
            throw C3989Py1.a("Could not find AMR header.", null);
        }
        r();
        int w2 = w(interfaceC4421Uj0);
        s(interfaceC4421Uj0.getLength(), w2);
        return w2;
    }

    public final KZ1 m(long j, boolean z2) {
        return new C7999mK(j, this.k, l(this.l, 20000L), this.l, z2);
    }

    public final int n(int i) throws C3989Py1 {
        String str;
        if (!p(i)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal AMR ");
            if (this.f) {
                str = "WB";
            } else {
                str = "NB";
            }
            sb.append(str);
            sb.append(" frame type ");
            sb.append(i);
            throw C3989Py1.a(sb.toString(), null);
        } else if (this.f) {
            return w[i];
        } else {
            return v[i];
        }
    }

    public final boolean o(int i) {
        if (!this.f) {
            if (i < 12 || i > 14) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean p(int i) {
        if (i >= 0 && i <= 15) {
            if (q(i) || o(i)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean q(int i) {
        if (this.f) {
            if (i < 10 || i > 13) {
                return true;
            }
            return false;
        }
        return false;
    }

    @HS1({"trackOutput"})
    public final void r() {
        String str;
        int i;
        if (!this.r) {
            this.r = true;
            boolean z2 = this.f;
            if (z2) {
                str = C4128Rj1.d0;
            } else {
                str = C4128Rj1.c0;
            }
            if (z2) {
                i = 16000;
            } else {
                i = 8000;
            }
            this.p.a(new C10833xx0.b().g0(str).Y(z).J(1).h0(i).G());
        }
    }

    @HS1({"extractorOutput"})
    public final void s(long j, int i) {
        int i2;
        boolean z2;
        if (!this.j) {
            int i3 = this.e;
            if ((i3 & 1) != 0 && j != -1 && ((i2 = this.l) == -1 || i2 == this.h)) {
                if (this.m < 20 && i != -1) {
                    return;
                }
                if ((i3 & 2) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                KZ1 m = m(j, z2);
                this.q = m;
                this.f445o.p(m);
                this.j = true;
                return;
            }
            KZ1.b bVar = new KZ1.b(C10323vs.b);
            this.q = bVar;
            this.f445o.p(bVar);
            this.j = true;
        }
    }

    public final int u(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        interfaceC4421Uj0.i();
        interfaceC4421Uj0.x(this.d, 0, 1);
        byte b = this.d[0];
        if ((b & 131) <= 0) {
            return n((b >> 3) & 15);
        }
        throw C3989Py1.a("Invalid padding bits for frame header " + ((int) b), null);
    }

    public final boolean v(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        byte[] bArr = x;
        if (t(interfaceC4421Uj0, bArr)) {
            this.f = false;
            interfaceC4421Uj0.t(bArr.length);
            return true;
        }
        byte[] bArr2 = y;
        if (!t(interfaceC4421Uj0, bArr2)) {
            return false;
        }
        this.f = true;
        interfaceC4421Uj0.t(bArr2.length);
        return true;
    }

    @HS1({"trackOutput"})
    public final int w(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        if (this.i == 0) {
            try {
                int u2 = u(interfaceC4421Uj0);
                this.h = u2;
                this.i = u2;
                if (this.l == -1) {
                    this.k = interfaceC4421Uj0.getPosition();
                    this.l = this.h;
                }
                if (this.l == this.h) {
                    this.m++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int c = this.p.c(interfaceC4421Uj0, this.i, true);
        if (c == -1) {
            return -1;
        }
        int i = this.i - c;
        this.i = i;
        if (i > 0) {
            return 0;
        }
        this.p.b(this.n + this.g, 1, this.h, 0, null);
        this.g += 20000;
        return 0;
    }

    public E8(int i) {
        this.e = (i & 2) != 0 ? i | 1 : i;
        this.d = new byte[1];
        this.l = -1;
    }

    @Override // o.InterfaceC4324Tj0
    public void g() {
    }
}
