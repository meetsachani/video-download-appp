package o;

/* renamed from: o.oM0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8495oM0 extends androidx.camera.core.d {
    @Override // androidx.camera.core.d
    public androidx.camera.core.g d(InterfaceC8499oN0 interfaceC8499oN0) {
        return interfaceC8499oN0.g();
    }

    @Override // androidx.camera.core.d
    public void m(androidx.camera.core.g gVar) {
        C7221jC0.b(e(gVar), new a(gVar), C5211ay.b());
    }

    @Override // androidx.camera.core.d
    public void g() {
    }

    /* renamed from: o.oM0$a */
    /* loaded from: classes.dex */
    public class a implements XB0<Void> {
        public final /* synthetic */ androidx.camera.core.g a;

        public a(androidx.camera.core.g gVar) {
            this.a = gVar;
        }

        @Override // o.XB0
        public void b(Throwable th) {
            this.a.close();
        }

        @Override // o.XB0
        /* renamed from: c */
        public void a(Void r1) {
        }
    }
}
