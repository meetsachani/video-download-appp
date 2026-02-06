package o;

import o.C3686Mv;

/* loaded from: classes.dex */
public class SI2 implements InterfaceC3784Nv {
    public static final long d = -1;
    public final InterfaceC3784Nv a;
    public final C4133Rk2 b;
    public final long c;

    public SI2(C4133Rk2 c4133Rk2, InterfaceC3784Nv interfaceC3784Nv) {
        this(interfaceC3784Nv, c4133Rk2, -1L);
    }

    @Override // o.InterfaceC3784Nv
    public C4133Rk2 a() {
        return this.b;
    }

    @Override // o.InterfaceC3784Nv
    public long c() {
        InterfaceC3784Nv interfaceC3784Nv = this.a;
        if (interfaceC3784Nv != null) {
            return interfaceC3784Nv.c();
        }
        long j = this.c;
        if (j != -1) {
            return j;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // o.InterfaceC3784Nv
    public C3686Mv.e d() {
        InterfaceC3784Nv interfaceC3784Nv = this.a;
        if (interfaceC3784Nv != null) {
            return interfaceC3784Nv.d();
        }
        return C3686Mv.e.UNKNOWN;
    }

    @Override // o.InterfaceC3784Nv
    public C3686Mv.c f() {
        InterfaceC3784Nv interfaceC3784Nv = this.a;
        if (interfaceC3784Nv != null) {
            return interfaceC3784Nv.f();
        }
        return C3686Mv.c.UNKNOWN;
    }

    @Override // o.InterfaceC3784Nv
    public C3686Mv.d g() {
        InterfaceC3784Nv interfaceC3784Nv = this.a;
        if (interfaceC3784Nv != null) {
            return interfaceC3784Nv.g();
        }
        return C3686Mv.d.UNKNOWN;
    }

    @Override // o.InterfaceC3784Nv
    public C3686Mv.b h() {
        InterfaceC3784Nv interfaceC3784Nv = this.a;
        if (interfaceC3784Nv != null) {
            return interfaceC3784Nv.h();
        }
        return C3686Mv.b.UNKNOWN;
    }

    @Override // o.InterfaceC3784Nv
    public C3686Mv.a i() {
        InterfaceC3784Nv interfaceC3784Nv = this.a;
        if (interfaceC3784Nv != null) {
            return interfaceC3784Nv.i();
        }
        return C3686Mv.a.UNKNOWN;
    }

    public SI2(C4133Rk2 c4133Rk2, long j) {
        this(null, c4133Rk2, j);
    }

    public SI2(InterfaceC3784Nv interfaceC3784Nv, C4133Rk2 c4133Rk2, long j) {
        this.a = interfaceC3784Nv;
        this.b = c4133Rk2;
        this.c = j;
    }
}
