package o;

import java.util.Objects;
import o.C3679Mt;

/* renamed from: o.vC1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10163vC1<T> {
    public C4377Tx1<C3679Mt.a<Void>, T> a;

    public static /* synthetic */ Object a(C10163vC1 c10163vC1, Object obj, C3679Mt.a aVar) {
        C4377Tx1<C3679Mt.a<Void>, T> c4377Tx1 = c10163vC1.a;
        if (c4377Tx1 != null) {
            C3679Mt.a<Void> aVar2 = c4377Tx1.a;
            Objects.requireNonNull(aVar2);
            aVar2.d();
        }
        c10163vC1.a = new C4377Tx1<>(aVar, obj);
        return "PendingValue " + obj;
    }

    public void b(InterfaceC6490gB0<T, InterfaceFutureC8411o11<Void>> interfaceC6490gB0) {
        C5901do2.c();
        C4377Tx1<C3679Mt.a<Void>, T> c4377Tx1 = this.a;
        if (c4377Tx1 != null) {
            C3679Mt.a<Void> aVar = this.a.a;
            Objects.requireNonNull(aVar);
            C7221jC0.j(interfaceC6490gB0.apply(c4377Tx1.b), aVar);
            this.a = null;
        }
    }

    public InterfaceFutureC8411o11<Void> c(final T t) {
        C5901do2.c();
        return C3679Mt.a(new C3679Mt.c() { // from class: o.uC1
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return C10163vC1.a(C10163vC1.this, t, aVar);
            }
        });
    }
}
