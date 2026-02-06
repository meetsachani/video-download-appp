package o;

/* loaded from: classes3.dex */
public final class F50 implements InterfaceC3583Lt1, InterfaceC6733hB0 {
    public final HA0 a;

    public F50(HA0 ha0) {
        C6562gT0.p(ha0, "function");
        this.a = ha0;
    }

    @Override // o.InterfaceC6733hB0
    public InterfaceC5022aB0<?> a() {
        return this.a;
    }

    @Override // o.InterfaceC3583Lt1
    public void b(Object obj) {
        this.a.invoke(obj);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof InterfaceC3583Lt1) && (obj instanceof InterfaceC6733hB0)) {
            return C6562gT0.g(a(), ((InterfaceC6733hB0) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return a().hashCode();
    }
}
