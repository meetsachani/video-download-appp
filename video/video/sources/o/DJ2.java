package o;

import android.util.Pair;
import java.io.IOException;

@Deprecated
/* loaded from: classes2.dex */
public final class DJ2 {
    public static final String a = "WavHeaderReader";

    /* loaded from: classes2.dex */
    public static final class a {
        public static final int c = 8;
        public final int a;
        public final long b;

        public a(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public static a a(InterfaceC4421Uj0 interfaceC4421Uj0, C3012Fy1 c3012Fy1) throws IOException {
            interfaceC4421Uj0.x(c3012Fy1.e(), 0, 8);
            c3012Fy1.Y(0);
            return new a(c3012Fy1.s(), c3012Fy1.A());
        }
    }

    public static boolean a(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        C3012Fy1 c3012Fy1 = new C3012Fy1(8);
        int i = a.a(interfaceC4421Uj0, c3012Fy1).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        interfaceC4421Uj0.x(c3012Fy1.e(), 0, 4);
        c3012Fy1.Y(0);
        int s = c3012Fy1.s();
        if (s != 1463899717) {
            I31.d(a, "Unsupported form type: " + s);
            return false;
        }
        return true;
    }

    public static CJ2 b(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        boolean z;
        byte[] bArr;
        C3012Fy1 c3012Fy1 = new C3012Fy1(16);
        a d = d(FJ2.c, interfaceC4421Uj0, c3012Fy1);
        if (d.b >= 16) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        interfaceC4421Uj0.x(c3012Fy1.e(), 0, 16);
        c3012Fy1.Y(0);
        int D = c3012Fy1.D();
        int D2 = c3012Fy1.D();
        int C = c3012Fy1.C();
        int C2 = c3012Fy1.C();
        int D3 = c3012Fy1.D();
        int D4 = c3012Fy1.D();
        int i = ((int) d.b) - 16;
        if (i > 0) {
            bArr = new byte[i];
            interfaceC4421Uj0.x(bArr, 0, i);
        } else {
            bArr = TD2.f;
        }
        byte[] bArr2 = bArr;
        interfaceC4421Uj0.t((int) (interfaceC4421Uj0.n() - interfaceC4421Uj0.getPosition()));
        return new CJ2(D, D2, C, C2, D3, D4, bArr2);
    }

    public static long c(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        C3012Fy1 c3012Fy1 = new C3012Fy1(8);
        a a2 = a.a(interfaceC4421Uj0, c3012Fy1);
        if (a2.a != 1685272116) {
            interfaceC4421Uj0.i();
            return -1L;
        }
        interfaceC4421Uj0.p(8);
        c3012Fy1.Y(0);
        interfaceC4421Uj0.x(c3012Fy1.e(), 0, 8);
        long y = c3012Fy1.y();
        interfaceC4421Uj0.t(((int) a2.b) + 8);
        return y;
    }

    public static a d(int i, InterfaceC4421Uj0 interfaceC4421Uj0, C3012Fy1 c3012Fy1) throws IOException {
        a a2 = a.a(interfaceC4421Uj0, c3012Fy1);
        while (a2.a != i) {
            I31.n(a, "Ignoring unknown WAV chunk: " + a2.a);
            long j = a2.b + 8;
            if (j <= 2147483647L) {
                interfaceC4421Uj0.t((int) j);
                a2 = a.a(interfaceC4421Uj0, c3012Fy1);
            } else {
                throw C3989Py1.e("Chunk is too large (~2GB+) to skip; id: " + a2.a);
            }
        }
        return a2;
    }

    public static Pair<Long, Long> e(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        interfaceC4421Uj0.i();
        a d = d(1684108385, interfaceC4421Uj0, new C3012Fy1(8));
        interfaceC4421Uj0.t(8);
        return Pair.create(Long.valueOf(interfaceC4421Uj0.getPosition()), Long.valueOf(d.b));
    }
}
