package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C10935yM1;

/* renamed from: o.nd  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8312nd {
    public static final String d = "Startup";
    public static volatile C8312nd e;
    public static final Object f = new Object();
    public final Context c;
    public final Set<Class<? extends MP0<?>>> b = new HashSet();
    public final Map<Class<?>, Object> a = new HashMap();

    public C8312nd(Context context) {
        this.c = context.getApplicationContext();
    }

    public static C8312nd e(Context context) {
        if (e == null) {
            synchronized (f) {
                try {
                    if (e == null) {
                        e = new C8312nd(context);
                    }
                } finally {
                }
            }
        }
        return e;
    }

    public static void h(C8312nd c8312nd) {
        synchronized (f) {
            e = c8312nd;
        }
    }

    public void a() {
        try {
            try {
                C6399fr2.c(d);
                b(this.c.getPackageManager().getProviderInfo(new ComponentName(this.c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e2) {
                throw new C7321jc2(e2);
            }
        } finally {
            C6399fr2.f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(Bundle bundle) {
        String string = this.c.getString(C10935yM1.a.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (MP0.class.isAssignableFrom(cls)) {
                            this.b.add(cls);
                        }
                    }
                }
                for (Class<? extends MP0<?>> cls2 : this.b) {
                    d(cls2, hashSet);
                }
            } catch (ClassNotFoundException e2) {
                throw new C7321jc2(e2);
            }
        }
    }

    public <T> T c(Class<? extends MP0<?>> cls) {
        T t;
        synchronized (f) {
            try {
                t = (T) this.a.get(cls);
                if (t == null) {
                    t = (T) d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    public final <T> T d(Class<? extends MP0<?>> cls, Set<Class<?>> set) {
        T t;
        if (C6399fr2.i()) {
            try {
                C6399fr2.c(cls.getSimpleName());
            } catch (Throwable th) {
                C6399fr2.f();
                throw th;
            }
        }
        if (!set.contains(cls)) {
            if (!this.a.containsKey(cls)) {
                set.add(cls);
                MP0<?> newInstance = cls.getDeclaredConstructor(null).newInstance(null);
                List<Class<? extends MP0<?>>> dependencies = newInstance.dependencies();
                if (!dependencies.isEmpty()) {
                    for (Class<? extends MP0<?>> cls2 : dependencies) {
                        if (!this.a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                t = (T) newInstance.create(this.c);
                set.remove(cls);
                this.a.put(cls, t);
            } else {
                t = (T) this.a.get(cls);
            }
            C6399fr2.f();
            return t;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
    }

    public <T> T f(Class<? extends MP0<T>> cls) {
        return (T) c(cls);
    }

    public boolean g(Class<? extends MP0<?>> cls) {
        return this.b.contains(cls);
    }
}
