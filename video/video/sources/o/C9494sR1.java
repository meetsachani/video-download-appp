package o;

import java.util.concurrent.Executor;

@InterfaceC11149zF0
@InterfaceC6086ea0
/* renamed from: o.sR1 */
/* loaded from: classes3.dex */
public final class C9494sR1 {
    public static /* synthetic */ void a(InterfaceC8759pR1 interfaceC8759pR1, C9737tR1 c9737tR1) {
        interfaceC8759pR1.e(c9737tR1);
    }

    public static /* synthetic */ void b(Executor executor, final InterfaceC8759pR1 interfaceC8759pR1, final C9737tR1 c9737tR1) {
        executor.execute(new Runnable() { // from class: o.qR1
            @Override // java.lang.Runnable
            public final void run() {
                C9494sR1.a(InterfaceC8759pR1.this, c9737tR1);
            }
        });
    }

    public static <K, V> InterfaceC8759pR1<K, V> c(final InterfaceC8759pR1<K, V> interfaceC8759pR1, final Executor executor) {
        C10664xF1.E(interfaceC8759pR1);
        C10664xF1.E(executor);
        return new InterfaceC8759pR1() { // from class: o.rR1
            @Override // o.InterfaceC8759pR1
            public final void e(C9737tR1 c9737tR1) {
                C9494sR1.b(executor, interfaceC8759pR1, c9737tR1);
            }
        };
    }
}
