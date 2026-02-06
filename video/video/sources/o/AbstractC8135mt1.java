package o;

import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: o.mt1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8135mt1<E> {
    public Object[] a;
    public int b;

    /* renamed from: o.mt1$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC8052mY0 implements HA0<E, CharSequence> {
        public final /* synthetic */ AbstractC8135mt1<E> X;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC8135mt1<E> abstractC8135mt1) {
            super(1);
            this.X = abstractC8135mt1;
        }

        @Override // o.HA0
        /* renamed from: c */
        public final CharSequence invoke(E e) {
            if (e == this.X) {
                return "(this)";
            }
            return String.valueOf(e);
        }
    }

    public /* synthetic */ AbstractC8135mt1(int i, C9516sY c9516sY) {
        this(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String Q(AbstractC8135mt1 abstractC8135mt1, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, HA0 ha0, int i2, Object obj) {
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
            HA0<? super E, ? extends CharSequence> ha02 = ha0;
            if ((i2 & 32) != 0) {
                ha02 = null;
            }
            CharSequence charSequence5 = charSequence4;
            HA0<? super E, ? extends CharSequence> ha03 = ha02;
            return abstractC8135mt1.P(charSequence, charSequence2, charSequence3, i, charSequence5, ha03);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final C11197zR0 A() {
        return C5075aO1.W1(0, this.b);
    }

    public final int B() {
        return this.b - 1;
    }

    public final int C() {
        return this.b;
    }

    public final int E(E e) {
        int i = 0;
        if (e == null) {
            Object[] objArr = this.a;
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        Object[] objArr2 = this.a;
        int i3 = this.b;
        while (i < i3) {
            if (e.equals(objArr2[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int F(HA0<? super E, Boolean> ha0) {
        C6562gT0.p(ha0, "predicate");
        Object[] objArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (ha0.invoke(objArr[i2]).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public final int G(HA0<? super E, Boolean> ha0) {
        C6562gT0.p(ha0, "predicate");
        Object[] objArr = this.a;
        int i = this.b;
        while (true) {
            i--;
            if (-1 >= i) {
                return -1;
            }
            if (ha0.invoke(objArr[i]).booleanValue()) {
                return i;
            }
        }
    }

    public final boolean H() {
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    public final boolean I() {
        if (this.b != 0) {
            return true;
        }
        return false;
    }

    public final String J() {
        return Q(this, null, null, null, 0, null, null, 63, null);
    }

    public final String K(CharSequence charSequence) {
        C6562gT0.p(charSequence, "separator");
        return Q(this, charSequence, null, null, 0, null, null, 62, null);
    }

    public final String L(CharSequence charSequence, CharSequence charSequence2) {
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        return Q(this, charSequence, charSequence2, null, 0, null, null, 60, null);
    }

    public final String M(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        return Q(this, charSequence, charSequence2, charSequence3, 0, null, null, 56, null);
    }

    public final String N(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i) {
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        return Q(this, charSequence, charSequence2, charSequence3, i, null, null, 48, null);
    }

    public final String O(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4) {
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        return Q(this, charSequence, charSequence2, charSequence3, i, charSequence4, null, 32, null);
    }

    public final String P(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, HA0<? super E, ? extends CharSequence> ha0) {
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        Object[] objArr = this.a;
        int i2 = this.b;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                Object obj = objArr[i3];
                if (i3 == i) {
                    sb.append(charSequence4);
                    break;
                }
                if (i3 != 0) {
                    sb.append(charSequence);
                }
                if (ha0 == null) {
                    sb.append(obj);
                } else {
                    sb.append(ha0.invoke(obj));
                }
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

    public final E R() {
        if (!H()) {
            return (E) this.a[this.b - 1];
        }
        throw new NoSuchElementException("ObjectList is empty.");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [E, java.lang.Object] */
    public final E S(HA0<? super E, Boolean> ha0) {
        C6562gT0.p(ha0, "predicate");
        Object[] objArr = this.a;
        int i = this.b;
        while (true) {
            i--;
            if (-1 < i) {
                ?? r2 = (Object) objArr[i];
                if (ha0.invoke(r2).booleanValue()) {
                    return r2;
                }
            } else {
                throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
            }
        }
    }

    public final int T(E e) {
        if (e == null) {
            Object[] objArr = this.a;
            for (int i = this.b - 1; -1 < i; i--) {
                if (objArr[i] == null) {
                    return i;
                }
            }
        } else {
            Object[] objArr2 = this.a;
            for (int i2 = this.b - 1; -1 < i2; i2--) {
                if (e.equals(objArr2[i2])) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public final E U() {
        if (H()) {
            return null;
        }
        return (E) this.a[this.b - 1];
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [E, java.lang.Object] */
    public final E V(HA0<? super E, Boolean> ha0) {
        C6562gT0.p(ha0, "predicate");
        Object[] objArr = this.a;
        int i = this.b;
        while (true) {
            i--;
            if (-1 < i) {
                ?? r2 = (Object) objArr[i];
                if (ha0.invoke(r2).booleanValue()) {
                    return r2;
                }
            } else {
                return null;
            }
        }
    }

    public final boolean W() {
        return H();
    }

    public final boolean X(HA0<? super E, Boolean> ha0) {
        C6562gT0.p(ha0, "predicate");
        Object[] objArr = this.a;
        for (int i = this.b - 1; -1 < i; i--) {
            if (ha0.invoke(objArr[i]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        return I();
    }

    public final boolean b(HA0<? super E, Boolean> ha0) {
        C6562gT0.p(ha0, "predicate");
        Object[] objArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (ha0.invoke(objArr[i2]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public abstract List<E> c();

    public final boolean d(E e) {
        if (E(e) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean e(Iterable<? extends E> iterable) {
        C6562gT0.p(iterable, "elements");
        for (E e : iterable) {
            if (!d(e)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC8135mt1) {
            AbstractC8135mt1 abstractC8135mt1 = (AbstractC8135mt1) obj;
            int i = abstractC8135mt1.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = abstractC8135mt1.a;
                C11197zR0 W1 = C5075aO1.W1(0, i2);
                int j = W1.j();
                int k = W1.k();
                if (j <= k) {
                    while (C6562gT0.g(objArr[j], objArr2[j])) {
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

    public final boolean f(List<? extends E> list) {
        C6562gT0.p(list, "elements");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!d(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g(AbstractC8135mt1<E> abstractC8135mt1) {
        C6562gT0.p(abstractC8135mt1, "elements");
        Object[] objArr = abstractC8135mt1.a;
        int i = abstractC8135mt1.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (!d(objArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final boolean h(E[] eArr) {
        C6562gT0.p(eArr, "elements");
        for (E e : eArr) {
            if (!d(e)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i;
        Object[] objArr = this.a;
        int i2 = this.b;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i3 += i * 31;
        }
        return i3;
    }

    public final int i() {
        return this.b;
    }

    public final int j(HA0<? super E, Boolean> ha0) {
        C6562gT0.p(ha0, "predicate");
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (ha0.invoke(objArr[i3]).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    public final E k(int i) {
        if (i >= 0 && i < this.b) {
            return (E) this.a[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index ");
        sb.append(i);
        sb.append(" must be in 0..");
        sb.append(this.b - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final E l(int i, HA0<? super Integer, ? extends E> ha0) {
        C6562gT0.p(ha0, "defaultValue");
        if (i >= 0 && i < this.b) {
            return (E) this.a[i];
        }
        return ha0.invoke(Integer.valueOf(i));
    }

    public final E m() {
        if (!H()) {
            return (E) this.a[0];
        }
        throw new NoSuchElementException("ObjectList is empty.");
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [E, java.lang.Object] */
    public final E n(HA0<? super E, Boolean> ha0) {
        C6562gT0.p(ha0, "predicate");
        Object[] objArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            ?? r3 = (Object) objArr[i2];
            if (ha0.invoke(r3).booleanValue()) {
                return r3;
            }
        }
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    public final E o() {
        if (H()) {
            return null;
        }
        return y(0);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [E, java.lang.Object] */
    public final E p(HA0<? super E, Boolean> ha0) {
        C6562gT0.p(ha0, "predicate");
        Object[] objArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            ?? r3 = (Object) objArr[i2];
            if (ha0.invoke(r3).booleanValue()) {
                return r3;
            }
        }
        return null;
    }

    public final <R> R q(R r, VA0<? super R, ? super E, ? extends R> va0) {
        C6562gT0.p(va0, "operation");
        Object[] objArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            r = va0.i(r, objArr[i2]);
        }
        return r;
    }

    public final <R> R r(R r, XA0<? super Integer, ? super R, ? super E, ? extends R> xa0) {
        C6562gT0.p(xa0, "operation");
        Object[] objArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            r = xa0.P(Integer.valueOf(i2), r, objArr[i2]);
        }
        return r;
    }

    public final <R> R s(R r, VA0<? super E, ? super R, ? extends R> va0) {
        C6562gT0.p(va0, "operation");
        Object[] objArr = this.a;
        int i = this.b;
        while (true) {
            i--;
            if (-1 >= i) {
                return r;
            }
            r = va0.i(objArr[i], r);
        }
    }

    public final <R> R t(R r, XA0<? super Integer, ? super E, ? super R, ? extends R> xa0) {
        C6562gT0.p(xa0, "operation");
        Object[] objArr = this.a;
        int i = this.b;
        while (true) {
            i--;
            if (-1 >= i) {
                return r;
            }
            r = xa0.P(Integer.valueOf(i), objArr[i], r);
        }
    }

    public String toString() {
        return Q(this, null, C6566gU0.f, C6566gU0.g, 0, null, new a(this), 25, null);
    }

    public final void u(HA0<? super E, C7458kA2> ha0) {
        C6562gT0.p(ha0, "block");
        Object[] objArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            ha0.invoke(objArr[i2]);
        }
    }

    public final void v(VA0<? super Integer, ? super E, C7458kA2> va0) {
        C6562gT0.p(va0, "block");
        Object[] objArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            va0.i(Integer.valueOf(i2), objArr[i2]);
        }
    }

    public final void w(HA0<? super E, C7458kA2> ha0) {
        C6562gT0.p(ha0, "block");
        Object[] objArr = this.a;
        int i = this.b;
        while (true) {
            i--;
            if (-1 < i) {
                ha0.invoke(objArr[i]);
            } else {
                return;
            }
        }
    }

    public final void x(VA0<? super Integer, ? super E, C7458kA2> va0) {
        C6562gT0.p(va0, "block");
        Object[] objArr = this.a;
        int i = this.b;
        while (true) {
            i--;
            if (-1 < i) {
                va0.i(Integer.valueOf(i), objArr[i]);
            } else {
                return;
            }
        }
    }

    public final E y(int i) {
        if (i >= 0 && i < this.b) {
            return (E) this.a[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index ");
        sb.append(i);
        sb.append(" must be in 0..");
        sb.append(this.b - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public AbstractC8135mt1(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = C8378nt1.a;
        } else {
            objArr = new Object[i];
        }
        this.a = objArr;
    }

    public static /* synthetic */ void D() {
    }

    public static /* synthetic */ void z() {
    }
}
