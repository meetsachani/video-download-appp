package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import o.AbstractC8166n1;

/* renamed from: o.Qq1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4059Qq1<E> extends AbstractC8166n1<E> implements Serializable {
    public static final int b1 = 20;
    private static final long serialVersionUID = 6897789178562232073L;
    public transient AbstractC8166n1.d<E> Y0;
    public transient int Z0;
    public int a1;

    public C4059Qq1() {
        this(20);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        r(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        w(objectOutputStream);
    }

    @Override // o.AbstractC8166n1
    public void G() {
        int min = Math.min(this.Y, this.a1 - this.Z0);
        AbstractC8166n1.d<E> dVar = this.X.b;
        int i = 0;
        while (i < min) {
            AbstractC8166n1.d<E> dVar2 = dVar.b;
            K(dVar);
            i++;
            dVar = dVar2;
        }
        super.G();
    }

    @Override // o.AbstractC8166n1
    public void H(AbstractC8166n1.d<E> dVar) {
        super.H(dVar);
        K(dVar);
    }

    public void K(AbstractC8166n1.d<E> dVar) {
        if (Q()) {
            return;
        }
        AbstractC8166n1.d<E> dVar2 = this.Y0;
        dVar.a = null;
        dVar.b = dVar2;
        dVar.f(null);
        this.Y0 = dVar;
        this.Z0++;
    }

    public int L() {
        return this.a1;
    }

    public AbstractC8166n1.d<E> M() {
        int i = this.Z0;
        if (i == 0) {
            return null;
        }
        AbstractC8166n1.d<E> dVar = this.Y0;
        this.Y0 = dVar.b;
        dVar.b = null;
        this.Z0 = i - 1;
        return dVar;
    }

    public boolean Q() {
        if (this.Z0 >= this.a1) {
            return true;
        }
        return false;
    }

    public void U(int i) {
        this.a1 = i;
        V();
    }

    public void V() {
        while (this.Z0 > this.a1) {
            M();
        }
    }

    @Override // o.AbstractC8166n1
    public AbstractC8166n1.d<E> k(E e) {
        AbstractC8166n1.d<E> M = M();
        if (M == null) {
            return super.k(e);
        }
        M.f(e);
        return M;
    }

    public C4059Qq1(Collection<? extends E> collection) {
        super(collection);
        this.a1 = 20;
    }

    public C4059Qq1(int i) {
        this.a1 = i;
        D();
    }
}
