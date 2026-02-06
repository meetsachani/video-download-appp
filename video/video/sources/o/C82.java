package o;

import java.util.Map;
import o.BO0;
import o.InterfaceC3744Nk2;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public class C82<R, C, V> extends BO0<R, C, V> {
    public final C Y0;
    public final R Z;
    public final V Z0;

    public C82(R r, C c, V v) {
        this.Z = (R) C10664xF1.E(r);
        this.Y0 = (C) C10664xF1.E(c);
        this.Z0 = (V) C10664xF1.E(v);
    }

    @Override // o.BO0, o.InterfaceC3744Nk2
    /* renamed from: i */
    public AbstractC6044eO0<R, V> d3(C c) {
        C10664xF1.E(c);
        if (y0(c)) {
            return AbstractC6044eO0.v(this.Z, this.Z0);
        }
        return AbstractC6044eO0.u();
    }

    @Override // o.BO0, o.InterfaceC3744Nk2
    /* renamed from: k */
    public AbstractC6044eO0<C, Map<R, V>> i2() {
        return AbstractC6044eO0.v(this.Y0, AbstractC6044eO0.v(this.Z, this.Z0));
    }

    @Override // o.BO0, o.AbstractC10614x3
    /* renamed from: n */
    public AbstractC9481sO0<InterfaceC3744Nk2.a<R, C, V>> b() {
        return AbstractC9481sO0.Q(BO0.g(this.Z, this.Y0, this.Z0));
    }

    @Override // o.BO0
    public BO0.b o() {
        return BO0.b.a(this, new int[]{0}, new int[]{0});
    }

    @Override // o.BO0, o.AbstractC10614x3
    /* renamed from: p */
    public TN0<V> c() {
        return AbstractC9481sO0.Q(this.Z0);
    }

    @Override // o.InterfaceC3744Nk2
    public int size() {
        return 1;
    }

    @Override // o.BO0, o.InterfaceC3744Nk2
    /* renamed from: u */
    public AbstractC6044eO0<R, Map<C, V>> H() {
        return AbstractC6044eO0.v(this.Z, AbstractC6044eO0.v(this.Y0, this.Z0));
    }

    public C82(InterfaceC3744Nk2.a<R, C, V> aVar) {
        this(aVar.a(), aVar.b(), aVar.getValue());
    }
}
