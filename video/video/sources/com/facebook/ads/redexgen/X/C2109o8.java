package com.facebook.ads.redexgen.X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Arrays;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.o8  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2109o8 implements BY {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 11);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{13, C8077mf.E, C8077mf.G, C8077mf.m, C8077mf.n, C8077mf.E, 83, C8077mf.p, C8077mf.u, 31, 7, 28, 31, C8077mf.G, C8077mf.y, 10, C8077mf.y, C8077mf.B, C8077mf.C, 19, 83, C8077mf.G, 10, 31};
    }

    public C2109o8() {
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final int A7P() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final MediaCodecInfo A7Q(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final boolean AAR(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final boolean AAS(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return A00(0, 15, 117).equals(str) && A00(15, 9, 119).equals(str2);
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final boolean AJ4() {
        return false;
    }
}
