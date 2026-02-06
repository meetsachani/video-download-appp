package androidx.lifecycle;

import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C6562gT0;
import o.C7979mF;
import o.C9545sf2;
import o.InterfaceC10494wZ;
import o.InterfaceC9511sW0;
import o.JZ0;
import o.UE;

/* loaded from: classes.dex */
public final class k {
    public static final int b = 1;
    public static final int c = 2;
    public static final k a = new k();
    public static final Map<Class<?>, Integer> d = new HashMap();
    public static final Map<Class<?>, List<Constructor<? extends d>>> e = new HashMap();

    @InterfaceC9511sW0
    public static final String c(String str) {
        C6562gT0.p(str, "className");
        return C9545sf2.z2(str, UE.h, CrashlyticsReportPersistence.m, false, 4, null) + "_LifecycleAdapter";
    }

    @InterfaceC9511sW0
    public static final i f(Object obj) {
        C6562gT0.p(obj, "object");
        boolean z = obj instanceof i;
        boolean z2 = obj instanceof InterfaceC10494wZ;
        if (z && z2) {
            return new DefaultLifecycleObserverAdapter((InterfaceC10494wZ) obj, (i) obj);
        }
        if (z2) {
            return new DefaultLifecycleObserverAdapter((InterfaceC10494wZ) obj, null);
        }
        if (z) {
            return (i) obj;
        }
        Class<?> cls = obj.getClass();
        k kVar = a;
        if (kVar.d(cls) == 2) {
            List<Constructor<? extends d>> list = e.get(cls);
            C6562gT0.m(list);
            List<Constructor<? extends d>> list2 = list;
            if (list2.size() == 1) {
                return new SingleGeneratedAdapterObserver(kVar.a(list2.get(0), obj));
            }
            int size = list2.size();
            d[] dVarArr = new d[size];
            for (int i = 0; i < size; i++) {
                dVarArr[i] = a.a(list2.get(i), obj);
            }
            return new CompositeGeneratedAdaptersObserver(dVarArr);
        }
        return new ReflectiveGenericLifecycleObserver(obj);
    }

    public final d a(Constructor<? extends d> constructor, Object obj) {
        try {
            d newInstance = constructor.newInstance(obj);
            C6562gT0.o(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return newInstance;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public final Constructor<? extends d> b(Class<?> cls) {
        String str;
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            if (r0 != null) {
                str = r0.getName();
            } else {
                str = "";
            }
            C6562gT0.o(str, "fullPackage");
            if (str.length() != 0) {
                C6562gT0.o(canonicalName, "name");
                canonicalName = canonicalName.substring(str.length() + 1);
                C6562gT0.o(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            C6562gT0.o(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c2 = c(canonicalName);
            if (str.length() != 0) {
                c2 = str + '.' + c2;
            }
            Class<?> cls2 = Class.forName(c2);
            C6562gT0.n(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final int d(Class<?> cls) {
        Map<Class<?>, Integer> map = d;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g = g(cls);
        map.put(cls, Integer.valueOf(g));
        return g;
    }

    public final boolean e(Class<?> cls) {
        if (cls != null && JZ0.class.isAssignableFrom(cls)) {
            return true;
        }
        return false;
    }

    public final int g(Class<?> cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends d> b2 = b(cls);
        if (b2 != null) {
            e.put(cls, C7979mF.k(b2));
            return 2;
        } else if (b.c.d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            if (e(superclass)) {
                C6562gT0.o(superclass, "superclass");
                if (d(superclass) == 1) {
                    return 1;
                }
                List<Constructor<? extends d>> list = e.get(superclass);
                C6562gT0.m(list);
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            Class<?>[] interfaces = cls.getInterfaces();
            C6562gT0.o(interfaces, "klass.interfaces");
            for (Class<?> cls2 : interfaces) {
                if (e(cls2)) {
                    C6562gT0.o(cls2, "intrface");
                    if (d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    List<Constructor<? extends d>> list2 = e.get(cls2);
                    C6562gT0.m(list2);
                    arrayList.addAll(list2);
                }
            }
            if (arrayList == null) {
                return 1;
            }
            e.put(cls, arrayList);
            return 2;
        }
    }
}
