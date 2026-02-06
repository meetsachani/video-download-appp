package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import androidx.media.AudioAttributesCompat;
import java.util.Arrays;
import o.C2638Cg0;
import o.C7193j50;
import o.QC1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network/classes2.dex */
public final class WV implements V8 {
    public static byte[] A02;
    public static String[] A03 = {"PqRb8CfCWHA5EhrxcZ9mRPllTh3oOSUW", "Zl9oGp2Iez0jLvuEYbnxsntptMxGBM4l", "l9LBk", "jZa6p3ci91eTCo5R2EOP7xEtghieA3uB", "FSDG0GiI6cZANIzlwvsJdjGaYqMqroq5", "1sDItVUeKrx9RbYz", "1qorAXgeX39shBtffGMCszMJDt6RFPN7", "u6hSYDgbJvcFisLakSyhfwTjAFON3iEs"};
    public static final String A04;
    public C1669ge A00;
    public ZH A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 3);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A02 = new byte[]{85, -101, -92, -89, 85, -102, -85, -102, -93, -87, 126, -103, 85, -127, -44, -42, -60, -60, C2638Cg0.t7, -44, -44, C2638Cg0.u7, -42, C2638Cg0.y7, C2638Cg0.y7, C2638Cg0.B7, -113, 97, -123, -90, -83, -90, -75, -90, -91, 97, -90, -73, -90, -81, -75, -76, 97, -90, -71, -92, -90, -90, -91, -90, -91, 97, -77, -90, -75, -77, -70, 97, -83, -86, -82, -86, -75, 111, 97, -124, -80, -74, -81, -75, 123, 97, -80, C2638Cg0.C7, -48, C2638Cg0.E7, -33, -117, -33, -28, -37, -48, -117, -37, -35, C2638Cg0.B7, C2638Cg0.z7, -48, -34, -34, -48, C2638Cg0.A7, -117, C2638Cg0.y7, -28, -117, -33, -45, -48, -117, -34, -48, -35, C2638Cg0.C7, -48, -35, -91, -117, -81, C2638Cg0.w7, -46, -43, C2638Cg0.z7, C2638Cg0.y7, -119, -35, C2638Cg0.n7, -119, C2638Cg0.E7, C2638Cg0.w7, -37, -36, C2638Cg0.z7, -119, C2638Cg0.w7, -41, -119, C2638Cg0.z7, -33, C2638Cg0.z7, -41, -35, -119, -46, -41, -119, C2638Cg0.z7, -33, C2638Cg0.z7, -41, -35, -36, -119, C2638Cg0.w7, -37, -37, C2638Cg0.w7, -30, -119, C2638Cg0.A7, C2638Cg0.n7, -37, -119, C2638Cg0.y7, -46, -36, C2638Cg0.E7, C2638Cg0.w7, -35, -52, -47, -119, C2638Cg0.A7, C2638Cg0.w7, -46, -43, -34, -37, C2638Cg0.z7, -105, -102, -84, -71, -67, -84, -71, 103, -73, -71, -74, -86, -84, -70, -70, -84, -85, 103, -84, -67, -84, -75, -69, -112, -85, 103, -67, C2638Cg0.A7, -36, -32, C2638Cg0.A7, -36, -118, -36, C2638Cg0.A7, -34, -33, -36, C2638Cg0.n7, C2638Cg0.A7, C2638Cg0.z7, -118, C2638Cg0.n7, C2638Cg0.E7, C2638Cg0.n7, -105, -36, C2638Cg0.A7, -34, -36, -29, C2638Cg0.x7, -52, -42, C2638Cg0.A7, -118, C2638Cg0.A7, -36, -36, C2638Cg0.E7, -36, -118, C2638Cg0.y7, C2638Cg0.E7, C2638Cg0.z7, C2638Cg0.A7, -118, -101, -83, -70, -66, -83, -70, 104, -70, -83, -68, -67, -70, -74, -83, -84, 104, -70, -83, -68, -70, C2638Cg0.p7, -87, -86, -76, -83, 104, -83, -70, -70, -73, -70, 104, -85, -73, -84, -83, 104, C2638Cg0.r7, -36, C2638Cg0.A7, -48, C2638Cg0.B7, -45, -114, -30, -35, -114, -34, C2638Cg0.A7, -32, C2638Cg0.C7, -45, -114, -46, -45, -48, -29, -43, -70, -35, -43, -77, -28, -45, -36, -30, -114, C2638Cg0.A7, -30, -114, -82, C2638Cg0.u7, -70, -69, C2638Cg0.s7, -66, 121, C2638Cg0.y7, -56, 121, C2638Cg0.v7, -70, C2638Cg0.x7, -52, -66, 121, -66, C2638Cg0.A7, -66, C2638Cg0.u7, C2638Cg0.y7, 121, -70, C2638Cg0.y7, 121, 102, Byte.MAX_VALUE, 114, 115, 125, 118, 49, -123, Byte.MIN_VALUE, 49, -127, 114, -125, -124, 118, 49, -124, 118, -125, -121, 118, -125, 49, -125, 118, -124, -127, Byte.MIN_VALUE, Byte.MAX_VALUE, -124, 118, 49, 114, -123, 49, -127, Byte.MIN_VALUE, -124, 122, -123, 122, Byte.MIN_VALUE, Byte.MAX_VALUE, 49, -34, -22, -33, -32, -116, -119, -100, -119, -118, -119, -101, -115, -105, -88, -105, -96, -90, -91, -112, -113, -117, -98, -97, -100, -113, 87, -115, -103, -104, -112, -109, -111, 87, -113, -96, -113, -104, -98, 87, -105, -117, -111, -109, -115, 121, QC1.w, 116, -121, -120, -123, QC1.w, 114, 118, -126, -127, 121, 124, 122, 123, 118, -82, -93, -89, -97, 121, 116, 112, 106, 115, QC1.w};
    }

    static {
        A05();
        A04 = WV.class.getSimpleName();
    }

    public WV(C1669ge c1669ge, ZH zh) {
        this.A00 = c1669ge;
        this.A01 = zh;
    }

    public static JSONArray A01(C1669ge c1669ge, JSONArray jSONArray, JSONArray jSONArray2) {
        int i = 0;
        if (jSONArray != null) {
            int limit = jSONArray.length();
            i = 0 + limit;
        }
        if (jSONArray2 != null) {
            int limit2 = jSONArray2.length();
            i += limit2;
        }
        return A02(c1669ge, jSONArray, jSONArray2, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fa, code lost:
        if (r22 <= 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fc, code lost:
        if (r4 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fe, code lost:
        r7.put(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0101, code lost:
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0102, code lost:
        if (r3 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0104, code lost:
        r7.put(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONArray A02(C1669ge c1669ge, JSONArray jSONArray, JSONArray jSONArray2, int i) {
        if (jSONArray == null) {
            return jSONArray2;
        }
        if (jSONArray2 == null) {
            return jSONArray;
        }
        int length = jSONArray.length();
        int eventsIdx = jSONArray2.length();
        JSONArray jSONArray3 = new JSONArray();
        int limit = 0;
        int i2 = 0;
        JSONObject jSONObject = null;
        JSONObject jSONObject2 = null;
        double d = Double.MAX_VALUE;
        double d2 = Double.MAX_VALUE;
        while (true) {
            if ((limit < length || i2 < eventsIdx) && i > 0) {
                String A00 = A00(435, 4, 55);
                if (limit < length && jSONObject == null) {
                    try {
                        jSONObject = jSONArray.getJSONObject(limit);
                        d = jSONObject.getDouble(A00);
                    } catch (JSONException e) {
                        if (c1669ge.A05().AAO()) {
                            Log.e(A04, A00(AudioAttributesCompat.O, 33, 107) + limit, e);
                        }
                        jSONObject = null;
                        d = Double.MAX_VALUE;
                    }
                    limit++;
                }
                if (i2 < eventsIdx && jSONObject2 == null) {
                    try {
                        jSONObject2 = jSONArray2.getJSONObject(i2);
                        d2 = jSONObject2.getDouble(A00);
                    } catch (JSONException e2) {
                        if (c1669ge.A05().AAO()) {
                            Log.e(A04, A00(306, 25, 86) + i2, e2);
                        }
                        jSONObject2 = null;
                        String[] strArr = A03;
                        if (strArr[6].charAt(2) == strArr[1].charAt(2)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A03;
                        strArr2[4] = "Ao7e4H6oauVu5gaKSpxLNRSSjr9efZyc";
                        strArr2[7] = "dweSflIkmec9RBGwLpK3xpB3h9wbJjrg";
                        d2 = Double.MAX_VALUE;
                    }
                    i2++;
                }
                if (jSONObject != null || jSONObject2 != null) {
                    if (jSONObject == null || d2 < d) {
                        jSONArray3.put(jSONObject2);
                        jSONObject2 = null;
                        d2 = Double.MAX_VALUE;
                    } else {
                        jSONArray3.put(jSONObject);
                        jSONObject = null;
                        d = Double.MAX_VALUE;
                    }
                    i--;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
        if (r3 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r3 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
        r5 = new org.json.JSONObject();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
        r5.put(A00(439, 6, 2), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
        r5.put(A00(387, 6, 47), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private JSONObject A03() {
        JSONArray A032;
        JSONObject A6t = this.A01.A6t();
        JSONArray A6s = this.A01.A6s();
        if (AbstractC1125Ur.A0P(this.A00) && (A032 = C1087Tf.A03(this.A00)) != null && A032.length() > 0) {
            C1669ge c1669ge = this.A00;
            if (A03[2].length() != 5) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[4] = "qUVNbNwZZvYyuSz0SsvSYTyRsw3xu0Du";
            strArr[7] = "WlKgM87vtUujDuDqlOM5717cU9PyRF7c";
            A6s = A01(c1669ge, A032, A6s);
        }
        JSONObject jSONObject = null;
        String[] strArr2 = A03;
        if (strArr2[4].charAt(22) != strArr2[7].charAt(22)) {
            String[] strArr3 = A03;
            strArr3[4] = "QvYFeqMEyu4I6p0dgxwwBO2xjkm9NvyV";
            strArr3[7] = "HjcWCrOu2PXb4iuKPAXMC032aGUytbXM";
        }
        return jSONObject;
    }

    private JSONObject A04(int i) {
        int A08;
        JSONArray A042;
        Pair<JSONObject, JSONArray> tokensAndEvents = this.A01.A9I(i);
        JSONObject jSONObject = (JSONObject) tokensAndEvents.first;
        JSONArray jSONArray = (JSONArray) tokensAndEvents.second;
        if (AbstractC1125Ur.A0P(this.A00) && (A042 = C1087Tf.A04(this.A00, (A08 = AbstractC1125Ur.A08(this.A00)))) != null && A042.length() > 0) {
            jSONArray = A02(this.A00, A042, jSONArray, i + A08);
        }
        JSONObject jSONObject2 = null;
        String[] strArr = A03;
        if (strArr[4].charAt(22) != strArr[7].charAt(22)) {
            String[] strArr2 = A03;
            strArr2[0] = "feKb1r4kRW7gDKlD5BEzQjo0jh9TPYxK";
            strArr2[3] = "s9YNb4XbEbjpB7B5leG71QtixhMBVNOA";
            if (jSONArray != null) {
                try {
                    jSONObject2 = new JSONObject();
                    if (jSONObject != null) {
                        jSONObject2.put(A00(439, 6, 2), jSONObject);
                    }
                    jSONObject2.put(A00(387, 6, 47), jSONArray);
                } catch (JSONException unused) {
                    return null;
                }
            }
            return jSONObject2;
        }
        throw new RuntimeException();
    }

    private void A06(String str) {
        if (C1087Tf.A0I(str)) {
            C1669ge c1669ge = this.A00;
            String[] strArr = A03;
            if (strArr[4].charAt(22) == strArr[7].charAt(22)) {
                throw new RuntimeException();
            }
            A03[2] = "U9Gor";
            C1087Tf.A0B(c1669ge, str);
            return;
        }
        this.A01.AA5(str);
    }

    @Override // com.facebook.ads.redexgen.X.V8
    public final JSONObject A5L() {
        int eventLimit = AbstractC1125Ur.A0F(this.A00);
        return eventLimit > 0 ? A04(eventLimit) : A03();
    }

    @Override // com.facebook.ads.redexgen.X.V8
    public final boolean AAb() {
        int eventCount = AbstractC1125Ur.A0F(this.A00);
        if (eventCount < 1) {
            return false;
        }
        int A82 = this.A01.A82();
        int eventLimit = C1087Tf.A00(this.A00);
        return A82 + eventLimit > eventCount;
    }

    @Override // com.facebook.ads.redexgen.X.V8
    public final void ACu() {
        int A50 = this.A01.A50(AbstractC1125Ur.A0G(this.A00));
        if (A50 > 0) {
            this.A00.A08().ABC(A00(379, 8, 37), AbstractC1085Td.A10, new C1086Te(A00(28, 44, 62) + A50));
        }
        C1087Tf.A0F(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.V8
    public final void ADe(JSONArray jSONArray) {
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                A06(jSONArray.getJSONObject(i).getString(A00(433, 2, 15)));
            } catch (JSONException e) {
                if (this.A00.A05().AAO()) {
                    String eventId = A04;
                    Log.e(eventId, A00(108, 62, 102), e);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.V8
    public final boolean ADf(JSONArray jSONArray) {
        String A00 = A00(27, 1, 48);
        boolean z = true;
        boolean A0P = AbstractC1125Ur.A0P(this.A00);
        for (int errorCode = 0; errorCode < jSONArray.length(); errorCode++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(errorCode);
                String eventId = jSONObject.getString(A00(433, 2, 15));
                if (A00(393, 26, 39).equals(eventId)) {
                    C1123Up.A0V(this.A00).A36(jSONObject.getString(A00(419, 14, 16)));
                    this.A00.A04().ACP();
                } else {
                    int i = jSONObject.getInt(A00(375, 4, 120));
                    if (i == 1) {
                        if (this.A00.A05().AAO()) {
                            String str = A00(C7193j50.f, 25, 68) + eventId + A00(13, 14, 94);
                            String A85 = this.A01.A85(eventId);
                            if (A85 != null) {
                                String str2 = A00(72, 36, 104) + A85;
                            }
                        }
                        if (!this.A01.A5q(eventId) && A0P) {
                            C1087Tf.A0D(eventId);
                        }
                    } else {
                        String[] strArr = A03;
                        if (strArr[6].charAt(2) == strArr[1].charAt(2)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A03;
                        strArr2[6] = "1LE9O0SwhMhMXUh2JQEpQ81OBnaONLaF";
                        strArr2[1] = "qI9w2PtHmRHMr9aKEOtTY0DScCfNQmEA";
                        String A002 = A00(0, 13, 50);
                        if (i >= 1000 && i < 2000) {
                            if (this.A00.A05().AAO()) {
                                Log.e(A04, A00(236, 37, 69) + i + A002 + eventId + A00);
                            }
                            A06(eventId);
                            z = false;
                        } else if (i >= 2000) {
                            if (A03[5].length() == 16) {
                                A03[5] = "Te73kS0enGf3eAU6";
                                if (i >= 3000) {
                                }
                            } else if (i >= 3000) {
                            }
                            if (this.A00.A05().AAO()) {
                                Log.e(A04, A00(195, 41, 103) + i + A002 + eventId + A00);
                            }
                            if (!this.A01.A5q(eventId) && A0P) {
                                C1087Tf.A0D(eventId);
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (this.A00.A05().AAO()) {
                    Log.e(A04, A00(331, 44, 14) + errorCode + A00, e);
                }
                z = false;
            }
        }
        return z;
    }

    @Override // com.facebook.ads.redexgen.X.V8
    public final void AFZ() {
        this.A01.A51();
        C1087Tf.A07(this.A00);
    }
}
