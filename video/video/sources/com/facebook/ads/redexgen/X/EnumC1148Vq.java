package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import o.C2638Cg0;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.Vq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1148Vq {
    A08(0),
    A0G(4),
    A0E(5),
    A0F(6),
    A0D(7),
    A0J(100),
    A0H(101),
    A0K(102),
    A0I(103),
    A06(200),
    A05(500),
    A0A(800),
    A09(801),
    A0B(802),
    A0C(803),
    A04(201),
    A07(400);
    
    public static byte[] A01;
    public static String[] A02 = {"xoorjXA1", "8Kzlxbd9kJAGgJ5s8zqJUL1qe9AHIUIK", "QN8uUwufS", "PR18pZpjozcSIXZf4lT3cJvr", "JMDwiJH22MlTXTQl0rguW6wocaX22ztq", "QzXzl66JDgXK1aMRt97r55ZmRT3IeIsK", "DoSMlBJtaYqhAaTANnzLFPIy6BzbSWA6", "RbI1uUei9L7jeefFAATAgb7svM9foe7U"};
    public final int A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 72);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-18, C2638Cg0.C7, -12, -23, -10, -27, -1, -46, -43, -48, -36, C2638Cg0.A7, -30, -41, -28, -45, -19, -48, C2638Cg0.A7, -36, -36, -45, -32, C2638Cg0.B7, C2638Cg0.y7, -32, -43, -30, -47, -21, C2638Cg0.C7, C2638Cg0.B7, -41, C2638Cg0.B7, -37, -29, C2638Cg0.B7, C2638Cg0.u7, -70, -52, -74, C2638Cg0.u7, -71, -70, -71, -44, C2638Cg0.x7, -66, -71, -70, -60, -82, -89, -92, -89, -88, -80, -89, -89, -93, -80, -97, -110, -91, -102, -89, -106, -80, -99, -110, -97, -107, -92, -108, -110, -95, -106, -80, -126, -121, -80, -118, -75, -79, -66, -83, -96, -77, -88, -75, -92, -66, -81, -82, -79, -77, -79, -96, -88, -77, -66, -104, -66, -112, -107, 9, 5, C8077mf.u, 1, -12, 7, -4, 9, -8, C8077mf.u, 6, 4, 8, -12, 5, -8, C8077mf.u, -28, C8077mf.u, -28, C2638Cg0.t7, C2638Cg0.q7, C2638Cg0.A7, C2638Cg0.q7, -75, C2638Cg0.u7, -79, C2638Cg0.q7, -76, -75, -76, C2638Cg0.A7, C2638Cg0.t7, -71, -76, -75, -65, -6, -24, -27, -7, -20, -24, -6, 2, -27, -28, -15, -15, -24, -11, 2, -43, C2638Cg0.n7, -45, -26, -44, -47, -27, C2638Cg0.n7, -44, -26, -18, -47, -48, -35, -35, -44, C2638Cg0.C7, -18, -60, -65, -16, -34, -37, -17, -30, -34, -16, -8, -37, C2638Cg0.B7, -25, -25, -34, -21, -8, -46, C2638Cg0.v7, -24, -42, -45, -25, C2638Cg0.B7, -42, -24, -16, -45, -46, -33, -33, -42, -29, -16, -35, -42, C2638Cg0.n7, -46, -44, -22, -89, -107, -110, -90, -103, -107, -89, -81, -103, -98, -92, -107, -94, -93, -92, -103, -92, -103, -111, -100, -81, -104, -97, -94, -103, -86, -97, -98, -92, -111, -100, -85, -103, -106, -86, -99, -103, -85, -77, -99, -94, -88, -103, -90, -89, -88, -99, -88, -99, -107, -96, -77, -88, -107, -106, -96, -103, -88, -29, -47, C2638Cg0.z7, -30, -43, -47, -29, -21, -43, C2638Cg0.B7, -32, -47, -34, -33, -32, -43, -32, -43, C2638Cg0.y7, C2638Cg0.n7, -21, C2638Cg0.C7, C2638Cg0.B7, -41, C2638Cg0.B7, -37, -29, C2638Cg0.B7, -9, -27, -30, -10, -23, -27, -9, -1, -23, -18, -12, -27, -14, -13, -12, -23, -12, -23, C2638Cg0.C7, -20, -1, -10, -27, -14, -12, -23, -29, C2638Cg0.C7, -20};
    }

    static {
        A02();
    }

    EnumC1148Vq(int i) {
        this.A00 = i;
    }

    public static EnumC1148Vq A00(int i) {
        EnumC1148Vq[] values;
        for (EnumC1148Vq enumC1148Vq : values()) {
            if (enumC1148Vq.A00 == i) {
                return enumC1148Vq;
            }
        }
        return null;
    }

    public final int A04() {
        return this.A00;
    }

    public final AdPlacementType A05(T8 t8) {
        switch (ordinal()) {
            case 1:
            case 2:
            case 3:
                return AdPlacementType.BANNER;
            case 4:
                if (C1123Up.A1A(t8)) {
                    return AdPlacementType.MEDIUM_RECTANGLE;
                }
                return AdPlacementType.BANNER;
            case 5:
            case 6:
            case 7:
            case 8:
                AdPlacementType adPlacementType = AdPlacementType.INTERSTITIAL;
                String[] strArr = A02;
                if (strArr[2].length() != strArr[0].length()) {
                    A02[3] = "8GdGsJFXCQChVnySau0Thhv7";
                    return adPlacementType;
                }
                throw new RuntimeException();
            case 9:
            case 11:
            case 12:
            case 13:
                return AdPlacementType.NATIVE;
            case 10:
            case 15:
            default:
                return AdPlacementType.UNKNOWN;
            case 14:
            case 16:
                return AdPlacementType.REWARDED_VIDEO;
        }
    }
}
