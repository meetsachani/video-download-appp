package o;

import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: o.tM  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9715tM<T> {
    public final Map<ClassLoader, T> a = new WeakHashMap();
    public boolean b = false;
    public T c;

    public synchronized T a() {
        this.a.isEmpty();
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                T t = this.a.get(contextClassLoader);
                if (t == null && !this.a.containsKey(contextClassLoader)) {
                    t = b();
                    this.a.put(contextClassLoader, t);
                }
                return t;
            }
        } catch (SecurityException unused) {
        }
        if (!this.b) {
            this.c = b();
            this.b = true;
        }
        return this.c;
    }

    public T b() {
        return null;
    }

    public synchronized void c(T t) {
        this.a.isEmpty();
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                this.a.put(contextClassLoader, t);
                return;
            }
        } catch (SecurityException unused) {
        }
        this.c = t;
        this.b = true;
    }

    public synchronized void d() {
        try {
            e(Thread.currentThread().getContextClassLoader());
        } catch (SecurityException unused) {
        }
    }

    public synchronized void e(ClassLoader classLoader) {
        this.a.remove(classLoader);
    }
}
