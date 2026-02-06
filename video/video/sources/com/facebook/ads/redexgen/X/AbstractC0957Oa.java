package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.ads.AdSDKNotificationListener;
import com.facebook.ads.AdSDKNotificationManager;
import com.facebook.ads.internal.adnotification.InternalAppAdCTAClickNotificationListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.Oa  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0957Oa {
    public static String A00;
    public static String A01;
    public static byte[] A02;
    public static String[] A03 = {"Q2DZPMAW2yeQLbmmbfWH", "FQ0yrAaGYgr4mdqTvnLCAfi7gpajL", "1hQSRsoeRQ52OVueqemqWssHdomhD1Oc", "dcU3JA", "DGXXVImbyRvx6", "DMg70IVEwE3Kkzjo7dV3", "", "yfZMPiXEj5vSY"};
    public static final AtomicReference<InternalAppAdCTAClickNotificationListener> A04;
    public static final AtomicReference<InterfaceC0959Oc> A05;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{6, C8077mf.m, 17, C8077mf.u, C8077mf.p, 3, C8077mf.E, C4715Xk.i, 4, 13, C8077mf.r, C8077mf.q, 3, C8077mf.z, 40, C3307Iz.a0, 6, 55, 55, 6, 35, 4, 19, 6, 4, C3307Iz.c0, C3307Iz.f0, 36, C3307Iz.d0, 69, 68, 99, 71, 90, 88, 79, 89, 89, 67, 69, 68, 8, 31, C8077mf.r, 36, 13, C8077mf.H, 9, 8, C8077mf.u, C8077mf.x, C8077mf.y};
    }

    static {
        A01();
        A01 = A00(41, 11, 42);
        A00 = A00(0, 14, 51);
        A05 = new AtomicReference<>();
        A04 = new AtomicReference<>();
    }

    public static void A02(String str, Bundle bundle) {
        ArrayList arrayList;
        A05.get();
        if (0 != 0) {
            bundle.getString(A01);
            bundle.getString(A00);
            throw new NullPointerException(A00(29, 12, 123));
        } else if (TextUtils.isEmpty(str)) {
        } else {
            List<AdSDKNotificationListener> listeners = AdSDKNotificationManager.getNotificationListeners();
            synchronized (listeners) {
                arrayList = new ArrayList(AdSDKNotificationManager.getNotificationListeners());
            }
            Y4.A00(new OZ(arrayList, str));
        }
    }

    public static void A03(String str, String str2, String str3) {
        if (A04 != null) {
            InternalAppAdCTAClickNotificationListener internalAppAdCTAClickNotificationListener = A04.get();
            String[] strArr = A03;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "6F2nH21UZcfDLDfNhpfU";
            strArr2[4] = "szNZ34FR6m0ld";
            if (internalAppAdCTAClickNotificationListener != null) {
                A04.get();
                throw new NullPointerException(A00(14, 15, 22));
            }
        }
    }
}
