package o;

import java.io.IOException;
import java.util.function.LongSupplier;

@FunctionalInterface
/* renamed from: o.eK0 */
/* loaded from: classes4.dex */
public interface InterfaceC6028eK0 {
    static /* synthetic */ long b(InterfaceC6028eK0 interfaceC6028eK0) {
        return interfaceC6028eK0.c();
    }

    default LongSupplier a() {
        return new LongSupplier() { // from class: o.dK0
            @Override // java.util.function.LongSupplier
            public final long getAsLong() {
                return InterfaceC6028eK0.b(InterfaceC6028eK0.this);
            }
        };
    }

    /* synthetic */ default long c() {
        return C8643oy2.o(this);
    }

    long getAsLong() throws IOException;
}
