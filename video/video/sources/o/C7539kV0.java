package o;

/* renamed from: o.kV0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7539kV0 {
    public final CS a;

    public C7539kV0(CS cs) {
        C6562gT0.p(cs, "customAudience");
        this.a = cs;
    }

    public final CS a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7539kV0)) {
            return false;
        }
        return C6562gT0.g(this.a, ((C7539kV0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "JoinCustomAudience: customAudience=" + this.a;
    }
}
