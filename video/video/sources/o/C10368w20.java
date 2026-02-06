package o;

import o.InterfaceC2467Am1;

@InterfaceC11149zF0
@InterfaceC6329fa0
/* renamed from: o.w20  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10368w20<E> extends AbstractC10456wO0<E> {
    public final transient AbstractC10456wO0<E> Z0;

    public C10368w20(AbstractC10456wO0<E> abstractC10456wO0) {
        this.Z0 = abstractC10456wO0;
    }

    @Override // o.AbstractC7269jO0
    public InterfaceC2467Am1.a<E> J(int i) {
        return this.Z0.entrySet().d().j0().get(i);
    }

    @Override // o.AbstractC10456wO0, o.InterfaceC5603ca2
    /* renamed from: K0 */
    public AbstractC10456wO0<E> t3(E e, EnumC6886hp enumC6886hp) {
        return this.Z0.G2(e, enumC6886hp).C3();
    }

    @Override // o.InterfaceC5603ca2
    @MB
    public InterfaceC2467Am1.a<E> firstEntry() {
        return this.Z0.lastEntry();
    }

    @Override // o.TN0
    public boolean j() {
        return this.Z0.j();
    }

    @Override // o.InterfaceC5603ca2
    @MB
    public InterfaceC2467Am1.a<E> lastEntry() {
        return this.Z0.firstEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, o.InterfaceC2467Am1
    public int size() {
        return this.Z0.size();
    }

    @Override // o.AbstractC10456wO0, o.InterfaceC5603ca2
    /* renamed from: t0 */
    public AbstractC10456wO0<E> C3() {
        return this.Z0;
    }

    @Override // o.AbstractC10456wO0, o.AbstractC7269jO0, o.InterfaceC2467Am1
    /* renamed from: u0 */
    public AbstractC10942yO0<E> n() {
        return this.Z0.n().descendingSet();
    }

    @Override // o.AbstractC10456wO0, o.InterfaceC5603ca2
    /* renamed from: w0 */
    public AbstractC10456wO0<E> G2(E e, EnumC6886hp enumC6886hp) {
        return this.Z0.t3(e, enumC6886hp).C3();
    }

    @Override // o.InterfaceC2467Am1
    public int w4(@MB Object obj) {
        return this.Z0.w4(obj);
    }
}
