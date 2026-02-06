package o;

import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import o.AbstractC5317bO0;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.rz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9379rz<E> extends AbstractList<List<E>> implements RandomAccess {
    public final transient AbstractC5317bO0<List<E>> X;
    public final transient int[] Y;

    /* renamed from: o.rz$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC5317bO0<E> {
        public final /* synthetic */ int Z;

        public a(int i) {
            this.Z = i;
        }

        @Override // java.util.List
        public E get(int i) {
            C10664xF1.C(i, size());
            return (E) ((List) C9379rz.this.X.get(i)).get(C9379rz.this.i(this.Z, i));
        }

        @Override // o.TN0
        public boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return C9379rz.this.X.size();
        }
    }

    public C9379rz(AbstractC5317bO0<List<E>> abstractC5317bO0) {
        this.X = abstractC5317bO0;
        int[] iArr = new int[abstractC5317bO0.size() + 1];
        iArr[abstractC5317bO0.size()] = 1;
        try {
            for (int size = abstractC5317bO0.size() - 1; size >= 0; size--) {
                iArr[size] = C9979uR0.d(iArr[size + 1], abstractC5317bO0.get(size).size());
            }
            this.Y = iArr;
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException("Cartesian product too large; must have size at most Integer.MAX_VALUE");
        }
    }

    public static <E> List<List<E>> f(List<? extends List<? extends E>> list) {
        AbstractC5317bO0.a aVar = new AbstractC5317bO0.a(list.size());
        for (List<? extends E> list2 : list) {
            AbstractC5317bO0 F = AbstractC5317bO0.F(list2);
            if (F.isEmpty()) {
                return AbstractC5317bO0.L();
            }
            aVar.g(F);
        }
        return new C9379rz(aVar.e());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(@MB Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        List<E> list = (List) obj;
        if (list.size() != this.X.size()) {
            return false;
        }
        int i = 0;
        for (E e : list) {
            if (!this.X.get(i).contains(e)) {
                return false;
            }
            i++;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h */
    public AbstractC5317bO0<E> get(int i) {
        C10664xF1.C(i, size());
        return new a(i);
    }

    public final int i(int i, int i2) {
        return (i / this.Y[i2 + 1]) % this.X.get(i2).size();
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(@MB Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        List list = (List) obj;
        if (list.size() != this.X.size()) {
            return -1;
        }
        ListIterator<E> listIterator = list.listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            int indexOf = this.X.get(nextIndex).indexOf(listIterator.next());
            if (indexOf == -1) {
                return -1;
            }
            i += indexOf * this.Y[nextIndex + 1];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(@MB Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        List list = (List) obj;
        if (list.size() != this.X.size()) {
            return -1;
        }
        ListIterator<E> listIterator = list.listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            int lastIndexOf = this.X.get(nextIndex).lastIndexOf(listIterator.next());
            if (lastIndexOf == -1) {
                return -1;
            }
            i += lastIndexOf * this.Y[nextIndex + 1];
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.Y[0];
    }
}
