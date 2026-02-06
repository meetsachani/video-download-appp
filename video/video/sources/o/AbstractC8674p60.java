package o;

/* renamed from: o.p60  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8674p60 {
    public static final AbstractC8674p60 a = new a();
    public static final AbstractC8674p60 b = new b();
    public static final AbstractC8674p60 c = new e();
    public static final AbstractC8674p60 d = new c();
    public static final AbstractC8674p60 e;
    public static final AbstractC8674p60 f;
    public static final AbstractC8674p60 g;
    public static final C4274Sv1<AbstractC8674p60> h;
    public static final boolean i;

    /* renamed from: o.p60$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC8674p60 {
        @Override // o.AbstractC8674p60
        public g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // o.AbstractC8674p60
        public float b(int i, int i2, int i3, int i4) {
            int min = Math.min(i2 / i4, i / i3);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(min);
        }
    }

    /* renamed from: o.p60$b */
    /* loaded from: classes.dex */
    public static class b extends AbstractC8674p60 {
        @Override // o.AbstractC8674p60
        public g a(int i, int i2, int i3, int i4) {
            return g.MEMORY;
        }

        @Override // o.AbstractC8674p60
        public float b(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            int i5 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i5 = 0;
            }
            return 1.0f / (max << i5);
        }
    }

    /* renamed from: o.p60$c */
    /* loaded from: classes.dex */
    public static class c extends AbstractC8674p60 {
        @Override // o.AbstractC8674p60
        public g a(int i, int i2, int i3, int i4) {
            if (b(i, i2, i3, i4) == 1.0f) {
                return g.QUALITY;
            }
            return AbstractC8674p60.c.a(i, i2, i3, i4);
        }

        @Override // o.AbstractC8674p60
        public float b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, AbstractC8674p60.c.b(i, i2, i3, i4));
        }
    }

    /* renamed from: o.p60$d */
    /* loaded from: classes.dex */
    public static class d extends AbstractC8674p60 {
        @Override // o.AbstractC8674p60
        public g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // o.AbstractC8674p60
        public float b(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }
    }

    /* renamed from: o.p60$e */
    /* loaded from: classes.dex */
    public static class e extends AbstractC8674p60 {
        @Override // o.AbstractC8674p60
        public g a(int i, int i2, int i3, int i4) {
            if (AbstractC8674p60.i) {
                return g.QUALITY;
            }
            return g.MEMORY;
        }

        @Override // o.AbstractC8674p60
        public float b(int i, int i2, int i3, int i4) {
            if (AbstractC8674p60.i) {
                return Math.min(i3 / i, i4 / i2);
            }
            int max = Math.max(i2 / i4, i / i3);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(max);
        }
    }

    /* renamed from: o.p60$f */
    /* loaded from: classes.dex */
    public static class f extends AbstractC8674p60 {
        @Override // o.AbstractC8674p60
        public g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // o.AbstractC8674p60
        public float b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* renamed from: o.p60$g */
    /* loaded from: classes.dex */
    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        e = dVar;
        f = new f();
        g = dVar;
        h = C4274Sv1.g("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        i = true;
    }

    public abstract g a(int i2, int i3, int i4, int i5);

    public abstract float b(int i2, int i3, int i4, int i5);
}
