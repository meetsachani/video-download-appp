package o;

import java.beans.IndexedPropertyDescriptor;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import o.AbstractC4253Sp2;

/* loaded from: classes4.dex */
public class NJ1 {
    public static final Object[] f = new Object[0];
    public HJ2<Class<?>, C9813tm> b;
    public HJ2<Class<?>, C9818tn0> c;
    public final List<InterfaceC10056um> e;
    public InterfaceC5095aT1 a = new C8163n00();
    public final J31 d = U31.q(MJ1.class);

    public NJ1() {
        this.b = null;
        this.c = null;
        HJ2<Class<?>, C9813tm> hj2 = new HJ2<>();
        this.b = hj2;
        hj2.l(true);
        HJ2<Class<?>, C9818tn0> hj22 = new HJ2<>();
        this.c = hj22;
        hj22.l(true);
        this.e = new CopyOnWriteArrayList();
        F();
    }

    public static List<Object> P(Object obj) {
        return (List) obj;
    }

    public static Map<String, Object> Q(Object obj) {
        return (Map) obj;
    }

    public static NJ1 h() {
        return C3749Nm.m().r();
    }

    public Method A(Class<?> cls, PropertyDescriptor propertyDescriptor) {
        return C3250Ij1.f(cls, i(cls).c(cls, propertyDescriptor));
    }

