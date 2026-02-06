package com.facebook.ads.redexgen.X;

import android.util.Base64;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.flac.PictureFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.vorbis.VorbisComment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.Hk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0787Hk {
    public static byte[] A00;
    public static String[] A01 = {"AQUfun8uWtpAPz6T54JXA8DVdz19i7cg", "A9xQ060X7I53O0IPhfx7pChTdPn89BVs", "HA6OUY8aFXslM4giueBriDg2S", "9RrkKnX7ioGd8UIKmUAG7ayOJ1mW6fCZ", "mjtW7HF4JFIVQBQAuWhSkP1cuiqQ", "mMlJtFouJ3Md3SAWQWV0HJ1iYftjtiDS", "", "7UUPgjEseHhf3IW21ENlLsXr9tr9mert"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C0786Hj A06(C04774v c04774v) throws C3K {
        A0C(1, c04774v, false);
        int A0F = c04774v.A0F();
        int A0I = c04774v.A0I();
        int A0F2 = c04774v.A0F();
        int A0E = c04774v.A0E();
        if (A0E <= 0) {
            A0E = -1;
        }
        int A0E2 = c04774v.A0E();
        if (A0E2 <= 0) {
            A0E2 = -1;
        }
        int A0E3 = c04774v.A0E();
        if (A0E3 <= 0) {
            A0E3 = -1;
            String[] strArr = A01;
            if (strArr[6].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[6] = "";
            strArr2[4] = "hx6vx8O5nOwfxHxHuzSsxOXMbdPf";
        }
        int A0I2 = c04774v.A0I();
        return new C0786Hj(A0F, A0I, A0F2, A0E, A0E2, A0E3, (int) Math.pow(2.0d, A0I2 & 15), (int) Math.pow(2.0d, (A0I2 & 240) >> 4), (c04774v.A0I() & 1) > 0, Arrays.copyOf(c04774v.A0l(), c04774v.A0A()));
    }

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 110);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{107, C8077mf.C, 62, 54, 51, 58, 59, Byte.MAX_VALUE, C3307Iz.c0, 48, Byte.MAX_VALUE, 47, 62, C3307Iz.e0, C3307Iz.d0, 58, Byte.MAX_VALUE, 9, 48, C3307Iz.e0, C4715Xk.i, 54, C3307Iz.d0, Byte.MAX_VALUE, 60, 48, 50, 50, 58, 49, C3307Iz.c0, 101, Byte.MAX_VALUE, 40, C8077mf.q, 7, 2, C8077mf.m, 10, 78, C8077mf.D, 1, 78, C8077mf.H, C8077mf.q, 28, C8077mf.G, C8077mf.m, 78, C8077mf.B, 1, 28, C8077mf.n, 7, C8077mf.G, 78, C8077mf.H, 7, 13, C8077mf.D, C8077mf.E, 28, C8077mf.m, 118, 126, 111, 122, Byte.MAX_VALUE, 122, 111, 122, 100, 121, 119, 116, QC1.w, 112, 100, 107, 114, QC1.w, 111, 110, 105, 126, 62, 7, C8077mf.D, 10, 1, C8077mf.E, C4715Xk.i, 28, 1, 4, 58, C3307Iz.Z, 47, 58, 60, C3307Iz.c0, 58, 59, Byte.MAX_VALUE, 60, 55, 62, C3307Iz.e0, 62, 60, C3307Iz.c0, 58, C3307Iz.e0, C3307Iz.d0, Byte.MAX_VALUE, QC1.w, C3307Iz.a0, 48, C3307Iz.e0, C4715Xk.i, 54, C3307Iz.d0, QC1.w, 64, 93, 85, 64, 70, 81, 64, 65, 5, 70, 74, 65, 64, 5, 71, 74, 74, 78, 5, 81, 74, 5, 86, 81, 68, 87, 81, 5, 82, 76, 81, 77, 5, 126, C8077mf.y, 93, C8077mf.r, 19, 9, 5, C8077mf.y, 93, 17, C8077mf.z, 9, 5, C8077mf.y, 93, 17, C8077mf.A, QC1.w, 5, 68, 81, 5, 62, 35, C3307Iz.c0, 62, 56, 47, 62, ED2.a, 123, 51, 62, 58, ED2.a, 62, C3307Iz.a0, 123, 47, 34, C3307Iz.c0, 62, 123, 107, 97, 98, 98, Byte.MAX_VALUE, C3307Iz.e0, 121, 116, 125, 104, C3307Iz.e0, 106, Byte.MAX_VALUE, 104, 108, 121, 104, Byte.MAX_VALUE, C3307Iz.e0, 121, 101, 108, 99, C3307Iz.e0, 60, C3307Iz.e0, 99, 98, 121, C3307Iz.e0, 105, 104, 110, 98, 105, 108, 111, 97, 104, 55, C3307Iz.e0, 97, 117, 102, 106, 110, 105, 96, C3307Iz.Z, 101, 110, 115, C3307Iz.Z, 102, 97, 115, 98, 117, C3307Iz.Z, 106, 104, 99, 98, 116, C3307Iz.Z, 105, 104, 115, C3307Iz.Z, 116, 98, 115, C3307Iz.Z, 102, 116, C3307Iz.Z, 98, Byte.MAX_VALUE, 119, 98, 100, 115, 98, 99, C3307Iz.Y, 50, C3307Iz.V, C3307Iz.e0, C3307Iz.a0, C3307Iz.f0, C3307Iz.Z, 96, 34, C3307Iz.a0, 52, 96, C3307Iz.X, 56, 48, C3307Iz.X, 35, 52, C3307Iz.X, 36, 96, 52, 47, 96, 34, C3307Iz.X, 96, 51, C3307Iz.X, 52, 2, 1, 1, 5, C8077mf.E, C8077mf.H, 78, C8077mf.D, C8077mf.A, C8077mf.H, C8077mf.m, 78, 9, 28, C8077mf.m, C8077mf.q, C8077mf.D, C8077mf.m, 28, 78, C8077mf.D, 6, C8077mf.q, 0, 78, 92, 78, 0, 1, C8077mf.D, 78, 10, C8077mf.m, 13, 1, 10, C8077mf.q, C8077mf.n, 2, C8077mf.m, 84, 78, 56, 52, C3307Iz.X, C3307Iz.X, 60, 59, 50, 117, C3307Iz.V, C3307Iz.d0, C3307Iz.X, 48, 117, 58, C3307Iz.V, C4715Xk.i, 48, C3307Iz.Z, 117, C3307Iz.V, C4715Xk.i, 52, 59, 117, 101, 117, 59, 58, C3307Iz.V, 117, C3307Iz.Y, 32, C3307Iz.X, C3307Iz.X, 58, C3307Iz.Z, C3307Iz.V, 48, 49, 111, 117, 108, 112, 125, Byte.MAX_VALUE, 121, 116, 115, 112, QC1.w, 121, 110, 60, 115, 122, 60, 104, 117, 113, 121, 60, QC1.w, 115, 113, 125, 117, 114, 60, 104, 110, 125, 114, 111, 122, 115, 110, 113, 111, 60, 114, 115, 104, 60, 102, 121, 110, 115, 121, QC1.w, 60, 115, 105, 104, 64, 87, 65, 91, 86, 71, 87, 102, 75, 66, 87, C8077mf.u, 85, 64, 87, 83, 70, 87, 64, C8077mf.u, 70, 90, 83, 92, C8077mf.u, 0, C8077mf.u, 91, 65, C8077mf.u, 92, 93, 70, C8077mf.u, 86, 87, 81, 93, 86, 83, 80, 94, 87, 93, 70, 9, 91, 76, 90, 76, 91, 95, 76, 77, 9, 75, 64, 93, 90, 9, 68, 92, 90, 93, 9, 75, 76, 9, 83, 76, 91, 70, 9, 72, 79, 93, 76, 91, 9, 68, 72, 89, 89, 64, 71, 78, 9, 74, 70, 92, 89, 69, 64, 71, 78, 9, 90, 93, 76, 89, 90, C8077mf.r, C8077mf.m, C8077mf.m, 68, C8077mf.A, C8077mf.n, C8077mf.m, C8077mf.z, C8077mf.r, 68, C8077mf.n, 1, 5, 0, 1, C8077mf.z, 94, 68};
    }

    static {
        A08();
    }

    public static int A00(int i) {
        int val = 0;
        while (i > 0) {
            val++;
            i >>>= 1;
        }
        return val;
    }

    public static long A01(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    public static Metadata A02(List<String> list) {
        List<String> vorbisComments = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] A1P = C5C.A1P(str, A07(0, 1, 56));
            int length = A1P.length;
            String A07 = A07(85, 10, 6);
            if (length != 2) {
                AbstractC04624g.A07(A07, A07(1, 32, 49) + str);
            } else {
                String[] strArr = A01;
                String str2 = strArr[6];
                String str3 = strArr[4];
                int i2 = str2.length();
                if (i2 == str3.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[6] = "";
                strArr2[4] = "IFt3u6Tbn0k1mtPtGSJYRwNJh6dv";
                if (A1P[0].equals(A07(63, 22, 85))) {
                    try {
                        vorbisComments.add(PictureFrame.A00(new C04774v(Base64.decode(A1P[1], 0))));
                    } catch (RuntimeException e) {
                        AbstractC04624g.A0A(A07, A07(33, 30, 0), e);
                    }
                } else {
                    vorbisComments.add(new VorbisComment(A1P[0], A1P[1]));
                }
            }
        }
        if (vorbisComments.isEmpty()) {
            return null;
        }
        return new Metadata(vorbisComments);
    }

    /* JADX WARN: Incorrect condition in loop: B:25:0x009f */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0026 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0783Hg A03(C0782Hf c0782Hf) throws C3K {
        long j;
        if (c0782Hf.A02(24) == 5653314) {
            int A02 = c0782Hf.A02(16);
            int lookupType = c0782Hf.A02(24);
            long[] jArr = new long[lookupType];
            boolean A04 = c0782Hf.A04();
            if (!A04) {
                boolean A042 = c0782Hf.A04();
                for (int i = 0; i < entries; i++) {
                    if (A042) {
                        if (c0782Hf.A04()) {
                            int entries = c0782Hf.A02(5);
                            jArr[i] = entries + 1;
                        } else {
                            String[] strArr = A01;
                            String str = strArr[7];
                            String str2 = strArr[0];
                            int dimensions = str.charAt(2);
                            int entries2 = str2.charAt(2);
                            if (dimensions != entries2) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A01;
                            strArr2[7] = "HkUiXrMYXoP7dmmSwm7TlUKenEWhRSa7";
                            strArr2[0] = "g3UzzRsN8l9NwZbA9Pl4zDU4WOGu2UFV";
                            jArr[i] = 0;
                        }
                    } else {
                        int i2 = c0782Hf.A02(5);
                        String[] strArr3 = A01;
                        String str3 = strArr3[6];
                        String str4 = strArr3[4];
                        int dimensions2 = str3.length();
                        int entries3 = str4.length();
                        if (dimensions2 != entries3) {
                            String[] strArr4 = A01;
                            strArr4[3] = "YIXxF7uzVQ2KRDIuTFnKuNVMBeAy43Wm";
                            strArr4[1] = "ZNrvF1xji8SwPYIxx9WGKrLEtje0Ya68";
                            jArr[i] = i2 + 1;
                        } else {
                            A01[2] = "PN1PQj6gHBTdVMYKSOEyBSZrD";
                            jArr[i] = i2 + 1;
                        }
                    }
                }
            } else {
                int i3 = c0782Hf.A02(5);
                int i4 = i3 + 1;
                int i5 = 0;
                while (i5 < entries) {
                    int entries4 = lookupType - i5;
                    int A022 = c0782Hf.A02(A00(entries4));
                    for (int length = 0; length < A022; length++) {
                        int entries5 = jArr.length;
                        if (i5 < entries5) {
                            jArr[i5] = i4;
                            i5++;
                        }
                    }
                    i4++;
                }
            }
            int A023 = c0782Hf.A02(4);
            if (A023 <= 2) {
                if (A023 == 1 || A023 == 2) {
                    c0782Hf.A03(32);
                    c0782Hf.A03(32);
                    int A024 = c0782Hf.A02(4) + 1;
                    c0782Hf.A03(1);
                    if (A023 == 1) {
                        if (A02 == 0) {
                            j = 0;
                        } else {
                            long j2 = lookupType;
                            String[] strArr5 = A01;
                            String str5 = strArr5[3];
                            String str6 = strArr5[1];
                            int dimensions3 = str5.charAt(14);
                            int entries6 = str6.charAt(14);
                            if (dimensions3 != entries6) {
                                throw new RuntimeException();
                            }
                            A01[5] = "D9mmqqJmTqnxQ2dihdU3MUH7YK6oq28f";
                            j = A01(j2, A02);
                        }
                    } else {
                        j = lookupType * A02;
                    }
                    int entries7 = (int) (A024 * j);
                    c0782Hf.A03(entries7);
                }
                return new C0783Hg(A02, lookupType, jArr, A023, A04);
            }
            throw C3K.A01(A07(313, 42, 0) + A023, null);
        }
        throw C3K.A01(A07(123, 55, 75) + c0782Hf.A01(), null);
    }

    public static C0784Hh A04(C04774v c04774v) throws C3K {
        return A05(c04774v, true, true);
    }

    public static C0784Hh A05(C04774v c04774v, boolean z, boolean z2) throws C3K {
        if (z) {
            A0C(3, c04774v, false);
        }
        int length = (int) c04774v.A0O();
        String A0W = c04774v.A0W(length);
        int length2 = A0W.length();
        int i = 7 + 4 + length2;
        long A0O = c04774v.A0O();
        int length3 = (int) A0O;
        String[] comments = new String[length3];
        int i2 = i + 4;
        int i3 = 0;
        while (true) {
            long commentListLen = i3;
            int length4 = (commentListLen > A0O ? 1 : (commentListLen == A0O ? 0 : -1));
            if (length4 >= 0) {
                break;
            }
            long commentListLen2 = c04774v.A0O();
            int length5 = (int) commentListLen2;
            comments[i3] = c04774v.A0W(length5);
            int length6 = comments[i3].length();
            i2 = i2 + 4 + length6;
            i3++;
        }
        if (z2) {
            int length7 = c04774v.A0I();
            if ((length7 & 1) == 0) {
                String vendor = A07(283, 30, 46);
                throw C3K.A01(vendor, null);
            }
        }
        return new C0784Hh(A0W, comments, i2 + 1);
    }

    public static void A09(int i, C0782Hf c0782Hf) throws C3K {
        int i2;
        int A02 = c0782Hf.A02(6) + 1;
        for (int i3 = 0; i3 < A02; i3++) {
            int A022 = c0782Hf.A02(16);
            if (A022 != 0) {
                AbstractC04624g.A05(A07(85, 10, 6), A07(355, 41, 59) + A022);
            } else {
                if (c0782Hf.A04()) {
                    int A023 = c0782Hf.A02(4);
                    String[] strArr = A01;
                    String str = strArr[7];
                    String str2 = strArr[0];
                    int charAt = str.charAt(2);
                    int mappingsCount = str2.charAt(2);
                    if (charAt != mappingsCount) {
                        throw new RuntimeException();
                    }
                    A01[5] = "MSIFAaOSOQQOpmu0PO7aKrLsJb3QFagu";
                    i2 = A023 + 1;
                } else {
                    i2 = 1;
                }
                if (c0782Hf.A04()) {
                    int i4 = c0782Hf.A02(8);
                    int i5 = i4 + 1;
                    for (int i6 = 0; i6 < i5; i6++) {
                        int mappingsCount2 = i - 1;
                        c0782Hf.A03(A00(mappingsCount2));
                        int mappingsCount3 = i - 1;
                        c0782Hf.A03(A00(mappingsCount3));
                    }
                }
                int mappingsCount4 = c0782Hf.A02(2);
                if (mappingsCount4 == 0) {
                    if (i2 > 1) {
                        for (int mappingsCount5 = 0; mappingsCount5 < i; mappingsCount5++) {
                            c0782Hf.A03(4);
                        }
                    }
                    for (int i7 = 0; i7 < i2; i7++) {
                        c0782Hf.A03(8);
                        String[] strArr2 = A01;
                        String str3 = strArr2[6];
                        String str4 = strArr2[4];
                        int length = str3.length();
                        int mappingsCount6 = str4.length();
                        if (length == mappingsCount6) {
                            throw new RuntimeException();
                        }
                        String[] strArr3 = A01;
                        strArr3[3] = "W7H2tgam7pgMqyIqKZRQoufJib3tzvKG";
                        strArr3[1] = "g3J7gwvZXejdWYIpZtqDt0lnx57dRd6J";
                        c0782Hf.A03(8);
                        c0782Hf.A03(8);
                    }
                    continue;
                } else {
                    throw C3K.A01(A07(491, 58, 71), null);
                }
            }
        }
    }

    public static void A0A(C0782Hf c0782Hf) throws C3K {
        int A02 = c0782Hf.A02(6) + 1;
        for (int i = 0; i < A02; i++) {
            int A022 = c0782Hf.A02(16);
            switch (A022) {
                case 0:
                    c0782Hf.A03(8);
                    c0782Hf.A03(16);
                    c0782Hf.A03(16);
                    String[] strArr = A01;
                    String str = strArr[6];
                    String str2 = strArr[4];
                    int floorCount = str.length();
                    if (floorCount == str2.length()) {
                        throw new RuntimeException();
                    }
                    A01[2] = "puZWVQ2pTjmoQkTRd3XFOd7V6";
                    c0782Hf.A03(6);
                    c0782Hf.A03(8);
                    int A023 = c0782Hf.A02(4) + 1;
                    for (int floorCount2 = 0; floorCount2 < A023; floorCount2++) {
                        c0782Hf.A03(8);
                    }
                    break;
                case 1:
                    int j = c0782Hf.A02(5);
                    int i2 = -1;
                    int[] partitionClassList = new int[j];
                    for (int floorCount3 = 0; floorCount3 < j; floorCount3++) {
                        partitionClassList[floorCount3] = c0782Hf.A02(4);
                        if (partitionClassList[floorCount3] > i2) {
                            i2 = partitionClassList[floorCount3];
                        }
                    }
                    int[] iArr = new int[i2 + 1];
                    for (int j2 = 0; j2 < iArr.length; j2++) {
                        iArr[j2] = c0782Hf.A02(3) + 1;
                        int A024 = c0782Hf.A02(2);
                        if (A024 > 0) {
                            c0782Hf.A03(8);
                        }
                        for (int floorCount4 = 0; floorCount4 < (1 << A024); floorCount4++) {
                            c0782Hf.A03(8);
                        }
                    }
                    c0782Hf.A03(2);
                    int k = c0782Hf.A02(4);
                    int j3 = 0;
                    int rangeBits = 0;
                    for (int count = 0; count < j; count++) {
                        int idx = partitionClassList[count];
                        String[] strArr2 = A01;
                        String str3 = strArr2[7];
                        String str4 = strArr2[0];
                        int floorCount5 = str3.charAt(2);
                        if (floorCount5 != str4.charAt(2)) {
                            throw new RuntimeException();
                        }
                        A01[5] = "4gRGDU2vGyXCYhT5FVmyq5RWvUvygEh7";
                        j3 += iArr[idx];
                        while (rangeBits < j3) {
                            c0782Hf.A03(k);
                            rangeBits++;
                        }
                    }
                    continue;
                default:
                    throw C3K.A01(A07(199, 41, 99) + A022, null);
            }
        }
    }

    public static void A0B(C0782Hf c0782Hf) throws C3K {
        int A02 = c0782Hf.A02(6) + 1;
        for (int i = 0; i < A02; i++) {
            int residueCount = c0782Hf.A02(16);
            if (residueCount <= 2) {
                c0782Hf.A03(24);
                c0782Hf.A03(24);
                c0782Hf.A03(24);
                int A022 = c0782Hf.A02(6) + 1;
                c0782Hf.A03(8);
                int[] iArr = new int[A022];
                for (int i2 = 0; i2 < A022; i2++) {
                    int residueCount2 = 0;
                    int A023 = c0782Hf.A02(3);
                    if (c0782Hf.A04()) {
                        String[] strArr = A01;
                        String str = strArr[7];
                        String str2 = strArr[0];
                        int residueCount3 = str.charAt(2);
                        if (residueCount3 != str2.charAt(2)) {
                            throw new RuntimeException();
                        }
                        A01[5] = "QebxPehykfYMwUhUEUOD533arJF7pEEp";
                        residueCount2 = c0782Hf.A02(5);
                    }
                    iArr[i2] = (residueCount2 * 8) + A023;
                }
                for (int i3 = 0; i3 < A022; i3++) {
                    for (int i4 = 0; i4 < 8; i4++) {
                        int residueCount4 = iArr[i3];
                        if ((residueCount4 & (1 << i4)) != 0) {
                            c0782Hf.A03(8);
                        }
                    }
                }
            } else {
                throw C3K.A01(A07(448, 43, 92), null);
            }
        }
    }

    public static boolean A0C(int i, C04774v c04774v, boolean z) throws C3K {
        if (c04774v.A07() < 7) {
            if (z) {
                return false;
            }
            throw C3K.A01(A07(549, 18, 10) + c04774v.A07(), null);
        } else if (c04774v.A0I() != i) {
            if (z) {
                return false;
            }
            throw C3K.A01(A07(178, 21, 53) + Integer.toHexString(i), null);
        } else if (c04774v.A0I() != 118 || c04774v.A0I() != 111 || c04774v.A0I() != 114 || c04774v.A0I() != 98 || c04774v.A0I() != 105 || c04774v.A0I() != 115) {
            if (z) {
                return false;
            }
            throw C3K.A01(A07(95, 28, 49), null);
        } else {
            return true;
        }
    }

    public static C0785Hi[] A0D(C04774v c04774v, int i) throws C3K {
        A0C(5, c04774v, false);
        int A0I = c04774v.A0I() + 1;
        C0782Hf c0782Hf = new C0782Hf(c04774v.A0l());
        int numberOfBooks = c04774v.A09();
        c0782Hf.A03(numberOfBooks * 8);
        for (int numberOfBooks2 = 0; numberOfBooks2 < A0I; numberOfBooks2++) {
            A03(c0782Hf);
        }
        int numberOfBooks3 = c0782Hf.A02(6);
        int timeCount = numberOfBooks3 + 1;
        for (int i2 = 0; i2 < timeCount; i2++) {
            int numberOfBooks4 = c0782Hf.A02(16);
            if (numberOfBooks4 != 0) {
                throw C3K.A01(A07(396, 52, 114), null);
            }
        }
        A0A(c0782Hf);
        A0B(c0782Hf);
        A09(i, c0782Hf);
        C0785Hi[] A0E = A0E(c0782Hf);
        if (c0782Hf.A04()) {
            return A0E;
        }
        throw C3K.A01(A07(240, 43, 105), null);
    }

    public static C0785Hi[] A0E(C0782Hf c0782Hf) {
        int A02 = c0782Hf.A02(6) + 1;
        C0785Hi[] c0785HiArr = new C0785Hi[A02];
        for (int windowType = 0; windowType < A02; windowType++) {
            boolean A04 = c0782Hf.A04();
            int A022 = c0782Hf.A02(16);
            int i = c0782Hf.A02(16);
            c0785HiArr[windowType] = new C0785Hi(A04, A022, i, c0782Hf.A02(8));
        }
        return c0785HiArr;
    }
}
