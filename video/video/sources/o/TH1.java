package o;

/* loaded from: classes.dex */
public class TH1 implements SH1 {
    public final androidx.camera.lifecycle.b a;

    public TH1(androidx.camera.lifecycle.b bVar) {
        this.a = bVar;
    }

    @Override // o.SH1
    public void a() {
        this.a.a();
    }

    @Override // o.SH1
    public void b(androidx.camera.core.m... mVarArr) {
        this.a.b(mVarArr);
    }

    @Override // o.SH1
    public boolean c(C2898Ex c2898Ex) throws C7159ix {
        return this.a.c(c2898Ex);
    }

    @Override // o.SH1
    public InterfaceC3099Gv d(KZ0 kz0, C2898Ex c2898Ex, C7713lD2 c7713lD2) {
        return this.a.k(kz0, c2898Ex, c7713lD2);
    }

    @Override // o.SH1
    public InterfaceFutureC8411o11<Void> shutdown() {
        return this.a.B();
    }
}
