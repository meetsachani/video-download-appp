package com.facebook.ads.redexgen.X;

import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class HB {
    public static String[] A00 = {"", "JBqvX3ouZOOCqox6TCkHsUUnq79xKaTL", "x", "BIUpfUNI3eVa3mY8ect95XlwPu2Ofuw", "eTPSYv4hujFcnfJKGeeHsnhQxUvQ5rkD", "uOymuGwhHDkcqDuJ17", "MFseKYUy643KM5DvrPXxmzbMJL0nMbh3", "ti0zz4"};

    public static int A00(InterfaceC2033ms interfaceC2033ms, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int totalBytesPeeked = i2 - i3;
            int AGs = interfaceC2033ms.AGs(bArr, i + i3, totalBytesPeeked);
            String[] strArr = A00;
            String str = strArr[1];
            String str2 = strArr[4];
            int charAt = str.charAt(19);
            int totalBytesPeeked2 = str2.charAt(19);
            if (charAt != totalBytesPeeked2) {
                throw new RuntimeException();
            }
            A00[6] = "xnIrdLQGczxEK23FHKuSo6llrjoojLCP";
            if (AGs == -1) {
                break;
            }
            i3 += AGs;
        }
        return i3;
    }

    @Pure
    public static void A01(boolean z, String str) throws C3K {
        if (z) {
            return;
        }
        throw C3K.A01(str, null);
    }

    public static boolean A02(InterfaceC2033ms interfaceC2033ms, int i) throws IOException {
        try {
            interfaceC2033ms.AK3(i);
            if (A00[0].length() != 0) {
                throw new RuntimeException();
            }
            A00[3] = "SfDhdqvr0QmEID8ZIpBFjoMfbavps9";
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean A03(InterfaceC2033ms interfaceC2033ms, byte[] bArr, int i, int i2) throws IOException {
        try {
            interfaceC2033ms.readFully(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            if (A00[0].length() != 0) {
                throw new RuntimeException();
            }
            A00[6] = "fFP2kzBTuIshDEJva9vOOxjFjEDNGXev";
            return false;
        }
    }

    public static boolean A04(InterfaceC2033ms interfaceC2033ms, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return interfaceC2033ms.AGu(bArr, i, i2, z);
        } catch (EOFException e) {
            if (z) {
                if (A00[3].length() != 20) {
                    String[] strArr = A00;
                    strArr[7] = "24rmiB";
                    strArr[5] = "kHyj46IkHv9Sbvkaop";
                    return false;
                }
                throw new RuntimeException();
            }
            throw e;
        }
    }
}
