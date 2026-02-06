package o;

/* renamed from: o.xi1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10774xi1 implements InterfaceC6776hM {
    public final String a;
    public final a b;
    public final boolean c;

    /* renamed from: o.xi1$a */
    /* loaded from: classes.dex */
    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a g(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return MERGE;
                            }
                            return EXCLUDE_INTERSECTIONS;
                        }
                        return INTERSECT;
                    }
                    return SUBTRACT;
                }
                return ADD;
            }
            return MERGE;
        }
    }

    public C10774xi1(String str, a aVar, boolean z) {
        this.a = str;
        this.b = aVar;
        this.c = z;
    }

    @Override // o.InterfaceC6776hM
    public DL a(C8431o61 c8431o61, C10624x51 c10624x51, AbstractC8588ol abstractC8588ol) {
        if (!c8431o61.w0(EnumC8675p61.MergePathsApi19)) {
            C7190j41.e("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new C11017yi1(this);
    }

    public a b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.b + '}';
    }
}
