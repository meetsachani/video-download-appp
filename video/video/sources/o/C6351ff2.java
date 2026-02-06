package o;

/* renamed from: o.ff2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6351ff2 {
    public final String a;
    public final String b;
    public final int[] c;
    public final int[] d;

    /* renamed from: o.ff2$a */
    /* loaded from: classes4.dex */
    public static class a {
        public final int a;
        public final int b;
        public final int c;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public int a() {
            return this.c;
        }

        public int b() {
            return this.b;
        }

        public int c() {
            return this.a;
        }
    }

    public C6351ff2(String str, String str2) {
        this.a = str;
        this.b = str2;
        int length = str.length() + str2.length() + 2;
        this.c = new int[length];
        this.d = new int[length];
    }

    public final void a(int i, int i2, int i3, int i4, I90<Character> i90) {
        a c = c(i, i2, i3, i4);
        if (c != null && ((c.c() != i2 || c.a() != i2 - i4) && (c.b() != i || c.a() != i - i3))) {
            a(i, c.c(), i3, c.c() - c.a(), i90);
            for (int c2 = c.c(); c2 < c.b(); c2++) {
                i90.d(new C6077eX0<>(Character.valueOf(this.a.charAt(c2))));
            }
            a(c.b(), i2, c.b() - c.a(), i4, i90);
            return;
        }
        int i5 = i;
        int i6 = i3;
        while (true) {
            if (i5 >= i2 && i6 >= i4) {
                return;
            }
            if (i5 < i2 && i6 < i4 && this.a.charAt(i5) == this.b.charAt(i6)) {
                i90.d(new C6077eX0<>(Character.valueOf(this.a.charAt(i5))));
                i5++;
            } else if (i2 - i > i4 - i3) {
                i90.b(new X10<>(Character.valueOf(this.a.charAt(i5))));
                i5++;
            } else {
                i90.c(new C8511oQ0<>(Character.valueOf(this.b.charAt(i6))));
            }
            i6++;
        }
    }

    public final a b(int i, int i2, int i3, int i4) {
        int i5 = i;
        while (true) {
            int i6 = i5 - i2;
            if (i6 >= i4 || i5 >= i3 || this.a.charAt(i5) != this.b.charAt(i6)) {
                break;
            }
            i5++;
        }
        return new a(i, i5, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r6[r5 - 1] < r6[r5 + 1]) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
        if (r6[r7 + 1] <= r6[r7 - 1]) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0105, code lost:
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a c(int i, int i2, int i3, int i4) {
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = i2 - i;
        int i12 = i4 - i3;
        if (i11 != 0 && i12 != 0) {
            int i13 = i11 - i12;
            int i14 = i12 + i11;
            if (i14 % 2 != 0) {
                i14++;
            }
            int i15 = i14 / 2;
            int i16 = i15 + 1;
            this.c[i16] = i;
            this.d[i16] = i2 + 1;
            int i17 = 0;
            while (i17 <= i15) {
                int i18 = -i17;
                for (int i19 = i18; i19 <= i17; i19 += 2) {
                    int i20 = i19 + i15;
                    if (i19 != i18) {
                        if (i19 != i17) {
                            int[] iArr2 = this.c;
                        }
                        int[] iArr3 = this.c;
                        iArr3[i20] = iArr3[i20 - 1] + 1;
                        i8 = this.c[i20];
                        for (i9 = ((i8 - i) + i3) - i19; i8 < i2 && i9 < i4 && this.a.charAt(i8) == this.b.charAt(i9); i9++) {
                            i8++;
                            this.c[i20] = i8;
                        }
                        if (i13 % 2 == 0 && i13 - i17 <= i19 && i19 <= i13 + i17 && (i10 = this.d[i20 - i13]) <= this.c[i20]) {
                            return b(i10, (i19 + i) - i3, i2, i4);
                        }
                    }
                    int[] iArr4 = this.c;
                    iArr4[i20] = iArr4[i20 + 1];
                    i8 = this.c[i20];
                    while (i8 < i2) {
                        i8++;
                        this.c[i20] = i8;
                    }
                    if (i13 % 2 == 0) {
                    }
                }
                int i21 = i13 - i17;
                int i22 = i21;
                while (true) {
                    int i23 = i13 + i17;
                    if (i22 <= i23) {
                        int i24 = (i22 + i15) - i13;
                        if (i22 != i21) {
                            if (i22 != i23) {
                                int[] iArr5 = this.d;
                            }
                            int[] iArr6 = this.d;
                            iArr6[i24] = iArr6[i24 - 1];
                            i5 = this.d[i24] - 1;
                            i6 = ((i5 - i) + i3) - i22;
                            while (i5 >= i && i6 >= i3 && this.a.charAt(i5) == this.b.charAt(i6)) {
                                this.d[i24] = i5;
                                i6--;
                                i5--;
                            }
                            if (i13 % 2 != 0 && i18 <= i22 && i22 <= i17 && (i7 = this.d[i24]) <= this.c[i24 + i13]) {
                                return b(i7, (i22 + i) - i3, i2, i4);
                            }
                            i22 += 2;
                        }
                        this.d[i24] = iArr[i24 + 1] - 1;
                        i5 = this.d[i24] - 1;
                        i6 = ((i5 - i) + i3) - i22;
                        while (i5 >= i) {
                            this.d[i24] = i5;
                            i6--;
                            i5--;
                        }
                        if (i13 % 2 != 0) {
                        }
                        i22 += 2;
                    }
                }
            }
            throw new IllegalStateException("Internal Error");
        }
        return null;
    }

    public I90<Character> d() {
        I90<Character> i90 = new I90<>();
        a(0, this.a.length(), 0, this.b.length(), i90);
        return i90;
    }
}
