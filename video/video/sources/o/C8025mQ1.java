package o;

import java.util.List;

/* renamed from: o.mQ1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8025mQ1 {
    public static final String a = "kotlin.jvm.functions.";

    public AW0 a(Class cls) {
        return new C6983iD(cls);
    }

    public AW0 b(Class cls, String str) {
        return new C6983iD(cls);
    }

    public AW0 d(Class cls) {
        return new C6983iD(cls);
    }

    public AW0 e(Class cls, String str) {
        return new C6983iD(cls);
    }

    public EW0 f(Class cls, String str) {
        return new C3303Ix1(cls, str);
    }

    @InterfaceC6480g82(version = "1.6")
    public XW0 g(XW0 xw0) {
        Mv2 mv2 = (Mv2) xw0;
        return new Mv2(xw0.E(), xw0.Z(), mv2.B(), mv2.x() | 2);
    }

    @InterfaceC6480g82(version = "1.6")
    public XW0 k(XW0 xw0) {
        Mv2 mv2 = (Mv2) xw0;
        return new Mv2(xw0.E(), xw0.Z(), mv2.B(), mv2.x() | 4);
    }

    @InterfaceC6480g82(version = "1.6")
    public XW0 l(XW0 xw0, XW0 xw02) {
        return new Mv2(xw0.E(), xw0.Z(), xw02, ((Mv2) xw0).x());
    }

    @InterfaceC6480g82(version = "1.3")
    public String p(InterfaceC6976iB0 interfaceC6976iB0) {
        String obj = interfaceC6976iB0.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith(a)) {
            return obj.substring(21);
        }
        return obj;
    }

    @InterfaceC6480g82(version = "1.1")
    public String q(AbstractC8052mY0 abstractC8052mY0) {
        return p(abstractC8052mY0);
    }

    @InterfaceC6480g82(version = "1.4")
    public void r(ZW0 zw0, List<XW0> list) {
        ((Fv2) zw0).b(list);
    }

    @InterfaceC6480g82(version = "1.4")
    public XW0 s(DW0 dw0, List<C5107aX0> list, boolean z) {
        return new Mv2(dw0, list, z);
    }

    @InterfaceC6480g82(version = "1.4")
    public ZW0 t(Object obj, String str, EnumC5350bX0 enumC5350bX0, boolean z) {
        return new Fv2(obj, str, enumC5350bX0, z);
    }

    public FW0 c(C7703lB0 c7703lB0) {
        return c7703lB0;
    }

    public OW0 h(AbstractC3070Gn1 abstractC3070Gn1) {
        return abstractC3070Gn1;
    }

    public PW0 i(AbstractC3266In1 abstractC3266In1) {
        return abstractC3266In1;
    }

    public QW0 j(AbstractC3462Kn1 abstractC3462Kn1) {
        return abstractC3462Kn1;
    }

    public UW0 m(EJ1 ej1) {
        return ej1;
    }

    public VW0 n(GJ1 gj1) {
        return gj1;
    }

    public WW0 o(IJ1 ij1) {
        return ij1;
    }
}
