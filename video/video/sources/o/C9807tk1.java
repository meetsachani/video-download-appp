package o;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.tk1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9807tk1 {
    public final AtomicReference<C3356Jl1> a = new AtomicReference<>();
    public final C2531Be<C3356Jl1, List<Class<?>>> b = new C2531Be<>();

    public void a() {
        synchronized (this.b) {
            this.b.clear();
        }
    }

    public List<Class<?>> b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        C3356Jl1 andSet = this.a.getAndSet(null);
        if (andSet == null) {
            andSet = new C3356Jl1(cls, cls2, cls3);
        } else {
            andSet.b(cls, cls2, cls3);
        }
        synchronized (this.b) {
            list = this.b.get(andSet);
        }
        this.a.set(andSet);
        return list;
    }

    public void c(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.b) {
            this.b.put(new C3356Jl1(cls, cls2, cls3), list);
        }
    }
}
