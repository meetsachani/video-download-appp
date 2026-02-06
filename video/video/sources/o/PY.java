package o;

import java.io.IOException;
import java.util.ArrayDeque;

@Deprecated
/* loaded from: classes2.dex */
public final class PY implements InterfaceC7452k90 {
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 4;
    public static final int l = 8;
    public static final int m = 8;
    public static final int n = 4;

    /* renamed from: o  reason: collision with root package name */
    public static final int f582o = 8;
    public final byte[] a = new byte[8];
    public final ArrayDeque<b> b = new ArrayDeque<>();
    public final JE2 c = new JE2();
    public InterfaceC7209j90 d;
    public int e;
    public int f;
    public long g;

    /* loaded from: classes2.dex */
    public static final class b {
        public final int a;
        public final long b;

        public b(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    public static String f(InterfaceC4421Uj0 interfaceC4421Uj0, int i2) throws IOException {
        if (i2 == 0) {
            return "";
        }
        byte[] bArr = new byte[i2];
        interfaceC4421Uj0.readFully(bArr, 0, i2);
        while (i2 > 0 && bArr[i2 - 1] == 0) {
            i2--;
        }
        return new String(bArr, 0, i2);
    }

    @Override // o.InterfaceC7452k90
    public boolean a(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        C9542sf.k(this.d);
        while (true) {
            b peek = this.b.peek();
            if (peek != null && interfaceC4421Uj0.getPosition() >= peek.b) {
                this.d.a(this.b.pop().a);
                return true;
            }
            if (this.e == 0) {
                long d = this.c.d(interfaceC4421Uj0, true, false, 4);
                if (d == -2) {
                    d = c(interfaceC4421Uj0);
                }
                if (d == -1) {
                    return false;
                }
                this.f = (int) d;
                this.e = 1;
            }
            if (this.e == 1) {
                this.g = this.c.d(interfaceC4421Uj0, false, true, 8);
                this.e = 2;
            }
            int d2 = this.d.d(this.f);
            if (d2 != 0) {
                if (d2 != 1) {
                    if (d2 != 2) {
                        if (d2 != 3) {
                            if (d2 != 4) {
                                if (d2 == 5) {
                                    long j2 = this.g;
                                    if (j2 != 4 && j2 != 8) {
                                        throw C3989Py1.a("Invalid float size: " + this.g, null);
                                    }
                                    this.d.b(this.f, d(interfaceC4421Uj0, (int) j2));
                                    this.e = 0;
                                    return true;
                                }
                                throw C3989Py1.a("Invalid element type " + d2, null);
                            }
                            this.d.g(this.f, (int) this.g, interfaceC4421Uj0);
                            this.e = 0;
                            return true;
                        }
                        long j3 = this.g;
                        if (j3 <= 2147483647L) {
                            this.d.f(this.f, f(interfaceC4421Uj0, (int) j3));
                            this.e = 0;
                            return true;
                        }
                        throw C3989Py1.a("String element size: " + this.g, null);
                    }
                    long j4 = this.g;
                    if (j4 <= 8) {
                        this.d.c(this.f, e(interfaceC4421Uj0, (int) j4));
                        this.e = 0;
                        return true;
                    }
                    throw C3989Py1.a("Invalid integer size: " + this.g, null);
                }
                long position = interfaceC4421Uj0.getPosition();
                this.b.push(new b(this.f, this.g + position));
                this.d.h(this.f, position, this.g);
                this.e = 0;
                return true;
            }
            interfaceC4421Uj0.t((int) this.g);
            this.e = 0;
        }
    }

    @Override // o.InterfaceC7452k90
    public void b(InterfaceC7209j90 interfaceC7209j90) {
        this.d = interfaceC7209j90;
    }

    @HS1({"processor"})
    public final long c(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        interfaceC4421Uj0.i();
        while (true) {
            interfaceC4421Uj0.x(this.a, 0, 4);
            int c = JE2.c(this.a[0]);
            if (c != -1 && c <= 4) {
                int a2 = (int) JE2.a(this.a, c, false);
                if (this.d.e(a2)) {
                    interfaceC4421Uj0.t(c);
                    return a2;
                }
            }
            interfaceC4421Uj0.t(1);
        }
    }

    public final double d(InterfaceC4421Uj0 interfaceC4421Uj0, int i2) throws IOException {
        long e = e(interfaceC4421Uj0, i2);
        if (i2 == 4) {
            return Float.intBitsToFloat((int) e);
        }
        return Double.longBitsToDouble(e);
    }

    public final long e(InterfaceC4421Uj0 interfaceC4421Uj0, int i2) throws IOException {
        interfaceC4421Uj0.readFully(this.a, 0, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = (j2 << 8) | (this.a[i3] & 255);
        }
        return j2;
    }

    @Override // o.InterfaceC7452k90
    public void reset() {
        this.e = 0;
        this.b.clear();
        this.c.e();
    }
}
