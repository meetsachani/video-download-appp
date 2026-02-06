package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.AdSettings;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.google.firebase.messaging.ServiceStarter;
import java.util.Arrays;
import o.C2638Cg0;
import o.C3503Kz;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class OX {
    public static byte[] A00;
    public static String[] A01 = {"alBbxktHBjENZciLxR6rw2zD", "0bEVAsoxw6W3iWGX6BxBwig2lvfARzA8", "5kBw8VexBy79GKA0j07dIkKJ", "062DxPuwmCK6gWRcItF5YTW3Hm4KDyy6", "ouexH0ba", "qAJVUQLE", "GBKgEyO20ouPxSasMb", "BGZyEH20hLZ9tDha5NwFDNnmUBWPcH0M"};

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[3].charAt(0) != strArr[1].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "tBRy7z9w";
            strArr2[4] = "5uJXeywj";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 69);
            i4++;
        }
    }

    public static void A07() {
        A00 = new byte[]{-32, C2638Cg0.n7, -36, -37, C2638Cg0.n7, C2638Cg0.B7, -2, C8077mf.m, C8077mf.m, 8, C8077mf.E, 1, C8077mf.x, C8077mf.n, 8, 5, -1, 5, C8077mf.r, C8077mf.E, C8077mf.r, 1, C8077mf.q, C8077mf.r, C8077mf.E, 9, C8077mf.m, 0, 1, C8077mf.E, 7, 1, C8077mf.y, -66, C2638Cg0.x7, C2638Cg0.x7, -56, -37, C2638Cg0.s7, C2638Cg0.A7, -37, C2638Cg0.q7, -47, C2638Cg0.w7, C2638Cg0.w7, C2638Cg0.p7, -56, -37, -56, C2638Cg0.x7, C2638Cg0.r7, C2638Cg0.r7, C2638Cg0.p7, C2638Cg0.o7, -119, -106, -106, -109, -90, -112, -102, -90, -100, -107, -112, -101, -96, -56, -43, -43, -46, -27, -45, C2638Cg0.A7, -34, C2638Cg0.x7, C2638Cg0.w7, -27, C2638Cg0.u7, -37, C2638Cg0.w7, C2638Cg0.A7, C2638Cg0.x7, -44, C2638Cg0.v7, C2638Cg0.x7, -27, -47, C2638Cg0.x7, -33, -94, -81, -81, -84, -65, -78, -74, -65, -90, -95, -87, -84, -65, -81, -82, -65, -93, -95, -93, -88, -91, -65, -90, -95, -87, -84, -75, -78, -91, -65, -85, -91, -71, C2638Cg0.n7, -21, -28, C2638Cg0.B7, -30, -37, -11, -23, -37, -22, -22, -33, -28, -35, -23, -11, C2638Cg0.C7, -37, -17, C2638Cg0.n7, -43, -24, -43, -13, -28, -26, -29, -41, C2638Cg0.E7, -25, -25, -35, -30, -37, -13, -29, -28, -24, -35, -29, -30, -25, -13, -41, -29, -23, -30, -24, -26, -19, -13, -33, C2638Cg0.E7, -19, C2638Cg0.o7, -67, -48, -67, -37, -52, C2638Cg0.z7, C2638Cg0.x7, -65, C2638Cg0.p7, C2638Cg0.A7, C2638Cg0.A7, C2638Cg0.s7, C2638Cg0.w7, C2638Cg0.r7, -37, C2638Cg0.x7, -52, -48, C2638Cg0.s7, C2638Cg0.x7, C2638Cg0.w7, C2638Cg0.A7, -37, C2638Cg0.u7, C2638Cg0.p7, -43, -7, -10, 9, -10, C8077mf.x, 5, 7, 4, -8, -6, 8, 8, -2, 3, -4, C8077mf.x, 4, 5, 9, -2, 4, 3, 8, C8077mf.x, 8, 9, -10, 9, -6, C8077mf.x, 0, -6, C8077mf.p, -80, -79, -81, -68, -98, -95, -68, -94, -75, -83, -94, -81, -90, -94, -85, -96, -94, -68, -79, -74, -83, -94, -28, -27, -29, -16, -46, -43, -16, C2638Cg0.B7, -43, -16, -36, -42, -22, C8077mf.r, 17, C8077mf.q, 28, -2, 1, 28, 17, 2, C8077mf.r, 17, 28, 17, C8077mf.z, 13, 2, 28, 8, 2, C8077mf.z, -86, -85, -87, -74, -103, -96, -101, -74, -89, -104, -80, -93, -90, -104, -101, -74, -94, -100, -80, C2638Cg0.x7, -52, C2638Cg0.w7, -41, -70, -52, -41, -52, C2638Cg0.u7, C2638Cg0.r7, -67, C2638Cg0.t7, -41, -67, -48, -52, C2638Cg0.w7, -71, C2638Cg0.x7, -74, -73, -75, C2638Cg0.q7, -91, -72, -79, -89, -81, -88, C2638Cg0.q7, -82, -88, -68, -8, -7, -9, 4, -24, -15, -18, -22, -13, -7, 4, -8, -23, -16, 4, -5, -22, -9, -8, -18, -12, -13, -104, -103, -105, -92, -118, -99, -103, -105, -122, -92, -115, -114, -109, -103, -104, -92, -112, -118, -98, -8, -7, -9, 4, -18, -13, -7, 4, -24, -26, -24, -19, -22, 4, -21, -15, -26, -20, -8, -6, -5, -7, 6, -12, -20, -21, -16, -24, -5, -16, -10, -11, 6, -21, -24, -5, -24, 6, -14, -20, 0, C2638Cg0.E7, C2638Cg0.B7, C2638Cg0.n7, -27, -45, C2638Cg0.x7, C2638Cg0.w7, C2638Cg0.A7, C2638Cg0.u7, C2638Cg0.B7, C2638Cg0.A7, -43, -44, -27, C2638Cg0.E7, C2638Cg0.x7, C2638Cg0.n7, -36, C2638Cg0.A7, C2638Cg0.v7, C2638Cg0.x7, -27, -47, C2638Cg0.x7, -33, -88, -87, -89, -76, -91, -95, -106, -104, -102, -94, -102, -93, -87, -76, -96, -102, -82};
    }

    static {
        A07();
    }

    public static Bundle A00(T8 t8) {
        Bundle bundle = new Bundle();
        A08(bundle, t8);
        String A06 = A06(123, 19, 81);
        Bundle data = A01(t8);
        bundle.putBundle(A06, data);
        return bundle;
    }

    public static Bundle A01(T8 t8) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(A06(67, 23, 65), AdSettings.isMixedAudience());
        bundle.putBoolean(A06(6, 27, 119), AdInternalSettings.isExplicitTestMode());
        String adTypeString = AdSettings.getTestAdType().getAdTypeString();
        if (adTypeString != null) {
            bundle.putString(A06(272, 20, 120), adTypeString);
        }
        MultithreadedBundleWrapper multithreadedBundleWrapper = AdInternalSettings.sSettingsBundle;
        String adTypeString2 = A06(177, 27, 55);
        String[] stringArray = multithreadedBundleWrapper.getStringArray(adTypeString2);
        if (stringArray != null) {
            bundle.putStringArray(adTypeString2, stringArray);
        }
        MultithreadedBundleWrapper multithreadedBundleWrapper2 = AdInternalSettings.sSettingsBundle;
        String adTypeString3 = A06(C3503Kz.f0, 35, 79);
        Integer integer = multithreadedBundleWrapper2.getInteger(adTypeString3);
        if (integer != null) {
            bundle.putInt(adTypeString3, integer.intValue());
        }
        MultithreadedBundleWrapper multithreadedBundleWrapper3 = AdInternalSettings.sSettingsBundle;
        String adTypeString4 = A06(204, 33, 112);
        Integer integer2 = multithreadedBundleWrapper3.getInteger(adTypeString4);
        if (integer2 != null) {
            bundle.putInt(adTypeString4, integer2.intValue());
        }
        MultithreadedBundleWrapper multithreadedBundleWrapper4 = AdInternalSettings.sSettingsBundle;
        String adTypeString5 = A06(426, 25, 65);
        String string = multithreadedBundleWrapper4.getString(adTypeString5, null);
        if (string != null) {
            bundle.putString(adTypeString5, string);
        }
        bundle.putBoolean(A06(54, 13, 2), XY.A05(t8));
        return bundle;
    }

    public static Bundle A02(String str, C1783iY c1783iY) {
        Bundle bundle = new Bundle();
        A08(bundle, c1783iY.A05());
        bundle.putString(A06(451, 17, 16), c1783iY.A0A());
        bundle.putString(A06(259, 13, 76), str);
        bundle.putString(A06(292, 19, 18), c1783iY.A07());
        bundle.putString(A06(366, 19, 0), c1783iY.A08());
        bundle.putString(A06(ServiceStarter.g, 22, 98), c1783iY.A09());
        bundle.putString(A06(385, 19, 96), OT.A01(c1783iY.A0B()));
        RewardData A03 = c1783iY.A03();
        if (A03 != null) {
            OY.A00(bundle, A03);
        }
        C1673gi A05 = c1783iY.A05();
        if (A01[7].charAt(1) != 'G') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "0oVBtG1RnxV7P3aL2rsTsgmpFLriyJEV";
        strArr[1] = "0Gc5rqVWsYOknMrZ8UJ0maJdrGSSYWXy";
        bundle.putBundle(A06(123, 19, 81), A01(A05));
        return bundle;
    }

    public static Bundle A03(String str, C1768iI c1768iI) {
        Bundle bundle = new Bundle();
        A08(bundle, c1768iI.A0B);
        bundle.putString(A06(451, 17, 16), c1768iI.A0D);
        bundle.putString(A06(259, 13, 76), str);
        bundle.putString(A06(292, 19, 18), c1768iI.A05);
        bundle.putString(A06(366, 19, 0), c1768iI.A06);
        bundle.putString(A06(ServiceStarter.g, 22, 98), c1768iI.A07);
        AdExperienceType adExperienceType = c1768iI.A02;
        if (adExperienceType != null) {
            bundle.putString(A06(237, 22, 24), OS.A02(adExperienceType));
        }
        bundle.putBoolean(A06(90, 33, 27), c1768iI.A08);
        RewardData rewardData = c1768iI.A03;
        if (rewardData != null) {
            OY.A00(bundle, rewardData);
        }
        bundle.putBundle(A06(123, 19, 81), A01(c1768iI.A0B));
        return bundle;
    }

    public static C1783iY A04(C1673gi c1673gi, Bundle bundle, String str) {
        String string = bundle.getString(A06(451, 17, 16));
        String placement = A06(292, 19, 18);
        String string2 = bundle.getString(placement);
        String placement2 = A06(366, 19, 0);
        String string3 = bundle.getString(placement2);
        String placement3 = A06(ServiceStarter.g, 22, 98);
        String sdkVersion = bundle.getString(placement3);
        String placement4 = A06(344, 22, 96);
        String string4 = bundle.getString(placement4);
        String placement5 = A06(123, 19, 81);
        Bundle bundle2 = bundle.getBundle(placement5);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (string == null) {
            string = A06(0, 0, 60);
        }
        C1783iY c1783iY = new C1783iY(c1673gi, null, string, new C1774iP(str, string4, bundle2));
        c1783iY.A0I(string3);
        c1783iY.A0H(string2);
        c1783iY.A0J(sdkVersion);
        String placement6 = A06(385, 19, 96);
        c1783iY.A0K(OT.A02(bundle.getString(placement6)));
        RewardData A012 = OY.A01(bundle);
        if (A012 != null) {
            c1783iY.A0F(A012);
        }
        return c1783iY;
    }

    public static C1768iI A05(C1673gi c1673gi, Bundle bundle, String str) {
        String string = bundle.getString(A06(451, 17, 16));
        String rvPlacement = A06(292, 19, 18);
        String string2 = bundle.getString(rvPlacement);
        String rvPlacement2 = A06(90, 33, 27);
        boolean z = bundle.getBoolean(rvPlacement2);
        String rvPlacement3 = A06(366, 19, 0);
        String adExperienceType = bundle.getString(rvPlacement3);
        String rvPlacement4 = A06(ServiceStarter.g, 22, 98);
        String mediationData = bundle.getString(rvPlacement4);
        String rvPlacement5 = A06(237, 22, 24);
        String string3 = bundle.getString(rvPlacement5);
        String rvPlacement6 = A06(344, 22, 96);
        String string4 = bundle.getString(rvPlacement6);
        String rvPlacement7 = A06(123, 19, 81);
        Bundle bundle2 = bundle.getBundle(rvPlacement7);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (string == null) {
            string = A06(0, 0, 60);
        }
        C1768iI c1768iI = new C1768iI(c1673gi, string, null, new C1774iP(str, string4, bundle2));
        c1768iI.A06 = adExperienceType;
        c1768iI.A05 = string2;
        c1768iI.A08 = z;
        c1768iI.A02 = OS.A00(string3);
        c1768iI.A07 = mediationData;
        RewardData A012 = OY.A01(bundle);
        if (A012 != null) {
            c1768iI.A03 = A012;
        }
        return c1768iI;
    }

    public static void A08(Bundle bundle, T8 t8) {
        bundle.putString(A06(344, 22, 96), A06(0, 6, 101));
        boolean z = false;
        boolean isForcedFunnelLogging = t8 instanceof C1673gi;
        if (isForcedFunnelLogging) {
            z = ((C1673gi) t8).A0F().AAT();
        }
        boolean isForcedFunnelLogging2 = TX.A0I(t8);
        bundle.putBoolean(A06(33, 21, 55), isForcedFunnelLogging2 || z);
        bundle.putString(A06(330, 14, 30), t8.getPackageName());
        boolean isForcedFunnelLogging3 = AbstractC1126Us.A0G(t8);
        if (isForcedFunnelLogging3) {
            bundle.putString(A06(311, 19, 51), new C1069Sn().A03(t8));
        }
    }
}
