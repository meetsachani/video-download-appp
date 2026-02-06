package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;
import o.QC1;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.nJ  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2059nJ {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 87);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{96, 35, C3307Iz.V, C3307Iz.f0, C3307Iz.f0, 47, 52, 96, 34, C3307Iz.X, 96, C3307Iz.f0, C3307Iz.X, C3307Iz.Z, C3307Iz.V, 52, C3307Iz.a0, 54, C3307Iz.X, 96, 34, 53, 52, 96, 55, C3307Iz.V, 51, 122, 96, C3307Iz.c0, QC1.w, 99, 122, 122, 0, 1, 78, 13, C8077mf.q, 2, 2, C8077mf.G, 78, C8077mf.D, 1, 78, 0, C8077mf.m, C8077mf.z, C8077mf.D, 70, 71, 78, C8077mf.G, 7, 0, 13, C8077mf.m, 78, C8077mf.D, 6, C8077mf.m, 78, 2, C8077mf.q, C8077mf.G, C8077mf.D, 78, 13, C8077mf.q, 2, 2, 78, C8077mf.D, 1, 78, 28, C8077mf.m, 3, 1, C8077mf.B, C8077mf.m, 70, 71, 10, 17, 8, 8, 68, C8077mf.q, 1, C8077mf.G, 68, 13, 10, 68, 1, 10, C8077mf.r, C8077mf.z, C8077mf.G, 94, 68, 10, 17, 8, 8, 89, 31, 4, C8077mf.G, C8077mf.G, 81, 7, C8077mf.r, C8077mf.G, 4, C8077mf.x, 81, C8077mf.B, 31, 81, C8077mf.x, 31, 5, 3, 8, 75, 81};
    }

    public static int A00(int value, String name) {
        if (value >= 0) {
            return value;
        }
        throw new IllegalArgumentException(name + A01(0, 29, 23) + value);
    }

    public static void A03(Object key, Object value) {
        if (key != null) {
            if (value != null) {
                return;
            }
            throw new NullPointerException(A01(108, 21, 38) + key + A01(29, 5, 65));
        }
        throw new NullPointerException(A01(84, 24, 51) + value);
    }

    public static void A04(boolean canRemove) {
        AbstractC1912ki.A0F(canRemove, A01(34, 50, 57));
    }
}
