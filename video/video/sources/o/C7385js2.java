package o;

import java.util.Set;

/* renamed from: o.js2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7385js2 extends C8132ms2 implements InterfaceC3056Gk {
    private static final long serialVersionUID = 5421170911299074185L;

    public C7385js2(InterfaceC3056Gk interfaceC3056Gk, InterfaceC3189Hs2 interfaceC3189Hs2) {
        super(interfaceC3056Gk, interfaceC3189Hs2);
    }

    public static InterfaceC3056Gk i(InterfaceC3056Gk interfaceC3056Gk, InterfaceC3189Hs2 interfaceC3189Hs2) {
        return new C7385js2(interfaceC3056Gk, interfaceC3189Hs2);
    }

    @Override // o.InterfaceC3056Gk
    public int I(Object obj) {
        return j().I(obj);
    }

    public InterfaceC3056Gk j() {
        return (InterfaceC3056Gk) this.X;
    }

    @Override // o.InterfaceC3056Gk
    public boolean v(Object obj, int i) {
        return j().v(obj, i);
    }

    @Override // o.InterfaceC3056Gk
    public boolean x(Object obj, int i) {
        return j().x(f(obj), i);
    }

    @Override // o.InterfaceC3056Gk
    public Set y() {
        return C11301zs2.i(j().y(), this.Y);
    }
}
