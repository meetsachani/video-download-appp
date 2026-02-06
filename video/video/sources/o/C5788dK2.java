package o;

import android.net.Uri;
import java.util.List;

/* renamed from: o.dK2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5788dK2 {
    public final List<C5545cK2> a;
    public final Uri b;

    public C5788dK2(List<C5545cK2> list, Uri uri) {
        C6562gT0.p(list, "webTriggerParams");
        C6562gT0.p(uri, "destination");
        this.a = list;
        this.b = uri;
    }

    public final Uri a() {
        return this.b;
    }

    public final List<C5545cK2> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5788dK2)) {
            return false;
        }
        C5788dK2 c5788dK2 = (C5788dK2) obj;
        if (C6562gT0.g(this.a, c5788dK2.a) && C6562gT0.g(this.b, c5788dK2.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "WebTriggerRegistrationRequest { WebTriggerParams=" + this.a + ", Destination=" + this.b;
    }
}
