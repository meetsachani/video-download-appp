package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.qY  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2256qY {
    public static byte[] A00;
    public static String[] A01 = {"wGfW8ZiAX", "98TYLpDb5H7FHIAHZpq8", "wurshRpA61WdSnRC2QEiiDdyeizCic8s", "6EmvqyT0A8GUtNQWPCztICrBXhcLnLDE", "uA", "uieozUeELQJ7BnvT2m7zVxZQuFK6e7wq", "WTc20BWixPig5ctZiuBGmbv8oTuxO5Xh", "dqopJSQqvI22NiiNvBghv0z0kBPWpT4p"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] ^ i3) ^ 28;
            if (A01[6].charAt(9) == 'Q') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "97APORAguQeQpweI2T85fGR4lID0xZM2";
            strArr[5] = "RVlAHF7VxslCalKX2MZme1MZcTv0vxDz";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{C8077mf.x, 89, 65, 71, 64, C8077mf.x, 90, 91, 64, C8077mf.x, 86, 81, C8077mf.x, 90, 65, 88, 88, 31, 19, 67, 82, 65, 82, 94, 86, 71, 86, 65, 19, 49, C3307Iz.Y, C8077mf.A, 4, C8077mf.A, C8077mf.E, 19, 2, 19, 4, 86, 5, 6, 19, C8077mf.y, 31, C8077mf.r, 31, 19, C8077mf.u, 86, C8077mf.A, 5, 86, C8077mf.B, C8077mf.C, C8077mf.B, 91, C8077mf.B, 3, C8077mf.D, C8077mf.D, 86, 31, 5, 86, C8077mf.B, 3, C8077mf.D, C8077mf.D, 76, 86, C8077mf.E, 19, 2, C8077mf.H, C8077mf.C, C8077mf.u, 86};
    }

    static {
        A04();
    }

    public static String A01(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = C2256qY.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        String methodName = stackTraceElement.getClassName();
        String className = stackTraceElement.getMethodName();
        return A00(30, 48, 106) + methodName + A00(29, 1, 3) + className + A00(17, 12, 47) + str;
    }

    public static <T extends Throwable> T A02(T throwable) {
        return (T) A03(throwable, C2256qY.class.getName());
    }

    public static <T extends Throwable> T A03(T throwable, String str) {
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        int i = stackTrace.length;
        int lastIntrinsic = -1;
        for (int size = 0; size < i; size++) {
            if (str.equals(stackTrace[size].getClassName())) {
                lastIntrinsic = size;
            }
        }
        StackTraceElement[] stackTrace2 = (StackTraceElement[]) Arrays.copyOfRange(stackTrace, lastIntrinsic + 1, i);
        throwable.setStackTrace(stackTrace2);
        int size2 = A01[6].charAt(9);
        if (size2 != 81) {
            A01[7] = "7EM55IZD6WJUcGDkvpLhGBZC82NS7r4s";
            return throwable;
        }
        throw new RuntimeException();
    }

    public static void A05() {
        throw ((NullPointerException) A02(new NullPointerException()));
    }

    public static void A06(Object obj) {
        if (obj == null) {
            A05();
            throw null;
        }
    }

    public static void A07(Object obj, String str) {
        if (obj == null) {
            A0A(str);
            throw null;
        }
    }

    public static void A08(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) A02(new NullPointerException(str + A00(0, 17, 40))));
    }

    public static void A09(Object obj, String str) {
        if (obj == null) {
            A0B(str);
            throw null;
        }
    }

    public static void A0A(String str) {
        throw ((NullPointerException) A02(new NullPointerException(str)));
    }

    public static void A0B(String str) {
        throw ((NullPointerException) A02(new NullPointerException(A01(str))));
    }

    public static boolean A0C(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }
}
