package o;

import java.io.IOException;

@FunctionalInterface
/* renamed from: o.qK0 */
/* loaded from: classes4.dex */
public interface InterfaceC8973qK0 {
    static InterfaceC8973qK0 a() {
        return HK.b;
    }

    static /* synthetic */ void c(InterfaceC8973qK0 interfaceC8973qK0) {
        interfaceC8973qK0.d();
    }

    default Runnable b() {
        return new Runnable() { // from class: o.pK0
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC8973qK0.c(InterfaceC8973qK0.this);
            }
        };
    }

    /* synthetic */ default void d() {
        C8643oy2.q(this);
    }

    void run() throws IOException;
}
