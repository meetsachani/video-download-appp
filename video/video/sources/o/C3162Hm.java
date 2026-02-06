package o;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: o.Hm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3162Hm extends AbstractMap implements Cloneable {
    public static final Object[] Z0 = new Object[0];
    public static HashMap a1;
    public transient Object X;
    public transient HashMap Y = new HashMap();
    public transient HashMap Z = new HashMap();
    public transient HashMap Y0 = new HashMap();

    /* renamed from: o.Hm$a */
    /* loaded from: classes4.dex */
    public static class a extends K1 {
        public C3162Hm Z;

        public a(C3162Hm c3162Hm, Object obj, Object obj2) {
            super(obj, obj2);
            this.Z = c3162Hm;
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

    static {
        HashMap hashMap = new HashMap();
        a1 = hashMap;
        hashMap.put(Boolean.TYPE, new C11031ym());
        a1.put(Character.TYPE, new C11274zm());
        a1.put(Byte.TYPE, new C2465Am());
        a1.put(Short.TYPE, new C2563Bm());
        a1.put(Integer.TYPE, new C2661Cm());
        a1.put(Long.TYPE, new C2759Dm());
        a1.put(Float.TYPE, new C2857Em());
        a1.put(Double.TYPE, new C2966Fm());
    }

    public C3162Hm() {
    }

    public Object c(Class cls, Object obj) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            return cls.getConstructor(obj.getClass()).newInstance(obj);
        } catch (NoSuchMethodException unused) {
            InterfaceC3189Hs2 l = l(cls);
            if (l != null) {
                return l.a(obj);
            }
            return obj;
        }
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
            try {
                this.X = cls.newInstance();
            } catch (Exception unused) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Could not create new instance of class: ");
                stringBuffer.append(cls);
                throw new UnsupportedOperationException(stringBuffer.toString());
            }
        } catch (Exception unused2) {
            cls = null;
        }
    }

    @Override // java.util.AbstractMap
    public Object clone() throws CloneNotSupportedException {
        Class cls;
        C3162Hm c3162Hm = (C3162Hm) super.clone();
        Object obj = this.X;
        if (obj == null) {
            return c3162Hm;
        }
        try {
            try {
                try {
                    c3162Hm.x(obj.getClass().newInstance());
                    try {
                        for (Object obj2 : this.Y.keySet()) {
                            if (m(obj2) != null) {
                                c3162Hm.put(obj2, get(obj2));
                            }
                        }
                        return c3162Hm;
                    } catch (Exception e) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Unable to copy bean values to cloned bean map: ");
                        stringBuffer.append(e);
                        throw new CloneNotSupportedException(stringBuffer.toString());
                    }
                } catch (Exception e2) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Unable to set bean in the cloned bean map: ");
                    stringBuffer2.append(e2);
                    throw new CloneNotSupportedException(stringBuffer2.toString());
                }
            } catch (Exception e3) {
                e = e3;
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("Unable to instantiate the underlying bean \"");
                stringBuffer3.append(cls.getName());
                stringBuffer3.append("\": ");
                stringBuffer3.append(e);
                throw new CloneNotSupportedException(stringBuffer3.toString());
            }
        } catch (Exception e4) {
            e = e4;
            cls = null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (i(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public Object[] d(Method method, Object obj) throws IllegalAccessException, ClassCastException {
        if (obj != null) {
            try {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes != null && parameterTypes.length > 0) {
                    Class<?> cls = parameterTypes[0];
                    if (!cls.isAssignableFrom(obj.getClass())) {
                        obj = c(cls, obj);
                    }
                }
            } catch (InstantiationException e) {
                t(e);
                throw new IllegalArgumentException(e.getMessage());
            } catch (InvocationTargetException e2) {
                t(e2);
                throw new IllegalArgumentException(e2.getMessage());
            }
        }
        return new Object[]{obj};
    }

    public Iterator e() {
        return new C10788xm(this, r());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return DB2.f(new C3064Gm(this));
    }

    public Object g() {
        return this.X;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Method i;
        if (this.X != null && (i = i(obj)) != null) {
            try {
                return i.invoke(this.X, Z0);
            } catch (IllegalAccessException e) {
                u(e);
                return null;
            } catch (IllegalArgumentException e2) {
                u(e2);
                return null;
            } catch (NullPointerException e3) {
                u(e3);
                return null;
            } catch (InvocationTargetException e4) {
                u(e4);
                return null;
            }
        }
        return null;
    }

    public Method i(Object obj) {
        return (Method) this.Y.get(obj);
    }

    public Method j(String str) {
        return (Method) this.Y.get(str);
    }

    public Class k(String str) {
        return (Class) this.Y0.get(str);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return DB2.f(this.Y.keySet());
    }

    public InterfaceC3189Hs2 l(Class cls) {
        return (InterfaceC3189Hs2) a1.get(cls);
    }

    public Method m(Object obj) {
        return (Method) this.Z.get(obj);
    }

    public Method n(String str) {
        return (Method) this.Z.get(str);
    }

    public final void o() {
        if (g() != null) {
            try {
                PropertyDescriptor[] propertyDescriptors = Introspector.getBeanInfo(g().getClass()).getPropertyDescriptors();
                if (propertyDescriptors != null) {
                    for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
                        if (propertyDescriptor != null) {
                            String name = propertyDescriptor.getName();
                            Method readMethod = propertyDescriptor.getReadMethod();
                            Method writeMethod = propertyDescriptor.getWriteMethod();
                            Class propertyType = propertyDescriptor.getPropertyType();
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
            } catch (IntrospectionException e) {
                u(e);
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) throws IllegalArgumentException, ClassCastException {
        if (this.X != null) {
            Object obj3 = get(obj);
            Method m = m(obj);
            if (m != null) {
                try {
                    m.invoke(this.X, d(m, obj2));
                    f(obj, obj3, get(obj));
                    return obj3;
                } catch (IllegalAccessException e) {
                    t(e);
                    throw new IllegalArgumentException(e.getMessage());
                } catch (InvocationTargetException e2) {
                    t(e2);
                    throw new IllegalArgumentException(e2.getMessage());
                }
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("The bean of type: ");
            stringBuffer.append(this.X.getClass().getName());
            stringBuffer.append(" has no property called: ");
            stringBuffer.append(obj);
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        return null;
    }

    public Iterator r() {
        return this.Y.keySet().iterator();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.Y.size();
    }

    public void t(Exception exc) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("INFO: Exception: ");
        stringBuffer.append(exc);
        printStream.println(stringBuffer.toString());
    }

    @Override // java.util.AbstractMap
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("BeanMap<");
        stringBuffer.append(String.valueOf(this.X));
        stringBuffer.append(">");
        return stringBuffer.toString();
    }

    public void u(Exception exc) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("WARN: Exception: ");
        stringBuffer.append(exc);
        printStream.println(stringBuffer.toString());
        exc.printStackTrace();
    }

    public void v(C3162Hm c3162Hm) {
        for (Object obj : c3162Hm.Y.keySet()) {
            if (m(obj) != null) {
                put(obj, c3162Hm.get(obj));
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        ArrayList arrayList = new ArrayList(this.Y.size());
        Iterator y = y();
        while (y.hasNext()) {
            arrayList.add(y.next());
        }
        return C6978iB2.f(arrayList);
    }

    public void w() {
        this.Y.clear();
        this.Z.clear();
        this.Y0.clear();
        o();
    }

    public void x(Object obj) {
        this.X = obj;
        w();
    }

    public Iterator y() {
        return new C10299vm(this, r());
    }

    public C3162Hm(Object obj) {
        this.X = obj;
        o();
    }

    public void f(Object obj, Object obj2, Object obj3) {
    }
}
