package o;

import java.util.Set;

/* loaded from: classes2.dex */
public final class Pt2 implements Ot2 {
    public final Set<C3123Hc0> a;
    public final Nt2 b;
    public final St2 c;

    public Pt2(Set<C3123Hc0> set, Nt2 nt2, St2 st2) {
        this.a = set;
        this.b = nt2;
        this.c = st2;
    }

    @Override // o.Ot2
    public <T> InterfaceC3584Lt2<T> a(String str, Class<T> cls, InterfaceC3385Js2<T, byte[]> interfaceC3385Js2) {
        return b(str, cls, C3123Hc0.b("proto"), interfaceC3385Js2);
    }

    @Override // o.Ot2
    public <T> InterfaceC3584Lt2<T> b(String str, Class<T> cls, C3123Hc0 c3123Hc0, InterfaceC3385Js2<T, byte[]> interfaceC3385Js2) {
        if (this.a.contains(c3123Hc0)) {
            return new Rt2(this.b, str, c3123Hc0, interfaceC3385Js2, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c3123Hc0, this.a));
    }
}
