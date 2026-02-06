package o;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: o.j81  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7206j81 extends PropertyDescriptor {
    public static final Class<?>[] d = {String.class};
    public Reference<Class<?>> a;
    public a b;
    public a c;

    /* renamed from: o.j81$a */
    /* loaded from: classes4.dex */
    public static class a {
        public String a;
        public String b;
        public Reference<Method> c;
        public Reference<Class<?>> d;
        public Reference<Class<?>> e;
        public Reference<Class<?>> f;
        public String[] g;

        public a(Method method) {
            if (method != null) {
                this.a = method.getDeclaringClass().getName();
                this.b = method.getName();
                this.c = new SoftReference(method);
                this.d = new WeakReference(method.getDeclaringClass());
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 2) {
                    this.e = new WeakReference(parameterTypes[0]);
                    this.f = new WeakReference(parameterTypes[1]);
                    String[] strArr = new String[2];
                    this.g = strArr;
                    strArr[0] = parameterTypes[0].getName();
                    this.g[1] = parameterTypes[1].getName();
                }
            }
        }

        public final Method b() {
            Class<?>[] clsArr;
            Reference<Method> reference = this.c;
            if (reference == null) {
                return null;
            }
            Method method = reference.get();
            if (method == null) {
                Class<?> cls = this.d.get();
                if (cls == null && (cls = c()) != null) {
                    this.d = new WeakReference(cls);
                }
                if (cls != null) {
                    if (this.g == null) {
                        clsArr = C7206j81.d;
                    } else {
                        clsArr = new Class[2];
                        Class<?> cls2 = this.e.get();
                        clsArr[0] = cls2;
                        if (cls2 == null) {
                            Class<?> d = d(this.g[0]);
                            clsArr[0] = d;
                            if (d != null) {
                                this.e = new WeakReference(clsArr[0]);
                            }
                        }
                        Class<?> cls3 = this.f.get();
                        clsArr[1] = cls3;
                        if (cls3 == null) {
                            Class<?> d2 = d(this.g[1]);
                            clsArr[1] = d2;
                            if (d2 != null) {
                                this.f = new WeakReference(clsArr[1]);
                            }
                        }
                    }
                    try {
                        Method method2 = cls.getMethod(this.b, clsArr);
                        this.c = new SoftReference(method2);
                        return method2;
                    } catch (NoSuchMethodException unused) {
                        throw new RuntimeException("Method " + this.b + " for " + this.a + " could not be reconstructed - method not found");
                    }
                }
                throw new RuntimeException("Method " + this.b + " for " + this.a + " could not be reconstructed - class reference has gone");
            }
            return method;
        }

        public final Class<?> c() {
            return d(this.a);
        }

        public final Class<?> d(String str) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                try {
                    return contextClassLoader.loadClass(str);
                } catch (ClassNotFoundException unused) {
                }
            }
            try {
                return C7206j81.class.getClassLoader().loadClass(str);
            } catch (ClassNotFoundException unused2) {
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C7206j81(String str, Class<?> cls) throws IntrospectionException {
        super(str, (Method) null, (Method) null);
        Method method;
        Method method2 = null;
        if (str != null && str.length() != 0) {
            setName(str);
            String b = b(str);
            try {
                try {
                    method = h(cls, "get" + b, d);
                } catch (IntrospectionException unused) {
                    method = h(cls, "is" + b, d);
                }
            } catch (IntrospectionException unused2) {
                method = null;
                if (method == null) {
                }
                if (method != null) {
                }
                this.b = new a(method);
                this.c = new a(method2);
                c();
            }
            try {
                h(cls, C10829xw0.c + b, new Class[]{String.class, method.getReturnType()});
            } catch (IntrospectionException unused3) {
                if (method == null) {
                    method2 = g(cls, C10829xw0.c + b, 2);
                }
                if (method != null && method2 == null) {
                    throw new IntrospectionException("Property '" + str + "' not found on " + cls.getName());
                }
                this.b = new a(method);
                this.c = new a(method2);
                c();
            }
        } else {
            throw new IntrospectionException("bad property name: " + str + " on class: " + cls.getClass().getName());
        }
    }

    public static String b(String str) {
        if (str.length() == 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        charArray[0] = Character.toUpperCase(charArray[0]);
        return new String(charArray);
    }

    public static Method g(Class<?> cls, String str, int i) throws IntrospectionException {
        if (str == null) {
            return null;
        }
        Method i2 = i(cls, str, i);
        if (i2 != null) {
            return i2;
        }
        throw new IntrospectionException("No method \"" + str + "\" with " + i + " parameter(s)");
    }

    public static Method h(Class<?> cls, String str, Class<?>[] clsArr) throws IntrospectionException {
        int length;
        if (str == null) {
            return null;
        }
        Method k = C3250Ij1.k(cls, str, clsArr);
        if (k != null) {
            return k;
        }
        if (clsArr == null) {
            length = 0;
        } else {
            length = clsArr.length;
        }
        throw new IntrospectionException("No method \"" + str + "\" with " + length + " parameter(s) of matching types.");
    }

    public static Method i(Class<?> cls, String str, int i) {
        Class<?> cls2 = cls;
        while (true) {
            int i2 = 0;
            if (cls2 != null) {
                Method[] declaredMethods = cls2.getDeclaredMethods();
                int length = declaredMethods.length;
                while (i2 < length) {
                    Method method = declaredMethods[i2];
                    if (method != null) {
                        int modifiers = method.getModifiers();
                        if (Modifier.isPublic(modifiers) && !Modifier.isStatic(modifiers) && method.getName().equals(str) && method.getParameterTypes().length == i) {
                            return method;
                        }
                    }
                    i2++;
                }
                cls2 = cls2.getSuperclass();
            } else {
                Class<?>[] interfaces = cls.getInterfaces();
                int length2 = interfaces.length;
                while (i2 < length2) {
                    Method i3 = i(interfaces[i2], str, i);
                    if (i3 != null) {
                        return i3;
                    }
                    i2++;
                }
                return null;
            }
        }
    }

    public final void c() throws IntrospectionException {
        Class<?> cls;
        Method e = e();
        Method f = f();
        if (e != null) {
            if (e.getParameterTypes().length == 1) {
                cls = e.getReturnType();
                if (cls == Void.TYPE) {
                    throw new IntrospectionException("mapped read method " + e.getName() + " returns void");
                }
            } else {
                throw new IntrospectionException("bad mapped read method arg count");
            }
        } else {
            cls = null;
        }
        if (f != null) {
            Class<?>[] parameterTypes = f.getParameterTypes();
            if (parameterTypes.length == 2) {
                if (cls != null && cls != parameterTypes[1]) {
                    throw new IntrospectionException("type mismatch between mapped read and write methods");
                }
                cls = parameterTypes[1];
            } else {
                throw new IntrospectionException("bad mapped write method arg count");
            }
        }
        this.a = new SoftReference(cls);
    }

    public Class<?> d() {
        return this.a.get();
    }

    public Method e() {
        return this.b.b();
    }

    public Method f() {
        return this.c.b();
    }

    public void j(Method method) throws IntrospectionException {
        this.b = new a(method);
        c();
    }

    public void k(Method method) throws IntrospectionException {
        this.c = new a(method);
        c();
    }

    public C7206j81(String str, Class<?> cls, String str2, String str3) throws IntrospectionException {
        super(str, (Method) null, (Method) null);
        Method g;
        if (str != null && str.length() != 0) {
            setName(str);
            Method h = h(cls, str2, d);
            if (h != null) {
                g = h(cls, str3, new Class[]{String.class, h.getReturnType()});
            } else {
                g = g(cls, str3, 2);
            }
            this.b = new a(h);
            this.c = new a(g);
            c();
            return;
        }
        throw new IntrospectionException("bad property name: " + str);
    }

    public C7206j81(String str, Method method, Method method2) throws IntrospectionException {
        super(str, method, method2);
        if (str != null && str.length() != 0) {
            setName(str);
            this.b = new a(method);
            this.c = new a(method2);
            c();
            return;
        }
        throw new IntrospectionException("bad property name: " + str);
    }
}
