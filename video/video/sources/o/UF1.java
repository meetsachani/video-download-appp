package o;

/* loaded from: classes4.dex */
public class UF1 extends WF1 implements InterfaceC5664cq {
    private static final long serialVersionUID = 2307609000539943581L;

    public UF1(InterfaceC5664cq interfaceC5664cq, JF1 jf1) {
        super(interfaceC5664cq, jf1);
    }

    public static InterfaceC5664cq h(InterfaceC5664cq interfaceC5664cq, JF1 jf1) {
        return new UF1(interfaceC5664cq, jf1);
    }

    @Override // o.InterfaceC5664cq
    public Object get() {
        return i().get();
    }

    public InterfaceC5664cq i() {
        return (InterfaceC5664cq) d();
    }

    @Override // o.InterfaceC5664cq
    public Object remove() {
        return i().remove();
    }
}
