package o;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class Z0 extends J1 {

    /* loaded from: classes4.dex */
    public static class b extends C7176j1 {
        public final Z0 Y;

        public b(Iterator it, Z0 z0) {
            super(it);
            this.Y = z0;
        }

        @Override // o.C7176j1, java.util.Iterator
        public Object next() {
            return new c((Map.Entry) this.X.next(), this.Y);
        }
    }

    /* loaded from: classes4.dex */
    public static class c extends O1 {
        public final Z0 Y;

        public c(Map.Entry entry, Z0 z0) {
            super(entry);
            this.Y = z0;
        }

        @Override // o.O1, java.util.Map.Entry
        public Object setValue(Object obj) {
            return this.X.setValue(this.Y.a(obj));
        }
    }

    public Z0() {
    }

    public abstract Object a(Object obj);

    public boolean b() {
        return true;
    }

    @Override // o.J1, java.util.Map
    public Set entrySet() {
        if (b()) {
            return new a(this.X.entrySet(), this);
        }
        return this.X.entrySet();
    }

    public Z0(Map map) {
        super(map);
    }

    /* loaded from: classes4.dex */
    public static class a extends AbstractC4989a3 {
        public final Z0 Y;

        public a(Set set, Z0 z0) {
            super(set);
            this.Y = z0;
        }

        @Override // o.AbstractC8405o0, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(this.X.iterator(), this.Y);
        }

        @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
        public Object[] toArray() {
            Object[] array = this.X.toArray();
            for (int i = 0; i < array.length; i++) {
                array[i] = new c((Map.Entry) array[i], this.Y);
            }
            return array;
        }

        @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
        public Object[] toArray(Object[] objArr) {
            Object[] array = this.X.toArray(objArr.length > 0 ? (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 0) : objArr);
            for (int i = 0; i < array.length; i++) {
                array[i] = new c((Map.Entry) array[i], this.Y);
            }
            if (array.length > objArr.length) {
                return array;
            }
            System.arraycopy(array, 0, objArr, 0, array.length);
            if (objArr.length > array.length) {
                objArr[array.length] = null;
            }
            return objArr;
        }
    }
}
