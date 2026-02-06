package o;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public class MY0 extends ArrayList<Object> {
    public B80 X;
    public transient BN2 Y;
    public Class<?> Y0;
    public Class<?> Z;

    public MY0() {
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        InterfaceC10878y80 k = k(obj);
        f(i);
        super.add(i, k);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<?> collection) {
        if (collection == null || collection.size() == 0) {
            return false;
        }
        ensureCapacity(size() + collection.size());
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
        return true;
    }

    public final NY0 d(Object obj) {
        return new NY0((Map) obj);
    }

    public final B80 e() {
        B80 b80 = this.X;
        if (b80 == null) {
            return this.Y;
        }
        return b80;
    }

    public final void f(int i) {
        if (i >= size()) {
            ensureCapacity(i + 1);
            for (int size = size(); size < i; size++) {
                super.add(k(null));
            }
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public Object get(int i) {
        f(i + 1);
        return super.get(i);
    }

    public void h(B80 b80) {
        if (b80 != null) {
            if (size() <= 0) {
                try {
                    InterfaceC10878y80 b = b80.b();
                    Class<?> cls = b.getClass();
                    this.Y0 = cls;
                    if (AN2.class.isAssignableFrom(cls)) {
                        this.Z = ((AN2) b).b().getClass();
                        this.Y = (BN2) b80;
                        return;
                    } else if (NY0.class.isAssignableFrom(this.Y0)) {
                        this.Z = ((NY0) b).z().getClass();
                        this.X = b80;
                        return;
                    } else {
                        this.Z = b.getClass();
                        this.X = b80;
                        return;
                    }
                } catch (Exception e) {
                    throw new IllegalArgumentException("Error creating DynaBean from " + b80.getClass().getName() + " - " + e);
                }
            }
            throw new IllegalStateException("Element DynaClass cannot be reset");
        }
        throw new IllegalArgumentException("Element DynaClass is missing");
    }

    public void i(Class<?> cls) {
        InterfaceC10878y80 an2;
        if (cls != null) {
            Class<?> cls2 = this.Z;
            if (cls2 != null && !cls2.equals(cls) && size() > 0) {
                throw new IllegalStateException("Element Type cannot be reset");
            }
            this.Z = cls;
            try {
                Object newInstance = cls.newInstance();
                if (Map.class.isAssignableFrom(cls)) {
                    an2 = d(newInstance);
                    this.X = an2.d();
                } else if (InterfaceC10878y80.class.isAssignableFrom(cls)) {
                    an2 = (InterfaceC10878y80) newInstance;
                    this.X = an2.d();
                } else {
                    an2 = new AN2(newInstance);
                    this.Y = (BN2) an2.d();
                }
                Class<?> cls3 = an2.getClass();
                this.Y0 = cls3;
                if (AN2.class.isAssignableFrom(cls3)) {
                    this.Z = ((AN2) an2).b().getClass();
                    return;
                } else if (NY0.class.isAssignableFrom(this.Y0)) {
                    this.Z = ((NY0) an2).z().getClass();
                    return;
                } else {
                    return;
                }
            } catch (Exception e) {
                throw new IllegalArgumentException("Error creating type: " + cls.getName() + " - " + e);
            }
        }
        throw new IllegalArgumentException("Element Type is missing");
    }

    public InterfaceC10878y80[] j() {
        if (size() == 0 && this.Y0 == null) {
            return new KY0[0];
        }
        InterfaceC10878y80[] interfaceC10878y80Arr = (InterfaceC10878y80[]) Array.newInstance(this.Y0, size());
        for (int i = 0; i < size(); i++) {
            interfaceC10878y80Arr[i] = (InterfaceC10878y80) get(i);
        }
        return interfaceC10878y80Arr;
    }

    public final InterfaceC10878y80 k(Object obj) {
        InterfaceC10878y80 an2;
        Class<?> cls;
        if (obj == null) {
            if (this.Z == null) {
                h(new LY0());
            }
            if (e() == null) {
                i(this.Z);
            }
            try {
                an2 = e().b();
                cls = an2.getClass();
            } catch (Exception e) {
                throw new IllegalArgumentException("Error creating DynaBean: " + e().getClass().getName() + " - " + e);
            }
        } else {
            if (Map.class.isAssignableFrom(obj.getClass())) {
                an2 = d(obj);
            } else if (InterfaceC10878y80.class.isAssignableFrom(obj.getClass())) {
                an2 = (InterfaceC10878y80) obj;
            } else {
                an2 = new AN2(obj);
            }
            cls = an2.getClass();
        }
        Class<?> cls2 = an2.getClass();
        if (AN2.class.isAssignableFrom(cls)) {
            cls2 = ((AN2) an2).b().getClass();
        } else if (NY0.class.isAssignableFrom(cls)) {
            cls2 = ((NY0) an2).z().getClass();
        }
        Class<?> cls3 = this.Z;
        if (cls3 != null && !cls2.equals(cls3)) {
            throw new IllegalArgumentException("Element Type " + cls2 + " doesn't match other elements " + this.Z);
        }
        return an2;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        InterfaceC10878y80 k = k(obj);
        f(i + 1);
        return super.set(i, k);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        if (size() == 0 && this.Z == null) {
            return new KY0[0];
        }
        Object[] objArr = (Object[]) Array.newInstance(this.Z, size());
        for (int i = 0; i < size(); i++) {
            if (Map.class.isAssignableFrom(this.Z)) {
                objArr[i] = ((NY0) get(i)).z();
            } else if (InterfaceC10878y80.class.isAssignableFrom(this.Z)) {
                objArr[i] = get(i);
            } else {
                objArr[i] = ((AN2) get(i)).b();
            }
        }
        return objArr;
    }

    public MY0(int i) {
        super(i);
    }

    public MY0(B80 b80) {
        h(b80);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        return super.add(k(obj));
    }

    public MY0(Class<?> cls) {
        i(cls);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<?> collection) {
        if (collection == null || collection.size() == 0) {
            return false;
        }
        ensureCapacity((i > size() ? i : size()) + collection.size());
        if (size() == 0) {
            k(collection.iterator().next());
        }
        f(i);
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            add(i, it.next());
            i++;
        }
        return true;
    }

    public MY0(Collection<?> collection) {
        super(collection.size());
        addAll(collection);
    }

    public MY0(Object[] objArr) {
        super(objArr.length);
        for (Object obj : objArr) {
            add(obj);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        Object b;
        Class<?> componentType = tArr.getClass().getComponentType();
        if (!InterfaceC10878y80.class.isAssignableFrom(componentType) && (size() != 0 || this.Z != null)) {
            if (componentType.isAssignableFrom(this.Z)) {
                if (tArr.length < size()) {
                    tArr = (T[]) ((Object[]) Array.newInstance(componentType, size()));
                }
                for (int i = 0; i < size(); i++) {
                    if (!Map.class.isAssignableFrom(this.Z)) {
                        if (InterfaceC10878y80.class.isAssignableFrom(this.Z)) {
                            b = get(i);
                        } else {
                            b = ((AN2) get(i)).b();
                        }
                    } else {
                        b = ((NY0) get(i)).z();
                    }
                    Array.set(tArr, i, b);
                }
                return tArr;
            }
            throw new IllegalArgumentException("Invalid array type: " + componentType.getName() + " - not compatible with '" + this.Z.getName());
        }
        return (T[]) super.toArray(tArr);
    }
}
