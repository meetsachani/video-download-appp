package o;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: o.wm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10545wm extends AbstractMap<Object, Object> implements Cloneable {
    public static final Object[] Z0 = new Object[0];
    public static final Map<Class<? extends Object>, InterfaceC3189Hs2> a1 = Collections.unmodifiableMap(e());
    @Deprecated
    public static HashMap b1 = new d();
    public transient Object X;
    public transient HashMap<String, Method> Y = new HashMap<>();
    public transient HashMap<String, Method> Z = new HashMap<>();
    public transient HashMap<String, Class<? extends Object>> Y0 = new HashMap<>();

    /* renamed from: o.wm$a */
    /* loaded from: classes4.dex */
    public class a extends AbstractSet<Map.Entry<Object, Object>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<Object, Object>> iterator() {
            return C10545wm.this.g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C10545wm.this.Y.size();
        }
    }

    /* renamed from: o.wm$b */
    /* loaded from: classes4.dex */
    public class b implements Iterator<Object> {
        public final /* synthetic */ Iterator X;

        public b(Iterator it) {
            this.X = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.X.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return C10545wm.this.get(this.X.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove() not supported for BeanMap");
        }
    }

    /* renamed from: o.wm$c */
    /* loaded from: classes4.dex */
    public class c implements Iterator<Map.Entry<Object, Object>> {
        public final /* synthetic */ Iterator X;

        public c(Iterator it) {
            this.X = it;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<Object, Object> next() {
            Object next = this.X.next();
            return new m(C10545wm.this, next, C10545wm.this.get(next));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.X.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove() not supported for BeanMap");
        }
    }

    /* renamed from: o.wm$d */
    /* loaded from: classes4.dex */
    public static class d extends HashMap {
        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return C10545wm.a1.containsKey(obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public boolean containsValue(Object obj) {
            return C10545wm.a1.containsValue(obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            return C10545wm.a1.entrySet();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            return C10545wm.a1.get(obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public Set keySet() {
            return C10545wm.a1.keySet();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public Object put(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public void putAll(Map map) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public Object remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return C10545wm.a1.size();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public Collection values() {
            return C10545wm.a1.values();
        }
    }

    /* renamed from: o.wm$e */
    /* loaded from: classes4.dex */
    public static class e implements InterfaceC3189Hs2 {
        @Override // o.InterfaceC3189Hs2
        public Object a(Object obj) {
            return Boolean.valueOf(obj.toString());
        }
    }

    /* renamed from: o.wm$f */
    /* loaded from: classes4.dex */
    public static class f implements InterfaceC3189Hs2 {
        @Override // o.InterfaceC3189Hs2
        public Object a(Object obj) {
            return new Character(obj.toString().charAt(0));
        }
    }

    /* renamed from: o.wm$g */
    /* loaded from: classes4.dex */
    public static class g implements InterfaceC3189Hs2 {
        @Override // o.InterfaceC3189Hs2
        public Object a(Object obj) {
            return Byte.valueOf(obj.toString());
        }
    }

    /* renamed from: o.wm$h */
    /* loaded from: classes4.dex */
    public static class h implements InterfaceC3189Hs2 {
        @Override // o.InterfaceC3189Hs2
        public Object a(Object obj) {
            return Short.valueOf(obj.toString());
        }
    }

    /* renamed from: o.wm$i */
    /* loaded from: classes4.dex */
    public static class i implements InterfaceC3189Hs2 {
        @Override // o.InterfaceC3189Hs2
        public Object a(Object obj) {
            return Integer.valueOf(obj.toString());
        }
    }

    /* renamed from: o.wm$j */
    /* loaded from: classes4.dex */
    public static class j implements InterfaceC3189Hs2 {
        @Override // o.InterfaceC3189Hs2
        public Object a(Object obj) {
            return Long.valueOf(obj.toString());
        }
    }

    /* renamed from: o.wm$k */
    /* loaded from: classes4.dex */
    public static class k implements InterfaceC3189Hs2 {
        @Override // o.InterfaceC3189Hs2
        public Object a(Object obj) {
            return Float.valueOf(obj.toString());
        }
    }

    /* renamed from: o.wm$l */
    /* loaded from: classes4.dex */
    public static class l implements InterfaceC3189Hs2 {
        @Override // o.InterfaceC3189Hs2
        public Object a(Object obj) {
            return Double.valueOf(obj.toString());
        }
    }

    /* renamed from: o.wm$m */
    /* loaded from: classes4.dex */
    public static class m extends K1 {
        public final C10545wm Z;

        public m(C10545wm c10545wm, Object obj, Object obj2) {
            super(obj, obj2);
            this.Z = c10545wm;
        }

        @Override // o.K1, java.util.Map.Entry
        public Object setValue(Object obj) {
            Object key = getKey();
            Object obj2 = this.Z.get(key);
            this.Z.put(key, obj);
            super.setValue(this.Z.get(key));
            return obj2;
        }
    }

    public C10545wm() {
    }

    public static Map<Class<? extends Object>, InterfaceC3189Hs2> e() {
        HashMap hashMap = new HashMap();
        hashMap.put(Boolean.TYPE, new e());
        hashMap.put(Character.TYPE, new f());
        hashMap.put(Byte.TYPE, new g());
        hashMap.put(Short.TYPE, new h());
        hashMap.put(Integer.TYPE, new i());
        hashMap.put(Long.TYPE, new j());
        hashMap.put(Float.TYPE, new k());
        hashMap.put(Double.TYPE, new l());
        return hashMap;
    }

    public Iterator<Object> A() {
        return new b(u());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Class<?> cls;
        Object obj = this.X;
        if (obj == null) {
            return;
        }
        try {
            cls = obj.getClass();
        } catch (Exception e2) {
            e = e2;
            cls = null;
        }
        try {
            this.X = cls.newInstance();
        } catch (Exception e3) {
            e = e3;
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Could not create new instance of class: " + cls);
            C3651Mm.p(unsupportedOperationException, e);
            throw unsupportedOperationException;
        }
    }

    @Override // java.util.AbstractMap
    public Object clone() throws CloneNotSupportedException {
        C10545wm c10545wm = (C10545wm) super.clone();
        Object obj = this.X;
        if (obj == null) {
            return c10545wm;
        }
        Class<?> cls = obj.getClass();
        try {
            try {
                c10545wm.z(cls.newInstance());
                try {
                    for (String str : this.Y.keySet()) {
                        if (o(str) != null) {
                            c10545wm.put(str, get(str));
                        }
                    }
                    return c10545wm;
                } catch (Exception e2) {
                    CloneNotSupportedException cloneNotSupportedException = new CloneNotSupportedException("Unable to copy bean values to cloned bean map: " + e2);
                    C3651Mm.p(cloneNotSupportedException, e2);
                    throw cloneNotSupportedException;
                }
            } catch (Exception e3) {
                CloneNotSupportedException cloneNotSupportedException2 = new CloneNotSupportedException("Unable to set bean in the cloned bean map: " + e3);
                C3651Mm.p(cloneNotSupportedException2, e3);
                throw cloneNotSupportedException2;
            }
        } catch (Exception e4) {
            CloneNotSupportedException cloneNotSupportedException3 = new CloneNotSupportedException("Unable to instantiate the underlying bean \"" + cls.getName() + "\": " + e4);
            C3651Mm.p(cloneNotSupportedException3, e4);
            throw cloneNotSupportedException3;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (k(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public Object d(Class<?> cls, Object obj) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            return cls.getConstructor(obj.getClass()).newInstance(obj);
        } catch (NoSuchMethodException unused) {
            InterfaceC3189Hs2 n = n(cls);
            if (n != null) {
                return n.a(obj);
            }
            return obj;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<Object, Object>> entrySet() {
        return Collections.unmodifiableSet(new a());
    }

    public Object[] f(Method method, Object obj) throws IllegalAccessException, ClassCastException {
        if (obj != null) {
            try {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes != null && parameterTypes.length > 0) {
                    Class<?> cls = parameterTypes[0];
                    if (!cls.isAssignableFrom(obj.getClass())) {
                        obj = d(cls, obj);
                    }
                }
            } catch (InstantiationException e2) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(e2.getMessage());
                if (!C3651Mm.p(illegalArgumentException, e2)) {
                    v(e2);
                }
                C3651Mm.p(illegalArgumentException, e2);
                throw illegalArgumentException;
            } catch (InvocationTargetException e3) {
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(e3.getMessage());
                if (!C3651Mm.p(illegalArgumentException2, e3)) {
                    v(e3);
                }
                throw illegalArgumentException2;
            }
        }
        return new Object[]{obj};
    }

    public Iterator<Map.Entry<Object, Object>> g() {
        return new c(u());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Method k2;
        if (this.X != null && (k2 = k(obj)) != null) {
            try {
                return k2.invoke(this.X, Z0);
            } catch (IllegalAccessException e2) {
                w(e2);
                return null;
            } catch (IllegalArgumentException e3) {
                w(e3);
                return null;
            } catch (NullPointerException e4) {
                w(e4);
                return null;
            } catch (InvocationTargetException e5) {
                w(e5);
                return null;
            }
        }
        return null;
    }

    public Object j() {
        return this.X;
    }

    public Method k(Object obj) {
        return this.Y.get(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Object> keySet() {
        return Collections.unmodifiableSet(this.Y.keySet());
    }

    public Method l(String str) {
        return this.Y.get(str);
    }

    public Class<?> m(String str) {
        return this.Y0.get(str);
    }

    public InterfaceC3189Hs2 n(Class<?> cls) {
        return a1.get(cls);
    }

    public Method o(Object obj) {
        return this.Z.get(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) throws IllegalArgumentException, ClassCastException {
        if (this.X != null) {
            Object obj3 = get(obj);
            Method o2 = o(obj);
            if (o2 != null) {
                try {
                    o2.invoke(this.X, f(o2, obj2));
                    i(obj, obj3, get(obj));
                    return obj3;
                } catch (IllegalAccessException e2) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(e2.getMessage());
                    if (!C3651Mm.p(illegalArgumentException, e2)) {
                        v(e2);
                    }
                    throw illegalArgumentException;
                } catch (InvocationTargetException e3) {
                    IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(e3.getMessage());
                    if (!C3651Mm.p(illegalArgumentException2, e3)) {
                        v(e3);
                    }
                    throw illegalArgumentException2;
                }
            }
            throw new IllegalArgumentException("The bean of type: " + this.X.getClass().getName() + " has no property called: " + obj);
        }
        return null;
    }

    public Method r(String str) {
        return this.Z.get(str);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.Y.size();
    }

    public final void t() {
        if (j() != null) {
            try {
                PropertyDescriptor[] propertyDescriptors = Introspector.getBeanInfo(j().getClass()).getPropertyDescriptors();
                if (propertyDescriptors != null) {
                    for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
                        if (propertyDescriptor != null) {
                            String name = propertyDescriptor.getName();
                            Method readMethod = propertyDescriptor.getReadMethod();
                            Method writeMethod = propertyDescriptor.getWriteMethod();
                            Class<? extends Object> propertyType = propertyDescriptor.getPropertyType();
                            if (readMethod != null) {
                                this.Y.put(name, readMethod);
                            }
                            if (writeMethod != null) {
                                this.Z.put(name, writeMethod);
                            }
                            this.Y0.put(name, propertyType);
                        }
                    }
                }
            } catch (IntrospectionException e2) {
                w(e2);
            }
        }
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return "BeanMap<" + String.valueOf(this.X) + ">";
    }

    public Iterator<String> u() {
        return this.Y.keySet().iterator();
    }

    public void v(Exception exc) {
        PrintStream printStream = System.out;
        printStream.println("INFO: Exception: " + exc);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<Object> values() {
        ArrayList arrayList = new ArrayList(this.Y.size());
        Iterator<Object> A = A();
        while (A.hasNext()) {
            arrayList.add(A.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void w(Exception exc) {
        PrintStream printStream = System.out;
        printStream.println("WARN: Exception: " + exc);
        exc.printStackTrace();
    }

    public void x(C10545wm c10545wm) {
        for (String str : c10545wm.Y.keySet()) {
            if (o(str) != null) {
                put(str, c10545wm.get(str));
            }
        }
    }

    public void y() {
        this.Y.clear();
        this.Z.clear();
        this.Y0.clear();
        t();
    }

    public void z(Object obj) {
        this.X = obj;
        y();
    }

    public C10545wm(Object obj) {
        this.X = obj;
        t();
    }

    public void i(Object obj, Object obj2, Object obj3) {
    }
}
