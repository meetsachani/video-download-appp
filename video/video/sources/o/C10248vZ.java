package o;

import java.util.Map;

/* renamed from: o.vZ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10248vZ extends AbstractC7662l1 {
    public C10248vZ() {
        super(null, null);
    }

    public Object a(Object obj) {
        if (obj != this) {
            Object obj2 = this.X;
            this.X = obj;
            return obj2;
        }
        throw new IllegalArgumentException("DefaultKeyValue may not contain itself as a key.");
    }

    public Map.Entry b() {
        return new DZ(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10248vZ)) {
            return false;
        }
        C10248vZ c10248vZ = (C10248vZ) obj;
        if (getKey() != null ? getKey().equals(c10248vZ.getKey()) : c10248vZ.getKey() == null) {
            if (getValue() != null ? getValue().equals(c10248vZ.getValue()) : c10248vZ.getValue() == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i = 0;
        if (getKey() == null) {
            hashCode = 0;
        } else {
            hashCode = getKey().hashCode();
        }
        if (getValue() != null) {
            i = getValue().hashCode();
        }
        return hashCode ^ i;
    }

    public Object setValue(Object obj) {
        if (obj != this) {
            Object obj2 = this.Y;
            this.Y = obj;
            return obj2;
        }
        throw new IllegalArgumentException("DefaultKeyValue may not contain itself as a value.");
    }

    public C10248vZ(Object obj, Object obj2) {
        super(obj, obj2);
    }

    public C10248vZ(KX0 kx0) {
        super(kx0.getKey(), kx0.getValue());
    }

    public C10248vZ(Map.Entry entry) {
        super(entry.getKey(), entry.getValue());
    }
}
