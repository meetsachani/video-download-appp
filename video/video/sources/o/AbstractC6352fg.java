package o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.fg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6352fg<T> implements InterfaceC9217rJ<T> {
    public final AtomicReference<T> a = new AtomicReference<>();

    public abstract T a() throws C8725pJ;

    @Override // o.InterfaceC9217rJ
    public T get() throws C8725pJ {
        T t = this.a.get();
        if (t == null) {
            T a = a();
            if (!C6515gH1.a(this.a, null, a)) {
                return this.a.get();
            }
            return a;
        }
        return t;
    }
}
