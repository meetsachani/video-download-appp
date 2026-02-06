package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import o.C10997yd1;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C8077mf;
import o.C8206nB;
import o.CK1;
import o.ED2;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.2k  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC04162k {
    public static byte[] A00;
    public static String[] A01 = {"sOrNj5Mdy4xi0kLPibyeSfiWQxOima4U", "xj48Y1LQ4ko", "eUY0SVXtYBJtN83XOuXTnKZfqvTHosXd", "paDpwp97WdTEiWCS91q7LcvTv3rNjzy2", "ATE3aiPBn3N", "z3W8kbtrqKRemiiFleAuTjlgcuTfL08m", "RcLeq9wITz99Drk9X88RRLyniy3v1DlZ", "ZhckCEJ2n6PA9tAuxk3fuT"};

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{49, 126, 126, 124, 102, C3307Iz.a0, C3307Iz.c0, 123, 4, 75, 73, C8077mf.H, 124, 51, 54, C3307Iz.Y, C3307Iz.V, 57, 118, 122, 101, C8077mf.A, 88, 79, 80, 80, C8077mf.G, 19, C8077mf.B, 17, 90, 92, C8077mf.n, 13, 69, 79, 66, 64, 126, 54, 60, C3307Iz.Y, 126, 58, 32, 53, 55, 113, 53, 47, 56, 118, 53, 106, 40, 0, 67, C8077mf.D, C3307Iz.V, 98, 102, 107, 5, 70, 66, 79, 66, 90, C8077mf.C, 31, 97, 34, ED2.a, 124, 58, 121, 100, 32, 5, 70, 91, 78, 76, 34, 97, 124, 107, 58, 123, 115, 88, C8077mf.C, 6, 3, 5, 102, 56, 59, 80, 13, 19, C8077mf.B, C3307Iz.d0, 118, 113, 78, C8077mf.z, C8077mf.x, C8077mf.x, 82, C8077mf.m, C8077mf.G, 10, 81, 8, C8077mf.H, 9, C8077mf.D, 47, 118, 100, 99, 108, 57, 96, 114, 117, 97, 99, 99, 65, 109, 108, 118, 103, 108, 118, 47, 86, 123, 114, 103, 74, 91, 91, 71, 66, 72, 74, 95, 66, 68, 69, 4, 70, 91, 31, C8077mf.u, 3, 3, 31, C8077mf.D, C8077mf.r, C8077mf.u, 7, C8077mf.D, 28, C8077mf.G, 92, 4, C8077mf.z, 17, C8077mf.H, 54, 34, 51, 62, 56, QC1.w, 100, 48, C3307Iz.Z, C3307Iz.Z, 86, 66, 83, 94, 88, C8077mf.B, 86, 84, 4, 73, 93, 76, 65, 71, 7, 73, 75, 28, 2, C8077mf.z, 7, 10, C8077mf.n, 76, 2, C8077mf.p, 17, 96, 116, 101, 104, 110, C3307Iz.f0, 96, 108, 115, C3307Iz.d0, 118, 99, 98, 118, 103, 106, 108, C3307Iz.d0, 102, 98, 96, 48, 57, C3307Iz.e0, 60, 49, 55, 119, C4715Xk.i, 57, 59, 107, 117, 50, 55, 59, 32, 52, C3307Iz.X, 40, C3307Iz.f0, 110, C3307Iz.Z, C3307Iz.e0, 32, 34, 28, 8, C8077mf.C, C8077mf.x, C8077mf.u, 82, C8077mf.r, C8077mf.x, C8077mf.C, C8077mf.x, 48, 36, 53, 56, 62, 126, 60, C3307Iz.V, 101, 85, 65, 80, 93, 91, C8077mf.E, 89, 68, 81, 83, 34, 54, C3307Iz.Z, 42, C3307Iz.d0, 108, C3307Iz.d0, 36, 36, 40, 60, C3307Iz.e0, 32, C3307Iz.Y, 102, 62, 40, ED2.a, 117, 97, 112, 125, 123, 59, 99, 113, 118, 121, 56, C3307Iz.d0, C4715Xk.i, 48, 54, 118, C3307Iz.V, 116, 52, 56, C3307Iz.e0, C3307Iz.c0, 54, 42, 50, 56, 84, 80, 92, 90, 88, C8077mf.u, 87, 77, 88, 90, 69, 84, 73, 69, C8077mf.H, 71, 69, 69, 36, 59, 54, 55, C4715Xk.i, 125, ED2.a, 34, 96, 34, 32, ED2.a, 50, 51, 57, 121, 59, C3307Iz.Y, 100, 34, 55, 40, C3307Iz.X, 36, C3307Iz.f0, 110, C3307Iz.d0, 49, 117, 113, 110, 99, 98, 104, 40, 112, 98, 101, 106, 101, 122, 119, 118, 124, 60, 107, 62, 117, Byte.MAX_VALUE, 101, 104, 119, 122, 123, 113, 49, 102, 51, 115, Byte.MAX_VALUE, 106, 108, 113, 109, 117, Byte.MAX_VALUE, 50, C3307Iz.e0, 32, C3307Iz.V, C3307Iz.c0, 107, 60, 105, C3307Iz.a0, 55, 50, C3307Iz.e0, 32, C3307Iz.V, C3307Iz.c0};
    }

    static {
        A04();
    }

    public static int A00(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        String filename = A03(4, 4, 104);
        if (!lastPathSegment.endsWith(filename)) {
            String filename2 = A03(29, 4, 31);
            if (!lastPathSegment.endsWith(filename2)) {
                String filename3 = A03(8, 4, 10);
                if (lastPathSegment.endsWith(filename3)) {
                    return 1;
                }
                String filename4 = A03(12, 5, 114);
                if (lastPathSegment.endsWith(filename4)) {
                    return 2;
                }
                String filename5 = A03(0, 4, 63);
                if (lastPathSegment.endsWith(filename5)) {
                    return 2;
                }
                String filename6 = A03(17, 4, 55);
                if (lastPathSegment.endsWith(filename6)) {
                    return 3;
                }
                String filename7 = A03(33, 5, 3);
                if (lastPathSegment.endsWith(filename7)) {
                    return 4;
                }
                String filename8 = A03(38, 4, 112);
                if (lastPathSegment.endsWith(filename8)) {
                    return 5;
                }
                String filename9 = A03(58, 4, 47);
                if (!lastPathSegment.endsWith(filename9)) {
                    String filename10 = A03(62, 5, 11);
                    if (!lastPathSegment.endsWith(filename10)) {
                        String filename11 = A03(98, 4, 94);
                        if (lastPathSegment.endsWith(filename11)) {
                            return 15;
                        }
                        int length = lastPathSegment.length();
                        String A03 = A03(67, 3, 84);
                        if (!lastPathSegment.startsWith(A03, length - (A03.length() + 1))) {
                            String filename12 = A03(118, 5, 33);
                            if (lastPathSegment.endsWith(filename12)) {
                                return 6;
                            }
                            String filename13 = A03(70, 4, 111);
                            if (lastPathSegment.endsWith(filename13)) {
                                return 7;
                            }
                            String A032 = A03(74, 4, 52);
                            if (!lastPathSegment.endsWith(A032)) {
                                int length2 = lastPathSegment.length();
                                String A033 = A03(55, 3, 14);
                                if (!lastPathSegment.startsWith(A033, length2 - (A033.length() + 1)) && !lastPathSegment.startsWith(A032, lastPathSegment.length() - (A032.length() + 1))) {
                                    int length3 = lastPathSegment.length();
                                    String A034 = A03(25, 4, 94);
                                    if (lastPathSegment.startsWith(A034, length3 - (A034.length() + 1))) {
                                        return 8;
                                    }
                                    int length4 = lastPathSegment.length();
                                    String A035 = A03(87, 3, 52);
                                    if (!lastPathSegment.startsWith(A035, length4 - (A035.length() + 1))) {
                                        String filename14 = A03(90, 5, 86);
                                        if (lastPathSegment.endsWith(filename14)) {
                                            return 9;
                                        }
                                        String filename15 = A03(95, 3, 104);
                                        if (!lastPathSegment.endsWith(filename15)) {
                                            String filename16 = A03(78, 5, 11);
                                            if (!lastPathSegment.endsWith(filename16)) {
                                                String filename17 = A03(83, 4, 44);
                                                if (!lastPathSegment.endsWith(filename17)) {
                                                    String filename18 = A03(51, 4, 120);
                                                    if (!lastPathSegment.endsWith(filename18)) {
                                                        String A036 = A03(102, 3, 34);
                                                        if (lastPathSegment.endsWith(A036) || lastPathSegment.startsWith(A036, lastPathSegment.length() - (A036.length() + 1))) {
                                                            return 11;
                                                        }
                                                        String filename19 = A03(109, 4, 92);
                                                        if (lastPathSegment.endsWith(filename19)) {
                                                            return 12;
                                                        }
                                                        String filename20 = A03(113, 5, 95);
                                                        if (lastPathSegment.endsWith(filename20)) {
                                                            return 12;
                                                        }
                                                        String filename21 = A03(105, 4, 64);
                                                        if (lastPathSegment.endsWith(filename21)) {
                                                            return 13;
                                                        }
                                                        String[] strArr = A01;
                                                        if (strArr[0].charAt(20) != strArr[5].charAt(20)) {
                                                            String[] strArr2 = A01;
                                                            strArr2[2] = "SyPKArUiofAKtDYOeehIfh1mrOq04kE4";
                                                            strArr2[3] = "xM2ROt7CFYmp4WclnHzUErJdjCgsEFHY";
                                                            String filename22 = A03(123, 7, 55);
                                                            if (lastPathSegment.endsWith(filename22)) {
                                                                return 13;
                                                            }
                                                            String filename23 = A03(47, 4, 127);
                                                            if (lastPathSegment.endsWith(filename23)) {
                                                                return 14;
                                                            }
                                                            String filename24 = A03(42, 5, 112);
                                                            if (lastPathSegment.endsWith(filename24)) {
                                                                return 14;
                                                            }
                                                            String filename25 = A03(21, 4, 25);
                                                            if (!lastPathSegment.endsWith(filename25)) {
                                                                return -1;
                                                            }
                                                            return 16;
                                                        }
                                                        throw new RuntimeException();
                                                    }
                                                }
                                            }
                                        }
                                        String[] strArr3 = A01;
                                        if (strArr3[0].charAt(20) != strArr3[5].charAt(20)) {
                                            String[] strArr4 = A01;
                                            strArr4[0] = "1wRaS2qHbg36RBVDXd8PcZR43XT5miNJ";
                                            strArr4[5] = "Vak8xJBIlxZA7GdMxsEEJaTmiAiwlk64";
                                            return 10;
                                        }
                                        String[] strArr5 = A01;
                                        strArr5[2] = "I1Nt4MatJPh6S3ZRGQ5jEYQUJm5selco";
                                        strArr5[3] = "WdisFFcNpT7R4JXqf39409YvWJDYYP5x";
                                        return 10;
                                    }
                                    return 9;
                                }
                                return 8;
                            }
                            return 8;
                        }
                        return 6;
                    }
                    return 15;
                }
                return 15;
            }
        }
        String[] strArr6 = A01;
        if (strArr6[2].charAt(16) != strArr6[3].charAt(16)) {
            A01[7] = "O7R9Zztw2xxmA6l6DOopzc";
            return 0;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01d9, code lost:
        if (r3.equals(A03(o.C3503Kz.f0, 15, 11)) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01db, code lost:
        r0 = 18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01f3, code lost:
        if (r3.equals(A03(o.C3503Kz.f0, 15, 11)) != false) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A01(String str) {
        char c;
        if (str == null) {
            return -1;
        }
        String A08 = C3J.A08(str);
        switch (A08.hashCode()) {
            case -2123537834:
                if (A08.equals(A03(232, 14, 120))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1662384011:
                if (A08.equals(A03(347, 10, 114))) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -1662384007:
                if (A08.equals(A03(357, 10, 118))) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -1662095187:
                if (A08.equals(A03(376, 10, 39))) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1606874997:
                if (A08.equals(A03(210, 12, 33))) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1487394660:
                if (A08.equals(A03(329, 10, 29))) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -1248337486:
                if (A01[7].length() == 22) {
                    String[] strArr = A01;
                    strArr[0] = "oLTnrwIBq2QzgjFw3N3RktYo6NZQmMf3";
                    strArr[5] = "QNhP04DoIR1zSjF86M1zF3qVFSCy8pQT";
                    break;
                } else {
                    break;
                }
            case -1079884372:
                if (A08.equals(A03(413, 15, 100))) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -1004728940:
                if (A08.equals(A03(339, 8, 17))) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -387023398:
                if (A08.equals(A03(313, 16, 121))) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -43467528:
                if (A08.equals(A03(C3503Kz.q0, 16, 83))) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 13915911:
                if (A08.equals(A03(386, 11, 51))) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                String A03 = A03(C10997yd1.n2, 9, 23);
                String[] strArr2 = A01;
                String mimeType = strArr2[2];
                if (mimeType.charAt(16) != strArr2[3].charAt(16)) {
                    String[] strArr3 = A01;
                    strArr3[2] = "6QQZLNGVR2AIeatGMzPqjJprlHBJogxD";
                    strArr3[3] = "Af27oybmhMiV9AwSjl7b5zEjFKeqRzbf";
                    if (A08.equals(A03)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                } else {
                    throw new RuntimeException();
                }
            case 187078297:
                if (A08.equals(A03(CK1.x, 9, 8))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 187078669:
                if (A08.equals(A03(201, 9, 67))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 187090232:
                if (A08.equals(A03(266, 9, 113))) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 187091926:
                if (A08.equals(A03(285, 9, 99))) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 187099443:
                if (A08.equals(A03(294, 9, 105))) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1331848029:
                if (A08.equals(A03(367, 9, 97))) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1503095341:
                if (A08.equals(A03(173, 10, 119))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (A08.equals(A03(222, 10, 35))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1504619009:
                if (A08.equals(A03(246, 10, 97))) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1504824762:
                if (A08.equals(A03(256, 10, 93))) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (A08.equals(A03(275, 10, 20))) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1505118770:
                if (A08.equals(A03(303, 10, 52))) {
                    c = C8206nB.d;
                    break;
                }
                c = 65535;
                break;
            case 2039520277:
                if (A08.equals(A03(397, 16, 62))) {
                    c = '\n';
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
                return 0;
            case 3:
                return 1;
            case 4:
            case 5:
            case 6:
                return 3;
            case 7:
                return 4;
            case '\b':
                return 5;
            case '\t':
                return 15;
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
                return 6;
            case 15:
                return 7;
            case 16:
            case 17:
            case 18:
                return 8;
            case 19:
                return 9;
            case 20:
                return 10;
            case 21:
                return 11;
            case 22:
                return 12;
            case 23:
                return 13;
            case 24:
                return 14;
            case 25:
                return 16;
            default:
                return -1;
        }
    }

    public static int A02(Map<String, List<String>> responseHeaders) {
        List<String> list = responseHeaders.get(A03(130, 12, 34));
        return A01((list == null || list.isEmpty()) ? null : list.get(0));
    }
}
