package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.util.Arrays;
import o.C2638Cg0;
import o.C3307Iz;
import o.C3503Kz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.Px  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1003Px {
    public static byte[] A00;
    public static String[] A01 = {"ZL1anCMt3BLp6QH6mLG", "eYchmtpQAx9MOQATO8FYbbZn0Imopvp", "womqJE18VUE38xqqJT9WKISB68M5cIbo", "Ts37DulPc8QB3fV2ykqejrUSGmoT8jSS", "b7DBuf20fhmi4MvO4gTJDnUAFhtFn7QS", "riPo3ZmcE", "zdrgnlBB6epFGiAXytvDtgh2fpyUYHeQ", "pMT1BFzteNKtMElnfmBSO9c56WwnbBlh"};
    public static final C1002Pw A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[7].charAt(24) != strArr[2].charAt(24)) {
                throw new RuntimeException();
            }
            A01[1] = "rrZUd7Y7OcpInh9wY";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 74);
            i4++;
        }
    }

    public static void A01() {
        A00 = new byte[]{13, C8077mf.n, -20, 3, 17, C8077mf.u, 3, 2, -18, C8077mf.r, 3, -15, 1, C8077mf.r, 13, 10, 10, -56, C2638Cg0.u7, -89, -66, -52, C2638Cg0.y7, -66, -67, -84, -68, C2638Cg0.x7, -56, C2638Cg0.s7, C2638Cg0.s7, 52, 51, 19, 42, 56, 57, 42, C3307Iz.a0, C8077mf.B, 40, 55, 52, 49, 49, 6, 40, 40, 42, 53, 57, 42, C3307Iz.a0, C2638Cg0.v7, -56, -83, C2638Cg0.z7, -69, -52, C2638Cg0.z7, -88, -65, C2638Cg0.y7, C2638Cg0.z7, -65, -66, -83, -67, -52, C2638Cg0.v7, C2638Cg0.t7, C2638Cg0.t7, C3307Iz.a0, 40, 13, C3307Iz.f0, C3307Iz.a0, 42, 8, 31, C3307Iz.e0, C3307Iz.f0, 31, C8077mf.H, 13, C8077mf.G, C3307Iz.d0, C3307Iz.a0, C3307Iz.Y, C3307Iz.Y};
    }

    static {
        A01();
        A02 = new C1751hz() { // from class: com.facebook.ads.redexgen.X.7T
            public static byte[] A00;
            public static String[] A01 = {"VY80zOaYPxkOtyUrTAwyx7zC77lFdeof", "qJYWmvtZwfwBqccNWJcDxq0wxgEd", "0lF9l2PIa0G", "8HUI8rnTM6nJrcfosCRNO8OvNswxKEJA", "TWKnH1rmbYSUhH4KNgSY2AsRWoqO1pqp", "o5QSN7NKgyovRW2", "W85", "rhxQt59st5mNUHdFmf4JU2hKMVhH4nOT"};

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 44);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                byte[] bArr = {-101, -33, -22, -32, -18, -101, -23, -22, -17, -101, -28, -24, -21, -25, -32, -24, -32, -23, -17, -101, -28, -23, -17, -32, -19, C2638Cg0.C7, -36, -34, -32, -101, -24, -32, -17, -29, -22, -33, -101, -22, -23, C2638Cg0.v7, -32, -18, -17, -32, -33, C2638Cg0.p7, -25, -28, -23, -30, 101, -87, -76, -86, -72, 101, -77, -76, -71, 101, -82, -78, -75, -79, -86, -78, -86, -77, -71, 101, -82, -77, -71, -86, -73, -85, -90, -88, -86, 101, -78, -86, -71, -83, -76, -87, 101, -76, -77, -109, -86, -72, -71, -86, -87, -107, -73, -86, -117, -79, -82, -77, -84, 84, -104, -93, -103, -89, 84, -94, -93, -88, 84, -99, -95, -92, -96, -103, -95, -103, -94, -88, 84, -99, -94, -88, -103, -90, -102, -107, -105, -103, 84, -95, -103, -88, -100, -93, -104, 84, -93, -94, -126, -103, -89, -88, -103, -104, -124, -90, -103, -121, -105, -90, -93, -96, -96, -127, C2638Cg0.s7, -48, C2638Cg0.t7, -44, -127, C2638Cg0.A7, -48, -43, -127, C2638Cg0.w7, C2638Cg0.z7, -47, C2638Cg0.y7, C2638Cg0.t7, C2638Cg0.z7, C2638Cg0.t7, C2638Cg0.A7, -43, -127, C2638Cg0.w7, C2638Cg0.A7, -43, C2638Cg0.t7, -45, C2638Cg0.u7, C2638Cg0.q7, -60, C2638Cg0.t7, -127, C2638Cg0.z7, C2638Cg0.t7, -43, C2638Cg0.v7, -48, C2638Cg0.s7, -127, -48, C2638Cg0.A7, -81, C2638Cg0.t7, -44, -43, C2638Cg0.t7, C2638Cg0.s7, -76, -60, -45, -48, C2638Cg0.y7, C2638Cg0.y7, -66, 2, 13, 3, 17, -66, C8077mf.n, 13, C8077mf.u, -66, 7, C8077mf.m, C8077mf.p, 10, 3, C8077mf.m, 3, C8077mf.n, C8077mf.u, -66, 7, C8077mf.n, C8077mf.u, 3, C8077mf.r, 4, -1, 1, 3, -66, C8077mf.m, 3, C8077mf.u, 6, 13, 2, -66, 13, C8077mf.n, -20, 3, 17, C8077mf.u, 3, 2, -15, 1, C8077mf.r, 13, 10, 10, -33, 1, 1, 3, C8077mf.p, C8077mf.u, 3, 2, -106, C2638Cg0.B7, -27, -37, -23, -106, -28, -27, -22, -106, -33, -29, -26, -30, -37, -29, -37, -28, -22, -106, -33, -28, -22, -37, -24, -36, -41, C2638Cg0.E7, -37, -106, -29, -37, -22, -34, -27, C2638Cg0.B7, -106, -27, -28, C2638Cg0.v7, -22, -41, -24, -22, -60, -37, -23, -22, -37, C2638Cg0.B7, C2638Cg0.v7, C2638Cg0.E7, -24, -27, -30, -30, -84, -16, -5, -15, -1, -84, -6, -5, 0, -84, -11, -7, -4, -8, -15, -7, -15, -6, 0, -84, -11, -6, 0, -15, -2, -14, -19, -17, -15, -84, -7, -15, 0, -12, -5, -16, -84, -5, -6, -33, 0, -5, -4, C2638Cg0.B7, -15, -1, 0, -15, -16, -33, -17, -2, -5, -8, -8, -36, -17, -21, -3, -42, -25, -8, -21, -12, -6, -90, -25, -6, -10, 8, C2638Cg0.C7, -14, 3, -10, -1, 5, -44, 0, -2, 1, -14, 5};
                if (A01[3].charAt(4) != '8') {
                    throw new RuntimeException();
                }
                A01[3] = "0rHD8iYFkM5KLcEdxbz1wO1gXSem16M8";
                A00 = bArr;
            }

            static {
                A01();
            }

            @Override // com.facebook.ads.redexgen.X.C1002Pw
            public final void A02(ViewParent viewParent, View view) {
                try {
                    viewParent.onStopNestedScroll(view);
                } catch (AbstractMethodError e) {
                    Log.e(A00(389, 16, 101), A00(378, 11, 90) + viewParent + A00(323, 55, 96), e);
                }
            }

            @Override // com.facebook.ads.redexgen.X.C1002Pw
            public final void A03(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
                try {
                    viewParent.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError e) {
                    Log.e(A00(389, 16, 101), A00(378, 11, 90) + viewParent + A00(C3503Kz.q0, 51, 53), e);
                }
            }

            @Override // com.facebook.ads.redexgen.X.C1002Pw
            public final void A04(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
                try {
                    viewParent.onNestedPreScroll(view, i, i2, iArr);
                } catch (AbstractMethodError e) {
                    Log.e(A00(389, 16, 101), A00(378, 11, 90) + viewParent + A00(103, 54, 8), e);
                }
            }

            @Override // com.facebook.ads.redexgen.X.C1002Pw
            public final void A05(ViewParent viewParent, View view, View view2, int i) {
                try {
                    viewParent.onNestedScrollAccepted(view, view2, i);
                } catch (AbstractMethodError e) {
                    Log.e(A00(389, 16, 101), A00(378, 11, 90) + viewParent + A00(208, 59, 114), e);
                }
            }

            @Override // com.facebook.ads.redexgen.X.C1002Pw
            public final boolean A06(ViewParent viewParent, View view, float f, float f2) {
                try {
                    return viewParent.onNestedPreFling(view, f, f2);
                } catch (AbstractMethodError e) {
                    Log.e(A00(389, 16, 101), A00(378, 11, 90) + viewParent + A00(50, 53, 25), e);
                    return false;
                }
            }

            @Override // com.facebook.ads.redexgen.X.C1002Pw
            public final boolean A07(ViewParent viewParent, View view, float f, float f2, boolean z) {
                try {
                    return viewParent.onNestedFling(view, f, f2, z);
                } catch (AbstractMethodError e) {
                    Log.e(A00(389, 16, 101), A00(378, 11, 90) + viewParent + A00(0, 50, 79), e);
                    return false;
                }
            }

            @Override // com.facebook.ads.redexgen.X.C1002Pw
            public final boolean A08(ViewParent viewParent, View view, View view2, int i) {
                try {
                    return viewParent.onStartNestedScroll(view, view2, i);
                } catch (AbstractMethodError e) {
                    Log.e(A00(389, 16, 101), A00(378, 11, 90) + viewParent + A00(267, 56, 74), e);
                    return false;
                }
            }
        };
    }

    public static void A02(ViewParent viewParent, View view, int i) {
        if (0 != 0) {
            throw new NullPointerException(A00(72, 18, 112));
        }
        if (i == 0) {
            A02.A02(viewParent, view);
        }
    }

    public static void A03(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        if (0 != 0) {
            throw new NullPointerException(A00(17, 14, 15));
        }
        if (i5 == 0) {
            A02.A03(viewParent, view, i, i2, i3, i4);
        }
    }

    public static void A04(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (0 != 0) {
            throw new NullPointerException(A00(0, 17, 84));
        }
        if (i3 == 0) {
            A02.A04(viewParent, view, i, i2, iArr);
        }
    }

    public static void A05(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (0 != 0) {
            throw new NullPointerException(A00(31, 22, 123));
        }
        if (i2 == 0) {
            C1002Pw c1002Pw = A02;
            if (A01[1].length() != 12) {
                A01[6] = "zGz2rBeihUtTfGY2pcVtSmEx1y47z9aS";
                c1002Pw.A05(viewParent, view, view2, i);
                return;
            }
            throw new RuntimeException();
        }
    }

    public static boolean A06(ViewParent viewParent, View view, float f, float f2) {
        return A02.A06(viewParent, view, f, f2);
    }

    public static boolean A07(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return A02.A07(viewParent, view, f, f2, z);
    }

    public static boolean A08(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (0 != 0) {
            throw new NullPointerException(A00(53, 19, 16));
        }
        if (i2 == 0) {
            boolean A08 = A02.A08(viewParent, view, view2, i);
            if (A01[1].length() != 12) {
                A01[6] = "znJUBPw3pDumoyQGyqs8HDKa96hSudPo";
                return A08;
            }
            throw new RuntimeException();
        }
        return false;
    }
}
