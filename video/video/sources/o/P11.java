package o;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class P11 {
    public static final O11<?, ?, ?> c = new O11<>(Object.class, Object.class, Object.class, Collections.singletonList(new C5103aW(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new C8448oA2(), null)), null);
    public final C2531Be<C3356Jl1, O11<?, ?, ?>> a = new C2531Be<>();
    public final AtomicReference<C3356Jl1> b = new AtomicReference<>();

    public <Data, TResource, Transcode> O11<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        O11<Data, TResource, Transcode> o11;
        C3356Jl1 b = b(cls, cls2, cls3);
        synchronized (this.a) {
            o11 = (O11<Data, TResource, Transcode>) this.a.get(b);
        }
        this.b.set(b);
        return o11;
    }

    public final C3356Jl1 b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        C3356Jl1 andSet = this.b.getAndSet(null);
        if (andSet == null) {
            andSet = new C3356Jl1();
        }
        andSet.b(cls, cls2, cls3);
        return andSet;
    }

    public boolean c(O11<?, ?, ?> o11) {
        return c.equals(o11);
    }

    public void d(Class<?> cls, Class<?> cls2, Class<?> cls3, O11<?, ?, ?> o11) {
        synchronized (this.a) {
            C2531Be<C3356Jl1, O11<?, ?, ?>> c2531Be = this.a;
            C3356Jl1 c3356Jl1 = new C3356Jl1(cls, cls2, cls3);
            if (o11 == null) {
                o11 = c;
            }
            c2531Be.put(c3356Jl1, o11);
        }
    }
}
