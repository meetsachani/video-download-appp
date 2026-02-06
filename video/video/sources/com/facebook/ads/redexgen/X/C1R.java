package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C10323vs;
import o.C2638Cg0;
import o.C3307Iz;
import o.C3503Kz;
import o.C8077mf;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.1R  reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1R extends C8T {
    public static byte[] A05;
    public static String[] A06 = {"W2LX5ghCjNUdHPD6UOG9gNVP2r8Jjr9N", "hy0Kd51hxMRklx2U40MO6uTjDebxbFFc", "3rXKYQ25IDS9XLMelMDoz8fDuc1jWejt", "VHZF6nyXCVj1GWlzSFxOxU8Mk9", "1hZxQPwvp7yuSjm13xBtOFGqAv7wvaBL", "2txr67moghbeiUbFZCBGyiXHK8tBuFWn", "gHf8B0vtrS2LcJp", "q573XCdkPfkFHQHQX29TvMro8DPY3qfe"};
    public static final Pattern A07;
    public float A00;
    public float A01;
    public Map<String, KC> A02;
    public final K7 A03;
    public final boolean A04;

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 4);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A05 = new byte[]{85, C3307Iz.Z, 48, 53, C3307Iz.Z, 83, 107, 36, C3307Iz.Y, 53, C3307Iz.Y, 48, C3307Iz.Z, 83, 107, 36, C3307Iz.Y, 53, C3307Iz.Z, 83, 107, 36, C3307Iz.Y, 84, 53, C3307Iz.V, 82, C3307Iz.Z, 83, 107, 36, C3307Iz.Y, 75, 35, 52, C8077mf.C, 17, 28, 31, C8077mf.A, 5, C8077mf.y, 74, 75, 98, Byte.MAX_VALUE, 96, 108, 121, 55, 101, 93, 95, 70, 70, 95, 88, 81, C8077mf.z, 17, 101, 66, 79, 90, 83, C8077mf.n, 17, C8077mf.z, 90, 95, 88, 83, C8077mf.z, 84, 83, 80, 89, 68, 83, C8077mf.z, 17, 112, 89, 68, 91, 87, 66, C8077mf.n, 17, C8077mf.z, 90, 95, 88, 83, C8077mf.n, C8077mf.z, C3307Iz.X, C8077mf.G, 31, 6, 6, 31, C8077mf.B, 17, 86, C8077mf.u, 31, C8077mf.A, C8077mf.D, C8077mf.C, 17, 3, 19, 86, C8077mf.D, 31, C8077mf.B, 19, 86, C8077mf.x, 19, C8077mf.r, C8077mf.C, 4, 19, 86, C8077mf.y, C8077mf.C, C8077mf.E, 6, C8077mf.D, 19, 2, 19, 86, C8077mf.r, C8077mf.C, 4, C8077mf.E, C8077mf.A, 2, 76, 86, 53, 13, C8077mf.q, C8077mf.z, C8077mf.z, C8077mf.q, 8, 1, 70, 2, C8077mf.q, 7, 10, 9, 1, 19, 3, 70, 10, C8077mf.q, 8, 3, 70, 17, C8077mf.q, C8077mf.u, C8077mf.p, 70, 0, 3, 17, 3, C8077mf.x, 70, 5, 9, 10, 19, C8077mf.m, 8, C8077mf.y, 70, C8077mf.u, C8077mf.p, 7, 8, 70, 0, 9, C8077mf.x, C8077mf.m, 7, C8077mf.u, 92, 70, 66, 122, QC1.w, 97, 97, QC1.w, Byte.MAX_VALUE, 118, 49, QC1.w, Byte.MAX_VALUE, 103, 112, 125, QC1.w, 117, 49, 101, QC1.w, 124, QC1.w, Byte.MAX_VALUE, 118, C3307Iz.c0, 49, 101, 69, 87, 114, 83, 85, 89, 82, 83, 68, 36, 3, C8077mf.p, C8077mf.E, C8077mf.u, 77, C3307Iz.e0, C8077mf.z, 19, C8077mf.z, C8077mf.A, C8077mf.q, C8077mf.z, 88, C8077mf.C, C8077mf.x, 17, 31, C8077mf.z, C8077mf.y, C8077mf.G, C8077mf.z, C8077mf.n, 66, 88, 40, 54, 5, C8077mf.z, C8077mf.G, 7, 0, C3307Iz.f0, 94, 86, 102, 119, 108, 117, 113, C3307Iz.X, 76, 107, 99, 106, 88, 13, 0, 98, 118, 5, 34, 47, 58, 51, C3307Iz.X, C8077mf.m, 124, 113, 19, 7, 116, 83, 94, 75, 66, 84, 122, 7, 70, 85, 66, 7, 73, 72, 83, 7, 84, 82, 87, 87, 72, 85, 83, 66, 67, 75, 70, 36, 59, 48, 67, 100, 105, 124, 117, 99, 77, 92, 78, 5, 49, 108, 94, 5, C8077mf.C, C8077mf.x, C8077mf.n, 7, C8077mf.r, 6, 13, 94, 66, 79, 87, 92, 75, 93, 87, -72, C2638Cg0.B7};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0D(String str, K7 k7, List<List<C2192pT>> list, List<Long> list2) {
        String A072 = A07(34, 9, 116);
        AbstractC04543y.A07(str.startsWith(A072));
        String[] split = str.substring(A072.length()).split(A07(32, 1, 99), k7.A01);
        int length = split.length;
        int i = k7.A01;
        String A073 = A07(223, 10, 50);
        if (length != i) {
            AbstractC04624g.A07(A073, A07(C3503Kz.g0, 55, 98) + str);
            return;
        }
        long A04 = A04(split[k7.A02]);
        String A074 = A07(198, 25, 21);
        if (A04 == C10323vs.b) {
            AbstractC04624g.A07(A073, A074 + str);
            return;
        }
        long A042 = A04(split[k7.A00]);
        if (A042 == C10323vs.b) {
            AbstractC04624g.A07(A073, A074 + str);
            return;
        }
        KC kc = (this.A02 == null || k7.A03 == -1) ? null : this.A02.get(split[k7.A03].trim());
        String str2 = split[k7.A04];
        K9 A02 = K9.A02(str2);
        String A043 = K9.A04(str2);
        String A075 = A07(331, 2, 4);
        String A076 = A07(0, 1, 91);
        C2192pT A062 = A06(A043.replace(A075, A076).replace(A07(335, 2, 52), A076).replace(A07(333, 2, 93), A07(353, 2, 126)), kc, A02, this.A01, this.A00);
        int A03 = A03(A042, list2, list);
        for (int A032 = A03(A04, list2, list); A032 < A03; A032++) {
            list.get(A032).add(A062);
        }
    }

    static {
        A09();
        A07 = Pattern.compile(A07(1, 31, 11));
    }

    public C1R() {
        this(null);
    }

    public C1R(List<byte[]> list) {
        super(A07(223, 10, 50));
        this.A01 = -3.4028235E38f;
        this.A00 = -3.4028235E38f;
        if (list != null && !list.isEmpty()) {
            this.A04 = true;
            String A0q = C5C.A0q(list.get(0));
            String formatLine = A07(43, 7, 9);
            AbstractC04543y.A07(A0q.startsWith(formatLine));
            this.A03 = (K7) AbstractC04543y.A01(K7.A00(A0q));
            A0A(new C04774v(list.get(1)));
            return;
        }
        this.A04 = false;
        this.A03 = null;
    }

    public static float A00(int i) {
        switch (i) {
            case 0:
                return 0.05f;
            case 1:
                return 0.5f;
            case 2:
                return 0.95f;
            default:
                return -3.4028235E38f;
        }
    }

    public static int A01(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                AbstractC04624g.A07(A07(223, 10, 50), A07(239, 19, 124) + i);
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                if (A06[3].length() != 26) {
                    throw new RuntimeException();
                }
                A06[6] = "Sg07jKGUv12uLKgMKKFA3fI9zPLxcTEi";
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    public static int A02(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                AbstractC04624g.A07(A07(223, 10, 50), A07(239, 19, 124) + i);
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                if (A06[3].length() != 26) {
                    throw new RuntimeException();
                }
                String[] strArr = A06;
                strArr[5] = "bBVjASvxGIVEucqGKWBeREj1nHP5tR7K";
                strArr[4] = "afA0CT9VteApb4cGitBpBAxXonSmRtRK";
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
        r8.add(r3, java.lang.Long.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r3 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        r1 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
        r9.add(r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
        r0 = r3 - 1;
        r1 = new java.util.ArrayList(r9.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A03(long j, List<Long> list, List<List<C2192pT>> list2) {
        int i = 0;
        int insertionIndex = list.size();
        int i2 = insertionIndex - 1;
        while (true) {
            if (i2 < 0) {
                break;
            }
            int i3 = (list.get(i2).longValue() > j ? 1 : (list.get(i2).longValue() == j ? 0 : -1));
            int i4 = A06[7].charAt(28);
            if (i4 == 116) {
                throw new RuntimeException();
            }
            A06[7] = "L6yhcoI2CoUL0EEbj8PtMmDYbUY1DBiP";
            if (i3 == 0) {
                return i2;
            }
            int insertionIndex2 = (list.get(i2).longValue() > j ? 1 : (list.get(i2).longValue() == j ? 0 : -1));
            if (insertionIndex2 < 0) {
                i = i2 + 1;
                break;
            }
            i2--;
        }
    }

    public static long A04(String str) {
        Matcher matcher = A07.matcher(str.trim());
        if (!matcher.matches()) {
            return C10323vs.b;
        }
        return (Long.parseLong((String) C5C.A0f(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) C5C.A0f(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) C5C.A0f(matcher.group(3))) * 1000000) + (Long.parseLong((String) C5C.A0f(matcher.group(4))) * 10000);
    }

    public static Layout.Alignment A05(int i) {
        switch (i) {
            case -1:
                return null;
            case 0:
            default:
                AbstractC04624g.A07(A07(223, 10, 50), A07(239, 19, 124) + i);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    public static C2192pT A06(String str, KC kc, K9 k9, float f, float f2) {
        int i;
        SpannableString spannableString = new SpannableString(str);
        C04443o A0G = new C04443o().A0G(spannableString);
        if (kc != null) {
            if (kc.A04 != null) {
                spannableString.setSpan(new ForegroundColorSpan(kc.A04.intValue()), 0, spannableString.length(), 33);
            }
            if (kc.A02 == 3 && kc.A03 != null) {
                spannableString.setSpan(new BackgroundColorSpan(kc.A03.intValue()), 0, spannableString.length(), 33);
            }
            if (kc.A00 != -3.4028235E38f) {
                int i2 = (f2 > (-3.4028235E38f) ? 1 : (f2 == (-3.4028235E38f) ? 0 : -1));
                if (A06[3].length() != 26) {
                    throw new RuntimeException();
                }
                String[] strArr = A06;
                strArr[5] = "hamZaHHK5iJw0vPowwB4Xi3W6GQULYkl";
                strArr[4] = "AtQHcqF1nJuVU9oQ1sBsNKUnqzSBt8ub";
                if (i2 != 0) {
                    A0G.A08(kc.A00 / f2, 1);
                }
            }
            if (kc.A06 && kc.A07) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (kc.A06) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (kc.A07) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (kc.A09) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (kc.A08) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i3 = k9.A00;
        if (A06[6].length() != 19) {
            A06[7] = "i2mc5u7bs2HiiqvdNfcyeR2hNUTbHa8c";
            if (i3 != -1) {
                i = k9.A00;
            } else if (kc != null) {
                i = kc.A01;
            } else {
                i = -1;
            }
            C04443o cue = A0G.A0F(A05(i));
            cue.A0A(A02(i)).A09(A01(i));
            if (k9.A01 != null && f2 != -3.4028235E38f && f != -3.4028235E38f) {
                A0G.A04(k9.A01.x / f);
                A0G.A07(k9.A01.y / f2, 0);
            } else {
                A0G.A04(A00(A0G.A01()));
                A0G.A07(A00(A0G.A00()), 0);
            }
            return A0G.A0H();
        }
        throw new RuntimeException();
    }

    public static Map<String, KC> A08(C04774v c04774v) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        K8 k8 = null;
        while (true) {
            String A0T = c04774v.A0T();
            if (A0T == null || (c04774v.A07() != 0 && c04774v.A0B() == 91)) {
                break;
            } else if (A0T.startsWith(A07(43, 7, 9))) {
                k8 = K8.A00(A0T);
            } else if (A0T.startsWith(A07(233, 6, 115))) {
                if (k8 == null) {
                    String currentLine = A07(50, 46, 50) + A0T;
                    AbstractC04624g.A07(A07(223, 10, 50), currentLine);
                } else {
                    KC A04 = KC.A04(A0T, k8);
                    if (A04 != null) {
                        linkedHashMap.put(A04.A05, A04);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private void A0A(C04774v c04774v) {
        while (true) {
            String A0T = c04774v.A0T();
            if (A0T != null) {
                if (A07(266, 13, 1).equalsIgnoreCase(A0T)) {
                    A0B(c04774v);
                } else if (A07(319, 12, 20).equalsIgnoreCase(A0T)) {
                    this.A02 = A08(c04774v);
                } else if (A07(279, 11, 82).equalsIgnoreCase(A0T)) {
                    AbstractC04624g.A06(A07(223, 10, 50), A07(290, 29, 35));
                } else if (A07(258, 8, 119).equalsIgnoreCase(A0T)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
        if (r5.equals(A07(345, 8, 31)) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
        if (r5.equals(A07(345, 8, 42)) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
        if (r5.equals(A07(337, 8, 113)) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0B(C04774v c04774v) {
        while (true) {
            String A0T = c04774v.A0T();
            if (A0T != null) {
                if (c04774v.A07() == 0 || c04774v.A0B() != 91) {
                    String[] split = A0T.split(A07(33, 1, 29));
                    if (split.length == 2) {
                        char c = 0;
                        String A01 = AbstractC1877k7.A01(split[0].trim());
                        String currentLine = A06[7];
                        if (currentLine.charAt(28) != 't') {
                            String[] strArr = A06;
                            strArr[5] = "TxjPtR6Me2tOCH56RvBuXVxOpTFPkhKs";
                            strArr[4] = "CGC80sv4xmOos6ad3yBESqJRjeXwJGgE";
                            switch (A01.hashCode()) {
                                case 1879649548:
                                    break;
                                case 1879649549:
                                    String currentLine2 = A06[0];
                                    if (currentLine2.charAt(2) == 'L') {
                                        A06[3] = "57knmpqjR0Ls81goizN6npBH6l";
                                        break;
                                    } else {
                                        String[] strArr2 = A06;
                                        strArr2[5] = "y7TEYh3wOWaLWgkmzZBlA5JQj6rjOZZg";
                                        strArr2[4] = "3gq1Vhf6xja9YBkNvRBFSeYMsj86kNRf";
                                        break;
                                    }
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    this.A01 = Float.parseFloat(split[1].trim());
                                    continue;
                                case 1:
                                    try {
                                        this.A00 = Float.parseFloat(split[1].trim());
                                        continue;
                                    } catch (NumberFormatException unused) {
                                        break;
                                    }
                            }
                        } else {
                            throw new RuntimeException();
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private void A0C(C04774v c04774v, List<List<C2192pT>> list, List<Long> list2) {
        K7 k7 = this.A04 ? this.A03 : null;
        while (true) {
            String A0T = c04774v.A0T();
            if (A0T != null) {
                if (A0T.startsWith(A07(43, 7, 9))) {
                    k7 = K7.A00(A0T);
                } else if (A0T.startsWith(A07(34, 9, 116))) {
                    if (k7 == null) {
                        AbstractC04624g.A07(A07(223, 10, 50), A07(96, 47, 114) + A0T);
                    } else {
                        A0D(A0T, k7, list, list2);
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C8T
    public final InterfaceC0837Jj A0g(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C04774v c04774v = new C04774v(bArr, i);
        if (!this.A04) {
            A0A(c04774v);
        }
        A0C(c04774v, arrayList, arrayList2);
        return new C1969le(arrayList, arrayList2);
    }
}
