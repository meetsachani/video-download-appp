package o;

@Deprecated
/* renamed from: o.Fk1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2960Fk1 {
    public static final int b = 32;
    public final C2469An a;

    public C2960Fk1(C2469An c2469An) {
        this.a = c2469An;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0031 A[EDGE_INSN: B:70:0x0031->B:22:0x0031 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0068 A[EDGE_INSN: B:86:0x0068->B:47:0x0068 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] a(int i, int i2, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7 = (i3 + i4) / 2;
        int i8 = i7;
        while (i8 >= i3) {
            C2469An c2469An = this.a;
            if (z) {
                if (c2469An.f(i8, i)) {
                    i8--;
                } else {
                    i6 = i8;
                    while (true) {
                        i6--;
                        if (i6 >= i3) {
                            break;
                        }
                        C2469An c2469An2 = this.a;
                        if (z) {
                            if (c2469An2.f(i6, i)) {
                                break;
                            }
                        } else if (c2469An2.f(i, i6)) {
                            break;
                        }
                    }
                    int i9 = i8 - i6;
                    if (i6 >= i3 || i9 > i2) {
                        break;
                        break;
                    }
                    i8 = i6;
                }
            } else if (c2469An.f(i, i8)) {
                i8--;
            } else {
                i6 = i8;
                while (true) {
                    i6--;
                    if (i6 >= i3) {
                    }
                }
                int i92 = i8 - i6;
                if (i6 >= i3) {
                    break;
                }
                i8 = i6;
            }
        }
        int i10 = i8 + 1;
        while (i7 < i4) {
            C2469An c2469An3 = this.a;
            if (z) {
                if (c2469An3.f(i7, i)) {
                    i7++;
                } else {
                    i5 = i7;
                    while (true) {
                        i5++;
                        if (i5 < i4) {
                            break;
                        }
                        C2469An c2469An4 = this.a;
                        if (z) {
                            if (c2469An4.f(i5, i)) {
                                break;
                            }
                        } else if (c2469An4.f(i, i5)) {
                            break;
                        }
                    }
                    int i11 = i5 - i7;
                    if (i5 < i4 || i11 > i2) {
                        break;
                        break;
                    }
                    i7 = i5;
                }
            } else if (c2469An3.f(i, i7)) {
                i7++;
            } else {
                i5 = i7;
                while (true) {
                    i5++;
                    if (i5 < i4) {
                    }
                }
                int i112 = i5 - i7;
                if (i5 < i4) {
                    break;
                }
                i7 = i5;
            }
        }
        int i12 = i7 - 1;
        if (i12 > i10) {
            return new int[]{i10, i12};
        }
        return null;
    }

    public UT1[] b() throws C9349rr1 {
        int i = this.a.i();
        int m = this.a.m();
        int i2 = i / 2;
        int i3 = m / 2;
        int max = Math.max(1, i / 256);
        int max2 = Math.max(1, m / 256);
        int i4 = -max;
        int i5 = i3 / 2;
        int d = ((int) c(i3, 0, 0, m, i2, i4, 0, i, i5).d()) - 1;
        int i6 = i2 / 2;
        UT1 c = c(i3, -max2, 0, m, i2, 0, d, i, i6);
        int c2 = ((int) c.c()) - 1;
        UT1 c3 = c(i3, max2, c2, m, i2, 0, d, i, i6);
        int c4 = ((int) c3.c()) + 1;
        UT1 c5 = c(i3, 0, c2, c4, i2, max, d, i, i5);
        return new UT1[]{c(i3, 0, c2, c4, i2, i4, d, ((int) c5.d()) + 1, i3 / 4), c, c3, c5};
    }

    public final UT1 c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) throws C9349rr1 {
        int[] a;
        int[] iArr = null;
        int i10 = i;
        int i11 = i5;
        while (i11 < i8 && i11 >= i7 && i10 < i4 && i10 >= i3) {
            if (i2 == 0) {
                a = a(i11, i9, i3, i4, true);
            } else {
                a = a(i10, i9, i7, i8, false);
            }
            if (a == null) {
                if (iArr != null) {
                    char c = 0;
                    if (i2 == 0) {
                        int i12 = i11 - i6;
                        int i13 = iArr[0];
                        if (i13 < i) {
                            if (iArr[1] > i) {
                                if (i6 <= 0) {
                                    c = 1;
                                }
                                return new UT1(iArr[c], i12);
                            }
                            return new UT1(i13, i12);
                        }
                        return new UT1(iArr[1], i12);
                    }
                    int i14 = i10 - i2;
                    int i15 = iArr[0];
                    if (i15 < i5) {
                        if (iArr[1] > i5) {
                            float f = i14;
                            if (i2 >= 0) {
                                c = 1;
                            }
                            return new UT1(f, iArr[c]);
                        }
                        return new UT1(i14, i15);
                    }
                    return new UT1(i14, iArr[1]);
                }
                throw C9349rr1.a();
            }
            i11 += i6;
            i10 += i2;
            iArr = a;
        }
        throw C9349rr1.a();
    }
}
