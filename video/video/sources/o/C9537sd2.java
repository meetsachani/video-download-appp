package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

@Deprecated
/* renamed from: o.sd2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9537sd2 implements ListIterator<String>, Cloneable {
    public static final C9537sd2 e1;
    public static final C9537sd2 f1;
    public char[] X;
    public String[] Y;
    public AbstractC8315nd2 Y0;
    public int Z;
    public AbstractC8315nd2 Z0;
    public AbstractC8315nd2 a1;
    public AbstractC8315nd2 b1;
    public boolean c1;
    public boolean d1;

    static {
        C9537sd2 c9537sd2 = new C9537sd2();
        e1 = c9537sd2;
        c9537sd2.I(AbstractC8315nd2.d());
        c9537sd2.P(AbstractC8315nd2.e());
        c9537sd2.N(AbstractC8315nd2.h());
        c9537sd2.Q(AbstractC8315nd2.o());
        c9537sd2.K(false);
        c9537sd2.L(false);
        C9537sd2 c9537sd22 = new C9537sd2();
        f1 = c9537sd22;
        c9537sd22.I(AbstractC8315nd2.n());
        c9537sd22.P(AbstractC8315nd2.e());
        c9537sd22.N(AbstractC8315nd2.h());
        c9537sd22.Q(AbstractC8315nd2.o());
        c9537sd22.K(false);
        c9537sd22.L(false);
    }

    public C9537sd2() {
        this.Y0 = AbstractC8315nd2.l();
        this.Z0 = AbstractC8315nd2.h();
        this.a1 = AbstractC8315nd2.h();
        this.b1 = AbstractC8315nd2.h();
        this.d1 = true;
        this.X = null;
    }

    public static C9537sd2 f() {
        return (C9537sd2) e1.clone();
    }

    public static C9537sd2 g() {
        return f();
    }

    public static C9537sd2 h(String str) {
        C9537sd2 f = f();
        f.E(str);
        return f;
    }

    public static C9537sd2 i(char[] cArr) {
        C9537sd2 f = f();
        f.F(cArr);
        return f;
    }

    public static C9537sd2 n() {
        return (C9537sd2) f1.clone();
    }

    public static C9537sd2 o() {
        return n();
    }

    public static C9537sd2 p(String str) {
        C9537sd2 n = n();
        n.E(str);
        return n;
    }

    public static C9537sd2 q(char[] cArr) {
        C9537sd2 n = n();
        n.F(cArr);
        return n;
    }

    public String A() {
        if (hasPrevious()) {
            String[] strArr = this.Y;
            int i = this.Z - 1;
            this.Z = i;
            return strArr[i];
        }
        return null;
    }

    public final int B(char[] cArr, int i, int i2, C7325jd2 c7325jd2, List<String> list) {
        int i3 = i;
        while (i3 < i2) {
            int max = Math.max(l().g(cArr, i3, i3, i2), t().g(cArr, i3, i3, i2));
            if (max == 0 || k().g(cArr, i3, i3, i2) > 0 || m().g(cArr, i3, i3, i2) > 0) {
                break;
            }
            i3 += max;
        }
        if (i3 >= i2) {
            c(list, "");
            return -1;
        }
        int g = k().g(cArr, i3, i3, i2);
        if (g > 0) {
            c(list, "");
            return i3 + g;
        }
        int g2 = m().g(cArr, i3, i3, i2);
        if (g2 > 0) {
            int i4 = i3;
            return C(cArr, i4 + g2, i2, c7325jd2, list, i4, g2);
        }
        return C(cArr, i3, i2, c7325jd2, list, 0, 0);
    }

    public final int C(char[] cArr, int i, int i2, C7325jd2 c7325jd2, List<String> list, int i3, int i4) {
        boolean z;
        int i5;
        int i6 = i2;
        c7325jd2.o0();
        if (i4 > 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        int i7 = i;
        int i8 = 0;
        while (i7 < i6) {
            if (z2) {
                int i9 = i7;
                if (w(cArr, i7, i6, i3, i4)) {
                    i7 = i9 + i4;
                    i6 = i2;
                    if (w(cArr, i7, i6, i3, i4)) {
                        c7325jd2.w(cArr, i9, i4);
                        i7 = (i4 * 2) + i9;
                        i8 = c7325jd2.B1();
                    } else {
                        z2 = false;
                    }
                } else {
                    i6 = i2;
                    i7 = i9 + 1;
                    c7325jd2.append(cArr[i9]);
                    i8 = c7325jd2.B1();
                }
            } else {
                int i10 = i7;
                int g = k().g(cArr, i10, i, i6);
                if (g > 0) {
                    c(list, c7325jd2.E1(0, i8));
                    return g + i10;
                }
                if (i4 > 0) {
                    i5 = i10;
                    if (w(cArr, i5, i6, i3, i4)) {
                        i7 = i5 + i4;
                        z2 = true;
                    }
                } else {
                    i5 = i10;
                }
                int g2 = l().g(cArr, i5, i, i6);
                if (g2 <= 0) {
                    g2 = t().g(cArr, i5, i, i6);
                    if (g2 > 0) {
                        c7325jd2.w(cArr, i5, g2);
                    } else {
                        c7325jd2.append(cArr[i5]);
                        i8 = c7325jd2.B1();
                        i7 = i5 + 1;
                    }
                }
                i7 = i5 + g2;
            }
        }
        c(list, c7325jd2.E1(0, i8));
        return -1;
    }

    public C9537sd2 D() {
        this.Z = 0;
        this.Y = null;
        return this;
    }

    public C9537sd2 E(String str) {
        D();
        if (str != null) {
            this.X = str.toCharArray();
            return this;
        }
        this.X = null;
        return this;
    }

    public C9537sd2 F(char[] cArr) {
        D();
        this.X = C4206Se.M(cArr);
        return this;
    }

    @Override // java.util.ListIterator
    /* renamed from: G */
    public void set(String str) {
        throw new UnsupportedOperationException("set() is unsupported");
    }

    public C9537sd2 H(char c) {
        return I(AbstractC8315nd2.a(c));
    }

    public C9537sd2 I(AbstractC8315nd2 abstractC8315nd2) {
        if (abstractC8315nd2 == null) {
            this.Y0 = AbstractC8315nd2.h();
            return this;
        }
        this.Y0 = abstractC8315nd2;
        return this;
    }

    public C9537sd2 J(String str) {
        return I(AbstractC8315nd2.m(str));
    }

    public C9537sd2 K(boolean z) {
        this.c1 = z;
        return this;
    }

    public C9537sd2 L(boolean z) {
        this.d1 = z;
        return this;
    }

    public C9537sd2 M(char c) {
        return N(AbstractC8315nd2.a(c));
    }

    public C9537sd2 N(AbstractC8315nd2 abstractC8315nd2) {
        if (abstractC8315nd2 != null) {
            this.a1 = abstractC8315nd2;
        }
        return this;
    }

    public C9537sd2 O(char c) {
        return P(AbstractC8315nd2.a(c));
    }

    public C9537sd2 P(AbstractC8315nd2 abstractC8315nd2) {
        if (abstractC8315nd2 != null) {
            this.Z0 = abstractC8315nd2;
        }
        return this;
    }

    public C9537sd2 Q(AbstractC8315nd2 abstractC8315nd2) {
        if (abstractC8315nd2 != null) {
            this.b1 = abstractC8315nd2;
        }
        return this;
    }

    public int R() {
        d();
        return this.Y.length;
    }

    public List<String> S(char[] cArr, int i, int i2) {
        if (cArr != null && i2 != 0) {
            C7325jd2 c7325jd2 = new C7325jd2();
            ArrayList arrayList = new ArrayList();
            int i3 = i;
            while (i3 >= 0 && i3 < i2) {
                char[] cArr2 = cArr;
                int i4 = i2;
                i3 = B(cArr2, i3, i4, c7325jd2, arrayList);
                if (i3 >= i4) {
                    c(arrayList, "");
                }
                cArr = cArr2;
                i2 = i4;
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    @Override // java.util.ListIterator
    /* renamed from: b */
    public void add(String str) {
        throw new UnsupportedOperationException("add() is unsupported");
    }

    public final void c(List<String> list, String str) {
        if (C4500Ve2.I0(str)) {
            if (v()) {
                return;
            }
            if (u()) {
                str = null;
            }
        }
        list.add(str);
    }

    public Object clone() {
        try {
            return e();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public final void d() {
        if (this.Y == null) {
            char[] cArr = this.X;
            if (cArr == null) {
                this.Y = (String[]) S(null, 0, 0).toArray(C4206Se.u);
            } else {
                this.Y = (String[]) S(cArr, 0, cArr.length).toArray(C4206Se.u);
            }
        }
    }

    public Object e() throws CloneNotSupportedException {
        C9537sd2 c9537sd2 = (C9537sd2) super.clone();
        char[] cArr = c9537sd2.X;
        if (cArr != null) {
            c9537sd2.X = (char[]) cArr.clone();
        }
        c9537sd2.D();
        return c9537sd2;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        d();
        if (this.Z < this.Y.length) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        d();
        if (this.Z > 0) {
            return true;
        }
        return false;
    }

    public String j() {
        char[] cArr = this.X;
        if (cArr == null) {
            return null;
        }
        return new String(cArr);
    }

    public AbstractC8315nd2 k() {
        return this.Y0;
    }

    public AbstractC8315nd2 l() {
        return this.a1;
    }

    public AbstractC8315nd2 m() {
        return this.Z0;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.Z;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.Z - 1;
    }

    public String[] r() {
        d();
        return (String[]) this.Y.clone();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() is unsupported");
    }

    public List<String> s() {
        d();
        ArrayList arrayList = new ArrayList(this.Y.length);
        arrayList.addAll(Arrays.asList(this.Y));
        return arrayList;
    }

    public AbstractC8315nd2 t() {
        return this.b1;
    }

    public String toString() {
        if (this.Y == null) {
            return "StrTokenizer[not tokenized yet]";
        }
        return "StrTokenizer" + s();
    }

    public boolean u() {
        return this.c1;
    }

    public boolean v() {
        return this.d1;
    }

    public final boolean w(char[] cArr, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i + i5;
            if (i6 >= i2 || cArr[i6] != cArr[i3 + i5]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    /* renamed from: x */
    public String next() {
        if (hasNext()) {
            String[] strArr = this.Y;
            int i = this.Z;
            this.Z = i + 1;
            return strArr[i];
        }
        throw new NoSuchElementException();
    }

    public String y() {
        if (hasNext()) {
            String[] strArr = this.Y;
            int i = this.Z;
            this.Z = i + 1;
            return strArr[i];
        }
        return null;
    }

    @Override // java.util.ListIterator
    /* renamed from: z */
    public String previous() {
        if (hasPrevious()) {
            String[] strArr = this.Y;
            int i = this.Z - 1;
            this.Z = i;
            return strArr[i];
        }
        throw new NoSuchElementException();
    }

    public C9537sd2(String str) {
        this.Y0 = AbstractC8315nd2.l();
        this.Z0 = AbstractC8315nd2.h();
        this.a1 = AbstractC8315nd2.h();
        this.b1 = AbstractC8315nd2.h();
        this.d1 = true;
        if (str != null) {
            this.X = str.toCharArray();
        } else {
            this.X = null;
        }
    }

    public C9537sd2(String str, char c) {
        this(str);
        H(c);
    }

    public C9537sd2(String str, String str2) {
        this(str);
        J(str2);
    }

    public C9537sd2(String str, AbstractC8315nd2 abstractC8315nd2) {
        this(str);
        I(abstractC8315nd2);
    }

    public C9537sd2(String str, char c, char c2) {
        this(str, c);
        O(c2);
    }

    public C9537sd2(String str, AbstractC8315nd2 abstractC8315nd2, AbstractC8315nd2 abstractC8315nd22) {
        this(str, abstractC8315nd2);
        P(abstractC8315nd22);
    }

    public C9537sd2(char[] cArr) {
        this.Y0 = AbstractC8315nd2.l();
        this.Z0 = AbstractC8315nd2.h();
        this.a1 = AbstractC8315nd2.h();
        this.b1 = AbstractC8315nd2.h();
        this.d1 = true;
        this.X = C4206Se.M(cArr);
    }

    public C9537sd2(char[] cArr, char c) {
        this(cArr);
        H(c);
    }

    public C9537sd2(char[] cArr, String str) {
        this(cArr);
        J(str);
    }

    public C9537sd2(char[] cArr, AbstractC8315nd2 abstractC8315nd2) {
        this(cArr);
        I(abstractC8315nd2);
    }

    public C9537sd2(char[] cArr, char c, char c2) {
        this(cArr, c);
        O(c2);
    }

    public C9537sd2(char[] cArr, AbstractC8315nd2 abstractC8315nd2, AbstractC8315nd2 abstractC8315nd22) {
        this(cArr, abstractC8315nd2);
        P(abstractC8315nd22);
    }
}
