package o;

import o.PW0;
import o.VW0;

/* renamed from: o.In1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3266In1 extends AbstractC3657Mn1 implements PW0 {
    public AbstractC3266In1() {
    }

    @Override // o.HA0
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // o.VW0
    @InterfaceC6480g82(version = "1.1")
    public Object k(Object obj) {
        return ((PW0) p0()).k(obj);
    }

    @Override // o.AbstractC2787Dt
    public InterfaceC11215zW0 m0() {
        return C6551gQ1.k(this);
    }

    @InterfaceC6480g82(version = "1.1")
    public AbstractC3266In1(Object obj) {
        super(obj);
    }

    @Override // o.TW0
    public VW0.a a() {
        return ((PW0) p0()).a();
    }

    @Override // o.NW0
    public PW0.a b() {
        return ((PW0) p0()).b();
    }

    @InterfaceC6480g82(version = "1.4")
    public AbstractC3266In1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
