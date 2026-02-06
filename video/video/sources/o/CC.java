package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* loaded from: classes4.dex */
public class CC<E> extends AbstractCollection<E> implements Queue<E>, InterfaceC7613kp<E>, Serializable {
    private static final long serialVersionUID = -8423413834657610406L;
    public transient E[] X;
    public transient int Y;
    public transient boolean Y0;
    public transient int Z;
    public final int Z0;

    /* loaded from: classes4.dex */
    public class a implements Iterator<E> {
        public int X;
        public int Y = -1;
        public boolean Z;

        public a() {
            this.X = CC.this.Y;
            this.Z = CC.this.Y0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.Z && this.X == CC.this.Z) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public E next() {
            if (hasNext()) {
                this.Z = false;
                int i = this.X;
                this.Y = i;
                this.X = CC.this.w(i);
                return (E) CC.this.X[this.Y];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            int i = this.Y;
            if (i != -1) {
                if (i == CC.this.Y) {
                    CC.this.remove();
                    this.Y = -1;
                    return;
                }
                int i2 = this.Y + 1;
                if (CC.this.Y < this.Y && i2 < CC.this.Z) {
                    System.arraycopy(CC.this.X, i2, CC.this.X, this.Y, CC.this.Z - i2);
                } else {
                    while (i2 != CC.this.Z) {
                        if (i2 >= CC.this.Z0) {
                            CC.this.X[i2 - 1] = CC.this.X[0];
                            i2 = 0;
                        } else {
                            CC.this.X[CC.this.r(i2)] = CC.this.X[i2];
                            i2 = CC.this.w(i2);
                        }
                    }
                }
                this.Y = -1;
                CC cc = CC.this;
                cc.Z = cc.r(cc.Z);
                CC.this.X[CC.this.Z] = null;
                CC.this.Y0 = false;
                this.X = CC.this.r(this.X);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public CC() {
        this(32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        boolean z;
        objectInputStream.defaultReadObject();
        this.X = (E[]) new Object[this.Z0];
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            this.X[i] = objectInputStream.readObject();
        }
        this.Y = 0;
        if (readInt == this.Z0) {
            z = true;
        } else {
            z = false;
        }
        this.Y0 = z;
        if (z) {
            this.Z = 0;
        } else {
            this.Z = readInt;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    public boolean B() {
        if (size() == this.Z0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e) {
        if (e != null) {
            if (B()) {
                remove();
            }
            E[] eArr = this.X;
            int i = this.Z;
            int i2 = i + 1;
            this.Z = i2;
            eArr[i] = e;
            if (i2 >= this.Z0) {
                this.Z = 0;
            }
            if (this.Z == this.Y) {
                this.Y0 = true;
            }
            return true;
        }
        throw new NullPointerException("Attempted to add null object to queue");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.Y0 = false;
        this.Y = 0;
        this.Z = 0;
        Arrays.fill(this.X, (Object) null);
    }

    @Override // java.util.Queue
    public E element() {
        if (!isEmpty()) {
            return peek();
        }
        throw new NoSuchElementException("queue is empty");
    }

    public E get(int i) {
        int size = size();
        if (i >= 0 && i < size) {
            return this.X[(this.Y + i) % this.Z0];
        }
        throw new NoSuchElementException(String.format("The specified index (%1$d) is outside the available range [0, %2$d)", Integer.valueOf(i), Integer.valueOf(size)));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        return add(e);
    }

    @Override // java.util.Queue
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return this.X[this.Y];
    }

    @Override // java.util.Queue
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // o.InterfaceC7613kp
    public int q() {
        return this.Z0;
    }

    public final int r(int i) {
        int i2 = i - 1;
        if (i2 < 0) {
            return this.Z0 - 1;
        }
        return i2;
    }

    @Override // java.util.Queue
    public E remove() {
        if (!isEmpty()) {
            E[] eArr = this.X;
            int i = this.Y;
            E e = eArr[i];
            if (e != null) {
                int i2 = i + 1;
                this.Y = i2;
                eArr[i] = null;
                if (i2 >= this.Z0) {
                    this.Y = 0;
                }
                this.Y0 = false;
            }
            return e;
        }
        throw new NoSuchElementException("queue is empty");
    }

    @Override // o.InterfaceC7613kp
    public boolean s() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        int i = this.Z;
        int i2 = this.Y;
        if (i < i2) {
            return (this.Z0 - i2) + i;
        }
        if (i == i2) {
            if (this.Y0) {
                return this.Z0;
            }
            return 0;
        }
        return i - i2;
    }

    public final int w(int i) {
        int i2 = i + 1;
        if (i2 >= this.Z0) {
            return 0;
        }
        return i2;
    }

    public CC(int i) {
        this.Y = 0;
        this.Z = 0;
        this.Y0 = false;
        if (i > 0) {
            E[] eArr = (E[]) new Object[i];
            this.X = eArr;
            this.Z0 = eArr.length;
            return;
        }
        throw new IllegalArgumentException("The size must be greater than 0");
    }

    public CC(Collection<? extends E> collection) {
        this(collection.size());
        addAll(collection);
    }
}
