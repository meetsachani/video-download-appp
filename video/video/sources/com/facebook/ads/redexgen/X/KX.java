package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C10997yd1;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C8077mf;
import o.CK1;
import o.ED2;
import o.QC1;

/* loaded from: assets/audience_network/classes2.dex */
public final class KX {
    public static byte[] A02;
    public static String[] A03 = {"WgUeKuj9wfEgVxNwMhsYWmskS6gvsk4u", "lY3t8mYoNwyGRU5cssOmtzsYdTPyfvrC", "tzc0Un4Rz02llsU2wRoiLNj111WzmA0w", "wjCansXDTCdJlU5xzgIWdtLXD8W6m4ff", "dSf2E5RYsrIqqVu4QtCEIfuVexQKgaAl", "hprG2SUWJwqzwErLsBPmt0UTVTrRmWBo", "Dvzgny", "YcbZLjapWumuyxPaIgpkq7v611"};
    public static final Pattern A04;
    public static final Pattern A05;
    public final C04774v A00 = new C04774v();
    public final StringBuilder A01 = new StringBuilder();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 113);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A02 = new byte[]{8, 90, 83, C8077mf.A, 57, 121, 34, 34, 123, 109, 125, 106, 96, 71, 95, 72, 69, 64, 77, 9, 79, 70, 71, 93, 4, 90, 64, 83, 76, 19, 9, C8077mf.p, 95, 109, 106, 126, 124, 124, 75, 123, 123, 88, 105, 122, 123, 109, 122, 36, 86, C8077mf.y, C8077mf.u, ED2.a, C3307Iz.Y, 32, 42, C3307Iz.d0, 116, 107, 97, C8077mf.u, C8077mf.A, 107, C8077mf.x, 99, 96, 107, C8077mf.y, C8077mf.x, C3307Iz.d0, 90, 90, 77, 72, C3307Iz.a0, 66, 95, 75, 47, 88, C3307Iz.f0, 92, 91, 77, C3307Iz.a0, 66, 95, 75, 47, 89, 91, 90, 2, 10, C8077mf.p, C8077mf.A, 31, C8077mf.p, 87, 91, 86, C3307Iz.Z, 42, 42, 19, C8077mf.r, C8077mf.u, C8077mf.D, C8077mf.z, 3, C8077mf.H, 4, 31, C8077mf.y, 92, C8077mf.u, C8077mf.H, C8077mf.G, C8077mf.H, 3, 93, 80, 83, 91, 52, 56, 59, 56, C3307Iz.X, 6, C8077mf.m, 5, C8077mf.m, C8077mf.z, 17, 116, 124, 51, 58, 59, C3307Iz.V, QC1.w, 51, 52, 56, 60, 57, C3307Iz.d0, 100, 109, 108, 118, 47, 113, 107, QC1.w, 103, 111, 102, 103, 125, 36, 122, 125, 112, 101, 108, 40, C3307Iz.V, 32, 58, 99, 57, C3307Iz.c0, C3307Iz.Z, C3307Iz.a0, C3307Iz.Y, 58, 101, QC1.w, 109, 96, 101, 111, C8077mf.u, C8077mf.m, C8077mf.B, C8077mf.q, 119, Byte.MAX_VALUE, 124, 123, 108, 119, 35, 126, 97, 125, 103, 122, 103, 97, 96, 42, 59, C3307Iz.Y, 42, 115, C4715Xk.i, 49, 51, 60, 55, 48, 59, 115, C3307Iz.c0, C3307Iz.f0, C3307Iz.d0, 55, 57, 54, 42, 69, 84, 73, 69, 28, 85, 84, 82, 94, 67, 80, 69, 88, 94, 95, 117, 110, 100, 101, 114, C8077mf.u, 9, 3, 2, C8077mf.y, C8077mf.m, C8077mf.p, 9, 2, C3307Iz.X, 115};
    }

    static {
        A07();
        A05 = Pattern.compile(A01(49, 19, 56));
        A04 = Pattern.compile(A01(68, 32, 3));
    }

    public static char A00(C04774v c04774v, int i) {
        return (char) c04774v.A0l()[i];
    }

    public static String A02(C04774v c04774v) {
        int limit = c04774v.A09();
        int A0A = c04774v.A0A();
        char c = 0;
        while (limit < A0A && c == 0) {
            int i = limit + 1;
            int position = c04774v.A0l()[limit];
            int limit2 = (char) position;
            c = limit2 == 41 ? (char) 1 : (char) 0;
            limit = i;
        }
        int position2 = c04774v.A09();
        String trim = c04774v.A0W((limit - 1) - position2).trim();
        int limit3 = A03[6].length();
        if (limit3 != 22) {
            A03[6] = "T";
            return trim;
        }
        throw new RuntimeException();
    }

    public static String A03(C04774v c04774v, StringBuilder sb) {
        sb.setLength(0);
        int A09 = c04774v.A09();
        int A0A = c04774v.A0A();
        boolean z = false;
        while (A09 < A0A && !z) {
            int position = c04774v.A0l()[A09];
            char c = (char) position;
            if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                A09++;
                sb.append(c);
            } else {
                z = true;
            }
        }
        int position2 = c04774v.A09();
        c04774v.A0g(A09 - position2);
        return sb.toString();
    }

    public static String A04(C04774v c04774v, StringBuilder sb) {
        A09(c04774v);
        if (c04774v.A07() == 0) {
            return null;
        }
        String A032 = A03(c04774v, sb);
        String A01 = A01(0, 0, 111);
        if (!A01.equals(A032)) {
            return A032;
        }
        String identifier = A01 + ((char) c04774v.A0I());
        return identifier;
    }

    public static String A05(C04774v c04774v, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int A09 = c04774v.A09();
            String token = A04(c04774v, sb);
            if (token == null) {
                return null;
            }
            if (A01(252, 1, 127).equals(token) || A01(11, 1, 32).equals(token)) {
                c04774v.A0f(A09);
                z = true;
            } else {
                sb2.append(token);
            }
        }
        String token2 = sb2.toString();
        String[] strArr = A03;
        if (strArr[5].charAt(6) != strArr[0].charAt(6)) {
            A03[1] = "H7IbVoVWHhMCEaN9uIz63JDuRBiIUDdu";
            return token2;
        }
        throw new RuntimeException();
    }

    public static String A06(C04774v c04774v, StringBuilder sb) {
        A09(c04774v);
        if (c04774v.A07() < 5) {
            return null;
        }
        String A0W = c04774v.A0W(5);
        String cueSelector = A01(6, 5, 105);
        if (cueSelector.equals(A0W)) {
            int A09 = c04774v.A09();
            String token = A04(c04774v, sb);
            if (token == null) {
                return null;
            }
            String cueSelector2 = A01(C10997yd1.w1, 1, 47);
            if (cueSelector2.equals(token)) {
                c04774v.A0f(A09);
                String cueSelector3 = A01(0, 0, 111);
                return cueSelector3;
            }
            String str = null;
            String cueSelector4 = A01(3, 1, 78);
            if (cueSelector4.equals(token)) {
                str = A02(c04774v);
            }
            String target = A04(c04774v, sb);
            if (A03[1].charAt(23) != '0') {
                A03[2] = "kXJ9Slail85MSzeGoJKC016PF6DECpEt";
                String cueSelector5 = A01(4, 1, 97);
                if (cueSelector5.equals(target)) {
                    return str;
                }
                return null;
            }
            throw new RuntimeException();
        }
        return null;
    }

    public static void A08(C04774v c04774v) {
        String line;
        do {
            line = c04774v.A0T();
        } while (!TextUtils.isEmpty(line));
    }

    public static void A09(C04774v c04774v) {
        boolean skipping = true;
        while (c04774v.A07() > 0 && skipping) {
            boolean A0E = A0E(c04774v);
            String[] strArr = A03;
            if (strArr[5].charAt(6) == strArr[0].charAt(6)) {
                throw new RuntimeException();
            }
            A03[4] = "0TKGD6osFOak97huLTwvjNDJFBkvRURl";
            if (!A0E) {
                boolean skipping2 = A0D(c04774v);
                if (!skipping2) {
                    skipping = false;
                }
            }
            skipping = true;
        }
    }

    public static void A0A(C04774v c04774v, C0855Kb c0855Kb, StringBuilder sb) {
        A09(c04774v);
        String A032 = A03(c04774v, sb);
        String A01 = A01(0, 0, 111);
        if (A01.equals(A032)) {
            return;
        }
        String property = A03[7];
        if (property.length() != 9) {
            String[] strArr = A03;
            strArr[5] = "0USPULEwqSqheHB8AwvifNHGUwFlc4Dk";
            strArr[0] = "K61Ol0RKHiZGAookV7xLX0vZAqBJUPJk";
            String A012 = A01(5, 1, 50);
            String property2 = A04(c04774v, sb);
            if (!A012.equals(property2)) {
                return;
            }
            A09(c04774v);
            String token = A05(c04774v, sb);
            if (token == null || A01.equals(token)) {
                return;
            }
            int A09 = c04774v.A09();
            String A042 = A04(c04774v, sb);
            String property3 = A01(11, 1, 32);
            if (!property3.equals(A042)) {
                String property4 = A01(252, 1, 127);
                if (property4.equals(A042)) {
                    c04774v.A0f(A09);
                } else {
                    return;
                }
            }
            String property5 = A01(123, 5, 38);
            if (property5.equals(A032)) {
                c0855Kb.A0C(AnonymousClass47.A00(token));
                return;
            }
            String property6 = A01(103, 16, 0);
            if (property6.equals(A032)) {
                c0855Kb.A0B(AnonymousClass47.A00(token));
                return;
            }
            String property7 = A01(CK1.w, 13, 127);
            boolean z = true;
            if (property7.equals(A032)) {
                String property8 = A01(C10997yd1.n2, 4, 12);
                if (property8.equals(token)) {
                    c0855Kb.A0E(1);
                    return;
                }
                String property9 = A01(237, 5, 113);
                if (!property9.equals(token)) {
                    return;
                }
                c0855Kb.A0E(2);
                return;
            }
            String[] strArr2 = A03;
            String str = strArr2[5];
            String value = strArr2[0];
            int position = str.charAt(6);
            if (position != value.charAt(6)) {
                A03[7] = "r";
                String property10 = A01(202, 20, 47);
                if (property10.equals(A032)) {
                    String property11 = A01(100, 3, 55);
                    if (!property11.equals(token)) {
                        String property12 = A01(128, 6, 19);
                        if (!token.startsWith(property12)) {
                            z = false;
                        }
                    }
                    c0855Kb.A0H(z);
                    return;
                }
                String property13 = A01(222, 15, 64);
                boolean equals = property13.equals(A032);
                int position2 = A03[1].charAt(23);
                if (position2 == 48) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A03;
                strArr3[5] = "yV6z32KBYC5kRTQJBEYXfmL3n0QpULhq";
                strArr3[0] = "ddMdMWLPn2YWu0ZxAW3O28brDgrMgVms";
                if (equals) {
                    String property14 = A01(242, 9, 22);
                    if (!property14.equals(token)) {
                        return;
                    }
                    c0855Kb.A0J(true);
                    return;
                }
                String property15 = A01(136, 11, 36);
                if (property15.equals(A032)) {
                    c0855Kb.A0F(token);
                    return;
                }
                String property16 = A01(C10997yd1.t1, 11, 63);
                if (property16.equals(A032)) {
                    String property17 = A01(119, 4, 78);
                    if (!property17.equals(token)) {
                        return;
                    }
                    c0855Kb.A0G(true);
                    return;
                }
                String property18 = A01(C3503Kz.p0, 10, 120);
                if (property18.equals(A032)) {
                    String property19 = A01(177, 6, 125);
                    if (!property19.equals(token)) {
                        return;
                    }
                    c0855Kb.A0I(true);
                    return;
                }
                String property20 = A01(147, 9, 115);
                if (!property20.equals(A032)) {
                    return;
                }
                A0C(token, c0855Kb);
                return;
            }
        }
        throw new RuntimeException();
    }

    private void A0B(C0855Kb c0855Kb, String str) {
        if (A01(0, 0, 111).equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = A05.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                c0855Kb.A0N((String) AbstractC04543y.A01(matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        String[] A1O = C5C.A1O(str, A01(47, 2, 9));
        String str2 = A1O[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            c0855Kb.A0M(str2.substring(0, indexOf2));
            int voiceStartIndex = indexOf2 + 1;
            c0855Kb.A0L(str2.substring(voiceStartIndex));
        } else {
            c0855Kb.A0M(str2);
        }
        int voiceStartIndex2 = A1O.length;
        if (voiceStartIndex2 > 1) {
            int voiceStartIndex3 = A1O.length;
            c0855Kb.A0O((String[]) C5C.A1J(A1O, 1, voiceStartIndex3));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void A0C(String str, C0855Kb c0855Kb) {
        char c;
        Matcher matcher = A04.matcher(AbstractC1877k7.A01(str));
        if (!matcher.matches()) {
            AbstractC04624g.A07(A01(32, 15, 121), A01(12, 20, 88) + str + A01(1, 2, 12));
            return;
        }
        String str2 = (String) AbstractC04543y.A01(matcher.group(2));
        switch (str2.hashCode()) {
            case 37:
                if (str2.equals(A01(0, 1, 92))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3240:
                if (str2.equals(A01(134, 2, 96))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3592:
                if (str2.equals(A01(C10997yd1.l2, 2, 118))) {
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
                c0855Kb.A0D(1);
                break;
            case 1:
                c0855Kb.A0D(2);
                break;
            case 2:
                if (A03[6].length() != 22) {
                    A03[3] = "l0BGY6Ka6m0f3MeGwvnWH7AIpst7Q8cB";
                    c0855Kb.A0D(3);
                    break;
                } else {
                    throw new RuntimeException();
                }
            default:
                throw new IllegalStateException();
        }
        c0855Kb.A0A(Float.parseFloat((String) AbstractC04543y.A01(matcher.group(1))));
    }

    public static boolean A0D(C04774v c04774v) {
        int position = c04774v.A09();
        int limit = c04774v.A0A();
        byte[] A0l = c04774v.A0l();
        if (position + 2 <= limit) {
            int i = position + 1;
            if (A0l[position] == 47) {
                int i2 = i + 1;
                if (A0l[i] == 42) {
                    while (i2 + 1 < limit) {
                        int i3 = i2 + 1;
                        char skippedChar = (char) A0l[i2];
                        if (skippedChar == '*') {
                            char skippedChar2 = (char) A0l[i3];
                            if (skippedChar2 == '/') {
                                limit = i3 + 1;
                                i2 = limit;
                            }
                        }
                        i2 = i3;
                    }
                    c04774v.A0g(limit - c04774v.A09());
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean A0E(C04774v c04774v) {
        switch (A00(c04774v, c04774v.A09())) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
                c04774v.A0g(1);
                return true;
            default:
                return false;
        }
    }

    public final List<C0855Kb> A0F(C04774v c04774v) {
        String selector;
        this.A01.setLength(0);
        int A09 = c04774v.A09();
        A08(c04774v);
        C04774v c04774v2 = this.A00;
        byte[] A0l = c04774v.A0l();
        int initialInputPosition = c04774v.A09();
        c04774v2.A0j(A0l, initialInputPosition);
        this.A00.A0f(A09);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String selector2 = A06(this.A00, this.A01);
            if (selector2 == null) {
                return arrayList;
            }
            if (!A01(C10997yd1.w1, 1, 47).equals(A04(this.A00, this.A01))) {
                return arrayList;
            }
            C0855Kb c0855Kb = new C0855Kb();
            A0B(c0855Kb, selector2);
            String str = null;
            boolean z = false;
            while (true) {
                selector = A01(252, 1, 127);
                if (z) {
                    break;
                }
                int A092 = this.A00.A09();
                str = A04(this.A00, this.A01);
                z = str == null || selector.equals(str);
                if (!z) {
                    this.A00.A0f(A092);
                    A0A(this.A00, c0855Kb, this.A01);
                }
            }
            if (selector.equals(str)) {
                arrayList.add(c0855Kb);
            }
        }
    }
}
