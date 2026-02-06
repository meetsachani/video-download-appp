package o;

/* renamed from: o.j7  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7200j7 {
    public final String a;

    public C7200j7(String str) {
        C6562gT0.p(str, "signals");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7200j7)) {
            return false;
        }
        return C6562gT0.g(this.a, ((C7200j7) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "AdSelectionSignals: " + this.a;
    }
}
