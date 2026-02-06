package o;

import o.C8823pj;
import o.InterfaceC6615gi;

@InterfaceC6615gi
/* renamed from: o.x02  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10605x02 {

    @InterfaceC6615gi.a
    /* renamed from: o.x02$a */
    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract AbstractC10605x02 a();

        public abstract a b(C3123Hc0 c3123Hc0);

        public abstract a c(AbstractC2434Ae0<?> abstractC2434Ae0);

        public <T> a d(AbstractC2434Ae0<T> abstractC2434Ae0, C3123Hc0 c3123Hc0, InterfaceC3385Js2<T, byte[]> interfaceC3385Js2) {
            c(abstractC2434Ae0);
            b(c3123Hc0);
            e(interfaceC3385Js2);
            return this;
        }

        public abstract a e(InterfaceC3385Js2<?, byte[]> interfaceC3385Js2);

        public abstract a f(Nt2 nt2);

        public abstract a g(String str);
    }

    public static a a() {
        return new C8823pj.b();
    }

    public abstract C3123Hc0 b();

    public abstract AbstractC2434Ae0<?> c();

    public byte[] d() {
        return e().apply(c().b());
    }

    public abstract InterfaceC3385Js2<?, byte[]> e();

    public abstract Nt2 f();

    public abstract String g();
}
