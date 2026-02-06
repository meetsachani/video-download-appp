package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.dynamicloading.FlashPreferences;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.lang.Thread;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C10997yd1;
import o.C2638Cg0;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public final class U2 {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static String[] A03 = {"i0FOsf0o9fpBvAlaEaGgnCYFRbNnwBKJ", "ZsBa2nEfyhltTo", "ZG6g5nWnUhxh", "6zjosiDwJWE47kuMvKAUCDrCWUeR8P3q", "Gh89HIHHDqfPtiuASbXLVil627eRz", "Lsbp3nhJR34oAmuvtJAouWbaxC4Ny9OM", "s0Y", "C"};
    public static final AtomicBoolean A04;
    public static final AtomicBoolean A05;
    public static final AtomicBoolean A06;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 33);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-89, C2638Cg0.E7, C2638Cg0.E7, -89, C2638Cg0.E7, -88, C2638Cg0.n7, -84, C2638Cg0.w7, C2638Cg0.t7, C2638Cg0.s7, -7, -24, -19, -23, -14, -25, -23, -46, -23, -8, -5, -13, -10, -17, -88, -103, -96, 117, -66, C2638Cg0.r7, -66, C2638Cg0.v7, -66, -74, C2638Cg0.p7, -66, C2638Cg0.A7, -74, C2638Cg0.v7, -66, -60, C2638Cg0.r7, 117, -56, C2638Cg0.v7, -74, C2638Cg0.u7, C2638Cg0.v7, -70, -71, -84, -67, -60, 121, -48, -70, -52, 121, -70, C2638Cg0.s7, C2638Cg0.x7, -66, -70, -67, -46, 121, C2638Cg0.q7, C2638Cg0.u7, C2638Cg0.q7, C2638Cg0.y7, C2638Cg0.q7, -70, C2638Cg0.s7, C2638Cg0.q7, -45, -66, -67, 122, 121, -84, -60, C2638Cg0.q7, C2638Cg0.v7, C2638Cg0.v7, C2638Cg0.q7, C2638Cg0.u7, C2638Cg0.o7, -121, -90, -68, C2638Cg0.q7, 109, -79, -68, -69, 116, C2638Cg0.p7, 109, -80, -82, -71, -71, 109, -114, C2638Cg0.q7, -79, -74, -78, -69, -80, -78, -101, -78, C2638Cg0.p7, -60, -68, -65, -72, -114, -79, C2638Cg0.o7, 123, -74, -69, -74, C2638Cg0.p7, -74, -82, -71, -74, C2638Cg0.u7, -78, 117, 118, 123, 109, -96, -68, -70, -78, 109, -77, C2638Cg0.q7, -69, -80, C2638Cg0.p7, -74, -68, -69, -82, -71, -74, C2638Cg0.p7, C2638Cg0.t7, 109, -70, -82, C2638Cg0.t7, 109, -69, -68, C2638Cg0.p7, 109, -60, -68, -65, -72, 109, -67, -65, -68, -67, -78, -65, -71, C2638Cg0.t7, 123, -120, -105, -112, C2638Cg0.t7, -52, C2638Cg0.p7, -45, -56, 0, 6, -5, 13, 2, -7, -3, 9, 8, 0, 3, 1, -42, -44, -35, -44, C2638Cg0.C7, C2638Cg0.n7, -46, -3, 2, -3, 8, -3, -11, 0, -3, C8077mf.p, -7, C2638Cg0.y7, -46, C2638Cg0.y7, C2638Cg0.n7, C2638Cg0.y7, C2638Cg0.s7, -48, C2638Cg0.y7, -34, C2638Cg0.v7, -116, -115, -124, -46, -45, C2638Cg0.n7, -124, C2638Cg0.u7, C2638Cg0.s7, -48, -48, C2638Cg0.v7, -56, -110, 1, -10, 8, 9, -12, 7, -6, 8, 10, 1, 9};
    }

    static {
        A03();
        A06 = new AtomicBoolean();
        A04 = new AtomicBoolean();
        A05 = new AtomicBoolean();
    }

    public static C1517eB A00() {
        return new C1517eB();
    }

    public static C1516eA A01(C1669ge c1669ge) {
        return new C1516eA(c1669ge);
    }

    public static void A04(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        Y4.A01.execute(new C1518eC(initListener, initResult));
    }

    public static void A06(C1669ge c1669ge) {
        if (AbstractC1125Ur.A0P(c1669ge) && !A05.getAndSet(true)) {
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = new TT(Thread.getDefaultUncaughtExceptionHandler(), c1669ge, new C1451d6());
                Thread.setDefaultUncaughtExceptionHandler(defaultUncaughtExceptionHandler);
            } catch (Exception e) {
                c1669ge.A08().ABC(A02(198, 7, 78), AbstractC1085Td.A1X, new C1086Te(e));
            }
        }
    }

    public static void A07(C1669ge c1669ge) {
        A0H(c1669ge, null, null, 3);
    }

    public static void A08(C1669ge c1669ge) {
        A0H(c1669ge, null, null, 3);
    }

    public static void A09(C1669ge c1669ge) {
        if (C1123Up.A2O(c1669ge)) {
            A0F(c1669ge, 0);
        }
        if (C1123Up.A2X(c1669ge)) {
            A0B(c1669ge);
        }
    }

    public static void A0A(C1669ge c1669ge) {
        if (C1123Up.A2P(c1669ge)) {
            String[] strArr = A03;
            if (strArr[1].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[1] = "XjvPwbQrSqkAxC";
            strArr2[6] = "skO";
            A0G(c1669ge, null, 3);
        }
    }

    public static void A0B(C1669ge c1669ge) {
        YG.A06.execute(new C1519eD(c1669ge));
    }

    public static void A0C(C1669ge c1669ge) {
        OP.A02(c1669ge);
        TX.A0C(c1669ge, new C1421cc(c1669ge), new C1569f2(), BuildConfigApi.isDebug());
        c1669ge.A0A();
        A0D(c1669ge);
    }

    public static void A0D(C1669ge c1669ge) {
        if (ProcessUtils.isRemoteRenderingProcess()) {
            return;
        }
        SharedPreferences sharedPreferences = FlashPreferences.getSharedPreferences(c1669ge);
        String string = sharedPreferences.getString(A02(C10997yd1.Q1, 12, 121), null);
        String string2 = sharedPreferences.getString(A02(239, 11, 116), null);
        if (string != null && string2 != null) {
            InterfaceC1084Tc A08 = c1669ge.A08();
            C1086Te c1086Te = new C1086Te(string2);
            String flashConfig = A02(181, 5, 63);
            A08.ABz(flashConfig, 3701, c1086Te);
        }
    }

    public static void A0F(C1669ge c1669ge, int i) {
        T7.A01(c1669ge);
        if (A04.getAndSet(true)) {
            return;
        }
        if (AdInternalSettings.isDebugBuild() || AdInternalSettings.isDebuggerOn()) {
            AbstractC1156Vy.A02();
        }
        A06(c1669ge);
        AbstractC1163Wf.A00(C1123Up.A0q(c1669ge), BuildConfigApi.isDebug(), A00(), A01(c1669ge));
        C1064Si.A03(C1123Up.A04(c1669ge));
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            C1642gD.A09(new C1507e1(c1669ge));
        }
        if (i == 3) {
            Log.e(A02(8, 17, 99), A02(89, 89, 44));
            c1669ge.A08().ABz(A02(178, 3, 6), AbstractC1085Td.A0R, new C1086Te(A02(C10997yd1.z1, 24, 67)));
        }
        ActivityUtils.A04(c1669ge, AudienceNetworkActivity.class);
        YG.A05(c1669ge);
        VL.A05(c1669ge);
        N8.A01(c1669ge);
        if (C1123Up.A16(c1669ge)) {
            RX.A00(c1669ge);
        }
        if (C1123Up.A1z(c1669ge)) {
            ZR.A02().A90(c1669ge);
        }
    }

    public static void A0G(C1669ge c1669ge, AudienceNetworkAds.InitListener initListener, int i) {
        T7.A01(c1669ge);
        boolean z = false;
        synchronized (U2.class) {
            boolean execute = A00;
            if (!execute) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        boolean execute2 = A01;
                        if (!execute2) {
                            A01 = true;
                            z = true;
                        }
                    }
                }
                A00 = true;
                z = true;
            }
        }
        if (z) {
            A0F(c1669ge, i);
            YG.A08.execute(new C1544ed(c1669ge, initListener));
        } else if (i != 1) {
        } else {
            String A022 = A02(51, 38, 56);
            if (initListener != null) {
                A04(initListener, new U1(true, A022));
            } else {
                Log.w(A02(8, 17, 99), A022);
            }
        }
    }

    public static void A0H(C1669ge c1669ge, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, int i) {
        AbstractC1156Vy.A05(A02(205, 10, 115), A02(25, 26, 52), A02(0, 8, 82));
        C1642gD.A06();
        A0G(c1669ge, initListener, i);
    }

    public static synchronized boolean A0I() {
        boolean z;
        synchronized (U2.class) {
            z = A00;
        }
        return z;
    }
}