    public final Object B(Method method, Object obj, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        String str;
        String str2;
        String str3;
        if (obj != null) {
            try {
                return method.invoke(obj, objArr);
            } catch (IllegalArgumentException e) {
                if (objArr != null) {
                    str2 = "";
                    str = str2;
                    for (int i = 0; i < objArr.length; i++) {
                        if (i > 0) {
                            str2 = str2 + C6566gU0.h;
                        }
                        if (objArr[i] == null) {
                            str3 = str2 + "<null>";
                        } else {
                            str3 = str2 + objArr[i].getClass().getName();
                        }
                        str2 = str3;
                    }
                } else {
                    str = "";
                    str2 = str;
                }
                Class<?>[] parameterTypes = method.getParameterTypes();
                String str4 = str;
                if (parameterTypes != null) {
                    for (int i2 = 0; i2 < parameterTypes.length; i2++) {
                        if (i2 > 0) {
                            str4 = str4 + C6566gU0.h;
                        }
                        str4 = str4 + parameterTypes[i2].getName();
                    }
                }
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Cannot invoke " + method.getDeclaringClass().getName() + UE.h + method.getName() + " on bean class '" + obj.getClass() + "' - " + e.getMessage() + " - had objects of type \"" + str2 + "\" but expected signature \"" + str4 + AbstractC4253Sp2.b.x1);
                if (!C3651Mm.p(illegalArgumentException, e)) {
                    this.d.g("Method invocation failed", e);
                }
                throw illegalArgumentException;
            } catch (NullPointerException e2) {
                String str5 = "";
                if (objArr != null) {
                    for (int i3 = 0; i3 < objArr.length; i3++) {
                        if (i3 > 0) {
                            str5 = str5 + C6566gU0.h;
                        }
                        if (objArr[i3] == null) {
                            str5 = str5 + "<null>";
                        } else {
                            str5 = str5 + objArr[i3].getClass().getName();
                        }
                    }
                }
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                String str6 = "";
                if (parameterTypes2 != null) {
                    for (int i4 = 0; i4 < parameterTypes2.length; i4++) {
                        if (i4 > 0) {
                            str6 = str6 + C6566gU0.h;
                        }
                        str6 = str6 + parameterTypes2[i4].getName();
                    }
                }
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Cannot invoke " + method.getDeclaringClass().getName() + UE.h + method.getName() + " on bean class '" + obj.getClass() + "' - " + e2.getMessage() + " - had objects of type \"" + str5 + "\" but expected signature \"" + str6 + AbstractC4253Sp2.b.x1);
                if (!C3651Mm.p(illegalArgumentException2, e2)) {
                    this.d.g("Method invocation failed", e2);
                }
                throw illegalArgumentException2;
            }
        }
        throw new IllegalArgumentException("No bean specified - this should have been checked before reaching this method");
    }

    public boolean C(Object obj, String str) {
        if (obj != null) {
            if (str != null) {
                while (this.a.c(str)) {
                    String d = this.a.d(str);
                    try {
                        Object o2 = o(obj, d);
                        if (o2 != null) {
                            str = this.a.remove(str);
                            obj = o2;
                        } else {
                            throw new C8606op1("Null property value for '" + d + "' on bean class '" + obj.getClass() + "'");
                        }
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        return false;
                    }
                }
                String property = this.a.getProperty(str);
                if (obj instanceof AN2) {
                    obj = ((AN2) obj).b();
                }
                if (obj instanceof InterfaceC10878y80) {
                    if (((InterfaceC10878y80) obj).d().p(property) == null) {
                        return false;
                    }
                    return true;
                }
                try {
                    IndexedPropertyDescriptor p = p(obj, property);
                    if (p != null) {
                        Method w = w(obj.getClass(), p);
                        if (w == null) {
                            if (p instanceof IndexedPropertyDescriptor) {
                                w = p.getIndexedReadMethod();
                            } else if (p instanceof C7206j81) {
                                w = ((C7206j81) p).e();
                            }
                            w = C3250Ij1.f(obj.getClass(), w);
                        }
                        if (w != null) {
                            return true;
                        }
                    }
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                }
                return false;
            }
            throw new IllegalArgumentException("No name specified for bean class '" + obj.getClass() + "'");
        }
        throw new IllegalArgumentException("No bean specified");
    }

    public boolean D(Object obj, String str) {
        if (obj != null) {
            if (str != null) {
                while (this.a.c(str)) {
                    String d = this.a.d(str);
                    try {
                        Object o2 = o(obj, d);
                        if (o2 != null) {
                            str = this.a.remove(str);
                            obj = o2;
                        } else {
                            throw new C8606op1("Null property value for '" + d + "' on bean class '" + obj.getClass() + "'");
                        }
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        return false;
                    }
                }
                String property = this.a.getProperty(str);
                if (obj instanceof AN2) {
                    obj = ((AN2) obj).b();
                }
                if (obj instanceof InterfaceC10878y80) {
                    if (((InterfaceC10878y80) obj).d().p(property) == null) {
                        return false;
                    }
                    return true;
                }
                try {
                    IndexedPropertyDescriptor p = p(obj, property);
                    if (p != null) {
                        Method A = A(obj.getClass(), p);
                        if (A == null) {
                            if (p instanceof IndexedPropertyDescriptor) {
                                A = p.getIndexedWriteMethod();
                            } else if (p instanceof C7206j81) {
                                A = ((C7206j81) p).f();
                            }
                            A = C3250Ij1.f(obj.getClass(), A);
                        }
                        if (A != null) {
                            return true;
                        }
                    }
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                }
                return false;
            }
            throw new IllegalArgumentException("No name specified for bean class '" + obj.getClass() + "'");
        }
        throw new IllegalArgumentException("No bean specified");
    }

    public boolean E(InterfaceC10056um interfaceC10056um) {
        return this.e.remove(interfaceC10056um);
    }

    public final void F() {
        this.e.clear();
        this.e.add(C7790lY.b);
        this.e.add(C4121Rh2.b);
    }

    public void G(Object obj, String str, int i, Object obj2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        String name;
        if (obj != null) {
            if (str == null || str.length() == 0) {
                if (obj.getClass().isArray()) {
                    Array.set(obj, i, obj2);
                    return;
                } else if (obj instanceof List) {
                    P(obj).set(i, obj2);
                    return;
                }
            }
            if (str != null) {
                if (obj instanceof InterfaceC10878y80) {
                    InterfaceC10878y80 interfaceC10878y80 = (InterfaceC10878y80) obj;
                    if (interfaceC10878y80.d().p(str) != null) {
                        interfaceC10878y80.j(str, i, obj2);
                        return;
                    }
                    throw new NoSuchMethodException("Unknown property '" + str + "' on bean class '" + obj.getClass() + "'");
                }
                IndexedPropertyDescriptor p = p(obj, str);
                if (p != null) {
                    if (p instanceof IndexedPropertyDescriptor) {
                        Method f2 = C3250Ij1.f(obj.getClass(), p.getIndexedWriteMethod());
                        if (f2 != null) {
                            Object[] objArr = {new Integer(i), obj2};
                            try {
                                if (this.d.f()) {
                                    if (obj2 == null) {
                                        name = "<null>";
                                    } else {
                                        name = obj2.getClass().getName();
                                    }
                                    J31 j31 = this.d;
                                    j31.r("setSimpleProperty: Invoking method " + f2 + " with index=" + i + ", value=" + obj2 + " (class " + name + C9811tl1.d);
                                }
                                B(f2, obj, objArr);
                                return;
                            } catch (InvocationTargetException e) {
                                if (e.getTargetException() instanceof IndexOutOfBoundsException) {
                                    throw ((IndexOutOfBoundsException) e.getTargetException());
                                }
                                throw e;
                            }
                        }
                    }
                    Method w = w(obj.getClass(), p);
                    if (w == null) {
                        throw new NoSuchMethodException("Property '" + str + "' has no getter method on bean class '" + obj.getClass() + "'");
                    }
                    Object B = B(w, obj, f);
                    if (!B.getClass().isArray()) {
                        if (!(B instanceof List)) {
                            throw new IllegalArgumentException("Property '" + str + "' is not indexed on bean class '" + obj.getClass() + "'");
                        }
                        P(B).set(i, obj2);
                        return;
                    }
                    Array.set(B, i, obj2);
                    return;
                }
                throw new NoSuchMethodException("Unknown property '" + str + "' on bean class '" + obj.getClass() + "'");
            }
            throw new IllegalArgumentException("No name specified for bean class '" + obj.getClass() + "'");
        }
        throw new IllegalArgumentException("No bean specified");
    }

    public void H(Object obj, String str, Object obj2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        if (obj != null) {
            if (str != null) {
                try {
                    int index = this.a.getIndex(str);
                    if (index >= 0) {
                        G(obj, this.a.getProperty(str), index, obj2);
                        return;
                    }
                    throw new IllegalArgumentException("Invalid indexed property '" + str + "' on bean class '" + obj.getClass() + "'");
                } catch (IllegalArgumentException unused) {
                    throw new IllegalArgumentException("Invalid indexed property '" + str + "' on bean class '" + obj.getClass() + "'");
                }
            }
            throw new IllegalArgumentException("No name specified for bean class '" + obj.getClass() + "'");
        }
        throw new IllegalArgumentException("No bean specified");
    }

    public void I(Object obj, String str, Object obj2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        if (obj != null) {
            if (str != null) {
                try {
                    String a = this.a.a(str);
                    if (a != null) {
                        J(obj, this.a.getProperty(str), a, obj2);
                        return;
                    }
                    throw new IllegalArgumentException("Invalid mapped property '" + str + "' on bean class '" + obj.getClass() + "'");
                } catch (IllegalArgumentException unused) {
                    throw new IllegalArgumentException("Invalid mapped property '" + str + "' on bean class '" + obj.getClass() + "'");
                }
            }
            throw new IllegalArgumentException("No name specified for bean class '" + obj.getClass() + "'");
        }
        throw new IllegalArgumentException("No bean specified");
    }

    public void J(Object obj, String str, String str2, Object obj2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        String name;
        if (obj == null) {
            throw new IllegalArgumentException("No bean specified");
        }
        if (str == null) {
            throw new IllegalArgumentException("No name specified for bean class '" + obj.getClass() + "'");
        } else if (str2 == null) {
            throw new IllegalArgumentException("No key specified for property '" + str + "' on bean class '" + obj.getClass() + "'");
        } else if (obj instanceof InterfaceC10878y80) {
            InterfaceC10878y80 interfaceC10878y80 = (InterfaceC10878y80) obj;
            if (interfaceC10878y80.d().p(str) == null) {
                throw new NoSuchMethodException("Unknown property '" + str + "' on bean class '" + obj.getClass() + "'");
            }
            interfaceC10878y80.f(str, str2, obj2);
        } else {
            PropertyDescriptor p = p(obj, str);
            if (p == null) {
                throw new NoSuchMethodException("Unknown property '" + str + "' on bean class '" + obj.getClass() + "'");
            } else if (p instanceof C7206j81) {
                Method f2 = C3250Ij1.f(obj.getClass(), ((C7206j81) p).f());
                if (f2 != null) {
                    Object[] objArr = {str2, obj2};
                    if (this.d.f()) {
                        if (obj2 == null) {
                            name = "<null>";
                        } else {
                            name = obj2.getClass().getName();
                        }
                        J31 j31 = this.d;
                        j31.r("setSimpleProperty: Invoking method " + f2 + " with key=" + str2 + ", value=" + obj2 + " (class " + name + C9811tl1.d);
                    }
                    B(f2, obj, objArr);
                    return;
                }
                throw new NoSuchMethodException("Property '" + str + "' has no mapped setter methodon bean class '" + obj.getClass() + "'");
            } else {
                Method w = w(obj.getClass(), p);
                if (w != null) {
                    Object B = B(w, obj, f);
                    if (B instanceof Map) {
                        Q(B).put(str2, obj2);
                        return;
                    }
                    return;
                }
                throw new NoSuchMethodException("Property '" + str + "' has no mapped getter method on bean class '" + obj.getClass() + "'");
            }
        }
    }

    public void K(Object obj, String str, Object obj2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Object y;
        if (obj != null) {
            if (str != null) {
                while (this.a.c(str)) {
                    String d = this.a.d(str);
                    if (obj instanceof Map) {
                        y = t((Map) obj, d);
                    } else if (this.a.b(d)) {
                        y = j(obj, d);
                    } else if (this.a.e(d)) {
                        y = f(obj, d);
                    } else {
                        y = y(obj, d);
                    }
                    if (y != null) {
                        str = this.a.remove(str);
                        obj = y;
                    } else {
                        throw new C8606op1("Null property value for '" + str + "' on bean class '" + obj.getClass() + "'");
                    }
                }
                if (obj instanceof Map) {
                    M(Q(obj), str, obj2);
                    return;
                } else if (this.a.b(str)) {
                    I(obj, str, obj2);
                    return;
                } else if (this.a.e(str)) {
                    H(obj, str, obj2);
                    return;
                } else {
                    O(obj, str, obj2);
                    return;
                }
            }
            throw new IllegalArgumentException("No name specified for bean class '" + obj.getClass() + "'");
        }
        throw new IllegalArgumentException("No bean specified");
    }

    public void L(Object obj, String str, Object obj2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        K(obj, str, obj2);
    }

    public void M(Map<String, Object> map, String str, Object obj) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        String property;
        if (this.a.b(str) && ((property = this.a.getProperty(str)) == null || property.length() == 0)) {
            str = this.a.a(str);
        }
        if (!this.a.e(str) && !this.a.b(str)) {
            map.put(str, obj);
            return;
        }
        throw new IllegalArgumentException("Indexed or mapped properties are not supported on objects of type Map: " + str);
    }

    public void N(InterfaceC5095aT1 interfaceC5095aT1) {
        if (interfaceC5095aT1 == null) {
            this.a = new C8163n00();
        } else {
            this.a = interfaceC5095aT1;
        }
    }

    public void O(Object obj, String str, Object obj2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        String name;
        if (obj != null) {
            if (str != null) {
                if (!this.a.c(str)) {
                    if (!this.a.e(str)) {
                        if (!this.a.b(str)) {
                            if (obj instanceof InterfaceC10878y80) {
                                InterfaceC10878y80 interfaceC10878y80 = (InterfaceC10878y80) obj;
                                if (interfaceC10878y80.d().p(str) != null) {
                                    interfaceC10878y80.k(str, obj2);
                                    return;
                                }
                                throw new NoSuchMethodException("Unknown property '" + str + "' on dynaclass '" + interfaceC10878y80.d() + "'");
                            }
                            PropertyDescriptor p = p(obj, str);
                            if (p != null) {
                                Method A = A(obj.getClass(), p);
                                if (A != null) {
                                    Object[] objArr = {obj2};
                                    if (this.d.f()) {
                                        if (obj2 == null) {
                                            name = "<null>";
                                        } else {
                                            name = obj2.getClass().getName();
                                        }
                                        J31 j31 = this.d;
                                        j31.r("setSimpleProperty: Invoking method " + A + " with value " + obj2 + " (class " + name + C9811tl1.d);
                                    }
                                    B(A, obj, objArr);
                                    return;
                                }
                                throw new NoSuchMethodException("Property '" + str + "' has no setter method in class '" + obj.getClass() + "'");
                            }
                            throw new NoSuchMethodException("Unknown property '" + str + "' on class '" + obj.getClass() + "'");
                        }
                        throw new IllegalArgumentException("Mapped property names are not allowed: Property '" + str + "' on bean class '" + obj.getClass() + "'");
                    }
                    throw new IllegalArgumentException("Indexed property names are not allowed: Property '" + str + "' on bean class '" + obj.getClass() + "'");
                }
                throw new IllegalArgumentException("Nested property names are not allowed: Property '" + str + "' on bean class '" + obj.getClass() + "'");
            }
            throw new IllegalArgumentException("No name specified for bean class '" + obj.getClass() + "'");
        }
        throw new IllegalArgumentException("No bean specified");
    }

    public void a(InterfaceC10056um interfaceC10056um) {
        if (interfaceC10056um != null) {
            this.e.add(interfaceC10056um);
            return;
        }
        throw new IllegalArgumentException("BeanIntrospector must not be null!");
    }

    public void b() {
        this.b.clear();
        this.c.clear();
        Introspector.flushCaches();
    }

    public void c(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        if (obj != null) {
            if (obj2 != null) {
                int i = 0;
                if (obj2 instanceof InterfaceC10878y80) {
                    C80[] e = ((InterfaceC10878y80) obj2).d().e();
                    int length = e.length;
                    while (i < length) {
                        String b = e[i].b();
                        if (C(obj2, b) && D(obj, b)) {
                            try {
                                Object m = ((InterfaceC10878y80) obj2).m(b);
                                if (obj instanceof InterfaceC10878y80) {
                                    ((InterfaceC10878y80) obj).k(b, m);
                                } else {
                                    O(obj, b, m);
                                }
                            } catch (NoSuchMethodException e2) {
                                if (this.d.c()) {
                                    J31 j31 = this.d;
                                    j31.l("Error writing to '" + b + "' on class '" + obj.getClass() + "'", e2);
                                }
                            }
                        }
                        i++;
                    }
                    return;
                } else if (obj2 instanceof Map) {
                    for (Map.Entry entry : ((Map) obj2).entrySet()) {
                        String str = (String) entry.getKey();
                        if (D(obj, str)) {
                            try {
                                if (obj instanceof InterfaceC10878y80) {
                                    ((InterfaceC10878y80) obj).k(str, entry.getValue());
                                } else {
                                    O(obj, str, entry.getValue());
                                }
                            } catch (NoSuchMethodException e3) {
                                if (this.d.c()) {
                                    J31 j312 = this.d;
                                    j312.l("Error writing to '" + str + "' on class '" + obj.getClass() + "'", e3);
                                }
                            }
                        }
                    }
                    return;
                } else {
                    PropertyDescriptor[] r = r(obj2);
                    int length2 = r.length;
                    while (i < length2) {
                        String name = r[i].getName();
                        if (C(obj2, name) && D(obj, name)) {
                            try {
                                Object y = y(obj2, name);
                                if (obj instanceof InterfaceC10878y80) {
                                    ((InterfaceC10878y80) obj).k(name, y);
                                } else {
                                    O(obj, name, y);
                                }
                            } catch (NoSuchMethodException e4) {
                                if (this.d.c()) {
                                    J31 j313 = this.d;
                                    j313.l("Error writing to '" + name + "' on class '" + obj.getClass() + "'", e4);
                                }
                            }
                        }
                        i++;
                    }
                    return;
                }
            }
            throw new IllegalArgumentException("No origin bean specified");
        }
        throw new IllegalArgumentException("No destination bean specified");
    }

    public Map<String, Object> d(Object obj) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        if (obj != null) {
            HashMap hashMap = new HashMap();
            int i = 0;
            if (obj instanceof InterfaceC10878y80) {
                C80[] e = ((InterfaceC10878y80) obj).d().e();
                int length = e.length;
                while (i < length) {
                    String b = e[i].b();
                    hashMap.put(b, o(obj, b));
                    i++;
                }
            } else {
                PropertyDescriptor[] r = r(obj);
                int length2 = r.length;
                while (i < length2) {
                    PropertyDescriptor propertyDescriptor = r[i];
                    String name = propertyDescriptor.getName();
                    if (propertyDescriptor.getReadMethod() != null) {
                        hashMap.put(name, o(obj, name));
                    }
                    i++;
                }
            }
            return hashMap;
        }
        throw new IllegalArgumentException("No bean specified");
    }

    public final C9813tm e(Class<?> cls) {
        C9519sZ c9519sZ = new C9519sZ(cls);
        for (InterfaceC10056um interfaceC10056um : this.e) {
            try {
                interfaceC10056um.a(c9519sZ);
            } catch (IntrospectionException e) {
                this.d.g("Exception during introspection", e);
            }
        }
        return new C9813tm(c9519sZ.a());
    }

    public Object f(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        if (obj != null) {
            if (str != null) {
                try {
                    int index = this.a.getIndex(str);
                    if (index >= 0) {
                        return g(obj, this.a.getProperty(str), index);
                    }
                    throw new IllegalArgumentException("Invalid indexed property '" + str + "' on bean class '" + obj.getClass() + "'");
                } catch (IllegalArgumentException e) {
                    throw new IllegalArgumentException("Invalid indexed property '" + str + "' on bean class '" + obj.getClass() + "' " + e.getMessage());
                }
            }
            throw new IllegalArgumentException("No name specified for bean class '" + obj.getClass() + "'");
        }
        throw new IllegalArgumentException("No bean specified");
    }

    public Object g(Object obj, String str, int i) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        if (obj != null) {
            if (str == null || str.length() == 0) {
                if (obj.getClass().isArray()) {
                    return Array.get(obj, i);
                }
                if (obj instanceof List) {
                    return ((List) obj).get(i);
                }
            }
            if (str != null) {
                if (obj instanceof InterfaceC10878y80) {
                    InterfaceC10878y80 interfaceC10878y80 = (InterfaceC10878y80) obj;
                    if (interfaceC10878y80.d().p(str) != null) {
                        return interfaceC10878y80.h(str, i);
                    }
                    throw new NoSuchMethodException("Unknown property '" + str + "' on bean class '" + obj.getClass() + "'");
                }
                IndexedPropertyDescriptor p = p(obj, str);
                if (p != null) {
                    if (p instanceof IndexedPropertyDescriptor) {
                        Method f2 = C3250Ij1.f(obj.getClass(), p.getIndexedReadMethod());
                        if (f2 != null) {
                            try {
                                return B(f2, obj, new Object[]{new Integer(i)});
                            } catch (InvocationTargetException e) {
                                if (e.getTargetException() instanceof IndexOutOfBoundsException) {
                                    throw ((IndexOutOfBoundsException) e.getTargetException());
                                }
                                throw e;
                            }
                        }
                    }
                    Method w = w(obj.getClass(), p);
                    if (w != null) {
                        Object B = B(w, obj, f);
                        if (!B.getClass().isArray()) {
                            if (B instanceof List) {
                                return ((List) B).get(i);
                            }
                            throw new IllegalArgumentException("Property '" + str + "' is not indexed on bean class '" + obj.getClass() + "'");
                        }
                        try {
                            return Array.get(B, i);
                        } catch (ArrayIndexOutOfBoundsException unused) {
                            throw new ArrayIndexOutOfBoundsException("Index: " + i + ", Size: " + Array.getLength(B) + " for property '" + str + "'");
                        }
                    }
                    throw new NoSuchMethodException("Property '" + str + "' has no getter method on bean class '" + obj.getClass() + "'");
                }
                throw new NoSuchMethodException("Unknown property '" + str + "' on bean class '" + obj.getClass() + "'");
            }
            throw new IllegalArgumentException("No name specified for bean class '" + obj.getClass() + "'");
        }
        throw new IllegalArgumentException("No bean specified");
    }

    public final C9813tm i(Class<?> cls) {
        if (cls != null) {
            C9813tm c9813tm = this.b.get(cls);
            if (c9813tm == null) {
                C9813tm e = e(cls);
                this.b.put(cls, e);
                return e;
            }
            return c9813tm;
        }
        throw new IllegalArgumentException("No bean class specified");
    }

    public Object j(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        if (obj != null) {
            if (str != null) {
                try {
                    String a = this.a.a(str);
                    if (a != null) {
                        return k(obj, this.a.getProperty(str), a);
                    }
                    throw new IllegalArgumentException("Invalid mapped property '" + str + "' on bean class '" + obj.getClass() + "'");
                } catch (IllegalArgumentException e) {
                    throw new IllegalArgumentException("Invalid mapped property '" + str + "' on bean class '" + obj.getClass() + "' " + e.getMessage());
                }
            }
            throw new IllegalArgumentException("No name specified for bean class '" + obj.getClass() + "'");
        }
        throw new IllegalArgumentException("No bean specified");
    }

    public Object k(Object obj, String str, String str2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        if (obj != null) {
            if (str != null) {
                if (str2 != null) {
                    if (obj instanceof InterfaceC10878y80) {
                        InterfaceC10878y80 interfaceC10878y80 = (InterfaceC10878y80) obj;
                        if (interfaceC10878y80.d().p(str) != null) {
                            return interfaceC10878y80.c(str, str2);
                        }
                        throw new NoSuchMethodException("Unknown property '" + str + "'+ on bean class '" + obj.getClass() + "'");
                    }
                    PropertyDescriptor p = p(obj, str);
                    if (p != null) {
                        if (p instanceof C7206j81) {
                            Method f2 = C3250Ij1.f(obj.getClass(), ((C7206j81) p).e());
                            if (f2 != null) {
                                return B(f2, obj, new Object[]{str2});
                            }
                            throw new NoSuchMethodException("Property '" + str + "' has no mapped getter method on bean class '" + obj.getClass() + "'");
                        }
                        Method w = w(obj.getClass(), p);
                        if (w != null) {
                            Object B = B(w, obj, f);
                            if (B instanceof Map) {
                                return ((Map) B).get(str2);
                            }
                            return null;
                        }
                        throw new NoSuchMethodException("Property '" + str + "' has no mapped getter method on bean class '" + obj.getClass() + "'");
                    }
                    throw new NoSuchMethodException("Unknown property '" + str + "'+ on bean class '" + obj.getClass() + "'");
                }
                throw new IllegalArgumentException("No key specified for property '" + str + "' on bean class " + obj.getClass() + "'");
            }
            throw new IllegalArgumentException("No name specified for bean class '" + obj.getClass() + "'");
        }
        throw new IllegalArgumentException("No bean specified");
    }

    @Deprecated
    public C9818tn0 l(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return this.c.get(cls);
    }

    @Deprecated
    public C9818tn0 m(Object obj) {
        if (obj == null) {
            return null;
        }
        return l(obj.getClass());
    }

    public Object n(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Object y;
        if (obj != null) {
            if (str != null) {
                while (this.a.c(str)) {
                    String d = this.a.d(str);
                    if (obj instanceof Map) {
                        y = t((Map) obj, d);
                    } else if (this.a.b(d)) {
                        y = j(obj, d);
                    } else if (this.a.e(d)) {
                        y = f(obj, d);
                    } else {
                        y = y(obj, d);
                    }
                    if (y != null) {
                        str = this.a.remove(str);
                        obj = y;
                    } else {
                        throw new C8606op1("Null property value for '" + str + "' on bean class '" + obj.getClass() + "'");
                    }
                }
                if (obj instanceof Map) {
                    return t((Map) obj, str);
                }
                if (this.a.b(str)) {
                    return j(obj, str);
                }
                if (this.a.e(str)) {
                    return f(obj, str);
                }
                return y(obj, str);
            }
            throw new IllegalArgumentException("No name specified for bean class '" + obj.getClass() + "'");
        }
        throw new IllegalArgumentException("No bean specified");
    }

    public Object o(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return n(obj, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [o.tn0] */
    public PropertyDescriptor p(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        if (obj != null) {
            if (str != null) {
                while (this.a.c(str)) {
                    String d = this.a.d(str);
                    Object o2 = o(obj, d);
                    if (o2 != null) {
                        str = this.a.remove(str);
                        obj = o2;
                    } else {
                        throw new C8606op1("Null property value for '" + d + "' on bean class '" + obj.getClass() + "'");
                    }
                }
                String property = this.a.getProperty(str);
                if (property == null) {
                    return null;
                }
                PropertyDescriptor a = i(obj.getClass()).a(property);
                if (a != null) {
                    return a;
                }
                C9818tn0 m = m(obj);
                if (m == null) {
                    m = new C9818tn0();
                    m.c(true);
                    this.c.put(obj.getClass(), m);
                }
                PropertyDescriptor propertyDescriptor = (PropertyDescriptor) m.get(property);
                if (propertyDescriptor == null) {
                    try {
                        propertyDescriptor = new C7206j81(property, obj.getClass());
                    } catch (IntrospectionException unused) {
                    }
                    if (propertyDescriptor != null) {
                        m.put(property, propertyDescriptor);
                    }
                }
                return propertyDescriptor;
            }
            throw new IllegalArgumentException("No name specified for bean class '" + obj.getClass() + "'");
        }
        throw new IllegalArgumentException("No bean specified");
    }

    public PropertyDescriptor[] q(Class<?> cls) {
        return i(cls).b();
    }

    public PropertyDescriptor[] r(Object obj) {
        if (obj != null) {
            return q(obj.getClass());
        }
        throw new IllegalArgumentException("No bean specified");
    }

    public Class<?> s(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        if (obj != null) {
            if (str != null) {
                PropertyDescriptor p = p(obj, str);
                if (p != null) {
                    return p.getPropertyEditorClass();
                }
                return null;
            }
            throw new IllegalArgumentException("No name specified for bean class '" + obj.getClass() + "'");
        }
        throw new IllegalArgumentException("No bean specified");
    }

    public Object t(Map<?, ?> map, String str) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        String property;
        if (this.a.b(str) && ((property = this.a.getProperty(str)) == null || property.length() == 0)) {
            str = this.a.a(str);
        }
        if (!this.a.e(str) && !this.a.b(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Indexed or mapped properties are not supported on objects of type Map: " + str);
    }

    public Class<?> u(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Class<?> c;
        if (obj != null) {
            if (str != null) {
                while (this.a.c(str)) {
                    String d = this.a.d(str);
                    Object o2 = o(obj, d);
                    if (o2 != null) {
                        str = this.a.remove(str);
                        obj = o2;
                    } else {
                        throw new C8606op1("Null property value for '" + d + "' on bean class '" + obj.getClass() + "'");
                    }
                }
                String property = this.a.getProperty(str);
                if (obj instanceof InterfaceC10878y80) {
                    C80 p = ((InterfaceC10878y80) obj).d().p(property);
                    if (p == null || (c = p.c()) == null) {
                        return null;
                    }
                    if (c.isArray()) {
                        return c.getComponentType();
                    }
                    return c;
                }
                IndexedPropertyDescriptor p2 = p(obj, property);
                if (p2 == null) {
                    return null;
                }
                if (p2 instanceof IndexedPropertyDescriptor) {
                    return p2.getIndexedPropertyType();
                }
                if (p2 instanceof C7206j81) {
                    return ((C7206j81) p2).d();
                }
                return p2.getPropertyType();
            }
            throw new IllegalArgumentException("No name specified for bean class '" + obj.getClass() + "'");
        }
        throw new IllegalArgumentException("No bean specified");
    }

    public Method v(PropertyDescriptor propertyDescriptor) {
        return C3250Ij1.g(propertyDescriptor.getReadMethod());
    }

    public Method w(Class<?> cls, PropertyDescriptor propertyDescriptor) {
        return C3250Ij1.f(cls, propertyDescriptor.getReadMethod());
    }

    public InterfaceC5095aT1 x() {
        return this.a;
    }

    public Object y(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        if (obj != null) {
            if (str != null) {
                if (!this.a.c(str)) {
                    if (!this.a.e(str)) {
                        if (!this.a.b(str)) {
                            if (obj instanceof InterfaceC10878y80) {
                                InterfaceC10878y80 interfaceC10878y80 = (InterfaceC10878y80) obj;
                                if (interfaceC10878y80.d().p(str) != null) {
                                    return interfaceC10878y80.m(str);
                                }
                                throw new NoSuchMethodException("Unknown property '" + str + "' on dynaclass '" + interfaceC10878y80.d() + "'");
                            }
                            PropertyDescriptor p = p(obj, str);
                            if (p != null) {
                                Method w = w(obj.getClass(), p);
                                if (w != null) {
                                    return B(w, obj, f);
                                }
                                throw new NoSuchMethodException("Property '" + str + "' has no getter method in class '" + obj.getClass() + "'");
                            }
                            throw new NoSuchMethodException("Unknown property '" + str + "' on class '" + obj.getClass() + "'");
                        }
                        throw new IllegalArgumentException("Mapped property names are not allowed: Property '" + str + "' on bean class '" + obj.getClass() + "'");
                    }
                    throw new IllegalArgumentException("Indexed property names are not allowed: Property '" + str + "' on bean class '" + obj.getClass() + "'");
                }
                throw new IllegalArgumentException("Nested property names are not allowed: Property '" + str + "' on bean class '" + obj.getClass() + "'");
            }
            throw new IllegalArgumentException("No name specified for bean class '" + obj.getClass() + "'");
        }
        throw new IllegalArgumentException("No bean specified");
    }

    public Method z(PropertyDescriptor propertyDescriptor) {
        return C3250Ij1.g(propertyDescriptor.getWriteMethod());
    }
}
