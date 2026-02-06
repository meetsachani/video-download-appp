package o;

import java.util.Map;

/* loaded from: classes4.dex */
public abstract class O1 implements Map.Entry, KX0 {
    public final Map.Entry X;

    public O1(Map.Entry entry) {
        if (entry != null) {
            this.X = entry;
            return;
        }
        throw new IllegalArgumentException("Map Entry must not be null");
    }

    public Map.Entry a() {
        return this.X;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return this.X.equals(obj);
    }

    @Override // java.util.Map.Entry, o.KX0
    public Object getKey() {
        return this.X.getKey();
    }

    @Override // java.util.Map.Entry, o.KX0
    public Object getValue() {
        return this.X.getValue();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return this.X.hashCode();
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        return this.X.setValue(obj);
    }

    public String toString() {
        return this.X.toString();
    }
}
