package o;

import java.io.IOException;

@Deprecated
/* renamed from: o.tr  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9833tr implements SH0 {
    public static final KE1 d = new KE1();
    @InterfaceC5056aJ2
    public final InterfaceC4324Tj0 a;
    public final C10833xx0 b;
    public final C10071up2 c;

    public C9833tr(InterfaceC4324Tj0 interfaceC4324Tj0, C10833xx0 c10833xx0, C10071up2 c10071up2) {
        this.a = interfaceC4324Tj0;
        this.b = c10833xx0;
        this.c = c10071up2;
    }

    @Override // o.SH0
    public boolean a(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        if (this.a.j(interfaceC4421Uj0, d) == 0) {
            return true;
        }
        return false;
    }

    @Override // o.SH0
    public void b(InterfaceC4518Vj0 interfaceC4518Vj0) {
        this.a.b(interfaceC4518Vj0);
    }

    @Override // o.SH0
    public void c() {
        this.a.a(0L, 0L);
    }

    @Override // o.SH0
    public boolean d() {
        InterfaceC4324Tj0 interfaceC4324Tj0 = this.a;
        if (!(interfaceC4324Tj0 instanceof Xu2) && !(interfaceC4324Tj0 instanceof C3894Oz0)) {
            return false;
        }
        return true;
    }

    @Override // o.SH0
    public boolean e() {
        InterfaceC4324Tj0 interfaceC4324Tj0 = this.a;
        if (!(interfaceC4324Tj0 instanceof L7) && !(interfaceC4324Tj0 instanceof G3) && !(interfaceC4324Tj0 instanceof K3) && !(interfaceC4324Tj0 instanceof C11029yl1)) {
            return false;
        }
        return true;
    }

    @Override // o.SH0
    public SH0 f() {
        InterfaceC4324Tj0 c11029yl1;
        C9542sf.i(!d());
        InterfaceC4324Tj0 interfaceC4324Tj0 = this.a;
        if (interfaceC4324Tj0 instanceof BK2) {
            c11029yl1 = new BK2(this.b.Z, this.c);
        } else if (interfaceC4324Tj0 instanceof L7) {
            c11029yl1 = new L7();
        } else if (interfaceC4324Tj0 instanceof G3) {
            c11029yl1 = new G3();
        } else if (interfaceC4324Tj0 instanceof K3) {
            c11029yl1 = new K3();
        } else if (interfaceC4324Tj0 instanceof C11029yl1) {
            c11029yl1 = new C11029yl1();
        } else {
            throw new IllegalStateException("Unexpected extractor type for recreation: " + this.a.getClass().getSimpleName());
        }
        return new C9833tr(c11029yl1, this.b, this.c);
    }
}
