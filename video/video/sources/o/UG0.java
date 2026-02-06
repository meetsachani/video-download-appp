package o;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class UG0<T> extends AbstractC5289bH0<T> {
    public final Map<String, String> k;

    public UG0() {
        this.k = new HashMap();
    }

    public Map<String, String> S() {
        return this.k;
    }

    public void T(Map<String, String> map) {
        this.k.clear();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.k.put(entry.getKey().toUpperCase(), entry.getValue());
        }
        if (z() != null) {
            G();
        }
    }

    @Override // o.AbstractC5470c2
    public String x(int i) {
        String d = this.b.d(i);
        if (d != null) {
            return this.k.get(d.toUpperCase());
        }
        return d;
    }

    public UG0(boolean z) {
        super(z);
        this.k = new HashMap();
    }
}
