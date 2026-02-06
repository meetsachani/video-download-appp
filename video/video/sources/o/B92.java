package o;

import java.io.IOException;

@Deprecated
/* loaded from: classes2.dex */
public final class B92 {
    public static final int c = 1024;
    public static final int d = 440786851;
    public final C3012Fy1 a = new C3012Fy1(8);
    public int b;

    public final long a(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        int i = 0;
        interfaceC4421Uj0.x(this.a.e(), 0, 1);
        int i2 = this.a.e()[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        interfaceC4421Uj0.x(this.a.e(), 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.a.e()[i] & 255) + (i5 << 8);
        }
        this.b += i4 + 1;
        return i5;
    }

    public boolean b(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        long a;
        int i;
        long length = interfaceC4421Uj0.getLength();
        int i2 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j = 1024;
        if (i2 != 0 && length <= 1024) {
            j = length;
        }
        int i3 = (int) j;
        interfaceC4421Uj0.x(this.a.e(), 0, 4);
        long N = this.a.N();
        this.b = 4;
        while (N != 440786851) {
            int i4 = this.b + 1;
            this.b = i4;
            if (i4 == i3) {
                return false;
            }
            interfaceC4421Uj0.x(this.a.e(), 0, 1);
            N = ((N << 8) & (-256)) | (this.a.e()[0] & 255);
        }
        long a2 = a(interfaceC4421Uj0);
        long j2 = this.b;
        if (a2 != Long.MIN_VALUE && (i2 == 0 || j2 + a2 < length)) {
            while (true) {
                int i5 = this.b;
                long j3 = j2 + a2;
                if (i5 < j3) {
                    if (a(interfaceC4421Uj0) != Long.MIN_VALUE && (a(interfaceC4421Uj0)) >= 0 && a <= 2147483647L) {
                        if (i != 0) {
                            int i6 = (int) a;
                            interfaceC4421Uj0.p(i6);
                            this.b += i6;
                        }
                    }
                } else if (i5 == j3) {
                    return true;
                }
            }
        }
        return false;
    }
}
