package o;

import java.util.Arrays;

/* renamed from: o.wZ0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10495wZ0 implements F90<Integer> {
    public static final C10495wZ0 b = new C10495wZ0();
    public final Integer a;

    public C10495wZ0() {
        this(null);
    }

    public static C10495wZ0 c() {
        return b;
    }

    public static int e(CharSequence charSequence, CharSequence charSequence2, int i) {
        int i2;
        int i3;
        CharSequence charSequence3;
        CharSequence charSequence4;
        int min;
        if (charSequence != null && charSequence2 != null) {
            if (i >= 0) {
                int length = charSequence.length();
                int length2 = charSequence2.length();
                int i4 = -1;
                if (length == 0) {
                    if (length2 > i) {
                        return -1;
                    }
                    return length2;
                } else if (length2 == 0) {
                    if (length > i) {
                        return -1;
                    }
                    return length;
                } else {
                    if (length > length2) {
                        i3 = charSequence.length();
                        i2 = length2;
                        charSequence4 = charSequence;
                        charSequence3 = charSequence2;
                    } else {
                        i2 = length;
                        i3 = length2;
                        charSequence3 = charSequence;
                        charSequence4 = charSequence2;
                    }
                    if (i3 - i2 > i) {
                        return -1;
                    }
                    int i5 = i2 + 1;
                    int[] iArr = new int[i5];
                    int[] iArr2 = new int[i5];
                    int i6 = 1;
                    int min2 = Math.min(i2, i) + 1;
                    char c = 0;
                    for (int i7 = 0; i7 < min2; i7++) {
                        iArr[i7] = i7;
                    }
                    Arrays.fill(iArr, min2, i5, Integer.MAX_VALUE);
                    Arrays.fill(iArr2, Integer.MAX_VALUE);
                    int i8 = 1;
                    while (i8 <= i3) {
                        char charAt = charSequence4.charAt(i8 - 1);
                        iArr2[c] = i8;
                        int max = Math.max(i6, i8 - i);
                        if (i8 > Integer.MAX_VALUE - i) {
                            min = i2;
                        } else {
                            min = Math.min(i2, i8 + i);
                        }
                        if (max > i6) {
                            iArr2[max - 1] = Integer.MAX_VALUE;
                        }
                        int i9 = Integer.MAX_VALUE;
                        while (max <= min) {
                            int i10 = i4;
                            int i11 = max - 1;
                            int i12 = i6;
                            if (charSequence3.charAt(i11) == charAt) {
                                iArr2[max] = iArr[i11];
                            } else {
                                iArr2[max] = Math.min(Math.min(iArr2[i11], iArr[max]), iArr[i11]) + 1;
                            }
                            i9 = Math.min(i9, iArr2[max]);
                            max++;
                            i6 = i12;
                            i4 = i10;
                        }
                        int i13 = i4;
                        int i14 = i6;
                        if (i9 > i) {
                            return i13;
                        }
                        i8++;
                        int[] iArr3 = iArr2;
                        iArr2 = iArr;
                        iArr = iArr3;
                        i6 = i14;
                        i4 = i13;
                        c = 0;
                    }
                    int i15 = i4;
                    int i16 = iArr[i2];
                    if (i16 <= i) {
                        return i16;
                    }
                    return i15;
                }
            }
            throw new IllegalArgumentException("Threshold must not be negative");
        }
        throw new IllegalArgumentException("CharSequences must not be null");
    }

    public static int f(CharSequence charSequence, CharSequence charSequence2) {
        int i;
        if (charSequence != null && charSequence2 != null) {
            int length = charSequence.length();
            int length2 = charSequence2.length();
            if (length == 0) {
                return length2;
            }
            if (length2 == 0) {
                return length;
            }
            if (length > length2) {
                length2 = charSequence.length();
                length = length2;
            } else {
                charSequence2 = charSequence;
                charSequence = charSequence2;
            }
            int[] iArr = new int[length + 1];
            for (int i2 = 0; i2 <= length; i2++) {
                iArr[i2] = i2;
            }
            for (int i3 = 1; i3 <= length2; i3++) {
                int i4 = iArr[0];
                char charAt = charSequence.charAt(i3 - 1);
                iArr[0] = i3;
                int i5 = 1;
                while (i5 <= length) {
                    int i6 = iArr[i5];
                    int i7 = i5 - 1;
                    if (charSequence2.charAt(i7) == charAt) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    iArr[i5] = Math.min(Math.min(iArr[i7] + 1, iArr[i5] + 1), i4 + i);
                    i5++;
                    i4 = i6;
                }
            }
            return iArr[length];
        }
        throw new IllegalArgumentException("CharSequences must not be null");
    }

    @Override // o.F90, o.InterfaceC8919q62
    /* renamed from: b */
    public Integer a(CharSequence charSequence, CharSequence charSequence2) {
        Integer num = this.a;
        if (num != null) {
            return Integer.valueOf(e(charSequence, charSequence2, num.intValue()));
        }
        return Integer.valueOf(f(charSequence, charSequence2));
    }

    public Integer d() {
        return this.a;
    }

    public C10495wZ0(Integer num) {
        if (num != null && num.intValue() < 0) {
            throw new IllegalArgumentException("Threshold must not be negative");
        }
        this.a = num;
    }
}
