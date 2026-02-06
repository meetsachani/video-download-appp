package o;

import android.util.Range;

/* renamed from: o.Fg  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2942Fg implements InterfaceC8575oh2<AbstractC2735Dg> {
    public static final String f = "AudioEncCfgDefaultRslvr";
    public static final int g = 156000;
    public static final int h = 2;
    public static final int i = 48000;
    public final String a;
    public final int b;
    public final AbstractC3044Gh c;
    public final AbstractC8328nh d;
    public final EnumC5905dp2 e;

    public C2942Fg(String str, int i2, EnumC5905dp2 enumC5905dp2, AbstractC3044Gh abstractC3044Gh, AbstractC8328nh abstractC8328nh) {
        this.a = str;
        this.b = i2;
        this.e = enumC5905dp2;
        this.c = abstractC3044Gh;
        this.d = abstractC8328nh;
    }

    @Override // o.InterfaceC8575oh2
    /* renamed from: a */
    public AbstractC2735Dg get() {
        Range<Integer> b = this.c.b();
        C7433k41.a(f, "Using fallback AUDIO bitrate");
        return AbstractC2735Dg.d().f(this.a).g(this.b).e(this.e).d(this.d.e()).h(this.d.f()).c(C2637Cg.g(g, this.d.e(), 2, this.d.f(), 48000, b)).b();
    }
}
