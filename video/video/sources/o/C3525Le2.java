package o;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

/* renamed from: o.Le2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3525Le2 extends FilterReader {
    public static final int b1 = -1;
    public final C4726Xm2 X;
    public boolean Y;
    public final char[] Y0;
    public final InterfaceC2828Ee2 Z;
    public final C3427Ke2 Z0;
    public int a1;

    public C3525Le2(Reader reader, C3427Ke2 c3427Ke2) {
        super(reader);
        this.X = new C4726Xm2();
        this.Y0 = new char[]{0};
        this.Z0 = new C3427Ke2(c3427Ke2);
        this.Z = C2937Fe2.c.b(c3427Ke2.c()).d(c3427Ke2.f());
    }

    public final int a(int i) throws IOException {
        boolean z;
        int r1 = this.X.r1(((FilterReader) this).in, i);
        if (r1 == -1) {
            z = true;
        } else {
            z = false;
        }
        this.Y = z;
        return r1;
    }

    public final int d(int i, char[] cArr, int i2, int i3) throws IOException {
        return h(a(i), cArr, i2, i3);
    }

    public final int f(char[] cArr, int i, int i2) {
        int E0 = this.X.E0(0, Math.min(this.X.length(), i2), cArr, i);
        this.a1 -= E0;
        if (!this.X.isEmpty() && this.a1 != 0) {
            return E0;
        }
        this.a1 = 0;
        return E0;
    }

    public final int h(int i, char[] cArr, int i2, int i3) {
        if (i == -1) {
            if (!this.X.f1()) {
                return -1;
            }
            this.a1 = this.X.N1();
            return f(cArr, i2, i3);
        }
        return i;
    }

    public final boolean i(InterfaceC2828Ee2 interfaceC2828Ee2, int i) {
        if (interfaceC2828Ee2.a(this.X, i) == interfaceC2828Ee2.size()) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if (this.a1 > 0) {
            return true;
        }
        return false;
    }

    public final int k(int i, int i2) {
        int N1 = this.X.N1() - i2;
        if (N1 >= i) {
            return 0;
        }
        return i - N1;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        int read;
        do {
            read = read(this.Y0, 0, 1);
            if (read == -1) {
                return -1;
            }
        } while (read < 1);
        return this.Y0[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b2, code lost:
        if (r6 == (-1)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b4, code lost:
        r3 = r3 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b5, code lost:
        r3 = r3 - r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b6, code lost:
        if (r3 <= 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b8, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b9, code lost:
        return -1;
     */
    @Override // java.io.FilterReader, java.io.Reader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int read(char[] cArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        int i5;
        int i6;
        int size;
        if (this.Y && this.X.isEmpty()) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        if (j()) {
            int f = f(cArr, i, Math.min(this.a1, i2));
            if (f != i2) {
                i3 = i + f;
                i4 = i2 - f;
            }
            return i2;
        }
        i3 = i;
        i4 = i2;
        int size2 = this.Z.size();
        a(k(size2, 0));
        if (this.X.length() < size2 && i4 < size2) {
            int f2 = (i3 + f(cArr, i3, i4)) - i;
            if (!this.Y || f2 > 0) {
                return f2;
            }
            return -1;
        } else if (this.Y) {
            this.Z0.D(this.X);
            this.a1 = this.X.N1();
            int f3 = (i3 + f(cArr, i3, i4)) - i;
            if (!this.Y || f3 > 0) {
                return f3;
            }
            return -1;
        } else {
            InterfaceC2828Ee2 f4 = this.Z0.f();
            while (true) {
                if (i4 <= 0) {
                    i5 = 0;
                    i6 = 0;
                    break;
                }
                i6 = 1;
                if (i(f4, 0)) {
                    i5 = f4.size();
                    break;
                } else if (i(this.Z, 0)) {
                    i5 = this.Z.size();
                    break;
                } else {
                    int f5 = f(cArr, i3, 1);
                    i3 += f5;
                    i4 -= f5;
                    if (this.X.N1() < size2) {
                        int d = d(size2, cArr, i3, i4);
                        if (this.Y || j()) {
                            break;
                        }
                    }
                }
            }
            if (i4 > 0) {
                InterfaceC2828Ee2 g = this.Z0.g();
                int max = Math.max(size2, g.size());
                a(k(max, i5));
                if (this.Y) {
                    this.Z0.D(this.X);
                    this.a1 = this.X.N1();
                    return (i3 + f(cArr, i3, i4)) - i;
                }
                while (true) {
                    if (i(g, i5)) {
                        i6--;
                        i5++;
                        if (i6 == 0) {
                            break;
                        }
                    } else {
                        if (i(f4, i5)) {
                            i6++;
                            size = f4.size();
                        } else if (i(this.Z, i5)) {
                            i6++;
                            size = this.Z.size();
                        } else {
                            i5++;
                        }
                        i5 += size;
                    }
                    if (a(k(max, i5)) == -1 && i5 >= this.X.N1()) {
                        break;
                    }
                }
                int max2 = Math.max(0, this.X.N1() - i5);
                C3427Ke2 c3427Ke2 = this.Z0;
                C4726Xm2 c4726Xm2 = this.X;
                c3427Ke2.E(c4726Xm2, 0, Math.min(c4726Xm2.N1(), i5 + 1));
                int N1 = this.X.N1() - max2;
                int min = Math.min(i4, N1);
                this.a1 = N1;
                f(cArr, i3, min);
                return (i3 - i) + min;
            }
            return i2;
        }
    }
}
