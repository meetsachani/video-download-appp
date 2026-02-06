package o;

import o.InterfaceC10712xR1;
import o.InterfaceC7583kh1;

@Deprecated
/* renamed from: o.Ir2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3283Ir2 {
    @InterfaceC11300zs1
    public a a;
    @InterfaceC11300zs1
    public InterfaceC3643Mk b;

    public final InterfaceC3643Mk b() {
        return (InterfaceC3643Mk) C9542sf.k(this.b);
    }

    public C2989Fr2 c() {
        return C2989Fr2.v1;
    }

    @InterfaceC11300zs1
    public InterfaceC10712xR1.f d() {
        return null;
    }

    @InterfaceC2591Bt
    public void e(a aVar, InterfaceC3643Mk interfaceC3643Mk) {
        this.a = aVar;
        this.b = interfaceC3643Mk;
    }

    public final void f() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final void g(InterfaceC10469wR1 interfaceC10469wR1) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(interfaceC10469wR1);
        }
    }

    public boolean h() {
        return false;
    }

    public abstract void i(@InterfaceC11300zs1 Object obj);

    @InterfaceC2591Bt
    public void j() {
        this.a = null;
        this.b = null;
    }

    public abstract C3381Jr2 k(InterfaceC10712xR1[] interfaceC10712xR1Arr, C10079ur2 c10079ur2, InterfaceC7583kh1.b bVar, AbstractC7373jp2 abstractC7373jp2) throws C3824Og0;

    /* renamed from: o.Ir2$a */
    /* loaded from: classes2.dex */
    public interface a {
        void b();

        default void a(InterfaceC10469wR1 interfaceC10469wR1) {
        }
    }

    public void l(C9546sg c9546sg) {
    }

    public void m(C2989Fr2 c2989Fr2) {
    }
}
