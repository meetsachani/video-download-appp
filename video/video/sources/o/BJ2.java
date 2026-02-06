package o;

import android.util.Pair;
import com.facebook.internal.C2372q;
import java.io.IOException;
import o.C10833xx0;
import o.C3503Kz;

@Deprecated
/* loaded from: classes2.dex */
public final class BJ2 implements InterfaceC4324Tj0 {
    public static final String k = "WavExtractor";
    public static final int l = 10;
    public static final InterfaceC4809Yj0 m = new InterfaceC4809Yj0() { // from class: o.AJ2
        @Override // o.InterfaceC4809Yj0
        public final InterfaceC4324Tj0[] b() {
            return BJ2.c();
        }
    };
    public static final int n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f417o = 1;
    public static final int p = 2;
    public static final int q = 3;
    public static final int r = 4;
    public InterfaceC4518Vj0 d;
    public InterfaceC10568wr2 e;
    public b h;
    public int f = 0;
    public long g = -1;
    public int i = -1;
    public long j = -1;

    /* loaded from: classes2.dex */
    public static final class a implements b {
        public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, C3503Kz.g0, C3503Kz.q0, 173, C2372q.m, C3503Kz.b.y, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
        public final InterfaceC4518Vj0 a;
        public final InterfaceC10568wr2 b;
        public final CJ2 c;
        public final int d;
        public final byte[] e;
        public final C3012Fy1 f;
        public final int g;
        public final C10833xx0 h;
        public int i;
        public long j;
        public int k;
        public long l;

        public a(InterfaceC4518Vj0 interfaceC4518Vj0, InterfaceC10568wr2 interfaceC10568wr2, CJ2 cj2) throws C3989Py1 {
            this.a = interfaceC4518Vj0;
            this.b = interfaceC10568wr2;
            this.c = cj2;
            int max = Math.max(1, cj2.c / 10);
            this.g = max;
            C3012Fy1 c3012Fy1 = new C3012Fy1(cj2.g);
            c3012Fy1.D();
            int D = c3012Fy1.D();
            this.d = D;
            int i = cj2.b;
            int i2 = (((cj2.e - (i * 4)) * 8) / (cj2.f * i)) + 1;
            if (D == i2) {
                int q = TD2.q(max, D);
                this.e = new byte[cj2.e * q];
                this.f = new C3012Fy1(q * h(D, i));
                int i3 = ((cj2.c * cj2.e) * 8) / D;
                this.h = new C10833xx0.b().g0(C4128Rj1.N).I(i3).b0(i3).Y(h(max, i)).J(cj2.b).h0(cj2.c).a0(2).G();
                return;
            }
            throw C3989Py1.a("Expected frames per block: " + i2 + "; got: " + D, null);
        }

        public static int h(int i, int i2) {
            return i * 2 * i2;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please submit an issue!!! */
        @Override // o.BJ2.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean a(InterfaceC4421Uj0 interfaceC4421Uj0, long j) throws IOException {
            boolean z;
            int i;
            int f;
            int i2;
            int q = TD2.q(this.g - f(this.k), this.d) * this.c.e;
            if (j != 0) {
                z = false;
                while (!z) {
                    if (this.i >= q) {
                        break;
                    }
                    int read = interfaceC4421Uj0.read(this.e, this.i, (int) Math.min(q - i2, j));
                    if (read != -1) {
                        this.i += read;
                    }
                }
                i = this.i / this.c.e;
                if (i > 0) {
                    d(this.e, i, this.f);
                    this.i -= i * this.c.e;
                    int g = this.f.g();
                    this.b.e(this.f, g);
                    int i3 = this.k + g;
                    this.k = i3;
                    int f2 = f(i3);
                    int i4 = this.g;
                    if (f2 >= i4) {
                        i(i4);
                    }
                }
                if (z && (f = f(this.k)) > 0) {
                    i(f);
                }
                return z;
            }
            z = true;
            while (!z) {
            }
            i = this.i / this.c.e;
            if (i > 0) {
            }
            if (z) {
                i(f);
            }
            return z;
        }

        @Override // o.BJ2.b
        public void b(int i, long j) {
            this.a.p(new EJ2(this.c, this.d, i, j));
            this.b.a(this.h);
        }

        @Override // o.BJ2.b
        public void c(long j) {
            this.i = 0;
            this.j = j;
            this.k = 0;
            this.l = 0L;
        }

