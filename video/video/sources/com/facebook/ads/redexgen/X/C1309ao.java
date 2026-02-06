package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.bridge.fbsdk.FBLoginASID;
import com.facebook.ads.internal.bridge.gms.AdvertisingId;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.ao  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1309ao implements TD {
    public static byte[] A01;
    public final T8 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 57);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-20, C8077mf.C, C8077mf.q, C8077mf.G, C8077mf.D, C8077mf.x, C8077mf.q};
    }

    public C1309ao(T8 t8) {
        this.A00 = t8;
    }

    @Override // com.facebook.ads.redexgen.X.TD
    public final String A79() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.TD
    public final String A86() {
        return WI.A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.TD
    public final String A87() {
        return FBLoginASID.getFBLoginASID();
    }

    @Override // com.facebook.ads.redexgen.X.TD
    public final String A8V() {
        return AdInternalSettings.getMediationService();
    }

    @Override // com.facebook.ads.redexgen.X.TD
    public final String A8c() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.TD
    public final TC A8x() {
        AdvertisingId advertisingIdInfoDirectly = AdvertisingId.getAdvertisingIdInfoDirectly(this.A00);
        if (advertisingIdInfoDirectly == null) {
            return null;
        }
        return new C1318ax(this, advertisingIdInfoDirectly);
    }

    @Override // com.facebook.ads.redexgen.X.TD
    public final String A9Q() {
        return AdInternalSettings.getUrlPrefix();
    }

    @Override // com.facebook.ads.redexgen.X.TD
    public final String A9S() {
        return A00(0, 7, 114);
    }

    @Override // com.facebook.ads.redexgen.X.TD
    public final String A9T() {
        return BuildConfigApi.getVersionName(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.TD
    public final boolean AAO() {
        return BuildConfigApi.isDebug();
    }
}
