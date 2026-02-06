package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Arrays;
import o.C10997yd1;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C8077mf;
import o.C9276rZ;
import o.CK1;
import o.ED2;
import o.InterfaceC8148mw2;
import o.QC1;

/* loaded from: assets/audience_network/classes2.dex */
public final class Q6 {
    public static byte[] A02;
    public static String[] A03 = {"MIyaG5GGMOxZGMlafXmCt20n5rwr84Cp", "2d7Ue4OLDSzNDZ0wIaqfb27lMuRlGrEq", "mYVPmAfRmW7XSvdIWjd", "xGy6wksCbV1DRuK7mqOXpPoeqCYQ0xXA", "bG0ONBuurvv92UazdjN2MWGsVI3Uiutq", "DcUOjHhMMeDdpHUeoCsuhqU8ztRHLrD6", "9Z29anAmU4sgj9dhE7", "NGIsWgcUmAFv5dLZHkD"};
    public static final Q2 A04;
    public int A00 = -1;
    public final AccessibilityNodeInfo A01;

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 94);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A02 = new byte[]{122, 118, 118, 109, C8077mf.z, 80, 75, 9, 4, C8077mf.H, 5, C8077mf.q, C8077mf.B, 34, 5, 59, 10, C8077mf.C, C8077mf.p, 5, 31, 81, 75, 64, 91, C8077mf.C, C8077mf.x, C8077mf.p, C8077mf.y, 31, 8, 50, C8077mf.y, 40, C8077mf.B, 9, C8077mf.H, C8077mf.H, C8077mf.y, 65, 91, 125, 102, C3307Iz.X, C3307Iz.f0, 35, C3307Iz.X, C3307Iz.e0, C3307Iz.Z, 36, 42, 35, 124, 102, C4715Xk.i, C3307Iz.Y, 101, 110, 99, 101, 109, 99, 98, 60, C3307Iz.Y, 7, 28, 95, 80, 93, 79, 79, 114, 93, 81, 89, 6, 28, 64, 91, C8077mf.B, C8077mf.A, C8077mf.u, C8077mf.B, C8077mf.r, C8077mf.D, C8077mf.C, C8077mf.A, C8077mf.H, 65, 91, 97, 122, 57, 53, 52, C3307Iz.f0, ED2.a, 52, C3307Iz.f0, C8077mf.H, ED2.a, C3307Iz.a0, 57, 40, 51, 42, C3307Iz.f0, 51, 53, 52, 96, 122, 36, ED2.a, 122, 113, 126, 125, 115, 122, 123, C3307Iz.X, ED2.a, 96, 123, C4715Xk.i, 52, 56, C3307Iz.f0, 40, 58, 57, 55, 62, 97, 123, 4, 31, 89, 80, 92, 74, 76, 90, 91, 5, 31, C8077mf.G, 6, 74, 73, 72, 65, 101, 74, 79, 69, 77, 71, 68, 74, 67, 28, 6, 89, 66, C8077mf.u, 3, 1, 9, 3, 5, 7, C3307Iz.d0, 3, C8077mf.q, 7, 88, 66, 8, 19, 67, 82, 64, 64, 68, 92, 65, 87, 9, 19, C8077mf.C, 2, 81, 65, 80, 77, 78, 78, 67, 64, 78, 71, C8077mf.B, 2, 8, 19, 64, 86, 95, 86, 80, 71, 86, 87, 9, 19, 81, 74, C8077mf.H, C8077mf.q, C8077mf.u, C8077mf.H, 80, 74, 76, 87, 1, C8077mf.H, C8077mf.u, 0, 62, 19, 77, 87, 42, 40, ED2.a, 34, 36, C3307Iz.X, 52, 42, 40, 40, C3307Iz.f0, 56, 56, 34, C3307Iz.a0, 34, C3307Iz.Z, 34, ED2.a, 50, 52, C3307Iz.e0, 36, 40, 62, 56, 76, 78, 89, 68, 66, 67, 82, 78, 65, 72, 76, 95, 82, 76, 78, 78, 72, 94, 94, 68, 79, 68, 65, 68, 89, 84, 82, 75, 66, 78, 88, 94, 6, 4, 19, C8077mf.p, 8, 9, C8077mf.B, 4, C8077mf.m, 2, 6, C8077mf.y, C8077mf.B, 1, 8, 4, C8077mf.u, C8077mf.x, 109, 111, QC1.w, 101, 99, 98, 115, 111, 96, 105, 109, 126, 115, Byte.MAX_VALUE, 105, 96, 105, 111, QC1.w, 101, 99, 98, 94, 92, 75, 86, 80, 81, 64, 92, 83, 86, 92, 84, 79, 77, 90, 71, 65, 64, 81, 77, 65, 94, 87, 31, C8077mf.G, 10, C8077mf.A, 17, C8077mf.r, 1, C8077mf.G, C8077mf.m, 10, C8077mf.r, C8077mf.u, 5, C8077mf.B, C8077mf.H, 31, C8077mf.p, C8077mf.A, C8077mf.H, C8077mf.u, 4, 2, 123, 121, 110, 115, 117, 116, 101, 118, 117, 116, 125, 101, 121, 118, 115, 121, 113, 49, 51, 36, 57, ED2.a, 62, 47, 62, 53, 40, 36, 47, 49, 36, 47, C4715Xk.i, ED2.a, C3307Iz.Y, 53, C4715Xk.i, 53, 62, 36, 47, 55, 34, 49, 62, C3307Iz.X, 60, 49, 34, 57, 36, C3307Iz.a0, 116, 118, 97, 124, 122, 123, 106, 123, 112, 109, 97, 106, 125, 97, QC1.w, 121, 106, 112, 121, 112, QC1.w, 112, 123, 97, 109, 111, QC1.w, 101, 99, 98, 115, 124, 109, Byte.MAX_VALUE, QC1.w, 105, C3307Iz.X, C3307Iz.Z, 48, C3307Iz.e0, C3307Iz.c0, 42, 59, 52, 54, C3307Iz.V, 50, C3307Iz.e0, C3307Iz.c0, 49, 55, 59, C3307Iz.X, 48, 59, C3307Iz.a0, C3307Iz.c0, 50, C3307Iz.V, C3307Iz.a0, C3307Iz.V, 42, 48, 59, 35, 54, C3307Iz.X, 42, 49, 40, C3307Iz.X, 54, C3307Iz.e0, 48, C4715Xk.i, 68, 70, 81, 76, 74, 75, 90, 85, 87, 64, 83, 76, 74, 80, 86, 90, 77, 81, 72, 73, 90, 64, 73, 64, 72, 64, 75, 81, 98, 96, 119, 106, 108, 109, 124, 112, 96, 113, 108, 111, 111, 124, 97, 98, 96, 104, 116, 98, 113, 103, 77, 79, 88, 69, 67, 66, 83, 95, 79, 94, 67, 64, 64, 83, 74, 67, 94, 91, 77, 94, 72, C8077mf.z, C8077mf.x, 3, C8077mf.H, C8077mf.B, C8077mf.C, 8, 4, C8077mf.u, C8077mf.E, C8077mf.u, C8077mf.x, 3, 124, 126, 105, 116, 114, 115, 98, 110, QC1.w, 105, 98, 110, QC1.w, 113, QC1.w, 126, 105, 116, 114, 115, 97, 99, 116, 105, 111, 110, Byte.MAX_VALUE, 117, 110, 107, 110, 111, 119, 110, 65};
    }

    static {
        A09();
        if (Build.VERSION.SDK_INT >= 24) {
            A04 = new C0j() { // from class: com.facebook.ads.redexgen.X.0g
            };
        } else if (Build.VERSION.SDK_INT >= 23) {
            A04 = new C0j();
        } else if (Build.VERSION.SDK_INT >= 22) {
            A04 = new C0m();
        } else {
            A04 = new C0p();
        }
    }

    public Q6(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.A01 = accessibilityNodeInfo;
    }

    private final int A00() {
        return this.A01.getActions();
    }

    public static Q6 A01(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new Q6(accessibilityNodeInfo);
    }

    private final CharSequence A02() {
        return this.A01.getClassName();
    }

    private final CharSequence A03() {
        return this.A01.getContentDescription();
    }

    private final CharSequence A04() {
        return this.A01.getPackageName();
    }

    private final CharSequence A05() {
        return this.A01.getText();
    }

    private final String A06() {
        return A04.A02(this.A01);
    }

    public static String A07(int i) {
        switch (i) {
            case 1:
                return A08(367, 12, 15);
            case 2:
                return A08(294, 18, 25);
            case 4:
                return A08(577, 13, 9);
            case 8:
                return A08(312, 22, 114);
            case 16:
                return A08(334, 12, 65);
            case 32:
                String A08 = A08(379, 17, 100);
                String[] strArr = A03;
                if (strArr[2].length() == strArr[7].length()) {
                    A03[0] = "SoHELriMkQBcnBScVZvUK7T5g3K9Fm6N";
                    return A08;
                }
                break;
            case 64:
                if (A03[0].charAt(4) != 'k') {
                    String[] strArr2 = A03;
                    strArr2[2] = "WqW7FwrDIFS0bz5Pv3V";
                    strArr2[7] = "9aPQSHdK8ccW2UHKig7";
                    return A08(236, 26, 53);
                }
                A03[0] = "EQhP22rcQn8uHJztvMH4f7UvmkKbnpEF";
                return A08(236, 26, 53);
            case 128:
                return A08(262, 32, 83);
            case 256:
                return A08(396, 35, 46);
            case 512:
                return A08(467, 39, 58);
            case 1024:
                return A08(431, 24, 107);
            case 2048:
                return A08(InterfaceC8148mw2.g.n, 28, 91);
            case 4096:
                return A08(556, 21, 82);
            case 8192:
                String A082 = A08(534, 22, 125);
                String[] strArr3 = A03;
                if (strArr3[4].charAt(1) == strArr3[3].charAt(1)) {
                    String[] strArr4 = A03;
                    strArr4[2] = "qK4Dr1iI0ffiXenjEdF";
                    strArr4[7] = "zXyhBsmJjFlVcoSAhS3";
                    return A082;
                }
                break;
            case 16384:
                return A08(346, 11, 80);
            case 32768:
                return A08(455, 12, 114);
            case 65536:
                return A08(357, 10, 0);
            case 131072:
                return A08(590, 20, 99);
            default:
                return A08(InterfaceC8148mw2.e.z, 14, 126);
        }
        throw new RuntimeException();
    }

    private final void A0A(Rect rect) {
        this.A01.getBoundsInParent(rect);
    }

    private final void A0B(Rect rect) {
        this.A01.getBoundsInScreen(rect);
    }

    private final boolean A0C() {
        return this.A01.isCheckable();
    }

    private final boolean A0D() {
        return this.A01.isChecked();
    }

    private final boolean A0E() {
        return this.A01.isClickable();
    }

    private final boolean A0F() {
        return this.A01.isEnabled();
    }

    private final boolean A0G() {
        return this.A01.isFocusable();
    }

    private final boolean A0H() {
        return this.A01.isFocused();
    }

    private final boolean A0I() {
        return this.A01.isLongClickable();
    }

    private final boolean A0J() {
        return this.A01.isPassword();
    }

    private final boolean A0K() {
        return this.A01.isScrollable();
    }

    private final boolean A0L() {
        return this.A01.isSelected();
    }

    public final AccessibilityNodeInfo A0M() {
        return this.A01;
    }

    public final void A0N(int i) {
        this.A01.addAction(i);
    }

    public final void A0O(CharSequence charSequence) {
        this.A01.setClassName(charSequence);
    }

    public final void A0P(Object obj) {
        A04.A03(this.A01, ((Q3) obj).A00);
    }

    public final void A0Q(Object obj) {
        A04.A04(this.A01, ((Q4) obj).A00);
    }

    public final void A0R(boolean z) {
        this.A01.setScrollable(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Q6 q6 = (Q6) obj;
        if (this.A01 == null) {
            if (q6.A01 != null) {
                return false;
            }
        } else if (!this.A01.equals(q6.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A01 == null) {
            return 0;
        }
        return this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        A0A(rect);
        StringBuilder builder = new StringBuilder().append(A08(5, 18, 53));
        sb.append(builder.append(rect).toString());
        A0B(rect);
        StringBuilder builder2 = new StringBuilder().append(A08(23, 18, 37));
        sb.append(builder2.append(rect).toString());
        sb.append(A08(C10997yd1.v1, 15, 60)).append(A04());
        sb.append(A08(65, 13, 98)).append(A02());
        sb.append(A08(C9276rZ.l, 8, 52)).append(A05());
        sb.append(A08(91, 22, 4)).append(A03());
        sb.append(A08(C9276rZ.p, 10, 41)).append(A06());
        sb.append(A08(41, 13, 24)).append(A0C());
        sb.append(A08(54, 11, 88)).append(A0D());
        sb.append(A08(124, 13, 5)).append(A0G());
        sb.append(A08(C3503Kz.a0, 11, 97)).append(A0H());
        sb.append(A08(206, 12, 109)).append(A0L());
        sb.append(A08(78, 13, 37)).append(A0E());
        sb.append(A08(o.DE.g, 17, 120)).append(A0I());
        sb.append(A08(113, 11, 65)).append(A0F());
        sb.append(A08(180, 12, 109)).append(A0J());
        StringBuilder builder3 = new StringBuilder().append(A08(CK1.x, 14, 124)).append(A0K());
        sb.append(builder3.toString());
        sb.append(A08(2, 3, 19));
        int A00 = A00();
        while (A00 != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(A00);
            A00 &= ~numberOfTrailingZeros;
            sb.append(A07(numberOfTrailingZeros));
            String[] strArr = A03;
            if (strArr[1].charAt(26) != strArr[5].charAt(26)) {
                throw new RuntimeException();
            }
            A03[0] = "u7URBkmoClRMdzvgw4WX3UmEFyKryATB";
            if (A00 != 0) {
                sb.append(A08(0, 2, 8));
            }
        }
        sb.append(A08(624, 1, 66));
        return sb.toString();
    }
}
