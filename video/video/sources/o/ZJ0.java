package o;

import java.io.IOException;
import java.util.function.IntSupplier;

@FunctionalInterface
/* loaded from: classes4.dex */
public interface ZJ0 {
    static /* synthetic */ int b(ZJ0 zj0) {
        return zj0.c();
    }

    default IntSupplier a() {
        return new IntSupplier() { // from class: o.YJ0
            @Override // java.util.function.IntSupplier
            public final int getAsInt() {
                return ZJ0.b(ZJ0.this);
            }
        };
    }

    /* synthetic */ default int c() {
        return C8643oy2.m(this);
    }

    int getAsInt() throws IOException;
}
