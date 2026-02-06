package o;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: o.mm2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8108mm2 implements ND {
    public final AtomicLong a;

    public C8108mm2(long j) {
        this.a = new AtomicLong(j);
    }

    @Override // o.ND
    public long a() {
        return this.a.get();
    }

    public void b(long j) {
        if (j >= 0) {
            this.a.addAndGet(j);
            return;
        }
        throw new IllegalArgumentException("cannot advance time backwards.");
    }

    public void c() {
        b(1L);
    }
}
