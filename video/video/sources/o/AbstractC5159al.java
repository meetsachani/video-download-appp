package o;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: o.al  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5159al<V, O> implements H9<V, O> {
    public final List<LX0<V>> a;

    public AbstractC5159al(V v) {
        this(Collections.singletonList(new LX0(v)));
    }

    @Override // o.H9
    public List<LX0<V>> b() {
        return this.a;
    }

    @Override // o.H9
    public boolean c() {
        if (this.a.isEmpty() || (this.a.size() == 1 && this.a.get(0).i())) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.a.toArray()));
        }
        return sb.toString();
    }

    public AbstractC5159al(List<LX0<V>> list) {
        this.a = list;
    }
}
