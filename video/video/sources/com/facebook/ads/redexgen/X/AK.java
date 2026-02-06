package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import o.C3307Iz;
import o.C8077mf;
import o.QC1;

@MetaExoPlayerCustomization("non-final in Fb vs final in Exo since TigonDataSource uses FailoverStreamDryException that extends this exception")
/* loaded from: assets/audience_network/classes2.dex */
public class AK extends C2168p5 {
    public static byte[] A04;
    public final int A00;
    public final String A01;
    public final Map<String, List<String>> A02;
    public final byte[] A03;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 101);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{C8077mf.r, C3307Iz.Z, 49, 50, C3307Iz.e0, C3307Iz.d0, 49, C3307Iz.Z, 98, C3307Iz.V, C3307Iz.e0, C3307Iz.Y, C3307Iz.Z, QC1.w, 98};
    }

    public AK(int i, String str, IOException iOException, Map<String, List<String>> map, C04905i c04905i, byte[] bArr) {
        super(A01(0, 15, 39) + i, iOException, c04905i, 2004, 1);
        this.A00 = i;
        this.A01 = str;
        this.A02 = map;
        this.A03 = bArr;
    }
}
