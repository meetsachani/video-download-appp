package o;

/* renamed from: o.w6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10383w6 {
    public final String a;
    public final boolean b;

    public C10383w6(String str, boolean z) {
        C6562gT0.p(str, "adId");
        this.a = str;
        this.b = z;
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
        if (!(obj instanceof C10383w6)) {
            return false;
        }
        C10383w6 c10383w6 = (C10383w6) obj;
        if (C6562gT0.g(this.a, c10383w6.a) && this.b == c10383w6.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Boolean.hashCode(this.b);
    }

    public String toString() {
        return "AdId: adId=" + this.a + ", isLimitAdTrackingEnabled=" + this.b;
    }

    public /* synthetic */ C10383w6(String str, boolean z, int i, C9516sY c9516sY) {
        this(str, (i & 2) != 0 ? false : z);
    }
}