        public final void d(byte[] bArr, int i, C3012Fy1 c3012Fy1) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < this.c.b; i3++) {
                    e(bArr, i2, i3, c3012Fy1.e());
                }
            }
            int g = g(this.d * i);
            c3012Fy1.Y(0);
            c3012Fy1.X(g);
        }

        public final void e(byte[] bArr, int i, int i2, byte[] bArr2) {
            int i3;
            CJ2 cj2 = this.c;
            int i4 = cj2.e;
            int i5 = cj2.b;
            int i6 = (i * i4) + (i2 * 4);
            int i7 = (i5 * 4) + i6;
            int i8 = (i4 / i5) - 4;
            int i9 = (short) (((bArr[i6 + 1] & 255) << 8) | (bArr[i6] & 255));
            int min = Math.min(bArr[i6 + 2] & 255, 88);
            int i10 = n[min];
            int i11 = ((i * this.d * i5) + i2) * 2;
            bArr2[i11] = (byte) (i9 & 255);
            bArr2[i11 + 1] = (byte) (i9 >> 8);
            for (int i12 = 0; i12 < i8 * 2; i12++) {
                byte b = bArr[((i12 / 8) * i5 * 4) + i7 + ((i12 / 2) % 4)];
                int i13 = b & 255;
                if (i12 % 2 == 0) {
                    i3 = b & C8077mf.q;
                } else {
                    i3 = i13 >> 4;
                }
                int i14 = ((((i3 & 7) * 2) + 1) * i10) >> 3;
                if ((i3 & 8) != 0) {
                    i14 = -i14;
                }
                i9 = TD2.w(i9 + i14, -32768, 32767);
                i11 += i5 * 2;
                bArr2[i11] = (byte) (i9 & 255);
                bArr2[i11 + 1] = (byte) (i9 >> 8);
                int i15 = min + m[i3];
                int[] iArr = n;
                min = TD2.w(i15, 0, iArr.length - 1);
                i10 = iArr[min];
            }
        }

        public final int f(int i) {
            return i / (this.c.b * 2);
        }

        public final int g(int i) {
            return h(i, this.c.b);
        }

        public final void i(int i) {
            int g = g(i);
            this.b.b(this.j + TD2.C1(this.l, 1000000L, this.c.c), 1, g, this.k - g, null);
            this.l += i;
            this.k -= g;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        boolean a(InterfaceC4421Uj0 interfaceC4421Uj0, long j) throws IOException;

        void b(int i, long j) throws C3989Py1;

        void c(long j);
    }

    /* loaded from: classes2.dex */
    public static final class c implements b {
        public final InterfaceC4518Vj0 a;
        public final InterfaceC10568wr2 b;
        public final CJ2 c;
        public final C10833xx0 d;
        public final int e;
        public long f;
        public int g;
        public long h;

        public c(InterfaceC4518Vj0 interfaceC4518Vj0, InterfaceC10568wr2 interfaceC10568wr2, CJ2 cj2, String str, int i) throws C3989Py1 {
            this.a = interfaceC4518Vj0;
            this.b = interfaceC10568wr2;
            this.c = cj2;
            int i2 = (cj2.b * cj2.f) / 8;
            if (cj2.e == i2) {
                int i3 = cj2.c;
                int i4 = i3 * i2 * 8;
                int max = Math.max(i2, (i3 * i2) / 10);
                this.e = max;
                this.d = new C10833xx0.b().g0(str).I(i4).b0(i4).Y(max).J(cj2.b).h0(cj2.c).a0(i).G();
                return;
            }
            throw C3989Py1.a("Expected block size: " + i2 + "; got: " + cj2.e, null);
        }

        @Override // o.BJ2.b
        public boolean a(InterfaceC4421Uj0 interfaceC4421Uj0, long j) throws IOException {
            int i;
            CJ2 cj2;
            int i2;
            int i3;
            long j2 = j;
            while (true) {
                i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                if (i <= 0 || (i2 = this.g) >= (i3 = this.e)) {
                    break;
                }
                int c = this.b.c(interfaceC4421Uj0, (int) Math.min(i3 - i2, j2), true);
                if (c == -1) {
                    j2 = 0;
                } else {
                    this.g += c;
                    j2 -= c;
                }
            }
            int i4 = this.c.e;
            int i5 = this.g / i4;
            if (i5 > 0) {
                int i6 = i5 * i4;
                int i7 = this.g - i6;
                this.b.b(this.f + TD2.C1(this.h, 1000000L, cj2.c), 1, i6, i7, null);
                this.h += i5;
                this.g = i7;
            }
            if (i <= 0) {
                return true;
            }
            return false;
        }

        @Override // o.BJ2.b
        public void b(int i, long j) {
            this.a.p(new EJ2(this.c, 1, i, j));
            this.b.a(this.d);
        }

        @Override // o.BJ2.b
        public void c(long j) {
            this.f = j;
            this.g = 0;
            this.h = 0L;
        }
    }

    public static /* synthetic */ InterfaceC4324Tj0[] c() {
        return new InterfaceC4324Tj0[]{new BJ2()};
    }

    @InterfaceC8557od0({"extractorOutput", "trackOutput"})
    private void e() {
        C9542sf.k(this.e);
        TD2.o(this.d);
    }

    @Override // o.InterfaceC4324Tj0
    public void a(long j, long j2) {
        int i;
        if (j == 0) {
            i = 0;
        } else {
            i = 4;
        }
        this.f = i;
        b bVar = this.h;
        if (bVar != null) {
            bVar.c(j2);
        }
    }

    @Override // o.InterfaceC4324Tj0
    public void b(InterfaceC4518Vj0 interfaceC4518Vj0) {
        this.d = interfaceC4518Vj0;
        this.e = interfaceC4518Vj0.b(0, 1);
        interfaceC4518Vj0.n();
    }

    @Override // o.InterfaceC4324Tj0
    public boolean d(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        return DJ2.a(interfaceC4421Uj0);
    }

    public final void f(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        boolean z;
        if (interfaceC4421Uj0.getPosition() == 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        int i = this.i;
        if (i != -1) {
            interfaceC4421Uj0.t(i);
            this.f = 4;
        } else if (DJ2.a(interfaceC4421Uj0)) {
            interfaceC4421Uj0.t((int) (interfaceC4421Uj0.n() - interfaceC4421Uj0.getPosition()));
            this.f = 1;
        } else {
            throw C3989Py1.a("Unsupported or unrecognized wav file type.", null);
        }
    }

    @HS1({"extractorOutput", "trackOutput"})
    public final void h(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        CJ2 b2 = DJ2.b(interfaceC4421Uj0);
        int i = b2.a;
        if (i == 17) {
            this.h = new a(this.d, this.e, b2);
        } else if (i == 6) {
            this.h = new c(this.d, this.e, b2, C4128Rj1.O, -1);
        } else if (i == 7) {
            this.h = new c(this.d, this.e, b2, C4128Rj1.P, -1);
        } else {
            int a2 = FJ2.a(i, b2.f);
            if (a2 != 0) {
                this.h = new c(this.d, this.e, b2, C4128Rj1.N, a2);
            } else {
                throw C3989Py1.e("Unsupported WAV format type: " + b2.a);
            }
        }
        this.f = 3;
    }

    public final void i(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        this.g = DJ2.c(interfaceC4421Uj0);
        this.f = 2;
    }

    @Override // o.InterfaceC4324Tj0
    public int j(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        e();
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return k(interfaceC4421Uj0);
                        }
                        throw new IllegalStateException();
                    }
                    l(interfaceC4421Uj0);
                    return 0;
                }
                h(interfaceC4421Uj0);
                return 0;
            }
            i(interfaceC4421Uj0);
            return 0;
        }
        f(interfaceC4421Uj0);
        return 0;
    }

    public final int k(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        boolean z;
        if (this.j != -1) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        if (!((b) C9542sf.g(this.h)).a(interfaceC4421Uj0, this.j - interfaceC4421Uj0.getPosition())) {
            return 0;
        }
        return -1;
    }

    public final void l(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        Pair<Long, Long> e = DJ2.e(interfaceC4421Uj0);
        this.i = ((Long) e.first).intValue();
        long longValue = ((Long) e.second).longValue();
        long j = this.g;
        if (j != -1 && longValue == 4294967295L) {
            longValue = j;
        }
        this.j = this.i + longValue;
        long length = interfaceC4421Uj0.getLength();
        if (length != -1 && this.j > length) {
            I31.n(k, "Data exceeds input length: " + this.j + C6566gU0.h + length);
            this.j = length;
        }
        ((b) C9542sf.g(this.h)).b(this.i, this.j);
        this.f = 4;
    }

    @Override // o.InterfaceC4324Tj0
    public void g() {
    }
}
