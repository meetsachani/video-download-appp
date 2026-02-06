package o;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public class NQ1<E> extends QN0<E> {
    public final AbstractC5317bO0<? extends E> Y0;
    public final TN0<E> Z;

    public NQ1(TN0<E> tn0, AbstractC5317bO0<? extends E> abstractC5317bO0) {
        this.Z = tn0;
        this.Y0 = abstractC5317bO0;
    }

    @Override // o.AbstractC5317bO0, java.util.List
    /* renamed from: K */
    public AbstractC7705lB2<E> listIterator(int i) {
        return (AbstractC7705lB2<? extends E>) this.Y0.listIterator(i);
    }

    @Override // o.AbstractC5317bO0, o.TN0
    @InterfaceC11149zF0
    public int e(Object[] objArr, int i) {
        return this.Y0.e(objArr, i);
    }

    @Override // o.TN0
    @MB
    public Object[] f() {
        return this.Y0.f();
    }

    @Override // java.util.List
    public E get(int i) {
        return this.Y0.get(i);
    }

    @Override // o.TN0
    public int h() {
        return this.Y0.h();
    }

    @Override // o.TN0
    public int i() {
        return this.Y0.i();
    }

    @Override // o.QN0
    public TN0<E> p0() {
        return this.Z;
    }

    public AbstractC5317bO0<? extends E> r0() {
        return this.Y0;
    }

    public NQ1(TN0<E> tn0, Object[] objArr) {
        this(tn0, AbstractC5317bO0.l(objArr));
    }

    public NQ1(TN0<E> tn0, Object[] objArr, int i) {
        this(tn0, AbstractC5317bO0.p(objArr, i));
    }
}
