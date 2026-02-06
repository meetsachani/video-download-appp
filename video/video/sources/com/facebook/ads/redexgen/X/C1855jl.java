package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;
import o.C2638Cg0;

/* renamed from: com.facebook.ads.redexgen.X.jl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1855jl extends N3 {
    public static byte[] A06;
    public static final String A07;
    public C1857jn A00;
    public EnumC1147Vp A01;
    public boolean A02;
    public final C1673gi A03;
    public final VA A04;
    public final AbstractC1319ay A05;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{C2638Cg0.v7, -56, -43, -43, -52, C2638Cg0.E7};
    }

    static {
        A05();
        A07 = C1855jl.class.getSimpleName();
    }

    public C1855jl(C1673gi c1673gi, VA va, AbstractC1319ay abstractC1319ay, C1618fp c1618fp, N4 n4, EnumC1147Vp enumC1147Vp) {
        super(c1673gi, n4, c1618fp);
        this.A04 = va;
        this.A05 = abstractC1319ay;
        this.A03 = c1673gi;
        this.A01 = enumC1147Vp;
    }

    @Override // com.facebook.ads.redexgen.X.N3
    public final void A08(Map<String, String> map) {
        String adPlacementType;
        if (this.A00 != null && !TextUtils.isEmpty(this.A00.A7O())) {
            this.A03.A0F().A3L();
            AbstractC0957Oa.A02(this.A00.A05(), AbstractC1193Xm.A00(A04(0, 6, 50)));
            this.A04.ABJ(this.A00.A7O(), map);
            if (C1123Up.A1A(this.A03)) {
                if (this.A01 == EnumC1147Vp.A09) {
                    adPlacementType = AdPlacementType.MEDIUM_RECTANGLE.toString();
                } else {
                    adPlacementType = AdPlacementType.BANNER.toString();
                }
                C1169Wl A00 = C1169Wl.A00(this.A03);
                String placementType = this.A00.A7O();
                A00.A0E(adPlacementType, placementType);
            }
        }
    }

    public final synchronized void A09() {
        if (!this.A02 && this.A00 != null) {
            this.A02 = true;
            if (!TextUtils.isEmpty(this.A00.A03())) {
                Y4.A00(new C1856jm(this));
            }
        }
    }

    public final void A0A(C1857jn c1857jn) {
        this.A00 = c1857jn;
    }
}
