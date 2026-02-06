package com.facebook.ads.redexgen.X;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.facebook.ads.androidx.media3.common.ColorInfo;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;
import o.InterfaceC8148mw2;
import o.QC1;

/* loaded from: assets/audience_network/classes2.dex */
public final class B3 {
    public static byte[] A0B;
    public static String[] A0C = {"I9JaO4heFf5nDgSUvVeAxAeOAdbY1nhs", "PVSEhsxK0zpzpXeziFZITHKDYbLYMlXw", "qlK6yxEC", "9zKWhcki2UyQZLYGzaAyWcMw08QqvpbN", "JlMwKIWIzkUyHhMRK", "e8OveLjqyhc2hkEtyY01o7K", "DY1oAH7PrQgT6IVPSHYZAZf9F8l8uJ13", "bCAM9BCoFLqZyqtmC8leb"};
    public final MediaCodecInfo.CodecCapabilities A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 26);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0B = new byte[]{73, C8077mf.G, 6, 73, C8077mf.G, 17, 65, 77, 54, C3307Iz.f0, 48, 2, 2, 4, 28, C8077mf.x, C8077mf.y, 60, C8077mf.r, 9, 50, C8077mf.C, C8077mf.r, 31, 31, C8077mf.x, C8077mf.G, 48, C8077mf.y, C8077mf.E, 4, 2, 5, 28, C8077mf.x, 31, 5, 75, 81, C8077mf.p, 60, 60, 58, 34, 42, C3307Iz.c0, 28, 58, ED2.a, ED2.a, 32, C4715Xk.i, 59, 111, C8077mf.x, 19, 58, 49, 48, C3307Iz.a0, 48, Byte.MAX_VALUE, C8077mf.m, C8077mf.G, 114, 7, 105, 111, 106, 98, 75, 64, 65, 88, 65, C8077mf.p, 122, 108, 3, 118, C8077mf.B, C8077mf.H, C8077mf.B, 86, Byte.MAX_VALUE, 116, 117, 108, 117, 58, 78, 88, 55, 66, C3307Iz.d0, C3307Iz.c0, C3307Iz.d0, 52, 28, C8077mf.G, C8077mf.r, C8077mf.B, 58, C8077mf.z, C8077mf.G, 28, C8077mf.D, 48, C8077mf.A, 31, C8077mf.z, 28, 55, 42, C3307Iz.Z, C3307Iz.V, 114, 99, 98, 126, 95, 99, 69, 64, 64, 95, 66, 68, C8077mf.r, 107, C8077mf.m, 0, C8077mf.z, C8077mf.m, 13, 0, 105, 28, 17, 119, 32, 34, 55, 65, 42, C8077mf.A, C8077mf.z, 1, 0, 28, 65, C3307Iz.f0, 57, C3307Iz.d0, 65, C3307Iz.c0, 10, C8077mf.n, 0, C8077mf.m, 10, C8077mf.G, 31, C8077mf.G, 8, 126, C8077mf.y, 40, C3307Iz.a0, 62, ED2.a, 35, 126, 17, 6, 19, 126, C8077mf.x, 53, 51, ED2.a, 52, 53, 34, 126, 35, 53, 51, C3307Iz.X, 34, 53, 84, 86, 67, 53, 86, 90, 73, 77, 94, 87, 87, 53, 77, 82, 95, 94, 84, 53, 83, 76, 53, 88, 84, 95, 90, C3307Iz.d0, C3307Iz.f0, 47, C3307Iz.a0, 95, 94, 88, 84, 95, 94, 73, C8077mf.m, 9, 28, 106, 9, C8077mf.r, C8077mf.q, 106, C8077mf.u, 13, 0, 1, C8077mf.m, 106, 0, 1, 7, C8077mf.m, 0, 1, C8077mf.z, 106, C8077mf.n, 1, C8077mf.u, 7, C8077mf.r, C8077mf.p, 110, C8077mf.A, 113, 112, 115, C8077mf.q, 102, C8077mf.E, 96, 90, 95, 90, 75, 79, 82, 77, 94, C8077mf.z, 75, 87, 90, 66, 89, 90, 88, 80, C8077mf.G, 9, C8077mf.B, C8077mf.y, 19, 83, 79, C8077mf.E, C8077mf.n, C8077mf.n, 74, 94, 79, 66, 68, 4, 74, 72, C8077mf.B, 110, 122, 107, 102, 96, 32, 110, 98, 125, 34, QC1.w, 109, C3307Iz.d0, 56, C3307Iz.a0, 36, 34, 98, 40, C3307Iz.d0, C3307Iz.f0, 126, 7, 19, 2, C8077mf.q, 9, 73, 0, 10, 7, 5, Byte.MAX_VALUE, 107, 122, 119, 113, 49, 121, C3307Iz.a0, 47, 47, 51, Byte.MAX_VALUE, 114, Byte.MAX_VALUE, 105, 42, 62, 47, 34, 36, 100, C3307Iz.d0, 124, 122, 122, 102, C3307Iz.Y, C3307Iz.Z, 42, 60, C8077mf.B, C8077mf.n, C8077mf.G, C8077mf.r, C8077mf.z, 86, C8077mf.H, 10, C8077mf.x, 78, 90, 75, 70, 64, 0, 66, 95, C8077mf.E, 78, 2, 67, 78, 91, 66, 85, 65, 80, 93, 91, C8077mf.E, 89, 68, 81, 83, 79, 91, 74, 71, 65, 1, 65, 94, 91, 93, 84, 64, 81, 92, 90, C8077mf.D, 71, 84, 66, 111, 123, 106, 103, 97, C3307Iz.V, QC1.w, 97, 124, 108, 103, 125, 126, 115, 110, 121, 125, 112, 5, C8077mf.p, 7, 8, 8, 3, 10, C3307Iz.X, 9, 19, 8, C8077mf.u, 72, 7, C3307Iz.X, 7, C8077mf.z, C8077mf.y, 66, 73, 64, 79, 79, 68, 77, 98, 78, 84, 79, 85, C8077mf.q, 66, 64, 81, 82, 55, 60, 53, 58, 58, 49, 56, C8077mf.A, 59, C3307Iz.V, 58, 32, 122, C3307Iz.Z, C3307Iz.V, 36, 36, 59, C3307Iz.Y, 32, QC1.w, 116, 53, 57, 50, 51, 53, QC1.w, 59, ED2.a, 59, 51, 118, 107, 103, 108, 109, 107, C3307Iz.Y, QC1.w, 122, 103, 110, 97, 100, 109, 68, 109, 126, 109, 100, 36, 40, 126, 114, 97, Byte.MAX_VALUE, 122, 125, 36, 42, ED2.a, 124, 40, 87, 69, 70, 86, 77, 74, 69, 77, 95, 87, 82, 88, 87, 77, 86, 49, 35, 47, 50, C3307Iz.f0, C3307Iz.Z, C8077mf.r, 35, 54, C3307Iz.Z, 108, 35, 1, 35, 50, 49, 109, Byte.MAX_VALUE, 115, 110, 114, 123, 76, Byte.MAX_VALUE, 106, 123, 48, 125, Byte.MAX_VALUE, 110, 109, 2, C8077mf.r, 28, 1, C8077mf.G, C8077mf.x, 35, C8077mf.r, 5, C8077mf.x, 95, 2, 4, 1, 1, C8077mf.H, 3, 5, 93, 81, 1, C8077mf.A, 17, 7, 0, C8077mf.A, 95, 2, C8077mf.H, 19, C8077mf.m, C8077mf.r, 19, 17, C8077mf.C, 102, 124, 111, 112, 84, 123, 113, 71, 116, 97, 112, 59, 118, 116, 101, 102, 64, 90, 73, 86, 114, 93, 87, 97, 82, 71, 86, C8077mf.G, 80, 92, 69, 86, 65, 31, 19, 108, 118, 101, 122, 94, 113, 123, 77, 126, 107, 122, 49, 109, 112, 107, 126, 107, 122, 123, 51, ED2.a, C8077mf.B, 2, 17, C8077mf.p, 42, 5, C8077mf.q, 57, 10, 31, C8077mf.p, 69, C8077mf.B, C8077mf.H, C8077mf.E, C8077mf.E, 4, C8077mf.C, 31, 71, 75, 100, 126, 109, 114, 86, 121, 115, 69, 118, 99, 114, 57, 97, 84, 118, 103, 100, 4, 5, C8077mf.H, C8077mf.H, C8077mf.y, 28, C8077mf.y, C8077mf.x, 93, 0, 28, 17, 9, C8077mf.u, 17, 19, C8077mf.E, 48, 47, 34, 35, C3307Iz.a0, 105, C3307Iz.Z, 48, C3307Iz.X, 114, 109, 96, 97, 107, C3307Iz.c0, 96, 107, 104, 102, 125, C3307Iz.a0, 114, 109, 119, 109, 107, 106, C8077mf.y, 10, 7, 6, C8077mf.n, 76, C8077mf.m, 6, C8077mf.y, 0, 82, 77, 64, 65, 75, C8077mf.m, 92, 9, 82, 74, 64, 10, 75, 74, C8077mf.z, 10, 82, 84, C8077mf.G, 92};
    }

    static {
        A04();
    }

    public B3(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A03 = (String) AbstractC04543y.A01(str);
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = codecCapabilities;
        this.A05 = z;
        this.A07 = z2;
        this.A09 = z3;
        this.A04 = z4;
        this.A08 = z5;
        this.A06 = z6;
        this.A0A = C3J.A0F(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ce, code lost:
        if (A03(332, 15, 4).equals(r6) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00de, code lost:
        if (A03(347, 15, 81).equals(r6) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ee, code lost:
        if (A03(362, 9, 99).equals(r6) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0108, code lost:
        if (A03(332, 15, 4).equals(r6) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0119, code lost:
        if (A03(291, 9, 49).equals(r6) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011b, code lost:
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011c, code lost:
        com.facebook.ads.redexgen.X.AbstractC04624g.A07(A03(97, 14, 99), A03(10, 29, 107) + r5 + A03(6, 3, 119) + r7 + A03(0, 4, 115) + r4 + A03(260, 1, 72));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0171, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0180, code lost:
        if (A03(312, 10, 87).equals(r6) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0182, code lost:
        r4 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0185, code lost:
        r4 = 30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A00(String str, String str2, int i) {
        if (i > 1 || (C5C.A02 >= 26 && i > 0)) {
            return i;
        }
        if (!A03(386, 10, 46).equals(str2) && !A03(281, 10, 102).equals(str2) && !A03(300, 12, 21).equals(str2) && !A03(371, 15, 53).equals(str2) && !A03(415, 12, 20).equals(str2) && !A03(396, 10, 52).equals(str2)) {
            String A03 = A03(406, 9, 47);
            String[] strArr = A0C;
            if (strArr[6].charAt(25) != strArr[3].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[7] = "P3L7eJR7rcEs8Hcud8b0q";
            strArr2[5] = "gztvffw6orscNCYhET6gtHo";
            if (!A03.equals(str2) && !A03(322, 10, 124).equals(str2)) {
                if (A0C[0].charAt(21) == 'A') {
                    String[] strArr3 = A0C;
                    strArr3[6] = "8EyIo3AmLznCqcE1QD1Y0pSK088XgXR2";
                    strArr3[3] = "dhhtuZGj1yFwqgsK2BE3ZfBkQ801LDWI";
                }
            }
        }
        return i;
    }

    public static Point A01(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int heightAlignment = videoCapabilities.getWidthAlignment();
        int widthAlignment = videoCapabilities.getHeightAlignment();
        return new Point(C5C.A05(i, heightAlignment) * heightAlignment, C5C.A05(i2, widthAlignment) * widthAlignment);
    }

    public static B3 A02(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        if (!z4 && codecCapabilities != null) {
            boolean A09 = A09(codecCapabilities);
            if (A0C[2].length() != 8) {
                throw new RuntimeException();
            }
            A0C[2] = "xqlBNWNY";
            if (A09 && !A0J(str)) {
                z6 = true;
                return new B3(str, str2, str3, codecCapabilities, z, z2, z3, z6, codecCapabilities == null && A0D(codecCapabilities), !z5 || (codecCapabilities != null && A0B(codecCapabilities)));
            }
        }
        z6 = false;
        return new B3(str, str2, str3, codecCapabilities, z, z2, z3, z6, codecCapabilities == null && A0D(codecCapabilities), !z5 || (codecCapabilities != null && A0B(codecCapabilities)));
    }

    private void A05(String str) {
        StringBuilder append = new StringBuilder().append(A03(39, 16, 85)).append(str);
        String A03 = A03(261, 3, 33);
        AbstractC04624g.A04(A03(97, 14, 99), append.append(A03).append(this.A03).append(A03(4, 2, 43)).append(this.A02).append(A03).append(C5C.A04).append(A03(260, 1, 72)).toString());
    }

    private void A06(String str) {
        StringBuilder append = new StringBuilder().append(A03(119, 11, 42)).append(str);
        String A03 = A03(261, 3, 33);
        AbstractC04624g.A04(A03(97, 14, 99), append.append(A03).append(this.A03).append(A03(4, 2, 43)).append(this.A02).append(A03).append(C5C.A04).append(A03(260, 1, 72)).toString());
    }

    public static boolean A07() {
        return C5C.A03.equals(A03(532, 7, 62)) || C5C.A03.equals(A03(427, 6, 6)) || C5C.A06.startsWith(A03(55, 14, 69)) || C5C.A06.startsWith(A03(69, 14, 52)) || C5C.A06.startsWith(A03(83, 14, 0));
    }

    public static boolean A09(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C5C.A02 >= 19 && A0A(codecCapabilities);
    }

    public static boolean A0A(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(264, 17, 33));
    }

    public static boolean A0B(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C5C.A02 >= 21 && A0C(codecCapabilities);
    }

    public static boolean A0C(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(598, 15, 104));
    }

    public static boolean A0D(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C5C.A02 >= 21 && A0E(codecCapabilities);
    }

    public static boolean A0E(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(InterfaceC8148mw2.h.q, 17, 106));
    }

    public static boolean A0F(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point alignedSize = A01(videoCapabilities, i, i2);
        int i3 = alignedSize.x;
        int i4 = alignedSize.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D46258033: [FBLite][Video] Solve tasks T154141530 T154151746 gating the call for SDK >=21")
    private boolean A0G(C2242qI c2242qI, boolean z) {
        Pair<Integer, Integer> A0B2 = C0624Ba.A0B(c2242qI);
        if (A0B2 == null) {
            return true;
        }
        Integer num = (Integer) A0B2.first;
        String[] strArr = A0C;
        if (strArr[6].charAt(25) == strArr[3].charAt(25)) {
            A0C[2] = "XFIr8RM8";
            int intValue = num.intValue();
            int level = ((Integer) A0B2.second).intValue();
            if (A03(733, 18, 30).equals(c2242qI.A0W)) {
                if (A03(724, 9, 92).equals(this.A02)) {
                    intValue = 8;
                    level = 0;
                } else if (A03(751, 10, 121).equals(this.A02)) {
                    intValue = 2;
                    level = 0;
                }
            }
            if (!this.A0A) {
                if (A0C[2].length() == 8) {
                    A0C[4] = "U7uwaC6XnAT7ItuO5";
                    if (intValue != 42) {
                        return true;
                    }
                }
            }
            if (A0V().length <= 0) {
                return true;
            }
            MediaCodecInfo.CodecProfileLevel[] A0V = A0V();
            if (C5C.A02 >= 21 && C5C.A02 <= 23) {
                if (A03(761, 19, 62).equals(this.A02) && A0V.length == 0) {
                    A0V = A0M(this.A00);
                }
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : A0V) {
                if (codecProfileLevel.profile == intValue) {
                    int i = codecProfileLevel.level;
                    if (A0C[0].charAt(21) == 'A') {
                        A0C[1] = "Tk1KZqXmKjuSsbjIU3mgahSyAhYoMHEk";
                        if (i >= level || !z) {
                            boolean A0L = A0L(this.A02, intValue);
                            if (A0C[1].charAt(21) != 'k') {
                                A0C[0] = "B6qJQnb2cEtex6AQnXMJ6AJyRiBsPuck";
                                if (!A0L) {
                                    return true;
                                }
                            } else if (!A0L) {
                                return true;
                            }
                        }
                    }
                }
            }
            A06(A03(InterfaceC8148mw2.g.i, 20, 18) + c2242qI.A0R + A03(4, 2, 43) + this.A01);
            return false;
        }
        throw new RuntimeException();
    }

    public static boolean A0H(String str) {
        return A03(396, 10, 52).equals(str);
    }

    public static boolean A0I(String str) {
        return C5C.A06.startsWith(A03(253, 7, 89)) && A03(191, 36, 1).equals(str);
    }

    public static boolean A0J(String str) {
        if (C5C.A02 <= 22) {
            if ((A03(130, 10, 94).equals(C5C.A06) || A03(111, 8, 72).equals(C5C.A06)) && (A03(C3503Kz.d0, 22, 117).equals(str) || A03(162, 29, 74).equals(str))) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0K(String str) {
        if (A03(227, 26, 94).equals(str) && A03(527, 5, 83).equals(C5C.A03)) {
            return false;
        }
        return true;
    }

    public static boolean A0L(String str, int i) {
        if (A03(751, 10, 121).equals(str) && 2 == i) {
            if (A03(539, 8, 36).equals(C5C.A03) || A03(521, 6, 9).equals(C5C.A03)) {
                return true;
            }
        }
        return false;
    }

    public static MediaCodecInfo.CodecProfileLevel[] A0M(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int level;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i = 0;
        if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
            Integer upper = videoCapabilities.getBitrateRange().getUpper();
            if (A0C[0].charAt(21) != 'A') {
                throw new RuntimeException();
            }
            A0C[0] = "QcEMGW7v0Yxqh7XLcQ4xIAQDDerowqhX";
            i = upper.intValue();
        }
        if (i >= 180000000) {
            level = 1024;
        } else if (i >= 120000000) {
            level = 512;
        } else if (i >= 60000000) {
            level = 256;
        } else if (i >= 30000000) {
            level = 128;
        } else if (i >= 18000000) {
            level = 64;
        } else if (A0C[0].charAt(21) != 'A') {
            throw new RuntimeException();
        } else {
            String[] strArr = A0C;
            strArr[7] = "cnj1P9QIvdvvlmM3jq4NJ";
            strArr[5] = "0LKKsHUxH9Ew65kXLPhVQ5r";
            if (i >= 12000000) {
                level = 32;
            } else if (i >= 7200000) {
                level = 16;
            } else if (i >= 3600000) {
                level = 8;
            } else if (i >= 1800000) {
                level = 4;
            } else if (i >= 800000) {
                level = 2;
            } else {
                level = 1;
            }
        }
        MediaCodecInfo.CodecProfileLevel profileLevel = new MediaCodecInfo.CodecProfileLevel();
        profileLevel.profile = 1;
        profileLevel.level = level;
        return new MediaCodecInfo.CodecProfileLevel[]{profileLevel};
    }

    public final Point A0N(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (this.A00 == null || (videoCapabilities = this.A00.getVideoCapabilities()) == null) {
            return null;
        }
        return A01(videoCapabilities, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
        if (r1 != r14.A0A) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C6L A0O(C2242qI c2242qI, C2242qI c2242qI2) {
        int i = C5C.A1E(c2242qI.A0W, c2242qI2.A0W) ? 0 : 0 | 8;
        if (this.A0A) {
            int discardReasons = c2242qI.A0F;
            if (discardReasons != c2242qI2.A0F) {
                i |= 1024;
            }
            if (!this.A04) {
                int discardReasons2 = c2242qI.A0L;
                if (discardReasons2 == c2242qI2.A0L) {
                    int discardReasons3 = c2242qI.A0A;
                }
                i |= 512;
            }
            if (!C5C.A1E(c2242qI.A0N, c2242qI2.A0N)) {
                i |= 2048;
            }
            if (A0I(this.A03) && !c2242qI.A0A(c2242qI2)) {
                i |= 2;
            }
            if (i == 0) {
                String str = this.A03;
                int i2 = c2242qI.A0A(c2242qI2) ? 3 : 2;
                if (A0C[0].charAt(21) != 'A') {
                    throw new RuntimeException();
                }
                String[] strArr = A0C;
                strArr[7] = "2o9LDR7wht3djkkWSozFp";
                strArr[5] = "xzNY8imEyNfCiAqEOIotcML";
                return new C6L(str, c2242qI, c2242qI2, i2, 0);
            }
        } else {
            int discardReasons4 = c2242qI.A06;
            if (discardReasons4 != c2242qI2.A06) {
                i |= 4096;
            }
            int discardReasons5 = c2242qI.A0G;
            if (discardReasons5 != c2242qI2.A0G) {
                i |= 8192;
            }
            int discardReasons6 = c2242qI.A0C;
            if (discardReasons6 != c2242qI2.A0C) {
                i |= 16384;
            }
            if (i == 0 && A03(371, 15, 53).equals(this.A02)) {
                Pair<Integer, Integer> A0B2 = C0624Ba.A0B(c2242qI);
                Pair<Integer, Integer> A0B3 = C0624Ba.A0B(c2242qI2);
                if (A0B2 != null && A0B3 != null) {
                    int intValue = ((Integer) A0B2.first).intValue();
                    int intValue2 = ((Integer) A0B3.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C6L(this.A03, c2242qI, c2242qI2, 3, 0);
                    }
                }
            }
            if (!c2242qI.A0A(c2242qI2)) {
                i |= 32;
            }
            if (A0H(this.A02)) {
                i |= 2;
            }
            if (i == 0) {
                return new C6L(this.A03, c2242qI, c2242qI2, 1, 0);
            }
        }
        return new C6L(this.A03, c2242qI, c2242qI2, 0, i);
    }

    public final boolean A0P(int i) {
        if (this.A00 == null) {
            A06(A03(451, 17, 59));
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.A00.getAudioCapabilities();
        if (audioCapabilities == null) {
            A06(A03(433, 18, 124));
            return false;
        } else if (A00(this.A03, this.A02, audioCapabilities.getMaxInputChannelCount()) < i) {
            A06(A03(468, 22, 78) + i);
            return false;
        } else {
            return true;
        }
    }

    public final boolean A0Q(int i) {
        if (this.A00 == null) {
            A06(A03(563, 15, 4));
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.A00.getAudioCapabilities();
        if (audioCapabilities == null) {
            A06(A03(547, 16, 88));
            return false;
        } else if (!audioCapabilities.isSampleRateSupported(i)) {
            A06(A03(578, 20, 107) + i);
            return false;
        } else {
            return true;
        }
    }

    public final boolean A0R(int i, int i2, double d) {
        if (this.A00 == null) {
            if (A0C[4].length() != 17) {
                throw new RuntimeException();
            }
            A0C[1] = "VtsIfpRARdWM2RcSD8UT7BsOJP98i2Mb";
            A06(A03(613, 16, 15));
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.A00.getVideoCapabilities();
        if (videoCapabilities == null) {
            A06(A03(690, 17, 13));
            return false;
        }
        int i3 = C5C.A02;
        String A03 = A03(9, 1, 116);
        String A032 = A03(780, 1, 62);
        if (i3 >= 29) {
            int A00 = B1.A00(videoCapabilities, i, i2, d);
            if (A00 == 2) {
                return true;
            }
            if (A00 == 1) {
                A06(A03(629, 19, 41) + i + A032 + i2 + A03 + d);
                return false;
            }
        }
        if (!A0F(videoCapabilities, i, i2, d)) {
            if (i >= i2 || !A0K(this.A03) || !A0F(videoCapabilities, i2, i, d)) {
                A06(A03(669, 21, 113) + i + A032 + i2 + A03 + d);
                return false;
            }
            A05(A03(648, 21, 5) + i + A032 + i2 + A03 + d);
        }
        return true;
    }

    @MetaExoPlayerCustomization(type = {"DEPRECATED_LOGIC"}, value = "D51676338: Control Renderer Support behavior")
    public final boolean A0S(C2242qI c2242qI) {
        String A07;
        if (c2242qI.A0R == null || this.A02 == null || (A07 = C3J.A07(c2242qI.A0R)) == null) {
            return true;
        }
        String codecMimeType = this.A02;
        if (!codecMimeType.equals(A07)) {
            StringBuilder sb = new StringBuilder();
            String codecMimeType2 = A03(490, 11, 76);
            StringBuilder append = sb.append(codecMimeType2);
            String codecMimeType3 = c2242qI.A0R;
            StringBuilder append2 = append.append(codecMimeType3);
            String codecMimeType4 = A03(4, 2, 43);
            A06(append2.append(codecMimeType4).append(A07).toString());
            return false;
        }
        return A0G(c2242qI, true);
    }

    public final boolean A0T(C2242qI c2242qI) {
        if (this.A0A) {
            boolean z = this.A04;
            if (A0C[1].charAt(21) != 'k') {
                String[] strArr = A0C;
                strArr[7] = "p6ujkjtFWGTlktsjRzxuv";
                strArr[5] = "iao6hIdGkkUEjHJmkTON0Ul";
                return z;
            }
            throw new RuntimeException();
        }
        Pair<Integer, Integer> profileLevel = C0624Ba.A0B(c2242qI);
        return profileLevel != null && ((Integer) profileLevel.first).intValue() == 42;
    }

    @Deprecated
    public final boolean A0U(C2242qI c2242qI, C2242qI c2242qI2, boolean z) {
        if (!z && c2242qI.A0N != null) {
            ColorInfo colorInfo = c2242qI2.A0N;
            String[] strArr = A0C;
            if (strArr[7].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A0C[2] = "CiueF8sE";
            if (colorInfo == null) {
                c2242qI2 = c2242qI2.A07().A0t(c2242qI.A0N).A14();
            }
        }
        int i = A0O(c2242qI, c2242qI2).A01;
        return i == 2 || i == 3;
    }

    public final MediaCodecInfo.CodecProfileLevel[] A0V() {
        if (this.A00 == null || this.A00.profileLevels == null) {
            return new MediaCodecInfo.CodecProfileLevel[0];
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (A0C[2].length() != 8) {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[7] = "wYBsKMorArWFj72U1vIrO";
        strArr[5] = "2GYgXVRgmEsc3DaR9LQ86J2";
        return codecCapabilities.profileLevels;
    }

    public final String toString() {
        return this.A03;
    }
}
