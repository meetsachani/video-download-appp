package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;
import o.C9654t62;

/* loaded from: classes.dex */
public class e {
    public static final C9654t62<ClassLoader, C9654t62<String, Class<?>>> a = new C9654t62<>();

    public static boolean b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Class<?> c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C9654t62<ClassLoader, C9654t62<String, Class<?>>> c9654t62 = a;
        C9654t62<String, Class<?>> c9654t622 = c9654t62.get(classLoader);
        if (c9654t622 == null) {
            c9654t622 = new C9654t62<>();
            c9654t62.put(classLoader, c9654t622);
        }
        Class<?> cls = c9654t622.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            c9654t622.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public static Class<? extends Fragment> d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.l("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.l("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
        }
    }

    public Fragment a(ClassLoader classLoader, String str) {
        try {
            return d(classLoader, str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new Fragment.l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (InstantiationException e2) {
            throw new Fragment.l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment.l("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment.l("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }
}
