package o;

import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public final class Hu2 {
    public final Uri a;
    public final List<String> b;

    public Hu2(Uri uri, List<String> list) {
        C6562gT0.p(uri, "trustedBiddingUri");
        C6562gT0.p(list, "trustedBiddingKeys");
        this.a = uri;
        this.b = list;
    }

    public final List<String> a() {
        return this.b;
    }

    public final Uri b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Hu2)) {
            return false;
        }
        Hu2 hu2 = (Hu2) obj;
        if (C6562gT0.g(this.a, hu2.a) && C6562gT0.g(this.b, hu2.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "TrustedBiddingData: trustedBiddingUri=" + this.a + " trustedBiddingKeys=" + this.b;
    }
}
