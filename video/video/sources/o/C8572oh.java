package o;

import android.util.Range;
import o.InterfaceC2426Ac0;

/* renamed from: o.oh  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8572oh implements InterfaceC8575oh2<AbstractC8328nh> {
    public static final String c = "AudioSrcAdPrflRslvr";
    public final AbstractC3044Gh a;
    public final InterfaceC2426Ac0.a b;

    public C8572oh(AbstractC3044Gh abstractC3044Gh, InterfaceC2426Ac0.a aVar) {
        this.a = abstractC3044Gh;
        this.b = aVar;
    }

    @Override // o.InterfaceC8575oh2
    /* renamed from: a */
    public AbstractC8328nh get() {
        int e = C2637Cg.e(this.a);
        int f = C2637Cg.f(this.a);
        int c2 = this.a.c();
        Range<Integer> d = this.a.d();
        int c3 = this.b.c();
        if (c2 == -1) {
            C7433k41.a(c, "Resolved AUDIO channel count from AudioProfile: " + c3);
            c2 = c3;
        } else {
            C7433k41.a(c, "Media spec AUDIO channel count overrides AudioProfile [AudioProfile channel count: " + c3 + ", Resolved Channel Count: " + c2 + C6566gU0.g);
        }
        int g = this.b.g();
        int h = C2637Cg.h(d, c2, f, g);
        C7433k41.a(c, "Using resolved AUDIO sample rate or nearest supported from AudioProfile: " + h + "Hz. [AudioProfile sample rate: " + g + "Hz]");
        return AbstractC8328nh.a().d(e).c(f).e(c2).f(h).b();
    }
}
