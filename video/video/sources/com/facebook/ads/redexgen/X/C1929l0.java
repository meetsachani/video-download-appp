package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.l0  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1929l0 implements LL {
    public static byte[] A08;
    public static String[] A09 = {"mF6wsmKEoSH0oaFjYCs54xiQsDf", "7fvgeHK83IOxRTsxSXxl4b3GDJCkJYIR", "3AWdxUjQjYm4RALX7ZxT6TNspaUhotFB", "ejd6qsjsHb99jkL857XJ5GpzVF9O4Dmm", "HjmRuX1Dl2gTeBJaQInX56gY9CThxDdt", "4dP72HMzoJKZI0lPLVreHOZSlD0czmst", "VabPsN9EmqWHNd02VeXfGkhVpY5qzzPo", "1TiSMCKkeVz3FItUT5PAcFJ22kgDAGxf"};
    public int A00;
    public long A01;
    public long A02;
    public final int A03;
    public final C2242qI A04;
    public final HA A05;
    public final InterfaceC0780Hd A06;
    public final LN A07;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 81);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-68, -95, -24, -16, -11, -69, -95, -34, 17, 9, -2, -4, 13, -2, -3, -71, -5, 5, 8, -4, 4, -71, C8077mf.n, 2, 19, -2, -45, -71};
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
        r6 = r15.A07.A02;
        r3 = r15.A00 / r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
        if (r3 <= 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
        r10 = r3 * r6;
        r11 = r15.A00 - r10;
        r15.A06.AIu(r15.A02 + com.facebook.ads.redexgen.X.C5C.A0U(r15.A01, 1000000, r15.A07.A04), 1, r10, r11, null);
        r15.A01 += r3;
        r15.A00 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
        if (r0 > 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
        return false;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.LL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AIt(InterfaceC2033ms interfaceC2033ms, long j) throws IOException {
        long j2 = j;
        while (true) {
            String[] strArr = A09;
            if (strArr[6].charAt(28) != strArr[5].charAt(28)) {
                throw new RuntimeException();
            }
            A09[7] = "xyHijgDe1t0LZE27YhGAb5keyZPdsLp6";
            if (j2 <= 0 || this.A00 >= this.A03) {
                break;
            }
            int AIp = this.A06.AIp(interfaceC2033ms, (int) Math.min(this.A03 - this.A00, j2), true);
            if (AIp == -1) {
                j2 = 0;
            } else {
                this.A00 += AIp;
                j2 -= AIp;
            }
        }
    }

    static {
        A01();
    }

    public C1929l0(HA ha, InterfaceC0780Hd interfaceC0780Hd, LN ln, String str, int i) throws C3K {
        this.A05 = ha;
        this.A06 = interfaceC0780Hd;
        this.A07 = ln;
        int i2 = (ln.A05 * ln.A01) / 8;
        int bytesPerFrame = ln.A02;
        if (bytesPerFrame == i2) {
            int bytesPerFrame2 = ln.A04;
            int constantBitrate = bytesPerFrame2 * i2 * 8;
            int bytesPerFrame3 = ln.A04;
            this.A03 = Math.max(i2, (bytesPerFrame3 * i2) / 10);
            C04212p A0j = new C04212p().A11(str).A0a(constantBitrate).A0j(constantBitrate);
            int bytesPerFrame4 = this.A03;
            C04212p A0h = A0j.A0h(bytesPerFrame4);
            int bytesPerFrame5 = ln.A05;
            C04212p A0b = A0h.A0b(bytesPerFrame5);
            int bytesPerFrame6 = ln.A04;
            this.A04 = A0b.A0m(bytesPerFrame6).A0i(i).A14();
            return;
        }
        StringBuilder append = new StringBuilder().append(A00(7, 21, 72)).append(i2).append(A00(0, 7, 48));
        int bytesPerFrame7 = ln.A02;
        throw C3K.A01(append.append(bytesPerFrame7).toString(), null);
    }

    @Override // com.facebook.ads.redexgen.X.LL
    public final void AA8(int i, long j) {
        this.A05.AJ7(new C1927ky(this.A07, 1, i, j));
        this.A06.A6e(this.A04);
    }

    @Override // com.facebook.ads.redexgen.X.LL
    public final void AIk(long j) {
        this.A02 = j;
        this.A00 = 0;
        this.A01 = 0L;
    }
}
