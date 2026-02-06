package o;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* renamed from: o.cD0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5515cD0 {
    public final List<C10807xq2> a;

    public C5515cD0(List<C10807xq2> list) {
        C6562gT0.p(list, "topics");
        this.a = list;
    }

    public final List<C10807xq2> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5515cD0)) {
            return false;
        }
        C5515cD0 c5515cD0 = (C5515cD0) obj;
        if (this.a.size() != c5515cD0.a.size()) {
            return false;
        }
        return C6562gT0.g(new HashSet(this.a), new HashSet(c5515cD0.a));
    }

    public int hashCode() {
        return Objects.hash(this.a);
    }

    public String toString() {
        return "Topics=" + this.a;
    }
}
