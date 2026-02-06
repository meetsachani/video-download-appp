package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;
import o.ED2;

/* renamed from: com.facebook.ads.redexgen.X.kE  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1884kE extends AbstractC0925Mt {
    public static byte[] A01;
    public static final String A02;
    public final Uri A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{C8077mf.r, C3307Iz.c0, 51, 54, 47, C3307Iz.f0, -22, 62, 57, -22, 57, 58, 47, 56, -22, 54, 51, 56, 53, -22, ED2.a, 60, 54, 4, -22};
    }

    static {
        A01();
        A02 = C1884kE.class.getSimpleName();
    }

    public C1884kE(C1673gi c1673gi, VA va, String str, Uri uri) {
        super(c1673gi, va, str);
        this.A00 = uri;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0925Mt
    public final EnumC0922Mq A0G(String str) {
        try {
            X6.A0E(new X6(), this.A01, this.A00, this.A03);
        } catch (Exception unused) {
            String str2 = A00(0, 25, 104) + this.A00.toString();
        }
        return EnumC0922Mq.A09;
    }
}
