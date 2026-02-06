package o;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: o.fo2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6387fo2 extends AbstractC7415k0<Long> {
    public static final long f = 0;
    public final long d;
    public final AtomicLong e = new AtomicLong(0);

    public C6387fo2(long j) {
        this.d = j;
    }

    @Override // o.AbstractC7415k0, o.InterfaceC10161vC
    public boolean a() {
        return isOpen();
    }

    @Override // o.AbstractC7415k0, o.InterfaceC10161vC
    public void close() {
        super.close();
        this.e.set(0L);
    }

    public long g() {
        return this.d;
    }

    @Override // o.AbstractC7415k0, o.InterfaceC10161vC
    /* renamed from: h */
    public boolean b(Long l) {
        if (this.d == 0) {
            open();
        }
        if (this.e.addAndGet(l.longValue()) > this.d) {
            open();
        }
        return a();
    }
}
