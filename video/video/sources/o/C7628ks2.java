package o;

/* renamed from: o.ks2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7628ks2 extends C8132ms2 implements InterfaceC5664cq {
    private static final long serialVersionUID = -7901091318986132033L;

    public C7628ks2(InterfaceC5664cq interfaceC5664cq, InterfaceC3189Hs2 interfaceC3189Hs2) {
        super(interfaceC5664cq, interfaceC3189Hs2);
    }

    public static InterfaceC5664cq i(InterfaceC5664cq interfaceC5664cq, InterfaceC3189Hs2 interfaceC3189Hs2) {
        return new C7628ks2(interfaceC5664cq, interfaceC3189Hs2);
    }

    @Override // o.InterfaceC5664cq
    public Object get() {
        return j().get();
    }

    public InterfaceC5664cq j() {
        return (InterfaceC5664cq) this.X;
    }

    @Override // o.InterfaceC5664cq
    public Object remove() {
        return j().remove();
    }
}
