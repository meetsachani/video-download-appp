package o;

/* renamed from: o.lC1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7708lC1 extends AbstractC7762lQ {
    public final C6948i40 Z = new C6948i40();

    @Override // o.AbstractC7762lQ
    public void I(InterfaceC5809dQ interfaceC5809dQ, Runnable runnable) {
        C6562gT0.p(interfaceC5809dQ, "context");
        C6562gT0.p(runnable, "block");
        this.Z.c(interfaceC5809dQ, runnable);
    }

    @Override // o.AbstractC7762lQ
    public boolean U(InterfaceC5809dQ interfaceC5809dQ) {
        C6562gT0.p(interfaceC5809dQ, "context");
        if (C8909q40.e().b0().U(interfaceC5809dQ)) {
            return true;
        }
        return !this.Z.b();
    }
}
