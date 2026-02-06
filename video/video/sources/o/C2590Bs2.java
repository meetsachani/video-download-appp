package o;

import java.util.Comparator;

/* renamed from: o.Bs2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2590Bs2 extends C7385js2 implements V92 {
    private static final long serialVersionUID = -251737742649401930L;

    public C2590Bs2(V92 v92, InterfaceC3189Hs2 interfaceC3189Hs2) {
        super(v92, interfaceC3189Hs2);
    }

    public static V92 k(V92 v92, InterfaceC3189Hs2 interfaceC3189Hs2) {
        return new C2590Bs2(v92, interfaceC3189Hs2);
    }

    @Override // o.V92
    public Comparator comparator() {
        return l().comparator();
    }

    @Override // o.V92
    public Object first() {
        return l().first();
    }

    public V92 l() {
        return (V92) this.X;
    }

    @Override // o.V92
    public Object last() {
        return l().last();
    }
}
