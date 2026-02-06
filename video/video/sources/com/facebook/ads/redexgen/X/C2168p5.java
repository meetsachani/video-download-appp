package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import o.AD1;
import o.C2638Cg0;

/* renamed from: com.facebook.ads.redexgen.X.p5 */
/* loaded from: assets/audience_network/classes2.dex */
public class C2168p5 extends C04835b {
    public static byte[] A02;
    public final int A00;
    public final C04905i A01;

    static {
        A06();
    }

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 56);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A02 = new byte[]{C2638Cg0.E7, -30, -37, -41, -24, -22, -37, -18, -22, -92, -96, -28, -27, -22, -106, -26, -37, -24, -29, -33, -22, -22, -37, C2638Cg0.B7, -92, -96};
    }

    public C2168p5(C04905i c04905i, int i, int i2) {
        super(A03(i, i2));
        this.A01 = c04905i;
        this.A00 = i2;
    }

    public C2168p5(IOException iOException, C04905i c04905i, int i, int i2) {
        super(iOException, A03(i, i2));
        this.A01 = c04905i;
        this.A00 = i2;
    }

    public C2168p5(String str, C04905i c04905i, int i, int i2) {
        super(str, A03(i, i2));
        this.A01 = c04905i;
        this.A00 = i2;
    }

    public C2168p5(String str, IOException iOException, C04905i c04905i, int i, int i2) {
        super(str, iOException, A03(i, i2));
        this.A01 = c04905i;
        this.A00 = i2;
    }

    public static int A03(int i, int i2) {
        if (i == 2000 && i2 == 1) {
            return 2001;
        }
        return i;
    }

    public static C2168p5 A04(IOException iOException, C04905i c04905i, int i) {
        int errorCode;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            errorCode = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            errorCode = 1004;
        } else {
            if (message != null) {
                String A01 = AbstractC1877k7.A01(message);
                String message2 = A05(0, 26, 62);
                if (A01.matches(message2)) {
                    errorCode = AD1.j1;
                }
            }
            errorCode = 2001;
        }
        if (errorCode == 2007) {
            return new AM(iOException, c04905i);
        }
        return new C2168p5(iOException, c04905i, errorCode, i);
    }
}
