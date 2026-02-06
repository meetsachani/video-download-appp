package com.facebook.ads.redexgen.X;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.Arrays;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.QC1;

/* loaded from: assets/audience_network/classes2.dex */
public final class XY {
    public static byte[] A00;
    public static String[] A01 = {"fKOq3CLbRisV2HCvxbP8DswDC3h61WtS", "qQcG8iivYcbnleQXnFNfPBjKpUSTKwt1", "90Y8NMpYXvys60lz4Y4AY7bkcR6rkmkz", "C2raqoqRf1xXuaxgLg", "Co6wMAKL4SYYucOnnpwSDFFGSy", "pPL6tu27HuVGqH4ILm", "ywYYaeUt5bOEJr09A3", "jMc4mNTDFQmf2DaMzWYBnxz0IZlySjfz"};
    public static final String A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{C8077mf.E, 57, 54, Byte.MAX_VALUE, C3307Iz.d0, QC1.w, 60, C4715Xk.i, C3307Iz.d0, C4715Xk.i, 42, 53, 49, 54, C4715Xk.i, QC1.w, 49, 62, QC1.w, 57, 40, 40, QC1.w, 49, C3307Iz.c0, QC1.w, 13, 54, 49, C3307Iz.d0, C3307Iz.V, 118, 55, 13, 94, C3307Iz.c0, C8077mf.r, C8077mf.A, 10, 7, 94, 31, C8077mf.p, C8077mf.p, 68, 94, 88, 84, 86, C8077mf.y, 93, 90, 88, 94, 89, 84, 84, 80, C8077mf.y, 73, 94, 90, 88, 79, C8077mf.y, 105, 94, 90, 88, 79, 122, 88, 79, 82, 77, 82, 79, 66, C8077mf.u, C8077mf.H, 28, 95, 4, 31, C8077mf.B, 5, 8, 66, C8077mf.y, 95, 1, C8077mf.G, C8077mf.r, 8, C8077mf.x, 3, 95, 36, 31, C8077mf.B, 5, 8, C3307Iz.V, C8077mf.G, C8077mf.r, 8, C8077mf.x, 3, 48, C8077mf.u, 5, C8077mf.B, 7, C8077mf.B, 5, 8};
    }

    static {
        A01();
        A02 = XY.class.getSimpleName();
    }

    public static boolean A02() {
        try {
            Class.forName(A00(46, 32, 44));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A03() {
        try {
            Class.forName(A00(78, 38, 102));
            if (A01[2].charAt(21) != '7') {
                throw new RuntimeException();
            }
            A01[2] = "fqSGPLRwldKX66WDmKKlg7YQ1V3cstss";
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A04(int i, int i2) {
        return i >= 640 && i2 >= 640;
    }

    public static boolean A05(T8 t8) {
        boolean z = false;
        try {
            PackageManager packageManager = t8.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            boolean isUnity = true;
            ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(t8.getPackageName(), 1).activities;
            if (activityInfoArr != null) {
                int length = activityInfoArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    boolean activityDeclared = A00(78, 38, 102).equals(activityInfoArr[i].name);
                    if (!activityDeclared) {
                        i++;
                    } else {
                        z = true;
                        break;
                    }
                }
            }
            if (!z) {
                boolean activityDeclared2 = A03();
                if (!activityDeclared2) {
                    isUnity = false;
                }
            }
            boolean activityDeclared3 = t8.A05().AAO();
            if (activityDeclared3) {
                String str = A00(32, 14, 105) + isUnity;
            }
            return isUnity;
        } catch (Throwable th) {
            if (t8.A05().AAO()) {
                Log.e(A02, A00(0, 32, 79), th);
            }
            return false;
        }
    }
}
