package o;

/* renamed from: o.i50  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6952i50 {
    public static final a c = new a(null);
    public static final C6952i50 d;
    public final C4725Xm1 a;
    public final C4725Xm1 b;

    /* renamed from: o.i50$a */
    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    static {
        Float valueOf = Float.valueOf(0.0f);
        C4180Rx1 a2 = C6670gv2.a(valueOf, valueOf);
        Float valueOf2 = Float.valueOf(0.5f);
        d = new C6952i50(a2, C6670gv2.a(valueOf2, valueOf2));
    }

    public C6952i50(C4180Rx1<Float, Float>... c4180Rx1Arr) {
        C6562gT0.p(c4180Rx1Arr, "mappings");
        this.a = new C4725Xm1(c4180Rx1Arr.length);
        this.b = new C4725Xm1(c4180Rx1Arr.length);
        int length = c4180Rx1Arr.length;
        for (int i = 0; i < length; i++) {
            this.a.X(c4180Rx1Arr[i].e().floatValue());
            this.b.X(c4180Rx1Arr[i].f().floatValue());
        }
        C10339vv0.c(this.a);
        C10339vv0.c(this.b);
    }

    public final float a(float f) {
        return C10339vv0.a(this.a, this.b, f);
    }

    public final float b(float f) {
        return C10339vv0.a(this.b, this.a, f);
    }
}
