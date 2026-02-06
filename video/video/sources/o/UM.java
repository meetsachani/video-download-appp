package o;

import java.util.UUID;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes4.dex */
public class UM {
    public static final boolean[] a = {true, true, true, true};
    public static final boolean[] b = {false, true, true, true};
    public static final boolean[] c = {true, false, true, true};
    public static final boolean[] d = {false, false, true, true};
    public static final boolean[] e = {true, true, false, true};
    public static final boolean[] f = {false, true, false, true};
    public static final boolean[] g = {true, false, false, true};
    public static final boolean[] h = {false, false, false, true};
    public static final boolean[] i = {true, true, true, false};
    public static final boolean[] j = {false, true, true, false};
    public static final boolean[] k = {true, false, true, false};
    public static final boolean[] l = {false, false, true, false};
    public static final boolean[] m = {true, true, false, false};
    public static final boolean[] n = {false, true, false, false};

    /* renamed from: o  reason: collision with root package name */
    public static final boolean[] f627o = {true, false, false, false};
    public static final boolean[] p = {false, false, false, false};
    public static final /* synthetic */ boolean q = false;

    public static byte[] A(int i2, int i3, byte[] bArr, int i4, int i5) {
        if (i5 != 0) {
            if (((i5 - 1) * 8) + i3 < 32) {
                for (int i6 = 0; i6 < i5; i6++) {
                    bArr[i4 + i6] = (byte) ((i2 >> ((i6 * 8) + i3)) & 255);
                }
            } else {
                throw new IllegalArgumentException("(nBytes-1)*8+srcPos is greater or equal to than 32");
            }
        }
        return bArr;
    }

