package o;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.Xl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4719Xl implements InterfaceC10878y80, Serializable {
    public B80 X;
    public HashMap<String, Object> Y = new HashMap<>();
    public transient Map<String, Object> Z;

    public C4719Xl(B80 b80) {
        this.X = null;
        this.X = b80;
    }

    public C80 a(String str) {
        C80 p = d().p(str);
        if (p != null) {
            return p;
        }
        throw new IllegalArgumentException("Invalid property name '" + str + "'");
    }

    public Map<String, Object> b() {
        if (this.Z == null) {
            this.Z = new A80(this);
        }
        return this.Z;
    }

    @Override // o.InterfaceC10878y80
    public Object c(String str, String str2) {
        Object obj = this.Y.get(str);
        if (obj != null) {
            if (obj instanceof Map) {
                return ((Map) obj).get(str2);
            }
            throw new IllegalArgumentException("Non-mapped property for '" + str + C9811tl1.c + str2 + ")'");
        }
        throw new NullPointerException("No mapped value for '" + str + C9811tl1.c + str2 + ")'");
    }

    @Override // o.InterfaceC10878y80
    public B80 d() {
        return this.X;
    }

    public boolean e(Class<?> cls, Class<?> cls2) {
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

    @Override // o.InterfaceC10878y80
    public void f(String str, String str2, Object obj) {
        Object obj2 = this.Y.get(str);
        if (obj2 != null) {
            if (obj2 instanceof Map) {
                ((Map) obj2).put(str2, obj);
                return;
            }
            throw new IllegalArgumentException("Non-mapped property for '" + str + C9811tl1.c + str2 + ")'");
        }
        throw new NullPointerException("No mapped value for '" + str + C9811tl1.c + str2 + ")'");
    }

    @Override // o.InterfaceC10878y80
    public void g(String str, String str2) {
        Object obj = this.Y.get(str);
        if (obj != null) {
            if (obj instanceof Map) {
                ((Map) obj).remove(str2);
                return;
            }
            throw new IllegalArgumentException("Non-mapped property for '" + str + C9811tl1.c + str2 + ")'");
        }
        throw new NullPointerException("No mapped value for '" + str + C9811tl1.c + str2 + ")'");
    }

    @Override // o.InterfaceC10878y80
    public Object h(String str, int i) {
        Object obj = this.Y.get(str);
        if (obj != null) {
            if (obj.getClass().isArray()) {
                return Array.get(obj, i);
            }
            if (obj instanceof List) {
                return ((List) obj).get(i);
            }
            throw new IllegalArgumentException("Non-indexed property for '" + str + C6566gU0.f + i + "]'");
        }
        throw new NullPointerException("No indexed value for '" + str + C6566gU0.f + i + "]'");
    }

    @Override // o.InterfaceC10878y80
    public void j(String str, int i, Object obj) {
        Object obj2 = this.Y.get(str);
        if (obj2 != null) {
            if (obj2.getClass().isArray()) {
                Array.set(obj2, i, obj);
                return;
            } else if (obj2 instanceof List) {
                try {
                    ((List) obj2).set(i, obj);
                    return;
                } catch (ClassCastException e) {
                    throw new WM(e.getMessage());
                }
            } else {
                throw new IllegalArgumentException("Non-indexed property for '" + str + C6566gU0.f + i + "]'");
            }
        }
        throw new NullPointerException("No indexed value for '" + str + C6566gU0.f + i + "]'");
    }

    @Override // o.InterfaceC10878y80
    public void k(String str, Object obj) {
        C80 a = a(str);
        if (obj == null) {
            if (a.c().isPrimitive()) {
                throw new NullPointerException("Primitive value for '" + str + "'");
            }
        } else if (!e(a.c(), obj.getClass())) {
            throw new WM("Cannot assign value of type '" + obj.getClass().getName() + "' to property '" + str + "' of type '" + a.c().getName() + "'");
        }
        this.Y.put(str, obj);
    }

    @Override // o.InterfaceC10878y80
    public Object m(String str) {
        Object obj = this.Y.get(str);
        if (obj != null) {
            return obj;
        }
        Class<?> c = a(str).c();
        if (!c.isPrimitive()) {
            return obj;
        }
        if (c == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (c == Byte.TYPE) {
            return new Byte((byte) 0);
        }
        if (c == Character.TYPE) {
            return new Character((char) 0);
        }
        if (c == Double.TYPE) {
            return new Double(0.0d);
        }
        if (c == Float.TYPE) {
            return new Float(0.0f);
        }
        if (c == Integer.TYPE) {
            return new Integer(0);
        }
        if (c == Long.TYPE) {
            return new Long(0L);
        }
        if (c == Short.TYPE) {
            return new Short((short) 0);
        }
        return null;
    }

    @Override // o.InterfaceC10878y80
    public boolean o(String str, String str2) {
        Object obj = this.Y.get(str);
        if (obj != null) {
            if (obj instanceof Map) {
                return ((Map) obj).containsKey(str2);
            }
            throw new IllegalArgumentException("Non-mapped property for '" + str + C9811tl1.c + str2 + ")'");
        }
        throw new NullPointerException("No mapped value for '" + str + C9811tl1.c + str2 + ")'");
    }
}
