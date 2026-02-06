package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;

@MetaExoPlayerCustomization
/* loaded from: assets/audience_network/classes2.dex */
public enum MN {
    A05,
    A04,
    A06,
    A03;
    
    public static byte[] A00;
    public static String[] A01 = {"YGvusjMOvw", "XxhXqbssDzTPx8cD", "v5f5FK7FNpA1cfN1ohQEtzmA1XlLSzXE", "dOnhpxcme8C8DMHJdbJ1zsQXlaw", "o8NFvW23E6YML82dyv2qOnj4D0AhAt32", "sFvB7Juf2T", "FilLqBnJ3Dc1fTgDAzXDzQr78D6tohNx", "1sAmBYm9v"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            String[] strArr = A01;
            if (strArr[7].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A01[1] = "k0Ctdizy0CSYjdQTYuro";
            copyOfRange[i4] = (byte) ((b - i3) - 102);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{C8077mf.m, C8077mf.r, C8077mf.m, C8077mf.z, C3307Iz.V, C8077mf.y, 7, 9, C8077mf.q, 7, C8077mf.r, C8077mf.z, -27, C2638Cg0.C7, -42, -18, -41, -42, C2638Cg0.n7, -32, C2638Cg0.E7, -37, C2638Cg0.z7, C2638Cg0.A7, C2638Cg0.z7, -35, -52, -47, -10, -17, -20, -17, -16, -8, -17};
    }

    static {
        A01();
    }
}
