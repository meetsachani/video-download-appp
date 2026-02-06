package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.Nv1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3786Nv1 {
    @NotNull
    public static final C3786Nv1 a = new C3786Nv1();

    @InterfaceC9511sW0
    public static final void a(@NotNull C6718h71 c6718h71, @NotNull C6718h71 c6718h712) {
        if (!SQ.e(C3786Nv1.class)) {
            try {
                C6562gT0.p(c6718h71, "x");
                C6562gT0.p(c6718h712, "b");
                int b = c6718h71.b(0);
                int b2 = c6718h71.b(1);
                int b3 = c6718h71.b(2);
                float[] a2 = c6718h71.a();
                float[] a3 = c6718h712.a();
                if (b > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        if (b2 > 0) {
                            int i3 = 0;
                            while (true) {
                                int i4 = i3 + 1;
                                if (b3 > 0) {
                                    int i5 = 0;
                                    while (true) {
                                        int i6 = i5 + 1;
                                        int i7 = (i * b2 * b3) + (i3 * b3) + i5;
                                        a2[i7] = a2[i7] + a3[i5];
                                        if (i6 >= b3) {
                                            break;
                                        }
                                        i5 = i6;
                                    }
                                }
                                if (i4 >= b2) {
                                    break;
                                }
                                i3 = i4;
                            }
                        }
                        if (i2 < b) {
                            i = i2;
                        } else {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, C3786Nv1.class);
            }
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final C6718h71 b(@NotNull C6718h71[] c6718h71Arr) {
        int i;
        if (SQ.e(C3786Nv1.class)) {
            return null;
        }
        try {
            C6562gT0.p(c6718h71Arr, "tensors");
            int i2 = 0;
            int b = c6718h71Arr[0].b(0);
            int length = c6718h71Arr.length - 1;
            if (length >= 0) {
                int i3 = 0;
                i = 0;
                while (true) {
                    int i4 = i3 + 1;
                    i += c6718h71Arr[i3].b(1);
                    if (i4 > length) {
                        break;
                    }
                    i3 = i4;
                }
            } else {
                i = 0;
            }
            C6718h71 c6718h71 = new C6718h71(new int[]{b, i});
            float[] a2 = c6718h71.a();
            if (b > 0) {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    int i7 = i5 * i;
                    int length2 = c6718h71Arr.length - 1;
                    if (length2 >= 0) {
                        int i8 = i2;
                        while (true) {
                            int i9 = i8 + 1;
                            float[] a3 = c6718h71Arr[i8].a();
                            int b2 = c6718h71Arr[i8].b(1);
                            System.arraycopy(a3, i5 * b2, a2, i7, b2);
                            i7 += b2;
                            if (i9 > length2) {
                                break;
                            }
                            i8 = i9;
                        }
                    }
                    if (i6 >= b) {
                        break;
                    }
                    i5 = i6;
                    i2 = 0;
                }
            }
            return c6718h71;
        } catch (Throwable th) {
            SQ.c(th, C3786Nv1.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final C6718h71 c(@NotNull C6718h71 c6718h71, @NotNull C6718h71 c6718h712) {
        C6718h71 c6718h713;
        float[] fArr;
        float[] fArr2;
        C6718h71 c6718h714 = null;
        if (SQ.e(C3786Nv1.class)) {
            return null;
        }
        try {
            C6562gT0.p(c6718h71, "x");
            C6562gT0.p(c6718h712, "w");
            int i = 0;
            int b = c6718h71.b(0);
            int b2 = c6718h71.b(1);
            int b3 = c6718h71.b(2);
            int b4 = c6718h712.b(0);
            int i2 = (b2 - b4) + 1;
            int b5 = c6718h712.b(2);
            C6718h71 c6718h715 = new C6718h71(new int[]{b, i2, b5});
            float[] a2 = c6718h71.a();
            float[] a3 = c6718h715.a();
            float[] a4 = c6718h712.a();
            if (b > 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    if (b5 > 0) {
                        int i5 = i;
                        while (true) {
                            int i6 = i5 + 1;
                            if (i2 > 0) {
                                int i7 = 0;
                                while (true) {
                                    c6718h713 = c6718h714;
                                    int i8 = i7 + 1;
                                    float f = 0.0f;
                                    if (b4 > 0) {
                                        int i9 = 0;
                                        while (true) {
                                            fArr = a2;
                                            int i10 = i9 + 1;
                                            if (b3 > 0) {
                                                int i11 = 0;
                                                while (true) {
                                                    fArr2 = a4;
                                                    int i12 = i11 + 1;
                                                    try {
                                                        f += fArr[(b2 * b3 * i3) + ((i9 + i7) * b3) + i11] * fArr2[(((i9 * b3) + i11) * b5) + i5];
                                                        if (i12 >= b3) {
                                                            break;
                                                        }
                                                        i11 = i12;
                                                        a4 = fArr2;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        SQ.c(th, C3786Nv1.class);
                                                        return c6718h713;
                                                    }
                                                }
                                            } else {
                                                fArr2 = a4;
                                            }
                                            if (i10 >= b4) {
                                                break;
                                            }
                                            a4 = fArr2;
                                            i9 = i10;
                                            a2 = fArr;
                                        }
                                    } else {
                                        fArr = a2;
                                        fArr2 = a4;
                                    }
                                    a3[(i2 * b5 * i3) + (i7 * b5) + i5] = f;
                                    if (i8 >= i2) {
                                        break;
                                    }
                                    a2 = fArr;
                                    a4 = fArr2;
                                    i7 = i8;
                                    c6718h714 = c6718h713;
                                }
                            } else {
                                fArr = a2;
                                fArr2 = a4;
                                c6718h713 = c6718h714;
                            }
                            if (i6 >= b5) {
                                break;
                            }
                            a2 = fArr;
                            a4 = fArr2;
                            i5 = i6;
                            c6718h714 = c6718h713;
                        }
                    } else {
                        fArr = a2;
                        fArr2 = a4;
                        c6718h713 = c6718h714;
                    }
                    if (i4 >= b) {
                        break;
                    }
                    a2 = fArr;
                    a4 = fArr2;
                    i3 = i4;
                    c6718h714 = c6718h713;
                    i = 0;
                }
            }
            return c6718h715;
        } catch (Throwable th2) {
            th = th2;
            c6718h713 = null;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final C6718h71 d(@NotNull C6718h71 c6718h71, @NotNull C6718h71 c6718h712, @NotNull C6718h71 c6718h713) {
        if (SQ.e(C3786Nv1.class)) {
            return null;
        }
        try {
            C6562gT0.p(c6718h71, "x");
            C6562gT0.p(c6718h712, "w");
            C6562gT0.p(c6718h713, "b");
            int b = c6718h71.b(0);
            int b2 = c6718h713.b(0);
            C6718h71 h = h(c6718h71, c6718h712);
            float[] a2 = c6718h713.a();
            float[] a3 = h.a();
            if (b > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (b2 > 0) {
                        int i3 = 0;
                        while (true) {
                            int i4 = i3 + 1;
                            int i5 = (i * b2) + i3;
                            a3[i5] = a3[i5] + a2[i3];
                            if (i4 >= b2) {
                                break;
                            }
                            i3 = i4;
                        }
                    }
                    if (i2 >= b) {
                        break;
                    }
                    i = i2;
                }
            }
            return h;
        } catch (Throwable th) {
            SQ.c(th, C3786Nv1.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final C6718h71 e(@NotNull String[] strArr, int i, @NotNull C6718h71 c6718h71) {
        if (SQ.e(C3786Nv1.class)) {
            return null;
        }
        try {
            C6562gT0.p(strArr, "texts");
            C6562gT0.p(c6718h71, "w");
            int length = strArr.length;
            int b = c6718h71.b(1);
            C6718h71 c6718h712 = new C6718h71(new int[]{length, i, b});
            float[] a2 = c6718h712.a();
            float[] a3 = c6718h71.a();
            if (length > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    int[] d = C6249fE2.a.d(strArr[i2], i);
                    if (i > 0) {
                        int i4 = 0;
                        while (true) {
                            int i5 = i4 + 1;
                            System.arraycopy(a3, d[i4] * b, a2, (b * i * i2) + (i4 * b), b);
                            if (i5 >= i) {
                                break;
                            }
                            i4 = i5;
                        }
                    }
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return c6718h712;
        } catch (Throwable th) {
            SQ.c(th, C3786Nv1.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    public static final void f(@NotNull C6718h71 c6718h71, int i) {
        if (!SQ.e(C3786Nv1.class)) {
            try {
                C6562gT0.p(c6718h71, "x");
                if (i >= c6718h71.c()) {
                    return;
                }
                int c = c6718h71.c();
                int i2 = 1;
                if (i < c) {
                    int i3 = i;
                    while (true) {
                        int i4 = i3 + 1;
                        i2 *= c6718h71.b(i3);
                        if (i4 >= c) {
                            break;
                        }
                        i3 = i4;
                    }
                }
                int[] iArr = new int[i + 1];
                if (i > 0) {
                    int i5 = 0;
                    while (true) {
                        int i6 = i5 + 1;
                        iArr[i5] = c6718h71.b(i5);
                        if (i6 >= i) {
                            break;
                        }
                        i5 = i6;
                    }
                }
                iArr[i] = i2;
                c6718h71.d(iArr);
            } catch (Throwable th) {
                SQ.c(th, C3786Nv1.class);
            }
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final C6718h71 g(@NotNull C6718h71 c6718h71, int i) {
        C6718h71 c6718h712;
        float[] fArr;
        C6718h71 c6718h713 = null;
        if (SQ.e(C3786Nv1.class)) {
            return null;
        }
        try {
            C6562gT0.p(c6718h71, "x");
            int i2 = 0;
            int b = c6718h71.b(0);
            int b2 = c6718h71.b(1);
            int b3 = c6718h71.b(2);
            int i3 = (b2 - i) + 1;
            C6718h71 c6718h714 = new C6718h71(new int[]{b, i3, b3});
            float[] a2 = c6718h71.a();
            float[] a3 = c6718h714.a();
            if (b > 0) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    if (b3 > 0) {
                        int i6 = i2;
                        while (true) {
                            int i7 = i6 + 1;
                            if (i3 > 0) {
                                int i8 = i2;
                                while (true) {
                                    int i9 = i8 + 1;
                                    int i10 = i8 * b3;
                                    int i11 = (i4 * i3 * b3) + i10 + i6;
                                    int i12 = (i4 * b2 * b3) + i10 + i6;
                                    a3[i11] = Float.MIN_VALUE;
                                    if (i > 0) {
                                        int i13 = 0;
                                        while (true) {
                                            c6718h712 = c6718h713;
                                            int i14 = i13 + 1;
                                            fArr = a2;
                                            try {
                                                a3[i11] = Math.max(a3[i11], fArr[i12 + (i13 * b3)]);
                                                if (i14 >= i) {
                                                    break;
                                                }
                                                a2 = fArr;
                                                i13 = i14;
                                                c6718h713 = c6718h712;
                                            } catch (Throwable th) {
                                                th = th;
                                                SQ.c(th, C3786Nv1.class);
                                                return c6718h712;
                                            }
                                        }
                                    } else {
                                        fArr = a2;
                                        c6718h712 = c6718h713;
                                    }
                                    if (i9 >= i3) {
                                        break;
                                    }
                                    a2 = fArr;
                                    i8 = i9;
                                    c6718h713 = c6718h712;
                                }
                            } else {
                                fArr = a2;
                                c6718h712 = c6718h713;
                            }
                            if (i7 >= b3) {
                                break;
                            }
                            a2 = fArr;
                            i6 = i7;
                            c6718h713 = c6718h712;
                            i2 = 0;
                        }
                    } else {
                        fArr = a2;
                        c6718h712 = c6718h713;
                    }
                    if (i5 >= b) {
                        break;
                    }
                    a2 = fArr;
                    i4 = i5;
                    c6718h713 = c6718h712;
                    i2 = 0;
                }
            }
            return c6718h714;
        } catch (Throwable th2) {
            th = th2;
            c6718h712 = c6718h713;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final C6718h71 h(@NotNull C6718h71 c6718h71, @NotNull C6718h71 c6718h712) {
        if (SQ.e(C3786Nv1.class)) {
            return null;
        }
        try {
            C6562gT0.p(c6718h71, "x");
            C6562gT0.p(c6718h712, "w");
            int i = 0;
            int b = c6718h71.b(0);
            int b2 = c6718h712.b(0);
            int b3 = c6718h712.b(1);
            C6718h71 c6718h713 = new C6718h71(new int[]{b, b3});
            float[] a2 = c6718h71.a();
            float[] a3 = c6718h712.a();
            float[] a4 = c6718h713.a();
            if (b > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    if (b3 > 0) {
                        int i4 = i;
                        while (true) {
                            int i5 = i4 + 1;
                            int i6 = (i2 * b3) + i4;
                            a4[i6] = 0.0f;
                            if (b2 > 0) {
                                int i7 = i;
                                while (true) {
                                    int i8 = i7 + 1;
                                    a4[i6] = a4[i6] + (a2[(i2 * b2) + i7] * a3[(i7 * b3) + i4]);
                                    if (i8 >= b2) {
                                        break;
                                    }
                                    i7 = i8;
                                }
                            }
                            if (i5 >= b3) {
                                break;
                            }
                            i4 = i5;
                            i = 0;
                        }
                    }
                    if (i3 >= b) {
                        break;
                    }
                    i2 = i3;
                    i = 0;
                }
            }
            return c6718h713;
        } catch (Throwable th) {
            SQ.c(th, C3786Nv1.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    public static final void i(@NotNull C6718h71 c6718h71) {
        if (!SQ.e(C3786Nv1.class)) {
            try {
                C6562gT0.p(c6718h71, "x");
                float[] a2 = c6718h71.a();
                int length = a2.length - 1;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        if (a2[i] < 0.0f) {
                            a2[i] = 0.0f;
                        }
                        if (i2 <= length) {
                            i = i2;
                        } else {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, C3786Nv1.class);
            }
        }
    }

    @InterfaceC9511sW0
    public static final void j(@NotNull C6718h71 c6718h71) {
        if (!SQ.e(C3786Nv1.class)) {
            try {
                C6562gT0.p(c6718h71, "x");
                int i = 0;
                int b = c6718h71.b(0);
                int b2 = c6718h71.b(1);
                float[] a2 = c6718h71.a();
                if (b <= 0) {
                    return;
                }
                while (true) {
                    int i2 = i + 1;
                    int i3 = i * b2;
                    int i4 = i3 + b2;
                    float f = Float.MIN_VALUE;
                    if (i3 < i4) {
                        int i5 = i3;
                        while (true) {
                            int i6 = i5 + 1;
                            float f2 = a2[i5];
                            if (f2 > f) {
                                f = f2;
                            }
                            if (i6 >= i4) {
                                break;
                            }
                            i5 = i6;
                        }
                    }
                    float f3 = 0.0f;
                    if (i3 < i4) {
                        int i7 = i3;
                        while (true) {
                            int i8 = i7 + 1;
                            float exp = (float) Math.exp(a2[i7] - f);
                            a2[i7] = exp;
                            f3 += exp;
                            if (i8 >= i4) {
                                break;
                            }
                            i7 = i8;
                        }
                    }
                    if (i3 < i4) {
                        while (true) {
                            int i9 = i3 + 1;
                            a2[i3] = a2[i3] / f3;
                            if (i9 >= i4) {
                                break;
                            }
                            i3 = i9;
                        }
                    }
                    if (i2 < b) {
                        i = i2;
                    } else {
                        return;
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, C3786Nv1.class);
            }
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final C6718h71 k(@NotNull C6718h71 c6718h71) {
        if (SQ.e(C3786Nv1.class)) {
            return null;
        }
        try {
            C6562gT0.p(c6718h71, "x");
            int b = c6718h71.b(0);
            int b2 = c6718h71.b(1);
            C6718h71 c6718h712 = new C6718h71(new int[]{b2, b});
            float[] a2 = c6718h71.a();
            float[] a3 = c6718h712.a();
            if (b > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (b2 > 0) {
                        int i3 = 0;
                        while (true) {
                            int i4 = i3 + 1;
                            a3[(i3 * b) + i] = a2[(i * b2) + i3];
                            if (i4 >= b2) {
                                break;
                            }
                            i3 = i4;
                        }
                    }
                    if (i2 >= b) {
                        break;
                    }
                    i = i2;
                }
            }
            return c6718h712;
        } catch (Throwable th) {
            SQ.c(th, C3786Nv1.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final C6718h71 l(@NotNull C6718h71 c6718h71) {
        if (SQ.e(C3786Nv1.class)) {
            return null;
        }
        try {
            C6562gT0.p(c6718h71, "x");
            int b = c6718h71.b(0);
            int b2 = c6718h71.b(1);
            int b3 = c6718h71.b(2);
            C6718h71 c6718h712 = new C6718h71(new int[]{b3, b2, b});
            float[] a2 = c6718h71.a();
            float[] a3 = c6718h712.a();
            if (b > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (b2 > 0) {
                        int i3 = 0;
                        while (true) {
                            int i4 = i3 + 1;
                            if (b3 > 0) {
                                int i5 = 0;
                                while (true) {
                                    int i6 = i5 + 1;
                                    a3[(i5 * b * b2) + (i3 * b) + i] = a2[(i * b2 * b3) + (i3 * b3) + i5];
                                    if (i6 >= b3) {
                                        break;
                                    }
                                    i5 = i6;
                                }
                            }
                            if (i4 >= b2) {
                                break;
                            }
                            i3 = i4;
                        }
                    }
                    if (i2 >= b) {
                        break;
                    }
                    i = i2;
                }
            }
            return c6718h712;
        } catch (Throwable th) {
            SQ.c(th, C3786Nv1.class);
            return null;
        }
    }
}
