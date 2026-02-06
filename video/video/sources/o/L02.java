package o;

import java.util.List;

/* loaded from: classes4.dex */
public class L02<T> {
    public final List<T> a;
    public final List<T> b;
    public final InterfaceC6600ge0<? super T> c;
    public final int[] d;
    public final int[] e;

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

    public L02(List<T> list, List<T> list2) {
        this(list, list2, QY.c());
    }

    public final void a(int i, int i2, int i3, int i4, J90<T> j90) {
        a c = c(i, i2, i3, i4);
        if (c != null && ((c.c() != i2 || c.a() != i2 - i4) && (c.b() != i || c.a() != i - i3))) {
            a(i, c.c(), i3, c.c() - c.a(), j90);
            for (int c2 = c.c(); c2 < c.b(); c2++) {
                j90.c(new C6320fX0<>(this.a.get(c2)));
            }
            a(c.b(), i2, c.b() - c.a(), i4, j90);
            return;
        }
        int i5 = i;
        int i6 = i3;
        while (true) {
            if (i5 >= i2 && i6 >= i4) {
                return;
            }
            if (i5 < i2 && i6 < i4 && this.c.b((T) this.a.get(i5), (T) this.b.get(i6))) {
                j90.c(new C6320fX0<>(this.a.get(i5)));
                i5++;
            } else if (i2 - i > i4 - i3) {
                j90.a(new Y10<>(this.a.get(i5)));
                i5++;
            } else {
                j90.b(new C8754pQ0<>(this.b.get(i6)));
            }
            i6++;
        }
    }

    public final a b(int i, int i2, int i3, int i4) {
        int i5 = i;
        while (true) {
            int i6 = i5 - i2;
            if (i6 >= i4 || i5 >= i3 || !this.c.b((T) this.a.get(i5), (T) this.b.get(i6))) {
                break;
            }
            i5++;
        }
        return new a(i, i5, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (r11[r10 - 1] < r11[r10 + 1]) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bc, code lost:
        if (r11[r12 + 1] <= r11[r12 - 1]) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0120, code lost:
        r5 = r5 + 1;
        r1 = r17;
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
        int i11 = i;
        int i12 = i2 - i11;
        int i13 = i4 - i3;
        if (i12 != 0 && i13 != 0) {
            int i14 = i12 - i13;
            int i15 = i13 + i12;
            if (i15 % 2 != 0) {
                i15++;
            }
            int i16 = i15 / 2;
            int i17 = i16 + 1;
            this.d[i17] = i11;
            this.e[i17] = i2 + 1;
            int i18 = 0;
            while (i18 <= i16) {
                int i19 = -i18;
                for (int i20 = i19; i20 <= i18; i20 += 2) {
                    int i21 = i20 + i16;
                    if (i20 != i19) {
                        if (i20 != i18) {
                            int[] iArr2 = this.d;
                        }
                        int[] iArr3 = this.d;
                        iArr3[i21] = iArr3[i21 - 1] + 1;
                        i8 = this.d[i21];
                        for (i9 = ((i8 - i11) + i3) - i20; i8 < i2 && i9 < i4 && this.c.b((T) this.a.get(i8), (T) this.b.get(i9)); i9++) {
                            i8++;
                            this.d[i21] = i8;
                        }
                        if (i14 % 2 == 0 && i14 - i18 <= i20 && i20 <= i14 + i18 && (i10 = this.e[i21 - i14]) <= this.d[i21]) {
                            return b(i10, (i20 + i11) - i3, i2, i4);
                        }
                    }
                    int[] iArr4 = this.d;
                    iArr4[i21] = iArr4[i21 + 1];
                    i8 = this.d[i21];
                    while (i8 < i2) {
                        i8++;
                        this.d[i21] = i8;
                    }
                    if (i14 % 2 == 0) {
                    }
                }
                int i22 = i14 - i18;
                int i23 = i22;
                while (true) {
                    int i24 = i14 + i18;
                    if (i23 <= i24) {
                        int i25 = (i23 + i16) - i14;
                        if (i23 != i22) {
                            if (i23 != i24) {
                                int[] iArr5 = this.e;
                            }
                            int[] iArr6 = this.e;
                            iArr6[i25] = iArr6[i25 - 1];
                            i5 = this.e[i25] - 1;
                            i6 = ((i5 - i11) + i3) - i23;
                            while (i5 >= i11 && i6 >= i3 && this.c.b((T) this.a.get(i5), (T) this.b.get(i6))) {
                                this.e[i25] = i5;
                                i6--;
                                i11 = i;
                                i5--;
                            }
                            if (i14 % 2 != 0 && i19 <= i23 && i23 <= i18 && (i7 = this.e[i25]) <= this.d[i25 + i14]) {
                                return b(i7, (i23 + i) - i3, i2, i4);
                            }
                            i23 += 2;
                            i11 = i;
                        }
                        this.e[i25] = iArr[i25 + 1] - 1;
                        i5 = this.e[i25] - 1;
                        i6 = ((i5 - i11) + i3) - i23;
                        while (i5 >= i11) {
                            this.e[i25] = i5;
                            i6--;
                            i11 = i;
                            i5--;
                        }
                        if (i14 % 2 != 0) {
                        }
                        i23 += 2;
                        i11 = i;
                    }
                }
            }
            throw new RuntimeException("Internal Error");
        }
        return null;
    }

    public J90<T> d() {
        J90<T> j90 = new J90<>();
        a(0, this.a.size(), 0, this.b.size(), j90);
        return j90;
    }

    public L02(List<T> list, List<T> list2, InterfaceC6600ge0<? super T> interfaceC6600ge0) {
        this.a = list;
        this.b = list2;
        this.c = interfaceC6600ge0;
        int size = list.size() + list2.size() + 2;
        this.d = new int[size];
        this.e = new int[size];
    }
}
