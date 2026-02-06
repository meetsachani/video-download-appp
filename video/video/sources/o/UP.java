package o;

import o.HT1;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public final class UP {
    public C5182aq2 a;
    public C5182aq2 b;
    public C5182aq2 c;
    public C5182aq2 d;
    public C5182aq2 e;
    public C5182aq2 f;

    public UP(int i, boolean z) {
        JG0 b = JG0.b(i);
        double d = b.d();
        double c = b.c();
        if (z) {
            this.a = C5182aq2.b(d, c);
            this.b = C5182aq2.b(d, c / 3.0d);
            this.c = C5182aq2.b(60.0d + d, c / 2.0d);
            this.d = C5182aq2.b(d, Math.min(c / 12.0d, 4.0d));
            this.e = C5182aq2.b(d, Math.min(c / 6.0d, 8.0d));
        } else {
            this.a = C5182aq2.b(d, Math.max(48.0d, c));
            this.b = C5182aq2.b(d, 16.0d);
            this.c = C5182aq2.b(60.0d + d, 24.0d);
            this.d = C5182aq2.b(d, 4.0d);
            this.e = C5182aq2.b(d, 8.0d);
        }
        this.f = C5182aq2.b(25.0d, 84.0d);
    }

    public static UP a(int i) {
        return new UP(i, true);
    }

    public static UP b(int i) {
        return new UP(i, false);
    }
}
