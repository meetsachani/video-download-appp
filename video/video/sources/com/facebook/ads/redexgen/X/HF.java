package com.facebook.ads.redexgen.X;

import java.io.IOException;
import o.C3062Gl1;
import o.CK1;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class HF {
    public static String[] A00 = {"o6dy0jxWVFoVpdfIHLQ5kJFOMlq1Sn1Q", "79oj", "9g10QGOLUMPWkkbPiEKlPZ6GdmncXBXa", "6fmIgIVXmOYY3cUB7ZYAXnWSgE20TitB", "v6a7Yb3DANDL70kkwlzLnkI1heNzynkm", "eDdjZQkAYxVEYJ3d9Q78IvgSo191T7ve", "sHmXnPOOobIrXpWrquJBTDw1maWJKk3u", "k0vF7vRBeJQaOBXZ"};

    public static int A00(C04774v c04774v, int i) {
        switch (i) {
            case 1:
                return CK1.x;
            case 2:
            case 3:
            case 4:
            case 5:
                return C3062Gl1.m << (i - 2);
            case 6:
                return c04774v.A0I() + 1;
            case 7:
                int A0M = c04774v.A0M();
                String[] strArr = A00;
                if (strArr[6].charAt(23) != strArr[4].charAt(23)) {
                    throw new RuntimeException();
                }
                A00[7] = "hcXiJWofr5Txci555yuma5X";
                return A0M + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static long A01(InterfaceC2033ms interfaceC2033ms, HJ hj) throws IOException {
        interfaceC2033ms.AIl();
        boolean z = true;
        interfaceC2033ms.A47(1);
        byte[] bArr = new byte[1];
        interfaceC2033ms.AGt(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z = false;
        }
        interfaceC2033ms.A47(2);
        int i = z ? 7 : 6;
        C04774v c04774v = new C04774v(i);
        c04774v.A0e(HB.A00(interfaceC2033ms, c04774v.A0l(), 0, i));
        interfaceC2033ms.AIl();
        HE he = new HE();
        boolean isBlockSizeVariable = A08(c04774v, hj, z, he);
        if (isBlockSizeVariable) {
            return he.A00;
        }
        throw C3K.A01(null, null);
    }

    public static boolean A02(int i, HJ hj) {
        if (i == 0) {
            return true;
        }
        int i2 = hj.A01;
        if (A00[7].length() != 8) {
            A00[0] = "dnyA5Em4Vekc9hKZNMMqKWCBR5ivXppC";
            return i == i2;
        }
        throw new RuntimeException();
    }

    public static boolean A03(int i, HJ hj) {
        if (i <= 7) {
            return i == hj.A02 - 1;
        } else if (A00[3].charAt(10) != 'Y') {
            throw new RuntimeException();
        } else {
            A00[3] = "e0AkGTV6jhYRPjlSs9AVJSXBXenCNngQ";
            return i <= 10 && hj.A02 == 2;
        }
    }

    public static boolean A04(C04774v c04774v, int i) {
        int A0I = c04774v.A0I();
        int crc = c04774v.A09();
        return A0I == C5C.A0J(c04774v.A0l(), i, crc + (-1), 0);
    }

    public static boolean A05(C04774v c04774v, HJ hj, int i) {
        int A002 = A00(c04774v, i);
        if (A002 != -1) {
            int blockSizeSamples = hj.A03;
            if (A002 <= blockSizeSamples) {
                return true;
            }
        }
        return false;
    }

    public static boolean A06(C04774v c04774v, HJ hj, int i) {
        int sampleRate = hj.A07;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            return i == hj.A08;
        } else if (i == 12) {
            return c04774v.A0I() * 1000 == sampleRate;
        } else if (i <= 14) {
            int expectedSampleRate = c04774v.A0M();
            if (i == 14) {
                expectedSampleRate *= 10;
            }
            return expectedSampleRate == sampleRate;
        } else {
            return false;
        }
    }

    public static boolean A07(C04774v c04774v, HJ hj, int i, HE he) {
        int A09 = c04774v.A09();
        long A0Q = c04774v.A0Q();
        long frameHeaderBytes = A0Q >>> 16;
        if (frameHeaderBytes != i) {
            return false;
        }
        int blockSizeKey = (int) ((A0Q >> 8) & 15);
        long frameHeaderBytes2 = A0Q >> 1;
        int frameStartPosition = (int) (frameHeaderBytes2 & 7);
        return A03((int) ((A0Q >> 4) & 15), hj) && A02(frameStartPosition, hj) && !(((A0Q & 1) > 1L ? 1 : ((A0Q & 1) == 1L ? 0 : -1)) == 0) && A08(c04774v, hj, (((A0Q >>> 16) & 1) > 1L ? 1 : (((A0Q >>> 16) & 1) == 1L ? 0 : -1)) == 0, he) && A05(c04774v, hj, (int) ((A0Q >> 12) & 15)) && A06(c04774v, hj, blockSizeKey) && A04(c04774v, A09);
    }

    public static boolean A08(C04774v c04774v, HJ hj, boolean z, HE he) {
        long utf8Value;
        try {
            long A0S = c04774v.A0S();
            if (z) {
                utf8Value = A0S;
            } else {
                long utf8Value2 = hj.A03;
                utf8Value = utf8Value2 * A0S;
            }
            he.A00 = utf8Value;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean A09(InterfaceC2033ms interfaceC2033ms, HJ hj, int i, HE he) throws IOException {
        long A8i = interfaceC2033ms.A8i();
        byte[] bArr = new byte[2];
        interfaceC2033ms.AGt(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            interfaceC2033ms.AIl();
            interfaceC2033ms.A47((int) (A8i - interfaceC2033ms.A8n()));
            return false;
        }
        C04774v c04774v = new C04774v(16);
        System.arraycopy(bArr, 0, c04774v.A0l(), 0, 2);
        byte[] frameStartBytes = c04774v.A0l();
        c04774v.A0e(HB.A00(interfaceC2033ms, frameStartBytes, 2, 14));
        interfaceC2033ms.AIl();
        interfaceC2033ms.A47((int) (A8i - interfaceC2033ms.A8n()));
        return A07(c04774v, hj, i, he);
    }
}
