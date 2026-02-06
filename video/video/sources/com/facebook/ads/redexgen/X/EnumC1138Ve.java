package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import javax.annotation.Nullable;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.Ve  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1138Ve {
    A06(-1, 100, 1, 0),
    A07(-1, 120, 2, 1),
    A08(-1, 300, 3, 2),
    A09(-1, 400, 4, 3),
    A0A(-1, 50, 5, 4),
    A0B(-1, -1, 6, 5);
    
    public static byte[] A04;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 77);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{C8077mf.r, C8077mf.G, 17, 31, C8077mf.r, C8077mf.n, 7, 105, 104, 104, 95, 82, 94, 80, 95, 67, 72, C3307Iz.Y, C3307Iz.X, C3307Iz.Z, 91, 86, 90, 84, 91, 71, 76, 32, 35, 35, 115, 126, 114, 124, 115, 111, 100, C8077mf.q, C8077mf.m, C8077mf.m, 91, 86, 90, 84, 91, 71, 76, C3307Iz.Y, 35, 82, 69, 67, 84, 95, 68, 89, 78, 65, 77, 73, 67};
    }

    static {
        A02();
    }

    EnumC1138Ve(int i, int i2, int i3, int i4) {
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }

    @Nullable
    public static EnumC1138Ve A00(int i) {
        EnumC1138Ve[] values;
        for (EnumC1138Ve enumC1138Ve : values()) {
            if (enumC1138Ve.A00 == i) {
                return enumC1138Ve;
            }
        }
        return null;
    }

    public final int A04() {
        return this.A01;
    }

    public final int A05() {
        return this.A02;
    }

    public final int A06() {
        return this.A03;
    }
}
