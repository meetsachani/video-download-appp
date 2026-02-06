package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import o.C2638Cg0;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;
import o.QC1;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Mu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0926Mu {
    public static byte[] A00;
    public static final String A01;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 9);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{C3307Iz.d0, C8077mf.A, C8077mf.B, C8077mf.E, C8077mf.y, 28, 89, 13, C8077mf.z, 89, 9, C8077mf.B, C8077mf.m, 10, 28, 89, 19, 10, C8077mf.z, C8077mf.A, 89, C8077mf.G, C8077mf.B, 13, C8077mf.B, 89, C8077mf.r, C8077mf.A, 89, 56, C8077mf.G, 56, C8077mf.D, 13, C8077mf.r, C8077mf.z, C8077mf.A, ED2.a, C8077mf.B, C8077mf.D, 13, C8077mf.z, C8077mf.m, 0, 87, 114, 119, 98, 119, 51, 50, 47, 53, 40, 57, 126, 97, 116, Byte.MAX_VALUE, 78, 125, QC1.w, Byte.MAX_VALUE, 122, 49, 32, 51, 50, 40, 47, C3307Iz.Y, 62, 47, C4715Xk.i, C4715Xk.i, 58, C3307Iz.Y, 60, C3307Iz.V, 59, C3307Iz.a0, C3307Iz.Y, 42, C3307Iz.e0, 54, C3307Iz.c0, 60, 88, 95, 68, 89, 78, 116, 94, 89, 71, 116, 92, 78, 73, 116, 77, 74, 71, 71, 73, 74, 72, 64, 50, 52, 51, 35, 76, 83, 94, 95, 85, 101, 79, 72, 86};
    }

    static {
        A03();
        A01 = C0926Mu.class.getSimpleName();
    }

    public static AbstractC0925Mt A00(C1673gi c1673gi, VA va, String str, Uri uri, Map<String, String> extraData, C0937Ng c0937Ng) {
        return A01(c1673gi, va, str, uri, extraData, true, false, c0937Ng);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC0925Mt A01(final C1673gi c1673gi, final VA va, final String action, final Uri uri, final Map<String, String> map, final boolean z, boolean z2, C0937Ng c0937Ng) {
        char c;
        if (uri == null || uri.getAuthority() == null) {
            return null;
        }
        String key = uri.getAuthority();
        String queryParameter = uri.getQueryParameter(A02(113, 9, 51));
        String queryParameter2 = uri.getQueryParameter(A02(45, 4, 31));
        if (queryParameter2 != null && !TextUtils.isEmpty(queryParameter2)) {
            try {
                JSONObject jSONObject = new JSONObject(queryParameter2);
                Iterator<String> dataIterator = jSONObject.keys();
                while (dataIterator.hasNext()) {
                    String next = dataIterator.next();
                    try {
                        map.put(next, jSONObject.getString(next));
                    } catch (JSONException e) {
                        e = e;
                        c1673gi.A08().ABC(A02(64, 7, 72), AbstractC1085Td.A23, new C1086Te(e));
                        Log.w(A01, A02(0, 45, 112), e);
                        final N0 A002 = N0.A00(va, ActivityUtils.A00());
                        switch (key.hashCode()) {
                            case -1458789996:
                                break;
                            case 109770977:
                                break;
                            case 1546100943:
                                break;
                        }
                        switch (c) {
                        }
                    }
                }
            } catch (JSONException e2) {
                e = e2;
            }
        }
        final N0 A0022 = N0.A00(va, ActivityUtils.A00());
        switch (key.hashCode()) {
            case -1458789996:
                if (key.equals(A02(71, 11, 71))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 109770977:
                if (key.equals(A02(82, 5, 80))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1546100943:
                if (key.equals(A02(55, 9, 24))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                if (queryParameter != null) {
                    return null;
                }
                return (!z2 || TextUtils.isEmpty(uri.getQueryParameter(A02(87, 22, 34)))) ? new AnonymousClass87(c1673gi, va, action, uri, map, A0022, z, c0937Ng) : new AnonymousClass85(c1673gi, va, action, uri, map);
            case 1:
                if (A02(109, 4, 79).equals(uri.getQueryParameter(A02(49, 6, 85)))) {
                    return new AbstractC1886kH(c1673gi, va, action, uri, map, A0022, z) { // from class: com.facebook.ads.redexgen.X.83
                        public static byte[] A02;
                        public static final String A03;
                        public final Uri A00;
                        public final Map<String, String> A01;

                        public static String A00(int i, int i2, int i3) {
                            byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                            for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                                copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 108);
                            }
                            return new String(copyOfRange);
                        }

                        public static void A01() {
                            A02 = new byte[]{93, 122, 114, 119, 126, Byte.MAX_VALUE, 59, 111, 116, 59, 116, 107, 126, 117, 59, 119, 114, 117, 112, 59, 110, 105, 119, C3307Iz.V, 59, 67, 70, 65, 68};
                        }

                        static {
                            A01();
                            A03 = AnonymousClass83.class.getSimpleName();
                        }

                        {
                            this.A00 = uri;
                            this.A01 = map;
                        }

                        @Override // com.facebook.ads.redexgen.X.AbstractC1886kH
                        public final EnumC0922Mq A0H() {
                            EnumC0922Mq enumC0922Mq = EnumC0922Mq.A09;
                            if (((AbstractC1886kH) this).A03) {
                                enumC0922Mq = A0M();
                            }
                            A0J(this.A01, enumC0922Mq);
                            return enumC0922Mq;
                        }

                        public final EnumC0922Mq A0M() {
                            EnumC0922Mq enumC0922Mq = EnumC0922Mq.A09;
                            try {
                                X6.A0D(new X6(), ((AbstractC0925Mt) this).A01, XB.A00(this.A00.getQueryParameter(A00(25, 4, 67))), ((AbstractC0925Mt) this).A03);
                                return enumC0922Mq;
                            } catch (Exception unused) {
                                String str = A00(0, 25, 119) + this.A00.toString();
                                return EnumC0922Mq.A04;
                            }
                        }
                    };
                }
                return z2 ? new AnonymousClass85(c1673gi, va, action, uri, map) : new AbstractC1886kH(c1673gi, va, action, uri, map, A0022, z) { // from class: com.facebook.ads.redexgen.X.84
                    public static byte[] A02;
                    public static String[] A03 = {"FXNBCWXiStej7hPExkUYAqHU7xYJWQz0", "1k", "9V456DvY4LqOh9I9hdT7Vdo5", "hY2FptqSd7XbZZsJCz2yOGxQcUuE9Eo6", "F2N3RsuOcTrAQaEUExDI4U65CqttWDRl", "hYiRMwjZqKFmNKhRfgQ6FfhFwFErfvFO", "BBwXtDWFWjLC6NycZYUWGAP3M0YJ", ""};
                    public static final String A04;
                    public final Uri A00;
                    public final Map<String, String> A01;

                    public static String A00(int i, int i2, int i3) {
                        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 84);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A01() {
                        A02 = new byte[]{-100, -73, -65, C2638Cg0.q7, -69, -70, 118, C2638Cg0.w7, C2638Cg0.s7, 118, C2638Cg0.s7, C2638Cg0.t7, -69, -60, 118, C2638Cg0.q7, -65, -60, C2638Cg0.p7, 118, C2638Cg0.x7, -56, C2638Cg0.q7, -112, 118, -45, -48, -43, -46};
                        if (A03[3].charAt(0) == 'g') {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[4] = "n2WgzR0RMCkX50JDMRkryQ8YygezODnU";
                        strArr[5] = "Oz9myBlwI7NBoyftyrFAavzWMm25M0Ie";
                    }

                    static {
                        A01();
                        A04 = AnonymousClass84.class.getSimpleName();
                    }

                    {
                        this.A00 = uri;
                        this.A01 = map;
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC1886kH
                    public final EnumC0922Mq A0H() {
                        EnumC0922Mq enumC0922Mq = EnumC0922Mq.A09;
                        if (((AbstractC1886kH) this).A03) {
                            enumC0922Mq = A0M();
                        }
                        if (!YB.A0i(((AbstractC0925Mt) this).A01, enumC0922Mq, this.A01)) {
                            A0J(this.A01, enumC0922Mq);
                        }
                        return enumC0922Mq;
                    }

                    public final EnumC0922Mq A0M() {
                        if (A0K(this.A00)) {
                            EnumC0922Mq actionOutcome = EnumC0922Mq.A0A;
                            return actionOutcome;
                        }
                        try {
                            EnumC0922Mq actionOutcome2 = X6.A06(new X6(), ((AbstractC0925Mt) this).A01, XB.A00(this.A00.getQueryParameter(A00(25, 4, 19))), ((AbstractC0925Mt) this).A03, this.A01);
                            return actionOutcome2;
                        } catch (Exception unused) {
                            String str = A00(0, 25, 2) + this.A00.toString();
                            EnumC0922Mq actionOutcome3 = EnumC0922Mq.A04;
                            return actionOutcome3;
                        }
                    }
                };
            case 2:
                return new C1885kG(c1673gi, va, action, uri, map);
            default:
                return new C1884kE(c1673gi, va, action, uri);
        }
    }

    public static boolean A04(String str) {
        return A02(82, 5, 80).equalsIgnoreCase(str) || A02(55, 9, 24).equalsIgnoreCase(str);
    }
}
