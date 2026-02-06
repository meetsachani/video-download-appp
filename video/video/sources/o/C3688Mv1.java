package o;

import androidx.lifecycle.LiveData;
import o.InterfaceC3395Jv1;

/* renamed from: o.Mv1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3688Mv1 implements InterfaceC3395Jv1 {
    public final C7364jn1<InterfaceC3395Jv1.b> c = new C7364jn1<>();
    public final E22<InterfaceC3395Jv1.b.c> d = E22.u();

    public C3688Mv1() {
        a(InterfaceC3395Jv1.b);
    }

    public void a(InterfaceC3395Jv1.b state) {
        this.c.o(state);
        if (state instanceof InterfaceC3395Jv1.b.c) {
            this.d.p((InterfaceC3395Jv1.b.c) state);
        } else if (state instanceof InterfaceC3395Jv1.b.a) {
            this.d.q(((InterfaceC3395Jv1.b.a) state).a());
        }
    }

    @Override // o.InterfaceC3395Jv1
    public InterfaceFutureC8411o11<InterfaceC3395Jv1.b.c> getResult() {
        return this.d;
    }

    @Override // o.InterfaceC3395Jv1
    public LiveData<InterfaceC3395Jv1.b> getState() {
        return this.c;
    }
}
