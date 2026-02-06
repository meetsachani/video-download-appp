package o;

import java.util.Objects;

@InterfaceC10420wF0(emulated = true, serializable = true)
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public class PQ1<E> extends AbstractC5317bO0<E> {
    public static final AbstractC5317bO0<Object> Z0 = new PQ1(new Object[0], 0);
    public final transient int Y0;
    @InterfaceC5299bJ2
    public final transient Object[] Z;

    public PQ1(Object[] objArr, int i) {
        this.Z = objArr;
        this.Y0 = i;
    }

    @Override // o.AbstractC5317bO0, o.TN0
    public int e(Object[] objArr, int i) {
        System.arraycopy(this.Z, 0, objArr, i, this.Y0);
        return i + this.Y0;
    }

    @Override // o.TN0
    public Object[] f() {
        return this.Z;
    }

    @Override // java.util.List
    public E get(int i) {
        C10664xF1.C(i, this.Y0);
        E e = (E) this.Z[i];
        Objects.requireNonNull(e);
        return e;
    }

    @Override // o.TN0
    public int h() {
        return this.Y0;
    }

    @Override // o.TN0
    public int i() {
        return 0;
    }

    @Override // o.TN0
    public boolean j() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.Y0;
    }
}
