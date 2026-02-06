package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;
import o.C3307Iz;

/* renamed from: com.facebook.ads.redexgen.X.85  reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass85 extends AbstractC1886kH {
    public static byte[] A02;
    public Map<String, String> A00;
    public final Uri A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 77);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{36, C3307Iz.V, C3307Iz.Y, 35};
    }

    public AnonymousClass85(C1673gi c1673gi, VA va, String str, Uri uri, Map<String, String> mExtraData) {
        super(c1673gi, va, str, null, true, true);
        this.A01 = uri;
        this.A00 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1886kH
    public final EnumC0922Mq A0H() {
        A0J(this.A00, null);
        return EnumC0922Mq.A09;
    }

    public final Uri A0M() {
        String uri = this.A01.getQueryParameter(A00(0, 4, 5));
        if (uri == null) {
            uri = A00(0, 0, 121);
        }
        return XB.A00(uri);
    }
}
