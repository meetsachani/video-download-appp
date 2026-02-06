package com.facebook.ads.redexgen.X;

import android.content.Context;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeAdsManager;
import com.facebook.ads.internal.api.NativeAdScrollViewApi;
import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;
import o.ED2;

/* loaded from: assets/audience_network/classes2.dex */
public final class S3 implements NativeAdScrollViewApi {
    public static byte[] A07;
    public static String[] A08 = {"nVlKDJKKuSIwTlTd16ukFrbX3MHjOHdA", "", "ICm0nIVybe3UlAuBnNKxRWg2mc3pSWnS", "", "SSXPkfr4Ttu5KI5IplEjDPNbu7CwAkh6", "a5Au6kTC9kTmWkoQnewo7jq8", "NRpBzWywFD0YlyTuhproyOYpEldGp2Hb", "m"};
    public final int A00;
    public final NativeAdScrollView.AdViewProvider A01;
    public final NativeAdView.Type A02;
    public final NativeAdViewAttributes A03;
    public final NativeAdsManager A04;
    public final C1700h9 A05;
    public final C1673gi A06;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        byte[] bArr = {60, 4, 2, 5, 81, 1, 3, C8077mf.H, 7, C8077mf.B, C8077mf.y, C8077mf.x, 81, C8077mf.r, 81, ED2.a, C8077mf.r, 5, C8077mf.B, 7, C8077mf.x, 48, C8077mf.y, C3307Iz.Z, C8077mf.B, C8077mf.x, 6, 95, C3307Iz.X, 8, 1, C8077mf.x, 93, 81, 48, C8077mf.y, C3307Iz.Z, C8077mf.B, C8077mf.x, 6, C3307Iz.V, 3, C8077mf.H, 7, C8077mf.B, C8077mf.y, C8077mf.x, 3, 81, C8077mf.H, 3, 81, C8077mf.r, 81, 31, C8077mf.r, 5, C8077mf.B, 7, C8077mf.x, 48, C8077mf.y, C3307Iz.Z, C8077mf.B, C8077mf.x, 6, 57, C8077mf.x, C8077mf.B, C8077mf.z, C8077mf.C, 5, 53, 1, 52, C8077mf.E, C8077mf.p, 19, C8077mf.n, 31, 59, C8077mf.H, 9, 55, C8077mf.E, C8077mf.x, C8077mf.E, C8077mf.G, 31, 8, 90, C8077mf.x, C8077mf.y, C8077mf.p, 90, C8077mf.z, C8077mf.y, C8077mf.E, C8077mf.H, 31, C8077mf.H};
        String[] strArr = A08;
        if (strArr[6].charAt(14) != strArr[0].charAt(14)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[2] = "Ml52sYoz4FZavAZNhfJ3fi3jnwDnZY4L";
        strArr2[4] = "tWqTcrLKFqppCUd7uCsjOJfAn0Jrdt0w";
        A07 = bArr;
    }

    static {
        A07();
    }

    public S3(NativeAdScrollView nativeAdScrollView, Context context, NativeAdsManager nativeAdsManager, NativeAdScrollView.AdViewProvider adViewProvider, int i, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes, int i2) {
        if (nativeAdsManager.isLoaded()) {
            if (type != null || adViewProvider != null || i > 0) {
                this.A06 = C1046Rp.A03(context);
                this.A04 = nativeAdsManager;
                this.A03 = nativeAdViewAttributes;
                this.A01 = adViewProvider;
                this.A02 = type;
                this.A00 = i2;
                C1701hA c1701hA = new C1701hA(this);
                this.A05 = new C1700h9(context);
                if (this.A02 == null) {
                    if (i > 0) {
                        this.A05.A00(((int) XX.A02) * i);
                    }
                } else {
                    this.A05.A00((int) (XX.A02 * this.A02.getHeight()));
                }
                this.A05.setAdapter(c1701hA);
                setInset(20);
                c1701hA.A09();
                nativeAdScrollView.addView(this.A05);
                return;
            }
            throw new IllegalArgumentException(A06(0, 74, 3));
        }
        throw new IllegalStateException(A06(74, 27, 8));
    }

    @Override // com.facebook.ads.internal.api.NativeAdScrollViewApi
    public final void setInset(int i) {
        if (i > 0) {
            float f = XX.A02;
            float density = i;
            int insetDp = Math.round(density * f);
            this.A05.setPadding(insetDp, 0, insetDp, 0);
            float density2 = i / 2;
            this.A05.setPageMargin(Math.round(density2 * f));
            this.A05.setClipToPadding(false);
        }
    }
}
