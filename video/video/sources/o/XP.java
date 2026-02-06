package o;

/* loaded from: classes.dex */
public final class XP {
    public static final a c = new a(null);
    public static final XP d = new XP(0.0f, 0.0f, 3, null);
    public final float a;
    public final float b;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    public XP() {
        this(0.0f, 0.0f, 3, null);
    }

    public final float a() {
        return this.a;
    }

    public final float b() {
        return this.b;
    }

    public XP(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public /* synthetic */ XP(float f, float f2, int i, C9516sY c9516sY) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }
}
