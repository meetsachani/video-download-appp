package o;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\n-Utf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n+ 2 Utf8.kt\nokio/Utf8\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,60:1\n260#2,16:61\n277#2:78\n397#2,9:79\n127#2:88\n406#2,20:90\n279#2,3:110\n440#2,4:113\n127#2:117\n446#2,10:118\n127#2:128\n456#2,5:129\n127#2:134\n461#2,24:135\n283#2,3:159\n500#2,3:162\n286#2,12:165\n503#2:177\n127#2:178\n506#2,2:179\n127#2:181\n510#2,10:182\n127#2:192\n520#2,5:193\n127#2:198\n525#2,5:199\n127#2:204\n530#2,28:205\n302#2,6:233\n138#2,67:239\n68#3:77\n74#3:89\n*S KotlinDebug\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n*L\n34#1:61,16\n34#1:78\n34#1:79,9\n34#1:88\n34#1:90,20\n34#1:110,3\n34#1:113,4\n34#1:117\n34#1:118,10\n34#1:128\n34#1:129,5\n34#1:134\n34#1:135,24\n34#1:159,3\n34#1:162,3\n34#1:165,12\n34#1:177\n34#1:178\n34#1:179,2\n34#1:181\n34#1:182,10\n34#1:192\n34#1:193,5\n34#1:198\n34#1:199,5\n34#1:204\n34#1:205,28\n34#1:233,6\n50#1:239,67\n34#1:77\n34#1:89\n*E\n"})
/* loaded from: classes4.dex */
public final class IO2 {
    @NotNull
    public static final byte[] a(@NotNull String str) {
        int i;
        char charAt;
        C6562gT0.p(str, "<this>");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char charAt2 = str.charAt(i2);
            if (C6562gT0.t(charAt2, 128) >= 0) {
                int length2 = str.length();
                int i3 = i2;
                while (i2 < length2) {
                    char charAt3 = str.charAt(i2);
                    if (C6562gT0.t(charAt3, 128) < 0) {
                        int i4 = i3 + 1;
                        bArr[i3] = (byte) charAt3;
                        i2++;
                        while (true) {
                            i3 = i4;
                            if (i2 < length2 && C6562gT0.t(str.charAt(i2), 128) < 0) {
                                i4 = i3 + 1;
                                bArr[i3] = (byte) str.charAt(i2);
                                i2++;
                            }
                        }
                    } else {
                        if (C6562gT0.t(charAt3, 2048) < 0) {
                            bArr[i3] = (byte) ((charAt3 >> 6) | CK1.x);
                            i3 += 2;
                            bArr[i3 + 1] = (byte) ((charAt3 & '?') | 128);
                        } else if (55296 <= charAt3 && charAt3 < 57344) {
                            if (C6562gT0.t(charAt3, 56319) <= 0 && length2 > (i = i2 + 1) && 56320 <= (charAt = str.charAt(i)) && charAt < 57344) {
                                int charAt4 = ((charAt3 << '\n') + str.charAt(i)) - 56613888;
                                bArr[i3] = (byte) ((charAt4 >> 18) | 240);
                                bArr[i3 + 1] = (byte) (((charAt4 >> 12) & 63) | 128);
                                bArr[i3 + 2] = (byte) (((charAt4 >> 6) & 63) | 128);
                                i3 += 4;
                                bArr[i3 + 3] = (byte) ((charAt4 & 63) | 128);
                                i2 += 2;
                            } else {
                                bArr[i3] = ED2.a;
                                i2++;
                                i3++;
                            }
                        } else {
                            bArr[i3] = (byte) ((charAt3 >> '\f') | 224);
                            bArr[i3 + 1] = (byte) (((charAt3 >> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i3 + 2] = (byte) ((charAt3 & '?') | 128);
                        }
                        i2++;
                    }
                }
                byte[] copyOf = Arrays.copyOf(bArr, i3);
                C6562gT0.o(copyOf, "copyOf(this, newSize)");
                return copyOf;
            }
            bArr[i2] = (byte) charAt2;
            i2++;
        }
        byte[] copyOf2 = Arrays.copyOf(bArr, str.length());
        C6562gT0.o(copyOf2, "copyOf(this, newSize)");
        return copyOf2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
        if ((r16[r5] & o.C2638Cg0.o7) == 128) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00fc, code lost:
        if ((r16[r5] & o.C2638Cg0.o7) == 128) goto L32;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String b(@NotNull byte[] bArr, int i, int i2) {
        byte b;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        C6562gT0.p(bArr, "<this>");
        if (i8 >= 0 && i2 <= bArr.length && i8 <= i2) {
            char[] cArr = new char[i2 - i8];
            int i9 = 0;
            while (i8 < i2) {
                byte b2 = bArr[i8];
                if (b2 >= 0) {
                    int i10 = i9 + 1;
                    cArr[i9] = (char) b2;
                    i8++;
                    while (true) {
                        i9 = i10;
                        if (i8 < i2 && (b = bArr[i8]) >= 0) {
                            i8++;
                            i10 = i9 + 1;
                            cArr[i9] = (char) b;
                        }
                    }
                } else {
                    if ((b2 >> 5) == -2) {
                        int i11 = i8 + 1;
                        if (i2 <= i11) {
                            i3 = i9 + 1;
                            cArr[i9] = (char) ED2.c;
                        } else {
                            byte b3 = bArr[i11];
                            if ((b3 & C2638Cg0.o7) == 128) {
                                int i12 = (b2 << 6) ^ (b3 ^ 3968);
                                if (i12 < 128) {
                                    i3 = i9 + 1;
                                    cArr[i9] = (char) ED2.c;
                                } else {
                                    i3 = i9 + 1;
                                    cArr[i9] = (char) i12;
                                }
                                C7458kA2 c7458kA2 = C7458kA2.a;
                                i9 = i3;
                                i4 = 2;
                            } else {
                                i3 = i9 + 1;
                                cArr[i9] = (char) ED2.c;
                            }
                        }
                        C7458kA2 c7458kA22 = C7458kA2.a;
                        i9 = i3;
                        i4 = 1;
                    } else {
                        if ((b2 >> 4) == -2) {
                            int i13 = i8 + 2;
                            if (i2 <= i13) {
                                i3 = i9 + 1;
                                cArr[i9] = (char) ED2.c;
                                C7458kA2 c7458kA23 = C7458kA2.a;
                                int i14 = i8 + 1;
                                if (i2 > i14) {
                                }
                                i9 = i3;
                                i4 = 1;
                            } else {
                                byte b4 = bArr[i8 + 1];
                                if ((b4 & C2638Cg0.o7) == 128) {
                                    byte b5 = bArr[i13];
                                    if ((b5 & C2638Cg0.o7) == 128) {
                                        int i15 = (b2 << C8077mf.n) ^ ((b5 ^ (-123008)) ^ (b4 << 6));
                                        if (i15 < 2048) {
                                            i5 = i9 + 1;
                                            cArr[i9] = (char) ED2.c;
                                        } else if (55296 <= i15 && i15 < 57344) {
                                            i5 = i9 + 1;
                                            cArr[i9] = (char) ED2.c;
                                        } else {
                                            i5 = i9 + 1;
                                            cArr[i9] = (char) i15;
                                        }
                                        C7458kA2 c7458kA24 = C7458kA2.a;
                                        i9 = i5;
                                    } else {
                                        i3 = i9 + 1;
                                        cArr[i9] = (char) ED2.c;
                                        C7458kA2 c7458kA25 = C7458kA2.a;
                                        i9 = i3;
                                        i4 = 2;
                                    }
                                } else {
                                    i3 = i9 + 1;
                                    cArr[i9] = (char) ED2.c;
                                    C7458kA2 c7458kA26 = C7458kA2.a;
                                    i9 = i3;
                                    i4 = 1;
                                }
                            }
                        } else if ((b2 >> 3) == -2) {
                            int i16 = i8 + 3;
                            if (i2 <= i16) {
                                i6 = i9 + 1;
                                cArr[i9] = 65533;
                                C7458kA2 c7458kA27 = C7458kA2.a;
                                int i17 = i8 + 1;
                                if (i2 > i17 && (bArr[i17] & C2638Cg0.o7) == 128) {
                                    int i18 = i8 + 2;
                                    if (i2 > i18) {
                                    }
                                    i9 = i6;
                                    i4 = 2;
                                }
                                i9 = i6;
                                i4 = 1;
                            } else {
                                byte b6 = bArr[i8 + 1];
                                if ((b6 & C2638Cg0.o7) == 128) {
                                    byte b7 = bArr[i8 + 2];
                                    if ((b7 & C2638Cg0.o7) == 128) {
                                        byte b8 = bArr[i16];
                                        if ((b8 & C2638Cg0.o7) == 128) {
                                            int i19 = (b2 << C8077mf.u) ^ (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << C8077mf.n));
                                            if (i19 > 1114111) {
                                                i7 = i9 + 1;
                                                cArr[i9] = 65533;
                                            } else if (55296 <= i19 && i19 < 57344) {
                                                i7 = i9 + 1;
                                                cArr[i9] = 65533;
                                            } else if (i19 < 65536) {
                                                i7 = i9 + 1;
                                                cArr[i9] = 65533;
                                            } else if (i19 != 65533) {
                                                cArr[i9] = (char) ((i19 >>> 10) + ED2.d);
                                                cArr[i9 + 1] = (char) ((i19 & 1023) + ED2.e);
                                                i7 = i9 + 2;
                                            } else {
                                                i7 = i9 + 1;
                                                cArr[i9] = 65533;
                                            }
                                            C7458kA2 c7458kA28 = C7458kA2.a;
                                            i4 = 4;
                                            i9 = i7;
                                        } else {
                                            i6 = i9 + 1;
                                            cArr[i9] = 65533;
                                            C7458kA2 c7458kA29 = C7458kA2.a;
                                            i9 = i6;
                                        }
                                    } else {
                                        i6 = i9 + 1;
                                        cArr[i9] = 65533;
                                        C7458kA2 c7458kA210 = C7458kA2.a;
                                        i9 = i6;
                                        i4 = 2;
                                    }
                                } else {
                                    i6 = i9 + 1;
                                    cArr[i9] = 65533;
                                    C7458kA2 c7458kA211 = C7458kA2.a;
                                    i9 = i6;
                                    i4 = 1;
                                }
                            }
                        } else {
                            cArr[i9] = 65533;
                            i8++;
                            i9++;
                        }
                        i4 = 3;
                    }
                    i8 += i4;
                }
            }
            return C9545sf2.M1(cArr, 0, i9);
        }
        throw new ArrayIndexOutOfBoundsException("size=" + bArr.length + " beginIndex=" + i8 + " endIndex=" + i2);
    }

    public static /* synthetic */ String c(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        return b(bArr, i, i2);
    }
}
