package o;

import o.InterfaceC2426Ac0;

/* renamed from: o.Eg  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2833Eg implements InterfaceC8575oh2<AbstractC2735Dg> {
    public static final String g = "AudioEncAdPrflRslvr";
    public final String a;
    public final EnumC5905dp2 b;
    public final int c;
    public final AbstractC3044Gh d;
    public final AbstractC8328nh e;
    public final InterfaceC2426Ac0.a f;

    public C2833Eg(String str, int i, EnumC5905dp2 enumC5905dp2, AbstractC3044Gh abstractC3044Gh, AbstractC8328nh abstractC8328nh, InterfaceC2426Ac0.a aVar) {
        this.a = str;
        this.c = i;
        this.b = enumC5905dp2;
        this.d = abstractC3044Gh;
        this.e = abstractC8328nh;
        this.f = aVar;
    }

    @Override // o.InterfaceC8575oh2
    /* renamed from: a */
    public AbstractC2735Dg get() {
        C7433k41.a(g, "Using resolved AUDIO bitrate from AudioProfile");
        return AbstractC2735Dg.d().f(this.a).g(this.c).e(this.b).d(this.e.e()).h(this.e.f()).c(C2637Cg.g(this.f.b(), this.e.e(), this.f.c(), this.e.f(), this.f.g(), this.d.b())).b();
    }
}
