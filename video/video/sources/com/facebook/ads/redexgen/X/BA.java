package com.facebook.ads.redexgen.X;

import android.media.MediaCodec;
import java.util.Arrays;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;

/* loaded from: assets/audience_network/classes2.dex */
public class BA extends Exception {
    public static byte[] A05;
    public final B3 A00;
    public final BA A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    static {
        A05();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 113);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{0, C8077mf.n, 49, C8077mf.r, C8077mf.z, C8077mf.D, 17, C8077mf.r, 7, 85, 28, C8077mf.E, 28, 1, 85, 19, C8077mf.x, 28, C8077mf.C, C8077mf.r, 17, 79, 85, 101, 68, 66, 78, 69, 68, 83, 1, 72, 79, 72, 85, 1, 71, 64, 72, 77, 68, 69, C8077mf.E, 1, 122, ED2.a, 78, 66, C8077mf.G, 17, 19, 80, C8077mf.B, 31, C8077mf.G, C8077mf.E, 28, 17, 17, C8077mf.y, 80, 31, C8077mf.D, 13, 80, 31, C8077mf.r, C8077mf.D, C8077mf.n, 17, C8077mf.A, C8077mf.D, 6, 80, 19, C8077mf.E, C8077mf.D, C8077mf.A, 31, 77, 80, C8077mf.E, 6, 17, C8077mf.p, C8077mf.u, 31, 7, C8077mf.E, C8077mf.n, 80, 19, C8077mf.E, C8077mf.D, C8077mf.A, 31, C8077mf.G, 17, C8077mf.D, C8077mf.E, C8077mf.G, 80, 51, C8077mf.E, C8077mf.D, C8077mf.A, 31, C4715Xk.i, 17, C8077mf.D, C8077mf.E, C8077mf.G, C3307Iz.d0, C8077mf.E, C8077mf.r, C8077mf.D, C8077mf.E, C8077mf.n, C8077mf.E, C8077mf.n, C3307Iz.V, 36, 47, C3307Iz.e0, C8077mf.y};
    }

    public BA(C2242qI c2242qI, Throwable th, boolean z, int i) {
        this(A03(23, 22, 80) + i + A03(45, 3, 19) + c2242qI, th, c2242qI.A0W, z, null, A02(i), null);
    }

    public BA(C2242qI c2242qI, Throwable th, boolean z, B3 b3) {
        this(A03(2, 21, 4) + b3.A03 + A03(0, 2, 93) + c2242qI, th, c2242qI.A0W, z, b3, C5C.A02 >= 21 ? A04(th) : null, null);
    }

    public BA(String str, Throwable th, String str2, boolean z, B3 b3, String str3, BA ba) {
        super(str, th);
        this.A03 = str2;
        this.A04 = z;
        this.A00 = b3;
        this.A02 = str3;
        this.A01 = ba;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BA A00(BA ba) {
        return new BA(getMessage(), getCause(), this.A03, this.A04, this.A00, this.A02, ba);
    }

    public static String A02(int i) {
        String A03 = i < 0 ? A03(121, 4, 59) : A03(0, 0, 98);
        StringBuilder sb = new StringBuilder();
        String sign = A03(48, 73, 15);
        return sb.append(sign).append(A03).append(Math.abs(i)).toString();
    }

    public static String A04(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