    public static String B(int i2, int i3, String str, int i4, int i5) {
        if (i5 == 0) {
            return str;
        }
        if (((i5 - 1) * 4) + i3 < 32) {
            StringBuilder sb = new StringBuilder(str);
            int length = sb.length();
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = (i2 >> ((i6 * 4) + i3)) & 15;
                int i8 = i4 + i6;
                if (i8 == length) {
                    length++;
                    sb.append(C(i7));
                } else {
                    sb.setCharAt(i8, C(i7));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("(nHexs-1)*4+srcPos is greater or equal to than 32");
    }

    public static char C(int i2) {
        char forDigit = Character.forDigit(i2, 16);
        if (forDigit != 0) {
            return forDigit;
        }
        throw new IllegalArgumentException("nibble value not between 0 and 15: " + i2);
    }

    public static char D(int i2) {
        switch (i2) {
            case 0:
                return C3599Ly1.j;
            case 1:
                return '8';
            case 2:
                return '4';
            case 3:
                return 'c';
            case 4:
                return '2';
            case 5:
                return 'a';
            case 6:
                return '6';
            case 7:
                return 'e';
            case 8:
                return '1';
            case 9:
                return '9';
            case 10:
                return '5';
            case 11:
                return 'd';
            case 12:
                return '3';
            case 13:
                return 'b';
            case 14:
                return '7';
            case 15:
                return 'f';
            default:
                throw new IllegalArgumentException("nibble value not between 0 and 15: " + i2);
        }
    }

    public static short[] E(int i2, int i3, short[] sArr, int i4, int i5) {
        if (i5 != 0) {
            if (((i5 - 1) * 16) + i3 < 32) {
                for (int i6 = 0; i6 < i5; i6++) {
                    sArr[i4 + i6] = (short) ((i2 >> ((i6 * 16) + i3)) & 65535);
                }
            } else {
                throw new IllegalArgumentException("(nShorts-1)*16+srcPos is greater or equal to than 32");
            }
        }
        return sArr;
    }

    public static boolean[] F(long j2, int i2, boolean[] zArr, int i3, int i4) {
        boolean z;
        if (i4 != 0) {
            if ((i4 - 1) + i2 < 64) {
                for (int i5 = 0; i5 < i4; i5++) {
                    int i6 = i3 + i5;
                    if ((1 & (j2 >> (i5 + i2))) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zArr[i6] = z;
                }
            } else {
                throw new IllegalArgumentException("nBools-1+srcPos is greater or equal to than 64");
            }
        }
        return zArr;
    }

    public static byte[] G(long j2, int i2, byte[] bArr, int i3, int i4) {
        if (i4 != 0) {
            if (((i4 - 1) * 8) + i2 < 64) {
                for (int i5 = 0; i5 < i4; i5++) {
                    bArr[i3 + i5] = (byte) (255 & (j2 >> ((i5 * 8) + i2)));
                }
            } else {
                throw new IllegalArgumentException("(nBytes-1)*8+srcPos is greater or equal to than 64");
            }
        }
        return bArr;
    }

    public static String H(long j2, int i2, String str, int i3, int i4) {
        if (i4 == 0) {
            return str;
        }
        if (((i4 - 1) * 4) + i2 < 64) {
            StringBuilder sb = new StringBuilder(str);
            int length = sb.length();
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = (int) ((j2 >> ((i5 * 4) + i2)) & 15);
                int i7 = i3 + i5;
                if (i7 == length) {
                    length++;
                    sb.append(C(i6));
                } else {
                    sb.setCharAt(i7, C(i6));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("(nHexs-1)*4+srcPos is greater or equal to than 64");
    }

    public static int[] I(long j2, int i2, int[] iArr, int i3, int i4) {
        if (i4 != 0) {
            if (((i4 - 1) * 32) + i2 < 64) {
                for (int i5 = 0; i5 < i4; i5++) {
                    iArr[i3 + i5] = (int) (j2 >> ((i5 * 32) + i2));
                }
            } else {
                throw new IllegalArgumentException("(nInts-1)*32+srcPos is greater or equal to than 64");
            }
        }
        return iArr;
    }

    public static short[] J(long j2, int i2, short[] sArr, int i3, int i4) {
        if (i4 != 0) {
            if (((i4 - 1) * 16) + i2 < 64) {
                for (int i5 = 0; i5 < i4; i5++) {
                    sArr[i3 + i5] = (short) (WebSocketProtocol.PAYLOAD_SHORT_MAX & (j2 >> ((i5 * 16) + i2)));
                }
            } else {
                throw new IllegalArgumentException("(nShorts-1)*16+srcPos is greater or equal to than 64");
            }
        }
        return sArr;
    }

    public static int K(short[] sArr, int i2, int i3, int i4, int i5) {
        if ((sArr.length == 0 && i2 == 0) || i5 == 0) {
            return i3;
        }
        if (((i5 - 1) * 16) + i4 < 32) {
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = (i6 * 16) + i4;
                i3 = (i3 & (~(65535 << i7))) | ((sArr[i6 + i2] & Xx2.Y0) << i7);
            }
            return i3;
        }
        throw new IllegalArgumentException("(nShorts-1)*16+dstPos is greater or equal to than 32");
    }

    public static long L(short[] sArr, int i2, long j2, int i3, int i4) {
        if ((sArr.length == 0 && i2 == 0) || i4 == 0) {
            return j2;
        }
        if (((i4 - 1) * 16) + i3 < 64) {
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = (i5 * 16) + i3;
                j2 = (j2 & (~(WebSocketProtocol.PAYLOAD_SHORT_MAX << i6))) | ((sArr[i5 + i2] & WebSocketProtocol.PAYLOAD_SHORT_MAX) << i6);
            }
            return j2;
        }
        throw new IllegalArgumentException("(nShorts-1)*16+dstPos is greater or equal to than 64");
    }

    public static boolean[] M(short s, int i2, boolean[] zArr, int i3, int i4) {
        if (i4 != 0) {
            if ((i4 - 1) + i2 < 16) {
                for (int i5 = 0; i5 < i4; i5++) {
                    int i6 = i3 + i5;
                    boolean z = true;
                    if (((s >> (i5 + i2)) & 1) == 0) {
                        z = false;
                    }
                    zArr[i6] = z;
                }
            } else {
                throw new IllegalArgumentException("nBools-1+srcPos is greater or equal to than 16");
            }
        }
        return zArr;
    }

    public static byte[] N(short s, int i2, byte[] bArr, int i3, int i4) {
        if (i4 != 0) {
            if (((i4 - 1) * 8) + i2 < 16) {
                for (int i5 = 0; i5 < i4; i5++) {
                    bArr[i3 + i5] = (byte) ((s >> ((i5 * 8) + i2)) & 255);
                }
            } else {
                throw new IllegalArgumentException("(nBytes-1)*8+srcPos is greater or equal to than 16");
            }
        }
        return bArr;
    }

    public static String O(short s, int i2, String str, int i3, int i4) {
        if (i4 == 0) {
            return str;
        }
        if (((i4 - 1) * 4) + i2 < 16) {
            StringBuilder sb = new StringBuilder(str);
            int length = sb.length();
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = (s >> ((i5 * 4) + i2)) & 15;
                int i7 = i3 + i5;
                if (i7 == length) {
                    length++;
                    sb.append(C(i6));
                } else {
                    sb.setCharAt(i7, C(i6));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("(nHexs-1)*4+srcPos is greater or equal to than 16");
    }

    public static byte[] P(UUID uuid, byte[] bArr, int i2, int i3) {
        if (i3 != 0) {
            if (i3 <= 16) {
                G(uuid.getMostSignificantBits(), 0, bArr, i2, Math.min(i3, 8));
                if (i3 >= 8) {
                    G(uuid.getLeastSignificantBits(), 0, bArr, i2 + 8, i3 - 8);
                }
            } else {
                throw new IllegalArgumentException("nBytes is greater than 16");
            }
        }
        return bArr;
    }

    public static char a(boolean[] zArr) {
        return b(zArr, 0);
    }

    public static char b(boolean[] zArr, int i2) {
        if (zArr.length != 0) {
            int length = ((zArr.length - 1) - i2) + 1;
            int min = Math.min(4, length);
            boolean[] zArr2 = new boolean[4];
            System.arraycopy(zArr, length - min, zArr2, 4 - min, min);
            if (zArr2[0]) {
                if (zArr2[1]) {
                    if (zArr2[2]) {
                        if (zArr2[3]) {
                            return 'f';
                        }
                        return 'e';
                    } else if (zArr2[3]) {
                        return 'd';
                    } else {
                        return 'c';
                    }
                } else if (zArr2[2]) {
                    if (zArr2[3]) {
                        return 'b';
                    }
                    return 'a';
                } else if (zArr2[3]) {
                    return '9';
                } else {
                    return '8';
                }
            } else if (zArr2[1]) {
                if (zArr2[2]) {
                    if (zArr2[3]) {
                        return '7';
                    }
                    return '6';
                } else if (zArr2[3]) {
                    return '5';
                } else {
                    return '4';
                }
            } else if (zArr2[2]) {
                if (zArr2[3]) {
                    return '3';
                }
                return '2';
            } else if (zArr2[3]) {
                return '1';
            } else {
                return C3599Ly1.j;
            }
        }
        throw new IllegalArgumentException("Cannot convert an empty array.");
    }

    public static byte c(boolean[] zArr, int i2, byte b2, int i3, int i4) {
        if ((zArr.length == 0 && i2 == 0) || i4 == 0) {
            return b2;
        }
        if ((i4 - 1) + i3 < 8) {
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = i5 + i3;
                b2 = (byte) ((b2 & (~(1 << i6))) | ((zArr[i5 + i2] ? 1 : 0) << i6));
            }
            return b2;
        }
        throw new IllegalArgumentException("nBools-1+dstPos is greater or equal to than 8");
    }

    public static char d(boolean[] zArr) {
        return e(zArr, 0);
    }

    public static char e(boolean[] zArr, int i2) {
        if (zArr.length != 0) {
            int i3 = i2 + 3;
            if (zArr.length > i3 && zArr[i3]) {
                if (zArr[i2 + 2]) {
                    if (zArr[i2 + 1]) {
                        if (zArr[i2]) {
                            return 'f';
                        }
                        return 'e';
                    } else if (zArr[i2]) {
                        return 'd';
                    } else {
                        return 'c';
                    }
                } else if (zArr[i2 + 1]) {
                    if (zArr[i2]) {
                        return 'b';
                    }
                    return 'a';
                } else if (zArr[i2]) {
                    return '9';
                } else {
                    return '8';
                }
            }
            int i4 = i2 + 2;
            if (zArr.length > i4 && zArr[i4]) {
                if (zArr[i2 + 1]) {
                    if (zArr[i2]) {
                        return '7';
                    }
                    return '6';
                } else if (zArr[i2]) {
                    return '5';
                } else {
                    return '4';
                }
            }
            int i5 = i2 + 1;
            if (zArr.length > i5 && zArr[i5]) {
                if (zArr[i2]) {
                    return '3';
                }
                return '2';
            } else if (zArr[i2]) {
                return '1';
            } else {
                return C3599Ly1.j;
            }
        }
        throw new IllegalArgumentException("Cannot convert an empty array.");
    }

    public static char f(boolean[] zArr) {
        return g(zArr, 0);
    }

    public static char g(boolean[] zArr, int i2) {
        if (zArr.length <= 8) {
            if (zArr.length - i2 >= 4) {
                if (zArr[i2 + 3]) {
                    if (zArr[i2 + 2]) {
                        if (zArr[i2 + 1]) {
                            if (zArr[i2]) {
                                return 'f';
                            }
                            return '7';
                        } else if (zArr[i2]) {
                            return 'b';
                        } else {
                            return '3';
                        }
                    } else if (zArr[i2 + 1]) {
                        if (zArr[i2]) {
                            return 'd';
                        }
                        return '5';
                    } else if (zArr[i2]) {
                        return '9';
                    } else {
                        return '1';
                    }
                } else if (zArr[i2 + 2]) {
                    if (zArr[i2 + 1]) {
                        if (zArr[i2]) {
                            return 'e';
                        }
                        return '6';
                    } else if (zArr[i2]) {
                        return 'a';
                    } else {
                        return '2';
                    }
                } else if (zArr[i2 + 1]) {
                    if (zArr[i2]) {
                        return 'c';
                    }
                    return '4';
                } else if (zArr[i2]) {
                    return '8';
                } else {
                    return C3599Ly1.j;
                }
            }
            throw new IllegalArgumentException("src.length-srcPos<4: src.length=" + zArr.length + ", srcPos=" + i2);
        }
        throw new IllegalArgumentException("src.length>8: src.length=" + zArr.length);
    }

    public static int h(boolean[] zArr, int i2, int i3, int i4, int i5) {
        if ((zArr.length == 0 && i2 == 0) || i5 == 0) {
            return i3;
        }
        if ((i5 - 1) + i4 < 32) {
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = i6 + i4;
                i3 = (i3 & (~(1 << i7))) | ((zArr[i6 + i2] ? 1 : 0) << i7);
            }
            return i3;
        }
        throw new IllegalArgumentException("nBools-1+dstPos is greater or equal to than 32");
    }

    public static long i(boolean[] zArr, int i2, long j2, int i3, int i4) {
        long j3;
        if ((zArr.length == 0 && i2 == 0) || i4 == 0) {
            return j2;
        }
        if ((i4 - 1) + i3 < 64) {
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = i5 + i3;
                if (zArr[i5 + i2]) {
                    j3 = 1;
                } else {
                    j3 = 0;
                }
                j2 = (j2 & (~(1 << i6))) | (j3 << i6);
            }
            return j2;
        }
        throw new IllegalArgumentException("nBools-1+dstPos is greater or equal to than 64");
    }

    public static short j(boolean[] zArr, int i2, short s, int i3, int i4) {
        if ((zArr.length == 0 && i2 == 0) || i4 == 0) {
            return s;
        }
        if ((i4 - 1) + i3 < 16) {
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = i5 + i3;
                s = (short) ((s & (~(1 << i6))) | ((zArr[i5 + i2] ? 1 : 0) << i6));
            }
            return s;
        }
        throw new IllegalArgumentException("nBools-1+dstPos is greater or equal to than 16");
    }

    public static int k(byte[] bArr, int i2, int i3, int i4, int i5) {
        if ((bArr.length == 0 && i2 == 0) || i5 == 0) {
            return i3;
        }
        if (((i5 - 1) * 8) + i4 < 32) {
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = (i6 * 8) + i4;
                i3 = (i3 & (~(255 << i7))) | ((bArr[i6 + i2] & 255) << i7);
            }
            return i3;
        }
        throw new IllegalArgumentException("(nBytes-1)*8+dstPos is greater or equal to than 32");
    }

