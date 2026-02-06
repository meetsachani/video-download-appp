package o;

import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: o.ip  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7128ip {
    public static final /* synthetic */ boolean a = false;

    @ES1(19)
    /* renamed from: o.ip$a */
    /* loaded from: classes4.dex */
    public static class a implements InvocationHandler {
        public final Object a;

        public a(@InterfaceC5670cr1 Object obj) {
            this.a = obj;
        }

        @InterfaceC5670cr1
        public Object a() {
            return this.a;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                return C7128ip.f(method, this.a.getClass().getClassLoader()).invoke(this.a, objArr);
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            } catch (ReflectiveOperationException e2) {
                throw new RuntimeException("Reflection failed for method " + method, e2);
            }
        }
    }

    @InterfaceC11300zs1
    public static <T> T a(@InterfaceC5670cr1 Class<T> cls, @InterfaceC11300zs1 InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(C7128ip.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static boolean b(Collection<String> collection, String str) {
        if (!collection.contains(str)) {
            if (i()) {
                if (!collection.contains(str + C3363Jn0.a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean c(String[] strArr, String str) {
        return b(Arrays.asList(strArr), str);
    }

    @InterfaceC11300zs1
    @ES1(19)
    public static InvocationHandler d(@InterfaceC11300zs1 Object obj) {
        if (obj == null) {
            return null;
        }
        return new a(obj);
    }

    @InterfaceC11300zs1
    @ES1(19)
    public static InvocationHandler[] e(@InterfaceC11300zs1 Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        int length = objArr.length;
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[length];
        for (int i = 0; i < length; i++) {
            invocationHandlerArr[i] = d(objArr[i]);
        }
        return invocationHandlerArr;
    }

    public static Method f(Method method, ClassLoader classLoader) throws ClassNotFoundException, NoSuchMethodException {
        return Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }

    @InterfaceC11300zs1
    @ES1(19)
    public static Object g(@InterfaceC11300zs1 InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return ((a) invocationHandler).a();
    }

    public static boolean h(Object obj, String str) {
        try {
            return Class.forName(str, false, obj.getClass().getClassLoader()).isInstance(obj);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean i() {
        String str = Build.TYPE;
        if (!"eng".equals(str) && !"userdebug".equals(str)) {
            return false;
        }
        return true;
    }
}
