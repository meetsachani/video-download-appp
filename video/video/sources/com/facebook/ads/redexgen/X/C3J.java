package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.internal.C2372q;
import com.google.android.exoplayer2.source.rtsp.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C10997yd1;
import o.C3062Gl1;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C5738d80;
import o.C7193j50;
import o.C7834lj1;
import o.C8077mf;
import o.C9196rD2;
import o.ED2;
import o.InterfaceC8148mw2;
import o.QC1;
import o.W12;
import o.Xu2;

/* renamed from: com.facebook.ads.redexgen.X.3J  reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class C3J {
    public static byte[] A00;
    public static String[] A01 = {"GVeqRr88eErbsFWt7Zyfruf5", "wxj6GMJJHrqzMl1sJI6PipHFTxOXGRz7", "RvxQI1Pfb9FvcjGIis5Xa2IsZ1O1jyWN", "aqZmlWCmiVFzo11RZMz1pcuKr30pTZ7V", "9PLW7Gxq7uBTsV", "7C", C5738d80.e, "2Y1axbTDI7FTMPtf96QBUHvxuVSMJwkx"};
    public static final ArrayList<C3H> A02;
    public static final Pattern A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C3I A04(String str) {
        Matcher matcher = A03.matcher(str);
        if (matcher.matches()) {
            String str2 = (String) AbstractC04543y.A01(matcher.group(1));
            String group = matcher.group(2);
            try {
                return new C3I(Integer.parseInt(str2, 16), group != null ? Integer.parseInt(group) : 0);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 37);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A00 = new byte[]{88, 107, 118, 50, 103, 90, 40, C3307Iz.f0, 93, 103, C3307Iz.c0, 124, 71, C3307Iz.c0, 92, 54, C3307Iz.c0, ED2.a, 91, 125, 52, 123, 47, C3307Iz.f0, 57, 60, 90, 40, C3307Iz.f0, 93, 54, C3307Iz.c0, ED2.a, 91, 125, 55, 42, 52, 123, 47, 47, 57, 34, C3307Iz.Z, C3307Iz.X, 107, 117, 75, 73, 7, C8077mf.H, 17, 0, 0, 28, C8077mf.C, 19, 17, 4, C8077mf.C, 31, C8077mf.H, 95, 19, C8077mf.y, 17, 93, 70, 64, 72, 91, 74, 74, 86, 83, 89, 91, 78, 83, 85, 84, C8077mf.y, 89, 95, 91, C8077mf.A, 13, 10, 2, C3307Iz.Y, 55, 55, C3307Iz.c0, C3307Iz.f0, 36, C3307Iz.Y, 51, C3307Iz.f0, 40, C3307Iz.a0, 104, 35, 49, C3307Iz.X, 52, 50, C3307Iz.X, 52, 111, 126, 126, 98, 103, 109, 111, 122, 103, 97, 96, C3307Iz.V, 103, 106, C4715Xk.i, 123, 106, 106, 118, 115, 121, 123, 110, 115, 117, 116, 53, 106, 125, 105, 102, 119, 119, 107, 110, 100, 102, 115, 110, 104, 105, 40, 115, 115, 106, 107, C3307Iz.d0, Byte.MAX_VALUE, 106, 107, 77, 92, 92, 64, 69, 79, 77, 88, 69, 67, 66, 3, 90, 67, 78, 95, 89, 78, 74, 91, 91, 71, 66, 72, 74, 95, 66, 68, 69, 4, 83, 6, 72, 74, 70, 78, 89, 74, 6, 70, 68, 95, 66, 68, 69, 112, 97, 97, 125, QC1.w, 114, 112, 101, QC1.w, 126, Byte.MAX_VALUE, 62, 105, 60, 116, 124, 98, 118, C4715Xk.i, C3307Iz.d0, C3307Iz.d0, 48, 53, ED2.a, C4715Xk.i, 40, 53, 51, 50, 115, 36, 113, 53, 49, C4715Xk.i, 59, 57, 113, C3307Iz.a0, C3307Iz.f0, 53, C3307Iz.c0, 58, 58, C3307Iz.Y, 35, C3307Iz.a0, C3307Iz.c0, 62, 35, C3307Iz.X, 36, 101, 50, 103, C3307Iz.Z, 58, 126, 103, C3307Iz.a0, 47, C3307Iz.c0, 103, 124, 122, 114, 69, 84, 84, 72, 77, 71, 69, 80, 77, 75, 74, C8077mf.m, 92, 9, 73, 84, C8077mf.r, 9, 82, 80, 80, C4715Xk.i, C3307Iz.d0, C3307Iz.d0, 48, 53, ED2.a, C4715Xk.i, 40, 53, 51, 50, 115, 36, 113, C3307Iz.e0, C3307Iz.a0, 53, ED2.a, 55, 40, 53, 49, 57, 113, 40, 36, 111, 59, 102, 119, 119, 107, 110, 100, 102, 115, 110, 104, 105, 40, Byte.MAX_VALUE, 42, 117, 102, 112, 100, 100, 111, 126, 126, 98, 103, 109, 111, 122, 103, 97, 96, C3307Iz.V, 118, 35, 125, 109, 122, 107, C4715Xk.i, 59, 57, 40, 40, 52, 49, 59, 57, C3307Iz.d0, 49, 55, 54, 119, 32, 117, C3307Iz.c0, C3307Iz.e0, 58, 42, 49, 40, 79, 91, 74, 71, 65, 95, 75, 90, 87, 81, 17, 95, 93, 13, 124, 104, 121, 116, 114, 50, 124, 126, C3307Iz.a0, 58, C3307Iz.f0, ED2.a, 50, 52, 116, 62, 58, 56, 104, 8, 28, 13, 0, 6, 70, C8077mf.n, 8, 10, 90, 68, 3, 6, 10, 70, 82, 67, 78, 72, 8, 65, 75, 70, 68, C8077mf.A, 3, C8077mf.u, 31, C8077mf.C, 89, 17, 65, 71, 71, 91, C8077mf.A, C8077mf.D, C8077mf.A, 1, C8077mf.C, 13, 28, 17, C8077mf.A, 87, 31, 79, 73, 73, 85, C8077mf.y, C8077mf.x, C8077mf.C, C8077mf.q, 92, 72, 89, 84, 82, C8077mf.u, 80, 85, 92, C8077mf.n, 58, C3307Iz.f0, ED2.a, 50, 52, 116, 54, 51, 54, 106, 109, 121, 104, 101, 99, 35, 97, 124, ED2.a, 119, 99, 114, Byte.MAX_VALUE, 121, 57, 123, 102, 34, 119, 59, 122, 119, 98, 123, 53, C3307Iz.V, 48, C4715Xk.i, 59, 123, 57, 36, 49, 51, 125, 105, QC1.w, 117, 115, 51, 113, 108, 121, 123, 49, 80, C3307Iz.e0, 74, 94, 79, 66, 68, 4, 70, 91, 78, 76, 6, 103, C8077mf.C, C8077mf.y, 1, C8077mf.r, C8077mf.G, C8077mf.E, 91, C8077mf.E, 4, 1, 7, 32, 52, C3307Iz.X, 40, C3307Iz.f0, 110, 51, 32, 54, 112, 100, 117, QC1.w, 126, 62, 101, 99, 100, 116, 60, 121, 117, 103, 115, 98, 111, 105, C3307Iz.a0, 112, 104, 98, 40, 98, 114, 117, 116, 96, 113, 124, 122, 58, 99, 123, 113, 59, 113, 97, 102, 59, 125, 113, C3307Iz.c0, ED2.a, C3307Iz.f0, 35, C3307Iz.X, 101, 60, 36, C3307Iz.f0, 100, C3307Iz.f0, 62, 57, 100, 34, C3307Iz.f0, 113, 58, 56, C3307Iz.X, C3307Iz.d0, 35, C3307Iz.Y, 47, 119, C3307Iz.Y, 40, 56, 100, 112, 97, 108, 106, 42, 115, 107, 97, C3307Iz.c0, 97, 113, 118, C3307Iz.c0, 112, 109, 97, 62, 117, 119, 106, 99, 108, 105, 96, 56, 117, 55, 8, 28, 13, 0, 6, 70, 31, 6, C8077mf.E, C8077mf.m, 0, C8077mf.D, 52, 32, 49, 60, 58, 122, 34, 52, 35, 104, 124, 109, 96, 102, C3307Iz.Y, 113, 36, 111, 101, 104, 106, C8077mf.E, C8077mf.q, C8077mf.H, 19, C8077mf.y, 85, 2, 87, 13, C8077mf.E, C8077mf.n, C8077mf.m, 28, 90, 91, 67, 84, 65, 19, 54, C3307Iz.V, 52, 100, 7, 1, 5, 82, 84, 92, 7, 1, 5, 83, 84, 92, 93, 81, 90, 91, 93, 110, 76, 91, 88, 87, 70, 34, C3307Iz.Z, C3307Iz.X, 117, 87, 82, 80, 7, 124, 125, 123, C3307Iz.c0, 64, 80, 87, 71, 114, 98, 101, 115, C3307Iz.Z, 55, 48, C3307Iz.c0, 57, C3307Iz.a0, C3307Iz.f0, 49, 85, 69, 66, 73, 116, 102, 113, C3307Iz.V, 2, C8077mf.r, 7, C8077mf.r, 1, 19, 13, 84, 114, 96, 126, 115, 93, 91, 19, C8077mf.m, 35, C3307Iz.X, 107, 117, 71, 75, 67, C8077mf.x, C8077mf.u, C8077mf.D, 28, C8077mf.z, C8077mf.E, C8077mf.C, 55, 58, C3307Iz.a0, 110, 54, 40, C4715Xk.i, 111, C3307Iz.V, C3307Iz.X, C3307Iz.a0, 47, C3307Iz.e0, 10, C8077mf.p, 2, 4, 6, 76, 9, 19, 6, 4, C8077mf.B, C8077mf.G, C8077mf.x, 68, C8077mf.H, C8077mf.E, C8077mf.H, 66, 91, 95, 91, 83, 98, 79, 70, 83, 91, 70, 2, 87, 89, 68, 0, 85, C8077mf.D, ED2.a, 32, C3307Iz.X, 35, 34, C3307Iz.X, C3307Iz.V, C3307Iz.V, 35, 50, 47, 35, 71, 86, 75, 71, 28, 69, 71, 71, 124, 99, 110, 111, 101, C8077mf.u, 13, 0, 1, C8077mf.m, 75, 5, C8077mf.u, 84, 85, 101, 122, 119, 118, 124, 60, 114, 101, 112, 64, 95, 82, 83, 89, C8077mf.C, 82, 89, 90, 84, 79, C8077mf.E, 64, 95, 69, 95, 89, 88, 1, C8077mf.H, 19, C8077mf.u, C8077mf.B, 88, 31, C8077mf.u, 1, C8077mf.x, C8077mf.y, 10, 7, 6, C8077mf.n, 76, C8077mf.p, 19, 87, C8077mf.y, 78, 6, C8077mf.r, 74, 85, 88, 89, 83, 19, 81, 76, 89, 91, Byte.MAX_VALUE, 96, 109, 108, 102, C3307Iz.Y, 100, 121, 108, 110, 59, 96, Byte.MAX_VALUE, 114, 115, 121, 57, 97, 96, 117, C3307Iz.Z, 66, 93, 80, 81, 91, C8077mf.E, 76, C8077mf.C, 66, 90, 80, C8077mf.D, 91, 90, 6, C8077mf.D, 66, 68, C8077mf.n, C3307Iz.d0, 51, 62, ED2.a, 53, 117, 34, 119, C3307Iz.d0, 52, 62, 
        116, 53, 52, 104, 116, C3307Iz.d0, 42, 99, 28, 5, C8077mf.B, 8, 3, C8077mf.C, 108, 106, 42, 34, 78, 72, 8, 1, 40, C3307Iz.f0, 102, C8077mf.m, 13, 68, 51, 50, 48, 48};
    }

    static {
        A0B();
        A02 = new ArrayList<>();
        A03 = Pattern.compile(A06(0, 43, 35));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A00(String str) {
        char c;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(A06(410, 14, 76))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1095064472:
                if (str.equals(A06(C3062Gl1.m, 13, 35))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals(A06(382, 9, 27))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 187078297:
                if (str.equals(A06(391, 9, 56))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals(A06(400, 10, 126))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1505942594:
                if (str.equals(A06(589, 16, 48))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1556697186:
                if (str.equals(A06(563, 13, 52))) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 5;
            case 1:
                return 6;
            case 2:
                return 18;
            case 3:
                return 17;
            case 4:
                return 7;
            case 5:
                return 8;
            case 6:
                return 14;
            default:
                return 0;
        }
    }

    public static int A01(String str) {
        if (TextUtils.isEmpty(str)) {
            if (A01[5].length() != 2) {
                throw new RuntimeException();
            }
            A01[6] = W12.r;
            return -1;
        } else if (A0C(str)) {
            return 1;
        } else {
            if (A0F(str)) {
                return 2;
            }
            if (A0E(str)) {
                return 3;
            }
            if (A0D(str)) {
                return 4;
            }
            if (!A06(108, 15, 43).equals(str)) {
                String[] strArr = A01;
                if (strArr[3].charAt(11) != strArr[1].charAt(11)) {
                    A01[6] = "P";
                    if (A06(203, 18, 4).equals(str)) {
                        return 5;
                    }
                } else {
                    String[] strArr2 = A01;
                    strArr2[3] = "VYI9fOSlD70zieq9X0UMxroKft4rwUnu";
                    strArr2[1] = "fzGTPsiWQenzPklSlTFREKemGkoOHbxS";
                    if (A06(203, 18, 52).equals(str)) {
                        return 5;
                    }
                }
                if (A06(337, 20, 43).equals(str)) {
                    return 5;
                }
                if (A06(176, 27, 14).equals(str)) {
                    if (A01[5].length() != 2) {
                        String[] strArr3 = A01;
                        strArr3[3] = "Wos1JoeCppSzgMBE4aaDrMH9ty47uNW2";
                        strArr3[1] = "garXensuyOOz0HbXKDJZL2oQiQLFCkBX";
                        return 6;
                    }
                    A01[5] = "Xl";
                    return 6;
                }
                return A02(str);
            }
            return 5;
        }
    }

    public static int A02(String str) {
        int customMimeTypeCount = A02.size();
        if (0 < customMimeTypeCount) {
            A02.get(0);
            throw new NullPointerException(A06(837, 8, 19));
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A03(String str, String str2) {
        char c;
        C3I objectType;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(A06(410, 14, 76))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1095064472:
                if (str.equals(A06(C3062Gl1.m, 13, 35))) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals(A06(C2372q.q, 15, 51))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals(A06(382, 9, 27))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 187078297:
                if (str.equals(A06(391, 9, 56))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (A01[5].length() == 2) {
                    String[] strArr = A01;
                    strArr[3] = "EwKVretPP4zz24GiY00TxrDW7emeby9T";
                    strArr[1] = "B8KYZ6ZiEFEzb1yQSMInDl8qsLzStvEt";
                    if (str.equals(A06(400, 10, 126))) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                } else {
                    throw new RuntimeException();
                }
            case 1504831518:
                if (str.equals(A06(InterfaceC8148mw2.g.p, 10, 113))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1505942594:
                if (str.equals(A06(589, 16, 48))) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1556697186:
                if (str.equals(A06(563, 13, 52))) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 9;
            case 1:
                if (str2 == null || (objectType = A04(str2)) == null) {
                    return 0;
                }
                return objectType.A00();
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 18;
            case 5:
                return 17;
            case 6:
                return 7;
            case 7:
                return 8;
            case '\b':
                return 14;
            default:
                return 0;
        }
    }

    public static String A05(int i) {
        switch (i) {
            case 32:
                return A06(926, 13, 70);
            case 33:
                return A06(889, 9, 54);
            case 35:
                if (A01[5].length() != 2) {
                    return A06(916, 10, 82);
                }
                String[] strArr = A01;
                strArr[7] = "sU0jfjATw0ctdBiFmHYtQPiFW02EkiCX";
                strArr[2] = "guUIg4Lmsq3I11Gl64ANQL7INWldoWo0";
                return A06(916, 10, 82);
            case 64:
            case 102:
            case 103:
            case 104:
                return A06(C2372q.q, 15, 51);
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return A06(949, 11, 44);
            case 105:
            case 107:
                String A06 = A06(InterfaceC8148mw2.g.p, 10, 113);
                String[] strArr2 = A01;
                if (strArr2[0].length() != strArr2[4].length()) {
                    String[] strArr3 = A01;
                    strArr3[3] = "3EgQ9ZCWIlOzJdI5B9z9UgtNSs58n98m";
                    strArr3[1] = "jjFHQ5Ntty1zFGyuhEkahCZpCi1GWUO2";
                    return A06;
                }
                break;
            case 106:
                String A062 = A06(939, 10, 25);
                String[] strArr4 = A01;
                if (strArr4[0].length() != strArr4[4].length()) {
                    String[] strArr5 = A01;
                    strArr5[7] = "Q0G2Js2SP22VhhoMfC9OjreCCdB2eOqG";
                    strArr5[2] = "Q6nirM5b9Ts832tqRdA4gMIZJm5lUFYy";
                    return A062;
                }
                break;
            case 108:
                String[] strArr6 = A01;
                if (strArr6[7].charAt(24) != strArr6[2].charAt(24)) {
                    String[] strArr7 = A01;
                    strArr7[0] = "3q9GG3wULEgsyS1YbN3nnd24";
                    strArr7[4] = "ha3UTLVvbbrTPN";
                    return A06(819, 10, 70);
                }
                return A06(819, 10, 70);
            case C10997yd1.o1 /* 163 */:
                return A06(960, 10, 51);
            case C10997yd1.v1 /* 165 */:
                return A06(382, 9, 27);
            case C10997yd1.t1 /* 166 */:
                return A06(400, 10, 126);
            case C7834lj1.G /* 169 */:
            case Xu2.K /* 172 */:
                String A063 = A06(C3062Gl1.m, 13, 35);
                if (A01[5].length() != 2) {
                    String[] strArr8 = A01;
                    strArr8[7] = "SeyAy4vUnEUmatfpO54gBZBxkf1tAmXN";
                    strArr8[2] = "HK24g8A7blS5zcU5SJrZp7eHVCJ7RCNu";
                    return A063;
                }
                String[] strArr9 = A01;
                strArr9[0] = "QXfUpXWFkEqQPG6LX9fSFPLZ";
                strArr9[4] = "Nb6RgsH4bduG1M";
                return A063;
            case C7193j50.f /* 170 */:
            case 171:
                return A06(589, 16, 48);
            case 173:
                return A06(544, 10, 81);
            case C10997yd1.y1 /* 174 */:
                String A064 = A06(391, 9, 56);
                if (A01[5].length() == 2) {
                    String[] strArr10 = A01;
                    strArr10[0] = "XbJnvZsINxENz3xQ1kbTvdGI";
                    strArr10[4] = "tLEzDvxw28XrgL";
                    return A064;
                }
                break;
            case 177:
                return A06(989, 19, 127);
            default:
                return null;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02bc, code lost:
        return A06(391, 9, 56);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02bd, code lost:
        r2 = com.facebook.ads.redexgen.X.C3J.A01;
        r2[3] = "Hu8TImITUClzOpUW7nYqBBb98KuBEnkB";
        r2[1] = "WY5RgWx36bezmxj9o8LdwExpmHYl5ckj";
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02d3, code lost:
        if (r3.startsWith(A06(744, 2, 2)) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02d6, code lost:
        r4 = A06(752, 4, 1);
        r2 = com.facebook.ads.redexgen.X.C3J.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02f0, code lost:
        if (r2[7].charAt(24) == r2[2].charAt(24)) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02f2, code lost:
        r2 = com.facebook.ads.redexgen.X.C3J.A01;
        r2[0] = "M91Alhi5VnxALE4ukQ4PKVvL";
        r2[4] = "SMSBdxcTP4jmFg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0302, code lost:
        if (r3.startsWith(r4) == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x030e, code lost:
        return A06(o.C3062Gl1.m, 13, 35);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x030f, code lost:
        com.facebook.ads.redexgen.X.C3J.A01[5] = "Cp";
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x031a, code lost:
        if (r3.startsWith(r4) == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x032a, code lost:
        if (r3.startsWith(A06(756, 4, 51)) == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0336, code lost:
        return A06(o.InterfaceC8148mw2.e.u, 28, 111);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0344, code lost:
        if (r3.startsWith(A06(760, 4, 102)) != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0353, code lost:
        if (r3.startsWith(A06(764, 4, 120)) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x035f, code lost:
        return A06(589, 16, 48);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x036d, code lost:
        if (r3.startsWith(A06(768, 4, 20)) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0379, code lost:
        return A06(633, 28, 32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x037a, code lost:
        r2 = com.facebook.ads.redexgen.X.C3J.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x038e, code lost:
        if (r2[7].charAt(24) == r2[2].charAt(24)) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0390, code lost:
        com.facebook.ads.redexgen.X.C3J.A01[6] = "S";
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03a2, code lost:
        if (r3.startsWith(A06(854, 4, 117)) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03ae, code lost:
        return A06(544, 10, 81);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x03af, code lost:
        r2 = com.facebook.ads.redexgen.X.C3J.A01;
        r2[0] = "Jkd2X7VsrwTzscknsDYl89LH";
        r2[4] = "Ot0kU0Dq4n3kXQ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x03c6, code lost:
        if (r3.startsWith(A06(854, 0, 67)) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03d6, code lost:
        if (r3.startsWith(A06(1008, 6, 79)) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03e2, code lost:
        return A06(661, 12, 76);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03f0, code lost:
        if (r3.startsWith(A06(802, 4, 95)) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03fb, code lost:
        return A06(o.InterfaceC8148mw2.c.v, 10, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0409, code lost:
        if (r3.startsWith(A06(858, 4, 116)) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0415, code lost:
        return A06(138, 20, 34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0423, code lost:
        if (r3.startsWith(A06(o.J8.h0, 4, 97)) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x042f, code lost:
        return A06(866, 8, 22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x043d, code lost:
        if (r3.contains(A06(723, 6, 65)) == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0449, code lost:
        return A06(70, 19, 31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0456, code lost:
        if (r3.contains(A06(796, 6, 7)) != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0465, code lost:
        if (r3.contains(A06(717, 6, 65)) == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0471, code lost:
        return A06(51, 19, 85);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0476, code lost:
        return A09(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:?, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00db, code lost:
        if (r3.startsWith(A06(780, 4, 64)) != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f9, code lost:
        if (r3.startsWith(A06(780, 4, 14)) != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0109, code lost:
        if (r3.startsWith(A06(o.InterfaceC8148mw2.h.f817o, 4, 79)) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0115, code lost:
        return A06(879, 10, 65);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0125, code lost:
        if (com.facebook.ads.redexgen.X.C3J.A01[5].length() == 2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012c, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012d, code lost:
        r2 = com.facebook.ads.redexgen.X.C3J.A01;
        r2[7] = "LIs8es7LDxkf9lR87RnCT0Q6IgA77Jet";
        r2[2] = "MyiayBE8EONbf9RMcxAbsuNI3CAOFfaC";
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0141, code lost:
        if (r3.startsWith(A06(1025, 3, 88)) != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0150, code lost:
        if (r3.startsWith(A06(1018, 4, 29)) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x015c, code lost:
        return A06(989, 19, 127);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x016a, code lost:
        if (r3.startsWith(A06(o.J8.b0, 3, 123)) != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0179, code lost:
        if (r3.startsWith(A06(1014, 4, 63)) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0185, code lost:
        return A06(970, 19, 17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0193, code lost:
        if (r3.startsWith(A06(845, 4, 19)) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0195, code lost:
        r4 = null;
        r0 = A06(849, 5, 17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a3, code lost:
        if (r3.startsWith(r0) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a5, code lost:
        r0 = A04(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01a9, code lost:
        if (r0 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ab, code lost:
        r4 = A05(r0.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01b1, code lost:
        if (r4 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01bd, code lost:
        return A06(com.facebook.internal.C2372q.q, 15, 51);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01cb, code lost:
        if (r3.startsWith(A06(829, 4, 80)) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01d7, code lost:
        return A06(464, 10, 24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01e5, code lost:
        if (r3.startsWith(A06(833, 4, 86)) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01e7, code lost:
        r3 = A06(474, 10, 126);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fb, code lost:
        if (com.facebook.ads.redexgen.X.C3J.A01[5].length() == 2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01fd, code lost:
        com.facebook.ads.redexgen.X.C3J.A01[5] = "D6";
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0204, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0205, code lost:
        com.facebook.ads.redexgen.X.C3J.A01[6] = "g";
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x020c, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x021a, code lost:
        if (r3.startsWith(A06(43, 4, 99)) != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0229, code lost:
        if (r3.startsWith(A06(740, 4, 99)) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0235, code lost:
        return A06(382, 9, 27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0243, code lost:
        if (r3.startsWith(A06(792, 4, 99)) != false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0252, code lost:
        if (r3.startsWith(A06(748, 4, 61)) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x025e, code lost:
        return A06(400, 10, 126);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x026c, code lost:
        if (r3.startsWith(A06(788, 4, 29)) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0278, code lost:
        return A06(410, 14, 76);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0286, code lost:
        if (r3.startsWith(A06(47, 4, 15)) != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0288, code lost:
        r2 = com.facebook.ads.redexgen.X.C3J.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x029c, code lost:
        if (r2[7].charAt(24) == r2[2].charAt(24)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x029e, code lost:
        com.facebook.ads.redexgen.X.C3J.A01[5] = "nW";
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02b0, code lost:
        if (r3.startsWith(A06(744, 4, 22)) == false) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String A07(String str) {
        if (str == null) {
            String[] strArr = A01;
            if (strArr[0].length() != strArr[4].length()) {
                String[] strArr2 = A01;
                strArr2[7] = "SvDJvdchxZ9YSu8lSvYXeZCMUTwhtG1x";
                strArr2[2] = "IUgKdAdGpS8rKdzIu2M1OICDLczzph13";
                return null;
            }
            throw new RuntimeException();
        }
        String A012 = AbstractC1877k7.A01(str.trim());
        if (A012.startsWith(A06(709, 4, 7)) || A012.startsWith(A06(713, 4, 114))) {
            return A06(889, 9, 54);
        }
        if (A012.startsWith(A06(806, 4, 122)) || A012.startsWith(A06(810, 4, 123))) {
            return A06(916, 10, 82);
        }
        if (!A012.startsWith(A06(776, 4, 67)) && !A012.startsWith(A06(772, 4, 53)) && !A012.startsWith(A06(784, 4, 51))) {
            String[] strArr3 = A01;
            if (strArr3[7].charAt(24) != strArr3[2].charAt(24)) {
                String[] strArr4 = A01;
                strArr4[7] = "QleFjH3SLznkA7Uwmtw8Ximq4GNMAWvA";
                strArr4[2] = "PfY3xwJ2HsEdr0yMvzji2NF813hiEd0w";
            } else {
                A01[6] = "9";
            }
        }
        return A06(898, 18, 19);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String A08(String str) {
        char c;
        switch (str.hashCode()) {
            case -1007807498:
                if (str.equals(A06(682, 12, 44))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -586683234:
                if (str.equals(A06(694, 11, 95))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 187090231:
                if (str.equals(A06(484, 9, 41))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return A06(InterfaceC8148mw2.c.v, 10, 2);
            case 1:
                return A06(InterfaceC8148mw2.g.p, 10, 113);
            case 2:
                return A06(673, 9, 112);
            default:
                return str;
        }
    }

    public static String A09(String str) {
        int customMimeTypeCount = A02.size();
        if (0 < customMimeTypeCount) {
            A02.get(0);
            throw new NullPointerException(A06(729, 11, 27));
        }
        return null;
    }

    public static String A0A(String str) {
        int indexOfSlash;
        if (str == null || (indexOfSlash = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOfSlash);
    }

    public static boolean A0C(String str) {
        return A06(377, 5, 11).equals(A0A(str));
    }

    public static boolean A0D(String str) {
        return A06(814, 5, 109).equals(A0A(str)) || A06(221, 23, 121).equals(str);
    }

    public static boolean A0E(String str) {
        if (!A06(862, 4, 114).equals(A0A(str)) && !A06(51, 19, 85).equals(str) && !A06(70, 19, 31).equals(str) && !A06(244, 25, 111).equals(str) && !A06(357, 20, 125).equals(str)) {
            String[] strArr = A01;
            if (strArr[7].charAt(24) == strArr[2].charAt(24)) {
                throw new RuntimeException();
            }
            A01[5] = "uN";
            if (!A06(138, 20, 34).equals(str) && !A06(290, 28, 121).equals(str) && !A06(269, 21, 1).equals(str) && !A06(InterfaceC8148mw2.a.s, 19, 34).equals(str) && !A06(C3503Kz.r0, 18, 9).equals(str) && !A06(123, 15, 63).equals(str) && !A06(89, 19, 98).equals(str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0F(String str) {
        return A06(874, 5, 47).equals(A0A(str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean A0G(String str, String str2) {
        char c;
        C3I A04;
        int A002;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(A06(410, 14, 76))) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -432837260:
                if (str.equals(A06(518, 13, 57))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -432837259:
                if (str.equals(A06(531, 13, 14))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals(A06(C2372q.q, 15, 51))) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                String[] strArr = A01;
                if (strArr[0].length() != strArr[4].length()) {
                    String[] strArr2 = A01;
                    strArr2[0] = "7TZi0YNdbKzS3YWl27UD3YdF";
                    strArr2[4] = "fIx4E556Fk4RSg";
                    if (str.equals(A06(382, 9, 27))) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                } else {
                    throw new RuntimeException();
                }
            case 187094639:
                if (str.equals(A06(g.d1, 9, 100))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals(A06(400, 10, 126))) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1504619009:
                if (str.equals(A06(InterfaceC8148mw2.c.v, 10, 2))) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (str.equals(A06(InterfaceC8148mw2.g.p, 10, 113))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1903231877:
                if (str.equals(A06(C9196rD2.c, 15, 83))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1903589369:
                if (str.equals(A06(449, 15, 93))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
                return true;
            case '\n':
                return (str2 == null || (A04 = A04(str2)) == null || (A002 = A04.A00()) == 0 || A002 == 16) ? false : true;
            default:
                return false;
        }
    }
}
