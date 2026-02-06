package o;

/* renamed from: o.lZ0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7794lZ0 {
    public final C7686l7 a;
    public final String b;

    public C7794lZ0(C7686l7 c7686l7, String str) {
        C6562gT0.p(c7686l7, "buyer");
        C6562gT0.p(str, "name");
        this.a = c7686l7;
        this.b = str;
    }

    public final C7686l7 a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7794lZ0)) {
            return false;
        }
        C7794lZ0 c7794lZ0 = (C7794lZ0) obj;
        if (C6562gT0.g(this.a, c7794lZ0.a) && C6562gT0.g(this.b, c7794lZ0.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "LeaveCustomAudience: buyer=" + this.a + ", name=" + this.b;
    }
}
