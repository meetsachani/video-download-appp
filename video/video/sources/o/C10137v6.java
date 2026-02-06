package o;

import android.net.Uri;

/* renamed from: o.v6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10137v6 {
    public final Uri a;
    public final String b;

    public C10137v6(Uri uri, String str) {
        C6562gT0.p(uri, "renderUri");
        C6562gT0.p(str, "metadata");
        this.a = uri;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final Uri b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10137v6)) {
            return false;
        }
        C10137v6 c10137v6 = (C10137v6) obj;
        if (C6562gT0.g(this.a, c10137v6.a) && C6562gT0.g(this.b, c10137v6.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "AdData: renderUri=" + this.a + ", metadata='" + this.b + '\'';
    }
}
