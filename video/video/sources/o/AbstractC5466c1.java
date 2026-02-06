package o;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

@InterfaceC5359ba0
/* renamed from: o.c1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5466c1 implements InvocationHandler {
    public static final Object[] a = new Object[0];

    public static boolean b(Object obj, Class<?> cls) {
        if (!cls.isInstance(obj)) {
            if (!Proxy.isProxyClass(obj.getClass()) || !Arrays.equals(obj.getClass().getInterfaces(), cls.getInterfaces())) {
                return false;
            }
            return true;
        }
        return true;
    }

    @MB
    public abstract Object a(Object obj, Method method, Object[] objArr) throws Throwable;

    public boolean equals(@MB Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    @MB
    public final Object invoke(Object obj, Method method, @MB Object[] objArr) throws Throwable {
        if (objArr == null) {
            objArr = a;
        }
        if (objArr.length == 0 && method.getName().equals("hashCode")) {
            return Integer.valueOf(hashCode());
        }
        boolean z = true;
        if (objArr.length == 1 && method.getName().equals("equals") && method.getParameterTypes()[0] == Object.class) {
            Object obj2 = objArr[0];
            if (obj2 == null) {
                return Boolean.FALSE;
            }
            if (obj == obj2) {
                return Boolean.TRUE;
            }
            if (!b(obj2, obj.getClass()) || !equals(Proxy.getInvocationHandler(obj2))) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else if (objArr.length == 0 && method.getName().equals("toString")) {
            return toString();
        } else {
            return a(obj, method, objArr);
        }
    }

    public String toString() {
        return super.toString();
    }
}
