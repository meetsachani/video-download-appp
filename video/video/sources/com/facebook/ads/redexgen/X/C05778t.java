package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.8t */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05778t extends Exception {
    public static byte[] A03;
    public final int A00;
    public final C2242qI A01;
    public final boolean A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 65);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{60, Byte.MAX_VALUE, 119, C3307Iz.e0, 58, 60, 48, C3307Iz.a0, 58, C3307Iz.e0, 62, C4715Xk.i, 51, 58, 118, 123, 126, 114, 60, C3307Iz.Z, ED2.a, C8077mf.G, 52, 19, C3307Iz.Z, 54, 59, C4715Xk.i, 6, 32, 51, 49, 57, 19, 62, 62, C4715Xk.i, 49, 51, C3307Iz.Y, 55, 54, 111, 42, C3307Iz.Y, 86, 98, 115, 126, QC1.w, 67, 101, 118, 116, 124, 55, 126, 121, 126, 99, 55, 113, 118, 126, 123, 114, 115, 55, C3307Iz.d0, 0, 1, 9, 6, 8, 71};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @MetaExoPlayerCustomization(type = {"NEW_CLASS"}, value = "D23918943: Monitor the audio track usage")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C05778t(int i, int i2, int i3, int i4, C2242qI c2242qI, boolean z, Exception exc, int i5) {
        super(r4.append(r1).append(i3).append(r1).append(i4).append(A00(15, 28, 19)).append(i5).append(r3).append(c2242qI).append(z ? A00(1, 14, 30) : A00(0, 0, 74)).toString(), exc);
        StringBuilder append = new StringBuilder().append(A00(45, 23, 86)).append(i);
        String A00 = A00(0, 1, 93);
        StringBuilder append2 = append.append(A00).append(A00(68, 7, 46)).append(i2);
        String A002 = A00(43, 2, 71);
        this.A00 = i;
        this.A02 = z;
        this.A01 = c2242qI;
    }
}
