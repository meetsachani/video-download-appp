package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.regex.Pattern;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public final class KI {
    public static byte[] A03;
    public static String[] A04 = {"", "Q0QXG7UXIASt6u", "Y6SVRxSvJsGy", "wBfOUWbjS5LHnahIVXYrmUjJKL6", "ipHEpqQaRUeTeVi", "GLcEQz2dRHwid1MPYevx9K5BLffqxfdD", "Wfr02cBS22Xusns9ZD5ofvGEf4mY", "O3Zlf7dyK7vHpITYdVNftiUJDGPL2j8I"};
    public static final BO<String> A05;
    public static final BO<String> A06;
    public static final BO<String> A07;
    public static final BO<String> A08;
    public static final Pattern A09;
    public final int A00;
    public final int A01;
    public final int A02;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
        if (r4.equals(A02(8, 4, 55)) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013a, code lost:
        if (r5.equals(r1) != false) goto L36;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static KI A00(BO<String> bo) {
        char c;
        int i;
        char c2;
        int i2;
        int i3;
        int i4;
        C0620Aw A02 = AbstractC2265qj.A02(A07, bo);
        String A022 = A02(41, 7, 120);
        String str = (String) AbstractC2165p2.A00(A02, A022);
        char c3 = 2;
        char c4 = 1;
        switch (str.hashCode()) {
            case -1392885889:
                if (str.equals(A02(12, 6, 124))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1106037339:
                if (str.equals(A022)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 92734940:
                if (str.equals(A02(3, 5, 92))) {
                    c = 0;
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
                i = 2;
                break;
            case 1:
                i = -2;
                break;
            default:
                i = 1;
                break;
        }
        C0620Aw A023 = AbstractC2265qj.A02(A08, bo);
        if (!A023.isEmpty()) {
            String str2 = (String) A023.iterator().next();
            switch (str2.hashCode()) {
                case 3005871:
                    break;
                case 3387192:
                    if (str2.equals(A02(33, 4, 110))) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                    i4 = 0;
                    break;
                default:
                    i4 = -1;
                    break;
            }
            return new KI(i4, 0, i);
        }
        C0620Aw A024 = AbstractC2265qj.A02(A05, bo);
        C0620Aw A025 = AbstractC2265qj.A02(A06, bo);
        if (A024.isEmpty() && A025.isEmpty()) {
            return new KI(-1, 0, i);
        }
        String A026 = A02(27, 6, 34);
        String str3 = (String) AbstractC2165p2.A00(A024, A026);
        switch (str3.hashCode()) {
            case -1274499742:
                if (str3.equals(A026)) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 3417674:
                if (str3.equals(A02(37, 4, 110))) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                i2 = 2;
                break;
            default:
                i2 = 1;
                break;
        }
        String A027 = A02(18, 6, 126);
        String str4 = (String) AbstractC2165p2.A00(A025, A027);
        switch (str4.hashCode()) {
            case -1360216880:
                break;
            case -905816648:
                String[] strArr = A04;
                if (strArr[1].length() != strArr[3].length()) {
                    A04[2] = "eITMiFQvxpZW";
                    if (str4.equals(A02(48, 6, 85))) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                } else {
                    throw new RuntimeException();
                }
            case 99657:
                if (str4.equals(A02(24, 3, 110))) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
            case 0:
                i3 = 2;
                break;
            case 1:
                i3 = 3;
                break;
            default:
                i3 = 1;
                break;
        }
        return new KI(i3, i2, i);
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 95);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{56, C8077mf.A, 79, 98, 101, 119, 102, 113, 9, C8077mf.G, 28, 7, 65, 70, 69, 76, 81, 70, 66, 72, 83, 66, 77, 68, 85, 94, 69, C8077mf.E, C8077mf.x, 17, 17, C8077mf.B, C8077mf.C, 95, 94, 95, 84, 94, 65, 84, 95, 72, 82, 83, 84, 78, 67, 66, 121, 111, 121, 107, 103, 111};
    }

    static {
        A03();
        A09 = Pattern.compile(A02(0, 3, 59));
        A08 = BO.A05(A02(8, 4, 55), A02(33, 4, 110));
        A06 = BO.A06(A02(24, 3, 110), A02(48, 6, 85), A02(18, 6, 126));
        A05 = BO.A05(A02(27, 6, 34), A02(37, 4, 110));
        A07 = BO.A06(A02(3, 5, 92), A02(12, 6, 124), A02(41, 7, 120));
    }

    public KI(int i, int i2, int i3) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
    }

    public static KI A01(String str) {
        if (str == null) {
            return null;
        }
        String parsingValue = AbstractC1877k7.A01(str.trim());
        if (parsingValue.isEmpty()) {
            return null;
        }
        BO A082 = BO.A08(TextUtils.split(parsingValue, A09));
        String[] strArr = A04;
        if (strArr[1].length() != strArr[3].length()) {
            A04[5] = "GSUJCg4XeXOvDUAO5uYW1LZcLl5OFxUg";
            return A00(A082);
        }
        throw new RuntimeException();
    }
}
