package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;
import o.ED2;

/* renamed from: com.facebook.ads.redexgen.X.bp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1372bp implements TO {
    public static byte[] A00;
    public static String[] A01 = {"N9cBQFuEXnMHuOhuUHmrN1NbOn9dUH6l", "t4327HI34dmOHxHgJ5Xqb1TMdgfhViRu", "W9WF83HwW2JJuxhyMa", "tDcIRbsxuTPzi4rfI85ylCxCUvgLsm3F", "qO4Uq7mg6XVWSCx2fb2lLTULAXcH9HmN", "DdhWBjv", "pI4BrYZb6jEfbOR6K30piOXwM4lgsdMH", "sO2hGyIlN5zgciGhFXZ1rYz4NH0oO9ru"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 113);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-70, -73, C2638Cg0.w7, -73, -43, C2638Cg0.t7, -56, C2638Cg0.s7, -71, -69, C2638Cg0.v7, C2638Cg0.v7, -65, -60, -67, -43, C2638Cg0.s7, C2638Cg0.t7, C2638Cg0.w7, -65, C2638Cg0.s7, -60, C2638Cg0.v7, -43, -71, C2638Cg0.s7, C2638Cg0.x7, -60, C2638Cg0.w7, -56, C2638Cg0.A7, -43, C2638Cg0.p7, -69, C2638Cg0.A7, 48, C3307Iz.e0, 64, C3307Iz.e0, 75, 60, 62, 59, 47, 49, ED2.a, ED2.a, 53, 58, 51, 75, 59, 60, 64, 53, 59, 58, ED2.a, 75, 55, 49, 69, 5, 2, C8077mf.y, 2, 32, 17, 19, C8077mf.r, 4, 6, C8077mf.x, C8077mf.x, 10, C8077mf.q, 8, 32, C8077mf.r, 17, C8077mf.y, 10, C8077mf.r, C8077mf.q, C8077mf.x, 32, C8077mf.x, C8077mf.y, 2, C8077mf.y, 6, 32, C8077mf.n, 6, C8077mf.D};
        String[] strArr = A01;
        if (strArr[6].charAt(20) == strArr[0].charAt(20)) {
            throw new RuntimeException();
        }
        A01[2] = "00h";
        A00 = bArr;
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.X.TO
    public final void ACV(TN tn) {
        String[] stringArray;
        Integer integer;
        Integer integer2;
        if (!AdInternalSettings.sDataProcessingOptionsUpdate.getAndSet(false)) {
            return;
        }
        synchronized (AdInternalSettings.sSettingsBundle) {
            stringArray = AdInternalSettings.sSettingsBundle.getStringArray(A00(35, 27, 123));
            integer = AdInternalSettings.sSettingsBundle.getInteger(A00(0, 35, 5));
            integer2 = AdInternalSettings.sSettingsBundle.getInteger(A00(62, 33, 80));
        }
        tn.AFu(stringArray, integer, integer2);
    }
}
