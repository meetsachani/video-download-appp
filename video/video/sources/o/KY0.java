package o;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class KY0 implements InterfaceC10878y80, Serializable {
    public static final BigInteger Z0 = new BigInteger("0");
    public static final BigDecimal a1 = new BigDecimal("0");
    public static final Character b1 = new Character(' ');
    public static final Byte c1 = new Byte((byte) 0);
    public static final Short d1 = new Short((short) 0);
    public static final Integer e1 = new Integer(0);
    public static final Long f1 = new Long(0);
    public static final Float g1 = new Float(0.0f);
    public static final Double h1 = new Double(0.0d);
    public transient J31 X;
    public Map<String, Object> Y;
    public InterfaceC4240Sm1 Y0;
    public transient Map<String, Object> Z;

    public KY0() {
        this(new LY0());
    }

    public Object A(String str, Object obj, int i) {
        int length;
        Object obj2;
        if (obj instanceof List) {
            List list = (List) obj;
            while (i >= list.size()) {
                Class<?> a = d().p(str).a();
                if (a != null) {
                    obj2 = w(str + C6566gU0.f + list.size() + C6566gU0.g, a);
                } else {
                    obj2 = null;
                }
                list.add(obj2);
            }
        }
        if (obj.getClass().isArray() && i >= (length = Array.getLength(obj))) {
            Class<?> componentType = obj.getClass().getComponentType();
            Object newInstance = Array.newInstance(componentType, i + 1);
            System.arraycopy(obj, 0, newInstance, 0, length);
            k(str, newInstance);
            int length2 = Array.getLength(newInstance);
            while (length < length2) {
                Array.set(newInstance, length, w(str + C6566gU0.f + length + C6566gU0.g, componentType));
                length++;
            }
            return newInstance;
        }
        return obj;
    }

    public boolean B(Class<?> cls, Class<?> cls2) {
        if (!cls.isAssignableFrom(cls2)) {
            if (cls != Boolean.TYPE || cls2 != Boolean.class) {
                if (cls != Byte.TYPE || cls2 != Byte.class) {
                    if (cls != Character.TYPE || cls2 != Character.class) {
                        if (cls != Double.TYPE || cls2 != Double.class) {
                            if (cls != Float.TYPE || cls2 != Float.class) {
                                if (cls != Integer.TYPE || cls2 != Integer.class) {
                                    if (cls != Long.TYPE || cls2 != Long.class) {
                                        if (cls != Short.TYPE || cls2 != Short.class) {
                                            return false;
                                        }
                                        return true;
                                    }
                                    return true;
                                }
                                return true;
                            }
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public boolean C(String str) {
        if (str != null) {
            InterfaceC4240Sm1 interfaceC4240Sm1 = this.Y0;
            if (interfaceC4240Sm1 instanceof LY0) {
                return ((LY0) interfaceC4240Sm1).h(str);
            }
            if (interfaceC4240Sm1.p(str) == null) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("No property name specified");
    }

    public final J31 D() {
        if (this.X == null) {
            this.X = U31.q(KY0.class);
        }
        return this.X;
    }

    public Map<String, Object> E() {
        return new HashMap();
    }

    public int F(String str) {
        if (str != null) {
            Object obj = this.Y.get(str);
            if (obj == null) {
                return 0;
            }
            if (obj instanceof Map) {
                return ((Map) obj).size();
            }
            if (obj instanceof List) {
                return ((List) obj).size();
            }
            if (!obj.getClass().isArray()) {
                return 0;
            }
            return Array.getLength(obj);
        }
        throw new IllegalArgumentException("No property name specified");
    }

    @Override // o.InterfaceC10878y80
    public Object c(String str, String str2) {
        if (!C(str)) {
            k(str, y(str));
        }
        Object m = m(str);
        if (this.Y0.p(str).e()) {
            if (m instanceof Map) {
                return ((Map) m).get(str2);
            }
            throw new IllegalArgumentException("Non-mapped property for '" + str + C9811tl1.c + str2 + ")'" + m.getClass().getName());
        }
        throw new IllegalArgumentException("Non-mapped property for '" + str + C9811tl1.c + str2 + ")' " + this.Y0.p(str).c().getName());
    }

    @Override // o.InterfaceC10878y80
    public B80 d() {
        return this.Y0;
    }

    @Override // o.InterfaceC10878y80
    public void f(String str, String str2, Object obj) {
        if (!C(str)) {
            k(str, y(str));
        }
        Object m = m(str);
        if (this.Y0.p(str).e()) {
            ((Map) m).put(str2, obj);
            return;
        }
        throw new IllegalArgumentException("Non-mapped property for '" + str + C9811tl1.c + str2 + ")'" + this.Y0.p(str).c().getName());
    }

    @Override // o.InterfaceC10878y80
    public void g(String str, String str2) {
        if (str != null) {
            Object obj = this.Y.get(str);
            if (obj == null) {
                return;
            }
            if (obj instanceof Map) {
                ((Map) obj).remove(str2);
                return;
            }
            throw new IllegalArgumentException("Non-mapped property for '" + str + C9811tl1.c + str2 + ")'" + obj.getClass().getName());
        }
        throw new IllegalArgumentException("No property name specified");
    }

    @Override // o.InterfaceC10878y80
    public Object h(String str, int i) {
        if (!C(str)) {
            k(str, x(str));
        }
        Object m = m(str);
        if (this.Y0.p(str).d()) {
            Object A = A(str, m, i);
            if (A.getClass().isArray()) {
                return Array.get(A, i);
            }
            if (A instanceof List) {
                return ((List) A).get(i);
            }
            throw new IllegalArgumentException("Non-indexed property for '" + str + C6566gU0.f + i + "]' " + A.getClass().getName());
        }
        throw new IllegalArgumentException("Non-indexed property for '" + str + C6566gU0.f + i + "]' " + this.Y0.p(str).b());
    }

    @Override // o.InterfaceC10878y80
    public void j(String str, int i, Object obj) {
        if (!C(str)) {
            k(str, x(str));
        }
        Object m = m(str);
        if (this.Y0.p(str).d()) {
            Object A = A(str, m, i);
            if (A.getClass().isArray()) {
                Array.set(A, i, obj);
                return;
            } else if (A instanceof List) {
                ((List) A).set(i, obj);
                return;
            } else {
                throw new IllegalArgumentException("Non-indexed property for '" + str + C6566gU0.f + i + "]' " + A.getClass().getName());
            }
        }
        throw new IllegalArgumentException("Non-indexed property for '" + str + C6566gU0.f + i + "]'" + this.Y0.p(str).c().getName());
    }

    @Override // o.InterfaceC10878y80
    public void k(String str, Object obj) {
        if (!C(str)) {
            if (!this.Y0.l()) {
                if (obj == null) {
                    this.Y0.Q(str);
                } else {
                    this.Y0.n(str, obj.getClass());
                }
            } else {
                throw new IllegalArgumentException("Invalid property name '" + str + "' (DynaClass is restricted)");
            }
        }
        C80 p = this.Y0.p(str);
        if (obj == null) {
            if (p.c().isPrimitive()) {
                throw new NullPointerException("Primitive value for '" + str + "'");
            }
        } else if (!B(p.c(), obj.getClass())) {
            throw new WM("Cannot assign value of type '" + obj.getClass().getName() + "' to property '" + str + "' of type '" + p.c().getName() + "'");
        }
        this.Y.put(str, obj);
    }

    @Override // o.InterfaceC10878y80
    public Object m(String str) {
        if (str != null) {
            Object obj = this.Y.get(str);
            if (obj != null) {
                return obj;
            }
            if (!C(str)) {
                return null;
            }
            Object w = w(str, this.Y0.p(str).c());
            if (w != null) {
                k(str, w);
            }
            return w;
        }
        throw new IllegalArgumentException("No property name specified");
    }

    @Override // o.InterfaceC10878y80
    public boolean o(String str, String str2) {
        if (str != null) {
            Object obj = this.Y.get(str);
            if (obj == null || !(obj instanceof Map)) {
                return false;
            }
            return ((Map) obj).containsKey(str2);
        }
        throw new IllegalArgumentException("No property name specified");
    }

    public Object q(String str, Class<?> cls) {
        try {
            return cls.newInstance();
        } catch (Exception e) {
            if (D().b()) {
                J31 D = D();
                D.q("Error instantiating DynaBean property of type '" + cls.getName() + "' for '" + str + "' " + e);
                return null;
            }
            return null;
        }
    }

    public Object r(String str, Class<?> cls) {
        if (cls == null) {
            return x(str);
        }
        if (cls.isArray()) {
            return Array.newInstance(cls.getComponentType(), 0);
        }
        if (List.class.isAssignableFrom(cls)) {
            if (cls.isInterface()) {
                return x(str);
            }
            try {
                return cls.newInstance();
            } catch (Exception e) {
                throw new IllegalArgumentException("Error instantiating indexed property of type '" + cls.getName() + "' for '" + str + "' " + e);
            }
        }
        throw new IllegalArgumentException("Non-indexed property of type '" + cls.getName() + "' for '" + str + "'");
    }

    public Object s(String str, Class<?> cls) {
        if (cls == null) {
            return y(str);
        }
        if (cls.isInterface()) {
            return y(str);
        }
        if (Map.class.isAssignableFrom(cls)) {
            try {
                return cls.newInstance();
            } catch (Exception e) {
                throw new IllegalArgumentException("Error instantiating mapped property of type '" + cls.getName() + "' for '" + str + "' " + e);
            }
        }
        throw new IllegalArgumentException("Non-mapped property of type '" + cls.getName() + "' for '" + str + "'");
    }

    public Object t(String str, Class<?> cls) {
        return null;
    }

    public Object u(String str, Class<?> cls) {
        if (cls != Object.class && cls != String.class && cls != Boolean.class && cls != Character.class && !Date.class.isAssignableFrom(cls)) {
            try {
                return cls.newInstance();
            } catch (Exception e) {
                if (D().b()) {
                    J31 D = D();
                    D.q("Error instantiating property of type '" + cls.getName() + "' for '" + str + "' " + e);
                }
            }
        }
        return null;
    }

    public Object v(String str, Class<?> cls) {
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (cls == Integer.TYPE) {
            return e1;
        }
        if (cls == Long.TYPE) {
            return f1;
        }
        if (cls == Double.TYPE) {
            return h1;
        }
        if (cls == Float.TYPE) {
            return g1;
        }
        if (cls == Byte.TYPE) {
            return c1;
        }
        if (cls == Short.TYPE) {
            return d1;
        }
        if (cls == Character.TYPE) {
            return b1;
        }
        return null;
    }

    public Object w(String str, Class<?> cls) {
        if (cls == null) {
            return null;
        }
        if (!cls.isArray() && !List.class.isAssignableFrom(cls)) {
            if (Map.class.isAssignableFrom(cls)) {
                return s(str, cls);
            }
            if (InterfaceC10878y80.class.isAssignableFrom(cls)) {
                return q(str, cls);
            }
            if (cls.isPrimitive()) {
                return v(str, cls);
            }
            if (Number.class.isAssignableFrom(cls)) {
                return t(str, cls);
            }
            return u(str, cls);
        }
        return r(str, cls);
    }

    public Object x(String str) {
        return new ArrayList();
    }

    public Map<String, Object> y(String str) {
        return new HashMap();
    }

    public Map<String, Object> z() {
        if (this.Z == null) {
            this.Z = new A80(this);
        }
        return this.Z;
    }

    public KY0(String str) {
        this(new LY0(str));
    }

    public KY0(B80 b80) {
        this.X = U31.q(KY0.class);
        this.Y = E();
        if (b80 instanceof InterfaceC4240Sm1) {
            this.Y0 = (InterfaceC4240Sm1) b80;
        } else {
            this.Y0 = new LY0(b80.getName(), b80.e());
        }
    }
}
