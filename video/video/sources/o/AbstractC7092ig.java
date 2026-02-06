package o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.ig  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7092ig<T> implements InterfaceC9217rJ<T> {
    public final AtomicReference<AbstractC7092ig<T>> a = new AtomicReference<>();
    public final AtomicReference<T> b = new AtomicReference<>();

    public abstract T a() throws C8725pJ;

    @Override // o.InterfaceC9217rJ
    public final T get() throws C8725pJ {
        while (true) {
            T t = this.b.get();
            if (t == null) {
                if (C6515gH1.a(this.a, null, this)) {
                    this.b.set(a());
                }
            } else {
                return t;
            }
        }
    }
}
