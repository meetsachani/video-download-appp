package o;

import java.io.Serializable;
import java.util.Map;

/* renamed from: o.Bo2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2574Bo2 implements Map.Entry, KX0, Serializable {
    private static final long serialVersionUID = -8453869361373831205L;
    public final Map X;
    public final Object Y;

    public C2574Bo2(Map map, Object obj) {
        this.X = map;
        this.Y = obj;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object value = getValue();
        Object obj2 = this.Y;
        if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
            Object value2 = entry.getValue();
            if (value != null ? value.equals(value2) : value2 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry, o.KX0
    public Object getKey() {
        return this.Y;
    }

    @Override // java.util.Map.Entry, o.KX0
    public Object getValue() {
        return this.X.get(this.Y);
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        int hashCode;
        Object value = getValue();
        int i = 0;
        if (getKey() == null) {
            hashCode = 0;
        } else {
            hashCode = getKey().hashCode();
        }
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        if (obj != this) {
            return this.X.put(this.Y, obj);
        }
        throw new IllegalArgumentException("Cannot set value to this map entry");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getKey());
        stringBuffer.append("=");
        stringBuffer.append(getValue());
        return stringBuffer.toString();
    }
}
