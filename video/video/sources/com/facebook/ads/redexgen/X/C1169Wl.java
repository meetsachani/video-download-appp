package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.C2638Cg0;
import o.C3307Iz;
import o.C3503Kz;
import o.C8077mf;
import o.QC1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Wl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1169Wl {
    public static C1169Wl A03;
    public static byte[] A04;
    public static String[] A05 = {"5MKMOaVWDDOIRCHctWxXh6vg", "GTC1GbhELwGgGpWjZKevJ0k3Uxf5MI", "MErkTVrLaasGcwo7fnbPc0zPsPKQVooy", "Ww5tByWtz7", "O4OPIcLjmjm8Tl1QjT4vF9B23yTFDVzh", "ARYbvHkkpIBkY7WVIiyXY2IMU7tTgba1", "T0IhwzJuni2c17YqQ80jTeD3w7vBm05R", "Etvi9wSKDpLI2gJoBB"};
    public final T8 A00;
    public final Map<String, Set<String>> A02 = new HashMap();
    public final C1168Wk A01 = new C1168Wk();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 48);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{-109, -114, C2638Cg0.u7, C2638Cg0.w7, C2638Cg0.s7, C2638Cg0.z7, C2638Cg0.x7, C2638Cg0.A7, C2638Cg0.y7, C2638Cg0.z7, C2638Cg0.B7, C8077mf.p, 17, 32, 17, 34, 1, -2, 17, -2, -45, -44, -43, C2638Cg0.n7, -35, C2638Cg0.n7, -29, C2638Cg0.n7, -34, -35, -90, -98, -83, -102, -99, -102, -83, -102, -9, -13, -24, -22, -20, -12, -20, -11, -5, -6, -75, -74, -79, -76, -89, -90, -124, -93, -80, -80, -89, -76, -123, -79, -73, -80, -74, C8077mf.D, C8077mf.E, C8077mf.z, C8077mf.C, C8077mf.n, C8077mf.m, -16, C8077mf.y, C8077mf.E, C8077mf.n, C8077mf.C, C8077mf.D, C8077mf.E, C8077mf.r, C8077mf.E, C8077mf.r, 8, 19, -22, C8077mf.z, 28, C8077mf.y, C8077mf.E, 19, C8077mf.x, C8077mf.q, C8077mf.u, 5, 4, -19, 5, 4, 9, C8077mf.y, 13, -14, 5, 3, C8077mf.x, 1, C8077mf.p, 7, C8077mf.n, 5, -29, C8077mf.q, C8077mf.y, C8077mf.p, C8077mf.x, -27, -26, C2638Cg0.C7, -28, -41, -42, C2638Cg0.o7, -45, -26, -37, -24, -41, -76, -45, -32, -32, -41, -28, -75, C2638Cg0.C7, -25, -32, -26, -88, -87, -92, -89, -102, -103, -125, -106, -87, -98, -85, -102, QC1.w, -92, -86, -93, -87, -32, C2638Cg0.C7, -36, -33, -46, -47, -65, C2638Cg0.r7, -80, -36, -30, -37, C2638Cg0.C7, -80, -91, -87, -95, -101, -81, -80, -99, -87, -84, 34, C3307Iz.Z, C8077mf.H, 19, 4, 6};
    }

    static {
        A04();
    }

    public C1169Wl(T8 t8) {
        this.A00 = t8;
    }

    public static C1169Wl A00(T8 t8) {
        if (A03 == null) {
            A03 = new C1169Wl(t8);
        }
        return A03;
    }

    private final String A02(String str) {
        return this.A01.A04(this.A00, str, A01(181, 2, 89));
    }

    private String A03(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A01(30, 8, 9));
        if (optJSONObject == null) {
            return AdPlacementType.BANNER.toString();
        }
        if (optJSONObject.optString(A01(2, 9, 54)).equals(A01(0, 2, 46))) {
            return AdPlacementType.BANNER.toString();
        }
        return AdPlacementType.MEDIUM_RECTANGLE.toString();
    }

    private void A05(String str) {
        A06(str, 0);
        this.A01.A06(this.A00, str, A01(181, 2, 89));
    }

    private void A06(String str, int i) {
        if (str.equals(AdPlacementType.REWARDED_VIDEO.toString())) {
            this.A01.A05(this.A00, A01(C3503Kz.n0, 13, 61), i);
        } else if (str.equals(AdPlacementType.INTERSTITIAL.toString())) {
            this.A01.A05(this.A00, A01(65, 23, 119), i);
        } else if (str.equals(AdPlacementType.BANNER.toString())) {
            this.A01.A05(this.A00, A01(48, 17, 18), i);
        } else if (str.equals(AdPlacementType.MEDIUM_RECTANGLE.toString())) {
            this.A01.A05(this.A00, A01(88, 26, 112), i);
        } else if (str.equals(AdPlacementType.NATIVE.toString())) {
            this.A01.A05(this.A00, A01(C3503Kz.a0, 17, 5), i);
        } else if (!str.equals(AdPlacementType.NATIVE_BANNER.toString())) {
        } else {
            this.A01.A05(this.A00, A01(114, 23, 66), i);
        }
    }

    private final void A07(String str, String str2) {
        if (this.A02.get(str) == null) {
            this.A02.put(str, new HashSet());
        }
        this.A02.get(str).add(str2);
    }

    private boolean A08(String str, String str2) {
        int A0J = C1123Up.A0J(this.A00);
        if (str.equals(AdPlacementType.INTERSTITIAL.toString()) || str.equals(AdPlacementType.REWARDED_VIDEO.toString())) {
            A0J *= 2;
        }
        if (this.A02.get(str) != null) {
            int maxLoadedAdsAllowed = A09(str);
            if (maxLoadedAdsAllowed <= A0J && this.A02.get(str).contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final int A09(String str) {
        if (this.A02.get(str) == null) {
            return 0;
        }
        return this.A02.get(str).size();
    }

    public final int A0A(String str) {
        if (str.equals(AdPlacementType.REWARDED_VIDEO.toString())) {
            return this.A01.A03(this.A00, A01(C3503Kz.n0, 13, 61), 0);
        }
        if (str.equals(AdPlacementType.INTERSTITIAL.toString())) {
            return this.A01.A03(this.A00, A01(65, 23, 119), 0);
        }
        if (str.equals(AdPlacementType.BANNER.toString())) {
            return this.A01.A03(this.A00, A01(48, 17, 18), 0);
        }
        if (str.equals(AdPlacementType.MEDIUM_RECTANGLE.toString())) {
            return this.A01.A03(this.A00, A01(88, 26, 112), 0);
        }
        if (str.equals(AdPlacementType.NATIVE.toString())) {
            return this.A01.A03(this.A00, A01(C3503Kz.a0, 17, 5), 0);
        }
        if (!str.equals(AdPlacementType.NATIVE_BANNER.toString())) {
            return 0;
        }
        C1168Wk c1168Wk = this.A01;
        T8 t8 = this.A00;
        String A01 = A01(114, 23, 66);
        if (A05[5].charAt(25) != '7') {
            throw new RuntimeException();
        }
        A05[3] = "fotbcTaHfC";
        return c1168Wk.A03(t8, A01, 0);
    }

    public final Pair<String, String> A0B(String str) {
        String A01 = A01(167, 10, 12);
        String A02 = A02(str);
        if (A02 == null) {
            return null;
        }
        try {
            JSONObject storedAdResponse = new JSONObject(A02);
            Iterator<String> keys = storedAdResponse.keys();
            while (keys.hasNext()) {
                try {
                    String clientToken = keys.next();
                    if (!A08(str, clientToken)) {
                        JSONObject jSONObject = new JSONObject((String) storedAdResponse.get(clientToken));
                        if (!jSONObject.has(A01)) {
                            continue;
                        } else if (System.currentTimeMillis() - jSONObject.getLong(A01) < C1123Up.A02(this.A00)) {
                            String storedResponsesString = (String) storedAdResponse.get(clientToken);
                            Pair<String, String> pair = new Pair<>(clientToken, storedResponsesString);
                            A07(str, clientToken);
                            return pair;
                        } else {
                            A0E(str, clientToken);
                        }
                    }
                } catch (JSONException unused) {
                    A05(str);
                    return null;
                }
            }
            return null;
        } catch (JSONException unused2) {
            A05(str);
            return null;
        }
    }

    public final void A0C(String str) {
        try {
            JSONObject adData = new JSONObject(str);
            JSONArray jSONArray = adData.getJSONArray(A01(38, 10, 87));
            JSONArray placementJSON = jSONArray.getJSONObject(0).getJSONArray(A01(11, 3, 125));
            if (placementJSON.length() == 0) {
                return;
            }
            JSONObject jSONObject = placementJSON.getJSONObject(0).getJSONObject(A01(16, 4, 109));
            String string = jSONObject.getString(A01(14, 2, 126));
            String clientToken = jSONArray.getJSONObject(0).getJSONObject(A01(20, 10, 63)).getString(A01(177, 4, 126));
            if (A00(this.A00).A0F(clientToken)) {
                return;
            }
            if (clientToken.equals(AdPlacementType.BANNER.toString())) {
                clientToken = A03(jSONObject);
            }
            String A02 = A02(clientToken);
            if (A02 == null) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject(A02);
            adData.put(A01(167, 10, 12), System.currentTimeMillis());
            jSONObject2.put(string, adData.toString());
            this.A01.A06(this.A00, clientToken, jSONObject2.toString());
            A06(clientToken, A0A(clientToken) + 1);
            A07(clientToken, string);
        } catch (JSONException unused) {
        }
    }

    public final void A0D(String str, String str2) {
        if (str == null || str2 == null || this.A02.get(str) == null) {
            return;
        }
        this.A02.get(str).remove(str2);
    }

    public final void A0E(String str, String str2) {
        if (C1123Up.A02(this.A00) <= 0) {
            return;
        }
        int newStoredCount = A0A(str) - 1;
        if (newStoredCount < 0) {
            newStoredCount = 0;
        }
        A06(str, newStoredCount);
        String storedResponses = A02(str);
        if (storedResponses == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(storedResponses);
            jSONObject.remove(str2);
            this.A01.A06(this.A00, str, jSONObject.toString());
            A0D(str, str2);
        } catch (JSONException unused) {
        }
    }

    public final boolean A0F(String str) {
        return !C1123Up.A1A(this.A00) && (str.equals(AdPlacementType.BANNER.toString()) || str.equals(AdPlacementType.MEDIUM_RECTANGLE.toString()));
    }
}
