package o;

import com.facebook.internal.H;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8046mW0(name = "-ByteString")
@InterfaceC8303na2({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/internal/-ByteString\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Utf8.kt\nokio/Utf8\n*L\n1#1,363:1\n131#1,2:369\n133#1,9:372\n68#2:364\n74#2:365\n74#2:367\n74#2:368\n68#2:396\n74#2:408\n1#3:366\n1#3:371\n212#4,7:381\n122#4:388\n219#4,5:389\n122#4:394\n226#4:395\n228#4:397\n397#4,2:398\n122#4:400\n400#4,6:401\n127#4:407\n406#4:409\n122#4:410\n407#4,13:411\n122#4:424\n422#4:425\n122#4:426\n425#4:427\n230#4,3:428\n440#4,3:431\n122#4:434\n443#4:435\n127#4:436\n446#4,10:437\n127#4:447\n456#4:448\n122#4:449\n457#4,4:450\n127#4:454\n461#4:455\n122#4:456\n462#4,14:457\n122#4:471\n477#4,2:472\n122#4:474\n481#4:475\n122#4:476\n484#4:477\n234#4,3:478\n500#4,3:481\n122#4:484\n503#4:485\n127#4:486\n506#4,2:487\n127#4:489\n510#4,10:490\n127#4:500\n520#4:501\n122#4:502\n521#4,4:503\n127#4:507\n525#4:508\n122#4:509\n526#4,4:510\n127#4:514\n530#4:515\n122#4:516\n531#4,15:517\n122#4:532\n547#4,2:533\n122#4:535\n550#4,2:536\n122#4:538\n554#4:539\n122#4:540\n557#4:541\n241#4:542\n122#4:543\n242#4,5:544\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/internal/-ByteString\n*L\n329#1:369,2\n329#1:372,9\n67#1:364\n68#1:365\n258#1:367\n259#1:368\n348#1:396\n348#1:408\n329#1:371\n348#1:381,7\n353#1:388\n348#1:389,5\n353#1:394\n348#1:395\n348#1:397\n348#1:398,2\n353#1:400\n348#1:401,6\n348#1:407\n348#1:409\n353#1:410\n348#1:411,13\n353#1:424\n348#1:425\n353#1:426\n348#1:427\n348#1:428,3\n348#1:431,3\n353#1:434\n348#1:435\n348#1:436\n348#1:437,10\n348#1:447\n348#1:448\n353#1:449\n348#1:450,4\n348#1:454\n348#1:455\n353#1:456\n348#1:457,14\n353#1:471\n348#1:472,2\n353#1:474\n348#1:475\n353#1:476\n348#1:477\n348#1:478,3\n348#1:481,3\n353#1:484\n348#1:485\n348#1:486\n348#1:487,2\n348#1:489\n348#1:490,10\n348#1:500\n348#1:501\n353#1:502\n348#1:503,4\n348#1:507\n348#1:508\n353#1:509\n348#1:510,4\n348#1:514\n348#1:515\n353#1:516\n348#1:517,15\n353#1:532\n348#1:533,2\n353#1:535\n348#1:536,2\n353#1:538\n348#1:539\n353#1:540\n348#1:541\n348#1:542\n353#1:543\n348#1:544,5\n*E\n"})
/* renamed from: o.c */
/* loaded from: classes4.dex */
public final class C5461c {
    @NotNull
    public static final char[] a = {C3599Ly1.j, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @NotNull
    public static final C8859ps A(@NotNull C8859ps c8859ps, int i, int i2) {
        C6562gT0.p(c8859ps, "<this>");
        int l = C8648p.l(c8859ps, i2);
        if (i >= 0) {
            if (l <= c8859ps.w().length) {
                if (l - i >= 0) {
                    if (i == 0 && l == c8859ps.w().length) {
                        return c8859ps;
                    }
                    return new C8859ps(C4788Ye.f1(c8859ps.w(), i, l));
                }
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            throw new IllegalArgumentException(("endIndex > length(" + c8859ps.w().length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    @NotNull
    public static final C8859ps B(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "<this>");
        for (int i = 0; i < c8859ps.w().length; i++) {
            byte b = c8859ps.w()[i];
            if (b >= 65 && b <= 90) {
                byte[] w = c8859ps.w();
                byte[] copyOf = Arrays.copyOf(w, w.length);
                C6562gT0.o(copyOf, "copyOf(this, size)");
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new C8859ps(copyOf);
            }
        }
        return c8859ps;
    }

    @NotNull
    public static final C8859ps C(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "<this>");
        for (int i = 0; i < c8859ps.w().length; i++) {
            byte b = c8859ps.w()[i];
            if (b >= 97 && b <= 122) {
                byte[] w = c8859ps.w();
                byte[] copyOf = Arrays.copyOf(w, w.length);
                C6562gT0.o(copyOf, "copyOf(this, size)");
                copyOf[i] = (byte) (b - 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 97 && b2 <= 122) {
                        copyOf[i2] = (byte) (b2 - 32);
                    }
                }
                return new C8859ps(copyOf);
            }
        }
        return c8859ps;
    }

    @NotNull
    public static final byte[] D(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "<this>");
        byte[] w = c8859ps.w();
        byte[] copyOf = Arrays.copyOf(w, w.length);
        C6562gT0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @NotNull
    public static final C8859ps E(@NotNull byte[] bArr, int i, int i2) {
        C6562gT0.p(bArr, "<this>");
        int m = C8648p.m(bArr, i2);
        C8648p.e(bArr.length, i, m);
        return new C8859ps(C4788Ye.f1(bArr, i, m + i));
    }

    @NotNull
    public static final String F(@NotNull C8859ps c8859ps) {
        C8859ps c8859ps2 = c8859ps;
        C6562gT0.p(c8859ps2, "<this>");
        if (c8859ps2.w().length != 0) {
            int c = c(c8859ps2.w(), 64);
            if (c == -1) {
                if (c8859ps2.w().length <= 64) {
                    return "[hex=" + c8859ps2.A() + ']';
                }
                StringBuilder sb = new StringBuilder();
                sb.append("[size=");
                sb.append(c8859ps2.w().length);
                sb.append(" hex=");
                int l = C8648p.l(c8859ps2, 64);
                if (l <= c8859ps2.w().length) {
                    if (l >= 0) {
                        if (l != c8859ps2.w().length) {
                            c8859ps2 = new C8859ps(C4788Ye.f1(c8859ps2.w(), 0, l));
                        }
                        sb.append(c8859ps2.A());
                        sb.append("…]");
                        return sb.toString();
                    }
                    throw new IllegalArgumentException("endIndex < beginIndex");
                }
                throw new IllegalArgumentException(("endIndex > length(" + c8859ps2.w().length + ')').toString());
            }
            String s0 = c8859ps2.s0();
            String substring = s0.substring(0, c);
            C6562gT0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String z2 = C9545sf2.z2(C9545sf2.z2(C9545sf2.z2(substring, C11298zs.h, "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (c < s0.length()) {
                return "[size=" + c8859ps2.w().length + " text=" + z2 + "…]";
            }
            return "[text=" + z2 + ']';
        }
        return "[size=0]";
    }

    @NotNull
    public static final String G(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "<this>");
        String z = c8859ps.z();
        if (z == null) {
            String c = GO2.c(c8859ps.L());
            c8859ps.c0(c);
            return c;
        }
        return z;
    }

    public static final void H(@NotNull C8859ps c8859ps, @NotNull C5422bq c5422bq, int i, int i2) {
        C6562gT0.p(c8859ps, "<this>");
        C6562gT0.p(c5422bq, H.a.b);
        c5422bq.write(c8859ps.w(), i, i2);
    }

    public static final int I(char c) {
        if ('0' <= c && c < ':') {
            return c - C3599Ly1.j;
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    @NotNull
    public static final char[] J() {
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:429:0x01ac, code lost:
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int c(byte[] bArr, int i) {
        int i2;
        byte b;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int length = bArr.length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        loop0: while (true) {
            if (i8 >= length) {
                break;
            }
            byte b2 = bArr[i8];
            if (b2 >= 0) {
                int i11 = i10 + 1;
                if (i10 == i) {
                    break;
                } else if ((b2 == 10 || b2 == 13 || ((b2 < 0 || b2 >= 32) && (Byte.MAX_VALUE > b2 || b2 >= 160))) && b2 != 65533) {
                    if (b2 < 65536) {
                        i2 = 1;
                    } else {
                        i2 = 2;
                    }
                    i9 += i2;
                    i8++;
                    while (true) {
                        i10 = i11;
                        if (i8 < length && (b = bArr[i8]) >= 0) {
                            i8++;
                            i11 = i10 + 1;
                            if (i10 == i) {
                                return i9;
                            }
                            if ((b == 10 || b == 13 || ((b < 0 || b >= 32) && (Byte.MAX_VALUE > b || b >= 160))) && b != 65533) {
                                if (b < 65536) {
                                    i3 = 1;
                                } else {
                                    i3 = 2;
                                }
                                i9 += i3;
                            }
                        }
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i12 = i8 + 1;
                if (length <= i12) {
                    if (i10 == i) {
                        break;
                    }
                    return -1;
                }
                byte b3 = bArr[i12];
                if ((b3 & C2638Cg0.o7) == 128) {
                    int i13 = (b2 << 6) ^ (b3 ^ 3968);
                    if (i13 < 128) {
                        if (i10 == i) {
                            break;
                        }
                        return -1;
                    }
                    int i14 = i10 + 1;
                    if (i10 == i) {
                        break;
                    } else if ((i13 == 10 || i13 == 13 || ((i13 < 0 || i13 >= 32) && (127 > i13 || i13 >= 160))) && i13 != 65533) {
                        if (i13 < 65536) {
                            i4 = 1;
                        } else {
                            i4 = 2;
                        }
                        i9 += i4;
                        C7458kA2 c7458kA2 = C7458kA2.a;
                        i8 += 2;
                        i10 = i14;
                    }
                } else if (i10 == i) {
                    break;
                } else {
                    return -1;
                }
            } else if ((b2 >> 4) == -2) {
                int i15 = i8 + 2;
                if (length <= i15) {
                    if (i10 == i) {
                        break;
                    }
                    return -1;
                }
                byte b4 = bArr[i8 + 1];
                if ((b4 & C2638Cg0.o7) == 128) {
                    byte b5 = bArr[i15];
                    if ((b5 & C2638Cg0.o7) == 128) {
                        int i16 = (b2 << C8077mf.n) ^ ((b5 ^ (-123008)) ^ (b4 << 6));
                        if (i16 < 2048) {
                            if (i10 == i) {
                                break;
                            }
                            return -1;
                        } else if (55296 <= i16 && i16 < 57344) {
                            if (i10 == i) {
                                break;
                            }
                            return -1;
                        } else {
                            i5 = i10 + 1;
                            if (i10 == i) {
                                break;
                            } else if ((i16 == 10 || i16 == 13 || ((i16 < 0 || i16 >= 32) && (127 > i16 || i16 >= 160))) && i16 != 65533) {
                                if (i16 < 65536) {
                                    i7 = 1;
                                } else {
                                    i7 = 2;
                                }
                                i9 += i7;
                                C7458kA2 c7458kA22 = C7458kA2.a;
                                i8 += 3;
                                i10 = i5;
                            }
                        }
                    } else if (i10 == i) {
                        break;
                    } else {
                        return -1;
                    }
                } else if (i10 == i) {
                    break;
                } else {
                    return -1;
                }
            } else if ((b2 >> 3) == -2) {
                int i17 = i8 + 3;
                if (length <= i17) {
                    if (i10 == i) {
                        break;
                    }
                    return -1;
                }
                byte b6 = bArr[i8 + 1];
                if ((b6 & C2638Cg0.o7) == 128) {
                    byte b7 = bArr[i8 + 2];
                    if ((b7 & C2638Cg0.o7) == 128) {
                        byte b8 = bArr[i17];
                        if ((b8 & C2638Cg0.o7) == 128) {
                            int i18 = (b2 << C8077mf.u) ^ (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << C8077mf.n));
                            if (i18 > 1114111) {
                                if (i10 == i) {
                                    break;
                                }
                                return -1;
                            } else if (55296 <= i18 && i18 < 57344) {
                                if (i10 == i) {
                                    break;
                                }
                                return -1;
                            } else if (i18 < 65536) {
                                if (i10 == i) {
                                    break;
                                }
                                return -1;
                            } else {
                                i5 = i10 + 1;
                                if (i10 == i) {
                                    break;
                                } else if ((i18 == 10 || i18 == 13 || ((i18 < 0 || i18 >= 32) && (127 > i18 || i18 >= 160))) && i18 != 65533) {
                                    if (i18 < 65536) {
                                        i6 = 1;
                                    } else {
                                        i6 = 2;
                                    }
                                    i9 += i6;
                                    C7458kA2 c7458kA23 = C7458kA2.a;
                                    i8 += 4;
                                    i10 = i5;
                                }
                            }
                        } else if (i10 == i) {
                            break;
                        } else {
                            return -1;
                        }
                    } else if (i10 == i) {
                        break;
                    } else {
                        return -1;
                    }
                } else if (i10 == i) {
                    break;
                } else {
                    return -1;
                }
            } else if (i10 == i) {
                break;
            } else {
                return -1;
            }
        }
        return -1;
    }

    @NotNull
    public static final String d(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "<this>");
        return C4976a.c(c8859ps.w(), null, 1, null);
    }

    @NotNull
    public static final String e(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "<this>");
        return C4976a.b(c8859ps.w(), C4976a.f());
    }

    public static final int f(@NotNull C8859ps c8859ps, @NotNull C8859ps c8859ps2) {
        C6562gT0.p(c8859ps, "<this>");
        C6562gT0.p(c8859ps2, "other");
        int g0 = c8859ps.g0();
        int g02 = c8859ps2.g0();
        int min = Math.min(g0, g02);
        for (int i = 0; i < min; i++) {
            int v = c8859ps.v(i) & 255;
            int v2 = c8859ps2.v(i) & 255;
            if (v != v2) {
                if (v < v2) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
        if (g0 == g02) {
            return 0;
        }
        if (g0 < g02) {
            return -1;
        }
        return 1;
    }

    public static final void g(@NotNull C8859ps c8859ps, int i, @NotNull byte[] bArr, int i2, int i3) {
        C6562gT0.p(c8859ps, "<this>");
        C6562gT0.p(bArr, "target");
        C4788Ye.v0(c8859ps.w(), bArr, i2, i, i3 + i);
    }

    @Nullable
    public static final C8859ps h(@NotNull String str) {
        C6562gT0.p(str, "<this>");
        byte[] a2 = C4976a.a(str);
        if (a2 != null) {
            return new C8859ps(a2);
        }
        return null;
    }

    @NotNull
    public static final C8859ps i(@NotNull String str) {
        C6562gT0.p(str, "<this>");
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((I(str.charAt(i2)) << 4) + I(str.charAt(i2 + 1)));
            }
            return new C8859ps(bArr);
        }
        throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
    }

    @NotNull
    public static final C8859ps j(@NotNull String str) {
        C6562gT0.p(str, "<this>");
        C8859ps c8859ps = new C8859ps(GO2.a(str));
        c8859ps.c0(str);
        return c8859ps;
    }

    public static final boolean k(@NotNull C8859ps c8859ps, @NotNull C8859ps c8859ps2) {
        C6562gT0.p(c8859ps, "<this>");
        C6562gT0.p(c8859ps2, "suffix");
        return c8859ps.X(c8859ps.g0() - c8859ps2.g0(), c8859ps2, 0, c8859ps2.g0());
    }

    public static final boolean l(@NotNull C8859ps c8859ps, @NotNull byte[] bArr) {
        C6562gT0.p(c8859ps, "<this>");
        C6562gT0.p(bArr, "suffix");
        return c8859ps.Y(c8859ps.g0() - bArr.length, bArr, 0, bArr.length);
    }

    public static final boolean m(@NotNull C8859ps c8859ps, @Nullable Object obj) {
        C6562gT0.p(c8859ps, "<this>");
        if (obj == c8859ps) {
            return true;
        }
        if (obj instanceof C8859ps) {
            C8859ps c8859ps2 = (C8859ps) obj;
            if (c8859ps2.g0() == c8859ps.w().length && c8859ps2.Y(0, c8859ps.w(), 0, c8859ps.w().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte n(@NotNull C8859ps c8859ps, int i) {
        C6562gT0.p(c8859ps, "<this>");
        return c8859ps.w()[i];
    }

    public static final int o(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "<this>");
        return c8859ps.w().length;
    }

    public static final int p(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "<this>");
        int x = c8859ps.x();
        if (x != 0) {
            return x;
        }
        int hashCode = Arrays.hashCode(c8859ps.w());
        c8859ps.b0(hashCode);
        return hashCode;
    }

    @NotNull
    public static final String q(@NotNull C8859ps c8859ps) {
        byte[] w;
        C6562gT0.p(c8859ps, "<this>");
        char[] cArr = new char[c8859ps.w().length * 2];
        int i = 0;
        for (byte b : c8859ps.w()) {
            int i2 = i + 1;
            cArr[i] = J()[(b >> 4) & 15];
            i += 2;
            cArr[i2] = J()[b & C8077mf.q];
        }
        return C9545sf2.L1(cArr);
    }

    public static final int r(@NotNull C8859ps c8859ps, @NotNull byte[] bArr, int i) {
        C6562gT0.p(c8859ps, "<this>");
        C6562gT0.p(bArr, "other");
        int length = c8859ps.w().length - bArr.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!C8648p.d(c8859ps.w(), max, bArr, 0, bArr.length)) {
                if (max != length) {
                    max++;
                } else {
                    return -1;
                }
            }
            return max;
        }
        return -1;
    }

    @NotNull
    public static final byte[] s(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "<this>");
        return c8859ps.w();
    }

    public static final int t(@NotNull C8859ps c8859ps, @NotNull C8859ps c8859ps2, int i) {
        C6562gT0.p(c8859ps, "<this>");
        C6562gT0.p(c8859ps2, "other");
        return c8859ps.Q(c8859ps2.L(), i);
    }

    public static final int u(@NotNull C8859ps c8859ps, @NotNull byte[] bArr, int i) {
        C6562gT0.p(c8859ps, "<this>");
        C6562gT0.p(bArr, "other");
        for (int min = Math.min(C8648p.l(c8859ps, i), c8859ps.w().length - bArr.length); -1 < min; min--) {
            if (C8648p.d(c8859ps.w(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    @NotNull
    public static final C8859ps v(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "data");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C6562gT0.o(copyOf, "copyOf(this, size)");
        return new C8859ps(copyOf);
    }

    public static final boolean w(@NotNull C8859ps c8859ps, int i, @NotNull C8859ps c8859ps2, int i2, int i3) {
        C6562gT0.p(c8859ps, "<this>");
        C6562gT0.p(c8859ps2, "other");
        return c8859ps2.Y(i2, c8859ps.w(), i, i3);
    }

    public static final boolean x(@NotNull C8859ps c8859ps, int i, @NotNull byte[] bArr, int i2, int i3) {
        C6562gT0.p(c8859ps, "<this>");
        C6562gT0.p(bArr, "other");
        if (i >= 0 && i <= c8859ps.w().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C8648p.d(c8859ps.w(), i, bArr, i2, i3)) {
            return true;
        }
        return false;
    }

    public static final boolean y(@NotNull C8859ps c8859ps, @NotNull C8859ps c8859ps2) {
        C6562gT0.p(c8859ps, "<this>");
        C6562gT0.p(c8859ps2, "prefix");
        return c8859ps.X(0, c8859ps2, 0, c8859ps2.g0());
    }

    public static final boolean z(@NotNull C8859ps c8859ps, @NotNull byte[] bArr) {
        C6562gT0.p(c8859ps, "<this>");
        C6562gT0.p(bArr, "prefix");
        return c8859ps.Y(0, bArr, 0, bArr.length);
    }

    public static /* synthetic */ void K() {
    }
}
