package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import java.util.Arrays;
import o.C2638Cg0;
import o.C8077mf;
import org.checkerframework.dataflow.qual.Pure;

/* renamed from: com.facebook.ads.redexgen.X.4g  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC04624g {
    public static int A00;
    public static InterfaceC04614f A01;
    public static boolean A02;
    public static byte[] A03;
    public static String[] A04 = {"pjC", "Ar4G3OSxcgl2D", "AarUE2nt7cnp4GdKoelKCQn2Jt4OXyEc", "B5uTmPcht7q4WCzfelpVRln9dVKzTr9W", "36fORse15dXsGKgrcWq47HxFqRHPKtSm", "Eh56lsHHP32qxPGDjQKhG4rai7NSZl8p", "QN71kq8063jCyPpsf", "zuMcuSAj79dOj6A3T"};
    public static final Object A05;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] - i3;
            if (A04[1].length() == 28) {
                throw new RuntimeException();
            }
            A04[0] = "EwS";
            copyOfRange[i4] = (byte) (i5 - 115);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{C2638Cg0.t7, -65, Byte.MAX_VALUE, -107, -107, 4, 4, 4, 4, -8, 17, C8077mf.p, 17, C8077mf.u, C8077mf.D, 17, -21, C8077mf.u, C8077mf.z, C8077mf.A, -24, C8077mf.E, 6, 8, 19, C8077mf.A, C8077mf.n, C8077mf.u, 17, C2638Cg0.r7, C2638Cg0.x7, 17, C8077mf.u, C2638Cg0.r7, 17, 8, C8077mf.A, C8077mf.D, C8077mf.u, C8077mf.y, C8077mf.p, -52};
    }

    static {
        A03();
        A05 = new Object();
        A00 = 0;
        A02 = true;
        A01 = InterfaceC04614f.A00;
    }

    @Pure
    public static String A01(String str, Throwable th) {
        String A022 = A02(th);
        if (!TextUtils.isEmpty(A022)) {
            StringBuilder append = new StringBuilder().append(str);
            String A002 = A00(2, 3, 2);
            StringBuilder append2 = append.append(A002);
            String throwableString = A00(1, 1, 66);
            return append2.append(A022.replace(throwableString, A002)).append('\n').toString();
        }
        return str;
    }

    @Pure
    public static String A02(Throwable th) {
        synchronized (A05) {
            if (th == null) {
                return null;
            }
            if (A0B(th)) {
                return A00(9, 33, 48);
            } else if (!A02) {
                return th.getMessage();
            } else {
                return Log.getStackTraceString(th).trim().replace(A00(0, 1, 74), A00(5, 4, 113));
            }
        }
    }

    @Pure
    public static void A04(String str, String str2) {
        synchronized (A05) {
            int i = A00;
        }
    }

    @Pure
    public static void A05(String str, String str2) {
        synchronized (A05) {
            if (A00 <= 3) {
                A01.A6H(str, str2);
            }
        }
    }

    @Pure
    public static void A06(String str, String str2) {
        synchronized (A05) {
            if (A00 <= 1) {
                A01.A9t(str, str2);
            }
        }
    }

    @Pure
    public static void A07(String str, String str2) {
        synchronized (A05) {
            if (A00 <= 2) {
                A01.AKm(str, str2);
            }
        }
    }

    @Pure
    public static void A08(String str, String str2, Throwable th) {
        A05(str, A01(str2, th));
    }

    @Pure
    public static void A09(String str, String str2, Throwable th) {
        A06(str, A01(str2, th));
    }

    @Pure
    public static void A0A(String str, String str2, Throwable th) {
        A07(str, A01(str2, th));
    }

    @Pure
    public static boolean A0B(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                String[] strArr = A04;
                if (strArr[3].charAt(22) != strArr[2].charAt(22)) {
                    throw new RuntimeException();
                }
                A04[1] = "Bi";
                return true;
            }
            th = th.getCause();
        }
        return false;
    }
}
