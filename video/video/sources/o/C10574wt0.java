package o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* renamed from: o.wt0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10574wt0 {
    public static final int f = 2;
    public static final int g = 3;
    public static final int h = 97;
    public final C2469An a;
    public final List<C10085ut0> b;
    public boolean c;
    public final int[] d;
    public final VT1 e;

    /* renamed from: o.wt0$b */
    /* loaded from: classes3.dex */
    public static final class b implements Serializable, Comparator<C10085ut0> {
        public final float X;

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C10085ut0 c10085ut0, C10085ut0 c10085ut02) {
            int compare = Integer.compare(c10085ut02.h(), c10085ut0.h());
            if (compare == 0) {
                return Float.compare(Math.abs(c10085ut0.i() - this.X), Math.abs(c10085ut02.i() - this.X));
            }
            return compare;
        }

        public b(float f) {
            this.X = f;
        }
    }

    /* renamed from: o.wt0$c */
    /* loaded from: classes3.dex */
    public static final class c implements Serializable, Comparator<C10085ut0> {
        public final float X;

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C10085ut0 c10085ut0, C10085ut0 c10085ut02) {
            return Float.compare(Math.abs(c10085ut02.i() - this.X), Math.abs(c10085ut0.i() - this.X));
        }

        public c(float f) {
            this.X = f;
        }
    }

    public C10574wt0(C2469An c2469An) {
        this(c2469An, null);
    }

    public static float a(int[] iArr, int i) {
        return ((i - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static boolean h(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f2 = i / 7.0f;
        float f3 = f2 / 2.0f;
        if (Math.abs(f2 - iArr[0]) >= f3 || Math.abs(f2 - iArr[1]) >= f3 || Math.abs((f2 * 3.0f) - iArr[2]) >= 3.0f * f3 || Math.abs(f2 - iArr[3]) >= f3 || Math.abs(f2 - iArr[4]) >= f3) {
            return false;
        }
        return true;
    }

    public static boolean i(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f2 = i / 7.0f;
        float f3 = f2 / 1.333f;
        if (Math.abs(f2 - iArr[0]) >= f3 || Math.abs(f2 - iArr[1]) >= f3 || Math.abs((f2 * 3.0f) - iArr[2]) >= 3.0f * f3 || Math.abs(f2 - iArr[3]) >= f3 || Math.abs(f2 - iArr[4]) >= f3) {
            return false;
        }
        return true;
    }

    public final void b(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = 0;
        }
    }

    public final boolean c(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int[] j = j();
        int i6 = 0;
        while (i >= i6 && i2 >= i6 && this.a.f(i2 - i6, i - i6)) {
            j[2] = j[2] + 1;
            i6++;
        }
        if (j[2] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && !this.a.f(i2 - i6, i - i6)) {
            j[1] = j[1] + 1;
            i6++;
        }
        if (j[1] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && this.a.f(i2 - i6, i - i6)) {
            j[0] = j[0] + 1;
            i6++;
        }
        if (j[0] == 0) {
            return false;
        }
        int i7 = this.a.i();
        int m = this.a.m();
        int i8 = 1;
        while (true) {
            int i9 = i + i8;
            if (i9 >= i7 || (i5 = i2 + i8) >= m || !this.a.f(i5, i9)) {
                break;
            }
            j[2] = j[2] + 1;
            i8++;
        }
        while (true) {
            int i10 = i + i8;
            if (i10 >= i7 || (i4 = i2 + i8) >= m || this.a.f(i4, i10)) {
                break;
            }
            j[3] = j[3] + 1;
            i8++;
        }
        if (j[3] == 0) {
            return false;
        }
        while (true) {
            int i11 = i + i8;
            if (i11 >= i7 || (i3 = i2 + i8) >= m || !this.a.f(i3, i11)) {
                break;
            }
            j[4] = j[4] + 1;
            i8++;
        }
        if (j[4] == 0) {
            return false;
        }
        return i(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
        if (r2[3] < r13) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0086, code lost:
        if (r11 >= r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008c, code lost:
        if (r0.f(r11, r12) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008e, code lost:
        r9 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0090, code lost:
        if (r9 >= r13) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0092, code lost:
        r2[4] = r9 + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0099, code lost:
        r12 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009b, code lost:
        if (r12 < r13) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009d, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b1, code lost:
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r12) - r14) * 5) < r14) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b3, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b8, code lost:
        if (h(r2) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00be, code lost:
        return a(r2, r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float d(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        C2469An c2469An = this.a;
        int m = c2469An.m();
        int[] j = j();
        int i7 = i;
        while (i7 >= 0 && c2469An.f(i7, i2)) {
            j[2] = j[2] + 1;
            i7--;
        }
        if (i7 < 0) {
            return Float.NaN;
        }
        while (i7 >= 0 && !c2469An.f(i7, i2)) {
            int i8 = j[1];
            if (i8 > i3) {
                break;
            }
            j[1] = i8 + 1;
            i7--;
        }
        if (i7 >= 0 && j[1] <= i3) {
            while (i7 >= 0 && c2469An.f(i7, i2) && (i6 = j[0]) <= i3) {
                j[0] = i6 + 1;
                i7--;
            }
            if (j[0] > i3) {
                return Float.NaN;
            }
            int i9 = i + 1;
            while (i9 < m && c2469An.f(i9, i2)) {
                j[2] = j[2] + 1;
                i9++;
            }
            if (i9 == m) {
                return Float.NaN;
            }
            while (i9 < m && !c2469An.f(i9, i2) && (i5 = j[3]) < i3) {
                j[3] = i5 + 1;
                i9++;
            }
        }
        return Float.NaN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
        if (r2[3] < r13) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0086, code lost:
        if (r11 >= r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008c, code lost:
        if (r0.f(r12, r11) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008e, code lost:
        r9 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0090, code lost:
        if (r9 >= r13) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0092, code lost:
        r2[4] = r9 + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0099, code lost:
        r12 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009b, code lost:
        if (r12 < r13) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009d, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b2, code lost:
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r12) - r14) * 5) < (r14 * 2)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b4, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b9, code lost:
        if (h(r2) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bf, code lost:
        return a(r2, r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float e(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        C2469An c2469An = this.a;
        int i7 = c2469An.i();
        int[] j = j();
        int i8 = i;
        while (i8 >= 0 && c2469An.f(i2, i8)) {
            j[2] = j[2] + 1;
            i8--;
        }
        if (i8 < 0) {
            return Float.NaN;
        }
        while (i8 >= 0 && !c2469An.f(i2, i8)) {
            int i9 = j[1];
            if (i9 > i3) {
                break;
            }
            j[1] = i9 + 1;
            i8--;
        }
        if (i8 >= 0 && j[1] <= i3) {
            while (i8 >= 0 && c2469An.f(i2, i8) && (i6 = j[0]) <= i3) {
                j[0] = i6 + 1;
                i8--;
            }
            if (j[0] > i3) {
                return Float.NaN;
            }
            int i10 = i + 1;
            while (i10 < i7 && c2469An.f(i2, i10)) {
                j[2] = j[2] + 1;
                i10++;
            }
            if (i10 == i7) {
                return Float.NaN;
            }
            while (i10 < i7 && !c2469An.f(i2, i10) && (i5 = j[3]) < i3) {
                j[3] = i5 + 1;
                i10++;
            }
        }
        return Float.NaN;
    }

    public final C10817xt0 f(Map<XV, ?> map) throws C9349rr1 {
        boolean z;
        if (map != null && map.containsKey(XV.TRY_HARDER)) {
            z = true;
        } else {
            z = false;
        }
        int i = this.a.i();
        int m = this.a.m();
        int i2 = (i * 3) / 388;
        if (i2 < 3 || z) {
            i2 = 3;
        }
        int[] iArr = new int[5];
        int i3 = i2 - 1;
        boolean z2 = false;
        while (i3 < i && !z2) {
            b(iArr);
            int i4 = 0;
            int i5 = 0;
            while (i4 < m) {
                if (this.a.f(i4, i3)) {
                    if ((i5 & 1) == 1) {
                        i5++;
                    }
                    iArr[i5] = iArr[i5] + 1;
                } else if ((i5 & 1) == 0) {
                    if (i5 == 4) {
                        if (h(iArr)) {
                            if (m(iArr, i3, i4)) {
                                if (this.c) {
                                    z2 = o();
                                } else {
                                    int g2 = g();
                                    int i6 = iArr[2];
                                    if (g2 > i6) {
                                        i3 += (g2 - i6) - 2;
                                        i4 = m - 1;
                                    }
                                }
                                b(iArr);
                                i2 = 2;
                                i5 = 0;
                            } else {
                                q(iArr);
                            }
                        } else {
                            q(iArr);
                        }
                        i5 = 3;
                    } else {
                        i5++;
                        iArr[i5] = iArr[i5] + 1;
                    }
                } else {
                    iArr[i5] = iArr[i5] + 1;
                }
                i4++;
            }
            if (h(iArr) && m(iArr, i3, m)) {
                i2 = iArr[0];
                if (this.c) {
                    z2 = o();
                }
            }
            i3 += i2;
        }
        C10085ut0[] p = p();
        UT1.e(p);
        return new C10817xt0(p);
    }

    public final int g() {
        if (this.b.size() <= 1) {
            return 0;
        }
        C10085ut0 c10085ut0 = null;
        for (C10085ut0 c10085ut02 : this.b) {
            if (c10085ut02.h() >= 2) {
                if (c10085ut0 == null) {
                    c10085ut0 = c10085ut02;
                } else {
                    this.c = true;
                    return ((int) (Math.abs(c10085ut0.c() - c10085ut02.c()) - Math.abs(c10085ut0.d() - c10085ut02.d()))) / 2;
                }
            }
        }
        return 0;
    }

    public final int[] j() {
        b(this.d);
        return this.d;
    }

    public final C2469An k() {
        return this.a;
    }

    public final List<C10085ut0> l() {
        return this.b;
    }

    public final boolean m(int[] iArr, int i, int i2) {
        int i3 = 0;
        int i4 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a2 = (int) a(iArr, i2);
        float e = e(i, a2, iArr[2], i4);
        if (!Float.isNaN(e)) {
            int i5 = (int) e;
            float d = d(a2, i5, iArr[2], i4);
            if (!Float.isNaN(d) && c(i5, (int) d)) {
                float f2 = i4 / 7.0f;
                while (true) {
                    if (i3 < this.b.size()) {
                        C10085ut0 c10085ut0 = this.b.get(i3);
                        if (c10085ut0.f(f2, e, d)) {
                            this.b.set(i3, c10085ut0.g(e, d, f2));
                            break;
                        }
                        i3++;
                    } else {
                        C10085ut0 c10085ut02 = new C10085ut0(d, e, f2);
                        this.b.add(c10085ut02);
                        VT1 vt1 = this.e;
                        if (vt1 != null) {
                            vt1.a(c10085ut02);
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public final boolean n(int[] iArr, int i, int i2, boolean z) {
        return m(iArr, i, i2);
    }

    public final boolean o() {
        int size = this.b.size();
        float f2 = 0.0f;
        int i = 0;
        float f3 = 0.0f;
        for (C10085ut0 c10085ut0 : this.b) {
            if (c10085ut0.h() >= 2) {
                i++;
                f3 += c10085ut0.i();
            }
        }
        if (i < 3) {
            return false;
        }
        float f4 = f3 / size;
        for (C10085ut0 c10085ut02 : this.b) {
            f2 += Math.abs(c10085ut02.i() - f4);
        }
        if (f2 > f3 * 0.05f) {
            return false;
        }
        return true;
    }

    public final C10085ut0[] p() throws C9349rr1 {
        float f2;
        int size = this.b.size();
        if (size >= 3) {
            float f3 = 0.0f;
            if (size > 3) {
                float f4 = 0.0f;
                float f5 = 0.0f;
                for (C10085ut0 c10085ut0 : this.b) {
                    float i = c10085ut0.i();
                    f4 += i;
                    f5 += i * i;
                }
                float f6 = f4 / size;
                float sqrt = (float) Math.sqrt((f5 / f2) - (f6 * f6));
                Collections.sort(this.b, new c(f6));
                float max = Math.max(0.2f * f6, sqrt);
                int i2 = 0;
                while (i2 < this.b.size() && this.b.size() > 3) {
                    if (Math.abs(this.b.get(i2).i() - f6) > max) {
                        this.b.remove(i2);
                        i2--;
                    }
                    i2++;
                }
            }
            if (this.b.size() > 3) {
                for (C10085ut0 c10085ut02 : this.b) {
                    f3 += c10085ut02.i();
                }
                Collections.sort(this.b, new b(f3 / this.b.size()));
                List<C10085ut0> list = this.b;
                list.subList(3, list.size()).clear();
            }
            return new C10085ut0[]{this.b.get(0), this.b.get(1), this.b.get(2)};
        }
        throw C9349rr1.a();
    }

    public final void q(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    public C10574wt0(C2469An c2469An, VT1 vt1) {
        this.a = c2469An;
        this.b = new ArrayList();
        this.d = new int[5];
        this.e = vt1;
    }
}
