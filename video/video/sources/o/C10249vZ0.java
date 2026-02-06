package o;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: o.vZ0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10249vZ0 implements F90<C10738xZ0> {
    public static final C10249vZ0 b = new C10249vZ0();
    public final Integer a;

    public C10249vZ0() {
        this(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
        if (r16 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
        r4 = r4 + 1;
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
        r3 = r3 + 1;
        r6 = true;
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007b, code lost:
        if (r16 != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C10738xZ0 c(CharSequence charSequence, CharSequence charSequence2, int[][] iArr, boolean z) {
        int i;
        int i2;
        int i3;
        boolean z2;
        int length = charSequence2.length();
        int length2 = charSequence.length();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (length >= 0 && length2 >= 0) {
            if (length2 == 0) {
                i = -1;
            } else {
                i = iArr[length][length2 - 1];
            }
            if (length == 0) {
                i2 = -1;
            } else {
                i2 = iArr[length - 1][length2];
            }
            if (length > 0 && length2 > 0) {
                i3 = iArr[length - 1][length2 - 1];
            } else {
                i3 = -1;
            }
            if (i == -1 && i2 == -1 && i3 == -1) {
                break;
            }
            int i7 = iArr[length][length2];
            if (length2 <= 0 || length <= 0 || charSequence.charAt(length2 - 1) != charSequence2.charAt(length - 1)) {
                int i8 = i7 - 1;
                boolean z3 = true;
                if ((i8 == i && i7 <= i3 && i7 <= i2) || (i3 == -1 && i2 == -1)) {
                    length2--;
                } else if ((i8 == i2 && i7 <= i3 && i7 <= i) || (i3 == -1 && i == -1)) {
                    length--;
                } else {
                    z2 = false;
                    z3 = false;
                }
                if (!z3 && !z2) {
                    i6++;
                }
            }
            length2--;
            length--;
        }
        return new C10738xZ0(Integer.valueOf(i5 + i4 + i6), Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i6));
    }

    public static C10249vZ0 d() {
        return b;
    }

    public static C10738xZ0 f(CharSequence charSequence, CharSequence charSequence2, int i) {
        boolean z;
        int i2;
        int i3;
        CharSequence charSequence3;
        CharSequence charSequence4;
        int min;
        char c = 0;
        if (charSequence != null && charSequence2 != null) {
            if (i >= 0) {
                int length = charSequence.length();
                int length2 = charSequence2.length();
                if (length == 0) {
                    if (length2 <= i) {
                        return new C10738xZ0(Integer.valueOf(length2), Integer.valueOf(length2), 0, 0);
                    }
                    return new C10738xZ0(-1, 0, 0, 0);
                } else if (length2 == 0) {
                    if (length <= i) {
                        return new C10738xZ0(Integer.valueOf(length), 0, Integer.valueOf(length), 0);
                    }
                    return new C10738xZ0(-1, 0, 0, 0);
                } else {
                    int i4 = 1;
                    if (length > length2) {
                        i3 = charSequence.length();
                        i2 = length2;
                        z = true;
                        charSequence4 = charSequence;
                        charSequence3 = charSequence2;
                    } else {
                        z = false;
                        i2 = length;
                        i3 = length2;
                        charSequence3 = charSequence;
                        charSequence4 = charSequence2;
                    }
                    int i5 = i2 + 1;
                    int[] iArr = new int[i5];
                    int[] iArr2 = new int[i5];
                    int[][] iArr3 = (int[][]) Array.newInstance(Integer.TYPE, i3 + 1, i5);
                    for (int i6 = 0; i6 <= i2; i6++) {
                        iArr3[0][i6] = i6;
                    }
                    for (int i7 = 0; i7 <= i3; i7++) {
                        iArr3[i7][0] = i7;
                    }
                    int min2 = Math.min(i2, i) + 1;
                    for (int i8 = 0; i8 < min2; i8++) {
                        iArr[i8] = i8;
                    }
                    int i9 = Integer.MAX_VALUE;
                    Arrays.fill(iArr, min2, i5, Integer.MAX_VALUE);
                    Arrays.fill(iArr2, Integer.MAX_VALUE);
                    int i10 = 1;
                    while (i10 <= i3) {
                        char charAt = charSequence4.charAt(i10 - 1);
                        iArr2[c] = i10;
                        int max = Math.max(i4, i10 - i);
                        int i11 = i9;
                        if (i10 > i11 - i) {
                            min = i2;
                        } else {
                            min = Math.min(i2, i10 + i);
                        }
                        if (max > min) {
                            return new C10738xZ0(-1, 0, 0, 0);
                        }
                        if (max > i4) {
                            iArr2[max - 1] = i11;
                        }
                        while (max <= min) {
                            int i12 = i4;
                            int i13 = max - 1;
                            int i14 = max;
                            if (charSequence3.charAt(i13) == charAt) {
                                iArr2[i14] = iArr[i13];
                            } else {
                                iArr2[i14] = Math.min(Math.min(iArr2[i13], iArr[i14]), iArr[i13]) + 1;
                            }
                            iArr3[i10][i14] = iArr2[i14];
                            max = i14 + 1;
                            i4 = i12;
                        }
                        i10++;
                        int[] iArr4 = iArr2;
                        iArr2 = iArr;
                        iArr = iArr4;
                        i9 = i11;
                        c = 0;
                    }
                    if (iArr[i2] <= i) {
                        return c(charSequence3, charSequence4, iArr3, z);
                    }
                    return new C10738xZ0(-1, 0, 0, 0);
                }
            }
            throw new IllegalArgumentException("Threshold must not be negative");
        }
        throw new IllegalArgumentException("CharSequences must not be null");
    }

    public static C10738xZ0 g(CharSequence charSequence, CharSequence charSequence2) {
        boolean z;
        int i;
        int i2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        int i3;
        int i4 = 0;
        if (charSequence != null && charSequence2 != null) {
            int length = charSequence.length();
            int length2 = charSequence2.length();
            if (length == 0) {
                return new C10738xZ0(Integer.valueOf(length2), Integer.valueOf(length2), 0, 0);
            }
            if (length2 == 0) {
                return new C10738xZ0(Integer.valueOf(length), 0, Integer.valueOf(length), 0);
            }
            if (length > length2) {
                z = true;
                i2 = charSequence.length();
                i = length2;
                charSequence4 = charSequence;
                charSequence3 = charSequence2;
            } else {
                z = false;
                i = length;
                i2 = length2;
                charSequence3 = charSequence;
                charSequence4 = charSequence2;
            }
            int i5 = i + 1;
            int[] iArr = new int[i5];
            int[] iArr2 = new int[i5];
            int[][] iArr3 = (int[][]) Array.newInstance(Integer.TYPE, i2 + 1, i5);
            for (int i6 = 0; i6 <= i; i6++) {
                iArr3[0][i6] = i6;
            }
            for (int i7 = 0; i7 <= i2; i7++) {
                iArr3[i7][0] = i7;
            }
            for (int i8 = 0; i8 <= i; i8++) {
                iArr[i8] = i8;
            }
            int[] iArr4 = iArr;
            int[] iArr5 = iArr2;
            int i9 = 1;
            while (i9 <= i2) {
                char charAt = charSequence4.charAt(i9 - 1);
                iArr5[i4] = i9;
                int i10 = 1;
                while (i10 <= i) {
                    int i11 = i10 - 1;
                    if (charSequence3.charAt(i11) == charAt) {
                        i3 = i4;
                    } else {
                        i3 = 1;
                    }
                    int min = Math.min(Math.min(iArr5[i11] + 1, iArr4[i10] + 1), iArr4[i11] + i3);
                    iArr5[i10] = min;
                    iArr3[i9][i10] = min;
                    i10++;
                    i4 = 0;
                }
                i9++;
                int[] iArr6 = iArr4;
                iArr4 = iArr5;
                iArr5 = iArr6;
                i4 = 0;
            }
            return c(charSequence3, charSequence4, iArr3, z);
        }
        throw new IllegalArgumentException("CharSequences must not be null");
    }

    @Override // o.F90, o.InterfaceC8919q62
    /* renamed from: b */
    public C10738xZ0 a(CharSequence charSequence, CharSequence charSequence2) {
        Integer num = this.a;
        if (num != null) {
            return f(charSequence, charSequence2, num.intValue());
        }
        return g(charSequence, charSequence2);
    }

    public Integer e() {
        return this.a;
    }

    public C10249vZ0(Integer num) {
        if (num != null && num.intValue() < 0) {
            throw new IllegalArgumentException("Threshold must not be negative");
        }
        this.a = num;
    }
}
