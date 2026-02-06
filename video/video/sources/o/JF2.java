package o;

import android.util.Range;
import android.util.Size;
import java.util.Objects;

/* loaded from: classes.dex */
public class JF2 implements InterfaceC8575oh2<IF2> {
    public static final String g = "VidEncCfgDefaultRslvr";
    public static final int h = 14000000;
    public static final int j = 30;
    public static final int k = 30;
    public static final int l = 8;
    public final String a;
    public final EnumC5905dp2 b;
    public final QG2 c;
    public final Size d;
    public final N80 e;
    public final Range<Integer> f;
    public static final Size i = new Size(com.facebook.internal.q0.q1, 720);
    public static final Range<Integer> m = new Range<>(1, 60);

    public JF2(String str, EnumC5905dp2 enumC5905dp2, QG2 qg2, Size size, N80 n80, Range<Integer> range) {
        this.a = str;
        this.b = enumC5905dp2;
        this.c = qg2;
        this.d = size;
        this.e = n80;
        this.f = range;
    }

    @Override // o.InterfaceC8575oh2
    /* renamed from: a */
    public IF2 get() {
        int b = b();
        C7433k41.a(g, "Resolved VIDEO frame rate: " + b + "fps");
        Range<Integer> c = this.c.c();
        C7433k41.a(g, "Using fallback VIDEO bitrate");
        int a = this.e.a();
        int width = this.d.getWidth();
        Size size = i;
        int e = C10422wF2.e(h, a, 8, b, 30, width, size.getWidth(), this.d.getHeight(), size.getHeight(), c);
        int a2 = S80.a(this.a, this.e);
        return IF2.d().h(this.a).g(this.b).j(this.d).b(e).e(b).i(a2).d(C10422wF2.b(this.a, a2)).a();
    }

    public final int b() {
        int i2;
        Object obj;
        Range<Integer> range = this.f;
        Range<Integer> range2 = C3051Gi2.f476o;
        if (!Objects.equals(range, range2)) {
            i2 = m.clamp(this.f.getUpper()).intValue();
        } else {
            i2 = 30;
        }
        Integer valueOf = Integer.valueOf(i2);
        if (Objects.equals(this.f, range2)) {
            obj = this.f;
        } else {
            obj = "<UNSPECIFIED>";
        }
        C7433k41.a(g, String.format("Default resolved frame rate: %dfps. [Expected operating range: %s]", valueOf, obj));
        return i2;
    }
}
