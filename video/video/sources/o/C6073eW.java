package o;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: o.eW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6073eW {
    public static final char[] a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();
    public static final int b = 1;

    /* renamed from: o.eW$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC6625gk1.values().length];
            a = iArr;
            try {
                iArr[EnumC6625gk1.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC6625gk1.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC6625gk1.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[EnumC6625gk1.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[EnumC6625gk1.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[EnumC6625gk1.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[EnumC6625gk1.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[EnumC6625gk1.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[EnumC6625gk1.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[EnumC6625gk1.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static C9753tW a(byte[] bArr, WE2 we2, EnumC8074me0 enumC8074me0, Map<XV, ?> map) throws C2605Bx0 {
        EnumC6625gk1 e;
        byte[] bArr2 = bArr;
        C2861En c2861En = new C2861En(bArr2);
        StringBuilder sb = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(1);
        String str = null;
        int i = -1;
        int i2 = -1;
        boolean z = false;
        EnumC10403wB enumC10403wB = null;
        while (true) {
            try {
                if (c2861En.a() < 4) {
                    e = EnumC6625gk1.TERMINATOR;
                } else {
                    e = EnumC6625gk1.e(c2861En.d(4));
                }
                EnumC6625gk1 enumC6625gk1 = e;
                int[] iArr = a.a;
                switch (iArr[enumC6625gk1.ordinal()]) {
                    case 5:
                        break;
                    case 6:
                    case 7:
                        z = true;
                        break;
                    case 8:
                        if (c2861En.a() >= 16) {
                            i = c2861En.d(8);
                            i2 = c2861En.d(8);
                            break;
                        } else {
                            throw C2605Bx0.a();
                        }
                    case 9:
                        enumC10403wB = EnumC10403wB.g(g(c2861En));
                        if (enumC10403wB != null) {
                            break;
                        } else {
                            throw C2605Bx0.a();
                        }
                    case 10:
                        int d = c2861En.d(4);
                        int d2 = c2861En.d(enumC6625gk1.h(we2));
                        if (d == 1) {
                            d(c2861En, sb, d2);
                            break;
                        }
                        break;
                    default:
                        int d3 = c2861En.d(enumC6625gk1.h(we2));
                        int i3 = iArr[enumC6625gk1.ordinal()];
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 == 4) {
                                        e(c2861En, sb, d3);
                                        break;
                                    } else {
                                        throw C2605Bx0.a();
                                    }
                                } else {
                                    c(c2861En, sb, d3, enumC10403wB, arrayList, map);
                                    break;
                                }
                            } else {
                                b(c2861En, sb, d3, z);
                                break;
                            }
                        } else {
                            f(c2861En, sb, d3);
                            break;
                        }
                }
                if (enumC6625gk1 == EnumC6625gk1.TERMINATOR) {
                    String sb2 = sb.toString();
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                    if (enumC8074me0 != null) {
                        str = enumC8074me0.toString();
                    }
                    return new C9753tW(bArr2, sb2, arrayList, str, i, i2);
                }
                bArr2 = bArr;
            } catch (IllegalArgumentException unused) {
                throw C2605Bx0.a();
            }
        }
    }

    public static void b(C2861En c2861En, StringBuilder sb, int i, boolean z) throws C2605Bx0 {
        while (i > 1) {
            if (c2861En.a() >= 11) {
                int d = c2861En.d(11);
                sb.append(h(d / 45));
                sb.append(h(d % 45));
                i -= 2;
            } else {
                throw C2605Bx0.a();
            }
        }
        if (i == 1) {
            if (c2861En.a() >= 6) {
                sb.append(h(c2861En.d(6)));
            } else {
                throw C2605Bx0.a();
            }
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        }
                    }
                    sb.setCharAt(length, C5588cW.f706o);
                }
            }
        }
    }

    public static void c(C2861En c2861En, StringBuilder sb, int i, EnumC10403wB enumC10403wB, Collection<byte[]> collection, Map<XV, ?> map) throws C2605Bx0 {
        String name;
        if ((i << 3) <= c2861En.a()) {
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) c2861En.d(8);
            }
            if (enumC10403wB == null) {
                name = C4597We2.a(bArr, map);
            } else {
                name = enumC10403wB.name();
            }
            try {
                sb.append(new String(bArr, name));
                collection.add(bArr);
                return;
            } catch (UnsupportedEncodingException unused) {
                throw C2605Bx0.a();
            }
        }
        throw C2605Bx0.a();
    }

    public static void d(C2861En c2861En, StringBuilder sb, int i) throws C2605Bx0 {
        int i2;
        if (i * 13 <= c2861En.a()) {
            byte[] bArr = new byte[i * 2];
            int i3 = 0;
            while (i > 0) {
                int d = c2861En.d(13);
                int i4 = (d % 96) | ((d / 96) << 8);
                if (i4 < 959) {
                    i2 = 41377;
                } else {
                    i2 = 42657;
                }
                int i5 = i4 + i2;
                bArr[i3] = (byte) (i5 >> 8);
                bArr[i3 + 1] = (byte) i5;
                i3 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, C4597We2.c));
                return;
            } catch (UnsupportedEncodingException unused) {
                throw C2605Bx0.a();
            }
        }
        throw C2605Bx0.a();
    }

    public static void e(C2861En c2861En, StringBuilder sb, int i) throws C2605Bx0 {
        int i2;
        if (i * 13 <= c2861En.a()) {
            byte[] bArr = new byte[i * 2];
            int i3 = 0;
            while (i > 0) {
                int d = c2861En.d(13);
                int i4 = (d % CK1.x) | ((d / CK1.x) << 8);
                if (i4 < 7936) {
                    i2 = 33088;
                } else {
                    i2 = 49472;
                }
                int i5 = i4 + i2;
                bArr[i3] = (byte) (i5 >> 8);
                bArr[i3 + 1] = (byte) i5;
                i3 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, C4597We2.b));
                return;
            } catch (UnsupportedEncodingException unused) {
                throw C2605Bx0.a();
            }
        }
        throw C2605Bx0.a();
    }

    public static void f(C2861En c2861En, StringBuilder sb, int i) throws C2605Bx0 {
        while (i >= 3) {
            if (c2861En.a() >= 10) {
                int d = c2861En.d(10);
                if (d < 1000) {
                    sb.append(h(d / 100));
                    sb.append(h((d / 10) % 10));
                    sb.append(h(d % 10));
                    i -= 3;
                } else {
                    throw C2605Bx0.a();
                }
            } else {
                throw C2605Bx0.a();
            }
        }
        if (i == 2) {
            if (c2861En.a() >= 7) {
                int d2 = c2861En.d(7);
                if (d2 < 100) {
                    sb.append(h(d2 / 10));
                    sb.append(h(d2 % 10));
                    return;
                }
                throw C2605Bx0.a();
            }
            throw C2605Bx0.a();
        } else if (i == 1) {
            if (c2861En.a() >= 4) {
                int d3 = c2861En.d(4);
                if (d3 < 10) {
                    sb.append(h(d3));
                    return;
                }
                throw C2605Bx0.a();
            }
            throw C2605Bx0.a();
        }
    }

    public static int g(C2861En c2861En) throws C2605Bx0 {
        int d = c2861En.d(8);
        if ((d & 128) == 0) {
            return d & 127;
        }
        if ((d & CK1.x) == 128) {
            return c2861En.d(8) | ((d & 63) << 8);
        }
        if ((d & 224) == 192) {
            return c2861En.d(16) | ((d & 31) << 16);
        }
        throw C2605Bx0.a();
    }

    public static char h(int i) throws C2605Bx0 {
        char[] cArr = a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw C2605Bx0.a();
    }
}
