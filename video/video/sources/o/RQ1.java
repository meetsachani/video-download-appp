package o;

import java.io.Serializable;
import o.AbstractC7269jO0;
import o.InterfaceC2467Am1;

@InterfaceC10420wF0(emulated = true, serializable = true)
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public class RQ1<E> extends AbstractC7269jO0<E> {
    public static final RQ1<Object> b1 = new RQ1<>(C5920dt1.c());
    public final transient C5920dt1<E> Y0;
    public final transient int Z0;
    @MB
    @SY0
    public transient AbstractC9481sO0<E> a1;

    /* loaded from: classes3.dex */
    public final class b extends AbstractC9242rP0<E> {
        public b() {
        }

        @Override // o.TN0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            return RQ1.this.contains(obj);
        }

        @Override // o.AbstractC9242rP0
        public E get(int i) {
            return RQ1.this.Y0.j(i);
        }

        @Override // o.TN0
        public boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return RQ1.this.Y0.D();
        }
    }

    @InterfaceC11149zF0
    /* loaded from: classes3.dex */
    public static class c implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] X;
        public final int[] Y;

        public c(InterfaceC2467Am1<? extends Object> interfaceC2467Am1) {
            int size = interfaceC2467Am1.entrySet().size();
            this.X = new Object[size];
            this.Y = new int[size];
            int i = 0;
            for (InterfaceC2467Am1.a<? extends Object> aVar : interfaceC2467Am1.entrySet()) {
                this.X[i] = aVar.a();
                this.Y[i] = aVar.getCount();
                i++;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Object readResolve() {
            AbstractC7269jO0.b bVar = new AbstractC7269jO0.b(this.X.length);
            int i = 0;
            while (true) {
                Object[] objArr = this.X;
                if (i < objArr.length) {
                    bVar.k(objArr[i], this.Y[i]);
                    i++;
                } else {
                    return bVar.e();
                }
            }
        }
    }

    public RQ1(C5920dt1<E> c5920dt1) {
        this.Y0 = c5920dt1;
        long j = 0;
        for (int i = 0; i < c5920dt1.D(); i++) {
            j += c5920dt1.l(i);
        }
        this.Z0 = C7775lT0.x(j);
    }

    @Override // o.AbstractC7269jO0, o.InterfaceC2467Am1
    /* renamed from: G */
    public AbstractC9481sO0<E> n() {
        AbstractC9481sO0<E> abstractC9481sO0 = this.a1;
        if (abstractC9481sO0 == null) {
            b bVar = new b();
            this.a1 = bVar;
            return bVar;
        }
        return abstractC9481sO0;
    }

    @Override // o.AbstractC7269jO0
    public InterfaceC2467Am1.a<E> J(int i) {
        return this.Y0.h(i);
    }

    @Override // o.TN0
    public boolean j() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, o.InterfaceC2467Am1
    public int size() {
        return this.Z0;
    }

    @Override // o.InterfaceC2467Am1
    public int w4(@MB Object obj) {
        return this.Y0.g(obj);
    }

    @Override // o.AbstractC7269jO0, o.TN0
    @InterfaceC11149zF0
    public Object writeReplace() {
        return new c(this);
    }
}
