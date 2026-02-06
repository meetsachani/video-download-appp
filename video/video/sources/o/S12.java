package o;

import java.lang.reflect.InvocationTargetException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/* loaded from: classes4.dex */
public class S12 implements ServletContextListener {
    public static final Class[] a;
    public static /* synthetic */ Class b;

    static {
        Class cls = b;
        if (cls == null) {
            cls = a("java.lang.ClassLoader");
            b = cls;
        }
        a = new Class[]{cls};
    }

    public static /* synthetic */ Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public void b(ServletContextEvent servletContextEvent) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        Object[] objArr = {contextClassLoader};
        ClassLoader classLoader = contextClassLoader;
        while (classLoader != null) {
            try {
                Class<?> loadClass = classLoader.loadClass(U31.c);
                loadClass.getMethod("release", a).invoke(null, objArr);
                classLoader = loadClass.getClassLoader().getParent();
            } catch (ClassNotFoundException unused) {
                classLoader = null;
            } catch (IllegalAccessException unused2) {
                System.err.println("LogFactory instance found which is not accessable!");
                classLoader = null;
            } catch (NoSuchMethodException unused3) {
                System.err.println("LogFactory instance found which does not support release method!");
                classLoader = null;
            } catch (InvocationTargetException unused4) {
                System.err.println("LogFactory instance release method failed!");
                classLoader = null;
            }
        }
        U31.I(contextClassLoader);
    }

    public void c(ServletContextEvent servletContextEvent) {
    }
}
