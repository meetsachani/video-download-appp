package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C2638Cg0;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.0L  reason: invalid class name */
/* loaded from: assets/audience_network/classes.dex */
public enum C0L {
    A0A,
    A08,
    A09,
    A07,
    A06,
    A04,
    A05,
    A0C,
    A03,
    A0B;
    
    public static byte[] A00;
    public static String[] A01 = {"CVksIG7y5BZQVcPhoXamOy9v2pD0potd", "Xn6utKyfTNVYc3eCIjnAGVNgvwBrE9Xf", "dHqsi4PTCBZc2EyjG9w0STzAzmdR9j4J", "IFMI3gZMa5xtRiC2", "EBxYrp08wkX", "KMJAc0xioojEycQ5bmQYCOSaUa0Lhe5Y", "gtisrmhgHuf94BeFMIL9gXdPHLnGvZTr", "pR6nardY27E"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[1].charAt(25) == strArr[0].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "ql9lB5mRouY";
            strArr2[7] = "rRoQq0JVJfg";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 62);
            i4++;
        }
    }

    public static void A01() {
        A00 = new byte[]{-13, -2, -2, -77, C2638Cg0.o7, C2638Cg0.o7, -67, -74, -78, -65, -52, -47, C2638Cg0.w7, -37, -29, -18, -12, C2638Cg0.C7, -21, -28, -69, C2638Cg0.p7, -60, -74, C2638Cg0.v7, -76, -71, -65, -33, -30, C2638Cg0.C7, C2638Cg0.B7, 9, C8077mf.r, 7, 7, -98, -96, -105, -101, -105, -94, -105, -92, -109, -100, -99, -101, -110, -105, -112};
    }

    static {
        A01();
    }
}
