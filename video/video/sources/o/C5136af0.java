package o;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.af0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5136af0 {

    /* renamed from: o.af0$a */
    /* loaded from: classes4.dex */
    public static class a implements InvocationHandler {
        public final Object a;
        public final String b;
        public final Set<String> c;

        public a(Object obj, String str, String[] strArr) {
            this.a = obj;
            this.b = str;
            this.c = new HashSet(Arrays.asList(strArr));
        }

        public final boolean a(Method method) {
            if (C3348Jj1.g(this.a.getClass(), this.b, method.getParameterTypes()) != null) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (!this.c.isEmpty() && !this.c.contains(method.getName())) {
                return null;
            }
            if (a(method)) {
                return C3348Jj1.A(this.a, this.b, objArr);
            }
            return C3348Jj1.z(this.a, this.b);
        }
    }

    public static <L> void a(Object obj, Class<L> cls, L l) {
        try {
            C3348Jj1.A(obj, "add" + cls.getSimpleName(), l);
        } catch (IllegalAccessException unused) {
            throw new IllegalArgumentException("Class " + obj.getClass().getName() + " does not have an accessible add" + cls.getSimpleName() + " method which takes a parameter of type " + cls.getName() + UE.h);
        } catch (NoSuchMethodException unused2) {
            throw new IllegalArgumentException("Class " + obj.getClass().getName() + " does not have a public add" + cls.getSimpleName() + " method which takes a parameter of type " + cls.getName() + UE.h);
        } catch (InvocationTargetException e) {
            throw new RuntimeException("Unable to add listener.", e.getCause());
        }
    }

    public static <L> void b(Object obj, String str, Object obj2, Class<L> cls, String... strArr) {
        a(obj2, cls, cls.cast(Proxy.newProxyInstance(obj.getClass().getClassLoader(), new Class[]{cls}, new a(obj, str, strArr))));
    }
}
