package o;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.pf0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8808pf0 implements OR {
    public final AtomicInteger a = new AtomicInteger();
    public final int b;

    public C8808pf0(int i) {
        this.b = i;
    }

    @Override // o.OR
    public NR a(NR nr) throws NR {
        if (this.a.incrementAndGet() <= this.b) {
            return nr;
        }
        throw nr;
    }
}
