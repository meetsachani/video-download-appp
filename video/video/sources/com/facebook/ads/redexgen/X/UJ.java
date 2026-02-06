package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.C10997yd1;
import o.C2638Cg0;
import o.C3307Iz;
import o.C3503Kz;
import o.C8077mf;
import o.ED2;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class UJ {
    public static String A00;
    public static byte[] A01;
    public static String[] A02 = {"qZcb6NmBns1n3v1", "rTLETUx3xNnjwSb02Sx6jVZM5Fuzg7Of", "ujF8Yx1ooHYTWOANWsLoHgp9GHsWq5OG", "emoc9RIZRY17k1iV3jHEmbNdIKvpuqWe", "9dj0hHqqeHaqkXambHAPXjsskYxWzSoy", "H6Wp9lsP8ocDK9Bk7hE2Cfl7XjXVKK5i", "baRwZ59Bd0PN8tFBdjuxnLHZSOlJTNRT", "2xLvEFwTfIQTf34sGOrn6donSx3FaGAc"};
    public static final AtomicReference<String> A03;
    public static final AtomicBoolean A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{-56, 3, -18, -22, -23, -10, -41, -23, C8077mf.G, C8077mf.n, 17, 13, C8077mf.z, C8077mf.m, 13, -10, 13, 28, 31, C8077mf.A, C8077mf.D, 19, -18, C8077mf.A, C8077mf.D, -23, C8077mf.z, C8077mf.n, C8077mf.D, C8077mf.A, 17, C8077mf.n, -29, -18, -22, -5, -10, -41, 6, -18, -7, -11, -12, 9, -30, -18, -7, -11, -11, 9, -30, -71, -60, C2638Cg0.o7, C2638Cg0.w7, C2638Cg0.p7, -83, C2638Cg0.x7, -42, -46, -29, -26, -65, C2638Cg0.p7, -67, -68, -67, -86, C2638Cg0.v7, C2638Cg0.s7, C2638Cg0.E7, -42, -78, 64, 57, 79, 62, 69, 60, 60, 54, 79, 76, 79, 80, 88, 79, -9, 57, 69, 67, 4, 60, 55, 57, 59, 56, 69, 69, 65, 4, 55, 58, 73, 4, ED2.a, 68, 74, 59, 72, 68, 55, 66, 4, 75, 55, 52, 50, 59, 50, ED2.a, 54, 48, C8077mf.C, C3307Iz.X, C3307Iz.X, C3307Iz.V, -33, C8077mf.u, C8077mf.B, C8077mf.z, 31, C3307Iz.X, 31, C8077mf.G, C8077mf.q, 28, 9, C8077mf.m, 17, C8077mf.q, C8077mf.B, C8077mf.H, -20, -22, -36, -23, -42, C2638Cg0.n7, -34, -36, -27, -21, -42, -29, C2638Cg0.n7, -22, -21, -42, -23, -36, -35, -23, -36, -22, -33, 59, C3307Iz.a0, C3307Iz.Y, 35, 58, C3307Iz.e0, C3307Iz.a0, 59};
    }

    static {
        A07();
        A00 = A00(80, 7, 107);
        A04 = new AtomicBoolean();
        A03 = new AtomicReference<>();
    }

    public static String A01(T8 t8) {
        return WebSettings.getDefaultUserAgent(t8);
    }

    public static String A02(T8 t8) {
        FutureTask futureTask = new FutureTask(new UI(t8));
        for (int i = 0; i < 3; i++) {
            Y4.A00(futureTask);
            try {
                return (String) futureTask.get();
            } catch (Throwable th) {
                A08(t8, th);
                SystemClock.sleep(500L);
            }
        }
        return null;
    }

    public static String A03(T8 t8, C1096To c1096To) {
        String A07 = c1096To.A07();
        if (TextUtils.isEmpty(A07) && !A04.getAndSet(true)) {
            InterfaceC1084Tc A08 = t8.A08();
            int i = AbstractC1085Td.A1Z;
            String bundle = A00(73, 7, 122);
            C1086Te c1086Te = new C1086Te(bundle);
            String bundle2 = A00(116, 7, 87);
            A08.ABC(bundle2, i, c1086Te);
        }
        return A07;
    }

    public static String A04(T8 t8, boolean z) {
        if (t8 == null) {
            return A00;
        }
        if (z) {
            return System.getProperty(A00(123, 10, 59));
        }
        String str = A03.get();
        if (str != null) {
            return str;
        }
        long spUserAgentRefresh = AbstractC1122Uo.A01(t8);
        String A002 = A00(C3503Kz.g0, 23, 1);
        String A003 = A00(C3503Kz.W, 10, 52);
        String A004 = A00(88, 28, 96);
        if (spUserAgentRefresh > 0) {
            SharedPreferences sharedPreferences = t8.getSharedPreferences(ProcessUtils.getProcessSpecificName(A004, t8), 0);
            String string = sharedPreferences.getString(A003, null);
            long j = sharedPreferences.getLong(A002, 0L);
            if (!TextUtils.isEmpty(string) && System.currentTimeMillis() - j < spUserAgentRefresh) {
                A03.set(string);
                String[] strArr = A02;
                String str2 = strArr[6];
                String browserUserAgent = strArr[3];
                if (str2.charAt(17) != browserUserAgent.charAt(17)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[6] = "raDju45r7vWAWvtCMjs7ezmbeHuUzRMZ";
                strArr2[3] = "IEXEfOXuBGyf1jRfSjx88B0PyUJh9Pa6";
                return string;
            }
        }
        String str3 = null;
        try {
            str3 = A01(t8);
            A03.set(str3);
        } catch (Throwable t) {
            A08(t8, t);
        }
        if (str3 == null) {
            str3 = A02(t8);
        }
        if (str3 == null) {
            return A00;
        }
        if (spUserAgentRefresh > 0) {
            SharedPreferences sharedPreferences2 = t8.getSharedPreferences(ProcessUtils.getProcessSpecificName(A004, t8), 0);
            sharedPreferences2.edit().putString(A003, A03.get()).apply();
            sharedPreferences2.edit().putLong(A002, System.currentTimeMillis()).apply();
        }
        return str3;
    }

    public static String A05(C1096To c1096To, T8 t8) {
        if (AbstractC1122Uo.A04(t8)) {
            return A00(63, 5, 5) + A03(t8, c1096To) + A00(39, 6, 61) + c1096To.A06() + A00(45, 6, 61) + c1096To.A04() + A00(38, 1, 85);
        }
        return A00(0, 0, 76);
    }

    public static String A06(C1096To c1096To, T8 t8, boolean z) {
        return A04(t8, z) + A00(0, 38, 50) + t8.A05().A9S() + A00(57, 6, 26) + C1096To.A04 + A00(38, 1, 85) + A05(c1096To, t8) + A00(68, 5, 13) + t8.A05().A9T() + A00(51, 6, 8) + Locale.getDefault().toString() + A00(87, 1, 36);
    }

    public static void A08(T8 t8, Throwable th) {
        t8.A08().ABC(A00(C10997yd1.t1, 8, 78), AbstractC1085Td.A2i, new C1086Te(th));
    }
}
