package o;

@InterfaceC10420wF0(emulated = true, serializable = true)
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public final class SQ1<E> extends AbstractC9481sO0<E> {
    public static final Object[] f1;
    public static final SQ1<Object> g1;
    @InterfaceC5299bJ2
    public final transient Object[] a1;
    public final transient int b1;
    @InterfaceC5299bJ2
    public final transient Object[] c1;
    public final transient int d1;
    public final transient int e1;

    static {
        Object[] objArr = new Object[0];
        f1 = objArr;
        g1 = new SQ1<>(objArr, 0, objArr, 0, 0);
    }

    public SQ1(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.a1 = objArr;
        this.b1 = i;
        this.c1 = objArr2;
        this.d1 = i2;
        this.e1 = i3;
    }

    @Override // o.AbstractC9481sO0
    public AbstractC5317bO0<E> K() {
        return AbstractC5317bO0.p(this.a1, this.e1);
    }

    @Override // o.AbstractC9481sO0
    public boolean L() {
        return true;
    }

    @Override // o.TN0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@MB Object obj) {
        Object[] objArr = this.c1;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int d = EG0.d(obj);
        while (true) {
            int i = d & this.d1;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            d = i + 1;
        }
    }

    @Override // o.TN0
    public int e(Object[] objArr, int i) {
        System.arraycopy(this.a1, 0, objArr, i, this.e1);
        return i + this.e1;
    }

    @Override // o.TN0
    public Object[] f() {
        return this.a1;
    }

    @Override // o.TN0
    public int h() {
        return this.e1;
    }

    @Override // o.AbstractC9481sO0, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.b1;
    }

    @Override // o.TN0
    public int i() {
        return 0;
    }

    @Override // o.TN0
    public boolean j() {
        return false;
    }

    @Override // o.AbstractC9481sO0, o.TN0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: k */
    public AbstractC6237fB2<E> iterator() {
        return d().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.e1;
    }
}
