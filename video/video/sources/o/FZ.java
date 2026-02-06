package o;

import java.util.Map;

/* loaded from: classes4.dex */
public class FZ implements Map.Entry, KX0 {
    public Object X;
    public Object Y;

    public FZ() {
    }

    public void a(Object obj) {
        this.X = obj;
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
        if (getKey() != null ? getKey().equals(entry.getKey()) : entry.getKey() == null) {
            if (getValue() != null ? getValue().equals(entry.getValue()) : entry.getValue() == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry, o.KX0
    public Object getKey() {
        return this.X;
    }

    @Override // java.util.Map.Entry, o.KX0
    public Object getValue() {
        return this.Y;
    }

    @Override // java.util.Map.Entry
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

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        Object obj2 = this.Y;
        this.Y = obj;
        return obj2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("");
        stringBuffer.append(getKey());
        stringBuffer.append("=");
        stringBuffer.append(getValue());
        return stringBuffer.toString();
    }

    public FZ(Map.Entry entry) {
        this.X = entry.getKey();
        this.Y = entry.getValue();
    }

    public FZ(Object obj, Object obj2) {
        this.X = obj;
        this.Y = obj2;
    }
}
