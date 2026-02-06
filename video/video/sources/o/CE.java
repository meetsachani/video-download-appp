package o;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes3.dex */
public final class CE extends AbstractC9851tv1 {
    public static final int a = 103;
    public static final int b = 104;
    public static final int c = 105;
    public static final int d = 101;
    public static final int e = 100;
    public static final int f = 99;
    public static final int g = 106;
    public static final char h = 241;
    public static final char i = 242;
    public static final char j = 243;
    public static final char k = 244;
    public static final int l = 102;
    public static final int m = 97;
    public static final int n = 96;

    /* renamed from: o  reason: collision with root package name */
    public static final int f423o = 101;
    public static final int p = 100;

    /* loaded from: classes3.dex */
    public enum a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    public static int g(CharSequence charSequence, int i2, int i3) {
        a h2;
        a h3;
        char charAt;
        a h4 = h(charSequence, i2);
        a aVar = a.ONE_DIGIT;
        if (h4 == aVar) {
            return 100;
        }
        a aVar2 = a.UNCODABLE;
        if (h4 == aVar2) {
            if (i2 >= charSequence.length() || ((charAt = charSequence.charAt(i2)) >= ' ' && (i3 != 101 || charAt >= '`'))) {
                return 100;
            }
            return 101;
        } else if (i3 == 99) {
            return 99;
        } else {
            if (i3 == 100) {
                a aVar3 = a.FNC_1;
                if (h4 == aVar3 || (h2 = h(charSequence, i2 + 2)) == aVar2 || h2 == aVar) {
                    return 100;
                }
                if (h2 == aVar3) {
                    if (h(charSequence, i2 + 3) != a.TWO_DIGITS) {
                        return 100;
                    }
                    return 99;
                }
                int i4 = i2 + 4;
                while (true) {
                    h3 = h(charSequence, i4);
                    if (h3 != a.TWO_DIGITS) {
                        break;
                    }
                    i4 += 2;
                }
                if (h3 == a.ONE_DIGIT) {
                    return 100;
                }
                return 99;
            }
            if (h4 == a.FNC_1) {
                h4 = h(charSequence, i2 + 1);
            }
            if (h4 != a.TWO_DIGITS) {
                return 100;
            }
            return 99;
        }
    }

    public static a h(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        if (i2 >= length) {
            return a.UNCODABLE;
        }
        char charAt = charSequence.charAt(i2);
        if (charAt == 241) {
            return a.FNC_1;
        }
        if (charAt >= '0' && charAt <= '9') {
            int i3 = i2 + 1;
            if (i3 >= length) {
                return a.ONE_DIGIT;
            }
            char charAt2 = charSequence.charAt(i3);
            if (charAt2 >= '0' && charAt2 <= '9') {
                return a.TWO_DIGITS;
            }
            return a.ONE_DIGIT;
        }
        return a.UNCODABLE;
    }

    @Override // o.AbstractC9851tv1, o.ON2
    public C2469An a(String str, EnumC3839Ok enumC3839Ok, int i2, int i3, Map<EnumC9284rb0, ?> map) throws PN2 {
        if (enumC3839Ok == EnumC3839Ok.CODE_128) {
            return super.a(str, enumC3839Ok, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(enumC3839Ok)));
    }

    @Override // o.AbstractC9851tv1
    public boolean[] d(String str) {
        int length = str.length();
        if (length > 0 && length <= 80) {
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                char charAt = str.charAt(i3);
                switch (charAt) {
                    case C10997yd1.o2 /* 241 */:
                    case 242:
                    case 243:
                    case 244:
                        break;
                    default:
                        if (charAt <= 127) {
                            break;
                        } else {
                            throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt)));
                        }
                }
            }
            ArrayList<int[]> arrayList = new ArrayList();
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 1;
            while (true) {
                int i8 = 103;
                if (i4 < length) {
                    int g2 = g(str, i4, i6);
                    int i9 = 100;
                    if (g2 == i6) {
                        switch (str.charAt(i4)) {
                            case C10997yd1.o2 /* 241 */:
                                i9 = 102;
                                break;
                            case 242:
                                i9 = 97;
                                break;
                            case 243:
                                i9 = 96;
                                break;
                            case 244:
                                if (i6 == 101) {
                                    i9 = 101;
                                    break;
                                }
                                break;
                            default:
                                if (i6 == 100) {
                                    i9 = str.charAt(i4) - ' ';
                                    break;
                                } else if (i6 != 101) {
                                    i9 = Integer.parseInt(str.substring(i4, i4 + 2));
                                    i4++;
                                    break;
                                } else {
                                    char charAt2 = str.charAt(i4);
                                    i9 = charAt2 - ' ';
                                    if (i9 < 0) {
                                        i9 = charAt2 + C11304zt1.a;
                                        break;
                                    }
                                }
                                break;
                        }
                        i4++;
                    } else {
                        if (i6 == 0) {
                            if (g2 != 100) {
                                if (g2 != 101) {
                                    i8 = 105;
                                }
                            } else {
                                i8 = 104;
                            }
                        } else {
                            i8 = g2;
                        }
                        i9 = i8;
                        i6 = g2;
                    }
                    arrayList.add(BE.a[i9]);
                    i5 += i9 * i7;
                    if (i4 != 0) {
                        i7++;
                    }
                } else {
                    int[][] iArr = BE.a;
                    arrayList.add(iArr[i5 % 103]);
                    arrayList.add(iArr[106]);
                    int i10 = 0;
                    for (int[] iArr2 : arrayList) {
                        for (int i11 : iArr2) {
                            i10 += i11;
                        }
                    }
                    boolean[] zArr = new boolean[i10];
                    for (int[] iArr3 : arrayList) {
                        i2 += AbstractC9851tv1.c(zArr, i2, iArr3, true);
                    }
                    return zArr;
                }
            }
        } else {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
    }
}
