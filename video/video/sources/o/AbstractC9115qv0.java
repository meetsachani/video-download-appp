package o;

import java.util.NoSuchElementException;

/* renamed from: o.qv0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9115qv0 {
    public float[] a;
    public int b;

    public /* synthetic */ AbstractC9115qv0(int i, C9516sY c9516sY) {
        this(i);
    }

    public static /* synthetic */ String P(AbstractC9115qv0 abstractC9115qv0, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                charSequence = C6566gU0.h;
            }
            if ((i2 & 2) != 0) {
                charSequence2 = "";
            }
            if ((i2 & 4) != 0) {
                charSequence3 = "";
            }
            if ((i2 & 8) != 0) {
                i = -1;
            }
            if ((i2 & 16) != 0) {
                charSequence4 = "...";
            }
            CharSequence charSequence5 = charSequence4;
            CharSequence charSequence6 = charSequence3;
            return abstractC9115qv0.I(charSequence, charSequence2, charSequence6, i, charSequence5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public static /* synthetic */ String Q(AbstractC9115qv0 abstractC9115qv0, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, HA0 ha0, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                charSequence = C6566gU0.h;
            }
            if ((i2 & 2) != 0) {
                charSequence2 = "";
            }
            if ((i2 & 4) != 0) {
                charSequence3 = "";
            }
            if ((i2 & 8) != 0) {
                i = -1;
            }
            if ((i2 & 16) != 0) {
                charSequence4 = "...";
            }
            C6562gT0.p(charSequence, "separator");
            C6562gT0.p(charSequence2, "prefix");
            C6562gT0.p(charSequence3, "postfix");
            C6562gT0.p(charSequence4, "truncated");
            C6562gT0.p(ha0, "transform");
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence2);
            float[] fArr = abstractC9115qv0.a;
            int i3 = abstractC9115qv0.b;
            int i4 = 0;
            while (true) {
                if (i4 < i3) {
                    float f = fArr[i4];
                    if (i4 == i) {
                        sb.append(charSequence4);
                        break;
                    }
                    if (i4 != 0) {
                        sb.append(charSequence);
                    }
                    sb.append((CharSequence) ha0.invoke(Float.valueOf(f)));
                    i4++;
                } else {
                    sb.append(charSequence3);
                    break;
                }
            }
            String sb2 = sb.toString();
            C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final int A(HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(ha0, "predicate");
        float[] fArr = this.a;
        int i = this.b;
        while (true) {
            i--;
            if (-1 >= i) {
                return -1;
            }
            if (ha0.invoke(Float.valueOf(fArr[i])).booleanValue()) {
                return i;
            }
        }
    }

    public final boolean B() {
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    public final boolean C() {
        if (this.b != 0) {
            return true;
        }
        return false;
    }

    public final String D() {
        return P(this, null, null, null, 0, null, 31, null);
    }

    public final String E(CharSequence charSequence) {
        C6562gT0.p(charSequence, "separator");
        return P(this, charSequence, null, null, 0, null, 30, null);
    }

    public final String F(CharSequence charSequence, CharSequence charSequence2) {
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        return P(this, charSequence, charSequence2, null, 0, null, 28, null);
    }

    public final String G(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        return P(this, charSequence, charSequence2, charSequence3, 0, null, 24, null);
    }

    public final String H(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i) {
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        return P(this, charSequence, charSequence2, charSequence3, i, null, 16, null);
    }

    public final String I(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4) {
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.a;
        int i2 = this.b;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                float f = fArr[i3];
                if (i3 == i) {
                    sb.append(charSequence4);
                    break;
                }
                if (i3 != 0) {
                    sb.append(charSequence);
                }
                sb.append(f);
                i3++;
            } else {
                sb.append(charSequence3);
                break;
            }
        }
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String J(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, HA0<? super Float, ? extends CharSequence> ha0) {
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        C6562gT0.p(ha0, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.a;
        int i2 = this.b;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                float f = fArr[i3];
                if (i3 == i) {
                    sb.append(charSequence4);
                    break;
                }
                if (i3 != 0) {
                    sb.append(charSequence);
                }
                sb.append(ha0.invoke(Float.valueOf(f)));
                i3++;
            } else {
                sb.append(charSequence3);
                break;
            }
        }
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String K(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, HA0<? super Float, ? extends CharSequence> ha0) {
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(ha0, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.a;
        int i2 = this.b;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                float f = fArr[i3];
                if (i3 == i) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i3 != 0) {
                    sb.append(charSequence);
                }
                sb.append(ha0.invoke(Float.valueOf(f)));
                i3++;
            } else {
                sb.append(charSequence3);
                break;
            }
        }
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String L(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, HA0<? super Float, ? extends CharSequence> ha0) {
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(ha0, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                float f = fArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append(charSequence);
                }
                sb.append(ha0.invoke(Float.valueOf(f)));
                i2++;
            } else {
                sb.append(charSequence3);
                break;
            }
        }
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String M(CharSequence charSequence, CharSequence charSequence2, HA0<? super Float, ? extends CharSequence> ha0) {
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(ha0, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                float f = fArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append(charSequence);
                }
                sb.append(ha0.invoke(Float.valueOf(f)));
                i2++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String N(CharSequence charSequence, HA0<? super Float, ? extends CharSequence> ha0) {
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(ha0, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        float[] fArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                float f = fArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append(charSequence);
                }
                sb.append(ha0.invoke(Float.valueOf(f)));
                i2++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String O(HA0<? super Float, ? extends CharSequence> ha0) {
        C6562gT0.p(ha0, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        float[] fArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                float f = fArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append((CharSequence) C6566gU0.h);
                }
                sb.append(ha0.invoke(Float.valueOf(f)));
                i2++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final float R() {
        if (!B()) {
            return this.a[this.b - 1];
        }
        throw new NoSuchElementException("FloatList is empty.");
    }

    public final float S(HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(ha0, "predicate");
        float[] fArr = this.a;
        int i = this.b;
        while (true) {
            i--;
            if (-1 < i) {
                float f = fArr[i];
                if (ha0.invoke(Float.valueOf(f)).booleanValue()) {
                    return f;
                }
            } else {
                throw new NoSuchElementException("FloatList contains no element matching the predicate.");
            }
        }
    }

    public final int T(float f) {
        float[] fArr = this.a;
        int i = this.b;
        while (true) {
            i--;
            if (-1 >= i) {
                return -1;
            }
            if (fArr[i] == f) {
                return i;
            }
        }
    }

    public final boolean U() {
        return B();
    }

    public final boolean V(HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(ha0, "predicate");
        float[] fArr = this.a;
        for (int i = this.b - 1; -1 < i; i--) {
            if (ha0.invoke(Float.valueOf(fArr[i])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        return C();
    }

    public final boolean b(HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(ha0, "predicate");
        float[] fArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (ha0.invoke(Float.valueOf(fArr[i2])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(float f) {
        float[] fArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (fArr[i2] == f) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(AbstractC9115qv0 abstractC9115qv0) {
        C6562gT0.p(abstractC9115qv0, "elements");
        C11197zR0 W1 = C5075aO1.W1(0, abstractC9115qv0.b);
        int j = W1.j();
        int k = W1.k();
        if (j <= k) {
            while (c(abstractC9115qv0.s(j))) {
                if (j != k) {
                    j++;
                } else {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC9115qv0) {
            AbstractC9115qv0 abstractC9115qv0 = (AbstractC9115qv0) obj;
            int i = abstractC9115qv0.b;
            int i2 = this.b;
            if (i == i2) {
                float[] fArr = this.a;
                float[] fArr2 = abstractC9115qv0.a;
                C11197zR0 W1 = C5075aO1.W1(0, i2);
                int j = W1.j();
                int k = W1.k();
                if (j <= k) {
                    while (fArr[j] == fArr2[j]) {
                        if (j != k) {
                            j++;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int f(HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(ha0, "predicate");
        float[] fArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (ha0.invoke(Float.valueOf(fArr[i3])).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    public final float g(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index ");
        sb.append(i);
        sb.append(" must be in 0..");
        sb.append(this.b - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final float h(int i, HA0<? super Integer, Float> ha0) {
        C6562gT0.p(ha0, "defaultValue");
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        return ha0.invoke(Integer.valueOf(i)).floatValue();
    }

    public int hashCode() {
        float[] fArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Float.hashCode(fArr[i3]) * 31;
        }
        return i2;
    }

    public final float i() {
        if (!B()) {
            return this.a[0];
        }
        throw new NoSuchElementException("FloatList is empty.");
    }

    public final float j(HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(ha0, "predicate");
        float[] fArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            if (ha0.invoke(Float.valueOf(f)).booleanValue()) {
                return f;
            }
        }
        throw new NoSuchElementException("FloatList contains no element matching the predicate.");
    }

    public final <R> R k(R r, VA0<? super R, ? super Float, ? extends R> va0) {
        C6562gT0.p(va0, "operation");
        float[] fArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            r = va0.i(r, Float.valueOf(fArr[i2]));
        }
        return r;
    }

    public final <R> R l(R r, XA0<? super Integer, ? super R, ? super Float, ? extends R> xa0) {
        C6562gT0.p(xa0, "operation");
        float[] fArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            R r2 = r;
            r = xa0.P(Integer.valueOf(i2), r2, Float.valueOf(fArr[i2]));
        }
        return r;
    }

    public final <R> R m(R r, VA0<? super Float, ? super R, ? extends R> va0) {
        C6562gT0.p(va0, "operation");
        float[] fArr = this.a;
        int i = this.b;
        while (true) {
            i--;
            if (-1 >= i) {
                return r;
            }
            r = va0.i(Float.valueOf(fArr[i]), r);
        }
    }

    public final <R> R n(R r, XA0<? super Integer, ? super Float, ? super R, ? extends R> xa0) {
        C6562gT0.p(xa0, "operation");
        float[] fArr = this.a;
        int i = this.b;
        while (true) {
            i--;
            if (-1 >= i) {
                return r;
            }
            r = xa0.P(Integer.valueOf(i), Float.valueOf(fArr[i]), r);
        }
    }

    public final void o(HA0<? super Float, C7458kA2> ha0) {
        C6562gT0.p(ha0, "block");
        float[] fArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            ha0.invoke(Float.valueOf(fArr[i2]));
        }
    }

    public final void p(VA0<? super Integer, ? super Float, C7458kA2> va0) {
        C6562gT0.p(va0, "block");
        float[] fArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            va0.i(Integer.valueOf(i2), Float.valueOf(fArr[i2]));
        }
    }

    public final void q(HA0<? super Float, C7458kA2> ha0) {
        C6562gT0.p(ha0, "block");
        float[] fArr = this.a;
        int i = this.b;
        while (true) {
            i--;
            if (-1 < i) {
                ha0.invoke(Float.valueOf(fArr[i]));
            } else {
                return;
            }
        }
    }

    public final void r(VA0<? super Integer, ? super Float, C7458kA2> va0) {
        C6562gT0.p(va0, "block");
        float[] fArr = this.a;
        int i = this.b;
        while (true) {
            i--;
            if (-1 < i) {
                va0.i(Integer.valueOf(i), Float.valueOf(fArr[i]));
            } else {
                return;
            }
        }
    }

    public final float s(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index ");
        sb.append(i);
        sb.append(" must be in 0..");
        sb.append(this.b - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public String toString() {
        return P(this, null, C6566gU0.f, C6566gU0.g, 0, null, 25, null);
    }

    public final C11197zR0 u() {
        return C5075aO1.W1(0, this.b);
    }

    public final int v() {
        return this.b - 1;
    }

    public final int w() {
        return this.b;
    }

    public final int y(float f) {
        float[] fArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (f == fArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public final int z(HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(ha0, "predicate");
        float[] fArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (ha0.invoke(Float.valueOf(fArr[i2])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public AbstractC9115qv0(int i) {
        float[] fArr;
        if (i == 0) {
            fArr = C2795Dv0.g();
        } else {
            fArr = new float[i];
        }
        this.a = fArr;
    }

    public static /* synthetic */ void t() {
    }

    public static /* synthetic */ void x() {
    }
}
