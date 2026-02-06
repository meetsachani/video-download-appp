package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import o.AbstractC3724Nf2;

@InterfaceC7311ja0
/* renamed from: o.x41  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10620x41 extends AbstractC3724Nf2 implements Serializable, InterfaceC9645t41 {
    private static final long serialVersionUID = 7249069246863182397L;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.Z = 0;
        this.X = null;
        this.Y = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(sum());
    }

    @Override // o.InterfaceC9645t41
    public void a() {
        add(1L);
    }

    @Override // o.InterfaceC9645t41
    public void add(long j) {
        int length;
        AbstractC3724Nf2.b bVar;
        AbstractC3724Nf2.b[] bVarArr = this.X;
        if (bVarArr == null) {
            long j2 = this.Y;
            if (c(j2, j2 + j)) {
                return;
            }
        }
        int[] iArr = AbstractC3724Nf2.Y0.get();
        boolean z = true;
        if (iArr != null && bVarArr != null && (length = bVarArr.length) >= 1 && (bVar = bVarArr[(length - 1) & iArr[0]]) != null) {
            long j3 = bVar.h;
            z = bVar.a(j3, j3 + j);
            if (z) {
                return;
            }
        }
        h(j, iArr, z);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return sum();
    }

    @Override // o.AbstractC3724Nf2
    public final long e(long j, long j2) {
        return j + j2;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) sum();
    }

    public void i() {
        add(-1L);
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) sum();
    }

    public void j() {
        g(0L);
    }

    public long k() {
        long j = this.Y;
        AbstractC3724Nf2.b[] bVarArr = this.X;
        this.Y = 0L;
        if (bVarArr != null) {
            for (AbstractC3724Nf2.b bVar : bVarArr) {
                if (bVar != null) {
                    j += bVar.h;
                    bVar.h = 0L;
                }
            }
        }
        return j;
    }

    @Override // java.lang.Number
    public long longValue() {
        return sum();
    }

    @Override // o.InterfaceC9645t41
    public long sum() {
        long j = this.Y;
        AbstractC3724Nf2.b[] bVarArr = this.X;
        if (bVarArr != null) {
            for (AbstractC3724Nf2.b bVar : bVarArr) {
                if (bVar != null) {
                    j += bVar.h;
                }
            }
        }
        return j;
    }

    public String toString() {
        return Long.toString(sum());
    }
}
