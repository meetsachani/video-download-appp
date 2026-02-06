package o;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* renamed from: o.eY0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6080eY0 extends K02 implements Externalizable {
    private static final long serialVersionUID = 2197433140769957051L;
    public int c1;

    public C6080eY0() {
        this(100);
    }

    public int B() {
        return this.c1;
    }

    public void D() {
        Object k = k();
        Object obj = super.get(k);
        remove(k);
        C(k, obj);
    }

    public void E(int i) {
        this.c1 = i;
        while (size() > i) {
            D();
        }
    }

    @Override // o.K02, java.util.Map
    public Object get(Object obj) {
        if (!containsKey(obj)) {
            return null;
        }
        Object remove = remove(obj);
        super.put(obj, remove);
        return remove;
    }

    @Override // o.K02, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (size() >= this.c1 && !containsKey(obj)) {
            D();
        }
        return super.put(obj, obj2);
    }

    @Override // o.K02, java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        this.c1 = objectInput.readInt();
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            put(objectInput.readObject(), objectInput.readObject());
        }
    }

    @Override // o.K02, java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeInt(this.c1);
        objectOutput.writeInt(size());
        for (Object obj : keySet()) {
            objectOutput.writeObject(obj);
            objectOutput.writeObject(super.get(obj));
        }
    }

    public C6080eY0(int i) {
        super(i);
        this.c1 = i;
    }

    public void C(Object obj, Object obj2) {
    }
}
