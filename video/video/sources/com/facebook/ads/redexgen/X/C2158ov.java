package com.facebook.ads.redexgen.X;

import android.text.Html;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.Inflater;
import o.C10323vs;
import o.C10997yd1;
import o.C2638Cg0;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C8077mf;
import o.C8206nB;
import o.C8463oE0;
import o.C8920q7;
import o.ED2;
import o.Hw2;
import o.InterfaceC8148mw2;
import o.Xu2;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.facebook.ads.redexgen.X.ov  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2158ov implements EP {
    public static byte[] A01;
    public final /* synthetic */ C2157ou A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 18);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{118, 67, 67, 82, 90, 71, 67, 82, 83, C8077mf.A, 67, 88, C8077mf.A, 84, 69, 82, 86, 67, 82, C8077mf.A, 83, 82, 84, 88, 83, 82, 69, C8077mf.A, 81, 88, 69, C8077mf.A, 66, 89, 68, 66, 71, 71, 88, 69, 67, 82, 83, C8077mf.A, 81, 88, 69, 90, 86, 67, 28, 13, 13, 17, C8077mf.x, C8077mf.H, 28, 9, C8077mf.x, C8077mf.u, 19, 82, C8077mf.H, C8077mf.B, 28, 80, 75, 77, 69, 121, 104, 104, 116, 113, 123, 121, 108, 113, 119, 118, 55, 123, 125, 121, 53, 47, 40, 32, 107, 122, 122, 102, 99, 105, 107, 126, 99, 101, 100, C3307Iz.X, 110, 124, 104, 121, Byte.MAX_VALUE, 104, 121, 69, 84, 84, 72, 77, 71, 69, 80, 77, 75, 74, C8077mf.m, 84, 67, 87, 5, C8077mf.x, C8077mf.x, 8, 13, 7, 5, C8077mf.r, 13, C8077mf.m, 10, 75, C8077mf.r, C8077mf.r, 9, 8, 79, 28, 9, 8, 0, 17, 17, 13, 8, 2, 0, C8077mf.y, 8, C8077mf.p, C8077mf.q, 78, C8077mf.C, 76, C8077mf.n, 17, 85, 76, 2, 4, 0, 76, 87, 81, 89, 53, 36, 36, 56, C4715Xk.i, 55, 53, 32, C4715Xk.i, 59, 58, 123, C3307Iz.d0, 121, 57, 36, 96, 121, 34, 32, 32, 50, 35, 35, ED2.a, 58, 48, 50, C3307Iz.Z, 58, 60, C4715Xk.i, 124, C3307Iz.c0, 126, 34, C3307Iz.Y, 58, 48, 56, C3307Iz.Z, 58, 62, 54, 126, C3307Iz.Z, C3307Iz.c0, 96, 52, C8077mf.n, C8077mf.G, C8077mf.G, 1, 4, C8077mf.p, C8077mf.n, C8077mf.C, 4, 2, 3, 66, C8077mf.y, 64, C8077mf.H, C8077mf.B, C8077mf.q, 31, 4, C8077mf.G, 68, 85, 72, 68, 31, 70, 68, 68, 83, 66, 95, 83, 8, 95, 10, 84, 84, 70};
    }

    public C2158ov(C2157ou c2157ou) {
        this.A00 = c2157ou;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.ads.redexgen.X.EP
    public final InterfaceC1981lq A5K(C2242qI c2242qI) {
        char c;
        String str = c2242qI.A0W;
        switch (str.hashCode()) {
            case -1351681404:
                if (str.equals(A00(88, 19, 24))) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1248334819:
                if (str.equals(A00(107, 15, 54))) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1026075066:
                if (str.equals(A00(167, 21, 70))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1004728940:
                if (str.equals(A00(236, 8, 34))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 691401887:
                if (str.equals(A00(Xu2.A, 28, 65))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 822864842:
                if (str.equals(A00(244, 10, 53))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 930165504:
                if (str.equals(A00(C3503Kz.f0, 25, 115))) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1566015601:
                if (str.equals(A00(50, 19, 111))) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1566016562:
                if (str.equals(A00(69, 19, 10))) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1668750253:
                if (str.equals(A00(216, 20, 127))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1693976202:
                if (str.equals(A00(122, 20, 118))) {
                    c = 3;
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
                return new C8T() { // from class: com.facebook.ads.redexgen.X.1M
                    public static byte[] A02;
                    public static String[] A03 = {"epLQ4LbruRQu4TauEDrO5bv5Gt", "lRHUrkH9gFGX2N51jXHSI4WiLesC2sz", "FQaGWX09aBSonO1KXWblQ89ZNSDo33Hs", "Tkmuz5Wj47OzYTdqGDI6w0S24YPshGEJ", "sgOZPElMCLLZtQnBcWUjhEzDIZNKx3Aa", "fl5M4MkFrWZTay9Eb0GxyqH", "d522uHqhkgB6wqoRNygeE3zqn3vb1GZ9", "ktGThckFXvstcJxcyByVYeW6HtIWaGJ1"};
                    public final C04774v A00;
                    public final KX A01;

                    public static String A01(int i, int i2, int i3) {
                        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 88);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A02() {
                        A02 = new byte[]{123, C8077mf.D, 73, 78, 67, 86, 95, C8077mf.D, 88, 86, 85, 89, 81, C8077mf.D, 77, 91, 73, C8077mf.D, 92, 85, 79, 84, 94, C8077mf.D, 91, 92, 78, 95, 72, C8077mf.D, 78, 82, 95, C8077mf.D, 92, 83, 72, 73, 78, C8077mf.D, 89, 79, 95, C8077mf.x, 108, 109, 118, 103, 88, 95, 82, 71, 78, 53, 7, 0, C8077mf.x, C8077mf.z, C8077mf.z, C3307Iz.Y, 7, 1, 13, 6, 7, C8077mf.r};
                    }

                    static {
                        A02();
                    }

                    {
                        A01(53, 13, 58);
                        this.A00 = new C04774v();
                        this.A01 = new KX();
                    }

                    public static int A00(C04774v c04774v) {
                        int currentInputPosition = -1;
                        int i = 0;
                        while (currentInputPosition == -1) {
                            i = c04774v.A09();
                            String A0T = c04774v.A0T();
                            if (A0T == null) {
                                currentInputPosition = 0;
                            } else if (A01(48, 5, 83).equals(A0T)) {
                                currentInputPosition = 2;
                            } else if (A0T.startsWith(A01(44, 4, 122))) {
                                currentInputPosition = 1;
                            } else {
                                currentInputPosition = 3;
                            }
                        }
                        c04774v.A0f(i);
                        return currentInputPosition;
                    }

                    public static void A03(C04774v c04774v) {
                        do {
                        } while (!TextUtils.isEmpty(c04774v.A0T()));
                    }

                    @Override // com.facebook.ads.redexgen.X.C8T
                    public final InterfaceC0837Jj A0g(byte[] bArr, int i, boolean z) throws C1974lj {
                        C0859Kf A0A;
                        this.A00.A0j(bArr, i);
                        ArrayList arrayList = new ArrayList();
                        try {
                            AbstractC0868Ko.A04(this.A00);
                            do {
                            } while (!TextUtils.isEmpty(this.A00.A0T()));
                            ArrayList arrayList2 = new ArrayList();
                            while (true) {
                                int A00 = A00(this.A00);
                                if (A00 == 0) {
                                    return new C1964lZ(arrayList2);
                                }
                                String[] strArr = A03;
                                if (strArr[3].charAt(29) != strArr[7].charAt(29)) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A03;
                                strArr2[5] = "xiLYwX29jkzhCedrUoNIffc";
                                strArr2[0] = "YvTJvYd1hKFZiQGGAeLzXV3lAN";
                                if (A00 == 1) {
                                    A03(this.A00);
                                } else if (A00 == 2) {
                                    if (arrayList2.isEmpty()) {
                                        this.A00.A0T();
                                        arrayList.addAll(this.A01.A0F(this.A00));
                                    } else {
                                        throw new C1974lj(A01(0, 44, 98));
                                    }
                                } else if (A00 == 3 && (A0A = AbstractC0867Kn.A0A(this.A00, arrayList)) != null) {
                                    arrayList2.add(A0A);
                                }
                            }
                        } catch (C3K e) {
                            throw new C1974lj(e);
                        }
                    }
                };
            case 1:
                return new C1R(c2242qI.A0X);
            case 2:
                return new C8T() { // from class: com.facebook.ads.redexgen.X.1N
                    public static byte[] A01;
                    public final C04774v A00;

                    static {
                        A02();
                    }

                    public static String A01(int i, int i2, int i3) {
                        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 125);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A02() {
                        A01 = new byte[]{C8077mf.z, 59, 48, 60, 58, C4715Xk.i, 57, 50, 65, 50, -19, C8077mf.D, C4715Xk.i, 1, 36, 50, 47, 67, 65, 65, -19, C3307Iz.V, 60, C4715Xk.i, -19, C8077mf.C, 50, 67, 50, 57, -19, 47, 60, 69, -19, 53, 50, C3307Iz.f0, 49, 50, ED2.a, -19, 51, 60, 66, 59, 49, -5, 47, 84, 73, 85, 83, 86, 82, 75, 90, 75, 6, 92, 90, 90, 6, 73, 91, 75, 6, 72, 85, 94, 6, 78, 75, 71, 74, 75, 88, 6, 76, 85, 91, 84, 74, C8077mf.x, 62, 97, C3307Iz.X, 72, 86, 83, 103, 101, 101, 53, 86, 84, 96, 85, 86, 99};
                    }

                    {
                        A01(84, 16, 116);
                        this.A00 = new C04774v();
                    }

                    public static C2192pT A00(C04774v c04774v, int i) throws C1974lj {
                        C04443o c04443o = null;
                        CharSequence charSequence = null;
                        while (i > 0) {
                            if (i >= 8) {
                                int A0C = c04774v.A0C();
                                int boxType = c04774v.A0C();
                                int boxSize = A0C - 8;
                                String A0r = C5C.A0r(c04774v.A0l(), c04774v.A09(), boxSize);
                                c04774v.A0g(boxSize);
                                i = (i - 8) - boxSize;
                                if (boxType == 1937011815) {
                                    c04443o = AbstractC0867Kn.A08(A0r);
                                } else if (boxType == 1885436268) {
                                    charSequence = AbstractC0867Kn.A07(null, A0r.trim(), Collections.emptyList());
                                }
                            } else {
                                throw new C1974lj(A01(48, 36, 105));
                            }
                        }
                        if (charSequence == null) {
                            charSequence = A01(0, 0, 70);
                        }
                        if (c04443o != null) {
                            C04443o cueBuilder = c04443o.A0G(charSequence);
                            return cueBuilder.A0H();
                        }
                        return AbstractC0867Kn.A09(charSequence);
                    }

                    @Override // com.facebook.ads.redexgen.X.C8T
                    public final InterfaceC0837Jj A0g(byte[] bArr, int i, boolean z) throws C1974lj {
                        this.A00.A0j(bArr, i);
                        ArrayList arrayList = new ArrayList();
                        while (this.A00.A07() > 0) {
                            if (this.A00.A07() >= 8) {
                                int boxType = this.A00.A0C();
                                int boxSize = this.A00.A0C();
                                if (boxSize == 1987343459) {
                                    arrayList.add(A00(this.A00, boxType - 8));
                                } else {
                                    this.A00.A0g(boxType - 8);
                                }
                            } else {
                                throw new C1974lj(A01(0, 48, 80));
                            }
                        }
                        return new C1965la(arrayList);
                    }
                };
            case 3:
                return new C8T() { // from class: com.facebook.ads.redexgen.X.1P
                    public static byte[] A01;
                    public static String[] A02 = {"p1JjjwHZ", "QiEjWLFXcVg7o", "nhuwGOrxAOZ3j55eqRpahgaz0GwfX6tj", "6yXpXZapadp8VRb316vvjAm5hV4yaSxg", "TGmXy7X22d03bAdpvyZyh6X1I", "ARR0m23eYWSlS3UtdvlKiKeM", "Lwdw5zAjTw10lXQrei1yTZcIsGO5NNLU", "PxBJlerCHj8MDVjvQLeWSQf3c"};
                    public static final Pattern A03;
                    public static final Pattern A04;
                    public static final KJ A05;
                    public static final KK A06;
                    public static final Pattern A07;
                    public static final Pattern A08;
                    public static final Pattern A09;
                    public static final Pattern A0A;
                    public static final Pattern A0B;
                    public final XmlPullParserFactory A00;

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code restructure failed: missing block: B:38:0x0119, code lost:
                        if (r3.equals(A0A(1679, 1, 82)) != false) goto L26;
                     */
                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public static long A01(String str2, KK kk) throws C1974lj {
                        Matcher matcher = A08.matcher(str2);
                        char c2 = 5;
                        if (matcher.matches()) {
                            double parseLong = (Long.parseLong((String) AbstractC04543y.A01(matcher.group(1))) * 3600) + (Long.parseLong((String) AbstractC04543y.A01(matcher.group(2))) * 60) + Long.parseLong((String) AbstractC04543y.A01(matcher.group(3)));
                            String group = matcher.group(4);
                            double parseDouble = parseLong + (group != null ? Double.parseDouble(group) : 0.0d);
                            String group2 = matcher.group(5);
                            String[] strArr = A02;
                            if (strArr[1].length() != strArr[5].length()) {
                                String[] strArr2 = A02;
                                strArr2[6] = "mLEwrm7vKLrlfB6LVj0FJa0TtKMuAs5P";
                                strArr2[2] = "qTZwtworCWndH0Ay7tgKRNpRsf0PfjPC";
                                double parseLong2 = parseDouble + (group2 != null ? ((float) Long.parseLong(group2)) / kk.A00 : 0.0d);
                                String group3 = matcher.group(6);
                                return (long) (1000000.0d * (parseLong2 + (group3 != null ? (Long.parseLong(group3) / kk.A01) / kk.A00 : 0.0d)));
                            }
                            throw new RuntimeException();
                        }
                        Matcher matcher2 = A0A.matcher(str2);
                        if (matcher2.matches()) {
                            double parseDouble2 = Double.parseDouble((String) AbstractC04543y.A01(matcher2.group(1)));
                            String str3 = (String) AbstractC04543y.A01(matcher2.group(2));
                            switch (str3.hashCode()) {
                                case 102:
                                    if (str3.equals(A0A(1361, 1, 8))) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 104:
                                    if (str3.equals(A0A(1467, 1, 40))) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 109:
                                    if (str3.equals(A0A(1552, 1, 100))) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 115:
                                    if (str3.equals(A0A(1640, 1, 44))) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 116:
                                    break;
                                case 3494:
                                    if (str3.equals(A0A(1561, 2, 125))) {
                                        c2 = 3;
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
                                    parseDouble2 *= 3600.0d;
                                    break;
                                case 1:
                                    parseDouble2 *= 60.0d;
                                    break;
                                case 3:
                                    parseDouble2 /= 1000.0d;
                                    break;
                                case 4:
                                    parseDouble2 /= kk.A00;
                                    break;
                                case 5:
                                    parseDouble2 /= kk.A02;
                                    break;
                            }
                            return (long) (1000000.0d * parseDouble2);
                        }
                        throw new C1974lj(A0A(708, 27, 100) + str2);
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    public static KJ A03(XmlPullParser xmlPullParser, KJ kj) throws C1974lj {
                        String attributeValue = xmlPullParser.getAttributeValue(A0A(1472, 35, 92), A0A(1285, 14, 65));
                        if (attributeValue == null) {
                            return kj;
                        }
                        Matcher matcher = A07.matcher(attributeValue);
                        boolean matches = matcher.matches();
                        String A0A2 = A0A(C10997yd1.t1, 36, 70);
                        String A0A3 = A0A(892, 11, 16);
                        if (!matches) {
                            AbstractC04624g.A07(A0A3, A0A2 + attributeValue);
                            return kj;
                        }
                        try {
                            int parseInt = Integer.parseInt((String) AbstractC04543y.A01(matcher.group(1)));
                            int parseInt2 = Integer.parseInt((String) AbstractC04543y.A01(matcher.group(2)));
                            if (parseInt == 0 || parseInt2 == 0) {
                                throw new C1974lj(A0A(557, 24, 126) + parseInt + A0A(0, 1, 42) + parseInt2);
                            }
                            return new KJ(parseInt, parseInt2);
                        } catch (NumberFormatException unused) {
                            AbstractC04624g.A07(A0A3, A0A2 + attributeValue);
                            return kj;
                        }
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    public static KM A06(XmlPullParser xmlPullParser, KM km, Map<String, KN> map, KK kk) throws C1974lj {
                        char c2;
                        long j = C10323vs.b;
                        long j2 = C10323vs.b;
                        long j3 = C10323vs.b;
                        String A0A2 = A0A(0, 0, 87);
                        String str2 = null;
                        String[] strArr = null;
                        int attributeCount = xmlPullParser.getAttributeCount();
                        KT A092 = A09(xmlPullParser, null);
                        for (int i = 0; i < attributeCount; i++) {
                            String attributeName = xmlPullParser.getAttributeName(i);
                            String attributeValue = xmlPullParser.getAttributeValue(i);
                            switch (attributeName.hashCode()) {
                                case -934795532:
                                    if (attributeName.equals(A0A(1613, 6, 33))) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 99841:
                                    if (attributeName.equals(A0A(1347, 3, 53))) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 100571:
                                    if (attributeName.equals(A0A(1352, 3, 17))) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 93616297:
                                    if (attributeName.equals(A0A(1270, 5, 60))) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 109780401:
                                    if (attributeName.equals(A0A(1655, 5, 93))) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1292595405:
                                    if (A02[0].length() != 7) {
                                        A02[0] = "FcYwA1owpw";
                                        if (attributeName.equals(A0A(1232, 15, 51))) {
                                            c2 = 5;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    } else {
                                        throw new RuntimeException();
                                    }
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            switch (c2) {
                                case 0:
                                    j2 = A01(attributeValue, kk);
                                    break;
                                case 1:
                                    j3 = A01(attributeValue, kk);
                                    break;
                                case 2:
                                    j = A01(attributeValue, kk);
                                    break;
                                case 3:
                                    String[] A0G = A0G(attributeValue);
                                    if (A0G.length > 0) {
                                        strArr = A0G;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 4:
                                    if (map.containsKey(attributeValue)) {
                                        A0A2 = attributeValue;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 5:
                                    if (attributeValue.startsWith(A0A(1, 1, 51))) {
                                        str2 = attributeValue.substring(1);
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        }
                        if (km != null && km.A02 != C10323vs.b) {
                            if (j2 != C10323vs.b) {
                                long j4 = km.A02;
                                if (A02[3].charAt(8) != 'a') {
                                    j2 += j4;
                                } else {
                                    String[] strArr2 = A02;
                                    strArr2[6] = "4egwN988QRVxw0yAxczVmSNgNtgmaxGX";
                                    strArr2[2] = "SadwrkDoEbwTlMV1MTCuskhR2RkUu0E1";
                                    j2 += j4;
                                }
                            }
                            if (j3 != C10323vs.b) {
                                long j5 = km.A02;
                                String[] strArr3 = A02;
                                if (strArr3[1].length() == strArr3[5].length()) {
                                    throw new RuntimeException();
                                }
                                A02[3] = "SZxfmWq4amNcL9TaQQOLLAMwfZNolhcd";
                                j3 += j5;
                            }
                        }
                        if (j3 == C10323vs.b) {
                            if (j != C10323vs.b) {
                                j3 = j2 + j;
                            } else if (km != null && km.A01 != C10323vs.b) {
                                j3 = km.A01;
                            }
                        }
                        return KM.A02(xmlPullParser.getName(), j2, j3, A092, strArr, A0A2, str2, km);
                    }

                    public static String A0A(int i, int i2, int i3) {
                        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                            byte b = copyOfRange[i4];
                            if (A02[0].length() == 7) {
                                throw new RuntimeException();
                            }
                            String[] strArr = A02;
                            strArr[1] = "MzedSJZDJL3LD";
                            strArr[5] = "g6loelR4939QZaycQmxedlYL";
                            copyOfRange[i4] = (byte) ((b - i3) - 113);
                        }
                        return new String(copyOfRange);
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    public static Map<String, KT> A0B(XmlPullParser xmlPullParser, Map<String, KT> map, KJ kj, KL kl, Map<String, KN> map2, Map<String, String> map3) throws IOException, XmlPullParserException {
                        do {
                            xmlPullParser.next();
                            String A0A2 = A0A(1655, 5, 93);
                            if (C5I.A04(xmlPullParser, A0A2)) {
                                String A00 = C5I.A00(xmlPullParser, A0A2);
                                KT A092 = A09(xmlPullParser, new KT());
                                if (A00 != null) {
                                    String[] A0G = A0G(A00);
                                    if (A02[3].charAt(8) != 'a') {
                                        throw new RuntimeException();
                                    }
                                    String[] strArr = A02;
                                    strArr[6] = "oxowjvWuzCcWkzEkDRByU8LkLZUydqr3";
                                    strArr[2] = "XAdwn62c6rSvSVMr71C9Wpdxl0LeAUIU";
                                    for (String str2 : A0G) {
                                        A092.A0O(map.get(str2));
                                    }
                                }
                                String A0X = A092.A0X();
                                if (A0X != null) {
                                    map.put(A0X, A092);
                                }
                            } else if (C5I.A04(xmlPullParser, A0A(1613, 6, 33))) {
                                KN A072 = A07(xmlPullParser, kj, kl);
                                if (A072 != null) {
                                    map2.put(A072.A09, A072);
                                }
                            } else {
                                boolean A042 = C5I.A04(xmlPullParser, A0A(1553, 8, 69));
                                String[] strArr2 = A02;
                                if (strArr2[1].length() == strArr2[5].length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr3 = A02;
                                strArr3[6] = "B6Mw4qhmB6vQw7zev9YlYKUDY0kxCfVe";
                                strArr3[2] = "G12wwLtLBhQxBioY68m1H9JFDs55K6Az";
                                if (A042) {
                                    A0E(xmlPullParser, map3);
                                }
                            }
                        } while (!C5I.A03(xmlPullParser, A0A(1468, 4, 96)));
                        return map;
                    }

                    public static void A0C() {
                        byte[] bArr = {-69, C2638Cg0.u7, 6, -27, -20, -36, C8077mf.m, 55, C4715Xk.i, 52, C3307Iz.d0, 54, -17, 60, -24, C3307Iz.c0, 58, C3307Iz.e0, C3307Iz.a0, 60, C3307Iz.e0, -24, 32, 53, 52, C8077mf.B, C4715Xk.i, 52, 52, C8077mf.B, C3307Iz.a0, 58, 59, C3307Iz.e0, 58, C8077mf.p, C3307Iz.a0, C3307Iz.c0, 60, 55, 58, 65, -24, 49, 54, 59, 60, C3307Iz.a0, 54, C3307Iz.c0, C3307Iz.e0, 28, 55, ED2.a, 66, 59, 58, -10, 70, 55, 72, 73, ED2.a, 68, C4715Xk.i, -10, 56, 55, 57, 65, C4715Xk.i, 72, 69, 75, 68, 58, -10, 76, 55, 66, 75, 59, C8077mf.r, -10, -73, -46, C2638Cg0.B7, -35, -42, -43, -111, C2638Cg0.C7, -46, -29, -28, C2638Cg0.B7, -33, C2638Cg0.n7, -111, -44, -32, -35, -32, -29, -111, -25, -46, -35, -26, -42, -85, -111, C8077mf.r, C3307Iz.c0, 51, 54, 47, C3307Iz.f0, -22, 58, C3307Iz.c0, 60, C4715Xk.i, 51, 56, 49, -22, 48, 57, 56, 62, C8077mf.G, 51, 68, 47, -22, 64, C3307Iz.c0, 54, ED2.a, 47, 4, -22, 0, C8077mf.E, 35, C3307Iz.Y, 31, C8077mf.H, C2638Cg0.B7, C3307Iz.f0, C3307Iz.a0, C2638Cg0.B7, 42, C8077mf.E, C3307Iz.d0, C3307Iz.e0, 31, C2638Cg0.B7, C3307Iz.e0, 34, 31, C8077mf.E, C3307Iz.d0, -12, C2638Cg0.B7, 0, C8077mf.H, C3307Iz.X, C3307Iz.Y, C3307Iz.a0, 32, C3307Iz.X, C8077mf.H, -41, 36, C8077mf.B, 35, C8077mf.G, C3307Iz.Y, C3307Iz.a0, 36, 28, C8077mf.E, -41, C8077mf.D, 28, 35, 35, -41, C3307Iz.a0, 28, 42, C3307Iz.Y, 35, C3307Iz.d0, C3307Iz.c0, 32, C3307Iz.Y, C3307Iz.X, -15, -41, C8077mf.G, 59, 66, 67, 70, C4715Xk.i, 66, 59, -12, 65, 53, 64, 58, 67, 70, 65, 57, 56, -12, 72, 72, 71, -12, 57, 76, 72, 57, 66, 72, C8077mf.p, -12, 52, 82, 89, 90, 93, 84, 89, 82, C8077mf.m, 89, 90, 89, C8077mf.B, 91, 84, 99, 80, 87, C8077mf.m, 95, 95, 94, C8077mf.m, 80, 99, 95, 80, 89, 95, C3307Iz.X, C8077mf.m, 1, 31, C3307Iz.Y, C3307Iz.Z, 42, C3307Iz.V, C3307Iz.Y, 31, C2638Cg0.n7, 42, C8077mf.G, 31, C3307Iz.V, C3307Iz.Z, C3307Iz.Y, C2638Cg0.n7, 47, C3307Iz.V, C3307Iz.d0, 32, C2638Cg0.n7, C3307Iz.X, C8077mf.C, 36, C8077mf.H, C3307Iz.Z, 42, C3307Iz.X, C8077mf.G, 28, C2638Cg0.n7, C8077mf.G, 48, C3307Iz.d0, C8077mf.G, C3307Iz.Y, C3307Iz.d0, -14, C2638Cg0.n7, -41, -11, -4, -3, 0, -9, -4, -11, -82, 0, -13, -11, -9, -3, -4, -82, 5, -9, 2, -10, -82, -5, -17, -6, -12, -3, 0, -5, -13, -14, -82, -3, 0, -9, -11, -9, -4, -56, -82, -15, C8077mf.q, C8077mf.z, C8077mf.A, C8077mf.D, 17, C8077mf.z, C8077mf.q, -56, C8077mf.D, 13, C8077mf.q, 17, C8077mf.A, C8077mf.z, -56, 31, 17, 28, C8077mf.r, -56, C8077mf.y, 17, C8077mf.E, C8077mf.E, 17, C8077mf.z, C8077mf.q, -56, 28, 28, C8077mf.E, -30, 13, 32, 28, 13, C8077mf.z, 28, -30, -56, 40, 70, 77, 78, 81, 72, 77, 70, -1, 81, 68, 70, 72, 78, 77, -1, 86, 72, 83, 71, -1, 84, 77, 82, 84, 79, 79, 78, 81, 83, 68, 67, -1, 68, 87, 83, 68, 77, 83, C8077mf.C, -1, -9, C8077mf.y, 28, C8077mf.G, 32, C8077mf.A, 28, C8077mf.y, C2638Cg0.z7, 32, 19, C8077mf.y, C8077mf.A, C8077mf.G, 28, C2638Cg0.z7, C3307Iz.X, C8077mf.A, 34, C8077mf.z, C2638Cg0.z7, 35, 28, C3307Iz.V, 35, C8077mf.H, C8077mf.H, C8077mf.G, 32, 34, 19, C8077mf.u, C2638Cg0.z7, C8077mf.G, 32, C8077mf.A, C8077mf.y, C8077mf.A, 28, -24, C2638Cg0.z7, -20, 10, 17, C8077mf.u, C8077mf.y, C8077mf.n, 17, 10, C2638Cg0.r7, C8077mf.y, 8, 10, C8077mf.n, C8077mf.u, 17, C2638Cg0.r7, C8077mf.D, C8077mf.n, C8077mf.A, C8077mf.m, C8077mf.u, C8077mf.B, C8077mf.A, C2638Cg0.r7, 4, 17, C2638Cg0.r7, 8, C8077mf.E, C8077mf.A, 8, 17, C8077mf.A, C2638Cg0.u7, -27, -20, -19, -16, -25, -20, -27, -98, -16, -29, -27, -25, -19, -20, -98, -11, -25, -14, -26, -19, -13, -14, -98, -33, -20, -98, -19, -16, -25, -27, -25, -20, C3307Iz.d0, 74, 81, 82, 85, 76, 81, 74, 3, 88, 81, 86, 88, 83, 83, 82, 85, 87, 72, 71, 3, 87, 68, 74, C8077mf.G, 3, 56, 93, 101, 80, 91, 88, 83, C8077mf.q, 82, 84, 91, 91, C8077mf.q, 97, 84, 98, 94, 91, 100, 99, 88, 94, 93, C8077mf.q, -46, -9, -1, -22, -11, -14, -19, -87, -18, 1, -7, -5, -18, -4, -4, -14, -8, -9, -87, -17, -8, -5, -87, -17, -8, -9, -3, -36, -14, 3, -18, C2638Cg0.r7, -87, -80, 6, C3307Iz.c0, 51, C8077mf.H, C3307Iz.a0, C3307Iz.Y, C3307Iz.V, -35, C3307Iz.c0, 50, 42, 31, 34, 47, -35, C3307Iz.d0, 35, -35, 34, C3307Iz.c0, 49, 47, C3307Iz.Y, 34, 48, -35, 35, C3307Iz.d0, 47, -35, 35, C3307Iz.d0, C3307Iz.c0, 49, C8077mf.r, C3307Iz.Y, 55, 34, -9, -35, -16, C8077mf.y, C8077mf.G, 8, 19, C8077mf.r, C8077mf.m, C2638Cg0.u7, 28, C8077mf.y, C8077mf.r, C8077mf.E, C2638Cg0.u7, 13, C8077mf.z, C8077mf.C, C2638Cg0.u7, 13, C8077mf.z, C8077mf.y, C8077mf.E, -6, C8077mf.r, C3307Iz.V, C8077mf.n, C2638Cg0.C7, C2638Cg0.u7, C2638Cg0.z7, 2, C3307Iz.Z, 47, C8077mf.D, C3307Iz.X, 34, C8077mf.G, C2638Cg0.E7, 47, C8077mf.D, C3307Iz.X, C3307Iz.f0, C8077mf.H, C2638Cg0.E7, 31, 40, C3307Iz.c0, C2638Cg0.E7, C3307Iz.d0, C3307Iz.V, C8077mf.H, C8077mf.D, C3307Iz.c0, -13, C2638Cg0.E7, 34, 54, 65, 59, 68, 71, 66, 58, 57, -11, 73, 62, 66, 58, -11, 58, 77, 69, 71, 58, 72, 72, 62, 68, 67, C8077mf.q, -11, C3307Iz.Z, 79, 70, 78, 67, 74, 70, ED2.a, -6, 80, 59, 70, 79, ED2.a, 77, -6, 67, 72, -6, 64, 73, 72, 78, C3307Iz.e0, 67, 84, ED2.a, -6, 59, 78, 78, 76, 67, 60, 79, 78, ED2.a, 8, -6, 42, 67, C4715Xk.i, 69, 67, 72, 65, -6, 78, 66, ED2.a, -6, 77, ED2.a, C4715Xk.i, 73, 72, 62, -6, 80, 59, 70, 79, ED2.a, -6, 64, 73, 76, -6, 80, ED2.a, 76, 78, 67, C4715Xk.i, 59, 70, -6, 64, 73, 72, 78, -6, 77, 67, 84, ED2.a, -6, 59, 72, 62, -6, 67, 65, 72, 73, 76, 67, 72, 65, -6, 78, 66, ED2.a, -6, 64, 67, 76, 77, 78, 8, C2638Cg0.t7, -25, -104, -52, -52, C2638Cg0.s7, -60, -104, -21, -19, C2638Cg0.B7, -20, C2638Cg0.C7, -20, -28, -35, -21, -104, -34, -25, -19, -26, -36, C2638Cg0.C7, 3, -2, -2, 0, -13, 1, 1, -9, -4, -11, -82, -2, -17, 0, 1, -13, 0, -82, -13, 0, 0, -3, 0, -43, -11, -18, -19, C2638Cg0.s7, -26, -28, -16, -27, -26, -13, -10, C8077mf.q, 2, 3, 13, 6, C2638Cg0.p7, C8077mf.y, C8077mf.r, C2638Cg0.p7, 5, 6, 4, C8077mf.r, 5, 6, C2638Cg0.p7, C8077mf.x, C8077mf.r, C8077mf.z, 19, 4, 6, -25, 0, -9, 10, 2, -9, -11, 6, -9, -10, -78, -9, 4, 4, 1, 4, -78, 9, -6, -9, 0, -78, 4, -9, -13, -10, -5, 0, -7, -78, -5, 0, 2, 7, 6, C2638Cg0.o7, 9, 32, C2638Cg0.n7, -42, -96, -96, -45, -88, -91, -79, -43, -94, -90, -95, -73, -45, -88, -91, -79, -43, -93, -95, -96, -24, -16, -12, -35, -27, -12, -99, -95, -100, -16, -70, -19, -65, -67, -17, 
                        -47, -18, -10, -67, -18, C2638Cg0.o7, -47, -18, -10, -68, -47, -69, -73, -74, -47, -101, C2638Cg0.z7, -93, -96, -84, -48, -98, -101, -78, -83, C2638Cg0.A7, -95, C2638Cg0.z7, -93, -96, -84, -48, -98, -100, -78, -100, -101, -37, -17, -32, -17, -26, -17, -32, -26, -17, C2638Cg0.E7, -17, -25, -100, -105, 17, -37, C8077mf.p, -29, -32, -20, C8077mf.r, C8077mf.p, -29, -32, -20, C8077mf.r, -34, -36, -19, -37, C8077mf.p, -29, -32, -20, C8077mf.r, C8077mf.p, -29, -32, -20, C8077mf.r, -36, -19, -37, C8077mf.p, -29, -32, -20, C8077mf.r, C8077mf.p, -29, -32, -20, C8077mf.r, -36, -37, -14, -19, -37, C8077mf.q, C2638Cg0.C7, C8077mf.p, -29, -32, -20, C8077mf.r, -34, -36, 47, -19, -37, C8077mf.p, -29, -32, -20, C8077mf.r, C8077mf.p, -29, -32, -20, C8077mf.r, -36, -37, -14, -19, C8077mf.q, C2638Cg0.C7, -37, C8077mf.p, -29, -32, -20, C8077mf.r, -34, -36, -36, -14, -36, -14, -41, 54, 0, 52, 60, 3, 1, -8, 0, 52, 60, 3, 1, -4, C2638Cg0.A7, -103, C2638Cg0.y7, -43, -100, C2638Cg0.y7, -97, -80, C2638Cg0.y7, -43, -101, -80, -102, -106, -111, -103, C2638Cg0.y7, -43, -100, C2638Cg0.y7, -97, -80, C2638Cg0.y7, -43, -101, -80, -102, -106, -107, C8077mf.u, -36, C8077mf.r, C8077mf.B, -33, C8077mf.r, -30, -13, C8077mf.r, C8077mf.B, -34, -13, -35, 36, C3307Iz.d0, -44, -36, C8077mf.r, C8077mf.B, -33, C8077mf.r, -30, -13, C8077mf.r, C8077mf.B, -34, -13, -35, 36, C3307Iz.d0, C2638Cg0.n7, -9, -4, 10, -5, 8, 28, C3307Iz.Z, C3307Iz.Z, 58, 57, 59, 67, ED2.a, 74, 71, 77, 70, 60, C8077mf.E, 71, 68, 71, 74, 6, 5, 7, C8077mf.q, C8077mf.m, C8077mf.z, 19, C8077mf.C, C8077mf.u, 8, -19, 17, 5, C8077mf.m, 9, 76, 75, 93, 79, C8077mf.q, C8077mf.p, 32, C8077mf.u, -16, 28, C8077mf.E, C3307Iz.V, C8077mf.p, C8077mf.z, C8077mf.E, C8077mf.u, 31, 54, 57, 58, 67, 70, 57, C8077mf.q, C8077mf.u, C8077mf.x, C8077mf.z, C8077mf.E, -2, C8077mf.m, 0, C8077mf.y, C8077mf.C, C3307Iz.Y, 35, C8077mf.E, 52, 68, C8077mf.y, C8077mf.A, C8077mf.H, C8077mf.H, 4, C8077mf.A, C3307Iz.X, C3307Iz.V, C8077mf.H, C3307Iz.Z, C3307Iz.Y, C8077mf.E, C3307Iz.V, 32, -26, -24, -15, -9, -24, -11, C3307Iz.e0, 57, 54, 57, 60, 79, 91, 90, 96, 77, 85, 90, 81, 94, -32, -35, -16, -35, -24, -23, -16, -19, -15, -19, -8, -23, -10, 68, 73, 83, 80, 76, 65, 89, C3307Iz.V, 76, 73, 71, 78, C4715Xk.i, 66, 79, 10, C8077mf.E, C8077mf.B, 34, 42, -25, -16, -26, 3, C8077mf.z, C8077mf.u, 3, C8077mf.n, C8077mf.u, -33, -19, -10, -11, -5, C2638Cg0.y7, -24, -12, -16, -13, 0, -28, -19, -20, -14, -47, -25, -8, -29, 54, ED2.a, 62, 68, 35, 68, 73, 60, 53, 4, 13, C8077mf.n, C8077mf.u, -11, 3, 7, 5, 6, C8077mf.u, 80, 92, 75, 87, 79, 60, 75, 94, 79, -15, -3, -20, -8, -16, -35, -20, -1, -16, C2638Cg0.n7, 0, -9, -1, -12, -5, -9, -12, -16, -3, -20, -8, -25, -13, -21, C2638Cg0.n7, -25, -6, -21, -45, -5, -14, -6, -17, -10, -14, -17, -21, -8, -90, -22, -11, -21, -7, -12, -83, -6, -90, -18, -25, -4, -21, -90, -72, -90, -10, -25, -8, -6, -7, 1, 57, 54, 50, 53, 53, 65, 65, C4715Xk.i, 7, -4, -4, 68, 68, 68, -5, 68, 0, -5, 60, ED2.a, 52, -4, 59, 64, -4, 65, 65, 58, 57, -16, C4715Xk.i, C3307Iz.f0, ED2.a, C3307Iz.f0, 58, 50, 65, 50, ED2.a, 52, 47, 3, 7, -5, 1, -1, -35, -30, C2638Cg0.B7, -29, -26, C2638Cg0.C7, -43, -24, -35, -29, -30, 0, C8077mf.m, -8, 3, 0, -6, 50, C3307Iz.Z, ED2.a, 53, 59, 58, 87, 80, 81, 95, 4, 1, 6, -3, C8077mf.n, 0, 10, 7, 13, -1, 0, 66, 35, C8077mf.E, 42, C8077mf.A, C8077mf.D, C8077mf.A, 42, C8077mf.A, 91, 97, 40, 48, C3307Iz.Z, 47, 36, 13, 42, 50, -4, C3307Iz.Z, 36, 34, C3307Iz.a0, 76, 77, 74, 71, 76, 67, 82, 70, 80, 77, 83, 69, 70, 60, C4715Xk.i, 60, 51, C8077mf.C, C8077mf.D, 32, C8077mf.C, C8077mf.q, C8077mf.r, C8077mf.G, C8077mf.A, C8077mf.x, C8077mf.C, C8077mf.r, C3307Iz.V, 36, C8077mf.E, C8077mf.C, C8077mf.E, 32, C2638Cg0.C7, 80, 88, 4, -9, -7, -5, 1, 0, -3, -12, -14, -13, -1, 88, 91, 72, 95, 75, 78, 59, 82, C3307Iz.a0, 72, 76, 66, 77, 66, 72, 71, C8077mf.r, C3307Iz.X, C8077mf.D, C8077mf.A, 19, 36, 34, 31, C8077mf.r, C8077mf.G, 32, C3307Iz.V, C8077mf.p, 31, C3307Iz.V, 65, 66, 71, 58, 51, 71, 72, 77, 64, C4715Xk.i, 66, 59, 74, 76, 57, C8077mf.G, 73, 56, 68, 60, C3307Iz.a0, 56, 75, 60, 55, C8077mf.E, 9, 53, 35, C3307Iz.e0, 51, -3, -21, -5, -11, 42, C8077mf.E, C3307Iz.f0, 42, 60, C3307Iz.e0, 64, 60, 9, 52, 49, 47, 54, 60, C3307Iz.e0, 64, 60, C8077mf.m, 55, 53, 42, 49, 54, C3307Iz.e0, -6, -21, -2, -6, C2638Cg0.v7, -11, -12, -6, -25, -17, -12, -21, -8, 67, 52, 71, 67, 19, 52, 50, 62, 65, 48, 67, 56, 62, C4715Xk.i, C8077mf.z, 7, C8077mf.D, C8077mf.z, -25, C8077mf.q, C8077mf.u, 10, 3, C8077mf.y, C8077mf.m, C8077mf.y, 80, 69, ED2.a, 71, C3307Iz.f0, C4715Xk.i, 80, 65, C8077mf.G, C8077mf.G, 47, 40, C8077mf.H, 31, C3307Iz.d0, C3307Iz.Y, 35, 40, 31, -8, -13, -22, -11, -22, -17, -24, C2638Cg0.z7, -16, -27, -26};
                        String[] strArr = A02;
                        if (strArr[6].charAt(3) != strArr[2].charAt(3)) {
                            throw new RuntimeException();
                        }
                        A02[3] = "YYEb81Zja86Dd7gFpf2yHyw2w0ZKb0ns";
                        A01 = bArr;
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    @Override // com.facebook.ads.redexgen.X.C8T
                    public final InterfaceC0837Jj A0g(byte[] bArr, int i, boolean z) throws C1974lj {
                        String A0A2 = A0A(0, 0, 87);
                        try {
                            XmlPullParser newPullParser = this.A00.newPullParser();
                            HashMap hashMap = new HashMap();
                            HashMap hashMap2 = new HashMap();
                            HashMap hashMap3 = new HashMap();
                            hashMap2.put(A0A2, new KN(A0A2));
                            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
                            C1967lc c1967lc = null;
                            ArrayDeque arrayDeque = new ArrayDeque();
                            int i2 = 0;
                            KK kk = A06;
                            KJ kj = A05;
                            KL kl = null;
                            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                                KM km = (KM) arrayDeque.peek();
                                if (i2 == 0) {
                                    String name = newPullParser.getName();
                                    String A0A3 = A0A(1761, 2, 56);
                                    if (eventType == 2) {
                                        if (A0A3.equals(name)) {
                                            kk = A04(newPullParser);
                                            kj = A03(newPullParser, A05);
                                            kl = A05(newPullParser);
                                        }
                                        boolean A0F = A0F(name);
                                        String A0A4 = A0A(892, 11, 16);
                                        if (!A0F) {
                                            AbstractC04624g.A06(A0A4, A0A(531, 26, 114) + newPullParser.getName());
                                            i2++;
                                        } else if (A0A(1468, 4, 96).equals(name)) {
                                            A0B(newPullParser, hashMap, kj, kl, hashMap2, hashMap3);
                                        } else {
                                            try {
                                                KM A062 = A06(newPullParser, km, hashMap2, kk);
                                                arrayDeque.push(A062);
                                                if (km != null) {
                                                    km.A0F(A062);
                                                }
                                            } catch (C1974lj e) {
                                                AbstractC04624g.A0A(A0A4, A0A(868, 24, 29), e);
                                                i2++;
                                            }
                                        }
                                    } else if (eventType == 4) {
                                        ((KM) AbstractC04543y.A01(km)).A0F(KM.A01(newPullParser.getText()));
                                    } else if (eventType == 3) {
                                        if (newPullParser.getName().equals(A0A3)) {
                                            c1967lc = new C1967lc((KM) AbstractC04543y.A01((KM) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                                        }
                                        arrayDeque.pop();
                                    }
                                } else if (A02[0].length() == 7) {
                                    throw new RuntimeException();
                                } else {
                                    A02[3] = "q6wSX38Wa3tvhMiP87hlFBAs7B3bq4ae";
                                    if (eventType == 2) {
                                        i2++;
                                    } else if (eventType == 3) {
                                        i2--;
                                    }
                                }
                                newPullParser.next();
                            }
                            if (c1967lc != null) {
                                return c1967lc;
                            }
                            throw new C1974lj(A0A(845, 23, 7));
                        } catch (IOException e2) {
                            throw new IllegalStateException(A0A(926, 36, 33), e2);
                        } catch (XmlPullParserException e3) {
                            throw new C1974lj(A0A(InterfaceC8148mw2.b.m, 23, 48), e3);
                        }
                    }

                    static {
                        A0C();
                        A08 = Pattern.compile(A0A(1051, 85, 66));
                        A0A = Pattern.compile(A0A(1014, 37, 2));
                        A09 = Pattern.compile(A0A(965, 29, 7));
                        A04 = Pattern.compile(A0A(994, 20, 33));
                        A03 = Pattern.compile(A0A(1149, 29, 0));
                        A0B = Pattern.compile(A0A(1178, 31, 67));
                        A07 = Pattern.compile(A0A(1136, 13, 103));
                        A06 = new KK(30.0f, 1, 1);
                        A05 = new KJ(32, 15);
                    }

                    {
                        A0A(892, 11, 16);
                        try {
                            this.A00 = XmlPullParserFactory.newInstance();
                            this.A00.setNamespaceAware(true);
                        } catch (XmlPullParserException e) {
                            throw new RuntimeException(A0A(6, 45, 87), e);
                        }
                    }

                    public static float A00(String str2) {
                        Matcher matcher = A04.matcher(str2);
                        boolean matches = matcher.matches();
                        String A0A2 = A0A(892, 11, 16);
                        if (!matches) {
                            AbstractC04624g.A07(A0A2, A0A(683, 25, 72) + str2);
                            return Float.MAX_VALUE;
                        }
                        try {
                            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) AbstractC04543y.A01(matcher.group(1)))));
                        } catch (NumberFormatException e) {
                            AbstractC04624g.A0A(A0A2, A0A(C3503Kz.g0, 23, 73) + str2, e);
                            return Float.MAX_VALUE;
                        }
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    public static Layout.Alignment A02(String str2) {
                        char c2;
                        String A012 = AbstractC1877k7.A01(str2);
                        switch (A012.hashCode()) {
                            case -1364013995:
                                if (A012.equals(A0A(1299, 6, 18))) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 100571:
                                if (A012.equals(A0A(1352, 3, 17))) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3317767:
                                if (A012.equals(A0A(1537, 4, 122))) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 108511772:
                                if (A012.equals(A0A(1619, 5, 26))) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 109757538:
                                if (A012.equals(A0A(1650, 5, 60))) {
                                    c2 = 1;
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
                            case 1:
                                return Layout.Alignment.ALIGN_NORMAL;
                            case 2:
                            case 3:
                                Layout.Alignment alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                if (A02[3].charAt(8) != 'a') {
                                    throw new RuntimeException();
                                }
                                A02[0] = "QuoyGMZU77HTmr";
                                return alignment;
                            case 4:
                                return Layout.Alignment.ALIGN_CENTER;
                            default:
                                return null;
                        }
                    }

                    public static KK A04(XmlPullParser xmlPullParser) throws C1974lj {
                        int tickRate = 30;
                        String A0A2 = A0A(1399, 9, 121);
                        String A0A3 = A0A(1472, 35, 92);
                        String attributeValue = xmlPullParser.getAttributeValue(A0A3, A0A2);
                        if (attributeValue != null) {
                            tickRate = Integer.parseInt(attributeValue);
                        }
                        float numerator = 1.0f;
                        String attributeValue2 = xmlPullParser.getAttributeValue(A0A3, A0A(1408, 19, 26));
                        if (attributeValue2 != null) {
                            String[] A1O = C5C.A1O(attributeValue2, A0A(0, 1, 42));
                            if (A1O.length == 2) {
                                int frameRate = Integer.parseInt(A1O[0]);
                                float numerator2 = frameRate;
                                int frameRate2 = Integer.parseInt(A1O[1]);
                                numerator = numerator2 / frameRate2;
                            } else {
                                String frameRateString = A0A(1427, 40, 21);
                                throw new C1974lj(frameRateString);
                            }
                        }
                        int subFrameRate = A06.A01;
                        String attributeValue3 = xmlPullParser.getAttributeValue(A0A3, A0A(1667, 12, 102));
                        if (attributeValue3 != null) {
                            subFrameRate = Integer.parseInt(attributeValue3);
                        }
                        int i = A06.A02;
                        String A0A4 = A0A(1753, 8, 107);
                        String[] strArr = A02;
                        String frameRateString2 = strArr[1];
                        String str2 = strArr[5];
                        int length = frameRateString2.length();
                        int frameRate3 = str2.length();
                        if (length != frameRate3) {
                            String[] strArr2 = A02;
                            strArr2[6] = "ZUswaBax6tLaE1IC4JCUj1Icv8MP2XMH";
                            strArr2[2] = "PhpwRqbX9uhXuGLmIXMh7Q7Ymyg4xhXC";
                            String attributeValue4 = xmlPullParser.getAttributeValue(A0A3, A0A4);
                            if (attributeValue4 != null) {
                                i = Integer.parseInt(attributeValue4);
                            }
                            return new KK(tickRate * numerator, subFrameRate, i);
                        }
                        throw new RuntimeException();
                    }

                    public static KL A05(XmlPullParser xmlPullParser) {
                        String A00 = C5I.A00(xmlPullParser, A0A(1355, 6, 45));
                        if (A00 == null) {
                            return null;
                        }
                        Matcher matcher = A0B.matcher(A00);
                        boolean matches = matcher.matches();
                        String A0A2 = A0A(892, 11, 16);
                        if (!matches) {
                            StringBuilder sb = new StringBuilder();
                            String ttsExtent = A0A(233, 31, 122);
                            AbstractC04624g.A07(A0A2, sb.append(ttsExtent).append(A00).toString());
                            return null;
                        }
                        try {
                            String ttsExtent2 = matcher.group(1);
                            int parseInt = Integer.parseInt((String) AbstractC04543y.A01(ttsExtent2));
                            String ttsExtent3 = matcher.group(2);
                            return new KL(parseInt, Integer.parseInt((String) AbstractC04543y.A01(ttsExtent3)));
                        } catch (NumberFormatException unused) {
                            StringBuilder sb2 = new StringBuilder();
                            String ttsExtent4 = A0A(202, 31, 99);
                            AbstractC04624g.A07(A0A2, sb2.append(ttsExtent4).append(A00).toString());
                            return null;
                        }
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code restructure failed: missing block: B:54:0x020a, code lost:
                        if (r5.equals(A0A(1686, 4, 24)) != false) goto L50;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
                    /* JADX WARN: Type inference failed for: r3v2 */
                    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.CharSequence, java.lang.String] */
                    /* JADX WARN: Type inference failed for: r5v2 */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public static KN A07(XmlPullParser xmlPullParser, KJ kj, KL kl) {
                        float parseFloat;
                        float line;
                        float parseFloat2;
                        float parseFloat3;
                        float width;
                        String A00 = C5I.A00(xmlPullParser, A0A(1507, 2, 90));
                        if (A00 == null) {
                            return null;
                        }
                        String A002 = C5I.A00(xmlPullParser, A0A(1604, 6, 65));
                        String A0A2 = A0A(892, 11, 16);
                        if (A002 != 0) {
                            Matcher matcher = A03.matcher(A002);
                            Matcher matcher2 = A0B.matcher(A002);
                            boolean matches = matcher.matches();
                            String A0A3 = A0A(303, 39, 29);
                            String A0A4 = A0A(342, 41, 55);
                            char c2 = 2;
                            try {
                                if (matches) {
                                    try {
                                        parseFloat = Float.parseFloat((String) AbstractC04543y.A01(matcher.group(1))) / 100.0f;
                                        line = Float.parseFloat((String) AbstractC04543y.A01(matcher.group(2))) / 100.0f;
                                    } catch (NumberFormatException unused) {
                                        AbstractC04624g.A07(A0A2, A0A3 + ((String) A002));
                                        return null;
                                    }
                                } else {
                                    boolean matches2 = matcher2.matches();
                                    String[] strArr = A02;
                                    if (strArr[6].charAt(3) != strArr[2].charAt(3)) {
                                        throw new RuntimeException();
                                    }
                                    String[] strArr2 = A02;
                                    strArr2[4] = "JOMz8RfhZxjyjCW014gv2m0MH";
                                    strArr2[7] = "qk3Phvnbbo37fKBWKDjhM47dE";
                                    if (matches2) {
                                        if (kl == null) {
                                            AbstractC04624g.A07(A0A2, A0A4 + ((String) A002));
                                            return null;
                                        }
                                        int parseInt = Integer.parseInt((String) AbstractC04543y.A01(matcher2.group(1)));
                                        int parseInt2 = Integer.parseInt((String) AbstractC04543y.A01(matcher2.group(2)));
                                        int width2 = kl.A01;
                                        parseFloat = parseInt / width2;
                                        int width3 = kl.A00;
                                        line = parseInt2 / width3;
                                    } else {
                                        AbstractC04624g.A07(A0A2, A0A(InterfaceC8148mw2.c.v, 41, 61) + ((String) A002));
                                        return null;
                                    }
                                }
                                String A003 = C5I.A00(xmlPullParser, A0A(1355, 6, 45));
                                if (A003 != null) {
                                    Matcher matcher3 = A03.matcher(A003);
                                    Matcher matcher4 = A0B.matcher(A003);
                                    boolean matches3 = matcher3.matches();
                                    String A0A5 = A0A(264, 39, 71);
                                    try {
                                        if (matches3) {
                                            try {
                                                parseFloat2 = Float.parseFloat((String) AbstractC04543y.A01(matcher3.group(1))) / 100.0f;
                                                parseFloat3 = Float.parseFloat((String) AbstractC04543y.A01(matcher3.group(2))) / 100.0f;
                                            } catch (NumberFormatException unused2) {
                                                AbstractC04624g.A07(A0A2, A0A5 + ((String) A002));
                                                return null;
                                            }
                                        } else if (matcher4.matches()) {
                                            if (kl == null) {
                                                AbstractC04624g.A07(A0A2, A0A4 + ((String) A002));
                                                return null;
                                            }
                                            int parseInt3 = Integer.parseInt((String) AbstractC04543y.A01(matcher4.group(1)));
                                            int parseInt4 = Integer.parseInt((String) AbstractC04543y.A01(matcher4.group(2)));
                                            int extentWidth = kl.A01;
                                            parseFloat2 = parseInt3 / extentWidth;
                                            int extentWidth2 = kl.A00;
                                            parseFloat3 = parseInt4 / extentWidth2;
                                        } else {
                                            AbstractC04624g.A07(A0A2, A0A(383, 41, 110) + ((String) A002));
                                            return null;
                                        }
                                        int i = 0;
                                        A002 = 1332;
                                        A0A2 = 12;
                                        String A004 = C5I.A00(xmlPullParser, A0A(o.IC.q1, 12, 111));
                                        if (A004 != null) {
                                            String A012 = AbstractC1877k7.A01(A004);
                                            float width4 = A012.hashCode();
                                            switch (width4) {
                                                case -8.1307995E-11f:
                                                    if (A012.equals(A0A(1299, 6, 18))) {
                                                        width = 0.0f;
                                                        break;
                                                    }
                                                    width = Float.NaN;
                                                    break;
                                                case 1.2697491E-35f:
                                                    if (A012.equals(A0A(1209, 5, 37))) {
                                                        width = Float.MIN_VALUE;
                                                        break;
                                                    }
                                                    width = Float.NaN;
                                                    break;
                                                default:
                                                    width = Float.NaN;
                                                    break;
                                            }
                                            switch (width) {
                                                case 0.0f:
                                                    i = 1;
                                                    float width5 = parseFloat3 / 2.0f;
                                                    line += width5;
                                                    break;
                                                case Float.MIN_VALUE:
                                                    i = 2;
                                                    line += parseFloat3;
                                                    break;
                                            }
                                        }
                                        float width6 = kj.A01;
                                        float f = 1.0f / width6;
                                        int i2 = Integer.MIN_VALUE;
                                        String A005 = C5I.A00(xmlPullParser, A0A(1772, 11, 16));
                                        if (A005 != null) {
                                            String A013 = AbstractC1877k7.A01(A005);
                                            float width7 = A013.hashCode();
                                            switch (width7) {
                                                case 5.176E-42f:
                                                    if (A013.equals(A0A(1680, 2, 54))) {
                                                        c2 = 0;
                                                        break;
                                                    }
                                                    c2 = 65535;
                                                    break;
                                                case 4.979368E-39f:
                                                    if (A013.equals(A0A(1682, 4, 80))) {
                                                        c2 = 1;
                                                        break;
                                                    }
                                                    c2 = 65535;
                                                    break;
                                                case 4.97962E-39f:
                                                    break;
                                                default:
                                                    c2 = 65535;
                                                    break;
                                            }
                                            switch (c2) {
                                                case 0:
                                                case 1:
                                                    i2 = 2;
                                                    break;
                                                case 2:
                                                    i2 = 1;
                                                    break;
                                            }
                                        }
                                        float regionTextHeight = parseFloat2;
                                        float position = parseFloat;
                                        return new KN(A00, position, line, 0, i, regionTextHeight, parseFloat3, 1, f, i2);
                                    } catch (NumberFormatException unused3) {
                                        AbstractC04624g.A07(A0A2, A0A5 + A002);
                                        return null;
                                    }
                                }
                                AbstractC04624g.A07(A0A2, A0A(465, 33, 50));
                                return null;
                            } catch (NumberFormatException unused4) {
                                AbstractC04624g.A07(A0A2, A0A3 + ((String) A002));
                                return null;
                            }
                        }
                        AbstractC04624g.A07(A0A2, A0A(498, 33, 13));
                        return null;
                    }

                    public static KT A08(KT kt) {
                        return kt == null ? new KT() : kt;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code restructure failed: missing block: B:164:0x0506, code lost:
                        if (r13.equals(A0A(1624, 4, 117)) != false) goto L201;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:165:0x0508, code lost:
                        r13 = '\n';
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:167:0x0523, code lost:
                        if (r13.equals(A0A(1624, 4, 117)) != false) goto L201;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:175:0x0555, code lost:
                        if (r13.equals(r14) != false) goto L211;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:176:0x0557, code lost:
                        r13 = 5;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:178:0x0565, code lost:
                        if (r13.equals(r14) != false) goto L211;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:50:0x0156, code lost:
                        if (r6.equals(r8) != false) goto L40;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:53:0x0169, code lost:
                        if (r6.equals(r8) != false) goto L40;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:82:0x0224, code lost:
                        if (r5.equals(A0A(1247, 4, 121)) != false) goto L106;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:83:0x0226, code lost:
                        r16 = 1;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:85:0x0231, code lost:
                        if (r5.equals(A0A(1247, 4, 121)) != false) goto L106;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:91:0x0255, code lost:
                        if (r5.equals(A0A(1323, 9, 19)) != false) goto L85;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public static KT A09(XmlPullParser xmlPullParser, KT kt) {
                        char c2;
                        KT kt2 = kt;
                        int attributeCount = xmlPullParser.getAttributeCount();
                        for (int i = 0; i < attributeCount; i++) {
                            String attributeValue = xmlPullParser.getAttributeValue(i);
                            String attributeName = xmlPullParser.getAttributeName(i);
                            int attributeCount2 = attributeName.hashCode();
                            char c3 = 5;
                            char c4 = 3;
                            char c5 = 65535;
                            switch (attributeCount2) {
                                case -1550943582:
                                    if (attributeName.equals(A0A(1380, 9, 95))) {
                                        c2 = 6;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1224696685:
                                    if (attributeName.equals(A0A(1362, 10, 22))) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1065511464:
                                    if (attributeName.equals(A0A(1694, 9, 87))) {
                                        c2 = 7;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -879295043:
                                    if (attributeName.equals(A0A(1727, 14, 94))) {
                                        c2 = '\f';
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -734428249:
                                    String A0A2 = A0A(1389, 10, 45);
                                    int i2 = A02[3].charAt(8);
                                    if (i2 != 97) {
                                        break;
                                    } else {
                                        A02[3] = "fe6MNLffa3xUvXQ94HR1CDOyy1WS5JE1";
                                        break;
                                    }
                                case 3355:
                                    if (attributeName.equals(A0A(1507, 2, 90))) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3511770:
                                    String[] strArr = A02;
                                    String str2 = strArr[6];
                                    String str3 = strArr[2];
                                    int i3 = str2.charAt(3);
                                    int attributeCount3 = str3.charAt(3);
                                    if (i3 != attributeCount3) {
                                        break;
                                    } else {
                                        String[] strArr2 = A02;
                                        strArr2[6] = "r3WwEsdAzhczhwcQVK7AHARKaZJ6b8mu";
                                        strArr2[2] = "SqtwuV9PjyH6OGgQkhkCGcnknbgAyTvh";
                                        break;
                                    }
                                case 94842723:
                                    String A0A3 = A0A(1305, 5, 89);
                                    String[] strArr3 = A02;
                                    String str4 = strArr3[4];
                                    String str5 = strArr3[7];
                                    int i4 = str4.length();
                                    int attributeCount4 = str5.length();
                                    if (i4 == attributeCount4) {
                                        A02[0] = "jWhc4LCLE9nWhLcrRob1";
                                        if (attributeName.equals(A0A3)) {
                                            c2 = 2;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    } else {
                                        throw new RuntimeException();
                                    }
                                case 109403361:
                                    String[] strArr4 = A02;
                                    String str6 = strArr4[4];
                                    String str7 = strArr4[7];
                                    int i5 = str6.length();
                                    int attributeCount5 = str7.length();
                                    if (i5 == attributeCount5) {
                                        A02[3] = "GnfcohyZaQ6EawQBfHDTHpH0pVR69ODz";
                                        if (attributeName.equals(A0A(1641, 5, 65))) {
                                            c2 = 14;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    } else {
                                        throw new RuntimeException();
                                    }
                                case 110138194:
                                    if (attributeName.equals(A0A(1703, 11, 87))) {
                                        c2 = '\t';
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 365601008:
                                    if (attributeName.equals(A0A(1372, 8, 13))) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 921125321:
                                    String A0A4 = A0A(1741, 12, 49);
                                    int i6 = A02[3].charAt(8);
                                    if (i6 != 97) {
                                        throw new RuntimeException();
                                    }
                                    String[] strArr5 = A02;
                                    strArr5[4] = "pLae2I6vaNRYXal5VxPfkycfu";
                                    strArr5[7] = "8woMJWwEfTDb0STXPvcxVArhw";
                                    if (attributeName.equals(A0A4)) {
                                        c2 = C8206nB.d;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1115953443:
                                    if (attributeName.equals(A0A(1628, 12, 104))) {
                                        c2 = 11;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1287124693:
                                    if (attributeName.equals(A0A(1217, 15, 103))) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1754920356:
                                    if (attributeName.equals(A0A(1563, 13, 74))) {
                                        c2 = '\b';
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            String A0A5 = A0A(892, 11, 16);
                            switch (c2) {
                                case 0:
                                    if (A0A(1655, 5, 93).equals(xmlPullParser.getName())) {
                                        kt2 = A08(kt2).A0Q(attributeValue);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 1:
                                    kt2 = A08(kt2);
                                    try {
                                        int attributeCount6 = AnonymousClass47.A01(attributeValue);
                                        kt2.A0G(attributeCount6);
                                        break;
                                    } catch (IllegalArgumentException unused) {
                                        AbstractC04624g.A07(A0A5, A0A(51, 33, 101) + attributeValue);
                                        break;
                                    }
                                case 2:
                                    kt2 = A08(kt2);
                                    try {
                                        int attributeCount7 = AnonymousClass47.A01(attributeValue);
                                        kt2.A0H(attributeCount7);
                                        break;
                                    } catch (IllegalArgumentException unused2) {
                                        AbstractC04624g.A07(A0A5, A0A(84, 28, 0) + attributeValue);
                                        break;
                                    }
                                case 3:
                                    kt2 = A08(kt2).A0P(attributeValue);
                                    break;
                                case 4:
                                    try {
                                        kt2 = A08(kt2);
                                        A0D(attributeValue, kt2);
                                        break;
                                    } catch (C1974lj unused3) {
                                        AbstractC04624g.A07(A0A5, A0A(112, 31, 89) + attributeValue);
                                        break;
                                    }
                                case 5:
                                    kt2 = A08(kt2).A0R(A0A(C8920q7.D, 4, 70).equalsIgnoreCase(attributeValue));
                                    break;
                                case 6:
                                    KT A082 = A08(kt2);
                                    boolean equalsIgnoreCase = A0A(1525, 6, 38).equalsIgnoreCase(attributeValue);
                                    int i7 = A02[0].length();
                                    if (i7 != 7) {
                                        String[] strArr6 = A02;
                                        strArr6[1] = "3LAgyyDE1fiF0";
                                        strArr6[5] = "1Nn0OmHZpjO5zuXdFxViYYhi";
                                        kt2 = A082.A0S(equalsIgnoreCase);
                                        break;
                                    } else {
                                        A02[3] = "rHlCayaIaBq6HOiiZnZ7WLhH9IM1pHxI";
                                        kt2 = A082.A0S(equalsIgnoreCase);
                                        break;
                                    }
                                case 7:
                                    kt2 = A08(kt2).A0M(A02(attributeValue));
                                    break;
                                case '\b':
                                    kt2 = A08(kt2).A0L(A02(attributeValue));
                                    break;
                                case '\t':
                                    String A012 = AbstractC1877k7.A01(attributeValue);
                                    int attributeCount8 = A012.hashCode();
                                    switch (attributeCount8) {
                                        case 96673:
                                            if (A012.equals(A0A(1214, 3, 74))) {
                                                c5 = 1;
                                                break;
                                            }
                                            break;
                                        case 3387192:
                                            String A0A6 = A0A(1589, 4, 93);
                                            String[] strArr7 = A02;
                                            String str8 = strArr7[4];
                                            String str9 = strArr7[7];
                                            int i8 = str8.length();
                                            int attributeCount9 = str9.length();
                                            if (i8 != attributeCount9) {
                                                throw new RuntimeException();
                                            }
                                            String[] strArr8 = A02;
                                            strArr8[6] = "KuhwJ7ghsOXYSD0w45zfNovp0dFSdmRc";
                                            strArr8[2] = "7BZwCfoQFB9cKVUBMfAbcYdCpdo30x6t";
                                            if (A012.equals(A0A6)) {
                                                c5 = 0;
                                                break;
                                            }
                                            break;
                                    }
                                    switch (c5) {
                                        case 0:
                                            kt2 = A08(kt2).A0U(false);
                                            continue;
                                        case 1:
                                            KT A083 = A08(kt2);
                                            String[] strArr9 = A02;
                                            String str10 = strArr9[6];
                                            String str11 = strArr9[2];
                                            int i9 = str10.charAt(3);
                                            int attributeCount10 = str11.charAt(3);
                                            if (i9 == attributeCount10) {
                                                String[] strArr10 = A02;
                                                strArr10[4] = "vXebmLnNF52WQsSE6i6dOepDl";
                                                strArr10[7] = "VyoJ0PyeyBelBF2UzGSxOycy2";
                                                kt2 = A083.A0U(true);
                                                break;
                                            } else {
                                                kt2 = A083.A0U(true);
                                                continue;
                                            }
                                    }
                                case '\n':
                                    String A013 = AbstractC1877k7.A01(attributeValue);
                                    int attributeCount11 = A013.hashCode();
                                    switch (attributeCount11) {
                                        case -618561360:
                                            if (A013.equals(A0A(1251, 13, 60))) {
                                                c3 = 2;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -410956671:
                                            if (A013.equals(A0A(1310, 9, 123))) {
                                                c3 = 0;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -250518009:
                                            break;
                                        case -136074796:
                                            if (A013.equals(A0A(1714, 13, 21))) {
                                                c3 = 4;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 3016401:
                                            int i10 = A02[0].length();
                                            if (i10 != 7) {
                                                String[] strArr11 = A02;
                                                strArr11[4] = "LIbObqkBHnKY9czcuqJXmaycY";
                                                strArr11[7] = "8yr68kE48uI7ct7K5MzK8s3n0";
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 3556653:
                                            if (A013.equals(A0A(1690, 4, 69))) {
                                                c3 = 3;
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
                                            kt2 = A08(kt2).A0K(1);
                                            continue;
                                        case 1:
                                        case 2:
                                            kt2 = A08(kt2).A0K(2);
                                            continue;
                                        case 3:
                                        case 4:
                                            kt2 = A08(kt2).A0K(3);
                                            continue;
                                        case 5:
                                            KT A084 = A08(kt2);
                                            String[] strArr12 = A02;
                                            String str12 = strArr12[6];
                                            String str13 = strArr12[2];
                                            int i11 = str12.charAt(3);
                                            int attributeCount12 = str13.charAt(3);
                                            if (i11 == attributeCount12) {
                                                String[] strArr13 = A02;
                                                strArr13[4] = "5y5J9haLXfISwEnEFuDPzKTDZ";
                                                strArr13[7] = "OL7OkctduLhf4RZoSVrAZg0CW";
                                                kt2 = A084.A0K(4);
                                                break;
                                            } else {
                                                A02[0] = "J4PxtYpjCjcISuW5D9hp9p1SdEi";
                                                kt2 = A084.A0K(4);
                                                continue;
                                            }
                                    }
                                case 11:
                                    String A014 = AbstractC1877k7.A01(attributeValue);
                                    int attributeCount13 = A014.hashCode();
                                    switch (attributeCount13) {
                                        case -1392885889:
                                            if (A014.equals(A0A(1264, 6, 99))) {
                                                c5 = 0;
                                                break;
                                            }
                                            break;
                                        case 92734940:
                                            if (A014.equals(A0A(1209, 5, 37))) {
                                                c5 = 1;
                                                break;
                                            }
                                            break;
                                    }
                                    switch (c5) {
                                        case 0:
                                            kt2 = A08(kt2).A0J(1);
                                            continue;
                                        case 1:
                                            kt2 = A08(kt2).A0J(2);
                                            continue;
                                    }
                                case '\f':
                                    String A015 = AbstractC1877k7.A01(attributeValue);
                                    int attributeCount14 = A015.hashCode();
                                    switch (attributeCount14) {
                                        case -1461280213:
                                            String A0A7 = A0A(1593, 11, 58);
                                            String[] strArr14 = A02;
                                            String str14 = strArr14[4];
                                            String str15 = strArr14[7];
                                            int i12 = str14.length();
                                            int attributeCount15 = str15.length();
                                            if (i12 != attributeCount15) {
                                                break;
                                            } else {
                                                String[] strArr15 = A02;
                                                strArr15[1] = "bik63b6qq3sx6";
                                                strArr15[5] = "UnBPKnpUlJfync8N3sKzurGh";
                                                break;
                                            }
                                        case -1026963764:
                                            if (A015.equals(A0A(1763, 9, 73))) {
                                                c4 = 2;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 913457136:
                                            String[] strArr16 = A02;
                                            String str16 = strArr16[1];
                                            String str17 = strArr16[5];
                                            int i13 = str16.length();
                                            int attributeCount16 = str17.length();
                                            if (i13 != attributeCount16) {
                                                A02[3] = "e93UUhN2aqZLtboheHnNzqcVXHE9GMfx";
                                                if (A015.equals(A0A(1576, 13, 109))) {
                                                    c4 = 1;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            } else {
                                                throw new RuntimeException();
                                            }
                                        case 1679736913:
                                            if (A015.equals(A0A(1541, 11, 39))) {
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
                                            kt2 = A08(kt2).A0T(true);
                                            continue;
                                        case 1:
                                            kt2 = A08(kt2).A0T(false);
                                            continue;
                                        case 2:
                                            kt2 = A08(kt2).A0V(true);
                                            continue;
                                        case 3:
                                            kt2 = A08(kt2).A0V(false);
                                            continue;
                                    }
                                case '\r':
                                    kt2 = A08(kt2).A0N(KI.A01(attributeValue));
                                    break;
                                case 14:
                                    kt2 = A08(kt2).A0F(A00(attributeValue));
                                    break;
                            }
                        }
                        return kt2;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    public static void A0D(String str2, KT kt) throws C1974lj {
                        Matcher matcher;
                        char c2;
                        String[] A1O = C5C.A1O(str2, A0A(962, 3, 60));
                        if (A1O.length == 1) {
                            matcher = A09.matcher(str2);
                        } else if (A1O.length == 2) {
                            matcher = A09.matcher(A1O[1]);
                            AbstractC04624g.A07(A0A(892, 11, 16), A0A(735, 110, 105));
                        } else {
                            throw new C1974lj(A0A(615, 40, 76) + A1O.length + A0A(5, 1, 61));
                        }
                        boolean matches = matcher.matches();
                        String A0A2 = A0A(3, 2, 77);
                        if (matches) {
                            String str3 = (String) AbstractC04543y.A01(matcher.group(3));
                            switch (str3.hashCode()) {
                                case 37:
                                    if (str3.equals(A0A(2, 1, 112))) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3240:
                                    if (str3.equals(A0A(1350, 2, 76))) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3592:
                                    if (str3.equals(A0A(1611, 2, 111))) {
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
                                    kt.A0I(1);
                                    break;
                                case 1:
                                    kt.A0I(2);
                                    break;
                                case 2:
                                    kt.A0I(3);
                                    break;
                                default:
                                    throw new C1974lj(A0A(655, 28, 54) + str3 + A0A2);
                            }
                            kt.A0E(Float.parseFloat((String) AbstractC04543y.A01(matcher.group(1))));
                            return;
                        }
                        throw new C1974lj(A0A(581, 34, 24) + str2 + A0A2);
                    }

                    public static void A0E(XmlPullParser xmlPullParser, Map<String, String> map) throws IOException, XmlPullParserException {
                        String encodedBitmapData;
                        do {
                            xmlPullParser.next();
                            if (C5I.A04(xmlPullParser, A0A(1509, 5, 41)) && (encodedBitmapData = C5I.A00(xmlPullParser, A0A(1507, 2, 90))) != null) {
                                String id = xmlPullParser.nextText();
                                map.put(encodedBitmapData, id);
                            }
                        } while (!C5I.A03(xmlPullParser, A0A(1553, 8, 69)));
                    }

                    public static boolean A0F(String str2) {
                        if (!str2.equals(A0A(1761, 2, 56)) && !str2.equals(A0A(1468, 4, 96)) && !str2.equals(A0A(1275, 4, 43)) && !str2.equals(A0A(1344, 3, 104))) {
                            if (A02[3].charAt(8) == 'a') {
                                String[] strArr = A02;
                                strArr[6] = "5SOwrViEjml2jzAC0QTdKKqpMqKJiIIU";
                                strArr[2] = "utbwyOpqs8b3qaaxxsItXWquxXfcomKh";
                                if (!str2.equals(A0A(1610, 1, 0)) && !str2.equals(A0A(1646, 4, 62)) && !str2.equals(A0A(1283, 2, 97)) && !str2.equals(A0A(1655, 5, 93)) && !str2.equals(A0A(1660, 7, 99)) && !str2.equals(A0A(1531, 6, 85)) && !str2.equals(A0A(1613, 6, 33))) {
                                    if (A02[0].length() != 7) {
                                        String[] strArr2 = A02;
                                        strArr2[4] = "XYEsrL24jboJLM6xnETRDfm0d";
                                        strArr2[7] = "LekapK6bz2qvUkLFlJCVYN0VS";
                                        if (!str2.equals(A0A(1553, 8, 69)) && !str2.equals(A0A(1509, 5, 41)) && !str2.equals(A0A(1319, 4, 11)) && !str2.equals(A0A(1514, 11, 3))) {
                                            return false;
                                        }
                                    }
                                }
                            }
                            throw new RuntimeException();
                        }
                        return true;
                    }

                    public static String[] A0G(String str2) {
                        String trim = str2.trim();
                        return trim.isEmpty() ? new String[0] : C5C.A1O(trim, A0A(962, 3, 60));
                    }
                };
            case 4:
                return new C8T() { // from class: com.facebook.ads.redexgen.X.1Q
                    public static byte[] A02;
                    public static String[] A03 = {"V1ZZWdHDdvp1vpeLHdy", "beDgvqL", "qPeUfXz8O47jIG0mRxxGLFbgYUjiO6tn", "0K37", "zACOzYjEJA3uY03LtXi99GuZvxjyA3vu", "", "yqoUvvveMQQADX2xw", "YF66NynmqVwoWtjOGJ4L1x6BuFt5Rq6F"};
                    public static final Pattern A04;
                    public static final Pattern A05;
                    public final StringBuilder A00;
                    public final ArrayList<String> A01;

                    public static String A03(int i, int i2, int i3) {
                        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 94);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A06() {
                        A02 = new byte[]{76, C8077mf.u, 2, 78, 108, 84, 86, 79, 79, 86, 81, 88, 31, 86, 81, 73, 94, 83, 86, 91, 31, 86, 81, 91, 90, 71, 5, 31, 75, 115, 113, 104, 104, 113, 118, Byte.MAX_VALUE, 56, 113, 118, 110, 121, 116, 113, 124, 56, 108, 113, 117, 113, 118, Byte.MAX_VALUE, 34, 56, 123, 93, 74, 90, 65, 88, 108, 77, 75, 71, 76, 77, 90, 80, 107, 96, 125, 117, 96, 102, 113, 96, 97, C3307Iz.X, 96, 107, 97, 60, 19, 74, 72, 72, 95, 90, 72, 60, 4, 75, 73, 90, 73, 95, 72, 60, 4, 75, 73, 90, 72, 60, 4, 75, 73, 72, 95, 90, 76, 72, 60, 4, 75, 73, 73, 95, 73, 60, 19, 74, 77, 77, 94, 60, 19, 74, 72, 72, 95, 90, 72, 60, 4, 75, 73, 90, 73, 95, 72, 60, 4, 75, 73, 90, 72, 60, 4, 75, 73, 72, 95, 90, 76, 72, 60, 4, 75, 73, 73, 95, 73, 60, 19, 74, 9, C3307Iz.f0, 9, 9, 123, Byte.MAX_VALUE, 106, 9, 40, C8077mf.D, C4715Xk.i, C8077mf.D, C8077mf.D, C3307Iz.Z, 40, C8077mf.G, 119, 107, Byte.MAX_VALUE, C8077mf.E, C8077mf.D, 59, C8077mf.m, C3307Iz.d0, 17, C8077mf.H, 65, 13, 19, 52, 9, 6, 90, C8077mf.y, 31, 56, 5, 10, 87, C8077mf.C, 74, 109, 80, 95, 5, 76, 125, 90, 103, 104, 51, 123, 117, 82, 111, 96, 56, 115, C3307Iz.Y, 1, 60, 51, 106, 32, Byte.MAX_VALUE, 88, 101, 106, 60, 121, 59, 28, C3307Iz.V, C3307Iz.f0, 121, C4715Xk.i};
                    }

                    static {
                        A06();
                        A05 = Pattern.compile(A03(80, 85, 62));
                        A04 = Pattern.compile(A03(C10997yd1.v1, 9, 11));
                    }

                    {
                        A03(53, 13, 118);
                        this.A00 = new StringBuilder();
                        this.A01 = new ArrayList<>();
                    }

                    public static float A00(int i) {
                        switch (i) {
                            case 0:
                                return 0.08f;
                            case 1:
                                return 0.5f;
                            case 2:
                                return 0.92f;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }

                    public static long A01(Matcher matcher, int i) {
                        long timestampMs;
                        String hours = matcher.group(i + 1);
                        if (hours != null) {
                            timestampMs = Long.parseLong(hours) * 60 * 60 * 1000;
                        } else {
                            timestampMs = 0;
                        }
                        long timestampMs2 = timestampMs + (Long.parseLong((String) AbstractC04543y.A01(matcher.group(i + 2))) * 60 * 1000) + (Long.parseLong((String) AbstractC04543y.A01(matcher.group(i + 3))) * 1000);
                        String hours2 = matcher.group(i + 4);
                        if (hours2 != null) {
                            long parseLong = Long.parseLong(hours2);
                            if (A03[6].length() == 8) {
                                throw new RuntimeException();
                            }
                            A03[0] = "CtNVef4YfaKqE1U7uEo";
                            timestampMs2 += parseLong;
                        }
                        return 1000 * timestampMs2;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f3, code lost:
                        if (r7 != false) goto L37;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f5, code lost:
                        r0 = '\b';
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ff, code lost:
                        if (r7 != false) goto L37;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private C2192pT A02(Spanned spanned, String str2) {
                        char c2;
                        char c3;
                        C04443o A0G = new C04443o().A0G(spanned);
                        if (str2 == null) {
                            return A0G.A0H();
                        }
                        int hashCode = str2.hashCode();
                        String A032 = A03(235, 6, 30);
                        String A033 = A03(229, 6, 90);
                        String A034 = A03(223, 6, 3);
                        String A035 = A03(217, 6, 80);
                        String A036 = A03(211, 6, 88);
                        String A037 = A03(205, 6, 111);
                        String A038 = A03(199, 6, 58);
                        String A039 = A03(C8463oE0.u, 6, 54);
                        String A0310 = A03(C10997yd1.l2, 6, 46);
                        switch (hashCode) {
                            case -685620710:
                                if (str2.equals(A0310)) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -685620679:
                                if (str2.equals(A039)) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -685620648:
                                if (str2.equals(A038)) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -685620617:
                                if (str2.equals(A037)) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -685620586:
                                if (str2.equals(A036)) {
                                    c2 = 7;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -685620555:
                                if (str2.equals(A035)) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -685620524:
                                if (str2.equals(A034)) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -685620493:
                                if (str2.equals(A033)) {
                                    c2 = '\b';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -685620462:
                                if (str2.equals(A032)) {
                                    c2 = 5;
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
                            case 1:
                            case 2:
                                A0G.A0A(0);
                                break;
                            case 3:
                            case 4:
                            case 5:
                                A0G.A0A(2);
                                break;
                            default:
                                A0G.A0A(1);
                                break;
                        }
                        switch (str2.hashCode()) {
                            case -685620710:
                                if (str2.equals(A0310)) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -685620679:
                                if (str2.equals(A039)) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -685620648:
                                if (str2.equals(A038)) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -685620617:
                                if (str2.equals(A037)) {
                                    c3 = 6;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -685620586:
                                if (str2.equals(A036)) {
                                    c3 = 7;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -685620555:
                                boolean equals = str2.equals(A035);
                                if (A03[2].charAt(27) == 'i') {
                                    A03[6] = "UHPaLodBHWPdzWPsqAutdz";
                                    break;
                                } else {
                                    A03[6] = "bPzv";
                                    break;
                                }
                            case -685620524:
                                if (str2.equals(A034)) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -685620493:
                                boolean equals2 = str2.equals(A033);
                                if (A03[5].length() == 0) {
                                    A03[7] = "M45Jq4jKyA2H1maO39BtbvDEugCoSizz";
                                    if (equals2) {
                                        c3 = 4;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                } else {
                                    throw new RuntimeException();
                                }
                            case -685620462:
                                if (str2.equals(A032)) {
                                    c3 = 5;
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
                            case 1:
                            case 2:
                                A0G.A09(2);
                                break;
                            case 3:
                            case 4:
                            case 5:
                                A0G.A09(0);
                                break;
                            default:
                                A0G.A09(1);
                                break;
                        }
                        C04443o cue = A0G.A04(A00(A0G.A01()));
                        return cue.A07(A00(A0G.A00()), 0).A0H();
                    }

                    private String A04(String str2, ArrayList<String> arrayList) {
                        String trim = str2.trim();
                        int i = 0;
                        StringBuilder sb = new StringBuilder(trim);
                        Matcher matcher = A04.matcher(trim);
                        while (matcher.find()) {
                            String group = matcher.group();
                            arrayList.add(group);
                            int tagLength = matcher.start() - i;
                            int start = group.length();
                            sb.replace(tagLength, tagLength + start, A03(0, 0, 37));
                            i += start;
                        }
                        return sb.toString();
                    }

                    private Charset A05(C04774v c04774v) {
                        Charset charset = c04774v.A0Z();
                        return charset != null ? charset : AbstractC1879k9.A05;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:43:0x0174, code lost:
                        return new com.facebook.ads.redexgen.X.C1968ld((com.facebook.ads.redexgen.X.C2192pT[]) r4.toArray(new com.facebook.ads.redexgen.X.C2192pT[0]), r3.A05());
                     */
                    @Override // com.facebook.ads.redexgen.X.C8T
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final InterfaceC0837Jj A0g(byte[] bArr, int i, boolean z) {
                        String A032 = A03(53, 13, 118);
                        ArrayList arrayList = new ArrayList();
                        C04634h c04634h = new C04634h();
                        C04774v c04774v = new C04774v(bArr, i);
                        Charset A052 = A05(c04774v);
                        while (true) {
                            String A0Y = c04774v.A0Y(A052);
                            if (A0Y == null) {
                                break;
                            } else if (A0Y.length() != 0) {
                                try {
                                    Integer.parseInt(A0Y);
                                    String A0Y2 = c04774v.A0Y(A052);
                                    if (A0Y2 != null) {
                                        Matcher matcher = A05.matcher(A0Y2);
                                        if (matcher.matches()) {
                                            c04634h.A04(A01(matcher, 1));
                                            if (A03[6].length() == 8) {
                                                break;
                                            }
                                            A03[5] = "";
                                            c04634h.A04(A01(matcher, 6));
                                            this.A00.setLength(0);
                                            this.A01.clear();
                                            for (String A0Y3 = c04774v.A0Y(A052); !TextUtils.isEmpty(A0Y3); A0Y3 = c04774v.A0Y(A052)) {
                                                if (this.A00.length() > 0) {
                                                    this.A00.append(A03(0, 4, 46));
                                                }
                                                this.A00.append(A04(A0Y3, this.A01));
                                            }
                                            Spanned fromHtml = Html.fromHtml(this.A00.toString());
                                            String alignmentTag = null;
                                            for (int i2 = 0; i2 < this.A01.size(); i2++) {
                                                String str2 = this.A01.get(i2);
                                                if (A03[5].length() != 0) {
                                                    if (str2.matches(A03(C10997yd1.y1, 13, 24))) {
                                                        alignmentTag = str2;
                                                        break;
                                                    }
                                                } else {
                                                    A03[5] = "";
                                                    if (str2.matches(A03(C10997yd1.y1, 13, 24))) {
                                                        alignmentTag = str2;
                                                        break;
                                                    }
                                                }
                                            }
                                            arrayList.add(A02(fromHtml, alignmentTag));
                                            arrayList.add(C2192pT.A0J);
                                        } else {
                                            AbstractC04624g.A07(A032, A03(28, 25, 70) + A0Y2);
                                        }
                                    } else if (A03[0].length() == 19) {
                                        A03[6] = "HJ3yDRHWzcPXInAXvwJ005QsJz";
                                        AbstractC04624g.A07(A032, A03(66, 14, 91));
                                    }
                                } catch (NumberFormatException unused) {
                                    AbstractC04624g.A07(A032, A03(4, 24, 97) + A0Y);
                                }
                            }
                        }
                        throw new RuntimeException();
                    }
                };
            case 5:
                final List<byte[]> list = c2242qI.A0X;
                return new C8T(list) { // from class: com.facebook.ads.redexgen.X.1O
                    public static byte[] A07;
                    public static String[] A08 = {"1x7tMScy3OwIpxpoM6szN", "Vc9HgGpBlB6xOFpUGzWjKY6X9B2Kx", "Pa2y8LS5d14E5c2iioTa3o6alel444yu", "nvl8EzHImhNd4skDgpAF61hzJTcSqLGr", "i0VKuTBNrkqino8Xl71fJI1fPr2JZBLb", "b0kCsBlNmzlDPYQHWIClkO446cJaLVwv", "T6LNoF", "e0xJgOhUsx7"};
                    public final float A00;
                    public final int A01;
                    public final int A02;
                    public final int A03;
                    public final C04774v A04;
                    public final String A05;
                    public final boolean A06;

                    public static String A00(int i, int i2, int i3) {
                        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
                        int i4 = 0;
                        while (true) {
                            int length = copyOfRange.length;
                            String[] strArr = A08;
                            if (strArr[5].charAt(1) != strArr[4].charAt(1)) {
                                throw new RuntimeException();
                            }
                            A08[7] = "yGrIv6QCmXhG";
                            if (i4 >= length) {
                                return new String(copyOfRange);
                            }
                            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 85);
                            i4++;
                        }
                    }

                    public static void A02() {
                        A07 = new byte[]{-36, -45, -15, -16, -45, C8077mf.B, C3307Iz.V, C8077mf.A, -45, -37, -21, -30, 54, 49, -30, C3307Iz.X, 55, C3307Iz.Z, C8077mf.z, C3307Iz.Z, 58, 54, -16, C3307Iz.f0, C3307Iz.Z, 48, C3307Iz.a0, 54, 42, -22, -21, -30, -22, C2638Cg0.y7, -46, 19, 49, 56, 57, 60, 51, 56, 49, -22, C4715Xk.i, 62, 67, 54, -22, 65, 51, 62, 50, -22, C4715Xk.i, 62, C3307Iz.c0, 60, 62, -22, -14, -48, -30, -17, -26, -29, C8077mf.x, 50, 53, C3307Iz.f0, 35, C3307Iz.V, 52, C3307Iz.a0, C3307Iz.f0, C3307Iz.Z, -32, 51, 52, 57, C3307Iz.d0, -32, C3307Iz.X, C3307Iz.f0, 36, -32, -24, C8077mf.C, C4715Xk.i, -8, C3307Iz.d0, 9, 42, 40, 52, C3307Iz.a0, 42, 55, -48, -23, -32, -13, -21, -32, -34, -17, -32, -33, -101, -18, -16, -35, -17, -28, -17, -25, -32, -101, C2638Cg0.C7, -22, -19, -24, -36, -17, -87, C8077mf.q, -3, 10, C8077mf.q, C2638Cg0.v7, C8077mf.q, 1, C8077mf.p, 5, 2, C2638Cg0.C7, -45, -32, -41, -44};
                    }

                    static {
                        A02();
                    }

                    {
                        super(A00(87, 11, 112));
                        this.A04 = new C04774v();
                        int size = list.size();
                        String A00 = A00(125, 10, 71);
                        if (size == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
                            byte[] bArr = list.get(0);
                            this.A03 = bArr[24];
                            this.A02 = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
                            this.A05 = A00(61, 5, 40).equals(C5C.A0r(bArr, 43, bArr.length - 43)) ? A00(135, 5, 25) : A00;
                            this.A01 = bArr[25] * C8077mf.x;
                            this.A06 = (bArr[0] & 32) != 0;
                            if (this.A06) {
                                int requestedVerticalPlacement = ((bArr[10] & 255) << 8) | (bArr[11] & 255);
                                this.A00 = C5C.A00(requestedVerticalPlacement / this.A01, 0.0f, 0.95f);
                                return;
                            }
                            this.A00 = 0.85f;
                            return;
                        }
                        this.A03 = 0;
                        this.A02 = -1;
                        this.A05 = A00;
                        this.A06 = false;
                        this.A00 = 0.85f;
                        this.A01 = -1;
                    }

                    public static String A01(C04774v c04774v) throws C1974lj {
                        A07(c04774v.A07() >= 2);
                        int bomSize = c04774v.A0M();
                        if (bomSize == 0) {
                            return A00(0, 0, 4);
                        }
                        int A09 = c04774v.A09();
                        Charset A0Z = c04774v.A0Z();
                        int textLength = c04774v.A09();
                        int bomSize2 = bomSize - (textLength - A09);
                        if (A0Z == null) {
                            A0Z = AbstractC1879k9.A05;
                        }
                        return c04774v.A0X(bomSize2, A0Z);
                    }

                    public static void A03(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
                        if (i != i2) {
                            int colorArgb = i5 | 33;
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(((i & 255) << 24) | (i >>> 8)), i3, i4, colorArgb);
                        }
                    }

                    public static void A04(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
                        if (i != i2) {
                            int i6 = i5 | 33;
                            int i7 = i & 1;
                            String[] strArr = A08;
                            String str2 = strArr[5];
                            String str3 = strArr[4];
                            int charAt = str2.charAt(1);
                            int flags = str3.charAt(1);
                            if (charAt != flags) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A08;
                            strArr2[0] = "CK5gR0nAI76s8EUE0bHGc";
                            strArr2[6] = "a3HU5o";
                            boolean z = i7 != 0;
                            int flags2 = i & 2;
                            boolean z2 = flags2 != 0;
                            if (z) {
                                if (z2) {
                                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                                } else {
                                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                                }
                            } else if (z2) {
                                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
                            }
                            int flags3 = i & 4;
                            boolean z3 = flags3 != 0;
                            if (z3) {
                                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
                            }
                            if (!z3 && !z && !z2) {
                                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
                            }
                        }
                    }

                    public static void A05(SpannableStringBuilder spannableStringBuilder, String str2, int i, int i2) {
                        if (str2 != A00(125, 10, 71)) {
                            spannableStringBuilder.setSpan(new TypefaceSpan(str2), i, i2, 16711713);
                        }
                    }

                    private void A06(C04774v c04774v, SpannableStringBuilder spannableStringBuilder) throws C1974lj {
                        A07(c04774v.A07() >= 12);
                        int fontFace = c04774v.A0M();
                        int A0M = c04774v.A0M();
                        c04774v.A0g(2);
                        int A0I = c04774v.A0I();
                        c04774v.A0g(1);
                        int A0C = c04774v.A0C();
                        int length = spannableStringBuilder.length();
                        String A00 = A00(33, 2, 79);
                        String A002 = A00(87, 11, 112);
                        if (A0M > length) {
                            StringBuilder append = new StringBuilder().append(A00(66, 21, 107)).append(A0M).append(A00(10, 23, 109));
                            int start = spannableStringBuilder.length();
                            AbstractC04624g.A07(A002, append.append(start).append(A00).toString());
                            A0M = spannableStringBuilder.length();
                        }
                        if (fontFace < A0M) {
                            A04(spannableStringBuilder, A0I, this.A03, fontFace, A0M, 0);
                            A03(spannableStringBuilder, A0C, this.A02, fontFace, A0M, 0);
                            return;
                        }
                        AbstractC04624g.A07(A002, A00(35, 26, 117) + fontFace + A00(0, 10, 94) + A0M + A00);
                    }

                    public static void A07(boolean z) throws C1974lj {
                        if (z) {
                            return;
                        }
                        throw new C1974lj(A00(98, 27, 38));
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cf, code lost:
                        if (r7.A07() >= 2) goto L33;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d1, code lost:
                        A07(r9);
                        r7 = com.facebook.ads.redexgen.X.C5C.A00(r17.A04.A0M() / r17.A01, 0.0f, 0.95f);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ff, code lost:
                        if (r7.A07() >= 2) goto L33;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:33:0x0102, code lost:
                        r9 = false;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:26:0x00cb  */
                    /* JADX WARN: Removed duplicated region for block: B:30:0x00ef  */
                    @Override // com.facebook.ads.redexgen.X.C8T
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final InterfaceC0837Jj A0g(byte[] bArr, int i, boolean z) throws C1974lj {
                        String str2;
                        String cueTextString;
                        this.A04.A0j(bArr, i);
                        String A012 = A01(this.A04);
                        if (A012.isEmpty()) {
                            return C1966lb.A02;
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A012);
                        A04(spannableStringBuilder, this.A03, 0, 0, spannableStringBuilder.length(), 16711680);
                        A03(spannableStringBuilder, this.A02, -1, 0, spannableStringBuilder.length(), 16711680);
                        A05(spannableStringBuilder, this.A05, 0, spannableStringBuilder.length());
                        float f = this.A00;
                        while (this.A04.A07() >= 8) {
                            int atomSize = this.A04.A09();
                            int A0C = this.A04.A0C();
                            int A0C2 = this.A04.A0C();
                            if (A0C2 == 1937013100) {
                                int A072 = this.A04.A07();
                                String[] strArr = A08;
                                String str3 = strArr[0];
                                String cueTextString2 = strArr[6];
                                if (str3.length() == cueTextString2.length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A08;
                                strArr2[0] = "Z2UJzHF8zneH9ag5NgWte";
                                strArr2[6] = "yNPyx5";
                                A07(A072 >= 2);
                                int position = this.A04.A0M();
                                for (int i2 = 0; i2 < position; i2++) {
                                    A06(this.A04, spannableStringBuilder);
                                }
                            } else if (A0C2 == 1952608120) {
                                boolean z2 = this.A06;
                                String cueTextString3 = A08[1];
                                if (cueTextString3.length() != 29) {
                                    if (!z2) {
                                    }
                                    C04774v c04774v = this.A04;
                                    String[] strArr3 = A08;
                                    str2 = strArr3[2];
                                    cueTextString = strArr3[3];
                                    if (str2.length() != cueTextString.length()) {
                                        String[] strArr4 = A08;
                                        strArr4[0] = "wTXVya3nfhs0Hhsed0pql";
                                        strArr4[6] = "bT1NwA";
                                    }
                                } else {
                                    A08[1] = "paw5WSKbqYtpnsyQNjpQb8Noh3AWg";
                                    if (!z2) {
                                    }
                                    C04774v c04774v2 = this.A04;
                                    String[] strArr32 = A08;
                                    str2 = strArr32[2];
                                    cueTextString = strArr32[3];
                                    if (str2.length() != cueTextString.length()) {
                                    }
                                }
                            }
                            this.A04.A0f(atomSize + A0C);
                        }
                        return new C1966lb(new C04443o().A0G(spannableStringBuilder).A07(f, 0).A09(0).A0H());
                    }
                };
            case 6:
            case 7:
                return new C1X(c2242qI.A0W, c2242qI.A03, C10323vs.b);
            case '\b':
                final int i = c2242qI.A03;
                return new C8M(i, null) { // from class: com.facebook.ads.redexgen.X.1W
                    public static byte[] A0B;
                    public static String[] A0C = {"StgEnyZrIiHukKZI2mjNBpxMfWWHoY2N", "pPiD", "4nUZoZtFS8Fi7y", "soUNpDdTYgeZzoXYzwhXpymROnExsdJX", "jQfRXI2O9AZyEok5vhLK2LNFq5CUiSFO", "NRbI1hfkyM6vnftXJILRzJXuHgspnZLF", "iSpRtaxsShIsoCeM", "S"};
                    public int A00;
                    public C0843Jp A02;
                    public C0844Jq A03;
                    public List<C2192pT> A04;
                    public List<C2192pT> A05;
                    public final int A06;
                    public final boolean A09;
                    public final C0843Jp[] A0A;
                    public final C04774v A08 = new C04774v();
                    public final C04764u A07 = new C04764u();
                    public int A01 = -1;

                    public static String A00(int i2, int i3, int i4) {
                        byte[] copyOfRange = Arrays.copyOfRange(A0B, i2, i2 + i3);
                        int i5 = 0;
                        while (true) {
                            int length = copyOfRange.length;
                            String[] strArr = A0C;
                            if (strArr[2].length() == strArr[7].length()) {
                                throw new RuntimeException();
                            }
                            A0C[1] = "zpnW";
                            if (i5 >= length) {
                                return new String(copyOfRange);
                            }
                            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 124);
                            i5++;
                        }
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    private void A03() {
                        this.A02.A0C(this.A07.A04(4), this.A07.A04(2), this.A07.A04(2), this.A07.A0H(), this.A07.A0H(), this.A07.A04(3), this.A07.A04(3));
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    private void A04() {
                        int A012 = C0843Jp.A01(this.A07.A04(2), this.A07.A04(2), this.A07.A04(2), this.A07.A04(2));
                        int A013 = C0843Jp.A01(this.A07.A04(2), this.A07.A04(2), this.A07.A04(2), this.A07.A04(2));
                        this.A07.A09(2);
                        this.A02.A0B(A012, A013, C0843Jp.A00(this.A07.A04(2), this.A07.A04(2), this.A07.A04(2)));
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    private void A06() {
                        int A012 = C0843Jp.A01(this.A07.A04(2), this.A07.A04(2), this.A07.A04(2), this.A07.A04(2));
                        int A04 = this.A07.A04(2);
                        int A00 = C0843Jp.A00(this.A07.A04(2), this.A07.A04(2), this.A07.A04(2));
                        if (this.A07.A0H()) {
                            A04 |= 4;
                        }
                        boolean A0H = this.A07.A0H();
                        int A042 = this.A07.A04(2);
                        int A043 = this.A07.A04(2);
                        int A044 = this.A07.A04(2);
                        this.A07.A09(8);
                        this.A02.A0D(A012, A00, A0H, A04, A042, A043, A044);
                    }

                    public static void A09() {
                        A0B = new byte[]{3, C8077mf.m, 86, 72, 84, 88, 72, 81, 70, 72, 3, 81, 88, 80, 69, 72, 85, 3, C8077mf.z, 89, 107, 104, 104, 91, 100, 106, 51, -5, -14, 73, 58, 55, 64, -14, 52, 62, 65, 53, C4715Xk.i, C3307Iz.X, 59, 76, 55, -14, 59, 69, -14, 2, 32, 50, 4, -8, 58, 77, 76, -8, 59, 77, 74, 74, C4715Xk.i, 70, 76, -8, 65, 70, 60, C4715Xk.i, 80, -8, 65, 75, -8, 8, 42, C3307Iz.Y, -4, -11, -3, 9, 42, 40, 52, C3307Iz.a0, 42, 55, 19, 69, 66, 66, 53, 62, 68, 60, 73, -16, 69, 62, 67, 69, 64, 64, ED2.a, 66, 68, 53, 52, -16, 19, 31, C8077mf.G, C8077mf.G, 17, C8077mf.H, C8077mf.x, 47, C8077mf.y, 40, 36, 1, -16, 19, ED2.a, C4715Xk.i, C4715Xk.i, 49, 62, 52, 10, -16, -42, 8, 5, 5, -8, 1, 7, -1, C8077mf.n, -77, 8, 1, 6, 8, 3, 3, 2, 5, 7, -8, -9, -77, -42, -30, -32, -32, -44, C2638Cg0.C7, -41, -14, -29, -60, C2638Cg0.v7, -77, -42, 2, 0, 0, -12, 1, -9, C2638Cg0.y7, -77, -52, -4, -2, C2638Cg0.x7, -21, C2638Cg0.n7, -23, -21, -13, -19, -4, -88, -19, -10, -20, -19, -20, -88, -8, -6, -19, -11, -23, -4, -3, -6, -19, -12, 1, C2638Cg0.r7, -88, -5, -15, 2, -19, -88, -15, -5, -88, C8077mf.z, ED2.a, 52, 64, 70, ED2.a, 69, 54, 67, 54, 53, -15, C8077mf.y, C3307Iz.X, C3307Iz.Z, C8077mf.x, C8077mf.x, 48, C3307Iz.V, C8077mf.u, C8077mf.x, 28, C8077mf.z, C3307Iz.X, 48, C8077mf.y, C8077mf.u, C3307Iz.X, C8077mf.u, -15, 51, 54, 55, 64, 67, 54, -15, C8077mf.y, C3307Iz.X, C3307Iz.Z, C8077mf.x, C8077mf.x, 48, C3307Iz.V, C8077mf.u, C8077mf.x, 28, C8077mf.z, C3307Iz.X, 48, 36, C3307Iz.X, C8077mf.u, 35, C3307Iz.X, 8, C3307Iz.e0, 53, 32, C3307Iz.c0, 40, 35, -33, 2, -17, -33, 34, C3307Iz.f0, C3307Iz.d0, C3307Iz.d0, 32, C3307Iz.e0, 35, -7, -33, 49, 86, 94, 73, 84, 81, 76, 8, C3307Iz.c0, C8077mf.C, 8, 75, 87, 85, 85, 73, 86, 76, 34, 8, -7, C8077mf.H, C3307Iz.Y, 17, 28, C8077mf.C, C8077mf.x, -48, -9, -30, -48, 19, C8077mf.B, 17, 34, 17, 19, 36, C8077mf.y, 34, -22, -48, C2638Cg0.v7, -18, -10, C2638Cg0.C7, -20, -23, -28, -96, C2638Cg0.u7, -77, -96, -29, -24, C2638Cg0.C7, -14, C2638Cg0.C7, -29, -12, -27, -14, -70, -96, C2638Cg0.x7, -16, -8, -29, -18, -21, -26, -94, -28, -29, -11, -25, -94, -27, -15, -17, -17, -29, -16, -26, -68, -94, -28, 9, 17, -4, 7, 4, -1, -69, 0, 19, C8077mf.q, 0, 9, -1, 0, -1, -69, -2, 10, 8, 8, -4, 9, -1, -43, -69, -7, C8077mf.H, C3307Iz.Y, 17, 28, C8077mf.C, C8077mf.x, -48, C8077mf.y, 40, 36, C8077mf.y, C8077mf.H, C8077mf.x, C8077mf.y, C8077mf.x, -48, 35, C8077mf.y, 34, C3307Iz.Y, C8077mf.C, 19, C8077mf.y, -48, C8077mf.H, C3307Iz.X, C8077mf.G, C8077mf.u, C8077mf.y, 34, -22, -48, 42, 60, 72, 76, 60, 69, 58, 60, -9, 69, 76, 68, 57, 60, 73, -9, 59, 64, 74, 58, 70, 69, 75, 64, 69, 76, 64, 75, 80, 5, -9, 71, 73, 60, 77, 64, 70, 76, 74, C8077mf.x, 66, 52, 65, 69, 56, 50, 52, C8077mf.G, 68, 60, 49, 52, 65, -17, 56, 66, -17, C4715Xk.i, 62, C4715Xk.i, -4, 73, 52, 65, 62, -17, -9};
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    private void A0E(int i2) {
                        C0843Jp c0843Jp = this.A0A[i2];
                        this.A07.A09(2);
                        boolean A0H = this.A07.A0H();
                        boolean A0H2 = this.A07.A0H();
                        boolean A0H3 = this.A07.A0H();
                        int A04 = this.A07.A04(3);
                        boolean A0H4 = this.A07.A0H();
                        int A042 = this.A07.A04(7);
                        int A043 = this.A07.A04(8);
                        int A044 = this.A07.A04(4);
                        int A045 = this.A07.A04(4);
                        this.A07.A09(2);
                        int A046 = this.A07.A04(6);
                        this.A07.A09(2);
                        c0843Jp.A0F(A0H, A0H2, A0H3, A04, A0H4, A042, A043, A045, A046, A044, this.A07.A04(3), this.A07.A04(3));
                    }

                    static {
                        A09();
                    }

                    {
                        boolean z = true;
                        this.A06 = i == -1 ? 1 : i;
                        this.A09 = (initializationData == null || !AnonymousClass46.A06(initializationData)) ? false : false;
                        this.A0A = new C0843Jp[8];
                        for (int i2 = 0; i2 < 8; i2++) {
                            this.A0A[i2] = new C0843Jp();
                        }
                        this.A02 = this.A0A[0];
                    }

                    /* JADX WARN: Incorrect condition in loop: B:4:0x0014 */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private List<C2192pT> A01() {
                        C0842Jo A05;
                        ArrayList arrayList = new ArrayList();
                        int i2 = 0;
                        while (i == 111) {
                            A0C[6] = "prFtgZEgycD";
                            if (i2 < 8) {
                                if (!this.A0A[i2].A0H() && this.A0A[i2].A0I() && (A05 = this.A0A[i2].A05()) != null) {
                                    arrayList.add(A05);
                                }
                                i2++;
                            } else {
                                Collections.sort(arrayList, C0842Jo.A01());
                                ArrayList arrayList2 = new ArrayList(arrayList.size());
                                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                    arrayList2.add(((C0842Jo) arrayList.get(i3)).A01);
                                }
                                return Collections.unmodifiableList(arrayList2);
                            }
                        }
                        throw new RuntimeException();
                    }

                    private void A02() {
                        if (this.A03 == null) {
                            return;
                        }
                        A07();
                        this.A03 = null;
                    }

                    private void A05() {
                        this.A07.A09(4);
                        int A04 = this.A07.A04(4);
                        this.A07.A09(2);
                        int column = this.A07.A04(6);
                        this.A02.A0A(A04, column);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:22:0x0119, code lost:
                        throw new java.lang.RuntimeException();
                     */
                    @RequiresNonNull({"currentDtvCcPacket"})
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private void A07() {
                        int A03;
                        int i2 = this.A03.A00;
                        int i3 = (this.A03.A01 * 2) - 1;
                        String A00 = A00(73, 13, 73);
                        if (i2 != i3) {
                            AbstractC04624g.A04(A00, A00(173, 39, 12) + ((this.A03.A01 * 2) - 1) + A00(50, 23, 92) + this.A03.A00 + A00(0, 18, 103) + this.A03.A02 + A00(48, 2, 123));
                        }
                        boolean z = false;
                        this.A07.A0E(this.A03.A03, this.A03.A00);
                        loop0: while (true) {
                            if (this.A07.A01() <= 0) {
                                break;
                            }
                            int A04 = this.A07.A04(3);
                            int command = this.A07.A04(5);
                            if (A04 == 7) {
                                this.A07.A09(2);
                                A04 = this.A07.A04(6);
                                if (A04 < 7) {
                                    AbstractC04624g.A07(A00, A00(399, 33, 52) + A04);
                                }
                            }
                            if (command == 0) {
                                if (A04 != 0) {
                                    AbstractC04624g.A07(A00, A00(472, 27, 83) + A04 + A00(27, 21, 86));
                                }
                            } else {
                                int i4 = this.A06;
                                int serviceNumber = A0C[5].charAt(13);
                                if (serviceNumber != 102) {
                                    break;
                                }
                                String[] strArr = A0C;
                                strArr[2] = "MRR8KxsQlbp3Ig";
                                strArr[7] = "Q";
                                if (A04 != i4) {
                                    C04764u c04764u = this.A07;
                                    int serviceNumber2 = A0C[0].charAt(19);
                                    if (serviceNumber2 != 78) {
                                        break;
                                    }
                                    A0C[0] = "hkixqgWbeZd8Awyy7Q6N0KpGxYgVXqbw";
                                    c04764u.A0A(command);
                                } else {
                                    C04764u c04764u2 = this.A07;
                                    int serviceNumber3 = A0C[6].length();
                                    if (serviceNumber3 != 3) {
                                        A0C[6] = "3dsCRaEhFxrSmzAmtZA59dB";
                                        A03 = c04764u2.A03() + (command * 8);
                                    } else {
                                        A0C[1] = "SHH7";
                                        A03 = c04764u2.A03() + (command * 6);
                                    }
                                    while (this.A07.A03() < A03) {
                                        int A042 = this.A07.A04(8);
                                        if (A042 != 16) {
                                            if (A042 <= 31) {
                                                A0A(A042);
                                            } else if (A042 <= 127) {
                                                A0F(A042);
                                                z = true;
                                            } else if (A042 <= 159) {
                                                A0B(A042);
                                                z = true;
                                            } else if (A042 <= 255) {
                                                A0G(A042);
                                                z = true;
                                            } else {
                                                AbstractC04624g.A07(A00, A00(351, 22, 6) + A042);
                                            }
                                        } else {
                                            C04764u c04764u3 = this.A07;
                                            int serviceNumber4 = A0C[5].charAt(13);
                                            if (serviceNumber4 != 102) {
                                                break loop0;
                                            }
                                            A0C[6] = "9u6P";
                                            int A043 = c04764u3.A04(8);
                                            if (A043 <= 31) {
                                                A0C(A043);
                                            } else if (A043 <= 127) {
                                                A0H(A043);
                                                z = true;
                                            } else if (A043 <= 159) {
                                                A0D(A043);
                                            } else if (A043 <= 255) {
                                                A0I(A043);
                                                z = true;
                                            } else {
                                                AbstractC04624g.A07(A00, A00(373, 26, 31) + A043);
                                            }
                                        }
                                    }
                                    continue;
                                }
                            }
                        }
                        if (z) {
                            this.A04 = A01();
                        }
                    }

                    private void A08() {
                        for (int i2 = 0; i2 < 8; i2++) {
                            this.A0A[i2].A08();
                        }
                    }

                    private void A0A(int i2) {
                        switch (i2) {
                            case 0:
                            case 14:
                                return;
                            case 3:
                                this.A04 = A01();
                                return;
                            case 8:
                                this.A02.A06();
                                return;
                            case 12:
                                A08();
                                return;
                            case 13:
                                C0843Jp c0843Jp = this.A02;
                                if (A0C[1].length() == 4) {
                                    A0C[4] = "FGYJlLquXUr7pMFj0Rb0j1D1hbYlwPR1";
                                    c0843Jp.A09('\n');
                                    return;
                                }
                                break;
                            default:
                                String A00 = A00(73, 13, 73);
                                if (i2 >= 17 && i2 <= 23) {
                                    AbstractC04624g.A07(A00, A00(86, 44, 84) + i2);
                                    this.A07.A09(8);
                                    return;
                                } else if (A0C[1].length() == 4) {
                                    A0C[0] = "tIivKyJ4yVQrhz6naHsNX4hATBwVD1SZ";
                                    if (i2 >= 24 && i2 <= 31) {
                                        AbstractC04624g.A07(A00, A00(130, 43, 23) + i2);
                                        this.A07.A09(16);
                                        return;
                                    }
                                    AbstractC04624g.A07(A00, A00(267, 20, 67) + i2);
                                    return;
                                }
                                break;
                        }
                        throw new RuntimeException();
                    }

                    private void A0B(int i2) {
                        C0843Jp c0843Jp;
                        switch (i2) {
                            case 128:
                            case 129:
                            case 130:
                            case 131:
                            case C3503Kz.V /* 132 */:
                            case C3503Kz.W /* 133 */:
                            case 134:
                            case 135:
                                int i3 = i2 - 128;
                                int window = this.A00;
                                if (window == i3) {
                                    return;
                                }
                                this.A00 = i3;
                                this.A02 = this.A0A[i3];
                                return;
                            case 136:
                                for (int i4 = 1; i4 <= 8; i4++) {
                                    boolean A0H = this.A07.A0H();
                                    if (A0C[4].charAt(20) != 'R') {
                                        A0C[4] = "wmiXxVCO1pDCphTe66oY7BPOwyAFxX93";
                                        if (!A0H) {
                                        }
                                        int i5 = 8 - i4;
                                        this.A0A[i5].A07();
                                    } else {
                                        A0C[3] = "RojSNoyJye4svFAgcf8I6qfTjBFYUXnP";
                                        if (!A0H) {
                                        }
                                        int i52 = 8 - i4;
                                        this.A0A[i52].A07();
                                    }
                                }
                                return;
                            case C3503Kz.a0 /* 137 */:
                                for (int i6 = 1; i6 <= 8; i6++) {
                                    if (this.A07.A0H()) {
                                        int i7 = 8 - i6;
                                        this.A0A[i7].A0E(true);
                                    }
                                }
                                return;
                            case 138:
                                for (int i8 = 1; i8 <= 8; i8++) {
                                    if (this.A07.A0H()) {
                                        int i9 = 8 - i8;
                                        this.A0A[i9].A0E(false);
                                    }
                                }
                                return;
                            case C3503Kz.c0 /* 139 */:
                                for (int i10 = 1; i10 <= 8; i10++) {
                                    if (this.A07.A0H()) {
                                        int i11 = 8 - i10;
                                        this.A0A[i11].A0E(!c0843Jp.A0I());
                                    }
                                }
                                return;
                            case C3503Kz.d0 /* 140 */:
                                for (int i12 = 1; i12 <= 8; i12++) {
                                    if (this.A07.A0H()) {
                                        int i13 = 8 - i12;
                                        this.A0A[i13].A08();
                                    }
                                }
                                return;
                            case C3503Kz.e0 /* 141 */:
                                C04764u c04764u = this.A07;
                                if (A0C[3].charAt(1) == 'o') {
                                    A0C[5] = "LOcI8geri01bbfSL3Un4ebrkDtb9fUkR";
                                    c04764u.A09(8);
                                    return;
                                }
                                break;
                            case C3503Kz.f0 /* 142 */:
                                return;
                            case C3503Kz.g0 /* 143 */:
                                A08();
                                return;
                            case C3503Kz.h0 /* 144 */:
                                boolean A0G = this.A02.A0G();
                                if (A0C[5].charAt(13) == 'f') {
                                    A0C[6] = "3SE5mdYm5uC9wCg4PrUGVOVOhS7UyufG";
                                    if (!A0G) {
                                        this.A07.A09(16);
                                        return;
                                    } else {
                                        A03();
                                        return;
                                    }
                                }
                                break;
                            case C3503Kz.i0 /* 145 */:
                                if (!this.A02.A0G()) {
                                    this.A07.A09(24);
                                    return;
                                } else {
                                    A04();
                                    return;
                                }
                            case C3503Kz.j0 /* 146 */:
                                if (!this.A02.A0G()) {
                                    this.A07.A09(16);
                                    return;
                                } else {
                                    A05();
                                    return;
                                }
                            case 147:
                            case o.DE.g /* 148 */:
                            case 149:
                            case 150:
                            default:
                                AbstractC04624g.A07(A00(73, 13, 73), A00(287, 20, 108) + i2);
                                return;
                            case C3503Kz.k0 /* 151 */:
                                if (!this.A02.A0G()) {
                                    this.A07.A09(32);
                                    return;
                                } else {
                                    A06();
                                    return;
                                }
                            case C3503Kz.l0 /* 152 */:
                            case C3503Kz.m0 /* 153 */:
                            case C3503Kz.n0 /* 154 */:
                            case 155:
                            case C3503Kz.p0 /* 156 */:
                            case C3503Kz.q0 /* 157 */:
                            case C3503Kz.r0 /* 158 */:
                            case 159:
                                int i14 = i2 - 152;
                                A0E(i14);
                                int window2 = this.A00;
                                if (window2 == i14) {
                                    return;
                                }
                                this.A00 = i14;
                                this.A02 = this.A0A[i14];
                                return;
                        }
                        throw new RuntimeException();
                    }

                    private void A0C(int i2) {
                        if (i2 <= 7) {
                            return;
                        }
                        if (i2 <= 15) {
                            this.A07.A09(8);
                        } else if (i2 <= 23) {
                            this.A07.A09(16);
                        } else if (i2 > 31) {
                        } else {
                            this.A07.A09(24);
                        }
                    }

                    private void A0D(int i2) {
                        if (i2 <= 135) {
                            this.A07.A09(32);
                        } else if (i2 <= 143) {
                            this.A07.A09(40);
                        } else if (i2 > 159) {
                        } else {
                            this.A07.A09(2);
                            int length = this.A07.A04(6);
                            this.A07.A09(length * 8);
                        }
                    }

                    private void A0F(int i2) {
                        if (i2 == 127) {
                            this.A02.A09((char) 9835);
                        } else {
                            this.A02.A09((char) (i2 & 255));
                        }
                    }

                    private void A0G(int i2) {
                        this.A02.A09((char) (i2 & 255));
                    }

                    private void A0H(int i2) {
                        switch (i2) {
                            case 32:
                                this.A02.A09(' ');
                                return;
                            case 33:
                                this.A02.A09(Hw2.g);
                                return;
                            case 37:
                                this.A02.A09(Hw2.F);
                                return;
                            case 42:
                                this.A02.A09((char) 352);
                                return;
                            case 44:
                                this.A02.A09((char) 338);
                                return;
                            case 48:
                                this.A02.A09((char) 9608);
                                return;
                            case 49:
                                this.A02.A09(Hw2.w);
                                return;
                            case 50:
                                C0843Jp c0843Jp = this.A02;
                                if (A0C[6].length() != 3) {
                                    A0C[1] = "dnPp";
                                    c0843Jp.A09(Hw2.x);
                                    return;
                                }
                                throw new RuntimeException();
                            case 51:
                                this.A02.A09(Hw2.z);
                                return;
                            case 52:
                                this.A02.A09(Hw2.A);
                                return;
                            case 53:
                                this.A02.A09(Hw2.E);
                                return;
                            case 57:
                                this.A02.A09(Hw2.J);
                                return;
                            case 58:
                                this.A02.A09((char) 353);
                                return;
                            case 60:
                                this.A02.A09((char) 339);
                                return;
                            case 61:
                                C0843Jp c0843Jp2 = this.A02;
                                if (A0C[0].charAt(19) == 'N') {
                                    A0C[6] = "g2xlw";
                                    c0843Jp2.A09((char) 8480);
                                    return;
                                }
                                break;
                            case 63:
                                this.A02.A09((char) 376);
                                return;
                            case 118:
                                this.A02.A09((char) 8539);
                                return;
                            case 119:
                                this.A02.A09((char) 8540);
                                return;
                            case 120:
                                this.A02.A09((char) 8541);
                                return;
                            case 121:
                                this.A02.A09((char) 8542);
                                return;
                            case 122:
                                C0843Jp c0843Jp3 = this.A02;
                                if (A0C[0].charAt(19) == 'N') {
                                    String[] strArr = A0C;
                                    strArr[2] = "AONnD2CR0STnJG";
                                    strArr[7] = "K";
                                    c0843Jp3.A09((char) 9474);
                                    return;
                                }
                                break;
                            case 123:
                                this.A02.A09((char) 9488);
                                return;
                            case 124:
                                this.A02.A09((char) 9492);
                                return;
                            case 125:
                                this.A02.A09((char) 9472);
                                return;
                            case 126:
                                this.A02.A09((char) 9496);
                                return;
                            case 127:
                                this.A02.A09((char) 9484);
                                return;
                            default:
                                AbstractC04624g.A07(A00(73, 13, 73), A00(307, 22, 52) + i2);
                                return;
                        }
                        throw new RuntimeException();
                    }

                    private void A0I(int i2) {
                        if (i2 == 160) {
                            this.A02.A09((char) 13252);
                            return;
                        }
                        AbstractC04624g.A07(A00(73, 13, 73), A00(329, 22, 4) + i2);
                        this.A02.A09('_');
                    }

                    @Override // com.facebook.ads.redexgen.X.C8M
                    public final /* bridge */ /* synthetic */ C8S A0W() throws C1974lj {
                        return super.A5r();
                    }

                    @Override // com.facebook.ads.redexgen.X.C8M
                    public final /* bridge */ /* synthetic */ C8P A0X() throws C1974lj {
                        return super.A5t();
                    }

                    @Override // com.facebook.ads.redexgen.X.C8M
                    public final C1972lh A0Z() {
                        this.A05 = this.A04;
                        return new C1972lh((List) AbstractC04543y.A01(this.A04));
                    }

                    @Override // com.facebook.ads.redexgen.X.C8M
                    public final /* bridge */ /* synthetic */ void A0a(C8S c8s) throws C1974lj {
                        super.AHJ(c8s);
                    }

                    @Override // com.facebook.ads.redexgen.X.C8M
                    public final void A0b(C8S c8s) {
                        ByteBuffer byteBuffer = (ByteBuffer) AbstractC04543y.A01(c8s.A02);
                        this.A08.A0j(byteBuffer.array(), byteBuffer.limit());
                        while (true) {
                            C04774v c04774v = this.A08;
                            if (A0C[3].charAt(1) != 'o') {
                                throw new RuntimeException();
                            }
                            A0C[5] = "2zTM8NXP9KhrrfnQUZAXf9x7h4oPwvMb";
                            if (c04774v.A07() >= 3) {
                                C04774v c04774v2 = this.A08;
                                if (A0C[6].length() == 3) {
                                    throw new RuntimeException();
                                }
                                A0C[5] = "a4C0oLfpRPdUSfve8yJk6dKzwRXOoh8W";
                                int A0I = c04774v2.A0I() & 7;
                                int i2 = A0I & 3;
                                boolean z = (A0I & 4) == 4;
                                byte A0I2 = (byte) this.A08.A0I();
                                byte A0I3 = (byte) this.A08.A0I();
                                if (i2 == 2 || i2 == 3) {
                                    if (z) {
                                        String A00 = A00(73, 13, 73);
                                        if (i2 == 3) {
                                            A02();
                                            int i3 = (A0I2 & C2638Cg0.o7) >> 6;
                                            int ccType = this.A01;
                                            if (ccType != -1 && i3 != (this.A01 + 1) % 4) {
                                                A08();
                                                AbstractC04624g.A07(A00, A00(432, 40, 91) + this.A01 + A00(18, 9, 122) + i3);
                                            }
                                            this.A01 = i3;
                                            int i4 = A0I2 & ED2.a;
                                            if (i4 == 0) {
                                                i4 = 64;
                                            }
                                            this.A03 = new C0844Jq(i3, i4);
                                            byte[] inputBufferData = this.A03.A03;
                                            C0844Jq c0844Jq = this.A03;
                                            int i5 = c0844Jq.A00;
                                            c0844Jq.A00 = i5 + 1;
                                            inputBufferData[i5] = A0I3;
                                        } else {
                                            AbstractC04543y.A07(i2 == 2);
                                            if (this.A03 == null) {
                                                AbstractC04624g.A05(A00, A00(212, 55, 85));
                                            } else {
                                                byte[] inputBufferData2 = this.A03.A03;
                                                String[] strArr = A0C;
                                                if (strArr[2].length() == strArr[7].length()) {
                                                    throw new RuntimeException();
                                                }
                                                A0C[4] = "YjvVjm4QPcLmngCUKURICEhYITyNXaIl";
                                                C0844Jq c0844Jq2 = this.A03;
                                                int i6 = c0844Jq2.A00;
                                                c0844Jq2.A00 = i6 + 1;
                                                inputBufferData2[i6] = A0I2;
                                                byte[] inputBufferData3 = this.A03.A03;
                                                C0844Jq c0844Jq3 = this.A03;
                                                int i7 = c0844Jq3.A00;
                                                c0844Jq3.A00 = i7 + 1;
                                                inputBufferData3[i7] = A0I3;
                                            }
                                        }
                                        if (this.A03.A00 == (this.A03.A01 * 2) - 1) {
                                            A02();
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                    }

                    @Override // com.facebook.ads.redexgen.X.C8M
                    public final boolean A0d() {
                        return this.A04 != this.A05;
                    }

                    @Override // com.facebook.ads.redexgen.X.C8M, com.facebook.ads.redexgen.X.AnonymousClass60
                    public final /* bridge */ /* synthetic */ void AHb() {
                        super.AHb();
                    }

                    @Override // com.facebook.ads.redexgen.X.C8M, com.facebook.ads.redexgen.X.InterfaceC1981lq
                    public final /* bridge */ /* synthetic */ void AJh(long j) {
                        super.AJh(j);
                    }

                    @Override // com.facebook.ads.redexgen.X.C8M, com.facebook.ads.redexgen.X.AnonymousClass60
                    public final void flush() {
                        super.flush();
                        this.A04 = null;
                        this.A05 = null;
                        this.A00 = 0;
                        this.A02 = this.A0A[this.A00];
                        A08();
                        this.A03 = null;
                    }
                };
            case '\t':
                final List<byte[]> list2 = c2242qI.A0X;
                return new C8T(list2) { // from class: com.facebook.ads.redexgen.X.1T
                    public static byte[] A01;
                    public final K2 A00;

                    static {
                        A01();
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    {
                        super(A00(0, 10, 35));
                        C04774v c04774v = new C04774v(list2.get(0));
                        this.A00 = new K2(c04774v.A0M(), c04774v.A0M());
                    }

                    public static String A00(int i2, int i3, int i4) {
                        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
                        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
                            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 106);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A01() {
                        A01 = new byte[]{-47, 3, -17, -47, -14, -16, -4, -15, -14, -1};
                    }

                    @Override // com.facebook.ads.redexgen.X.C8T
                    public final InterfaceC0837Jj A0g(byte[] bArr, int i2, boolean z) {
                        if (z) {
                            this.A00.A0J();
                        }
                        return new C1971lg(this.A00.A0I(bArr, i2));
                    }
                };
            case '\n':
                return new C8T() { // from class: com.facebook.ads.redexgen.X.1S
                    public static byte[] A04;
                    public static String[] A05 = {"76NlL2uX7lwdFYW1QMx5a8yy6e1HTIfb", "PPHM0li7JhLOVOPCGl5v88MgokGKQYEj", "LiwvhCZeMt7eMvNF2Pj8LYB8xSxq2ldh", "dFyDCM0ueCIxVfSox0aflDZ7gvAI841l", "LzKPlW0IyQE1s7YXIJw5EfFPQg4N9HTr", "CSOqnRNK1RYkqInl5L0si0E", "7S3a0phqj2SDINZS1RTIUWP", "6mBJEewaGVYJqmHVNKA"};
                    public Inflater A00;
                    public final C04774v A01;
                    public final C04774v A02;
                    public final K5 A03;

                    public static String A01(int i2, int i3, int i4) {
                        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
                        int i5 = 0;
                        while (true) {
                            int length = copyOfRange.length;
                            if (A05[2].charAt(24) != 'x') {
                                throw new RuntimeException();
                            }
                            String[] strArr = A05;
                            strArr[6] = "onjCODWUldEJohp5LCZVLSR";
                            strArr[5] = "Jw3HdCuNfu1JKaBA98S5ZsK";
                            if (i5 >= length) {
                                return new String(copyOfRange);
                            }
                            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 74);
                            i5++;
                        }
                    }

                    public static void A02() {
                        A04 = new byte[]{-79, -56, -44, -91, C2638Cg0.t7, -60, -48, C2638Cg0.s7, C2638Cg0.t7, -45};
                    }

                    static {
                        A02();
                    }

                    {
                        A01(0, 10, 23);
                        this.A01 = new C04774v();
                        this.A02 = new C04774v();
                        this.A03 = new K5();
                    }

                    public static C2192pT A00(C04774v c04774v, K5 k5) {
                        int limit = c04774v.A0A();
                        int nextSectionPosition = c04774v.A0I();
                        int sectionLength = c04774v.A0M();
                        int sectionType = c04774v.A09() + sectionLength;
                        if (sectionType > limit) {
                            c04774v.A0f(limit);
                            return null;
                        }
                        C2192pT c2192pT = null;
                        switch (nextSectionPosition) {
                            case 20:
                                k5.A02(c04774v, sectionLength);
                                break;
                            case 21:
                                k5.A00(c04774v, sectionLength);
                                break;
                            case 22:
                                k5.A01(c04774v, sectionLength);
                                break;
                            case 128:
                                c2192pT = k5.A06();
                                k5.A07();
                                break;
                        }
                        c04774v.A0f(sectionType);
                        return c2192pT;
                    }

                    private void A03(C04774v c04774v) {
                        if (c04774v.A07() > 0 && c04774v.A0B() == 120) {
                            if (this.A00 == null) {
                                this.A00 = new Inflater();
                            }
                            C04774v c04774v2 = this.A02;
                            Inflater inflater = this.A00;
                            if (A05[3].charAt(5) != 'M') {
                                throw new RuntimeException();
                            }
                            A05[2] = "qzpsP6hj6GdiA1o5yIc6icGGxX8HbfHZ";
                            if (C5C.A1D(c04774v, c04774v2, inflater)) {
                                c04774v.A0j(this.A02.A0l(), this.A02.A0A());
                            }
                        }
                    }

                    @Override // com.facebook.ads.redexgen.X.C8T
                    public final InterfaceC0837Jj A0g(byte[] bArr, int i2, boolean z) throws C1974lj {
                        this.A01.A0j(bArr, i2);
                        A03(this.A01);
                        this.A03.A07();
                        ArrayList arrayList = new ArrayList();
                        while (true) {
                            int A07 = this.A01.A07();
                            if (A05[7].length() != 19) {
                                throw new RuntimeException();
                            }
                            A05[7] = "qQU5NmoFNSXVl5etyHU";
                            if (A07 >= 3) {
                                C2192pT A00 = A00(this.A01, this.A03);
                                if (A00 != null) {
                                    arrayList.add(A00);
                                }
                            } else {
                                return new C1970lf(Collections.unmodifiableList(arrayList));
                            }
                        }
                    }
                };
            default:
                throw new IllegalArgumentException(A00(0, 50, 37));
        }
    }

    @Override // com.facebook.ads.redexgen.X.EP
    public final boolean AKN(C2242qI c2242qI) {
        String str = c2242qI.A0W;
        String mimeType = A00(236, 8, 34);
        if (!mimeType.equals(str)) {
            String mimeType2 = A00(244, 10, 53);
            if (!mimeType2.equals(str)) {
                String mimeType3 = A00(122, 20, 118);
                if (!mimeType3.equals(str)) {
                    String mimeType4 = A00(167, 21, 70);
                    if (!mimeType4.equals(str)) {
                        String mimeType5 = A00(216, 20, 127);
                        if (!mimeType5.equals(str)) {
                            String mimeType6 = A00(Xu2.A, 28, 65);
                            if (!mimeType6.equals(str)) {
                                String mimeType7 = A00(50, 19, 111);
                                if (!mimeType7.equals(str)) {
                                    String mimeType8 = A00(C3503Kz.f0, 25, 115);
                                    if (!mimeType8.equals(str)) {
                                        String mimeType9 = A00(69, 19, 10);
                                        if (!mimeType9.equals(str)) {
                                            String mimeType10 = A00(88, 19, 24);
                                            if (!mimeType10.equals(str)) {
                                                String mimeType11 = A00(107, 15, 54);
                                                if (!mimeType11.equals(str)) {
                                                    return false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
