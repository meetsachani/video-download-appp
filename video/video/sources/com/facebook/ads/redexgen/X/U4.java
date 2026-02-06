package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C10997yd1;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;
import o.QC1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network/classes2.dex */
public final class U4 {
    public static byte[] A00;
    public static String[] A01 = {"45sljFocWSeUIm", "kFy0iLqCQu1rSjegRu3gZQBslrN28zfh", "Jt25Esr0vPr63IR3ofREXbE2F9XS", "aIy3uOWBpnLKLBqKI1xznCdUmB4uZWmr", "OU2R0KFOTNKkc0fC1q8eYWzKYBY", "OKiYeSmWG", "N6c8h1LLghxAImqWtVZLONNsuls", "y1x9YRSrIuYSzULWME6mF7szl8n2nmJ"};
    public static final String A02;
    public static final AtomicBoolean A03;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 54);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{108, 0, 55, C3307Iz.c0, C3307Iz.f0, C3307Iz.Y, 1, C3307Iz.e0, C3307Iz.d0, 36, C3307Iz.c0, C3307Iz.X, 105, 70, 76, 90, 71, 65, 76, 8, 123, 108, 99, 8, 74, 93, 65, 68, 92, 8, 78, 71, 90, 8, 80, C8077mf.r, C8077mf.H, 17, 6, C8077mf.D, 31, C8077mf.A, C8077mf.n, 7, 10, 3, C8077mf.z, C8077mf.C, 53, 47, 54, 62, 122, 52, 53, C3307Iz.f0, 122, 59, 62, 62, 122, 42, 59, 40, 59, 55, ED2.a, C3307Iz.f0, ED2.a, 40, 96, C8077mf.y, C8077mf.x, 19, 4, C8077mf.z, 99, 75, 83, 74, 71, 82, 73, 84, C8077mf.x, 54, C4715Xk.i, 42, 62, 60, C3307Iz.Z, 58, 60, C4715Xk.i, 69, 36, 74, 51, 34, 57, 13, C3307Iz.V, 59, 40, 55, 100, 117, 117, 90, 118, 113, 100, 119, 113, 96, 97, 90, 119, 96, 100, 118, 106, 107, 79, 88, 68, 65, 73, 114, 89, 84, 93, 72, C4715Xk.i, 60, 59, C3307Iz.d0, 62, 6, 47, 56, 53, C3307Iz.d0, 60, C8077mf.q, 13, 6, 13, C8077mf.D, 1, C8077mf.m, 115, 123, 123, 115, QC1.w, 113, 75, 103, 112, Byte.MAX_VALUE, 99, 121, 85, 110, 111, 104, Byte.MAX_VALUE, 109, 109, 107, 104, 102, 111, C8077mf.n, C8077mf.z, 58, 0, 8, C8077mf.r, 87, 74, 78, 70, 89, 76, 77, 70, 124, 76, 69, 69, 80, 70, 87, 95, 68, 65, 68, 69, 93, 68};
    }

    static {
        A06();
        A02 = U4.class.getSimpleName();
        A03 = new AtomicBoolean();
    }

    public static int A00() {
        return TimeZone.getDefault().getRawOffset();
    }

    public static long A01(T8 t8, String str) {
        try {
            PackageManager packageManager = t8.getPackageManager();
            if (packageManager == null) {
                return -1L;
            }
            return new File(packageManager.getApplicationInfo(str, 0).publicSourceDir).length();
        } catch (Exception e) {
            String[] strArr = A01;
            if (strArr[2].length() != strArr[7].length()) {
                String[] strArr2 = A01;
                strArr2[1] = "r1yKAsFrz8T6kTbDeRMAIryo3adSH8UC";
                strArr2[3] = "KmyFzAC6ois190XCewwcScJ1n5axjY80";
                if (A03.compareAndSet(false, true)) {
                    t8.A08().ABC(A02(C3503Kz.h0, 7, 94), AbstractC1085Td.A1E, new C1086Te(e));
                }
                return -1L;
            }
            throw new RuntimeException();
        }
    }

    public static String A03(Context context) {
        try {
            Field buildType = Class.forName(context.getPackageName() + A02(0, 12, 116)).getDeclaredField(A02(37, 10, 101));
            return (String) buildType.get(null);
        } catch (Exception unused) {
            return A02(94, 3, 61);
        }
    }

    public static String A04(Context context) {
        try {
            Field buildType = Class.forName(context.getPackageName() + A02(0, 12, 116)).getDeclaredField(A02(71, 5, 103));
            return String.valueOf(buildType.getBoolean(null));
        } catch (Exception unused) {
            return A02(94, 3, 61);
        }
    }

    public static String A05(T8 t8, String str) {
        JSONObject jSONObject = new JSONObject();
        A07(t8, jSONObject, A02(C10997yd1.y1, 6, 83), String.valueOf(A08()));
        A07(t8, jSONObject, A02(97, 8, 100), String.valueOf(A01(t8, str)));
        A07(t8, jSONObject, A02(180, 15, 21), String.valueOf(A00()));
        A07(t8, jSONObject, A02(105, 18, 51), String.valueOf(AbstractC1172Wp.A00(t8)));
        A07(t8, jSONObject, A02(C10997yd1.q1, 13, 60), String.valueOf(A09(t8)));
        A07(t8, jSONObject, A02(C3503Kz.W, 11, 111), A04(t8));
        A07(t8, jSONObject, A02(123, 10, 27), A03(t8));
        return jSONObject.toString();
    }

    public static void A07(T8 t8, JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            if (t8.A05().AAO()) {
                Log.e(A02, A02(47, 24, 108), e);
            }
        }
    }

    public static boolean A08() {
        String str = Build.FINGERPRINT;
        String A022 = A02(C3503Kz.h0, 7, 94);
        if (!str.contains(A022) && !Build.FINGERPRINT.startsWith(A02(195, 7, 28))) {
            String str2 = Build.MODEL;
            String A023 = A02(C3503Kz.k0, 10, 34);
            if (!str2.contains(A023) && !Build.MODEL.contains(A02(76, 8, 16))) {
                String str3 = Build.MODEL;
                String[] strArr = A01;
                if (strArr[6].length() != strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[6] = "CTJ6oNGQrsuCzXfrpGcSjdlcrxq";
                strArr2[4] = "Vk4ircYNHpPTfJ73X6WLPy0mTCx";
                if (!str3.contains(A02(12, 25, 30)) && !Build.MANUFACTURER.contains(A02(84, 10, 101)) && ((!Build.BRAND.startsWith(A022) || !Build.DEVICE.startsWith(A022)) && !A023.equals(Build.PRODUCT))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean A09(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }
}
