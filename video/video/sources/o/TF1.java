package o;

import java.util.Set;

/* loaded from: classes4.dex */
public class TF1 extends WF1 implements InterfaceC3056Gk {
    private static final long serialVersionUID = -2575833140344736876L;

    public TF1(InterfaceC3056Gk interfaceC3056Gk, JF1 jf1) {
        super(interfaceC3056Gk, jf1);
    }

    public static InterfaceC3056Gk h(InterfaceC3056Gk interfaceC3056Gk, JF1 jf1) {
        return new TF1(interfaceC3056Gk, jf1);
    }

    @Override // o.InterfaceC3056Gk
    public int I(Object obj) {
        return i().I(obj);
    }

    public InterfaceC3056Gk i() {
        return (InterfaceC3056Gk) d();
    }

    @Override // o.InterfaceC3056Gk
    public boolean v(Object obj, int i) {
        return i().v(obj, i);
    }

    @Override // o.InterfaceC3056Gk
    public boolean x(Object obj, int i) {
        f(obj);
        return i().x(obj, i);
    }

    @Override // o.InterfaceC3056Gk
    public Set y() {
        return i().y();
    }
}
