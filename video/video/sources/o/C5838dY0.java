package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import o.AbstractC8653p1;
import o.V0;

/* renamed from: o.dY0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5838dY0<K, V> extends AbstractC8653p1<K, V> implements InterfaceC9582sp<K, V>, Serializable, Cloneable {
    public static final int r1 = 100;
    private static final long serialVersionUID = -612114643488955218L;
    public transient int p1;
    public boolean q1;

    public C5838dY0() {
        this(100, 0.75f, false);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        r(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        t(objectOutputStream);
    }

    @Override // o.V0
    public void I(V0.c<K, V> cVar, V v) {
        S((AbstractC8653p1.c) cVar);
        cVar.setValue(v);
    }

    @Override // o.V0
    /* renamed from: P */
    public C5838dY0<K, V> i() {
        return (C5838dY0) super.clone();
    }

    public V Q(Object obj, boolean z) {
        AbstractC8653p1.c<K, V> z2 = z(obj);
        if (z2 == null) {
            return null;
        }
        if (z) {
            S(z2);
        }
        return z2.getValue();
    }

    public boolean R() {
        return this.q1;
    }

    public void S(AbstractC8653p1.c<K, V> cVar) {
        AbstractC8653p1.c<K, V> cVar2 = cVar.a1;
        AbstractC8653p1.c<K, V> cVar3 = this.o1;
        if (cVar2 != cVar3) {
            this.Z0++;
            AbstractC8653p1.c<K, V> cVar4 = cVar.Z0;
            if (cVar4 != null) {
                cVar4.a1 = cVar2;
                cVar.a1.Z0 = cVar4;
                cVar.a1 = cVar3;
                cVar.Z0 = cVar3.Z0;
                cVar3.Z0.a1 = cVar;
                cVar3.Z0 = cVar;
                return;
            }
            throw new IllegalStateException("Entry.before is null. This should not occur if your keys are immutable, and you have used synchronization properly.");
        } else if (cVar != cVar3) {
        } else {
            throw new IllegalStateException("Can't move header to MRU This should not occur if your keys are immutable, and you have used synchronization properly.");
        }
    }

    public boolean T(AbstractC8653p1.c<K, V> cVar) {
        return true;
    }

    public void W(AbstractC8653p1.c<K, V> cVar, int i, int i2, K k, V v) {
        boolean z = true;
        try {
            int B = B(cVar.Y, this.Z.length);
            V0.c<K, V> cVar2 = this.Z[B];
            V0.c<K, V> cVar3 = null;
            while (cVar2 != cVar && cVar2 != null) {
                cVar3 = cVar2;
                cVar2 = cVar2.X;
            }
            if (cVar2 != null) {
                this.Z0++;
                F(cVar, B, cVar3);
                H(cVar, i, i2, k, v);
                c(cVar, i);
                return;
            }
            throw new IllegalStateException("Entry.next=null, data[removeIndex]=" + this.Z[B] + " previous=" + cVar3 + " key=" + k + " value=" + v + " size=" + this.Y + " maxSize=" + this.p1 + " This should not occur if your keys are immutable, and you have used synchronization properly.");
        } catch (NullPointerException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("NPE, entry=");
            sb.append(cVar);
            sb.append(" entryIsHeader=");
            if (cVar != this.o1) {
                z = false;
            }
            sb.append(z);
            sb.append(" key=");
            sb.append(k);
            sb.append(" value=");
            sb.append(v);
            sb.append(" size=");
            sb.append(this.Y);
            sb.append(" maxSize=");
            sb.append(this.p1);
            sb.append(" This should not occur if your keys are immutable, and you have used synchronization properly.");
            throw new IllegalStateException(sb.toString());
        }
    }

    @Override // o.V0
    public void d(int i, int i2, K k, V v) {
        boolean T;
        if (s()) {
            AbstractC8653p1.c<K, V> cVar = this.o1.a1;
            if (this.q1) {
                while (cVar != this.o1 && cVar != null) {
                    if (T(cVar)) {
                        T = true;
                        break;
                    }
                    cVar = cVar.a1;
                }
                T = false;
                if (cVar == null) {
                    throw new IllegalStateException("Entry.after=null, header.after=" + this.o1.a1 + " header.before=" + this.o1.Z0 + " key=" + k + " value=" + v + " size=" + this.Y + " maxSize=" + this.p1 + " This should not occur if your keys are immutable, and you have used synchronization properly.");
                }
            } else {
                T = T(cVar);
            }
            if (T) {
                if (cVar != null) {
                    W(cVar, i, i2, k, v);
                    return;
                }
                throw new IllegalStateException("reuse=null, header.after=" + this.o1.a1 + " header.before=" + this.o1.Z0 + " key=" + k + " value=" + v + " size=" + this.Y + " maxSize=" + this.p1 + " This should not occur if your keys are immutable, and you have used synchronization properly.");
            }
            super.d(i, i2, k, v);
            return;
        }
        super.d(i, i2, k, v);
    }

    @Override // o.V0, java.util.AbstractMap, java.util.Map, o.UC0
    public V get(Object obj) {
        return Q(obj, true);
    }

    @Override // o.InterfaceC9582sp
    public int q() {
        return this.p1;
    }

    @Override // o.V0
    public void r(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.p1 = objectInputStream.readInt();
        super.r(objectInputStream);
    }

    @Override // o.InterfaceC9582sp
    public boolean s() {
        if (this.Y >= this.p1) {
            return true;
        }
        return false;
    }

    @Override // o.V0
    public void t(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.p1);
        super.t(objectOutputStream);
    }

    public C5838dY0(int i) {
        this(i, 0.75f);
    }

    public C5838dY0(int i, int i2) {
        this(i, i2, 0.75f);
    }

    public C5838dY0(int i, boolean z) {
        this(i, 0.75f, z);
    }

    public C5838dY0(int i, float f) {
        this(i, f, false);
    }

    public C5838dY0(int i, int i2, float f) {
        this(i, i2, f, false);
    }

    public C5838dY0(int i, float f, boolean z) {
        this(i, i, f, z);
    }

    public C5838dY0(int i, int i2, float f, boolean z) {
        super(i2, f);
        if (i < 1) {
            throw new IllegalArgumentException("LRUMap max size must be greater than 0");
        }
        if (i2 <= i) {
            this.p1 = i;
            this.q1 = z;
            return;
        }
        throw new IllegalArgumentException("LRUMap initial size must not be greather than max size");
    }

    public C5838dY0(Map<? extends K, ? extends V> map) {
        this((Map) map, false);
    }

    public C5838dY0(Map<? extends K, ? extends V> map, boolean z) {
        this(map.size(), 0.75f, z);
        putAll(map);
    }
}
