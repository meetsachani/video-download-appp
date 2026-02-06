package o;

/* renamed from: o.td  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9777td {
    public static final a c = new a(null);
    public static final int d = 1;
    public static final int e = 2;
    public final String a;
    public final int b;

    /* renamed from: o.td$a */
    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    public C9777td(String str, int i) {
        C6562gT0.p(str, "id");
        this.a = str;
        this.b = i;
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException("Scope undefined.");
        }
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9777td)) {
            return false;
        }
        C9777td c9777td = (C9777td) obj;
        if (C6562gT0.g(this.a, c9777td.a) && this.b == c9777td.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Integer.hashCode(this.b);
    }

    public String toString() {
        String str;
        if (this.b == 1) {
            str = "SCOPE_APP";
        } else {
            str = "SCOPE_DEVELOPER";
        }
        return "AppSetId: id=" + this.a + ", scope=" + str;
    }
}
