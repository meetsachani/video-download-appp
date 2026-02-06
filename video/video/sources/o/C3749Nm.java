package o;

import java.beans.IndexedPropertyDescriptor;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.Nm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3749Nm {
    public static final C9715tM<C3749Nm> d = new a();
    public static final Method e = l();
    public final J31 a;
    public final C6780hN b;
    public final NJ1 c;

    /* renamed from: o.Nm$a */
    /* loaded from: classes4.dex */
    public static class a extends C9715tM<C3749Nm> {
        @Override // o.C9715tM
        /* renamed from: f */
        public C3749Nm b() {
            return new C3749Nm();
        }
    }

    public C3749Nm() {
        this(new C6780hN(), new NJ1());
    }

    public static Class<?> g(C80 c80, Object obj) {
        if (!c80.e()) {
            return c80.c();
        }
        if (obj == null) {
            return String.class;
        }
        return obj.getClass();
    }

    public static Method l() {
        try {
            return Throwable.class.getMethod("initCause", Throwable.class);
        } catch (NoSuchMethodException unused) {
            J31 q = U31.q(C3651Mm.class);
            if (q.b()) {
                q.q("Throwable does not have initCause() method in JDK 1.3");
            }
            return null;
        } catch (Throwable th) {
            J31 q2 = U31.q(C3651Mm.class);
            if (q2.b()) {
                q2.o("Error getting the Throwable initCause() method", th);
            }
            return null;
        }
    }

    public static C3749Nm m() {
        return d.a();
    }

    public static void v(C3749Nm c3749Nm) {
        d.c(c3749Nm);
    }

    public Object a(Object obj) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        Object newInstance;
        if (this.a.c()) {
            J31 j31 = this.a;
            j31.a("Cloning bean: " + obj.getClass().getName());
        }
        if (obj instanceof InterfaceC10878y80) {
            newInstance = ((InterfaceC10878y80) obj).d().b();
        } else {
            newInstance = obj.getClass().newInstance();
        }
        r().c(newInstance, obj);
        return newInstance;
    }

    public Object b(Object obj, Class<?> cls) {
        InterfaceC7507kN p = i().p(cls);
        if (p != null) {
            J31 j31 = this.a;
            j31.r("        USING CONVERTER " + p);
            return p.b(cls, obj);
        }
        return obj;
    }

    public final Object c(Object obj, Class<?> cls) {
        if (obj != null) {
            return b(obj, cls);
        }
        return obj;
    }

    public void d(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        if (obj != null) {
            if (obj2 != null) {
                if (this.a.c()) {
                    J31 j31 = this.a;
                    j31.a("BeanUtils.copyProperties(" + obj + C6566gU0.h + obj2 + C9811tl1.d);
                }
                int i = 0;
                if (obj2 instanceof InterfaceC10878y80) {
                    InterfaceC10878y80 interfaceC10878y80 = (InterfaceC10878y80) obj2;
                    C80[] e2 = interfaceC10878y80.d().e();
                    int length = e2.length;
                    while (i < length) {
                        String b = e2[i].b();
                        if (r().C(obj2, b) && r().D(obj, b)) {
                            e(obj, b, interfaceC10878y80.m(b));
                        }
                        i++;
                    }
                    return;
                } else if (obj2 instanceof Map) {
                    for (Map.Entry entry : ((Map) obj2).entrySet()) {
                        String str = (String) entry.getKey();
                        if (r().D(obj, str)) {
                            e(obj, str, entry.getValue());
                        }
                    }
                    return;
                } else {
                    PropertyDescriptor[] r = r().r(obj2);
                    int length2 = r.length;
                    while (i < length2) {
                        String name = r[i].getName();
                        if (!com.facebook.applinks.c.f.equals(name) && r().C(obj2, name) && r().D(obj, name)) {
                            try {
                                e(obj, name, r().y(obj2, name));
                            } catch (NoSuchMethodException unused) {
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

    public void e(Object obj, String str, Object obj2) throws IllegalAccessException, InvocationTargetException {
        Class<?> propertyType;
        if (this.a.f()) {
            StringBuilder sb = new StringBuilder("  copyProperty(");
            sb.append(obj);
            sb.append(C6566gU0.h);
            sb.append(str);
            sb.append(C6566gU0.h);
            if (obj2 == null) {
                sb.append("<NULL>");
            } else if (obj2 instanceof String) {
                sb.append((String) obj2);
            } else if (obj2 instanceof String[]) {
                String[] strArr = (String[]) obj2;
                sb.append('[');
                for (int i = 0; i < strArr.length; i++) {
                    if (i > 0) {
                        sb.append(',');
                    }
                    sb.append(strArr[i]);
                }
                sb.append(']');
            } else {
                sb.append(obj2.toString());
            }
            sb.append(')');
            this.a.r(sb.toString());
        }
        InterfaceC5095aT1 x = r().x();
        while (x.c(str)) {
            try {
                obj = r().o(obj, x.d(str));
                str = x.remove(str);
            } catch (NoSuchMethodException unused) {
                return;
            }
        }
        if (this.a.f()) {
            J31 j31 = this.a;
            j31.r("    Target bean = " + obj);
            J31 j312 = this.a;
            j312.r("    Target name = " + str);
        }
        String property = x.getProperty(str);
        int index = x.getIndex(str);
        String a2 = x.a(str);
        if (obj instanceof InterfaceC10878y80) {
            C80 p = ((InterfaceC10878y80) obj).d().p(property);
            if (p != null) {
                propertyType = g(p, obj2);
            } else {
                return;
            }
        } else {
            PropertyDescriptor p2 = r().p(obj, str);
            if (p2 != null) {
                propertyType = p2.getPropertyType();
                if (propertyType == null) {
                    if (this.a.f()) {
                        J31 j313 = this.a;
                        j313.r("    target type for property '" + property + "' is null, so skipping ths setter");
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        if (this.a.f()) {
            J31 j314 = this.a;
            j314.r("    target propName=" + property + ", type=" + propertyType + ", index=" + index + ", key=" + a2);
        }
        if (index >= 0) {
            try {
                r().G(obj, property, index, c(obj2, propertyType.getComponentType()));
            } catch (NoSuchMethodException e2) {
                throw new InvocationTargetException(e2, "Cannot set " + property);
            }
        } else if (a2 != null) {
            try {
                r().J(obj, property, a2, obj2);
            } catch (NoSuchMethodException e3) {
                throw new InvocationTargetException(e3, "Cannot set " + property);
            }
        } else {
            try {
                r().O(obj, property, c(obj2, propertyType));
            } catch (NoSuchMethodException e4) {
                throw new InvocationTargetException(e4, "Cannot set " + property);
            }
        }
    }

    public Map<String, String> f(Object obj) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        if (obj == null) {
            return new HashMap();
        }
        if (this.a.c()) {
            J31 j31 = this.a;
            j31.a("Describing bean: " + obj.getClass().getName());
        }
        HashMap hashMap = new HashMap();
        int i = 0;
        if (obj instanceof InterfaceC10878y80) {
            C80[] e2 = ((InterfaceC10878y80) obj).d().e();
            int length = e2.length;
            while (i < length) {
                String b = e2[i].b();
                hashMap.put(b, q(obj, b));
                i++;
            }
        } else {
            PropertyDescriptor[] r = r().r(obj);
            Class<?> cls = obj.getClass();
            int length2 = r.length;
            while (i < length2) {
                PropertyDescriptor propertyDescriptor = r[i];
                String name = propertyDescriptor.getName();
                if (r().w(cls, propertyDescriptor) != null) {
                    hashMap.put(name, q(obj, name));
                }
                i++;
            }
        }
        return hashMap;
    }

    public String[] h(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Object o2 = r().o(obj, str);
        if (o2 == null) {
            return null;
        }
        if (o2 instanceof Collection) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Collection) o2) {
                if (obj2 == null) {
                    arrayList.add(null);
                } else {
                    arrayList.add(i().d(obj2));
                }
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        } else if (o2.getClass().isArray()) {
            int length = Array.getLength(o2);
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                Object obj3 = Array.get(o2, i);
                if (obj3 == null) {
                    strArr[i] = null;
                } else {
                    strArr[i] = i().d(obj3);
                }
            }
            return strArr;
        } else {
            return new String[]{i().d(o2)};
        }
    }

    public C6780hN i() {
        return this.b;
    }

    public String j(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return i().d(r().f(obj, str));
    }

    public String k(Object obj, String str, int i) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return i().d(r().g(obj, str, i));
    }

    public String n(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return i().d(r().j(obj, str));
    }

    public String o(Object obj, String str, String str2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return i().d(r().k(obj, str, str2));
    }

    public String p(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return i().d(r().n(obj, str));
    }

    public String q(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return p(obj, str);
    }

    public NJ1 r() {
        return this.c;
    }

    public String s(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return i().d(r().y(obj, str));
    }

    public boolean t(Throwable th, Throwable th2) {
        Method method = e;
        if (method != null && th2 != null) {
            try {
                method.invoke(th, th2);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public void u(Object obj, Map<String, ? extends Object> map) throws IllegalAccessException, InvocationTargetException {
        if (obj != null && map != null) {
            if (this.a.c()) {
                J31 j31 = this.a;
                j31.a("BeanUtils.populate(" + obj + C6566gU0.h + map + C9811tl1.d);
            }
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    w(obj, key, entry.getValue());
                }
            }
        }
    }

    public void w(Object obj, String str, Object obj2) throws IllegalAccessException, InvocationTargetException {
        Object b;
        if (this.a.f()) {
            StringBuilder sb = new StringBuilder("  setProperty(");
            sb.append(obj);
            sb.append(C6566gU0.h);
            sb.append(str);
            sb.append(C6566gU0.h);
            if (obj2 == null) {
                sb.append("<NULL>");
            } else if (obj2 instanceof String) {
                sb.append((String) obj2);
            } else if (obj2 instanceof String[]) {
                String[] strArr = (String[]) obj2;
                sb.append('[');
                for (int i = 0; i < strArr.length; i++) {
                    if (i > 0) {
                        sb.append(',');
                    }
                    sb.append(strArr[i]);
                }
                sb.append(']');
            } else {
                sb.append(obj2.toString());
            }
            sb.append(')');
            this.a.r(sb.toString());
        }
        InterfaceC5095aT1 x = r().x();
        while (x.c(str)) {
            try {
                obj = r().o(obj, x.d(str));
                if (obj != null) {
                    str = x.remove(str);
                } else {
                    return;
                }
            } catch (NoSuchMethodException unused) {
                return;
            }
        }
        if (this.a.f()) {
            this.a.r("    Target bean = " + obj);
            this.a.r("    Target name = " + str);
        }
        String property = x.getProperty(str);
        int index = x.getIndex(str);
        String a2 = x.a(str);
        Class<?> cls = Object.class;
        if (obj instanceof InterfaceC10878y80) {
            C80 p = ((InterfaceC10878y80) obj).d().p(property);
            if (p != null) {
                Class<?> g = g(p, obj2);
                if (index < 0 || !List.class.isAssignableFrom(g)) {
                    cls = g;
                }
            } else {
                return;
            }
        } else if (!(obj instanceof Map)) {
            if (obj != null && obj.getClass().isArray() && index >= 0) {
                cls = Array.get(obj, index).getClass();
            } else {
                IndexedPropertyDescriptor p2 = r().p(obj, str);
                if (p2 != null) {
                    if (p2 instanceof C7206j81) {
                        C7206j81 c7206j81 = (C7206j81) p2;
                        if (c7206j81.f() == null) {
                            if (this.a.c()) {
                                this.a.a("Skipping read-only property");
                                return;
                            }
                            return;
                        }
                        cls = c7206j81.d();
                    } else if (index >= 0 && (p2 instanceof IndexedPropertyDescriptor)) {
                        IndexedPropertyDescriptor indexedPropertyDescriptor = p2;
                        if (indexedPropertyDescriptor.getIndexedWriteMethod() == null) {
                            if (this.a.c()) {
                                this.a.a("Skipping read-only property");
                                return;
                            }
                            return;
                        }
                        cls = indexedPropertyDescriptor.getIndexedPropertyType();
                    } else if (index < 0 || !List.class.isAssignableFrom(p2.getPropertyType())) {
                        if (a2 != null) {
                            if (p2.getReadMethod() == null) {
                                if (this.a.c()) {
                                    this.a.a("Skipping read-only property");
                                    return;
                                }
                                return;
                            } else if (obj2 != null) {
                                cls = obj2.getClass();
                            }
                        } else if (p2.getWriteMethod() == null) {
                            if (this.a.c()) {
                                this.a.a("Skipping read-only property");
                                return;
                            }
                            return;
                        } else {
                            cls = p2.getPropertyType();
                        }
                    }
                } else {
                    return;
                }
            }
        }
        if (cls.isArray() && index < 0) {
            if (obj2 == null) {
                b = i().c(new String[]{null}, cls);
            } else if (obj2 instanceof String) {
                b = i().a(obj2, cls);
            } else if (obj2 instanceof String[]) {
                b = i().c((String[]) obj2, cls);
            } else {
                b = b(obj2, cls);
            }
        } else if (cls.isArray()) {
            if (!(obj2 instanceof String) && obj2 != null) {
                if (obj2 instanceof String[]) {
                    b = i().b(((String[]) obj2)[0], cls.getComponentType());
                } else {
                    b = b(obj2, cls.getComponentType());
                }
            } else {
                b = i().b((String) obj2, cls.getComponentType());
            }
        } else if (obj2 instanceof String) {
            b = i().b((String) obj2, cls);
        } else if (obj2 instanceof String[]) {
            b = i().b(((String[]) obj2)[0], cls);
        } else {
            b = b(obj2, cls);
        }
        try {
            r().L(obj, str, b);
        } catch (NoSuchMethodException e2) {
            throw new InvocationTargetException(e2, "Cannot set " + property);
        }
    }

    public C3749Nm(C6780hN c6780hN) {
        this(c6780hN, new NJ1());
    }

    public C3749Nm(C6780hN c6780hN, NJ1 nj1) {
        this.a = U31.q(C3651Mm.class);
        this.b = c6780hN;
        this.c = nj1;
    }
}
