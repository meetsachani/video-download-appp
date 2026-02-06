package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import o.AbstractC7373jp2;

@Deprecated
/* loaded from: classes2.dex */
public final class QD1 extends AbstractC8892q0 {
    public final int d1;
    public final int e1;
    public final int[] f1;
    public final int[] g1;
    public final AbstractC7373jp2[] h1;
    public final Object[] i1;
    public final HashMap<Object, Integer> j1;

    /* loaded from: classes2.dex */
    public class a extends AbstractC3696My0 {
        public final AbstractC7373jp2.d b1;

        public a(AbstractC7373jp2 abstractC7373jp2) {
            super(abstractC7373jp2);
            this.b1 = new AbstractC7373jp2.d();
        }

        @Override // o.AbstractC3696My0, o.AbstractC7373jp2
        public AbstractC7373jp2.b l(int i, AbstractC7373jp2.b bVar, boolean z) {
            AbstractC7373jp2.b l = super.l(i, bVar, z);
            if (super.u(l.Z, this.b1).k()) {
                l.z(bVar.X, bVar.Y, bVar.Z, bVar.Y0, bVar.Z0, J6.g1, true);
                return l;
            }
            l.a1 = true;
            return l;
        }
    }

    public QD1(Collection<? extends InterfaceC9795th1> collection, U52 u52) {
        this(O(collection), P(collection), u52);
    }

    public static AbstractC7373jp2[] O(Collection<? extends InterfaceC9795th1> collection) {
        AbstractC7373jp2[] abstractC7373jp2Arr = new AbstractC7373jp2[collection.size()];
        int i = 0;
        for (InterfaceC9795th1 interfaceC9795th1 : collection) {
            abstractC7373jp2Arr[i] = interfaceC9795th1.b();
            i++;
        }
        return abstractC7373jp2Arr;
    }

    public static Object[] P(Collection<? extends InterfaceC9795th1> collection) {
        Object[] objArr = new Object[collection.size()];
        int i = 0;
        for (InterfaceC9795th1 interfaceC9795th1 : collection) {
            objArr[i] = interfaceC9795th1.a();
            i++;
        }
        return objArr;
    }

    @Override // o.AbstractC8892q0
    public int A(Object obj) {
        Integer num = this.j1.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // o.AbstractC8892q0
    public int B(int i) {
        return TD2.m(this.f1, i + 1, false, false);
    }

    @Override // o.AbstractC8892q0
    public int C(int i) {
        return TD2.m(this.g1, i + 1, false, false);
    }

    @Override // o.AbstractC8892q0
    public Object F(int i) {
        return this.i1[i];
    }

    @Override // o.AbstractC8892q0
    public int H(int i) {
        return this.f1[i];
    }

    @Override // o.AbstractC8892q0
    public int I(int i) {
        return this.g1[i];
    }

    @Override // o.AbstractC8892q0
    public AbstractC7373jp2 L(int i) {
        return this.h1[i];
    }

    public QD1 M(U52 u52) {
        AbstractC7373jp2[] abstractC7373jp2Arr = new AbstractC7373jp2[this.h1.length];
        int i = 0;
        while (true) {
            AbstractC7373jp2[] abstractC7373jp2Arr2 = this.h1;
            if (i < abstractC7373jp2Arr2.length) {
                abstractC7373jp2Arr[i] = new a(abstractC7373jp2Arr2[i]);
                i++;
            } else {
                return new QD1(abstractC7373jp2Arr, this.i1, u52);
            }
        }
    }

    public List<AbstractC7373jp2> N() {
        return Arrays.asList(this.h1);
    }

    @Override // o.AbstractC7373jp2
    public int n() {
        return this.e1;
    }

    @Override // o.AbstractC7373jp2
    public int w() {
        return this.d1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QD1(AbstractC7373jp2[] abstractC7373jp2Arr, Object[] objArr, U52 u52) {
        super(false, u52);
        int i = 0;
        int length = abstractC7373jp2Arr.length;
        this.h1 = abstractC7373jp2Arr;
        this.f1 = new int[length];
        this.g1 = new int[length];
        this.i1 = objArr;
        this.j1 = new HashMap<>();
        int length2 = abstractC7373jp2Arr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < length2) {
            AbstractC7373jp2 abstractC7373jp2 = abstractC7373jp2Arr[i];
            this.h1[i4] = abstractC7373jp2;
            this.g1[i4] = i2;
            this.f1[i4] = i3;
            i2 += abstractC7373jp2.w();
            i3 += this.h1[i4].n();
            this.j1.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.d1 = i2;
        this.e1 = i3;
    }
}
