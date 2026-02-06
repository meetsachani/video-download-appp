package o;

import android.util.Range;
import android.util.Size;
import java.util.Objects;
import o.InterfaceC2426Ac0;

/* loaded from: classes.dex */
public class KF2 implements InterfaceC8575oh2<IF2> {
    public static final String h = "VidEncVdPrflRslvr";
    public final String a;
    public final EnumC5905dp2 b;
    public final QG2 c;
    public final Size d;
    public final InterfaceC2426Ac0.c e;
    public final N80 f;
    public final Range<Integer> g;

    public KF2(String str, EnumC5905dp2 enumC5905dp2, QG2 qg2, Size size, InterfaceC2426Ac0.c cVar, N80 n80, Range<Integer> range) {
        this.a = str;
        this.b = enumC5905dp2;
        this.c = qg2;
        this.d = size;
        this.e = cVar;
        this.f = n80;
        this.g = range;
    }

    private int b() {
        int i;
        Object obj;
        int f = this.e.f();
        Range<Integer> range = this.g;
        Range<Integer> range2 = C3051Gi2.f476o;
        if (!Objects.equals(range, range2)) {
            i = this.g.clamp(Integer.valueOf(f)).intValue();
        } else {
            i = f;
        }
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(f);
        if (Objects.equals(this.g, range2)) {
            obj = this.g;
        } else {
            obj = "<UNSPECIFIED>";
        }
        C7433k41.a(h, String.format("Resolved frame rate %dfps [Video profile frame rate: %dfps, Expected operating range: %s]", valueOf, valueOf2, obj));
        return i;
    }

    @Override // o.InterfaceC8575oh2
    /* renamed from: a */
    public IF2 get() {
        int b = b();
        C7433k41.a(h, "Resolved VIDEO frame rate: " + b + "fps");
        Range<Integer> c = this.c.c();
        C7433k41.a(h, "Using resolved VIDEO bitrate from EncoderProfiles");
        int e = C10422wF2.e(this.e.c(), this.f.a(), this.e.b(), b, this.e.f(), this.d.getWidth(), this.e.k(), this.d.getHeight(), this.e.h(), c);
        int j = this.e.j();
        return IF2.d().h(this.a).g(this.b).j(this.d).b(e).e(b).i(j).d(C10422wF2.b(this.a, j)).a();
    }
}
