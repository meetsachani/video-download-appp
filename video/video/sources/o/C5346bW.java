package o;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: o.bW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5346bW {
    public static final char[] a = {'*', '*', '*', ' ', C3599Ly1.j, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', C3599Ly1.i, 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    public static final char[] b;
    public static final char[] c;
    public static final char[] d;
    public static final char[] e;

    /* renamed from: o.bW$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: o.bW$b */
    /* loaded from: classes3.dex */
    public enum b {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', C10928yK2.l, '<', '=', '>', '?', C11304zt1.a, '[', '\\', ']', '^', '_'};
        b = cArr;
        c = new char[]{'*', '*', '*', ' ', C3599Ly1.j, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        d = cArr;
        e = new char[]{'`', 'A', 'B', 'C', 'D', C3599Ly1.i, 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', C8077mf.N};
    }

    public static C9753tW a(byte[] bArr) throws C2605Bx0 {
        C2861En c2861En = new C2861En(bArr);
        StringBuilder sb = new StringBuilder(100);
        StringBuilder sb2 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        b bVar = b.ASCII_ENCODE;
        do {
            b bVar2 = b.ASCII_ENCODE;
            if (bVar == bVar2) {
                bVar = c(c2861En, sb, sb2);
            } else {
                int i = a.a[bVar.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5) {
                                    d(c2861En, sb, arrayList);
                                } else {
                                    throw C2605Bx0.a();
                                }
                            } else {
                                f(c2861En, sb);
                            }
                        } else {
                            b(c2861En, sb);
                        }
                    } else {
                        g(c2861En, sb);
                    }
                } else {
                    e(c2861En, sb);
                }
                bVar = bVar2;
            }
            if (bVar == b.PAD_ENCODE) {
                break;
            }
        } while (c2861En.a() > 0);
        if (sb2.length() > 0) {
            sb.append((CharSequence) sb2);
        }
        String sb3 = sb.toString();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new C9753tW(bArr, sb3, arrayList, null);
    }

    public static void b(C2861En c2861En, StringBuilder sb) throws C2605Bx0 {
        int d2;
        int[] iArr = new int[3];
        while (c2861En.a() != 8 && (d2 = c2861En.d(8)) != 254) {
            h(d2, c2861En.d(8), iArr);
            for (int i = 0; i < 3; i++) {
                int i2 = iArr[i];
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 < 14) {
                                    sb.append((char) (i2 + 44));
                                } else if (i2 < 40) {
                                    sb.append((char) (i2 + 51));
                                } else {
                                    throw C2605Bx0.a();
                                }
                            } else {
                                sb.append(' ');
                            }
                        } else {
                            sb.append('>');
                        }
                    } else {
                        sb.append('*');
                    }
                } else {
                    sb.append(C8206nB.d);
                }
            }
            if (c2861En.a() <= 0) {
                return;
            }
        }
    }

    public static b c(C2861En c2861En, StringBuilder sb, StringBuilder sb2) throws C2605Bx0 {
        boolean z = false;
        do {
            int d2 = c2861En.d(8);
            if (d2 != 0) {
                if (d2 <= 128) {
                    if (z) {
                        d2 += 128;
                    }
                    sb.append((char) (d2 - 1));
                    return b.ASCII_ENCODE;
                } else if (d2 == 129) {
                    return b.PAD_ENCODE;
                } else {
                    if (d2 <= 229) {
                        int i = d2 - 130;
                        if (i < 10) {
                            sb.append(C3599Ly1.j);
                        }
                        sb.append(i);
                    } else {
                        switch (d2) {
                            case 230:
                                return b.C40_ENCODE;
                            case C10997yd1.n1 /* 231 */:
                                return b.BASE256_ENCODE;
                            case 232:
                                sb.append(C5588cW.f706o);
                                break;
                            case 233:
                            case 234:
                            case C10997yd1.o2 /* 241 */:
                                break;
                            case 235:
                                z = true;
                                break;
                            case 236:
                                sb.append(KH0.l);
                                sb2.insert(0, KH0.n);
                                break;
                            case 237:
                                sb.append(KH0.m);
                                sb2.insert(0, KH0.n);
                                break;
                            case C10997yd1.u1 /* 238 */:
                                return b.ANSIX12_ENCODE;
                            case 239:
                                return b.TEXT_ENCODE;
                            case 240:
                                return b.EDIFACT_ENCODE;
                            default:
                                if (d2 != 254 || c2861En.a() != 0) {
                                    throw C2605Bx0.a();
                                }
                                break;
                        }
                    }
                }
            } else {
                throw C2605Bx0.a();
            }
        } while (c2861En.a() > 0);
        return b.ASCII_ENCODE;
    }

    public static void d(C2861En c2861En, StringBuilder sb, Collection<byte[]> collection) throws C2605Bx0 {
        int c2 = c2861En.c();
        int i = c2 + 2;
        int i2 = i(c2861En.d(8), c2 + 1);
        if (i2 == 0) {
            i2 = c2861En.a() / 8;
        } else if (i2 >= 250) {
            i2 = ((i2 - 249) * 250) + i(c2861En.d(8), i);
            i = c2 + 3;
        }
        if (i2 >= 0) {
            byte[] bArr = new byte[i2];
            int i3 = 0;
            while (i3 < i2) {
                if (c2861En.a() >= 8) {
                    bArr[i3] = (byte) i(c2861En.d(8), i);
                    i3++;
                    i++;
                } else {
                    throw C2605Bx0.a();
                }
            }
            collection.add(bArr);
            try {
                sb.append(new String(bArr, C4597We2.f));
                return;
            } catch (UnsupportedEncodingException e2) {
                throw new IllegalStateException("Platform does not support required encoding: ".concat(String.valueOf(e2)));
            }
        }
        throw C2605Bx0.a();
    }

    public static void e(C2861En c2861En, StringBuilder sb) throws C2605Bx0 {
        int d2;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (c2861En.a() != 8 && (d2 = c2861En.d(8)) != 254) {
            h(d2, c2861En.d(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                if (z) {
                                    sb.append((char) (i3 + 224));
                                    z = false;
                                    i = 0;
                                } else {
                                    sb.append((char) (i3 + 96));
                                    i = 0;
                                }
                            } else {
                                throw C2605Bx0.a();
                            }
                        } else {
                            char[] cArr = b;
                            if (i3 < cArr.length) {
                                char c2 = cArr[i3];
                                if (z) {
                                    sb.append((char) (c2 + 128));
                                    z = false;
                                } else {
                                    sb.append(c2);
                                }
                            } else if (i3 != 27) {
                                if (i3 == 30) {
                                    z = true;
                                } else {
                                    throw C2605Bx0.a();
                                }
                            } else {
                                sb.append(C5588cW.f706o);
                            }
                            i = 0;
                        }
                    } else if (z) {
                        sb.append((char) (i3 + 128));
                        z = false;
                        i = 0;
                    } else {
                        sb.append((char) i3);
                        i = 0;
                    }
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr2 = a;
                    if (i3 < cArr2.length) {
                        char c3 = cArr2[i3];
                        if (z) {
                            sb.append((char) (c3 + 128));
                            z = false;
                        } else {
                            sb.append(c3);
                        }
                    } else {
                        throw C2605Bx0.a();
                    }
                }
            }
            if (c2861En.a() <= 0) {
                return;
            }
        }
    }

    public static void f(C2861En c2861En, StringBuilder sb) {
        while (c2861En.a() > 16) {
            for (int i = 0; i < 4; i++) {
                int d2 = c2861En.d(6);
                if (d2 == 31) {
                    int b2 = 8 - c2861En.b();
                    if (b2 != 8) {
                        c2861En.d(b2);
                        return;
                    }
                    return;
                }
                if ((d2 & 32) == 0) {
                    d2 |= 64;
                }
                sb.append((char) d2);
            }
            if (c2861En.a() <= 0) {
                return;
            }
        }
    }

    public static void g(C2861En c2861En, StringBuilder sb) throws C2605Bx0 {
        int d2;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (c2861En.a() != 8 && (d2 = c2861En.d(8)) != 254) {
            h(d2, c2861En.d(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                char[] cArr = e;
                                if (i3 < cArr.length) {
                                    char c2 = cArr[i3];
                                    if (z) {
                                        sb.append((char) (c2 + 128));
                                        z = false;
                                        i = 0;
                                    } else {
                                        sb.append(c2);
                                        i = 0;
                                    }
                                } else {
                                    throw C2605Bx0.a();
                                }
                            } else {
                                throw C2605Bx0.a();
                            }
                        } else {
                            char[] cArr2 = d;
                            if (i3 < cArr2.length) {
                                char c3 = cArr2[i3];
                                if (z) {
                                    sb.append((char) (c3 + 128));
                                    z = false;
                                } else {
                                    sb.append(c3);
                                }
                            } else if (i3 != 27) {
                                if (i3 == 30) {
                                    z = true;
                                } else {
                                    throw C2605Bx0.a();
                                }
                            } else {
                                sb.append(C5588cW.f706o);
                            }
                            i = 0;
                        }
                    } else if (z) {
                        sb.append((char) (i3 + 128));
                        z = false;
                        i = 0;
                    } else {
                        sb.append((char) i3);
                        i = 0;
                    }
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr3 = c;
                    if (i3 < cArr3.length) {
                        char c4 = cArr3[i3];
                        if (z) {
                            sb.append((char) (c4 + 128));
                            z = false;
                        } else {
                            sb.append(c4);
                        }
                    } else {
                        throw C2605Bx0.a();
                    }
                }
            }
            if (c2861En.a() <= 0) {
                return;
            }
        }
    }

    public static void h(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        int i5 = i3 - (i4 * 1600);
        int i6 = i5 / 40;
        iArr[1] = i6;
        iArr[2] = i5 - (i6 * 40);
    }

    public static int i(int i, int i2) {
        int i3 = i - (((i2 * 149) % 255) + 1);
        if (i3 >= 0) {
            return i3;
        }
        return i3 + 256;
    }
}
