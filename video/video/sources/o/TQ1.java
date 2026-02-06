package o;

import java.util.Comparator;
import o.InterfaceC2467Am1;

@InterfaceC11149zF0
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public final class TQ1<E> extends AbstractC10456wO0<E> {
    public static final long[] d1 = {0};
    public static final AbstractC10456wO0<Comparable> e1 = new TQ1(AbstractC10587ww1.z());
    @InterfaceC5299bJ2
    public final transient UQ1<E> Z0;
    public final transient long[] a1;
    public final transient int b1;
    public final transient int c1;

    public TQ1(Comparator<? super E> comparator) {
        this.Z0 = AbstractC10942yO0.E0(comparator);
        this.a1 = d1;
        this.b1 = 0;
        this.c1 = 0;
    }

    @Override // o.AbstractC7269jO0
    public InterfaceC2467Am1.a<E> J(int i) {
        return C2565Bm1.k(this.Z0.d().get(i), L0(i));
    }

    @Override // o.AbstractC10456wO0, o.InterfaceC5603ca2
    /* renamed from: K0 */
    public AbstractC10456wO0<E> t3(E e, EnumC6886hp enumC6886hp) {
        boolean z;
        UQ1<E> uq1 = this.Z0;
        if (C10664xF1.E(enumC6886hp) == EnumC6886hp.CLOSED) {
            z = true;
        } else {
            z = false;
        }
        return N0(uq1.g1(e, z), this.c1);
    }

    public final int L0(int i) {
        long[] jArr = this.a1;
        int i2 = this.b1;
        return (int) (jArr[(i2 + i) + 1] - jArr[i2 + i]);
    }

    public AbstractC10456wO0<E> N0(int i, int i2) {
        C10664xF1.f0(i, i2, this.c1);
        if (i == i2) {
            return AbstractC10456wO0.v0(comparator());
        }
        if (i == 0 && i2 == this.c1) {
            return this;
        }
        return new TQ1(this.Z0.e1(i, i2), this.a1, this.b1 + i, i2 - i);
    }

    @Override // o.InterfaceC5603ca2
    @MB
    public InterfaceC2467Am1.a<E> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return J(0);
    }

    @Override // o.TN0
    public boolean j() {
        if (this.b1 > 0 || this.c1 < this.a1.length - 1) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC5603ca2
    @MB
    public InterfaceC2467Am1.a<E> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return J(this.c1 - 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, o.InterfaceC2467Am1
    public int size() {
        long[] jArr = this.a1;
        int i = this.b1;
        return C7775lT0.x(jArr[this.c1 + i] - jArr[i]);
    }

    @Override // o.AbstractC10456wO0, o.AbstractC7269jO0, o.InterfaceC2467Am1
    /* renamed from: u0 */
    public AbstractC10942yO0<E> n() {
        return this.Z0;
    }

    @Override // o.AbstractC10456wO0, o.InterfaceC5603ca2
    /* renamed from: w0 */
    public AbstractC10456wO0<E> G2(E e, EnumC6886hp enumC6886hp) {
        boolean z;
        UQ1<E> uq1 = this.Z0;
        if (C10664xF1.E(enumC6886hp) == EnumC6886hp.CLOSED) {
            z = true;
        } else {
            z = false;
        }
        return N0(0, uq1.f1(e, z));
    }

    @Override // o.InterfaceC2467Am1
    public int w4(@MB Object obj) {
        int indexOf = this.Z0.indexOf(obj);
        if (indexOf >= 0) {
            return L0(indexOf);
        }
        return 0;
    }

    public TQ1(UQ1<E> uq1, long[] jArr, int i, int i2) {
        this.Z0 = uq1;
        this.a1 = jArr;
        this.b1 = i;
        this.c1 = i2;
    }
}
