package o;

import o.VW0;

/* loaded from: classes3.dex */
public abstract class GJ1 extends KJ1 implements VW0 {
    public GJ1() {
    }

    @Override // o.HA0
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // o.VW0
    @InterfaceC6480g82(version = "1.1")
    public Object k(Object obj) {
        return ((VW0) p0()).k(obj);
    }

    @Override // o.AbstractC2787Dt
    public InterfaceC11215zW0 m0() {
        return C6551gQ1.u(this);
    }

    @InterfaceC6480g82(version = "1.1")
    public GJ1(Object obj) {
        super(obj);
    }

    @Override // o.TW0
    public VW0.a a() {
        return ((VW0) p0()).a();
    }

    @InterfaceC6480g82(version = "1.4")
    public GJ1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
