package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: o.ly2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7895ly2 extends AbstractCollection implements InterfaceC5664cq, Serializable {
    private static final long serialVersionUID = -3482960336579541419L;
    public transient Object[] X;
    public transient int Y;
    public transient int Z;

    public C7895ly2() {
        this(32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int f(int i) {
        int i2 = i - 1;
        if (i2 < 0) {
            return this.X.length - 1;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int h(int i) {
        int i2 = i + 1;
        if (i2 >= this.X.length) {
            return 0;
        }
        return i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        this.X = new Object[readInt + 1];
        for (int i = 0; i < readInt; i++) {
            this.X[i] = objectInputStream.readObject();
        }
        this.Y = 0;
        this.Z = readInt;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        if (obj != null) {
            int size = size() + 1;
            Object[] objArr = this.X;
            if (size >= objArr.length) {
                Object[] objArr2 = new Object[((objArr.length - 1) * 2) + 1];
                int i = this.Y;
                int i2 = 0;
                while (i != this.Z) {
                    Object[] objArr3 = this.X;
                    objArr2[i2] = objArr3[i];
                    objArr3[i] = null;
                    i2++;
                    i = h(i);
                }
                this.X = objArr2;
                this.Y = 0;
                this.Z = i2;
            }
            Object[] objArr4 = this.X;
            int i3 = this.Z;
            objArr4[i3] = obj;
            this.Z = h(i3);
            return true;
        }
        throw new NullPointerException("Attempted to add null object to buffer");
    }

    @Override // o.InterfaceC5664cq
    public Object get() {
        if (!isEmpty()) {
            return this.X[this.Y];
        }
        throw new C7860lq("The buffer is already empty");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C7409jy2(this);
    }

    @Override // o.InterfaceC5664cq
    public Object remove() {
        if (!isEmpty()) {
            Object[] objArr = this.X;
            int i = this.Y;
            Object obj = objArr[i];
            if (obj != null) {
                objArr[i] = null;
                this.Y = h(i);
            }
            return obj;
        }
        throw new C7860lq("The buffer is already empty");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        int i = this.Z;
        int i2 = this.Y;
        if (i < i2) {
            return (this.X.length - i2) + i;
        }
        return i - i2;
    }

    public C7895ly2(int i) {
        if (i > 0) {
            this.X = new Object[i + 1];
            this.Y = 0;
            this.Z = 0;
            return;
        }
        throw new IllegalArgumentException("The size must be greater than 0");
    }
}
