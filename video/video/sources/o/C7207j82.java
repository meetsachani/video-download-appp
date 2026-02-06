package o;

import java.util.Objects;
import o.C4281Sy;
import o.C9701tI1;

/* renamed from: o.j82  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7207j82 implements InterfaceC10076ur {
    public C9944uI1 a;
    public C9701tI1.a b;

    public final void d(androidx.camera.core.g gVar) {
        boolean z;
        C5901do2.c();
        boolean z2 = true;
        if (this.a != null) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.n(z);
        Object d = gVar.I4().a().d(this.a.h());
        Objects.requireNonNull(d);
        if (((Integer) d).intValue() != this.a.g().get(0).intValue()) {
            z2 = false;
        }
        C10907yF1.n(z2);
        this.b.a().accept(C9701tI1.b.c(this.a, gVar));
        this.a = null;
    }

    public final void e(C9944uI1 c9944uI1) {
        boolean z;
        C5901do2.c();
        boolean z2 = false;
        if (c9944uI1.g().size() == 1) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.o(z, "Cannot handle multi-image capture.");
        if (this.a == null) {
            z2 = true;
        }
        C10907yF1.o(z2, "Already has an existing request.");
        this.a = c9944uI1;
        C7221jC0.b(c9944uI1.a(), new a(c9944uI1), C5211ay.b());
    }

    @Override // o.InterfaceC3962Pq1
    /* renamed from: f */
    public C9701tI1.a a(C4281Sy.c cVar) {
        cVar.a().a(new InterfaceC10929yL() { // from class: o.h82
            @Override // o.InterfaceC10929yL
            public final void accept(Object obj) {
                C7207j82.this.d((androidx.camera.core.g) obj);
            }
        });
        cVar.d().a(new InterfaceC10929yL() { // from class: o.i82
            @Override // o.InterfaceC10929yL
            public final void accept(Object obj) {
                C7207j82.this.e((C9944uI1) obj);
            }
        });
        C9701tI1.a d = C9701tI1.a.d(cVar.b(), cVar.c());
        this.b = d;
        return d;
    }

    @Override // o.InterfaceC3962Pq1
    public void g() {
    }

    /* renamed from: o.j82$a */
    /* loaded from: classes.dex */
    public class a implements XB0<Void> {
        public final /* synthetic */ C9944uI1 a;

        public a(C9944uI1 c9944uI1) {
            this.a = c9944uI1;
        }

        @Override // o.XB0
        public void b(Throwable th) {
            C5901do2.c();
            C9944uI1 c9944uI1 = this.a;
            C7207j82 c7207j82 = C7207j82.this;
            if (c9944uI1 == c7207j82.a) {
                c7207j82.a = null;
            }
        }

        @Override // o.XB0
        /* renamed from: c */
        public void a(Void r1) {
        }
    }
}
