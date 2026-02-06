package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import o.C8409o1;
import o.U0;

/* renamed from: o.cY0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5595cY0 extends C8409o1 implements InterfaceC9825tp, Serializable, Cloneable {
    public static final int r1 = 100;
    private static final long serialVersionUID = -612114643488955218L;
    public transient int p1;
    public boolean q1;

    public C5595cY0() {
        this(100, 0.75f, false);
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
    public void G(U0.c cVar, Object obj) {
        L((C8409o1.c) cVar);
        cVar.setValue(obj);
    }

    public boolean K() {
        return this.q1;
    }

    public void L(C8409o1.c cVar) {
        C8409o1.c cVar2 = cVar.a1;
        C8409o1.c cVar3 = this.o1;
        if (cVar2 != cVar3) {
            this.Z0++;
            C8409o1.c cVar4 = cVar.Z0;
            cVar4.a1 = cVar2;
            cVar.a1.Z0 = cVar4;
            cVar.a1 = cVar3;
            cVar.Z0 = cVar3.Z0;
            cVar3.Z0.a1 = cVar;
            cVar3.Z0 = cVar;
        } else if (cVar != cVar3) {
        } else {
            throw new IllegalStateException("Can't move header to MRU (please report this to commons-dev@jakarta.apache.org)");
        }
    }

    public boolean N(C8409o1.c cVar) {
        return true;
    }

    public void O(C8409o1.c cVar, int i, int i2, Object obj, Object obj2) {
        boolean z = true;
        try {
            int z2 = z(cVar.Y, this.Z.length);
            U0.c cVar2 = this.Z[z2];
            U0.c cVar3 = null;
            while (cVar2 != cVar && cVar2 != null) {
                cVar3 = cVar2;
                cVar2 = cVar2.X;
            }
            if (cVar2 != null) {
                this.Z0++;
                D(cVar, z2, cVar3);
                F(cVar, i, i2, obj, obj2);
                b(cVar, i);
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Entry.next=null, data[removeIndex]=");
            stringBuffer.append(this.Z[z2]);
            stringBuffer.append(" previous=");
            stringBuffer.append(cVar3);
            stringBuffer.append(" key=");
            stringBuffer.append(obj);
            stringBuffer.append(" value=");
            stringBuffer.append(obj2);
            stringBuffer.append(" size=");
            stringBuffer.append(this.Y);
            stringBuffer.append(" maxSize=");
            stringBuffer.append(this.p1);
            stringBuffer.append(" Please check that your keys are immutable, and that you have used synchronization properly.");
            stringBuffer.append(" If so, then please report this to commons-dev@jakarta.apache.org as a bug.");
            throw new IllegalStateException(stringBuffer.toString());
        } catch (NullPointerException unused) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("NPE, entry=");
            stringBuffer2.append(cVar);
            stringBuffer2.append(" entryIsHeader=");
            if (cVar != this.o1) {
                z = false;
            }
            stringBuffer2.append(z);
            stringBuffer2.append(" key=");
            stringBuffer2.append(obj);
            stringBuffer2.append(" value=");
            stringBuffer2.append(obj2);
            stringBuffer2.append(" size=");
            stringBuffer2.append(this.Y);
            stringBuffer2.append(" maxSize=");
            stringBuffer2.append(this.p1);
            stringBuffer2.append(" Please check that your keys are immutable, and that you have used synchronization properly.");
            stringBuffer2.append(" If so, then please report this to commons-dev@jakarta.apache.org as a bug.");
            throw new IllegalStateException(stringBuffer2.toString());
        }
    }

    @Override // o.U0
    public void c(int i, int i2, Object obj, Object obj2) {
        boolean N;
        if (s()) {
            C8409o1.c cVar = this.o1.a1;
            if (this.q1) {
                while (cVar != this.o1 && cVar != null) {
                    if (N(cVar)) {
                        N = true;
                        break;
                    }
                    cVar = cVar.a1;
                }
                N = false;
                if (cVar == null) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Entry.after=null, header.after");
                    stringBuffer.append(this.o1.a1);
                    stringBuffer.append(" header.before");
                    stringBuffer.append(this.o1.Z0);
                    stringBuffer.append(" key=");
                    stringBuffer.append(obj);
                    stringBuffer.append(" value=");
                    stringBuffer.append(obj2);
                    stringBuffer.append(" size=");
                    stringBuffer.append(this.Y);
                    stringBuffer.append(" maxSize=");
                    stringBuffer.append(this.p1);
                    stringBuffer.append(" Please check that your keys are immutable, and that you have used synchronization properly.");
                    stringBuffer.append(" If so, then please report this to commons-dev@jakarta.apache.org as a bug.");
                    throw new IllegalStateException(stringBuffer.toString());
                }
            } else {
                N = N(cVar);
            }
            if (N) {
                if (cVar != null) {
                    O(cVar, i, i2, obj, obj2);
                    return;
                }
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("reuse=null, header.after=");
                stringBuffer2.append(this.o1.a1);
                stringBuffer2.append(" header.before");
                stringBuffer2.append(this.o1.Z0);
                stringBuffer2.append(" key=");
                stringBuffer2.append(obj);
                stringBuffer2.append(" value=");
                stringBuffer2.append(obj2);
                stringBuffer2.append(" size=");
                stringBuffer2.append(this.Y);
                stringBuffer2.append(" maxSize=");
                stringBuffer2.append(this.p1);
                stringBuffer2.append(" Please check that your keys are immutable, and that you have used synchronization properly.");
                stringBuffer2.append(" If so, then please report this to commons-dev@jakarta.apache.org as a bug.");
                throw new IllegalStateException(stringBuffer2.toString());
            }
            super.c(i, i2, obj, obj2);
            return;
        }
        super.c(i, i2, obj, obj2);
    }

    @Override // o.U0, java.util.AbstractMap
    public Object clone() {
        return super.clone();
    }

    @Override // o.U0, java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        C8409o1.c cVar = (C8409o1.c) x(obj);
        if (cVar == null) {
            return null;
        }
        L(cVar);
        return cVar.getValue();
    }

    @Override // o.U0
    public void n(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.p1 = objectInputStream.readInt();
        super.n(objectInputStream);
    }

    @Override // o.U0
    public void o(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.p1);
        super.o(objectOutputStream);
    }

    @Override // o.InterfaceC9825tp
    public int q() {
        return this.p1;
    }

    @Override // o.InterfaceC9825tp
    public boolean s() {
        if (this.Y >= this.p1) {
            return true;
        }
        return false;
    }

    public C5595cY0(int i) {
        this(i, 0.75f);
    }

    public C5595cY0(int i, boolean z) {
        this(i, 0.75f, z);
    }

    public C5595cY0(int i, float f) {
        this(i, f, false);
    }

    public C5595cY0(int i, float f, boolean z) {
        super(i < 1 ? 16 : i, f);
        if (i >= 1) {
            this.p1 = i;
            this.q1 = z;
            return;
        }
        throw new IllegalArgumentException("LRUMap max size must be greater than 0");
    }

    public C5595cY0(Map map) {
        this(map, false);
    }

    public C5595cY0(Map map, boolean z) {
        this(map.size(), 0.75f, z);
        putAll(map);
    }
}
