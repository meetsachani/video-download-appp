package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.api.AdSettingsApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;
import o.C3307Iz;
import o.C8077mf;
import o.CK1;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.Rc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1033Rc implements AdSettingsApi {
    public static byte[] A00;
    public static String[] A01 = {"5g08JbOH8rkW6qlmlOL6A29nsZk", "3r4qaOnTaYokldocBIi2hcDPsInD4tfb", "t1tpXM0pz4jVDPHhq8DkXYPWitYDcWj1", "M2cS8KouRYddMtKm0nW0nVVXMs", "pym3fLCD1Tj466B1DlzVQDM4sLBUPDKC", "ku7CSS8RQpD6IDBrWEnqwcDf2zEQuZtv", "vquYYtSubxB68XLpTdo3CiQszZtPPcit", "yyxMEkIlFEzZN5mv2HKHli04TbghSWGE"};
    public static final String A02;
    public static final Collection<String> A03;
    public static volatile boolean A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 79);
            String[] strArr = A01;
            if (strArr[7].charAt(16) == strArr[1].charAt(16)) {
                throw new RuntimeException();
            }
            A01[0] = "ed4gaD";
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{C8077mf.p, 5, C8077mf.A, C8077mf.q, 8, C8077mf.p, 3, C8077mf.B, C8077mf.C, 10, C8077mf.y, 31, C8077mf.C, 3, C8077mf.y, C8077mf.B, 3, C8077mf.x, C8077mf.G, C8077mf.q, C8077mf.x, 3, C8077mf.A, C8077mf.C, 5, 90, 107, 125, 122, C3307Iz.f0, 99, 97, 106, 107, C3307Iz.f0, 106, 107, QC1.w, 103, 109, 107, C3307Iz.f0, 102, 111, 125, 102, 52, C3307Iz.f0, 71, QC1.w, 117, 126, 48, 100, 117, 99, 100, 121, 126, 119, 48, 105, Byte.MAX_VALUE, 101, 98, 48, 113, 96, 96, 48, 103, 121, 100, QC1.w, 48, 86, 113, 115, 117, 114, Byte.MAX_VALUE, Byte.MAX_VALUE, 123, 55, 99, 48, 113, 116, 48, 101, 126, 121, 100, 99, 48, 105, Byte.MAX_VALUE, 101, 48, 125, 101, 99, 100, 48, 99, 96, 117, 115, 121, 118, 105, 48, 100, QC1.w, 117, 48, 116, 117, 102, 121, 115, 117, 48, QC1.w, 113, 99, QC1.w, 117, 116, 48, 89, 84, 48, 100, Byte.MAX_VALUE, 48, 117, 126, 99, 101, 98, 117, 48, 100, QC1.w, 117, 48, 116, 117, 124, 121, 102, 117, 98, 105, 48, Byte.MAX_VALUE, 118, 48, 100, 117, 99, 100, 48, 113, 116, 99, 60, 48, 113, 116, 116, 48, 100, QC1.w, 117, 48, 118, Byte.MAX_VALUE, 124, 124, Byte.MAX_VALUE, 103, 121, 126, 119, 48, 115, Byte.MAX_VALUE, 116, 117, 48, 114, 117, 118, Byte.MAX_VALUE, 98, 117, 48, 124, Byte.MAX_VALUE, 113, 116, 121, 126, 119, 48, 113, 126, 48, 113, 116, 42, 48, 81, 116, 67, 117, 100, 100, 121, 126, 119, 99, 62, 113, 116, 116, 68, 117, 99, 100, 84, 117, 102, 121, 115, 117, 56, 50, 7, 6, C8077mf.y, 10, 0, 6, 42, 7, C3307Iz.c0, 2, C8077mf.r, C8077mf.m, 103, 111, 111, 103, 108, 101, 95, 115, 100, 107, 126, 105, 102, C8077mf.r, 4, 9, C8077mf.H, 94, 80, C8077mf.z, 124, 104, 101, 114, 50, 60, 126, 122};
    }

    static {
        A01();
        A02 = AdInternalSettings.class.getSimpleName();
        A03 = new HashSet();
        A03.add(A00(262, 3, 66));
        A03.add(A00(252, 10, 79));
        A03.add(A00(265, 7, 41));
        A03.add(A00(272, 8, 69));
        A04 = false;
    }

    public static void A02(String str) {
        if (A04) {
            return;
        }
        A04 = true;
        Log.i(A02, A00(25, 23, 65) + str);
        Log.i(A02, A00(48, CK1.x, 95) + str + A00(0, 3, 99));
    }

    @Override // com.facebook.ads.internal.api.AdSettingsApi
    public final boolean isTestMode(Context context) {
        if (!AdInternalSettings.isDebugBuild() && !AdInternalSettings.isExplicitTestMode()) {
            Collection<String> collection = A03;
            String str = Build.PRODUCT;
            String[] strArr = A01;
            if (strArr[7].charAt(16) == strArr[1].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[7] = "T4gBNxEGe37wgzXKS7GC3py1fkLao5wI";
            strArr2[1] = "pVb2nflAxo98tm2kzzD3dq5aQ79B8LIX";
            if (!collection.contains(str)) {
                MultithreadedBundleWrapper multithreadedBundleWrapper = AdInternalSettings.sSettingsBundle;
                String A002 = A00(3, 22, 19);
                String string = multithreadedBundleWrapper.getString(A002, null);
                if (string == null) {
                    SharedPreferences A003 = WN.A00(context);
                    String A004 = A00(240, 12, 44);
                    string = A003.getString(A004, null);
                    if (TextUtils.isEmpty(string)) {
                        string = UUID.randomUUID().toString();
                        SharedPreferences.Editor edit = A003.edit();
                        String[] strArr3 = A01;
                        if (strArr3[7].charAt(16) != strArr3[1].charAt(16)) {
                            A01[3] = "RjRRqTdr5YFfB1Oiza3DhfcwhE";
                            edit.putString(A004, string).apply();
                        } else {
                            edit.putString(A004, string).apply();
                        }
                    }
                    AdInternalSettings.sSettingsBundle.putString(A002, string);
                }
                if (AdInternalSettings.getTestDevicesList().contains(string)) {
                    return true;
                }
                A02(string);
                return false;
            }
        }
        return true;
    }

    @Override // com.facebook.ads.internal.api.AdSettingsApi
    public final void turnOnDebugger() {
        AbstractC1156Vy.A02();
    }
}
