package o;

import java.io.IOException;
import java.util.function.BooleanSupplier;

@FunctionalInterface
/* renamed from: o.uJ0 */
/* loaded from: classes4.dex */
public interface InterfaceC9947uJ0 {
    static /* synthetic */ boolean b(InterfaceC9947uJ0 interfaceC9947uJ0) {
        return interfaceC9947uJ0.a();
    }

    /* synthetic */ default boolean a() {
        return C8643oy2.l(this);
    }

    default BooleanSupplier c() {
        return new BooleanSupplier() { // from class: o.tJ0
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return InterfaceC9947uJ0.b(InterfaceC9947uJ0.this);
            }
        };
    }

    boolean getAsBoolean() throws IOException;
}
