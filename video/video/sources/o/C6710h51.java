package o;

import java.lang.reflect.Array;

/* renamed from: o.h51  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6710h51 implements InterfaceC8919q62<Integer> {
    public static int[] b(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, 2, length2 + 1);
        for (int i = 1; i <= length; i++) {
            int[] iArr2 = iArr[0];
            iArr[0] = iArr[1];
            iArr[1] = iArr2;
            for (int i2 = 1; i2 <= length2; i2++) {
                int i3 = i2 - 1;
                if (charSequence.charAt(i - 1) == charSequence2.charAt(i3)) {
                    iArr[1][i2] = iArr[0][i3] + 1;
                } else {
                    int[] iArr3 = iArr[1];
                    iArr3[i2] = Math.max(iArr3[i3], iArr[0][i2]);
                }
            }
        }
        return iArr[1];
    }

    public static String c(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence.length();
        int length2 = charSequence2.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (length == 1) {
            char charAt = charSequence.charAt(0);
            while (true) {
                if (i >= length2) {
                    break;
                } else if (charAt == charSequence2.charAt(i)) {
                    sb.append(charAt);
                    break;
                } else {
                    i++;
                }
            }
        } else if (length2 > 0 && length > 1) {
            int i2 = length / 2;
            CharSequence subSequence = charSequence.subSequence(0, i2);
            CharSequence subSequence2 = charSequence.subSequence(i2, length);
            int[] b = b(subSequence, charSequence2);
            int[] b2 = b(h(subSequence2), h(charSequence2));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 <= length2; i5++) {
                int i6 = b[i5] + b2[length2 - i5];
                if (i4 < i6) {
                    i3 = i5;
                    i4 = i6;
                }
            }
            sb.append(c(subSequence, charSequence2.subSequence(0, i3)));
            sb.append(c(subSequence2, charSequence2.subSequence(i3, length2)));
        }
        return sb.toString();
    }

    public static String h(CharSequence charSequence) {
        return new StringBuilder(charSequence).reverse().toString();
    }

    @Override // o.InterfaceC8919q62
    /* renamed from: d */
    public Integer a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null && charSequence2 != null) {
            int length = charSequence.length();
            int length2 = charSequence2.length();
            if (length != 0 && length2 != 0) {
                if (length < length2) {
                    return Integer.valueOf(b(charSequence2, charSequence)[length]);
                }
                return Integer.valueOf(b(charSequence, charSequence2)[length2]);
            }
            return 0;
        }
        throw new IllegalArgumentException("Inputs must not be null");
    }

    @Deprecated
    public CharSequence e(CharSequence charSequence, CharSequence charSequence2) {
        return f(charSequence, charSequence2);
    }

    public CharSequence f(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null && charSequence2 != null) {
            int length = charSequence.length();
            int length2 = charSequence2.length();
            if (length != 0 && length2 != 0) {
                if (length < length2) {
                    return c(charSequence2, charSequence);
                }
                return c(charSequence, charSequence2);
            }
            return "";
        }
        throw new IllegalArgumentException("Inputs must not be null");
    }

    @Deprecated
    public int[][] g(CharSequence charSequence, CharSequence charSequence2) {
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, charSequence.length() + 1, charSequence2.length() + 1);
        for (int i = 0; i < charSequence.length(); i++) {
            for (int i2 = 0; i2 < charSequence2.length(); i2++) {
                if (i == 0) {
                    iArr[i][i2] = 0;
                }
                if (i2 == 0) {
                    iArr[i][i2] = 0;
                }
                if (charSequence.charAt(i) == charSequence2.charAt(i2)) {
                    iArr[i + 1][i2 + 1] = iArr[i][i2] + 1;
                } else {
                    int[] iArr2 = iArr[i + 1];
                    int i3 = i2 + 1;
                    iArr2[i3] = Math.max(iArr2[i2], iArr[i][i3]);
                }
            }
        }
        return iArr;
    }
}
