package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

@InterfaceC11149zF0
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public class TG<E> extends QG<E> {
    public static final int g1 = -2;
    @MB
    public transient int[] c1;
    @MB
    public transient int[] d1;
    public transient int e1;
    public transient int f1;

    public TG() {
    }

    public static <E> TG<E> k0() {
        return new TG<>();
    }

    public static <E> TG<E> l0(Collection<? extends E> collection) {
        TG<E> n0 = n0(collection.size());
        n0.addAll(collection);
        return n0;
    }

    @SafeVarargs
    public static <E> TG<E> m0(E... eArr) {
        TG<E> n0 = n0(eArr.length);
        Collections.addAll(n0, eArr);
        return n0;
    }

    public static <E> TG<E> n0(int i) {
        return new TG<>(i);
    }

    @Override // o.QG
    public int F() {
        return this.e1;
    }

    @Override // o.QG
    public int G(int i) {
        return s0()[i] - 1;
    }

    @Override // o.QG
    public void K(int i) {
        super.K(i);
        this.e1 = -2;
        this.f1 = -2;
    }

    @Override // o.QG
    public void L(int i, @InterfaceC7894ly1 E e, int i2, int i3) {
        super.L(i, e, i2, i3);
        u0(this.f1, i);
        u0(i, -2);
    }

    @Override // o.QG
    public void Q(int i, int i2) {
        int size = size() - 1;
        super.Q(i, i2);
        u0(p0(i), G(i));
        if (i < size) {
            u0(p0(size), i);
            u0(i, G(size));
        }
        r0()[size] = 0;
        s0()[size] = 0;
    }

    @Override // o.QG
    public void a0(int i) {
        super.a0(i);
        this.c1 = Arrays.copyOf(r0(), i);
        this.d1 = Arrays.copyOf(s0(), i);
    }

    @Override // o.QG, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (U()) {
            return;
        }
        this.e1 = -2;
        this.f1 = -2;
        int[] iArr = this.c1;
        if (iArr != null && this.d1 != null) {
            Arrays.fill(iArr, 0, size(), 0);
            Arrays.fill(this.d1, 0, size(), 0);
        }
        super.clear();
    }

    @Override // o.QG
    public int f(int i, int i2) {
        if (i >= size()) {
            return i2;
        }
        return i;
    }

    @Override // o.QG
    public int h() {
        int h = super.h();
        this.c1 = new int[h];
        this.d1 = new int[h];
        return h;
    }

    @Override // o.QG
    @InterfaceC6181ey
    public Set<E> i() {
        Set<E> i = super.i();
        this.c1 = null;
        this.d1 = null;
        return i;
    }

    public final int p0(int i) {
        return r0()[i] - 1;
    }

    public final int[] r0() {
        int[] iArr = this.c1;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final int[] s0() {
        int[] iArr = this.d1;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final void t0(int i, int i2) {
        r0()[i] = i2 + 1;
    }

    @Override // o.QG, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return C5436bt1.l(this);
    }

    public final void u0(int i, int i2) {
        if (i == -2) {
            this.e1 = i2;
        } else {
            v0(i, i2);
        }
        if (i2 == -2) {
            this.f1 = i;
        } else {
            t0(i2, i);
        }
    }

    public final void v0(int i, int i2) {
        s0()[i] = i2 + 1;
    }

    public TG(int i) {
        super(i);
    }

    @Override // o.QG, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) C5436bt1.m(this, tArr);
    }
}
