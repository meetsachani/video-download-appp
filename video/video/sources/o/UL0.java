package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import o.U0;

/* loaded from: classes4.dex */
public class UL0 extends U0 implements Serializable, Cloneable {
    private static final long serialVersionUID = 2028493495224302329L;

    /* loaded from: classes4.dex */
    public static class a extends U0.c {
        public a(U0.c cVar, int i, Object obj, Object obj2) {
            super(cVar, i, obj, obj2);
        }

        @Override // o.U0.c, java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (getKey() == entry.getKey() && getValue() == entry.getValue()) {
                return true;
            }
            return false;
        }

        @Override // o.U0.c, java.util.Map.Entry
        public int hashCode() {
            return System.identityHashCode(getKey()) ^ System.identityHashCode(getValue());
        }
    }

    public UL0() {
        super(16, 0.75f, 12);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        n(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        o(objectOutputStream);
    }

    @Override // o.U0
    public boolean B(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return false;
    }

    @Override // o.U0
    public boolean C(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return false;
    }

    @Override // o.U0, java.util.AbstractMap
    public Object clone() {
        return super.clone();
    }

    @Override // o.U0
    public U0.c i(U0.c cVar, int i, Object obj, Object obj2) {
        return new a(cVar, i, obj, obj2);
    }

    @Override // o.U0
    public int y(Object obj) {
        return System.identityHashCode(obj);
    }

    public UL0(int i) {
        super(i);
    }

    public UL0(int i, float f) {
        super(i, f);
    }

    public UL0(Map map) {
        super(map);
    }
}
