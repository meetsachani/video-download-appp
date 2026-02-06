package o;

/* renamed from: o.bD0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5273bD0 {
    public final String a;
    public final boolean b;

    /* renamed from: o.bD0$a */
    /* loaded from: classes.dex */
    public static final class a {
        public String a = "";
        public boolean b = true;

        public final C5273bD0 a() {
            if (this.a.length() > 0) {
                return new C5273bD0(this.a, this.b);
            }
            throw new IllegalStateException("adsSdkName must be set");
        }

        public final a b(String str) {
            C6562gT0.p(str, "adsSdkName");
            this.a = str;
            return this;
        }

        public final a c(boolean z) {
            this.b = z;
            return this;
        }
    }

    public C5273bD0() {
        this(null, false, 3, null);
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5273bD0)) {
            return false;
        }
        C5273bD0 c5273bD0 = (C5273bD0) obj;
        if (C6562gT0.g(this.a, c5273bD0.a) && this.b == c5273bD0.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Boolean.hashCode(this.b);
    }

    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.a + ", shouldRecordObservation=" + this.b;
    }

    public C5273bD0(String str, boolean z) {
        C6562gT0.p(str, "adsSdkName");
        this.a = str;
        this.b = z;
    }

    public /* synthetic */ C5273bD0(String str, boolean z, int i, C9516sY c9516sY) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
    }
}
