package o;

import java.util.Iterator;
import java.util.Map;

/* renamed from: o.Cd0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2626Cd0 implements V71, NS1 {
    public final Map X;
    public Iterator Y;
    public boolean Y0 = false;
    public Map.Entry Z;

    public C2626Cd0(Map map) {
        this.X = map;
        this.Y = map.entrySet().iterator();
    }

    @Override // o.V71
    public Object getKey() {
        Map.Entry entry = this.Z;
        if (entry != null) {
            return entry.getKey();
        }
        throw new IllegalStateException("Iterator getKey() can only be called after next() and before remove()");
    }

    @Override // o.V71
    public Object getValue() {
        Map.Entry entry = this.Z;
        if (entry != null) {
            return entry.getValue();
        }
        throw new IllegalStateException("Iterator getValue() can only be called after next() and before remove()");
    }

    @Override // o.V71, java.util.Iterator
    public boolean hasNext() {
        return this.Y.hasNext();
    }

    @Override // o.V71, java.util.Iterator
    public Object next() {
        Map.Entry entry = (Map.Entry) this.Y.next();
        this.Z = entry;
        this.Y0 = true;
        return entry.getKey();
    }

    @Override // o.V71, java.util.Iterator
    public void remove() {
        if (this.Y0) {
            this.Y.remove();
            this.Z = null;
            this.Y0 = false;
            return;
        }
        throw new IllegalStateException("Iterator remove() can only be called once after next()");
    }

    @Override // o.NS1
    public void reset() {
        this.Y = this.X.entrySet().iterator();
        this.Z = null;
        this.Y0 = false;
    }

    @Override // o.V71
    public Object setValue(Object obj) {
        Map.Entry entry = this.Z;
        if (entry != null) {
            return entry.setValue(obj);
        }
        throw new IllegalStateException("Iterator setValue() can only be called after next() and before remove()");
    }

    public String toString() {
        if (this.Z != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("MapIterator[");
            stringBuffer.append(getKey());
            stringBuffer.append("=");
            stringBuffer.append(getValue());
            stringBuffer.append(C6566gU0.g);
            return stringBuffer.toString();
        }
        return "MapIterator[]";
    }
}
