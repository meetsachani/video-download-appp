package o;

import java.util.Map;
import o.AbstractC6822hY1;

/* renamed from: o.nj  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8336nj extends AbstractC6822hY1 {
    public final ND e;
    public final Map<EnumC10429wH1, AbstractC6822hY1.b> f;

    public C8336nj(ND nd, Map<EnumC10429wH1, AbstractC6822hY1.b> map) {
        if (nd != null) {
            this.e = nd;
            if (map != null) {
                this.f = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    @Override // o.AbstractC6822hY1
    public ND e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6822hY1) {
            AbstractC6822hY1 abstractC6822hY1 = (AbstractC6822hY1) obj;
            if (this.e.equals(abstractC6822hY1.e()) && this.f.equals(abstractC6822hY1.i())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.e.hashCode() ^ 1000003) * 1000003) ^ this.f.hashCode();
    }

    @Override // o.AbstractC6822hY1
    public Map<EnumC10429wH1, AbstractC6822hY1.b> i() {
        return this.f;
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.e + ", values=" + this.f + "}";
    }
}
