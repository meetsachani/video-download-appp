package o;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import o.C5200av0;

/* renamed from: o.bv0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5443bv0 {
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 3;
    public static final int l = 4;
    public static final int m = 7;
    public static final int n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f700o = 1;
    public static final int p = 2;
    public static final int q = 3;
    public static final /* synthetic */ boolean r = false;
    public final AO1 a;
    public final ArrayList<b> b;
    public final HashMap<String, Integer> c;
    public final HashMap<String, Integer> d;
    public final int e;
    public boolean f;
    public Comparator<b> g;

    /* renamed from: o.bv0$a */
    /* loaded from: classes.dex */
    public class a implements Comparator<b> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(b bVar, b bVar2) {
            byte b;
            byte b2;
            int i = bVar.e;
            int i2 = bVar2.e;
            do {
                b = C5443bv0.this.a.get(i);
                b2 = C5443bv0.this.a.get(i2);
                if (b == 0) {
                    return b - b2;
                }
                i++;
                i2++;
            } while (b == b2);
            return b - b2;
        }
    }

    public C5443bv0(int i2) {
        this(new C2825Ee(i2), 1);
    }

    public static int E(long j2) {
        if (j2 <= C5200av0.j.a((byte) -1)) {
            return 0;
        }
        if (j2 <= C5200av0.j.c((short) -1)) {
            return 1;
        }
        if (j2 <= C5200av0.j.b(-1)) {
            return 2;
        }
        return 3;
    }

    public final void A(String str, long j2) {
        this.b.add(b.w(u(str), j2));
    }

    public void B(BigInteger bigInteger) {
        A(null, bigInteger.longValue());
    }

    public int C() {
        return this.b.size();
    }

    public int D() {
        return this.b.size();
    }

    public final void F(b bVar, int i2) {
        int i3 = bVar.a;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            if (i3 != 3) {
                if (i3 != 26) {
                    J(bVar.d, i2);
                    return;
                }
            } else {
                H(bVar.c, i2);
                return;
            }
        }
        I(bVar.d, i2);
    }

    public final b G(int i2, byte[] bArr, int i3, boolean z) {
        int E = E(bArr.length);
        I(bArr.length, b(E));
        int m2 = this.a.m();
        this.a.p(bArr, 0, bArr.length);
        if (z) {
            this.a.n((byte) 0);
        }
        return b.f(i2, m2, i3, E);
    }

    public final void H(double d, int i2) {
        if (i2 == 4) {
            this.a.b((float) d);
        } else if (i2 == 8) {
            this.a.a(d);
        }
    }

    public final void I(long j2, int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 != 8) {
                        return;
                    }
                    this.a.f(j2);
                    return;
                }
                this.a.e((int) j2);
                return;
            }
            this.a.c((short) j2);
            return;
        }
        this.a.n((byte) j2);
    }

    public final void J(long j2, int i2) {
        I((int) (this.a.m() - j2), i2);
    }

    public final b K(int i2, String str) {
        return G(i2, str.getBytes(StandardCharsets.UTF_8), 5, true);
    }

    public final int b(int i2) {
        int i3 = 1 << i2;
        int q2 = b.q(this.a.m(), i3);
        while (true) {
            int i4 = q2 - 1;
            if (q2 != 0) {
                this.a.n((byte) 0);
                q2 = i4;
            } else {
                return i3;
            }
        }
    }

    public final b c(int i2, int i3) {
        long j2 = i3;
        int max = Math.max(0, E(j2));
        int i4 = i2;
        while (i4 < this.b.size()) {
            int i5 = i4 + 1;
            max = Math.max(max, b.i(4, 0, this.b.get(i4).e, this.a.m(), i5));
            i4 = i5;
        }
        int b2 = b(max);
        I(j2, b2);
        int m2 = this.a.m();
        while (i2 < this.b.size()) {
            int i6 = this.b.get(i2).e;
            J(this.b.get(i2).e, b2);
            i2++;
        }
        return new b(-1, C5200av0.q(4, 0), max, m2);
    }

    public final b d(int i2, int i3, int i4, boolean z, boolean z2, b bVar) {
        int i5;
        int i6;
        int i7 = i4;
        long j2 = i7;
        int max = Math.max(0, E(j2));
        if (bVar != null) {
            max = Math.max(max, bVar.h(this.a.m(), 0));
            i5 = 3;
        } else {
            i5 = 1;
        }
        int i8 = 4;
        int i9 = max;
        for (int i10 = i3; i10 < this.b.size(); i10++) {
            i9 = Math.max(i9, this.b.get(i10).h(this.a.m(), i10 + i5));
            if (z && i10 == i3) {
                i8 = this.b.get(i10).a;
                if (!C5200av0.l(i8)) {
                    throw new C5200av0.b("TypedVector does not support this element type");
                }
            }
        }
        int i11 = i3;
        int b2 = b(i9);
        if (bVar != null) {
            J(bVar.d, b2);
            I(1 << bVar.b, b2);
        }
        if (!z2) {
            I(j2, b2);
        }
        int m2 = this.a.m();
        for (int i12 = i11; i12 < this.b.size(); i12++) {
            F(this.b.get(i12), b2);
        }
        if (!z) {
            while (i11 < this.b.size()) {
                this.a.n(this.b.get(i11).s(i9));
                i11++;
            }
        }
        if (bVar != null) {
            i6 = 9;
        } else if (z) {
            if (!z2) {
                i7 = 0;
            }
            i6 = C5200av0.q(i8, i7);
        } else {
            i6 = 10;
        }
        return new b(i2, i6, i9, m2);
    }

    public int e(String str, int i2) {
        int u = u(str);
        ArrayList<b> arrayList = this.b;
        Collections.sort(arrayList.subList(i2, arrayList.size()), this.g);
        b d = d(u, i2, this.b.size() - i2, false, false, c(i2, this.b.size() - i2));
        while (this.b.size() > i2) {
            ArrayList<b> arrayList2 = this.b;
            arrayList2.remove(arrayList2.size() - 1);
        }
        this.b.add(d);
        return (int) d.d;
    }

    public int f(String str, int i2, boolean z, boolean z2) {
        b d = d(u(str), i2, this.b.size() - i2, z, z2, null);
        while (this.b.size() > i2) {
            ArrayList<b> arrayList = this.b;
            arrayList.remove(arrayList.size() - 1);
        }
        this.b.add(d);
        return (int) d.d;
    }

    public ByteBuffer g() {
        int b2 = b(this.b.get(0).h(this.a.m(), 0));
        F(this.b.get(0), b2);
        this.a.n(this.b.get(0).r());
        this.a.n((byte) b2);
        this.f = true;
        return ByteBuffer.wrap(this.a.h(), 0, this.a.m());
    }

    public AO1 h() {
        return this.a;
    }

    public int i(String str, byte[] bArr) {
        b G = G(u(str), bArr, 25, false);
        this.b.add(G);
        return (int) G.d;
    }

    public int j(byte[] bArr) {
        return i(null, bArr);
    }

    public void k(String str, boolean z) {
        this.b.add(b.g(u(str), z));
    }

    public void l(boolean z) {
        k(null, z);
    }

    public void m(double d) {
        o(null, d);
    }

    public void n(float f) {
        p(null, f);
    }

    public void o(String str, double d) {
        this.b.add(b.k(u(str), d));
    }

    public void p(String str, float f) {
        this.b.add(b.j(u(str), f));
    }

    public void q(int i2) {
        s(null, i2);
    }

    public void r(long j2) {
        t(null, j2);
    }

    public void s(String str, int i2) {
        t(str, i2);
    }

    public void t(String str, long j2) {
        int u = u(str);
        if (-128 <= j2 && j2 <= 127) {
            this.b.add(b.o(u, (int) j2));
        } else if (-32768 <= j2 && j2 <= 32767) {
            this.b.add(b.l(u, (int) j2));
        } else if (-2147483648L <= j2 && j2 <= 2147483647L) {
            this.b.add(b.m(u, (int) j2));
        } else {
            this.b.add(b.n(u, j2));
        }
    }

    public final int u(String str) {
        if (str == null) {
            return -1;
        }
        int m2 = this.a.m();
        if ((this.e & 1) != 0) {
            Integer num = this.c.get(str);
            if (num == null) {
                byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                this.a.p(bytes, 0, bytes.length);
                this.a.n((byte) 0);
                this.c.put(str, Integer.valueOf(m2));
                return m2;
            }
            return num.intValue();
        }
        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
        this.a.p(bytes2, 0, bytes2.length);
        this.a.n((byte) 0);
        this.c.put(str, Integer.valueOf(m2));
        return m2;
    }

    public int v(String str) {
        return w(null, str);
    }

    public int w(String str, String str2) {
        int u = u(str);
        if ((this.e & 2) != 0) {
            Integer num = this.d.get(str2);
            if (num == null) {
                b K = K(u, str2);
                this.d.put(str2, Integer.valueOf((int) K.d));
                this.b.add(K);
                return (int) K.d;
            }
            this.b.add(b.f(u, num.intValue(), 5, E(str2.length())));
            return num.intValue();
        }
        b K2 = K(u, str2);
        this.b.add(K2);
        return (int) K2.d;
    }

    public void x(int i2) {
        z(null, i2);
    }

    public void y(long j2) {
        z(null, j2);
    }

    public final void z(String str, long j2) {
        b w;
        int u = u(str);
        int E = E(j2);
        if (E == 0) {
            w = b.x(u, (int) j2);
        } else if (E == 1) {
            w = b.u(u, (int) j2);
        } else if (E == 2) {
            w = b.v(u, (int) j2);
        } else {
            w = b.w(u, j2);
        }
        this.b.add(w);
    }

    public C5443bv0() {
        this(256);
    }

    @Deprecated
    public C5443bv0(ByteBuffer byteBuffer, int i2) {
        this(new C2825Ee(byteBuffer.array()), i2);
    }

    public C5443bv0(AO1 ao1, int i2) {
        this.b = new ArrayList<>();
        this.c = new HashMap<>();
        this.d = new HashMap<>();
        this.f = false;
        this.g = new a();
        this.a = ao1;
        this.e = i2;
    }

    /* renamed from: o.bv0$b */
    /* loaded from: classes.dex */
    public static class b {
        public static final /* synthetic */ boolean f = false;
        public final int a;
        public final int b;
        public final double c;
        public long d;
        public int e;

        public b(int i, int i2, int i3, long j) {
            this.e = i;
            this.a = i2;
            this.b = i3;
            this.d = j;
            this.c = Double.MIN_VALUE;
        }

        public static b f(int i, int i2, int i3, int i4) {
            return new b(i, i3, i4, i2);
        }

        public static b g(int i, boolean z) {
            long j;
            if (z) {
                j = 1;
            } else {
                j = 0;
            }
            return new b(i, 26, 0, j);
        }

        public static int i(int i, int i2, long j, int i3, int i4) {
            if (C5200av0.j(i)) {
                return i2;
            }
            for (int i5 = 1; i5 <= 32; i5 *= 2) {
                int E = C5443bv0.E((int) (((q(i3, i5) + i3) + (i4 * i5)) - j));
                if ((1 << E) == i5) {
                    return E;
                }
            }
            return 3;
        }

        public static b j(int i, float f2) {
            return new b(i, 3, 2, f2);
        }

        public static b k(int i, double d) {
            return new b(i, 3, 3, d);
        }

        public static b l(int i, int i2) {
            return new b(i, 1, 1, i2);
        }

        public static b m(int i, int i2) {
            return new b(i, 1, 2, i2);
        }

        public static b n(int i, long j) {
            return new b(i, 1, 3, j);
        }

        public static b o(int i, int i2) {
            return new b(i, 1, 0, i2);
        }

        public static byte p(int i, int i2) {
            return (byte) (i | (i2 << 2));
        }

        public static int q(int i, int i2) {
            return ((~i) + 1) & (i2 - 1);
        }

        public static b u(int i, int i2) {
            return new b(i, 2, 1, i2);
        }

        public static b v(int i, int i2) {
            return new b(i, 2, 2, i2);
        }

        public static b w(int i, long j) {
            return new b(i, 2, 3, j);
        }

        public static b x(int i, int i2) {
            return new b(i, 2, 0, i2);
        }

        public final int h(int i, int i2) {
            return i(this.a, this.b, this.d, i, i2);
        }

        public final byte r() {
            return s(0);
        }

        public final byte s(int i) {
            return p(t(i), this.a);
        }

        public final int t(int i) {
            if (C5200av0.j(this.a)) {
                return Math.max(this.b, i);
            }
            return this.b;
        }

        public b(int i, int i2, int i3, double d) {
            this.e = i;
            this.a = i2;
            this.b = i3;
            this.c = d;
            this.d = Long.MIN_VALUE;
        }
    }

    public C5443bv0(ByteBuffer byteBuffer) {
        this(byteBuffer, 1);
    }
}
