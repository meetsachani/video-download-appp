package o;

import android.util.Range;

/* renamed from: o.ph  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8815ph implements InterfaceC8575oh2<AbstractC8328nh> {
    public static final String b = "DefAudioResolver";
    public final AbstractC3044Gh a;

    public C8815ph(AbstractC3044Gh abstractC3044Gh) {
        this.a = abstractC3044Gh;
    }

    @Override // o.InterfaceC8575oh2
    /* renamed from: a */
    public AbstractC8328nh get() {
        int h;
        int e = C2637Cg.e(this.a);
        int f = C2637Cg.f(this.a);
        int c = this.a.c();
        if (c == -1) {
            C7433k41.a(b, "Using fallback AUDIO channel count: 1");
            c = 1;
        } else {
            C7433k41.a(b, "Using supplied AUDIO channel count: " + c);
        }
        Range<Integer> d = this.a.d();
        if (AbstractC3044Gh.j.equals(d)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Using fallback AUDIO sample rate: ");
            h = 44100;
            sb.append(44100);
            sb.append("Hz");
            C7433k41.a(b, sb.toString());
        } else {
            h = C2637Cg.h(d, c, f, d.getUpper().intValue());
            C7433k41.a(b, "Using AUDIO sample rate resolved from AudioSpec: " + h + "Hz");
        }
        return AbstractC8328nh.a().d(e).c(f).e(c).f(h).b();
    }
}
