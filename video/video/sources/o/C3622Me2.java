package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: o.Me2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3622Me2 implements ListIterator<String>, Cloneable {
    public static final C3622Me2 e1;
    public static final C3622Me2 f1;
    public char[] X;
    public String[] Y;
    public InterfaceC2828Ee2 Y0;
    public int Z;
    public InterfaceC2828Ee2 Z0;
    public InterfaceC2828Ee2 a1;
    public InterfaceC2828Ee2 b1;
    public boolean c1;
    public boolean d1;

    static {
        C3622Me2 c3622Me2 = new C3622Me2();
        e1 = c3622Me2;
        C2937Fe2 c2937Fe2 = C2937Fe2.c;
        c3622Me2.I(c2937Fe2.e());
        c3622Me2.P(c2937Fe2.f());
        c3622Me2.N(c2937Fe2.g());
        c3622Me2.Q(c2937Fe2.o());
        c3622Me2.K(false);
        c3622Me2.L(false);
        C3622Me2 c3622Me22 = new C3622Me2();
        f1 = c3622Me22;
        c3622Me22.I(c2937Fe2.n());
        c3622Me22.P(c2937Fe2.f());
        c3622Me22.N(c2937Fe2.g());
        c3622Me22.Q(c2937Fe2.o());
        c3622Me22.K(false);
        c3622Me22.L(false);
    }

    public C3622Me2() {
        C2937Fe2 c2937Fe2 = C2937Fe2.c;
        this.Y0 = c2937Fe2.k();
        this.Z0 = c2937Fe2.g();
        this.a1 = c2937Fe2.g();
        this.b1 = c2937Fe2.g();
        this.d1 = true;
        this.X = null;
    }

    public static C3622Me2 f() {
        return (C3622Me2) e1.clone();
    }

    public static C3622Me2 g() {
        return f();
    }

    public static C3622Me2 h(String str) {
        return f().E(str);
    }

    public static C3622Me2 i(char[] cArr) {
        return f().F(cArr);
    }

    public static C3622Me2 n() {
        return (C3622Me2) f1.clone();
    }

    public static C3622Me2 o() {
        return n();
    }

    public static C3622Me2 p(String str) {
        return n().E(str);
    }

    public static C3622Me2 q(char[] cArr) {
        return n().F(cArr);
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

    public final int B(char[] cArr, int i, int i2, C4726Xm2 c4726Xm2, List<String> list) {
        int i3 = i;
        while (i3 < i2) {
            int max = Math.max(l().b(cArr, i3, i3, i2), t().b(cArr, i3, i3, i2));
            if (max == 0 || k().b(cArr, i3, i3, i2) > 0 || m().b(cArr, i3, i3, i2) > 0) {
                break;
            }
            i3 += max;
        }
        if (i3 >= i2) {
            c(list, "");
            return -1;
        }
        int b = k().b(cArr, i3, i3, i2);
        if (b > 0) {
            c(list, "");
            return i3 + b;
        }
        int b2 = m().b(cArr, i3, i3, i2);
        if (b2 > 0) {
            int i4 = i3;
            return C(cArr, i4 + b2, i2, c4726Xm2, list, i4, b2);
        }
        return C(cArr, i3, i2, c4726Xm2, list, 0, 0);
    }

    public final int C(char[] cArr, int i, int i2, C4726Xm2 c4726Xm2, List<String> list, int i3, int i4) {
        boolean z;
        char[] cArr2;
        int i5;
        int i6 = i2;
        c4726Xm2.q0();
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
                        c4726Xm2.w(cArr, i9, i4);
                        i7 = (i4 * 2) + i9;
                        i8 = c4726Xm2.N1();
                    } else {
                        z2 = false;
                    }
                } else {
                    cArr2 = cArr;
                    i6 = i2;
                    i5 = i9;
                    c4726Xm2.append(cArr2[i5]);
                    i8 = c4726Xm2.N1();
                    i7 = i5 + 1;
                }
            } else {
                cArr2 = cArr;
                int i10 = i7;
                int b = k().b(cArr2, i10, i, i6);
                if (b > 0) {
                    c(list, c4726Xm2.Q1(0, i8));
                    return b + i10;
                }
                if (i4 > 0) {
                    i5 = i10;
                    if (w(cArr2, i5, i6, i3, i4)) {
                        i7 = i5 + i4;
                        z2 = true;
                    }
                } else {
                    i5 = i10;
                }
                int b2 = l().b(cArr2, i5, i, i6);
                if (b2 <= 0) {
                    b2 = t().b(cArr2, i5, i, i6);
                    if (b2 > 0) {
                        c4726Xm2.w(cArr2, i5, b2);
                    } else {
                        c4726Xm2.append(cArr2[i5]);
                        i8 = c4726Xm2.N1();
                        i7 = i5 + 1;
                    }
                }
                i7 = i5 + b2;
            }
        }
        c(list, c4726Xm2.Q1(0, i8));
        return -1;
    }

    public C3622Me2 D() {
        this.Z = 0;
        this.Y = null;
        return this;
    }

    public C3622Me2 E(String str) {
        char[] cArr;
        D();
        if (str != null) {
            cArr = str.toCharArray();
        } else {
            cArr = null;
        }
        this.X = cArr;
        return this;
    }

    public C3622Me2 F(char[] cArr) {
        char[] cArr2;
        D();
        if (cArr != null) {
            cArr2 = (char[]) cArr.clone();
        } else {
            cArr2 = null;
        }
        this.X = cArr2;
        return this;
    }

    @Override // java.util.ListIterator
    /* renamed from: G */
    public void set(String str) {
        throw new UnsupportedOperationException("set() is unsupported");
    }

    public C3622Me2 H(char c) {
        return I(C2937Fe2.c.b(c));
    }

    public C3622Me2 I(InterfaceC2828Ee2 interfaceC2828Ee2) {
        if (interfaceC2828Ee2 == null) {
            interfaceC2828Ee2 = C2937Fe2.c.g();
        }
        this.Y0 = interfaceC2828Ee2;
        return this;
    }

    public C3622Me2 J(String str) {
        return I(C2937Fe2.c.l(str));
    }

    public C3622Me2 K(boolean z) {
        this.c1 = z;
        return this;
    }

    public C3622Me2 L(boolean z) {
        this.d1 = z;
        return this;
    }

    public C3622Me2 M(char c) {
        return N(C2937Fe2.c.b(c));
    }

    public C3622Me2 N(InterfaceC2828Ee2 interfaceC2828Ee2) {
        if (interfaceC2828Ee2 != null) {
            this.a1 = interfaceC2828Ee2;
        }
        return this;
    }

    public C3622Me2 O(char c) {
        return P(C2937Fe2.c.b(c));
    }

    public C3622Me2 P(InterfaceC2828Ee2 interfaceC2828Ee2) {
        if (interfaceC2828Ee2 != null) {
            this.Z0 = interfaceC2828Ee2;
        }
        return this;
    }

    public C3622Me2 Q(InterfaceC2828Ee2 interfaceC2828Ee2) {
        if (interfaceC2828Ee2 != null) {
            this.b1 = interfaceC2828Ee2;
        }
        return this;
    }

    public int R() {
        d();
        return this.Y.length;
    }

    public List<String> S(char[] cArr, int i, int i2) {
        if (cArr != null && i2 != 0) {
            C4726Xm2 c4726Xm2 = new C4726Xm2();
            ArrayList arrayList = new ArrayList();
            int i3 = i;
            while (i3 >= 0 && i3 < i2) {
                char[] cArr2 = cArr;
                int i4 = i2;
                i3 = B(cArr2, i3, i4, c4726Xm2, arrayList);
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
        if (str == null || str.isEmpty()) {
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
        List<String> S;
        if (this.Y == null) {
            char[] cArr = this.X;
            if (cArr == null) {
                S = S(null, 0, 0);
            } else {
                S = S(cArr, 0, cArr.length);
            }
            this.Y = (String[]) S.toArray(C4206Se.u);
        }
    }

    public Object e() throws CloneNotSupportedException {
        C3622Me2 c3622Me2 = (C3622Me2) super.clone();
        char[] cArr = c3622Me2.X;
        if (cArr != null) {
            c3622Me2.X = (char[]) cArr.clone();
        }
        c3622Me2.D();
        return c3622Me2;
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

    public InterfaceC2828Ee2 k() {
        return this.Y0;
    }

    public InterfaceC2828Ee2 l() {
        return this.a1;
    }

    public InterfaceC2828Ee2 m() {
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
        return Arrays.asList(this.Y);
    }

    public InterfaceC2828Ee2 t() {
        return this.b1;
    }

    public String toString() {
        if (this.Y == null) {
            return "StringTokenizer[not tokenized yet]";
        }
        return "StringTokenizer" + s();
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

    public C3622Me2(char[] cArr) {
        C2937Fe2 c2937Fe2 = C2937Fe2.c;
        this.Y0 = c2937Fe2.k();
        this.Z0 = c2937Fe2.g();
        this.a1 = c2937Fe2.g();
        this.b1 = c2937Fe2.g();
        this.d1 = true;
        this.X = cArr != null ? (char[]) cArr.clone() : null;
    }

    public C3622Me2(char[] cArr, char c) {
        this(cArr);
        H(c);
    }

    public C3622Me2(char[] cArr, char c, char c2) {
        this(cArr, c);
        O(c2);
    }

    public C3622Me2(char[] cArr, String str) {
        this(cArr);
        J(str);
    }

    public C3622Me2(char[] cArr, InterfaceC2828Ee2 interfaceC2828Ee2) {
        this(cArr);
        I(interfaceC2828Ee2);
    }

    public C3622Me2(char[] cArr, InterfaceC2828Ee2 interfaceC2828Ee2, InterfaceC2828Ee2 interfaceC2828Ee22) {
        this(cArr, interfaceC2828Ee2);
        P(interfaceC2828Ee22);
    }

    public C3622Me2(String str) {
        C2937Fe2 c2937Fe2 = C2937Fe2.c;
        this.Y0 = c2937Fe2.k();
        this.Z0 = c2937Fe2.g();
        this.a1 = c2937Fe2.g();
        this.b1 = c2937Fe2.g();
        this.d1 = true;
        this.X = str != null ? str.toCharArray() : null;
    }

    public C3622Me2(String str, char c) {
        this(str);
        H(c);
    }

    public C3622Me2(String str, char c, char c2) {
        this(str, c);
        O(c2);
    }

    public C3622Me2(String str, String str2) {
        this(str);
        J(str2);
    }

    public C3622Me2(String str, InterfaceC2828Ee2 interfaceC2828Ee2) {
        this(str);
        I(interfaceC2828Ee2);
    }

    public C3622Me2(String str, InterfaceC2828Ee2 interfaceC2828Ee2, InterfaceC2828Ee2 interfaceC2828Ee22) {
        this(str, interfaceC2828Ee2);
        P(interfaceC2828Ee22);
    }
}
