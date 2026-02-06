package o;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

@InterfaceC5359ba0
/* renamed from: o.iQ1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7037iQ1 {
    public static String a(Class<?> cls) {
        return b(cls.getName());
    }

    public static String b(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "";
        }
        return str.substring(0, lastIndexOf);
    }

    public static void c(Class<?>... clsArr) {
        for (Class<?> cls : clsArr) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
            } catch (ClassNotFoundException e) {
                throw new AssertionError(e);
            }
        }
    }

    public static <T> T d(Class<T> cls, InvocationHandler invocationHandler) {
        C10664xF1.E(invocationHandler);
        C10664xF1.u(cls.isInterface(), "%s is not an interface", cls);
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
