package com.facebook.ads.redexgen.X;

import android.content.Context;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C8077mf;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.Xt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1200Xt {
    public static byte[] A00;
    public static String[] A01 = {"LplfTEYRnODnDpz21EneRZRsMargZTNK", "2NrlLG7hqMfWnzI4aYc74QPIxJ4DJ1XR", "L7pmDhfbtl8pdMobHzydLQ1D6YOazgIb", "V9Kuj32Ww6lLhCXMI4XEd9rHt60G9lJq", "k0plFnx6zt0D5xnpu3Hlko5", "WGZsYEfxfTD4T7Cqe3yCHw86dz09xOKF", "rh2k8IOHNldhKVbVonTuZ6bN28ke0n", "kkjOWDxiYS6HSpJcTpvH6ub4oru0qlUQ"};
    public static final Pattern A02;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{13, 121, 86, C8077mf.p, 68, 81, 121, 86, C8077mf.p, 126, 68, 8, 95, C8077mf.m, QC1.w, C8077mf.p, C8077mf.n, 126, 100, 8, Byte.MAX_VALUE, QC1.w, C8077mf.m, C8077mf.q, 125, 75, 76, 76, 91, 80, 74, C8077mf.H, 77, 74, 95, 93, 85, C8077mf.H, 74, 76, 95, 93, 91, 77, 65, 67, 0, 72, 79, 77, 75, 76, 65, 65, 69, 0, 79, 74, 93};
    }

    static {
        A07();
        A02 = Pattern.compile(A02(0, 24, 9));
    }

    public static String A00() {
        return A06(new Exception(A02(24, 19, 18)), -1, -1, false);
    }

    public static String A01(int i) {
        if (i <= 0) {
            return null;
        }
        float rate = new Random().nextFloat();
        if (rate >= 1.0f / i) {
            return null;
        }
        return A00();
    }

    public static String A03(Context context, Throwable th) {
        int A0M = C1123Up.A0M(context);
        int maxStacktraceLines = C1123Up.A03(context);
        return A06(th, A0M, maxStacktraceLines, C1123Up.A1h(context));
    }

    public static String A04(String str) {
        Matcher matcher = A02.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return str;
    }

    public static String A06(Throwable th, int i, int i2, boolean z) {
        String A022 = A02(0, 0, 105);
        if (th == null) {
            return A022;
        }
        try {
            QK qk = new QK();
            InterfaceC1198Xr interfaceC1198Xr = qk;
            String[] strArr = A01;
            if (strArr[4].length() != strArr[6].length()) {
                String[] strArr2 = A01;
                strArr2[4] = "oxxlcYcFfaMihpA7yH6yiqF";
                strArr2[6] = "gkLsRpbpRAovdKGTxU7IYJzRyz6pLt";
                if (i2 >= 0) {
                    interfaceC1198Xr = new QI(interfaceC1198Xr, i2);
                }
                if (i >= 0) {
                    interfaceC1198Xr = new QF(interfaceC1198Xr, i, i);
                }
                if (z) {
                    interfaceC1198Xr = new QJ(interfaceC1198Xr);
                }
                QL ql = new QL(qk, 1, interfaceC1198Xr);
                th.printStackTrace(new PrintWriter(new C1199Xs(ql)));
                ql.flush();
                return qk.toString();
            }
            throw new RuntimeException();
        } catch (Exception unused) {
            return A022;
        }
    }

    public static boolean A08(C1197Xq c1197Xq) {
        String middle = c1197Xq.A02();
        if (middle == null) {
            return false;
        }
        boolean A0A = A0A(middle);
        if (A01[7].charAt(20) != 'o') {
            A01[2] = "GqDFUg33w18rdOydcZHrPduzmWx6ZxUu";
            if (A0A) {
                return true;
            }
            for (String str : c1197Xq.A01()) {
                if (A01[2].charAt(10) != '8') {
                    if (A0A(str)) {
                        return true;
                    }
                } else {
                    String[] strArr = A01;
                    strArr[5] = "ZCUrIEQiGOY9U2nVCEFSNgqRdbKvDffQ";
                    strArr[0] = "2Hs1eEyuwWDgIwWONAgBlK6IqUqjA257";
                    if (A0A(str)) {
                        return true;
                    }
                }
            }
            for (String middle2 : c1197Xq.A00()) {
                if (A0A(middle2)) {
                    return true;
                }
            }
            return false;
        }
        throw new RuntimeException();
    }

    public static boolean A0A(String str) {
        return str.contains(A02(43, 16, 2));
    }
}
