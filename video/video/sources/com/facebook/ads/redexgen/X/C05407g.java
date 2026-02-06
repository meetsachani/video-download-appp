package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C3307Iz;
import o.C8077mf;
import o.ED2;

/* renamed from: com.facebook.ads.redexgen.X.7g  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05407g extends AbstractC1810j0 {
    public static byte[] A00;
    public static String[] A01 = {"5V5lzA70kRKZvNcqBnXwT00Z041t6ONl", "kRuh8LYE7MIIox", "vbi5lrus1TtIcXopJBSqGum5Kl452Sg0", "JcNQ6WafPgnmx1aBDePIhrwzaceROyrU", "60x4BO5hhvvMWgz", "65jgyaanPJJ2TdYJaJc79ygQBnrUrWFq", "zOX7nuTxFizV3LeqTcyyEc2wd", "PvIxiwPRiyIOar7lINjn4bFuW"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{42, 47, 107, 34, 56, 107, C3307Iz.X, 36, ED2.a, 107, 57, C3307Iz.f0, 42, 47, 50, 107, 36, 57, 107, 42, C3307Iz.Z, 57, C3307Iz.f0, 42, 47, 50, 107, 47, 34, 56, 59, C3307Iz.Z, 42, 50, C3307Iz.f0, 47, C8077mf.x, C8077mf.y, 28, 17, 9};
    }

    static {
        A03();
    }

    public C05407g(C1673gi c1673gi, O7 o7) {
        super(c1673gi, o7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(A00(36, 5, 12), String.valueOf(System.currentTimeMillis() - j));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(List<String> trackingUrls, Map<String, String> extraData) {
        if (trackingUrls != null) {
            boolean isEmpty = trackingUrls.isEmpty();
            if (A01[3].charAt(25) != 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[6] = "86KHDrV9NKgfIZAVdUdv4tP2w";
            strArr[7] = "hnWt117Y9rLxZfnYOmFuZ36IL";
            if (isEmpty) {
                return;
            }
            for (String str : trackingUrls) {
                new AsyncTaskC1644gF(this.A0B, extraData).execute(str);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1810j0
    public final void A0P() {
        C1864ju c1864ju = (C1864ju) this.A01;
        if (c1864ju.A0R()) {
            N2 n2 = this.A07;
            if (A01[3].charAt(25) != 'c') {
                throw new RuntimeException();
            }
            A01[4] = "SmlVqZ";
            if (n2 != null) {
                this.A07.A0B(c1864ju);
                return;
            }
            return;
        }
        throw new IllegalStateException(A00(0, 36, 55));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1810j0
    public final void A0R(N1 n1, C1104Tw c1104Tw, C1102Tu c1102Tu, O8 o8) {
        C1864ju c1864ju = (C1864ju) n1;
        long currentTimeMillis = System.currentTimeMillis();
        C1807ix c1807ix = new C1807ix(this, o8, c1864ju, currentTimeMillis, c1102Tu);
        A0H().postDelayed(c1807ix, c1104Tw.A05().A05());
        c1864ju.A0L(this.A0B, new C1806iw(this, c1807ix, currentTimeMillis, c1102Tu), this.A09, o8, UK.A0K());
    }
}
