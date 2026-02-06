package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdSettings;
import com.facebook.ads.RewardData;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Executor;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.ea  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1541ea {
    public static byte[] A05;
    public Executor A00 = YG.A06;
    public final C1673gi A01;
    public final InterfaceC1214Yh A02;
    public final ZU A03;
    public final String A04;

    static {
        A05();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 76);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{5, C8077mf.x, C8077mf.x, 13, 8, 19, 31, 31, C8077mf.E, C8077mf.H, -27, C2638Cg0.B7, C2638Cg0.B7, 34, 34, 34, C2638Cg0.E7, -48, C8077mf.H, C2638Cg0.E7, 17, C8077mf.n, C8077mf.p, C8077mf.r, 13, C8077mf.D, C8077mf.D, C8077mf.z, C2638Cg0.E7, C8077mf.p, C8077mf.D, C8077mf.B, C2638Cg0.B7, C8077mf.n, 32, C8077mf.q, C8077mf.x, C8077mf.r, C8077mf.C, C8077mf.p, C8077mf.r, 10, C8077mf.C, C8077mf.r, 31, 34, C8077mf.D, C8077mf.G, C8077mf.z, C2638Cg0.B7, C8077mf.H, C8077mf.r, C8077mf.G, C3307Iz.V, C8077mf.r, C8077mf.G, 10, C8077mf.H, C8077mf.x, C8077mf.q, C8077mf.r, 10, C8077mf.G, C8077mf.r, 34, C8077mf.n, C8077mf.G, C8077mf.q, C2638Cg0.C7, -19, -19, -23, -20, -77, -88, -88, -16, -16, -16, -89, -33, C2638Cg0.B7, -36, -34, -37, -24, -24, -28, -89, -36, -24, -26, -88, C2638Cg0.B7, -18, -35, -30, -34, -25, -36, -34, C2638Cg0.n7, -25, -34, -19, -16, -24, -21, -28, -88, -20, -34, -21, -17, -34, -21, C2638Cg0.n7, -20, -30, -35, -34, C2638Cg0.n7, -21, -34, -16, C2638Cg0.B7, -21, -35, C8077mf.x, 7, 31, 35, C8077mf.B, 19, 42, 47, 35, C8077mf.H};
    }

    public C1541ea(C1673gi c1673gi, ZU zu, String str, InterfaceC1214Yh interfaceC1214Yh) {
        this.A01 = c1673gi;
        this.A03 = zu;
        this.A04 = str;
        this.A02 = interfaceC1214Yh;
    }

    public static String A04(RewardData rewardData, String str, String str2) {
        String urlPrefix;
        if (rewardData != null) {
            String serverSideProxyURL = AdSettings.getUrlPrefix();
            if (serverSideProxyURL == null || serverSideProxyURL.isEmpty()) {
                urlPrefix = A03(68, 60, 45);
            } else {
                String urlPrefix2 = A03(5, 63, 95);
                urlPrefix = String.format(Locale.US, urlPrefix2, serverSideProxyURL);
            }
            Uri A00 = XB.A00(urlPrefix);
            Uri.Builder uriBuilder = new Uri.Builder();
            String urlPrefix3 = A00.getScheme();
            uriBuilder.scheme(urlPrefix3);
            String urlPrefix4 = A00.getAuthority();
            uriBuilder.authority(urlPrefix4);
            String urlPrefix5 = A00.getPath();
            uriBuilder.path(urlPrefix5);
            String urlPrefix6 = A00.getQuery();
            uriBuilder.query(urlPrefix6);
            String urlPrefix7 = A00.getFragment();
            uriBuilder.fragment(urlPrefix7);
            String serverSideProxyURL2 = A03(134, 4, 110);
            String urlPrefix8 = rewardData.getUserID();
            uriBuilder.appendQueryParameter(serverSideProxyURL2, urlPrefix8);
            String serverSideProxyURL3 = A03(128, 2, 88);
            String urlPrefix9 = rewardData.getCurrency();
            uriBuilder.appendQueryParameter(serverSideProxyURL3, urlPrefix9);
            String urlPrefix10 = A03(130, 4, 99);
            uriBuilder.appendQueryParameter(urlPrefix10, str);
            String urlPrefix11 = A03(0, 5, 88);
            uriBuilder.appendQueryParameter(urlPrefix11, str2);
            String urlPrefix12 = uriBuilder.build().toString();
            return urlPrefix12;
        }
        return null;
    }

    public final void A06() {
        if (!TextUtils.isEmpty(this.A04)) {
            AsyncTaskC1644gF asyncTaskC1644gF = new AsyncTaskC1644gF(this.A01, new HashMap());
            asyncTaskC1644gF.A07(new F8(this));
            asyncTaskC1644gF.executeOnExecutor(this.A00, this.A04);
        }
    }
}