    public static long l(byte[] bArr, int i2, long j2, int i3, int i4) {
        if ((bArr.length == 0 && i2 == 0) || i4 == 0) {
            return j2;
        }
        if (((i4 - 1) * 8) + i3 < 64) {
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = (i5 * 8) + i3;
                j2 = (j2 & (~(255 << i6))) | ((bArr[i5 + i2] & 255) << i6);
            }
            return j2;
        }
        throw new IllegalArgumentException("(nBytes-1)*8+dstPos is greater or equal to than 64");
    }

    public static short m(byte[] bArr, int i2, short s, int i3, int i4) {
        if ((bArr.length == 0 && i2 == 0) || i4 == 0) {
            return s;
        }
        if (((i4 - 1) * 8) + i3 < 16) {
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = (i5 * 8) + i3;
                s = (short) ((s & (~(255 << i6))) | ((bArr[i5 + i2] & 255) << i6));
            }
            return s;
        }
        throw new IllegalArgumentException("(nBytes-1)*8+dstPos is greater or equal to than 16");
    }

    public static UUID n(byte[] bArr, int i2) {
        if (bArr.length - i2 >= 16) {
            return new UUID(l(bArr, i2, 0L, 0, 8), l(bArr, i2 + 8, 0L, 0, 8));
        }
        throw new IllegalArgumentException("Need at least 16 bytes for UUID");
    }

    public static boolean[] o(byte b2, int i2, boolean[] zArr, int i3, int i4) {
        if (i4 != 0) {
            if ((i4 - 1) + i2 < 8) {
                for (int i5 = 0; i5 < i4; i5++) {
                    int i6 = i3 + i5;
                    boolean z = true;
                    if (((b2 >> (i5 + i2)) & 1) == 0) {
                        z = false;
                    }
                    zArr[i6] = z;
                }
            } else {
                throw new IllegalArgumentException("nBools-1+srcPos is greater or equal to than 8");
            }
        }
        return zArr;
    }

    public static String p(byte b2, int i2, String str, int i3, int i4) {
        if (i4 == 0) {
            return str;
        }
        if (((i4 - 1) * 4) + i2 < 8) {
            StringBuilder sb = new StringBuilder(str);
            int length = sb.length();
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = (b2 >> ((i5 * 4) + i2)) & 15;
                int i7 = i3 + i5;
                if (i7 == length) {
                    length++;
                    sb.append(C(i6));
                } else {
                    sb.setCharAt(i7, C(i6));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("(nHexs-1)*4+srcPos is greater or equal to than 8");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean[] q(char c2) {
        switch (c2) {
            case '0':
                return (boolean[]) p.clone();
            case '1':
                return (boolean[]) h.clone();
            case '2':
                return (boolean[]) l.clone();
            case '3':
                return (boolean[]) d.clone();
            case '4':
                return (boolean[]) n.clone();
            case '5':
                return (boolean[]) f.clone();
            case '6':
                return (boolean[]) j.clone();
            case '7':
                return (boolean[]) b.clone();
            case '8':
                return (boolean[]) f627o.clone();
            case '9':
                return (boolean[]) g.clone();
            default:
                switch (c2) {
                    case 'A':
                        return (boolean[]) k.clone();
                    case 'B':
                        return (boolean[]) c.clone();
                    case 'C':
                        return (boolean[]) m.clone();
                    case 'D':
                        return (boolean[]) e.clone();
                    case 'E':
                        return (boolean[]) i.clone();
                    case 'F':
                        return (boolean[]) a.clone();
                    default:
                        switch (c2) {
                            case 'a':
                                break;
                            case 'b':
                                break;
                            case 'c':
                                break;
                            case 'd':
                                break;
                            case 'e':
                                break;
                            case 'f':
                                break;
                            default:
                                throw new IllegalArgumentException("Cannot interpret '" + c2 + "' as a hexadecimal digit");
                        }
                }
        }
    }

    public static int r(char c2) {
        switch (c2) {
            case '0':
                return 0;
            case '1':
                return 8;
            case '2':
                return 4;
            case '3':
                return 12;
            case '4':
                return 2;
            case '5':
                return 10;
            case '6':
                return 6;
            case '7':
                return 14;
            case '8':
                return 1;
            case '9':
                return 9;
            default:
                switch (c2) {
                    case 'A':
                        return 5;
                    case 'B':
                        return 13;
                    case 'C':
                        return 3;
                    case 'D':
                        return 11;
                    case 'E':
                        return 7;
                    case 'F':
                        return 15;
                    default:
                        switch (c2) {
                            case 'a':
                                return 5;
                            case 'b':
                                return 13;
                            case 'c':
                                return 3;
                            case 'd':
                                return 11;
                            case 'e':
                                return 7;
                            case 'f':
                                return 15;
                            default:
                                throw new IllegalArgumentException("Cannot interpret '" + c2 + "' as a hexadecimal digit");
                        }
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean[] s(char c2) {
        switch (c2) {
            case '0':
                return (boolean[]) p.clone();
            case '1':
                return (boolean[]) f627o.clone();
            case '2':
                return (boolean[]) n.clone();
            case '3':
                return (boolean[]) m.clone();
            case '4':
                return (boolean[]) l.clone();
            case '5':
                return (boolean[]) k.clone();
            case '6':
                return (boolean[]) j.clone();
            case '7':
                return (boolean[]) i.clone();
            case '8':
                return (boolean[]) h.clone();
            case '9':
                return (boolean[]) g.clone();
            default:
                switch (c2) {
                    case 'A':
                        return (boolean[]) f.clone();
                    case 'B':
                        return (boolean[]) e.clone();
                    case 'C':
                        return (boolean[]) d.clone();
                    case 'D':
                        return (boolean[]) c.clone();
                    case 'E':
                        return (boolean[]) b.clone();
                    case 'F':
                        return (boolean[]) a.clone();
                    default:
                        switch (c2) {
                            case 'a':
                                break;
                            case 'b':
                                break;
                            case 'c':
                                break;
                            case 'd':
                                break;
                            case 'e':
                                break;
                            case 'f':
                                break;
                            default:
                                throw new IllegalArgumentException("Cannot interpret '" + c2 + "' as a hexadecimal digit");
                        }
                }
        }
    }

    public static int t(char c2) {
        int digit = Character.digit(c2, 16);
        if (digit >= 0) {
            return digit;
        }
        throw new IllegalArgumentException("Cannot interpret '" + c2 + "' as a hexadecimal digit");
    }

    public static byte u(String str, int i2, byte b2, int i3, int i4) {
        if (i4 == 0) {
            return b2;
        }
        if (((i4 - 1) * 4) + i3 < 8) {
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = (i5 * 4) + i3;
                b2 = (byte) ((b2 & (~(15 << i6))) | ((t(str.charAt(i5 + i2)) & 15) << i6));
            }
            return b2;
        }
        throw new IllegalArgumentException("(nHexs-1)*4+dstPos is greater or equal to than 8");
    }

    public static int v(String str, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return i3;
        }
        if (((i5 - 1) * 4) + i4 < 32) {
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = (i6 * 4) + i4;
                i3 = (i3 & (~(15 << i7))) | ((t(str.charAt(i6 + i2)) & 15) << i7);
            }
            return i3;
        }
        throw new IllegalArgumentException("(nHexs-1)*4+dstPos is greater or equal to than 32");
    }

    public static long w(String str, int i2, long j2, int i3, int i4) {
        if (i4 == 0) {
            return j2;
        }
        if (((i4 - 1) * 4) + i3 < 64) {
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = (i5 * 4) + i3;
                j2 = (j2 & (~(15 << i6))) | ((t(str.charAt(i5 + i2)) & 15) << i6);
            }
            return j2;
        }
        throw new IllegalArgumentException("(nHexs-1)*4+dstPos is greater or equal to than 64");
    }

    public static short x(String str, int i2, short s, int i3, int i4) {
        if (i4 == 0) {
            return s;
        }
        if (((i4 - 1) * 4) + i3 < 16) {
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = (i5 * 4) + i3;
                s = (short) ((s & (~(15 << i6))) | ((t(str.charAt(i5 + i2)) & 15) << i6));
            }
            return s;
        }
        throw new IllegalArgumentException("(nHexs-1)*4+dstPos is greater or equal to than 16");
    }

    public static long y(int[] iArr, int i2, long j2, int i3, int i4) {
        if ((iArr.length == 0 && i2 == 0) || i4 == 0) {
            return j2;
        }
        if (((i4 - 1) * 32) + i3 < 64) {
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = (i5 * 32) + i3;
                j2 = (j2 & (~(4294967295 << i6))) | ((iArr[i5 + i2] & 4294967295L) << i6);
            }
            return j2;
        }
        throw new IllegalArgumentException("(nInts-1)*32+dstPos is greater or equal to than 64");
    }

    public static boolean[] z(int i2, int i3, boolean[] zArr, int i4, int i5) {
        if (i5 != 0) {
            if ((i5 - 1) + i3 < 32) {
                for (int i6 = 0; i6 < i5; i6++) {
                    int i7 = i4 + i6;
                    boolean z = true;
                    if (((i2 >> (i6 + i3)) & 1) == 0) {
                        z = false;
                    }
                    zArr[i7] = z;
                }
            } else {
                throw new IllegalArgumentException("nBools-1+srcPos is greater or equal to than 32");
            }
        }
        return zArr;
    }
}
