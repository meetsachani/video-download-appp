package androidx.lifecycle;

import androidx.lifecycle.f;
import o.C6562gT0;
import o.C6948i40;
import o.KZ0;
import o.RU0;

/* loaded from: classes.dex */
public final class g {
    public final f a;
    public final f.b b;
    public final C6948i40 c;
    public final i d;

    public g(f fVar, f.b bVar, C6948i40 c6948i40, final RU0 ru0) {
        C6562gT0.p(fVar, "lifecycle");
        C6562gT0.p(bVar, "minState");
        C6562gT0.p(c6948i40, "dispatchQueue");
        C6562gT0.p(ru0, "parentJob");
        this.a = fVar;
        this.b = bVar;
        this.c = c6948i40;
        i iVar = new i() { // from class: o.FZ0
            @Override // androidx.lifecycle.i
            public final void i(KZ0 kz0, f.a aVar) {
                androidx.lifecycle.g.d(androidx.lifecycle.g.this, ru0, kz0, aVar);
            }
        };
        this.d = iVar;
        if (fVar.b() == f.b.DESTROYED) {
            RU0.a.b(ru0, null, 1, null);
            b();
            return;
        }
        fVar.a(iVar);
    }

    public static final void d(g gVar, RU0 ru0, KZ0 kz0, f.a aVar) {
        C6562gT0.p(gVar, "this$0");
        C6562gT0.p(ru0, "$parentJob");
        C6562gT0.p(kz0, "source");
        C6562gT0.p(aVar, "<anonymous parameter 1>");
        if (kz0.b().b() == f.b.DESTROYED) {
            RU0.a.b(ru0, null, 1, null);
            gVar.b();
        } else if (kz0.b().b().compareTo(gVar.b) < 0) {
            gVar.c.h();
        } else {
            gVar.c.i();
        }
    }

    public final void b() {
        this.a.d(this.d);
        this.c.g();
    }

    public final void c(RU0 ru0) {
        RU0.a.b(ru0, null, 1, null);
        b();
    }
}
