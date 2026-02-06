package o;

import android.net.Uri;

/* renamed from: o.i7  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6959i7 {
    public final long a;
    public final Uri b;

    public C6959i7(long j, Uri uri) {
        C6562gT0.p(uri, "renderUri");
        this.a = j;
        this.b = uri;
    }

    public final long a() {
        return this.a;
    }

    public final Uri b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6959i7)) {
            return false;
        }
        C6959i7 c6959i7 = (C6959i7) obj;
        if (this.a == c6959i7.a && C6562gT0.g(this.b, c6959i7.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Long.hashCode(this.a) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "AdSelectionOutcome: adSelectionId=" + this.a + ", renderUri=" + this.b;
    }
}
