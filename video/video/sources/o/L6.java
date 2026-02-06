package o;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class L6 {
    public final C7686l7 a;
    public final Uri b;
    public final List<C7686l7> c;
    public final C7200j7 d;
    public final C7200j7 e;
    public final Map<C7686l7, C7200j7> f;
    public final Uri g;

    public L6(C7686l7 c7686l7, Uri uri, List<C7686l7> list, C7200j7 c7200j7, C7200j7 c7200j72, Map<C7686l7, C7200j7> map, Uri uri2) {
        C6562gT0.p(c7686l7, "seller");
        C6562gT0.p(uri, "decisionLogicUri");
        C6562gT0.p(list, "customAudienceBuyers");
        C6562gT0.p(c7200j7, "adSelectionSignals");
        C6562gT0.p(c7200j72, "sellerSignals");
        C6562gT0.p(map, "perBuyerSignals");
        C6562gT0.p(uri2, "trustedScoringSignalsUri");
        this.a = c7686l7;
        this.b = uri;
        this.c = list;
        this.d = c7200j7;
        this.e = c7200j72;
        this.f = map;
        this.g = uri2;
    }

    public final C7200j7 a() {
        return this.d;
    }

    public final List<C7686l7> b() {
        return this.c;
    }

    public final Uri c() {
        return this.b;
    }

    public final Map<C7686l7, C7200j7> d() {
        return this.f;
    }

    public final C7686l7 e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L6)) {
            return false;
        }
        L6 l6 = (L6) obj;
        if (C6562gT0.g(this.a, l6.a) && C6562gT0.g(this.b, l6.b) && C6562gT0.g(this.c, l6.c) && C6562gT0.g(this.d, l6.d) && C6562gT0.g(this.e, l6.e) && C6562gT0.g(this.f, l6.f) && C6562gT0.g(this.g, l6.g)) {
            return true;
        }
        return false;
    }

    public final C7200j7 f() {
        return this.e;
    }

    public final Uri g() {
        return this.g;
    }

    public int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public String toString() {
        return "AdSelectionConfig: seller=" + this.a + ", decisionLogicUri='" + this.b + "', customAudienceBuyers=" + this.c + ", adSelectionSignals=" + this.d + ", sellerSignals=" + this.e + ", perBuyerSignals=" + this.f + ", trustedScoringSignalsUri=" + this.g;
    }
}
