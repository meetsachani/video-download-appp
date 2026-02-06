package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.jk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1854jk extends N3 {
    public static byte[] A02;
    @Nullable
    public final C1852ji A00;
    public final VA A01;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 26);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{70, 69, 74, 74, 65, 86};
    }

    public C1854jk(C1673gi c1673gi, N4 n4, C1618fp c1618fp, VA va, C1852ji c1852ji) {
        super(c1673gi, n4, c1618fp);
        this.A01 = va;
        this.A00 = c1852ji;
    }

    @Override // com.facebook.ads.redexgen.X.N3
    public final void A08(Map<String, String> map) {
        if (this.A00 != null && !TextUtils.isEmpty(this.A00.A7O())) {
            this.A02.A0F().A3L();
            AbstractC0957Oa.A02(this.A00.A0a(), AbstractC1193Xm.A00(A01(0, 6, 62)));
            this.A01.ABJ(this.A00.A7O(), map);
            if (C1123Up.A1A(this.A02)) {
                String adPlacementType = AdPlacementType.MEDIUM_RECTANGLE.toString();
                C1169Wl A00 = C1169Wl.A00(this.A02);
                String placementType = this.A00.A7O();
                A00.A0E(adPlacementType, placementType);
            }
        }
    }
}
