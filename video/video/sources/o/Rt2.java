package o;

/* loaded from: classes2.dex */
public final class Rt2<T> implements InterfaceC3584Lt2<T> {
    public final Nt2 a;
    public final String b;
    public final C3123Hc0 c;
    public final InterfaceC3385Js2<T, byte[]> d;
    public final St2 e;

    public Rt2(Nt2 nt2, String str, C3123Hc0 c3123Hc0, InterfaceC3385Js2<T, byte[]> interfaceC3385Js2, St2 st2) {
        this.a = nt2;
        this.b = str;
        this.c = c3123Hc0;
        this.d = interfaceC3385Js2;
        this.e = st2;
    }

    public static /* synthetic */ void c(Exception exc) {
    }

    @Override // o.InterfaceC3584Lt2
    public void a(AbstractC2434Ae0<T> abstractC2434Ae0) {
        b(abstractC2434Ae0, new Xt2() { // from class: o.Qt2
            @Override // o.Xt2
            public final void a(Exception exc) {
                Rt2.c(exc);
            }
        });
    }

    @Override // o.InterfaceC3584Lt2
    public void b(AbstractC2434Ae0<T> abstractC2434Ae0, Xt2 xt2) {
        this.e.a(AbstractC10605x02.a().f(this.a).c(abstractC2434Ae0).g(this.b).e(this.d).b(this.c).a(), xt2);
    }

    public Nt2 d() {
        return this.a;
    }
}
