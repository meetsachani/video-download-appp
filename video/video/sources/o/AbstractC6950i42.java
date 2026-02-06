package o;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.i42  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6950i42 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final VU1 b;
    public volatile InterfaceC2546Bh2 c;

    public AbstractC6950i42(VU1 vu1) {
        this.b = vu1;
    }

    public InterfaceC2546Bh2 a() {
        b();
        return e(this.a.compareAndSet(false, true));
    }

    public void b() {
        this.b.a();
    }

    public final InterfaceC2546Bh2 c() {
        return this.b.f(d());
    }

    public abstract String d();

    public final InterfaceC2546Bh2 e(boolean z) {
        if (z) {
            if (this.c == null) {
                this.c = c();
            }
            return this.c;
        }
        return c();
    }

    public void f(InterfaceC2546Bh2 interfaceC2546Bh2) {
        if (interfaceC2546Bh2 == this.c) {
            this.a.set(false);
        }
    }
}
